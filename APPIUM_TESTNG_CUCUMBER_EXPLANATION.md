# 🚀 Appium + TestNG + Cucumber Combination - Detailed Explanation

## 🎯 **Overview: The Power Trio**

Your project uses a sophisticated combination of three powerful testing technologies:

1. **🔧 Appium** - Mobile automation engine
2. **⚡ TestNG** - Test execution and management framework  
3. **📝 Cucumber** - Behavior Driven Development (BDD) framework

This combination provides **enterprise-grade mobile testing** with readable test scenarios and robust execution management.

---

## 🔧 **1. APPIUM - Mobile Automation Engine**

### **What is Appium?**
Appium is an open-source mobile automation framework that allows you to test native, hybrid, and mobile web applications on both Android and iOS platforms using the same API.

### **Appium Implementation in Your Project**

#### **A. Server Management (ServerManager.java)**
```java
public class ServerManager {
    private static final ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
    
    public void startServer(){
        utils.log().info("starting appium server");
        AppiumDriverLocalService server = MacGetAppiumService();
        server.start();
        if(!server.isRunning()){
            utils.log().fatal("Appium server not started. ABORT!!!");
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!!!");
        }
        server.clearOutPutStreams();
        ServerManager.server.set(server);
        utils.log().info("Appium server started");
    }
}
```

**Key Features:**
- **ThreadLocal**: Ensures thread-safe server management
- **Automatic Server Start**: Programmatically starts Appium server
- **Error Handling**: Validates server startup
- **Log Management**: Clears output streams for clean logs

#### **B. Driver Management (DriverManager.java)**
```java
public class DriverManager {
    private final static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    
    public void initializeDriver() throws Exception {
        AppiumDriver driver = null;
        GlobalParams params = new GlobalParams();
        PropertyManager props = new PropertyManager();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                switch(params.getPlatformName()){
                    case "Android":
                        driver = new AndroidDriver(new ServerManager().getServer().getUrl(), 
                                                 new CapabilitiesManager().getCaps());
                        break;
                    case "iOS":
                        driver = new IOSDriver(new ServerManager().getServer().getUrl(), 
                                             new CapabilitiesManager().getCaps());
                        break;
                }
                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }
    }
}
```

**Key Features:**
- **Cross-Platform Support**: Handles both Android and iOS
- **ThreadLocal Driver**: Thread-safe driver management
- **Capability Management**: Dynamic capability configuration
- **Error Handling**: Comprehensive exception management

#### **C. Capabilities Management (CapabilitiesManager.java)**
```java
public DesiredCapabilities getCaps() throws IOException {
    GlobalParams params = new GlobalParams();
    Properties props = new PropertyManager().getProps();
    
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
    caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());

    switch (params.getPlatformName()) {
        case "Android" -> {
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability("appPackage", "com.appreciatewealth.android.uat");
            caps.setCapability(MobileCapabilityType.NO_RESET, true);
            caps.setCapability(MobileCapabilityType.APP", "/path/to/AppreciateUAT.apk");
        }
        case "iOS" -> {
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
            caps.setCapability("bundleId", "com.appreciatewealth.ios");
            caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
        }
    }
    return caps;
}
```

**Key Features:**
- **Platform-Specific Configuration**: Different settings for Android/iOS
- **Dynamic Capabilities**: Runtime capability setting
- **App Management**: Automatic app installation and launch

#### **D. Mobile Element Interaction (BasePage.java)**
```java
public class BasePage {
    @AndroidFindBy(accessibility = "Profile\nTab 5 of 5")
    WebElement ProfileSettings;
    
    @AndroidFindBy(accessibility = "Exit")
    WebElement ExitAppBox;
    
    public BasePage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    
    public void ScrollDown(int number_of_scroll) throws InterruptedException {
        Thread.sleep(4000);
        for (int i = 0; i < number_of_scroll; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
    }
    
    public String CopyOTPFromMessage() throws InterruptedException, IOException {
        Thread.sleep(3000);
        ((AndroidDriver) driver).activateApp("com.google.android.apps.messaging");
        Thread.sleep(3000);
        OTP = driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@content-desc=\"Conversation list\"]/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.TextView[2]")).getText();
        // OTP extraction logic...
        return otp;
    }
}
```

