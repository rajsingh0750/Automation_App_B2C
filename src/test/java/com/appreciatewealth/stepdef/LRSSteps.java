package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.EasySavings;
import com.appreciatewealth.pages.LRSPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

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
        //new LRSPage().UploadBankStatement();
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

    @And("User clicks on continue button")
    public void userClicksOnContinueButton() throws InterruptedException {
        new LRSPage().ClickOnTransfer();

    }

    @And("User enters the amount to be deposited")
    public void userEntersTheAmountToBeDeposited() throws InterruptedException {
        new LRSPage().EnterDepositAmount();
    }

    @And("User click on tranfer from yes bank")
    public void userClickOnTranferFromYesBank() throws InterruptedException {
        new LRSPage().ClickonUploadStatement();
        new LRSPage().SelectBankAccount();
        new LRSPage().UploadBankStatement();
        new LRSPage().TransferFromYesBank();


    }

    @And("User Enters the PAN details")
    public void userEntersThePANDetails() throws InterruptedException {
        new LRSPage().EnterPAN();
    }

    @And("User Enters the CustomerID")
    public void userEntersTheCustomerID() {

        new LRSPage().EnterYesBankCustomerID();
    }


    @And("User click on Proceed")
    public void userClickOnProceed() throws InterruptedException {
        new LRSPage().ClickonProceed();
    }

    @And("User Enters the first OTP")
    public void userEntersTheFirstOTP() throws IOException, InterruptedException {
        new LRSPage().EnterOTP1();
    }

    @And("User Confirms all the agreement checkbox")
    public void userConfirmsAllTheAgreementCheckbox() throws InterruptedException {
        new LRSPage().SelectCheckBoxes();
    }

    @And("User Selects YesLogin")
    public void userSelectsYesLogin() throws InterruptedException {
        new LRSPage().SelectYesOnline();
    }

    @And("User submits the Net Banking Details")
    public void userSubmitsTheNetBankingDetails() throws InterruptedException {
        new LRSPage().SubmitCustomerIDandPassword();

    }

    @And("User enters the Net Banking OTP")
    public void userEntersTheNetBankingOTP() throws IOException, InterruptedException {
        new LRSPage().EnterNetBankingOTP();

    }
    @And("User see Transaction Details")
    public void userSeeTransactionDetails() throws IOException, InterruptedException {
        //new LRSPage().FetchDetails();
        new LRSPage().TransactionDetails();
        new LRSPage().ValidateTransferAmount();
        //new LRSPage().ValidateDepositAmount();
        basePage.AndroidBack();
    }

    @Then("the transaction should be successfull")
    public void theTransactionShouldBeSuccessfull() throws InterruptedException, IOException {
        //new LRSPage().ValidateTransactionIsSuccessFull();
        new LRSPage().ClickOnDashboard();
        basePage.ClickProfileSettings();
        basePage.Logout();


    }

    @And("User Uploads the statement for first time")
    public void userUploadsTheStatementForFirstTime() throws InterruptedException {
        new LRSPage().ClickonUploadStatement();
        new LRSPage().UploadBankStatement();
        new LRSPage().TransferFromYesBank();
    }


    @Given("User is on Message App")
    public void userIsOnMessageApp() throws IOException, InterruptedException {
        basePage.CopyOTPFromMessage();
    }

    @And("User clicks on Money Transfer CTA")
    public void userClicksOnMoneyTransferCTA() throws InterruptedException {
        new LRSPage().MoneyTransferClick();
    }

    @And("User clicks on add funds from Small investment and Large returns section")
    public void userClicksOnAddFundsFromSmallInvestmentAndLargeReturnsSection() throws InterruptedException {
        new LRSPage().ClickAddFundsFromSmallInvestment();
    }

    @And("User clicks on Plus icon from Small investment and Large returns")
    public void userClicksOnPlusIconFromSmallInvestmentAndLargeReturns() throws InterruptedException {
        new LRSPage().ClickOnPlusIcon();
    }

    @And("User Enter the Phone Number")
    public void userEnterThePhoneNumber() throws InterruptedException {
        new LRSPage().EnterPhoneNumber();
        
    }

    @And("User Enter Wrong Customer ID")
    public void userEnterWrongCustomerID() throws InterruptedException {
        new LRSPage().EnterWrongYesBankCustomerID();
        
    }

    @Then("the User should see error message {string}")
    public void theUserShouldSeeErrorMessage(String arg0) throws InterruptedException, IOException {
    new LRSPage().ValidateErrorTransaction("Transaction Processing Error!");
        new LRSPage().ValidateMessage();
        new LRSPage().ClickOnDashboard();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the amount in paise to be deposited")
    public void userEntersTheAmountInPaiseToBeDeposited() throws InterruptedException {
        new LRSPage().EnterAllowedAmount();
        new LRSPage().EnterAllowedAmountZero();
        new LRSPage().EnterAllowedAmount();
        new LRSPage().EnterDepositAmount();

    }

    @And("User Select ReadMore option from review transfer screen")
    public void userSelectReadMoreOptionFromReviewTransferScreen() throws InterruptedException {
        new LRSPage().ReviewReadMore();
        new LRSPage().ValidateTCSDescription();
    }

    @Then("User Should See Successfully TCS Description")
    public void userShouldSeeSuccessfullyTCSDescription() throws InterruptedException {
        new LRSPage().ReviewOkay();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @And("User Select Terms and Conditions option from review transfer screen")
    public void userSelectTermsAndConditionsOptionFromReviewTransferScreen() throws InterruptedException {
        new LRSPage().SelectTransfer();

    }

    @Then("User Should See Successfully Terms and Condition Description")
    public void userShouldSeeSuccessfullyTermsAndConditionDescription() throws InterruptedException {
        new LRSPage().ValidateLRSTerms();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Given("User is on the Trade dashboard")
    public void userIsOnTheTradeDashboard() {
    }

    @And("User Enter Wrong PAN ID")
    public void userEnterWrongPANID() throws InterruptedException {
        new LRSPage().EnterInvalidPAN();
    }

    @Then("the User should see the error message {string}")
    public void theUserShouldSeeTheErrorMessage(String arg0) throws InterruptedException {
        new LRSPage().ValidateErrorText("Please enter valid PAN number.");
        basePage.AndroidBack();
        new LRSPage().SelectButtonOkay();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        //basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("the User should see the error message as {string}")
    public void theUserShouldSeeTheErrorMessageAs(String arg0) throws InterruptedException, IOException {
        new LRSPage().ValidateErrorTransactionPAN("Transaction Processing Error!");
        new LRSPage().ValidateErrorMessage();
        new LRSPage().ClickOnDashboard();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User click on the tranfer from yes bank")
    public void userClickOnTheTranferFromYesBank() throws InterruptedException {
        new LRSPage().ClickonUploadStatement();
    }

    @And("User Selects Read FAQs")
    public void userSelectsReadFAQs() throws IOException, InterruptedException {
        new LRSPage().SelectFAQs();
        
    }

    @Then("User should see the FAQs Descriptions")
    public void userShouldSeeTheFAQsDescriptions() throws InterruptedException {
        new LRSPage().ValidateFAQSDescription();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }



}