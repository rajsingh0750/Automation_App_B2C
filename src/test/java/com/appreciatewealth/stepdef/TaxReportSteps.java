package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.TaxReportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TaxReportSteps  extends BasePage {
    BasePage basePage = new BasePage();

    @Then("User should see the transaction activity heading download CTA and email icon")
    public void userShouldSeeTheTransactionActivityHeadingDownloadCTAAndEmailIcon() throws InterruptedException {
        new TaxReportPage().VerifyTransactionactivityPage();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Given("User select profile tab")
    public void user_select_profile_tab() throws InterruptedException {
        new TaxReportPage().SelectProfileTab();
    }
    @Given("User select reports tab under minimodule")
    public void user_select_reports_tab_under_minimodule() throws InterruptedException {
        new TaxReportPage().SelectReportsTab();
    }
    @Given("User select the tax reports section under reports page")
    public void user_select_the_tax_reports_section_under_reports_page() throws InterruptedException {
        new TaxReportPage().SelectTaxReportsOption();
    }
    @Given("User select transaction activity tab")
    public void user_select_transaction_activity_tab() throws InterruptedException {
        new TaxReportPage().SelectTransactionActivity();
    }
    @Given("User select the transaction month range")
    public void user_select_the_transaction_month_range() throws InterruptedException {
        new TaxReportPage().SelectMonthRange();
    }
    @When("User will click on download CTA")
    public void user_will_click_on_download_cta() throws InterruptedException {
        new TaxReportPage().SelectDownloadCTA();
    }

    @Then("User should able to download the activity report with successfull download toast message {string}")
    public void userShouldAbleToDownloadTheActivityReportWithSuccessfullDownloadToastMessage(String arg0) throws InterruptedException {
        new TaxReportPage().VerifyDownload("Document downloaded successfully");
        basePage.AndroidBack();
        basePage.Logout();
    }

    @When("User will click on download CTA without selecting the date range")
    public void userWillClickOnDownloadCTAWithoutSelectingTheDateRange() throws InterruptedException {
        new TaxReportPage().SelectDownloadCTA();
    }

    @Then("User should see date range error message as {string}")
    public void userShouldSeeDateRangeErrorMessageAs(String arg0) throws InterruptedException {
        new TaxReportPage().VerifyDateRangeError("Date range not selected.");
        basePage.AndroidBack();
        basePage.Logout();
    }

    @When("User will click on email icon")
    public void userWillClickOnEmailIcon() throws InterruptedException {
        new TaxReportPage().SelectEmailIcon();
    }

    @Then("User should able send the email successfully")
    public void userShouldAbleSendTheEmailSuccessfully() throws InterruptedException {
        new TaxReportPage().VerifySuccessEmailMsg("Email sent!");
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User should be able to see the transaction note")
    public void userShouldBeAbleToSeeTheTransactionNote() throws InterruptedException {
        new TaxReportPage().TransactionNote("Note: Transaction Activity will be generated and available to investors every financial year, in April.");
        basePage.AndroidBack();
        basePage.Logout();
    }

    @When("User select Capital gains under US Investments")
    public void user_select_capital_gains_under_us_investments() throws InterruptedException {
        new  TaxReportPage().SelectCapitalGains();
    }

    @When("User select Dividend and interest under US Investments")
    public void userSelectDividendAndInterestUnderUSInvestments() throws InterruptedException {
        new  TaxReportPage().SelectDividendandInterest();
    }

    @And("User select Schedule FA section under US Investments")
    public void userSelectScheduleFASectionUnderUSInvestments() throws InterruptedException {
        new  TaxReportPage().SelectScheduleFA();
    }

    @And("User select Form US Stock section under US Investments")
    public void userSelectFormUSStockSectionUnderUSInvestments() throws InterruptedException {
        new  TaxReportPage().SelectUSForm();
    }

    @And("User select Form Goals section under US Investments")
    public void userSelectFormGoalsSectionUnderUSInvestments() throws InterruptedException {
        new  TaxReportPage().SelectGoalsForm();
    }

    @Then("User should see the date range along with capital gain note description")
    public void userShouldSeeTheDateRangeAlongWithCapitalGainNoteDescription() throws InterruptedException {
        new  TaxReportPage().VerifyCapitalGainDetails();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User should see the date range along with Dividend and interest note description")
    public void userShouldSeeTheDateRangeAlongWithDividendAndInterestNoteDescription() throws InterruptedException {
        new  TaxReportPage().VerifyDividendAndInterestDetails();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User should see the date range along with Schedule FA note")
    public void userShouldSeeTheDateRangeAlongWithScheduleFANote() throws InterruptedException {
        new  TaxReportPage().VerifyScheduleFADetails();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User should see the date range along with Form US Stocks note")
    public void userShouldSeeTheDateRangeAlongWithFormUSStocksNote() throws InterruptedException {
        new  TaxReportPage().VerifyFormUSStocksDetails();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User should see the date range along with Form Goals note")
    public void userShouldSeeTheDateRangeAlongWithFormGoalsNote() throws InterruptedException {
        new  TaxReportPage().VerifyGoalsFormDetails();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User select the US Stocks transaction month range")
    public void userSelectTheUSStocksTransactionMonthRange() throws InterruptedException {
        new  TaxReportPage().SelectTransactionDateForUSStocks();
    }



}