**Key Features:**
- **Page Factory**: Automatic element initialization
- **Mobile Gestures**: Swipe, scroll, tap operations
- **App Switching**: Seamless app activation
- **Cross-Platform Elements**: Android and iOS element support

---

## ⚡ **2. TESTNG - Test Execution Framework**

### **What is TestNG?**
TestNG is a testing framework inspired by JUnit and NUnit but introducing new functionality that makes it more powerful and easier to use.

### **TestNG Implementation in Your Project**

#### **A. TestNG Configuration (testng.xml)**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
    <test name="Pixel5">
        <parameter name="platformName" value="Android" />
        <parameter name="udid" value="DQE6O78HZP9HPF5H" />
        <parameter name="deviceName" value="POCO C65" />
        <parameter name="systemPort" value="10000" />
        <parameter name="chromeDriverPort" value="11000" />
        <classes>
            <class name="com.appreciatewealth.runners.PocoTestNGRunnerTest"/>
        </classes>
    </test>
</suite>
```

**Key Features:**
- **Parallel Execution**: `parallel="tests"` enables concurrent test execution
- **Parameter Passing**: Device-specific parameters
- **Test Organization**: Structured test suite definition

#### **B. Maven Integration (pom.xml)**
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.1.2</version>
    <configuration>
        <suiteXmlFiles>
            <suiteXmlFile>${project.basedir}/testng.xml</suiteXmlFile>
        </suiteXmlFiles>
    </configuration>
</plugin>
```

**Key Features:**
- **Maven Integration**: Seamless Maven build integration
- **Suite Execution**: Automatic testng.xml execution
- **Build Lifecycle**: Integrated with Maven build process

#### **C. Test Runner Base (RunnerBaseTest.java)**
```java
public class RunnerBaseTest {
    private static final ThreadLocal<TestNGCucumberRunner> testNGCucumberRunner = new ThreadLocal<>();

    @Parameters({"platformName", "udid", "deviceName", "systemPort",
            "chromeDriverPort", "wdaLocalPort", "webkitDebugProxyPort"})
    @BeforeClass(alwaysRun = true)
    public void setUpClass(String platformName, String udid, String deviceName, 
                          @Optional("Android") String systemPort,
                          @Optional("Android") String chromeDriverPort,
                          @Optional("iOS") String wdaLocalPort,
                          @Optional("iOS") String webkitDebugProxyPort) throws Exception {
        
        GlobalParams params = new GlobalParams();
        params.setPlatformName(platformName);
        params.setUDID(udid);
        params.setDeviceName(deviceName);
        
        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_" + params.getDeviceName());
        
        switch(platformName){
            case "Android":
                params.setSystemPort(systemPort);
                params.setChromeDriverPort(chromeDriverPort);
                break;
            case "iOS":
                params.setWdaLocalPort(wdaLocalPort);
                params.setWebkitDebugProxyPort(webkitDebugProxyPort);
                break;
        }

        new ServerManager().startServer();
        new DriverManager().initializeDriver();
        setRunner(new TestNGCucumberRunner(this.getClass()));
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) throws Throwable {
        getRunner().runScenario(pickle.getPickle());
    }

    @DataProvider
    public Object[][] scenarios() {
        return getRunner().provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        DriverManager driverManager = new DriverManager();
        if(DriverManager.getDriver() != null){
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
        getRunner().finish();
    }
}
```

**Key Features:**
- **Parameter Injection**: Automatic parameter passing from testng.xml
- **Lifecycle Management**: @BeforeClass, @AfterClass annotations
- **Cucumber Integration**: Seamless TestNG-Cucumber integration
- **Resource Management**: Proper cleanup of drivers and servers

---

## 📝 **3. CUCUMBER - BDD Framework**

### **What is Cucumber?**
Cucumber is a tool that supports Behavior Driven Development (BDD). It allows you to write tests in plain English using Gherkin syntax.

### **Cucumber Implementation in Your Project**

