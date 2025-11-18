# Mobile Automation Framework - Line by Line Explanation

## 🏗️ **Framework Overview**
Your framework is a **Mobile App Testing Framework** built for testing the "Appreciate" investment app on both Android and iOS platforms. It uses **Appium + TestNG + Cucumber** for comprehensive test automation.

---

## 📁 **Project Structure Breakdown**

### **1. Root Level Files**

#### **pom.xml** - Maven Configuration
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
```
- **Line 1-4**: Standard XML declaration and Maven project schema definition
- This tells Maven this is a valid Maven project file

```xml
<modelVersion>4.0.0</modelVersion>
<groupId>org.example</groupId>
<artifactId>AppreciateMobileAutomation</artifactId>
<version>1.0-SNAPSHOT</version>
```
- **Line 5**: Maven model version (always 4.0.0 for Maven 2+)
- **Line 7-9**: Project identification (like a unique address for your project)

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <source>15</source>
                <target>15</target>
            </configuration>
        </plugin>
```
- **Line 10-20**: Maven build configuration
- **Line 14-19**: Compiler plugin setup - tells Maven to compile Java code using Java 15

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
- **Line 21-31**: Surefire plugin for running tests
- **Line 28**: Points to testng.xml file for test execution configuration

#### **Dependencies Section (Lines 41-104)**
```xml
<dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>8.5.1</version>
</dependency>
```
- **Appium Java Client**: Main library for mobile app automation

```xml
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
</dependency>
```
- **TestNG**: Testing framework for organizing and running tests

```xml
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-testng</artifactId>
    <version>7.14.0</version>
</dependency>
```
- **Cucumber**: BDD (Behavior Driven Development) framework for writing tests in plain English

---

### **2. TestNG Configuration (testng.xml)**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
```
- **Line 1-2**: XML declaration and TestNG schema
- **Line 3**: Test suite configuration with parallel execution enabled

```xml
<test name="Pixel5">
    <parameter name="platformName" value="Android" />
    <parameter name="udid" value="DQE6O78HZP9HPF5H" />
    <parameter name="deviceName" value="POCO C65" />
    <parameter name="systemPort" value="10000" />
    <parameter name="chromeDriverPort" value="11000" />
```
- **Line 4-9**: Test configuration for a specific device (POCO C65)
- **platformName**: "Android" - specifies the mobile platform
- **udid**: Unique device identifier for the physical device
- **deviceName**: Human-readable device name
- **systemPort/chromeDriverPort**: Ports for Appium server communication

```xml
<classes>
    <class name="com.appreciatewealth.runners.PocoTestNGRunnerTest"/>
