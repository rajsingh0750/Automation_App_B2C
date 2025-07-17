package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class StockDetailsSteps_with_flutter extends BasePage {
    BasePage basePage = new BasePage();

    @Given("User is on the dashboard")
    public void user_is_on_the_dashboard() throws IOException, InterruptedException {
        new StockDetailsPage_with_flutter().GoToHomeDashboard();
    }

    @And("User search the csx stock under US Stocks")
    public void userSearchTheCsxStockUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("CSX");
    }

    @And("User click on the csx Stock")
    public void userClickOnTheCsxStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnCSXStock();
    }

    @And("User Update the enter amount")
    public void userUpdateTheEnterAmount() throws InterruptedException {
        new StockDetailsPage_with_flutter().UpdateAmount();
    }

    @And("User search tesla under US Stocks")
    public void userSearchTeslaUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("tesla");
    }

    @And("User select Tesla stock")
    public void userSelectTeslaStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnTeslaStock();
    }

    @And("User search FOR under US Stocks")
    public void userSearchFORUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("For");
    }

    @When("User select For stock")
    public void userSelectForStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnForStock();
    }

    @Then("the open price should not be visible")
    public void theOpenPriceShouldNotBeVisible() throws InterruptedException {
        new StockDetailsPage_with_flutter().verifyOpenPriceInClosedMarket();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User search INTC under US Stocks")
    public void userSearchINTCUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("INTC");
    }

    @When("User select INTC stock")
    public void userSelectINTCStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnINTCStock();;
    }

    @Then("PE ratio and EPS value should be visible")
    public void peRatioAndEPSValueShouldBeVisible() throws InterruptedException {
        new StockDetailsPage_with_flutter().verifyEPSValueAndPERatio();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see the percentage change for the available funds")
    public void userShouldSeeThePercentageChangeForTheAvailableFunds() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyPercentageChange();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("dividend yield should be visible")
    public void dividendYieldShouldBeVisible() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyDividend();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("dividend yield should't be negative")
    public void dividendYieldShouldTBeNegative() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyNegativeDividend();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User will see the equity tag")
    public void userWillSeeTheEquityTag() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyEquityTag();
    }

    @Then("User should also see the industry sector and market cap of the equity")
    public void userShouldAlsoSeeTheIndustrySectorAndMarketCapOfTheEquity() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyAboutTSLA();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User applied ETF option")
    public void userAppliedETFOption() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectETFOption();
    }

    @And("User select the ETF of Tesla")
    public void userSelectTheETFOfTesla() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectTeslaETF();
    }

    @When("User will see the ETF tag")
    public void userWillSeeTheETFTag() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyETFTag();
    }

    @Then("User should not see the industry sector and market cap of the equity")
    public void userShouldNotSeeTheIndustrySectorAndMarketCapOfTheEquity() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyTeslaETFDetail();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User search Goldman sachs under US Stocks")
    public void userSearchGoldmanSachsUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("Goldman sachs");
    }

    @Then("the result stocks should be clickable")
    public void theResultStocksShouldBeClickable() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnStocks();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User search for apple under US Stocks")
    public void userSearchForAppleUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("apple");
    }

    @And("User go to the apple details page")
    public void userGoToTheAppleDetailsPage() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnAppleEquity();

    }

    @And("User Select the research tab")
    public void userSelectTheResearchTab() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectResearchTab();
    }

    @Then("User should be able to see the apple report")
    public void userShouldBeAbleToSeeTheAppleReport() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyAppleReport();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User Selects the news tab")
    public void userSelectsTheNewsTab() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectNewsTab();
    }

    @Then("User should see the news related to apple stock")
    public void userShouldSeeTheNewsRelatedToAppleStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().VeifyApleNews();
         basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User Selects Events tab")
    public void userSelectsEventsTab() throws InterruptedException {
        basePage.SlideHorizontally(567,1060,189,1060);
    }

    @Then("User should see the all events if available")
    public void userShouldSeeTheAllEventsIfAvailable() throws InterruptedException {
        new StockDetailsPage_with_flutter().VeifyEvents();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @Then("User should see all the research tab sections")
    public void userShouldSeeAllTheResearchTabSections() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyResearchTabAllSections();
    }

    @Then("User will verify Price Targets and Analyst Ratings details")
    public void userWillVerifyPriceTargetsAndAnalystRatingsDetails() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyPriceSectionDetails();
        new StockDetailsPage_with_flutter().VerifyAnalystSectionDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @Then("User will verify Earnings and financial section details")
    public void userWillVerifyEarningsAndFinancialSectionDetails() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyEarningsDetails();
        new StockDetailsPage_with_flutter().VerifyFinancialTrendDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User will verify Financial trend section details")
    public void userWillVerifyFinancialTrendSectionDetails() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyFinancialTrendDetails();
    }

    @Then("User will verify Peer comparison and indicator components section")
    public void userWillVerifyPeerComparisonAndIndicatorComponentsSection() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyPeerComparisonDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User will verify refinitiv report section")
    public void userWillVerifyRefinitivReportSection() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyRefinitivReportDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see earning graph")
    public void userShouldSeeEarningGraph() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyEarningSectionGraph();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see financial trend graph")
    public void userShouldSeeFinancialTrendGraph() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyFinancialTrendSectionGraph();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User search for amazon under US Stocks")
    public void userSearchForAmazonUnderUSStocks() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClearStockName();
        new DashboardPage().EnterStockName("amazon");
    }

    @And("User go to the amazon details page")
    public void userGoToTheAmazonDetailsPage() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnAmazonEquity();
    }

    @Then("User should see the news related to amazon stock")
    public void userShouldSeeTheNewsRelatedToAmazonStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyAmazonNews();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @When("User search for ENFR under US Stocks")
    public void userSearchForENFRUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("ENFR");
    }

    @And("User go to the ENFR details page")
    public void userGoToTheENFRDetailsPage() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnENFRETF();

    }

    @And("User click on price performance dropdown")
    public void userClickOnPricePerformanceDropdown() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnPricePerformanceDropdown();
    }

    @And("User click on key metrics dropdown")
    public void userClickOnKeyMetricsDropdown() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnKeyMetricsDropdown();
    }

    @When("User will scroll")
    public void userWillScroll() throws InterruptedException {
        new StockDetailsPage_with_flutter().ScrollAbove();
    }

    @Then("the accordion should not scroll out of the screen")
    public void theAccordionShouldNotScrollOutOfTheScreen() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyOverViewSection();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see stock borker id")
    public void userShouldSeeStockBorkerId() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyStockBrokerID();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User click on US Stocks")
    public void userClickOnUSStocks() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectUSStocks();
    }

    @And("User Select Popular Stocks")
    public void userSelectPopularStocks() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectPopularStocks();
    }


    @And("User select high to low")
    public void userSelectHighToLow() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectHighToLow();
    }

    @And("User select low to high")
    public void userSelectLowToHigh() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectLowTOHigh();
    }

    @And("User select name option")
    public void userSelectNameOption() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectNameOption();
    }

    @And("User select A to Z")
    public void userSelectAToZ() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectAtoZ();
    }

    @And("User select Z to A")
    public void userSelectZToA() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectZtoA();
    }

    @And("User Select Stock option")
    public void userSelectStockOption() throws InterruptedException {
        new StockDetailsPage_with_flutter().SelectSTOCKOption();
    }

    @And("User clicks on Apply Button")
    public void userClicksOnApplyButton() throws InterruptedException {
        new WatchlistPage().SelectapplyButton();
    }

    @And("User clear the search bar")
    public void userClearTheSearchBar() throws InterruptedException {
        new WatchlistPage().ClearSearch();
    }

    @Then("User will see {string}")
    public void userWillSee(String arg0) throws InterruptedException {
        new WatchlistPage().VerifyNoResultsForAmazon();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User click on about etf dropdown")
    public void userClickOnAboutEtfDropdown() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnAboutETF();
    }

    @And("User search for spy under US Stocks")
    public void userSearchForSpyUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("spy");
    }

    @And("User go to details page of spy stock")
    public void userGoToDetailsPageOfSpyStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnSpyStock();
    }


    @Then("User will verify the research tab for spy stock")
    public void userWillVerifyTheResearchTabForSpyStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifySpyResearchSection();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User search for mnts under US Stocks")
    public void userSearchForMntsUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("mnts");
    }

    @And("User go to details page of mnts stock")
    public void userGoToDetailsPageOfMntsStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnmntcStock();
    }

    @Then("User will verify ROE for mnts stock")
    public void userWillVerifyROEForMntsStock() throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyROEOfMNTSStock();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User again search for amazon under US Stocks")
    public void userAgainSearchForAmazonUnderUSStocks() throws InterruptedException {
       // new StockDetailsPage().ClearStockName();
        new DashboardPage().EnterStockName("amazon");
    }

    @And("selects the Overview tab")
    public void selectsTheOverviewTab() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnOverviewTab();
    }

    @When("the user clicks on the graph arrow dropdown")
    public void theUserClicksOnTheGraphArrowDropdown() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnTheGraphArrowDropdown();
    }


    @Then("the user should see all relevant information under the Price Performance section")
    public void theUserShouldSeeAllRelevantInformationUnderThePricePerformanceSection() throws InterruptedException {
        new StockDetailsPage_with_flutter().ValidatePricePerformance();
    }

    @And("selects the Research tab")
    public void selectsTheResearchTab() throws InterruptedException {
        new StockDetailsPage_with_flutter().ClickOnResearchTab();
    }

    @Then("the user should see all relevant details under the {string} and {string} sections")
    public void theUserShouldSeeAllRelevantDetailsUnderTheAndSections(String arg0, String arg1) throws InterruptedException {
        new StockDetailsPage_with_flutter().VerifyPriceTargetsSection();
        new StockDetailsPage_with_flutter().VerifyAnalystRatingsSection();
    }
}
