package com.appreciatewealth.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/Reports/report.html"},
        features = {"/Users/varshathandava/Downloads/AppreciateMobileAutomationNewUI/src/test/resources/Modules/Trades/TradesSell.feature"},
        glue = {"com.appreciatewealth.stepdef"}
        //tags = "@Trade"

)
public class RealmeTestNGRunnerTest extends RunnerBaseTest {
}