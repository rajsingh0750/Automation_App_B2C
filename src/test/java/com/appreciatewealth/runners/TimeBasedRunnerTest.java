package com.appreciatewealth.runners;

import io.cucumber.testng.CucumberOptions;
import java.time.LocalTime;

/**
 * Time-based runner that automatically selects scenarios based on current time
 */
@CucumberOptions(
        plugin = {"pretty","html:target/Reports/time-based-report.html"},
        features = {"/Users/raj/Downloads/AppreciateMobileAutomationNewUI_Investment_Final_Updated_With_Flutter/src/test/resources/Modules/Trades"},
        glue = {"com.appreciatewealth.stepdef"},
        tags = "@TimeBased" // This will be dynamically set based on current time
)
public class TimeBasedRunnerTest extends RunnerBaseTest {
    
    // This method can be called to determine which tag to use
    public static String getCurrentTimeTag() {
        LocalTime currentTime = LocalTime.now();
        
        if (currentTime.isAfter(LocalTime.of(9, 0)) && 
            currentTime.isBefore(LocalTime.of(12, 0))) {
            return "@Morning";
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && 
                   currentTime.isBefore(LocalTime.of(16, 0))) {
            return "@Afternoon";
        } else if (currentTime.isAfter(LocalTime.of(16, 0)) && 
                   currentTime.isBefore(LocalTime.of(21, 0))) {
            return "@Evening";
        } else {
            return "@Night";
        }
    }
}
