package com.appreciatewealth.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class DriverManager {
    private final static   ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public static AppiumDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(AppiumDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
        initializeDriver(false, null, null, null);
    }

    public void initializeDriver(boolean useBrowserStack, String deviceName, String platformVersion, String platformName) throws Exception {
        AppiumDriver driver = null;
        GlobalParams params = new GlobalParams();
        PropertyManager props = new PropertyManager();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                
                if (useBrowserStack) {
                    // Initialize BrowserStack driver
                    driver = initializeBrowserStackDriver(deviceName, platformVersion, platformName);
                } else {
                    // Initialize local driver
                    driver = initializeLocalDriver(params);
                }
                
                if(driver == null){
                    throw new Exception("driver is null. ABORT!!!");
                }
                utils.log().info("Driver is initialized");
                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }
    }

    private AppiumDriver initializeLocalDriver(GlobalParams params) throws IOException {
        AppiumDriver driver = null;
        switch(params.getPlatformName()){
            case "Android":
                driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                break;
            case "iOS":
                driver = new IOSDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                break;
        }
        return driver;
    }

    private AppiumDriver initializeBrowserStackDriver(String deviceName, String platformVersion, String platformName) throws IOException {
        AppiumDriver driver = null;
        BrowserStackCapabilitiesManager browserStackCaps = new BrowserStackCapabilitiesManager();
        DesiredCapabilities caps = browserStackCaps.getBrowserStackCaps(deviceName, platformVersion, platformName);
        URL browserStackUrl = new URL(browserStackCaps.getBrowserStackServerUrl());
        
        switch(platformName){
            case "Android":
                driver = new AndroidDriver(browserStackUrl, caps);
                break;
            case "iOS":
                driver = new IOSDriver(browserStackUrl, caps);
                break;
        }
        return driver;
    }
}

