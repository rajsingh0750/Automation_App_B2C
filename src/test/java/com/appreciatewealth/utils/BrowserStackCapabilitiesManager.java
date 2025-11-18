package com.appreciatewealth.utils;

import com.appreciatewealth.pages.BasePage;
import io.appium.java_client.remote.MobileCapabilityType;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class BrowserStackCapabilitiesManager extends BasePage {
    TestUtils utils = new TestUtils();
    private Properties browserStackProps;

    public BrowserStackCapabilitiesManager() {
        try {
            browserStackProps = new PropertyManager().getBrowserStackProps();
        } catch (IOException e) {
            utils.log().fatal("Failed to load BrowserStack properties: " + e.toString());
            throw new RuntimeException(e);
        }
    }

    public DesiredCapabilities getBrowserStackCaps(String deviceName, String platformVersion, String platformName) throws IOException {
        try {
            utils.log().info("Getting BrowserStack capabilities for " + deviceName);
            DesiredCapabilities caps = new DesiredCapabilities();

            // BrowserStack credentials
            caps.setCapability("browserstack.user", browserStackProps.getProperty("browserstack.username"));
            caps.setCapability("browserstack.key", browserStackProps.getProperty("browserstack.accesskey"));

            // Device capabilities
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);

            // App configuration
            caps.setCapability(MobileCapabilityType.APP, browserStackProps.getProperty("browserstack.app.id"));
            
            // Build and session configuration
            caps.setCapability("build", browserStackProps.getProperty("browserstack.build.name"));
            caps.setCapability("name", browserStackProps.getProperty("browserstack.session.name") + " - " + deviceName);

            // Debug and logging capabilities
            caps.setCapability("browserstack.debug", browserStackProps.getProperty("browserstack.debug"));
            caps.setCapability("browserstack.networkLogs", browserStackProps.getProperty("browserstack.networkLogs"));
            caps.setCapability("browserstack.video", browserStackProps.getProperty("browserstack.video"));
            caps.setCapability("browserstack.consoleLogs", browserStackProps.getProperty("browserstack.consoleLogs"));

            // Timeout configurations
            caps.setCapability("browserstack.idleTimeout", browserStackProps.getProperty("browserstack.idleTimeout"));
            caps.setCapability("browserstack.commandTimeout", browserStackProps.getProperty("browserstack.commandTimeout"));

            // Device settings
            caps.setCapability("browserstack.timezone", browserStackProps.getProperty("browserstack.device.timezone"));
            caps.setCapability("browserstack.language", browserStackProps.getProperty("browserstack.device.language"));
            caps.setCapability("browserstack.locale", browserStackProps.getProperty("browserstack.device.locale"));

            // Performance settings
            caps.setCapability("browserstack.performance", browserStackProps.getProperty("browserstack.performance"));
            caps.setCapability("browserstack.networkProfile", browserStackProps.getProperty("browserstack.networkProfile"));

            // Platform-specific capabilities
            if ("Android".equalsIgnoreCase(platformName)) {
                setupAndroidCapabilities(caps);
            } else if ("iOS".equalsIgnoreCase(platformName)) {
                setupiOSCapabilities(caps);
            }

            return caps;
        } catch (Exception e) {
            utils.log().fatal("Failed to load BrowserStack capabilities: " + e.toString());
            throw e;
        }
    }

    private void setupAndroidCapabilities(DesiredCapabilities caps) {
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability("appPackage", "com.appreciatewealth.android");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.FULL_RESET, false);
        caps.setCapability("unicodeKeyboard", false);
        caps.setCapability("resetKeyboard", false);
    }

    private void setupiOSCapabilities(DesiredCapabilities caps) {
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        caps.setCapability("bundleId", "com.appreciatewealth.ios");
        caps.setCapability(MobileCapabilityType.NO_RESET, true);
        caps.setCapability(MobileCapabilityType.FULL_RESET, false);
        caps.setCapability("unicodeKeyboard", false);
        caps.setCapability("resetKeyboard", false);
    }

    public JSONArray getAndroidDevices() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("src/test/resources/devices/android-devices.json")));
        JSONObject jsonObject = new JSONObject(content);
        return jsonObject.getJSONArray("androidDevices");
    }

    public JSONArray getiOSDevices() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("src/test/resources/devices/ios-devices.json")));
        JSONObject jsonObject = new JSONObject(content);
        return jsonObject.getJSONArray("iosDevices");
    }

    public String getBrowserStackServerUrl() {
        return browserStackProps.getProperty("browserstack.server");
    }
}

