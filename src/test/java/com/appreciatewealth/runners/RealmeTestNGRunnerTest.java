package com.appreciatewealth.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/Reports/report.html"},
        features = {"/Users/varshathandava/Downloads/AppreciateMobileAutomation 2/src/test/resources/Modules/EasySavings/EasySavings.feature"},
        glue = {"com.appreciatewealth.stepdef"}

)
public class RealmeTestNGRunnerTest extends RunnerBaseTest {
}
