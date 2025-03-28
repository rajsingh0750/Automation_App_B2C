package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class StockDetailsSteps extends BasePage {
    BasePage basePage = new BasePage();

    @Given("User is on the dashboard")
    public void user_is_on_the_dashboard() throws IOException, InterruptedException {
        new StockDetailsPage().GoToHomeDashboard();
    }

    @And("User search the csx stock under US Stocks")
    public void userSearchTheCsxStockUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("CSX");
    }

    @And("User click on the csx Stock")
    public void userClickOnTheCsxStock() throws InterruptedException {
        new StockDetailsPage().ClickOnCSXStock();
    }

    @And("User Update the enter amount")
    public void userUpdateTheEnterAmount() throws InterruptedException {
        new StockDetailsPage().UpdateAmount();
    }

    @And("User search tesla under US Stocks")
    public void userSearchTeslaUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("tesla");
    }

    @And("User select Tesla stock")
    public void userSelectTeslaStock() throws InterruptedException {
        new StockDetailsPage().ClickOnTeslaStock();
    }

    @And("User search FOR under US Stocks")
    public void userSearchFORUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("For");
    }

    @When("User select For stock")
    public void userSelectForStock() throws InterruptedException {
        new StockDetailsPage().ClickOnForStock();
    }

    @Then("the open price should not be visible")
    public void theOpenPriceShouldNotBeVisible() throws InterruptedException {
        new StockDetailsPage().verifyOpenPriceInClosedMarket();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User search INTC under US Stocks")
    public void userSearchINTCUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("TSLA");
    }

    @When("User select INTC stock")
    public void userSelectINTCStock() throws InterruptedException {
        new StockDetailsPage().ClickOnTeslaStock();
    }

    @Then("PE ratio and EPS value should be visible")
    public void peRatioAndEPSValueShouldBeVisible() throws InterruptedException {
        new StockDetailsPage().verifyEPSValueAndPERatio();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see the percentage change for the available funds")
    public void userShouldSeeThePercentageChangeForTheAvailableFunds() throws InterruptedException {
        new StockDetailsPage().VerifyPercentageChange();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("dividend yield should be visible")
    public void dividendYieldShouldBeVisible() throws InterruptedException {
        new StockDetailsPage().VerifyDividend();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("dividend yield should't be negative")
    public void dividendYieldShouldTBeNegative() throws InterruptedException {
        new StockDetailsPage().VerifyNegativeDividend();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User will see the equity tag")
    public void userWillSeeTheEquityTag() throws InterruptedException {
        new StockDetailsPage().VerifyEquityTag();
    }

    @Then("User should also see the industry sector and market cap of the equity")
    public void userShouldAlsoSeeTheIndustrySectorAndMarketCapOfTheEquity() throws InterruptedException {
        new StockDetailsPage().VerifyAboutTSLA();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User applied ETF option")
    public void userAppliedETFOption() throws InterruptedException {
        new StockDetailsPage().SelectETFOption();
    }

    @And("User select the ETF of Tesla")
    public void userSelectTheETFOfTesla() throws InterruptedException {
        new StockDetailsPage().SelectTeslaETF();
    }

    @When("User will see the ETF tag")
    public void userWillSeeTheETFTag() throws InterruptedException {
        new StockDetailsPage().VerifyETFTag();
    }

    @Then("User should not see the industry sector and market cap of the equity")
    public void userShouldNotSeeTheIndustrySectorAndMarketCapOfTheEquity() throws InterruptedException {
        new StockDetailsPage().VerifyTeslaETFDetail();
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
        new StockDetailsPage().ClickOnStocks();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User search for apple under US Stocks")
    public void userSearchForAppleUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("apple");
    }

    @And("User go to the apple details page")
    public void userGoToTheAppleDetailsPage() throws InterruptedException {
        new StockDetailsPage().ClickOnAppleEquity();

    }

    @And("User Select the research tab")
    public void userSelectTheResearchTab() throws InterruptedException {
        new StockDetailsPage().SelectResearchTab();
    }

    @Then("User should be able to see the apple report")
    public void userShouldBeAbleToSeeTheAppleReport() throws InterruptedException {
        new StockDetailsPage().VerifyAppleReport();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User Selects the news tab")
    public void userSelectsTheNewsTab() throws InterruptedException {
        new StockDetailsPage().SelectNewsTab();
    }

    @Then("User should see the news related to apple stock")
    public void userShouldSeeTheNewsRelatedToAppleStock() throws InterruptedException {
        new StockDetailsPage().VeifyApleNews();
         basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User Selects Events tab")
    public void userSelectsEventsTab() throws InterruptedException {
        basePage.SlideHorizontally(177,340,505,992);
    }

    @Then("User should see the all events if available")
    public void userShouldSeeTheAllEventsIfAvailable() throws InterruptedException {
        new StockDetailsPage().VeifyEvents();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @Then("User should see all the research tab sections")
    public void userShouldSeeAllTheResearchTabSections() throws InterruptedException {
        new StockDetailsPage().VerifyResearchTabAllSections();
    }

    @Then("User will verify Price Targets and Analyst Ratings details")
    public void userWillVerifyPriceTargetsAndAnalystRatingsDetails() throws InterruptedException {
        new StockDetailsPage().VerifyPriceSectionDetails();
        new StockDetailsPage().VerifyAnalystSectionDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @Then("User will verify Earnings and financial section details")
    public void userWillVerifyEarningsAndFinancialSectionDetails() throws InterruptedException {
        new StockDetailsPage().VerifyEarningsDetails();
        new StockDetailsPage().VerifyFinancialTrendDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User will verify Financial trend section details")
    public void userWillVerifyFinancialTrendSectionDetails() throws InterruptedException {
        new StockDetailsPage().VerifyFinancialTrendDetails();
    }

    @Then("User will verify Peer comparison and indicator components section")
    public void userWillVerifyPeerComparisonAndIndicatorComponentsSection() throws InterruptedException {
        new StockDetailsPage().VerifyPeerComparisonDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User will verify refinitiv report section")
    public void userWillVerifyRefinitivReportSection() throws InterruptedException {
        new StockDetailsPage().VerifyRefinitivReportDetails();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see earning graph")
    public void userShouldSeeEarningGraph() throws InterruptedException {
        new StockDetailsPage().VerifyEarningSectionGraph();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see financial trend graph")
    public void userShouldSeeFinancialTrendGraph() throws InterruptedException {
        new StockDetailsPage().VerifyFinancialTrendSectionGraph();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User search for amazon under US Stocks")
    public void userSearchForAmazonUnderUSStocks() throws InterruptedException {
        new StockDetailsPage().ClearStockName();
        new DashboardPage().EnterStockName("amazon");
    }

    @And("User go to the amazon details page")
    public void userGoToTheAmazonDetailsPage() throws InterruptedException {
        new StockDetailsPage().ClickOnAmazonEquity();
    }

    @Then("User should see the news related to amazon stock")
    public void userShouldSeeTheNewsRelatedToAmazonStock() throws InterruptedException {
        new StockDetailsPage().VerifyAmazonNews();
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
        new StockDetailsPage().ClickOnENFRETF();

    }

    @And("User click on price performance dropdown")
    public void userClickOnPricePerformanceDropdown() throws InterruptedException {
        new StockDetailsPage().ClickOnPricePerformanceDropdown();
    }

    @And("User click on key metrics dropdown")
    public void userClickOnKeyMetricsDropdown() throws InterruptedException {
        new StockDetailsPage().ClickOnKeyMetricsDropdown();
    }

    @When("User will scroll")
    public void userWillScroll() throws InterruptedException {
        new StockDetailsPage().ScrollAbove();
    }

    @Then("the accordion should not scroll out of the screen")
    public void theAccordionShouldNotScrollOutOfTheScreen() throws InterruptedException {
        new StockDetailsPage().VerifyOverViewSection();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see stock borker id")
    public void userShouldSeeStockBorkerId() throws InterruptedException {
        new StockDetailsPage().VerifyStockBrokerID();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User click on US Stocks")
    public void userClickOnUSStocks() throws InterruptedException {
        new StockDetailsPage().SelectUSStocks();
    }

    @And("User Select Popular Stocks")
    public void userSelectPopularStocks() throws InterruptedException {
        new StockDetailsPage().SelectPopularStocks();
    }


    @And("User select high to low")
    public void userSelectHighToLow() throws InterruptedException {
        new StockDetailsPage().SelectHighToLow();
    }

    @And("User select low to high")
    public void userSelectLowToHigh() throws InterruptedException {
        new StockDetailsPage().SelectLowTOHigh();
    }

    @And("User select name option")
    public void userSelectNameOption() throws InterruptedException {
        new StockDetailsPage().SelectNameOption();
    }

    @And("User select A to Z")
    public void userSelectAToZ() throws InterruptedException {
        new StockDetailsPage().SelectAtoZ();
    }

    @And("User select Z to A")
    public void userSelectZToA() throws InterruptedException {
        new StockDetailsPage().SelectZtoA();
    }

    @And("User Select Stock option")
    public void userSelectStockOption() throws InterruptedException {
        new StockDetailsPage().SelectSTOCKOption();
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
        new StockDetailsPage().ClickOnAboutETF();
    }

    @And("User search for spy under US Stocks")
    public void userSearchForSpyUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("spy");
    }

    @And("User go to details page of spy stock")
    public void userGoToDetailsPageOfSpyStock() throws InterruptedException {
        new StockDetailsPage().ClickOnSpyStock();
    }


    @Then("User will verify the research tab for spy stock")
    public void userWillVerifyTheResearchTabForSpyStock() throws InterruptedException {
        new StockDetailsPage().VerifySpyResearchSection();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User search for mnts under US Stocks")
    public void userSearchForMntsUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("mnts");
    }

    @And("User go to details page of mnts stock")
    public void userGoToDetailsPageOfMntsStock() throws InterruptedException {
        new StockDetailsPage().ClickOnmntcStock();
    }

    @Then("User will verify ROE for mnts stock")
    public void userWillVerifyROEForMntsStock() throws InterruptedException {
        new StockDetailsPage().VerifyROEOfMNTSStock();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }
}
