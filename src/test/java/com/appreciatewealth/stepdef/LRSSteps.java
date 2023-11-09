package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.EasySavings;
import com.appreciatewealth.pages.LRSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LRSSteps {
    BasePage basePage = new BasePage();
    @Given("User clicks on Add Funds")
    public void user_clicks_on_add_funds() throws InterruptedException {
        new LRSPage().ClickAddFunds();
    }

    @Given("User clicks on Add Money to Buying Power button")
    public void user_clicks_on_add_money_to_buying_power_button() throws InterruptedException {
        new LRSPage().AddMoneytoBuyingPower();

    }

    @Given("User enters the deposit amount")
    public void user_enters_the_deposit_amount() throws InterruptedException {
        new EasySavings().TypeAmountTransferForBuyingPower();
    }


    @And("User uploads the invalid bank statement")
    public void user_uploads_the_valid_bank_statement() throws InterruptedException {
        new LRSPage().ClickonUploadStatement();
        new LRSPage().SelectAxisBank();
        new LRSPage().SelectStatementPlus12Months();

    }


    @Then("User should see error message {string}")
    public void userShouldSeeErrorMessage(String arg0) throws InterruptedException {
        new LRSPage().ValidateInvalidBankStatementMsg("Statement Name Mismatch");
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the amount which is more than current balance in the YES bank")
    public void userEntersTheAmountWhichIsMoreThanCurrentBalanceInTheYESBank() throws InterruptedException {
        new EasySavings().TypeInvalidAmountForTransfer();
    }

    @Then("User should see the error message like Insufficient YES Bank balance")
    public void userShouldSeeTheErrorMessageLikeInsufficientYESBankBalance() throws InterruptedException {
        new LRSPage().CheckInsufficientAmountMessage();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the amount in decimal with all zeros")
    public void userEntersTheAmountInDecimalWithAllZeros() throws InterruptedException {
        new EasySavings().TypeAmountInvalidInDecimals();
    }


    @Then("User should see the error message like Please enter amount to proceed")
    public void userShouldSeeTheErrorMessageLikePleaseEnterAmountToProceed() throws InterruptedException {
        new LRSPage().CheckBlankAmountMessage();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @And("User enters full amount available in the Yes bank")
    public void userEntersFullAmountAvailableInTheYesBank() throws InterruptedException {
        new EasySavings().TypeFullAmount();
    }


    @Then("User should be able to proceed for further in the LRS journey")
    public void userShouldBeAbleToProceedForFurtherInTheLRSJourney() throws InterruptedException {
        new LRSPage().ClickonUploadStatement();
        new LRSPage().SelectBankAccount();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();


    }



    @And("User uploads the bank statement of more than twelve months")
    public void userUploadsTheBankStatementOfMoreThanTwelveMonths() throws InterruptedException {
        new LRSPage().ClickonUploadStatement();
        new LRSPage().SelectAxisBank();
        new LRSPage().SelectStatementPlus12Months();


    }


    @And("User uploads the bank statement of more than twelve months and it should get uploaded successfully")
    public void userUploadsTheBankStatementOfMoreThanTwelveMonthsAndItShouldGetUploadedSuccessfullly() throws InterruptedException {
        new LRSPage().ClickonUploadStatement();
        new LRSPage().SelectAxisBank();
        new LRSPage().SelectStatementPlus12Months();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }
}
