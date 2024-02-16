package com.appreciatewealth.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/Reports/report.html"},
        features = {"/Users/varshathandava/Downloads/AppreciateMobileAutomation 2/src/test/resources/Modules/Trades/LRS.feature"},
        glue = {"com.appreciatewealth.stepdef"},
        tags = "@Prod"

)
public class RealmeTestNGRunnerTest extends RunnerBaseTest {
}