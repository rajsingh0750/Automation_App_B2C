package com.appreciatewealth.examples;

import com.appreciatewealth.utils.DriverManager;
import com.appreciatewealth.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;

/**
 * Example test class demonstrating BrowserStack integration
 * This class shows how to run tests on BrowserStack cloud devices
 */
public class BrowserStackExampleTest {
    
    private TestUtils utils = new TestUtils();
    private AppiumDriver driver;
    
    @BeforeMethod
    @Parameters({"deviceName", "platformVersion", "platformName"})
    public void setUp(String deviceName, String platformVersion, String platformName) throws Exception {
        utils.log().info("Setting up test for device: " + deviceName);
        
        // Initialize BrowserStack driver
        DriverManager driverManager = new DriverManager();
        driverManager.initializeDriver(true, deviceName, platformVersion, platformName);
        driver = DriverManager.getDriver();
    }
    
    @Test
    public void testAppLaunch() {
        utils.log().info("Testing app launch on BrowserStack device");
        
        // Your test logic here
        // Example: Verify app is launched
        assert driver != null : "Driver should not be null";
        
        // Mark test as passed in BrowserStack
        driver.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"App launched successfully\"}}");
        
        utils.log().info("App launch test completed successfully");
    }
    
    @Test
    public void testBasicNavigation() {
        utils.log().info("Testing basic navigation on BrowserStack device");
        
        // Your test logic here
        // Example: Navigate through app screens
        
        // Mark test as passed in BrowserStack
        driver.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"passed\", \"reason\": \"Navigation test completed\"}}");
        
        utils.log().info("Basic navigation test completed successfully");
    }
    
    @AfterMethod
    public void tearDown() {
        try {
            if (driver != null) {
                driver.quit();
                utils.log().info("Driver quit successfully");
            }
        } catch (Exception e) {
            utils.log().error("Error during driver cleanup: " + e.getMessage());
        }
    }
    
    @DataProvider(name = "browserstack-devices")
    public Object[][] getBrowserStackDevices() {
        return new Object[][] {
            {"Samsung Galaxy S23", "13.0", "Android"},
            {"Google Pixel 7", "13.0", "Android"},
            {"iPhone 14", "16.0", "iOS"},
            {"iPhone 13 Pro", "15.0", "iOS"}
        };
    }
}