#### **A. Feature Files (Gherkin Syntax)**
```gherkin
Feature: UAT TRADE BUY SCENARIOS

Scenario: Validate if user stop the buy journey and come to dashboard
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    When User come back to home dashboard
    Then User should see the resume buying event at home dashboard
    And User click on Buy now cta under continue where left section
    And User clicks on Buy now for a stock
    And User enters the amount
    And User Slides to Buy
    Then the order should be placed successfully

@UAT_Final
Scenario: Validate all error msg during buy journey
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    When User Slides to Buy
    Then User should see without enter amount and quantity error message "Please enter amount or qty to proceed"
    When User enter the quantity more then UPI limit
    Then User should see the UPI limit error message per transaction as "UPI limit : ₹1,00,000.00 per transaction"
```

**Key Features:**
- **Plain English**: Business-readable test scenarios
- **Given-When-Then**: Clear test structure
- **Tags**: @UAT_Final for test filtering
- **Data Tables**: Structured test data

#### **B. Step Definitions (Java Implementation)**
```java
public class SignInStepDef {
    DashboardPage dashboardPage = new DashboardPage();
    BasePage basePage = new BasePage();

    @Given("App is launched")
    public void app_is_launched() throws IOException, InterruptedException {
        System.out.println("App is Launched");
    }
    
    @When("User clicks continue button")
    public void user_clicks_continue_button() throws InterruptedException {
        Thread.sleep(3000);
        new SignInPage().ClickContinue();
    }
    
    @When("User clicks on get started button")
    public void user_clicks_on_get_started_button() throws InterruptedException {
        new SignInPage().ClickonGetStarted();
    }
    
    @Then("User should be on Sign in page")
    public void user_should_be_on_sign_in_page() throws InterruptedException {
        new SignInPage().ValidateSigninPage();
    }

    @Given("User enters invalid number")
    public void user_enters_invalid_number() throws InterruptedException {
        new SignInPage().EnterPhonenumber("9538256789");
        new SignInPage().ClickonSignin();
    }

    @Then("User should see the popup message {string}")
    public void user_should_see_the_popup_message(String string) throws InterruptedException {
        new SignInPage().ValidateErrorMessage("Incorrect OTP entered, please try again.");
        basePage.AndroidBack();
        Thread.sleep(7000);
        new SignInPage().ClickOK();
    }
}
```

**Key Features:**
- **Annotation Mapping**: @Given, @When, @Then annotations
- **Parameter Passing**: {string} for dynamic values
- **Page Object Integration**: Uses page objects for actions
- **Error Handling**: Comprehensive exception management

#### **C. Cucumber Configuration**
```java
@CucumberOptions(
    plugin = {"pretty","html:target/Reports/report.html"},
    features = {"/Users/raj/Downloads/AppreciateMobileAutomationNewUI_Investment_Final_Updated_With_Flutter/src/test/resources/Modules/Trades/Trade_Buy_UAT.feature"},
    glue = {"com.appreciatewealth.stepdef"},
    tags = "@UAT_Final"
)


public class PocoTestNGRunnerTest extends RunnerBaseTest{
}
```

**Key Features:**
- **Plugin Configuration**: HTML report generation
- **Feature Path**: Points to feature files
- **Glue Package**: Step definition location
- **Tag Filtering**: @UAT_Final tag execution

#### **D. Hooks (Setup/Teardown)**
```java
public class Hooks extends BasePage {
    @Before
    public void initialize() throws Exception {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();
        
        ThreadContext.put("ROUTING KEY", params.getPlatformName() + "_" + params.getDeviceName());
        
        new ServerManager().startServer();
        new DriverManager().initializeDriver();
        System.out.println("Driver Initialized");
    }

    @After
    public void quit(Scenario scenario) throws Exception {
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriver();
        
        if (driver != null) {
            if (scenario.isFailed()) {
                // Take screenshot on failure
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
                
                // Kill the app
                KillApp(driver);
                driver.quit();
                DriverManager.setDriver(null);
                
                // Restart for next test
                new ServerManager().startServer();
                new DriverManager().initializeDriver();
            }
            
            driver.quit();
            DriverManager.setDriver(null);
        }
        
        ServerManager serverManager = new ServerManager();
        if (serverManager.getServer() != null) {
            serverManager.getServer().stop();
        }
    }
}
```

