package com.appreciatewealth.utils;

import com.appreciatewealth.pages.BasePage;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class CapabilitiesManager extends BasePage {
    TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties props = new PropertyManager().getProps();

        try{
            utils.log().info("getting capabilities");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
            caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());

            switch (params.getPlatformName()) {
                case "Android" -> {
                    utils.log().info("Reading Android Properties");
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                    caps.setCapability("appPackage", props.getProperty("androidAppPackage"));

                    // caps.setCapability("shouldTerminateApp",true);
                    caps.setCapability(MobileCapabilityType.NO_RESET,true);
                    caps.setCapability(MobileCapabilityType.FULL_RESET,false);
                    caps.setCapability("unicodeKeyboard", false);
                    caps.setCapability("resetKeyboard", false);



                    caps.setCapability(MobileCapabilityType.APP,"/Users/varshathandava/Downloads/AppreciateMobileAutomation 2/src/test/resources/Apps/AppreciateProd.apk");
                    //caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                    //caps.setCapability("systemPort", params.getSystemPort());
                    //caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
                    // String androidAppUrl = (getClass().getResource(props.getProperty("androidAppLocation"))).getFile();
                    // props.getProperty("androidAppLocation");
                    // System.out.println(props.getProperty("androidAppLocation"));
                    // System.getProperty("/Users/shubhamkumar/Downloads/AppreciateMobileAutomation/src/test/resources/Apps/Appreciate.apk");
                    // caps.setCapability("app", androidAppUrl);
                    //utils.log().info("appUrl is " + androidAppUrl);
                }
                case "iOS" -> {
                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOSAutomationName"));
                    //String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
                    String iOSAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                            + File.separator + "resources" + File.separator + "apps" + File.separator + "SwagLabsMobileApp.app";
                    utils.log().info("appUrl is" + iOSAppUrl);
                    caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
                    caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
                    caps.setCapability("webkitDebugProxyPort", params.getWebkitDebugProxyPort());
                    caps.setCapability("app", iOSAppUrl);
                }
            }
            return caps;
        } catch(Exception e){
            e.printStackTrace();
            utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
            throw e;
        }
    }
}