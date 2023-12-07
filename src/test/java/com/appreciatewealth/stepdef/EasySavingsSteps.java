package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class EasySavingsSteps {
    SignInPage signInPage = new SignInPage();
    DashboardPage dashboardPage = new DashboardPage();
    BasePage basePage = new BasePage();


    @Given("the user is on Dashboard")
    public void theUserIsOnDashboard() throws InterruptedException {
        signInPage.DynamicSignIn("Shubh.kr.rjpt@gmail.com");
        dashboardPage.ClickOnGoToDashboard();

    }

    @And("User clicks on Refer link")
    public void userClicksOnReferLink() throws InterruptedException {
        new EasySavings().clickOnRefer();
    }

    @And("User enters the already used Coupon")
    public void userEntersTheAlreadyUsedCoupon() throws InterruptedException {
        new EasySavings().EnterCouponCode("EASYSAVING2023");

    }




    @Then("User should see the error message Coupon code already in use")
    public void userShouldSeeTheErrorMessageCouponCodeAlreadyInUse() throws InterruptedException {
        new EasySavings().ValidateErrorMessageCouponAlreadyUsed("Coupon code already in use");
        new EasySavings().TryAgain();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }





    @And("User enters the invalid Coupon {string}")
    public void userEntersTheInvalidCoupon(String CouponCode) throws InterruptedException {
        new EasySavings().AddInvalidCoupons(CouponCode);
    }


    @Then("the user should see the error message {string}")
    public void theUserShouldSeeTheErrorMessage(String ErrorMessage) throws InterruptedException {
        new EasySavings().ValidateInvalidCouponMesssage(ErrorMessage);
        new EasySavings().TryAgain();

    }

    @And("the user clears the coupon code")
    public void theUserClearsTheCouponCode() throws InterruptedException {
        new EasySavings().ClearCoupon();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User checks the current Remaining and Savings")
    public void userChecksTheCurrentRemainingAndSavings() throws InterruptedException {
        new EasySavings().GetCurrentRemaining();
        new EasySavings().GetCurrentSavings();    }

    @And("User transfers adds the fund through UPI")
    public void userTransfersAddsTheFundThroughUPI() throws InterruptedException {
        new EasySavings().TypeAmountForTransfer();
    }

    @Then("Numbers on portfolio should change as per the payment made by the user")
    public void numbersOnPortfolioShouldChangeAsPerThePaymentMadeByTheUser() throws InterruptedException {
        new EasySavings().CalculateSavingAndDepositRemaining();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see the days remaining as per the current date")
    public void userShouldSeeTheDaysRemainingAsPerTheCurrentDate() throws InterruptedException {
        new EasySavings().ValidateRemainingDays();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @Then("User should see the Incentive message if the user is eligible")
    public void userShouldSeeTheIncentiveMessageIfTheUserIsEligible() throws InterruptedException {
        new EasySavings().ValidateIncentiveMessage();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Given("User is Logged in and on Dashboard")
    public void userIsLoggedInAndOnDashboard() throws InterruptedException {
        signInPage.DynamicSignIn("shubh.kr.rjpt@gmail.com");
        dashboardPage.ClickOnGoToDashboard();
    }

    @Given("the user is on the Dashboard")
    public void theUserIsOnTheDashboard() throws IOException, InterruptedException {
        new SignInPage().DynamicSignIn("faureretruba-9695@yopmail.com");
        dashboardPage.ClickOnGoToDashboard();

    }

    @And("the User Select Easy Savings Banner")
    public void theUserSelectEasySavingsBanner() throws InterruptedException {
        new EasySavings().ClickSavingBanner();
        
    }

    @And("the User see Deposit Amount")
    public void theUserSeeDepositAmount() throws InterruptedException {
        new EasySavings().ValidateDepositsAmount();
        
    }

    @And("the User see Deposit Date")
    public void theUserSeeDepositDate() throws InterruptedException {
        new EasySavings().ValidateDepositsDate();
    }

    @Then("User Should see all the Details with Transaction Status")
    public void userShouldSeeAllTheDetailsWithTransactionStatus() throws InterruptedException {
        new EasySavings().ValidateDepositsId();
        new EasySavings().ValidateDepositsStatus();
        new EasySavings().ClickBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Given("User is Logged in and on Easy Saving Banner in Dashboard")
    public void userIsLoggedInAndOnEasySavingBannerInDashboard() throws InterruptedException {
        signInPage.DynamicSignIn("varsha.thandav@ppreciate.com");
        dashboardPage.ClickOnGoToDashboard();
    }

    @Then("User Should be able to scroll the Deposit tab")
    public void userShouldBeAbleToScrollTheDepositTab() throws InterruptedException {
        new EasySavings().ScrollDeposit();
        new EasySavings().ClickBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @Given("the user is on Goals Dashboard for EasySavings")
    public void theUserIsOnGoalsDashboardForEasySavings() throws InterruptedException, IOException {
        signInPage.DynamicSignIn("shubh.kr.rjpt@gmail.com");
        dashboardPage.ClickOnGoToDashboard();
        new GoalsPage().SwitchtoGoal();

    }

    @Then("User Should be able to see Easy Saving Banner in goal Dashboard")
    public void userShouldBeAbleToSeeEasySavingBannerInGoalDashboard() throws InterruptedException {
        new EasySavings().ValidateGoalEasySavings();
        basePage.ClickProfileSettings();
        basePage.Logout();


    }

    @And("the User Clicks on Total Return")
    public void theUserClicksOnTotalReturn() throws InterruptedException {
        new EasySavings().ClickTotalReturn();
    }

    @Then("User Should See all related message in Total return")
    public void userShouldSeeAllRelatedMessageInTotalReturn() throws InterruptedException {
        new EasySavings().ValidateIncentivesMessage();
        new EasySavings().ValidateReturnMessage();
        new EasySavings().ValidateAnnualMessage();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


}