**Key Features:**
- **@Before/@After**: Setup and teardown hooks
- **Screenshot on Failure**: Automatic failure documentation
- **Resource Cleanup**: Proper driver and server cleanup
- **Test Isolation**: Fresh environment for each test

---

## 🔄 **4. HOW THEY WORK TOGETHER**

### **Execution Flow Diagram**
```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   TestNG        │    │   Cucumber      │    │   Appium        │
│   (Orchestrator)│    │   (BDD Engine)  │    │   (Mobile Engine)│
└─────────────────┘    └─────────────────┘    └─────────────────┘
         │                       │                       │
         │ 1. Reads testng.xml   │                       │
         │──────────────────────▶│                       │
         │                       │                       │
         │ 2. Starts TestNG      │                       │
         │    Test Suite         │                       │
         │──────────────────────▶│                       │
         │                       │                       │
         │                       │ 3. Reads Feature Files│
         │                       │──────────────────────▶│
         │                       │                       │
         │                       │ 4. Executes Scenarios │
         │                       │──────────────────────▶│
         │                       │                       │
         │                       │ 5. Calls Step Defs    │
         │                       │──────────────────────▶│
         │                       │                       │
         │                       │ 6. Page Objects       │
         │                       │──────────────────────▶│
         │                       │                       │
         │                       │ 7. Appium Commands    │
         │                       │──────────────────────▶│
         │                       │                       │
         │                       │ 8. Mobile App Actions │
         │                       │──────────────────────▶│
         │                       │                       │
         │ 9. Test Results       │                       │
         │◀──────────────────────│                       │
         │                       │                       │
         │ 10. Cleanup           │                       │
         │──────────────────────▶│                       │
```

### **Step-by-Step Execution Process**

#### **Step 1: TestNG Initialization**
```java
@BeforeClass(alwaysRun = true)
public void setUpClass(String platformName, String udid, String deviceName, ...) {
    // 1. Set global parameters
    GlobalParams params = new GlobalParams();
    params.setPlatformName(platformName);
    params.setUDID(udid);
    params.setDeviceName(deviceName);
    
    // 2. Start Appium server
    new ServerManager().startServer();
    
    // 3. Initialize Appium driver
    new DriverManager().initializeDriver();
    
    // 4. Initialize Cucumber runner
    setRunner(new TestNGCucumberRunner(this.getClass()));
}
```

#### **Step 2: Cucumber Scenario Execution**
```java
@Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) throws Throwable {
    // 1. Get scenario from feature file
    getRunner().runScenario(pickle.getPickle());
    
    // 2. Cucumber maps steps to step definitions
    // 3. Step definitions call page objects
    // 4. Page objects use Appium driver
}
```

#### **Step 3: Appium Mobile Interaction**
```java
// In SignInPage.java
@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/...")
private WebElement continueButton;

public void ClickContinue() throws InterruptedException {
    Thread.sleep(3000);
    continueButton.click(); // Appium command execution
}
```

#### **Step 4: Test Completion and Cleanup**
```java
@AfterClass(alwaysRun = true)
public void tearDownClass() {
    // 1. Quit Appium driver
    if(DriverManager.getDriver() != null){
        DriverManager.getDriver().quit();
        DriverManager.setDriver(null);
    }
    
    // 2. Stop Appium server
    ServerManager serverManager = new ServerManager();
    if(serverManager.getServer() != null){
        serverManager.getServer().stop();
    }
    
    // 3. Finish Cucumber runner
    getRunner().finish();
}
```

---

## 🎯 **5. ADVANTAGES OF THIS COMBINATION**

### **A. Appium Benefits**
- ✅ **Cross-Platform**: Single codebase for Android and iOS
- ✅ **Language Agnostic**: Works with multiple programming languages
- ✅ **Real Device Testing**: Tests on actual devices
- ✅ **Native App Support**: Full access to native app features
- ✅ **WebView Support**: Hybrid app testing capabilities

