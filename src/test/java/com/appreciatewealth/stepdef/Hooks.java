package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.utils.DriverManager;
import com.appreciatewealth.utils.GlobalParams;
import com.appreciatewealth.utils.ServerManager;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;


public class Hooks extends BasePage {
    BasePage basePage;
    public Hooks(){
        this.basePage = new BasePage();

    }






    @Before
    public void initialize() throws Exception {

        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTING KEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        new DriverManager().initializeDriver();
        /*  *//* BasePage basePage = new BasePage();

        basePage.launchApp();
        basePage.closeApp();*//*
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();

        new DriverManager().initializeDriver();*/
        System.out.println("Driver Initialized");
        //new VideoManager().startRecording();

    }




    @After
    public void quit(Scenario scenario) throws Exception {
        AndroidDriver driver = (AndroidDriver) DriverManager.getDriver();

        if (driver != null) {
            if (scenario.isFailed()) {
                // Take a screenshot only when the scenario fails
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());

                // Kill the app
                KillApp(driver);
                driver.quit();
                DriverManager.setDriver(null);
                ServerManager serverManager = new ServerManager();
                if (serverManager.getServer() != null) {
                    serverManager.getServer().stop();
                }

                GlobalParams params = new GlobalParams();
                params.initializeGlobalParams();

                ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                        + params.getDeviceName());

                new ServerManager().startServer();
                new DriverManager().initializeDriver();
                AndroidDriver driver2 = (AndroidDriver) DriverManager.getDriver();

                Thread.sleep(10000);
                ClickSignOut(driver2);

                // Relaunch the app
                // Include code to relaunch the app as needed

                // Perform logout actions
                // ...

                // Kill the app again (after logging out)
             // basePage.KillAppRealMe(driver2);
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
