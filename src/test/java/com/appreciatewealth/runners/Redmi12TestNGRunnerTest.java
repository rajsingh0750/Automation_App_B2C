package com.appreciatewealth.runners;

import io.cucumber.testng.CucumberOptions;

/**
 * An example of using TestNG when the test class does not inherit from
 * AbstractTestNGCucumberTests but still executes each scenario as a separate
 * TestNG test.
 */
@CucumberOptions(
        plugin = {"pretty","html:target/Reports/report.html"},
        features = {"/Users/varshathandava/Downloads/AppreciateMobileAutomation 2/src/test/resources/Modules/Goals/Goals.feature"},
        glue = {"com.appreciatewealth.stepdef"}

)
public class Redmi12TestNGRunnerTest extends RunnerBaseTest {
}