</classes>
```
- **Line 10-12**: Points to the test runner class that will execute the tests

---

### **3. Configuration Files**

#### **config.properties**
```properties
appiumURL=http://localhost:4723/wd/hub
androidAutomationName=UiAutomator2
androidAppPackage=com.appreciatewealth.android.uat
androidAppLocation=/Users/raj/Downloads/AppreciateMobileAutomationNewUI_Investment_Final_Updated_With_Flutter/src/test/resources/App/UAT/AppreciateUAT.apk
Email=faureretruba-9695@yopmail.com
```
- **Line 1**: Appium server URL (default localhost port 4723)
- **Line 2**: Android automation engine (UiAutomator2)
- **Line 3**: Android app package name
- **Line 4**: Path to the APK file for testing
- **Line 5**: Test email for login scenarios

---

## 🏛️ **Core Framework Components**

### **1. Driver Management (DriverManager.java)**

```java
public class DriverManager {
    private final static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();
```
- **Line 2**: ThreadLocal ensures each test thread has its own driver instance
- **Line 3**: Utility class for logging and helper methods

```java
public static AppiumDriver getDriver(){
    return driver.get();
}

public static void setDriver(AppiumDriver driver2){
    driver.set(driver2);
}
```
- **Line 5-7**: Getter method to retrieve the current driver
- **Line 9-11**: Setter method to store a driver instance

```java
public void initializeDriver() throws Exception {
    AppiumDriver driver = null;
    GlobalParams params = new GlobalParams();
    PropertyManager props = new PropertyManager();
```
- **Line 13-16**: Driver initialization method
- **GlobalParams**: Stores test parameters (device info, platform)
- **PropertyManager**: Loads configuration from properties files

```java
switch(params.getPlatformName()){
    case "Android":
        driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
        break;
    case "iOS":
        driver = new IOSDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
        break;
}
```
- **Line 30-37**: Platform-specific driver creation
- **AndroidDriver**: For Android app testing
- **IOSDriver**: For iOS app testing
- **ServerManager**: Manages Appium server connection
- **CapabilitiesManager**: Provides device capabilities

---

### **2. Base Page Object (BasePage.java)**

```java
public class BasePage {
    public static String OTP;
    public static String otp;
    PropertyManager props = new PropertyManager();
```
- **Line 1-4**: Base class for all page objects
- **OTP variables**: Store OTP values for authentication
- **PropertyManager**: Access to configuration properties

```java
@AndroidFindBy(accessibility = "Profile\nTab 5 of 5")
WebElement ProfileSettings;

@AndroidFindBy(accessibility = "Exit")
WebElement ExitAppBox;
```
- **Line 6-11**: Page Factory annotations for element location
- **@AndroidFindBy**: Finds elements using accessibility ID
- **WebElement**: Selenium WebElement for interaction

```java
public BasePage() {
    this.driver = new DriverManager().getDriver();
    PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
}
```
- **Line 86-89**: Constructor initializes driver and Page Factory
- **AppiumFieldDecorator**: Special decorator for Appium elements

#### **Common Utility Methods**

```java
public void waitForVisibility(WebElement e, Duration duration) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT));
    wait.until(ExpectedConditions.visibilityOf(e));
}
```
- **Line 91-94**: Waits for element to become visible
- **WebDriverWait**: Selenium explicit wait mechanism

```java
public void click(WebElement e) {
    waitForVisibility(e, Duration.ofSeconds(5));
    e.click();
}
```
- **Line 450-453**: Safe click method with wait
- Ensures element is visible before clicking

```java
public void sendKeys(WebElement e, String txt) {
    waitForVisibility(e, Duration.ofSeconds(5));
    e.sendKeys(txt);
}
```
- **Line 467-470**: Safe text input method
- Waits for element visibility before typing

#### **Mobile-Specific Methods**

```java
public void ScrollDown(int number_of_scroll) throws InterruptedException {
    Thread.sleep(4000);
    for (int i = 0; i < number_of_scroll; i++) {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
    }
    Thread.sleep(2000);
}
```
- **Line 125-132**: Android-specific scrolling method
- **UiScrollable**: Android UI Automator scrolling mechanism

```java
public String CopyOTPFromMessage() throws InterruptedException, IOException {
    Thread.sleep(3000);
    ((AndroidDriver) driver).activateApp("com.google.android.apps.messaging");
    Thread.sleep(3000);
    OTP = driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@content-desc=\"Conversation list\"]/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.TextView[2]")).getText();
```
- **Line 294-301**: OTP extraction from SMS messages
- **activateApp**: Switches to messaging app
- **XPath**: Locates OTP text in message list

---

### **3. Capabilities Management (CapabilitiesManager.java)**

```java
public DesiredCapabilities getCaps() throws IOException {
    GlobalParams params = new GlobalParams();
    Properties props = new PropertyManager().getProps();
    
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
    caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());
