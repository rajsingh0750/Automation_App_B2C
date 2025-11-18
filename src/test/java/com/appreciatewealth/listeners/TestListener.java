package com.appreciatewealth.listeners;

import com.appreciatewealth.utils.DriverManager;
import com.appreciatewealth.utils.TestUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    TestUtils utils = new TestUtils();

    @Override
    public void onTestStart(ITestResult result) {
        utils.log().info("Test started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        utils.log().info("Test passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        utils.log().error("Test failed: " + result.getMethod().getMethodName());
        utils.log().error("Failure reason: " + result.getThrowable().getMessage());
        
        // Mark test as failed in BrowserStack
        try {
            if (DriverManager.getDriver() != null) {
                DriverManager.getDriver().executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"failed\", \"reason\": \"" + result.getThrowable().getMessage() + "\"}}");
            }
        } catch (Exception e) {
            utils.log().error("Failed to update BrowserStack status: " + e.getMessage());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        utils.log().warn("Test skipped: " + result.getMethod().getMethodName());
    }
}

