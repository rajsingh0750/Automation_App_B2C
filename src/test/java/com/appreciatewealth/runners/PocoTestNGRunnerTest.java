package com.appreciatewealth.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty","html:target/Reports/report.html"},
        features = {"/Users/raj/Downloads/AppreciateMobileAutomationNewUI_Investment_Final_Updated_With_Flutter/src/test/resources/Modules/Watchlist/Watchlist.feature"},
        glue = {"com.appreciatewealth.stepdef"},
        tags = "@main_final"
)

public class PocoTestNGRunnerTest extends RunnerBaseTest{
}
