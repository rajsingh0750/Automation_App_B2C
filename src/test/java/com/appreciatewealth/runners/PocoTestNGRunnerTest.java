package com.appreciatewealth.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/Reports/report.html"},
        features = {"/Users/raj/Downloads/AppreciateMobileAutomationNewUI_Investment_Final_Updated/src/test/resources/Modules/Trades/StockDetails.feature"},
        glue = {"com.appreciatewealth.stepdef"},
        tags = "@Sanity"

)

public class PocoTestNGRunnerTest extends RunnerBaseTest{
}