```
- **Line 15-24**: Creates device capabilities for Appium
- **DesiredCapabilities**: Container for device configuration
- **Platform/UDID/DeviceName**: Basic device identification

```java
switch (params.getPlatformName()) {
    case "Android" -> {
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
        caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
        caps.setCapability(MobileCapabilityType.NO_RESET,true);
        caps.setCapability(MobileCapabilityType.FULL_RESET,false);
        caps.setCapability(MobileCapabilityType.APP","/Users/raj/Downloads/AppreciateMobileAutomationNewUI_Investment_Final_Updated_With_Flutter/src/test/resources/App/UAT/AppreciateUAT.apk");
    }
```
- **Line 26-50**: Android-specific capabilities
- **automationName**: UiAutomator2 for Android
- **appPackage**: Android app package identifier
- **NO_RESET/FULL_RESET**: App state management
- **APP**: Path to APK file

---

## 🧪 **Test Execution Flow**

### **1. Test Runner (PocoTestNGRunnerTest.java)**

```java
@CucumberOptions(
    plugin = {"pretty","html:target/Reports/report.html"},
    features = {"/Users/raj/Downloads/AppreciateMobileAutomationNewUI_Investment_Final_Updated_With_Flutter/src/test/resources/Modules/Trades/Trade_Buy_UAT.feature"},
    glue = {"com.appreciatewealth.stepdef"},
    tags = "@UAT_Final"
)
```
- **Line 5-10**: Cucumber configuration
- **plugin**: Report generation settings
- **features**: Path to feature files
- **glue**: Package containing step definitions
- **tags**: Filter specific test scenarios

### **2. Feature Files (Cucumber BDD)**

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
```
- **Line 1**: Feature description
- **Line 3**: Scenario name
- **Line 4-11**: Test steps in Given-When-Then format
- **Given**: Preconditions
- **When**: Actions
- **Then**: Expected results

### **3. Step Definitions (SignInStepDef.java)**

```java
@Given("App is launched")
public void app_is_launched() throws IOException, InterruptedException {
    System.out.println("App is Launched");
}

@When("User clicks continue button")
public void user_clicks_continue_button() throws InterruptedException {
    Thread.sleep(3000);
    new SignInPage().ClickContinue();
}
```
- **Line 16-20**: Maps Gherkin steps to Java methods
- **@Given/@When/@Then**: Cucumber annotations
- **Method names**: Must match step text exactly

---

## 🔄 **Framework Execution Flow**

### **Step 1: TestNG Execution**
1. **testng.xml** is read by Maven Surefire plugin
2. **PocoTestNGRunnerTest** class is instantiated
3. **Cucumber** scans for feature files and step definitions

### **Step 2: Driver Initialization**
1. **GlobalParams** loads device parameters from TestNG
2. **PropertyManager** loads configuration from properties files
3. **CapabilitiesManager** creates device capabilities
4. **DriverManager** initializes Appium driver

### **Step 3: Test Execution**
1. **Cucumber** reads feature file scenarios
2. **Step definitions** execute corresponding Java methods
3. **Page objects** interact with mobile app elements
4. **BasePage** provides common utilities and waits

### **Step 4: Reporting**
1. **Cucumber** generates HTML reports
2. **TestNG** provides test execution summary
3. **Log4j** creates detailed execution logs

---

## 🎯 **Key Features of Your Framework**

### **1. Cross-Platform Support**
- **Android**: UiAutomator2 automation
- **iOS**: XCUITest automation
- **Single codebase** for both platforms

### **2. Page Object Model**
- **BasePage**: Common utilities and base functionality
- **Specific Pages**: SignInPage, DashboardPage, etc.
- **Reusable methods**: click, sendKeys, waitForVisibility

### **3. BDD Implementation**
- **Cucumber**: Business-readable test scenarios
- **Feature files**: Organized by modules (Trades, Goals, etc.)
- **Step definitions**: Java implementation of steps

### **4. Configuration Management**
- **Properties files**: Environment-specific settings
- **TestNG parameters**: Device-specific configurations
- **Capabilities**: Dynamic device capability setup

### **5. Robust Element Interaction**
- **Explicit waits**: Prevents flaky tests
- **Mobile gestures**: Swipe, scroll, tap
- **Error handling**: Try-catch blocks and assertions

---

## 🚀 **How to Run Tests**

### **Command Line Execution**
```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=PocoTestNGRunnerTest

# Run with specific device
mvn test -DsuiteXmlFile=testng.xml
```

### **TestNG XML Execution**
- Modify **testng.xml** to change device parameters
- Update **udid** and **deviceName** for different devices
- Run through IDE or command line

---

## 📊 **Framework Benefits**

1. **Maintainable**: Page Object Model separates test logic from page structure
2. **Scalable**: Easy to add new tests and pages
3. **Readable**: BDD approach makes tests understandable by non-technical stakeholders
4. **Robust**: Comprehensive error handling and waits
5. **Cross-platform**: Single framework for Android and iOS
6. **Configurable**: Easy environment and device switching

---

This framework provides a solid foundation for mobile app testing with industry best practices and comprehensive coverage of the Appreciate investment app functionality.
