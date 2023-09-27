package com.appreciatewealth.runners;
import com.appreciatewealth.utils.DriverManager;
import com.appreciatewealth.utils.GlobalParams;
import com.appreciatewealth.utils.ServerManager;
import io.cucumber.junit.CucumberOptions;
import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import org.testng.annotations.AfterTest;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/Reports/report.html"},
        features = {"/Users/shubhamkumar/Downloads/AppreciateMobileAutomation 2/src/test/resources/Modules"},
        glue = {"com.appreciatewealth.stepdef"}

)
public class AppRunner {


       /* GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        new DriverManager().initializeDriver();
    }

    @AfterClass
    public static void quit(){
        DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
    }*/


    }

