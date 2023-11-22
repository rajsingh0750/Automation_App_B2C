package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.GoalsPage;
import io.cucumber.java.en.Then;

import java.io.IOException;

import static com.appreciatewealth.pages.GoalsPage.CalculateRetirementYear;

public class GoalsCalculatorSteps extends  BasePage {
    BasePage basePage = new BasePage();

    public void GoalsCalculator(){

    }

    @Then("the user should see details as per the calculation")
    public void the_user_should_see_details_as_per_the_calculation() throws IOException, InterruptedException {
        new GoalsPage().ClickOnGoalCalculator();
        new GoalsPage().SelectGoalType();
        new GoalsPage().EnterAmount("100000");
        new GoalsPage().ClickonSeeTargetAmount();
        new GoalsPage();
        CalculateRetirementYear(65,35);
        Thread.sleep(10000);
        new GoalsPage();
        GoalsPage.CalculateTotalTargetValue(574350);
        basePage.AndroidBack();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();



    }
}