### **B. TestNG Benefits**
- ✅ **Parallel Execution**: Faster test execution
- ✅ **Parameterization**: Data-driven testing
- ✅ **Test Organization**: Suite and group management
- ✅ **Reporting**: Comprehensive test reports
- ✅ **Maven Integration**: CI/CD pipeline support

### **C. Cucumber Benefits**
- ✅ **Business Readable**: Non-technical stakeholder involvement
- ✅ **Living Documentation**: Executable specifications
- ✅ **Reusability**: Step definition reuse across scenarios
- ✅ **Maintainability**: Easy to update test scenarios
- ✅ **Collaboration**: Better team communication

### **D. Combined Benefits**
- ✅ **Enterprise Grade**: Production-ready testing framework
- ✅ **Scalable**: Easy to add new tests and features
- ✅ **Maintainable**: Clear separation of concerns
- ✅ **Robust**: Comprehensive error handling and reporting
- ✅ **Flexible**: Easy environment and device switching

---

## 🚀 **6. USAGE EXAMPLES FROM YOUR PROJECT**

### **Example 1: Complete Test Execution**
```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=PocoTestNGRunnerTest

# Run with specific device
mvn test -DsuiteXmlFile=testng.xml
```

### **Example 2: Adding New Test Scenario**
```gherkin
# In Trade_Buy_UAT.feature
Scenario: Validate new trading feature
    Given User is on Trade dashboard
    When User performs new action
    Then User should see expected result
```

```java
// In corresponding StepDef class
@When("User performs new action")
public void user_performs_new_action() {
    new TradingPage().performNewAction();
}

@Then("User should see expected result")
public void user_should_see_expected_result() {
    new TradingPage().validateExpectedResult();
}
```

### **Example 3: Adding New Device Configuration**
```xml
<!-- In testng.xml -->
<test name="NewDevice">
    <parameter name="platformName" value="Android" />
    <parameter name="udid" value="NEW_DEVICE_UDID" />
    <parameter name="deviceName" value="New Device" />
    <parameter name="systemPort" value="10001" />
    <parameter name="chromeDriverPort" value="11001" />
    <classes>
        <class name="com.appreciatewealth.runners.NewDeviceTestNGRunnerTest"/>
    </classes>
</test>
```

---

## 📊 **7. FRAMEWORK STATISTICS**

### **Project Structure**
- **📁 Feature Files**: 20+ BDD scenarios
- **📁 Step Definitions**: 15+ Java classes
- **📁 Page Objects**: 20+ page classes
- **📁 Test Runners**: 4+ device-specific runners
- **📁 Utilities**: 10+ utility classes

### **Test Coverage**
- **🔐 Authentication**: Sign in, Sign up, OTP validation
- **💰 Trading**: Buy orders, Sell orders, Portfolio management
- **📊 Dashboard**: Navigation, Data validation
- **⚙️ Settings**: Language change, Profile management
- **📱 Cross-Platform**: Android and iOS support

### **Technology Stack**
- **☕ Java**: 15+ (Programming language)
- **🔧 Appium**: 8.5.1 (Mobile automation)
- **⚡ TestNG**: 7.7.1 (Test framework)
- **📝 Cucumber**: 7.14.0 (BDD framework)
- **🏗️ Maven**: 3.11.0 (Build tool)

---

## 🎉 **CONCLUSION**

The **Appium + TestNG + Cucumber** combination in your project provides:

1. **🔧 Robust Mobile Testing**: Appium handles complex mobile interactions
2. **⚡ Efficient Test Management**: TestNG provides parallel execution and organization
3. **📝 Business Readable Tests**: Cucumber makes tests understandable by all stakeholders
4. **🚀 Enterprise Scalability**: Production-ready framework for large-scale testing
5. **🔄 Seamless Integration**: All three technologies work together harmoniously

This combination is perfect for **mobile app testing** where you need:
- Cross-platform support
- Business stakeholder involvement
- Parallel test execution
- Comprehensive reporting
- Maintainable test code

Your framework demonstrates **industry best practices** and provides a solid foundation for comprehensive mobile application testing! 🎯
