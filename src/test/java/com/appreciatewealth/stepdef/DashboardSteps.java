package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.DashboardPage;
import com.appreciatewealth.pages.WatchlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class DashboardSteps extends BasePage {

    BasePage basePage = new BasePage();


        public DashboardSteps() {

        }


        @Given("the user is on Appreciate App's Dashboard")
        public void the_user_is_on_appreciate_app_s_dashboard() throws IOException, InterruptedException {
            new DashboardPage().NavigatetoDashboard();
        }

        @Given("a banner or information is displayed prompting the user to Add Funds")
        public void a_banner_or_information_is_displayed_prompting_the_user_to_add_funds() throws InterruptedException {
            new DashboardPage().ValidateAddFund();
        }

        @When("the user clicks on the CTA for adding funds")
        public void the_user_clicks_on_the_cta_for_adding_funds() throws InterruptedException {
            new DashboardPage().ClickonFunds();
        }

        @Then("the user should be redirected to the funds adding money transfer screen")
        public void the_user_should_be_redirected_to_the_funds_adding_money_transfer_screen() throws InterruptedException {
            new DashboardPage().ValidateMoneyTransferScreen();
            new DashboardPage().ClickClose();
            new BasePage().ClickProfileSettings();
            basePage.Logout();

        }


    @And("User should see news and select view all")
    public void userShouldSeeNewsAndSelectViewAll() throws InterruptedException {
            new DashboardPage().ClickNewsViewAll();
        new DashboardPage().ValidateNewsText();
        
    }

    @Then("User should See list of news Displayed")
    public void userShouldSeeListOfNewsDisplayed() throws InterruptedException {

        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User should see Year High today and select view all")
    public void userShouldSeeYearHighTodayAndSelectViewAll() throws InterruptedException {
        new DashboardPage().ClickYearViewAll();
        
    }

    @Then("User should See list of US year High today stocks")
    public void userShouldSeeListOfUSYearHighTodayStocks() throws InterruptedException {
        new DashboardPage().ValidateYearsHighText();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User should see Top Gainer and select view all")
    public void userShouldSeeTopGainerAndSelectViewAll() throws InterruptedException {
        new DashboardPage().ClickTopGainersViewAll();
    }

    @Then("User should See list of Top Gainers stocks")
    public void userShouldSeeListOfTopGainersStocks() throws InterruptedException {
        new DashboardPage().ValidateTopGainersText();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User should see Popular Stocks and select view all")
    public void userShouldSeePopularStocksAndSelectViewAll() throws InterruptedException {
        new DashboardPage().ClickPopularStocksViewAll();
        
    }

    @Then("User should See list of Popular stocks")
    public void userShouldSeeListOfPopularStocks() throws InterruptedException {
        new DashboardPage().ValidatePopularStocksText();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User should search for news")
    public void userShouldSearchForNews() throws InterruptedException {
        new DashboardPage().ClickOnNewsSearch();
        
    }

    @Then("User Should see list of news")
    public void userShouldSeeListOfNews() throws InterruptedException {
        new DashboardPage().NewsTextSearch();
        new DashboardPage().SelectNewsClear();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User Should select reward option")
    public void userShouldSelectRewardOption() throws InterruptedException {
        new DashboardPage().ClickOnReward();

        
    }

    @Then("User Should see by default Refer a friend must be selected successfully")
    public void userShouldSeeByDefaultReferAFriendMustBeSelectedSuccessfully() throws InterruptedException {
        new DashboardPage().ReferFriendText();
        new DashboardPage().ClickRewardBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User Should select notification option")
    public void userShouldSelectNotificationOption() throws InterruptedException {
        new DashboardPage().SelectNotification();
        
    }

    @Then("User Should see all Notification")
    public void userShouldSeeAllNotification() throws InterruptedException {
        new DashboardPage().ValidateNotificationtext();
        new DashboardPage().SelectNotificationBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User search the stocks under US Stocks")
    public void user_search_the_stocks_under_us_stocks() throws InterruptedException {
        new DashboardPage().EnterStockName("UAVS");

    }
//    @When("User search the stocks under US Stocks IOS")
//    public void userSearchTheStocksUnderUSStocksIOS() throws InterruptedException {
//        new DashboardPage().EnterStockName("UAVS");
//
//    }

    @Then("User will see the count of stocks")
    public void user_will_see_the_count_of_stocks() throws InterruptedException {
        new DashboardPage().CountStocks();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User will verify the Recently viewed page")
    public void userWillVerifyTheRecentlyViewedPage() throws InterruptedException {
        new DashboardPage().VerifyRecentlyViewedPage();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @And("User Selects the News tab")
    public void userSelectsTheNewsTab() throws InterruptedException {
        new DashboardPage().SelectNewsTab();
    }

    @When("User search the stocks under News Tab")
    public void userSearchTheStocksUnderNewsTab() throws InterruptedException {
        new DashboardPage().EnterStockName("Apple");
    }

    @Then("User will verify the News details")
    public void userWillVerifyTheNewsDetails() throws InterruptedException {
        new DashboardPage().VerifyStockNews();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @Then("User will see US Stocks is selected by default")
    public void userWillSeeUSStocksIsSelectedByDefault() throws InterruptedException {
        new DashboardPage().VerifyUSStock();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User will see filter CTA under Search page")
    public void userWillSeeFilterCTAUnderSearchPage() throws InterruptedException {
        new DashboardPage().VerifyFilterCTAUnderSearchPage();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User Selects the Research Tab")
    public void userSelectsTheResearchTab() throws InterruptedException {
        basePage.SlideHorizontally(530,230,505,230);
    }

    @Then("User will verify the content of news under Research tab")
    public void userWillVerifyTheContentOfNewsUnderResearchTab() throws InterruptedException {
        new DashboardPage().VerifyResearchMNewsContent();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }


    @When("User Selects the filter CTA")
    public void userSelectsTheFilterCTA() throws InterruptedException {
        new DashboardPage().SelectFilterCTA();
    }

    @Then("User will see the Bottom sheet for filter CTA")
    public void userWillSeeTheBottomSheetForFilterCTA() throws InterruptedException {
        new DashboardPage().VerifyFilterCTA();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User  search the stocks under US Stocks")
    public void userSearchTheStocksUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("APLE");
    }


    @When("User search the stock under News Tab")
    public void userSearchTheStockUnderNewsTab() throws InterruptedException {
        new DashboardPage().EnterStockNameUnderNewsTab("APPLE");
    }

    @When("User Selects US Top Gainers option under crafted list")
    public void userSelectsUSTopGainersOptionUnderCraftedList() throws InterruptedException {
        new DashboardPage().SelectUSTopGainersOption();
    }

    @Then("User will verify the count of Top Gainers stocks")
    public void userWillVerifyTheCountOfTopGainersStocks() throws InterruptedException {
        new DashboardPage().VerifyCountOfTopGainersStocks();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User Selects US Top Losers option under crafted list")
    public void userSelectsUSTopLosersOptionUnderCraftedList() throws InterruptedException {
        new DashboardPage().SelectUSTopLosersOption();
    }

    @Then("User will verify the count of Top Losers stocks")
    public void userWillVerifyTheCountOfTopLosersStocks() throws InterruptedException {
        new DashboardPage().VerifyCountOfTopLosersStocks();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User Selects US Year High Today option under crafted list")
    public void userSelectsUSYearHighTodayOptionUnderCraftedList() throws InterruptedException {
        new DashboardPage().SelectUSYearHighTodayOption();
    }

    @Then("User will verify the count of US Year High Today stocks")
    public void userWillVerifyTheCountOfUSYearHighTodayStocks() throws InterruptedException {
        new DashboardPage().VerifyCountOfUSYearHighTodayStocks();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User enters the special characters in search bar")
    public void userEntersTheSpecialCharactersInSearchBar() throws InterruptedException {
        new DashboardPage().EnterStockNameUnderSearchPage();
    }

    @Then("User will see No results")
    public void userWillSeeNoResults() throws InterruptedException {
        new DashboardPage().VerifyNoResultsmsg();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User will click on Tesla stock")
    public void userWillClickOnTeslaStock() throws InterruptedException {
        new DashboardPage().GoToTeslaStock();
    }

    @And("User will go back and select the filter")
    public void userWillGoBackAndSelectTheFilter() throws InterruptedException {
        basePage.AndroidBack();
        new DashboardPage().SelectFilterCTA();
        new DashboardPage().ApplyTeslaFilter();
    }

    @Then("User will see the  Stock")
    public void userWillSeeTheStock() throws InterruptedException {
        new DashboardPage().VerifyAmazonStock();
        new DashboardPage().CountStocks();
    }

    @And("User search multiple stocks under search tab")
    public void userSearchMultipleStocksUnderSearchTab() throws InterruptedException {
        new DashboardPage().EnterStockName("amz");
        new DashboardPage().SelectFilterCTA();
        new DashboardPage().SelectETF();
        new WatchlistPage().SelectapplyButton();
  //     new DashboardPage().SelectFilterCTA();
        //new DashboardPage().SelectEquity();
//        new WatchlistPage().SelectapplyButton();
        new DashboardPage().ClearSearchBar();
        new DashboardPage().EnterStockName("Amazon");
//        new WatchlistPage().SelectapplyButton();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User click on apply Button")
    public void userClickOnApplyButton() throws InterruptedException {
        new WatchlistPage().SelectapplyButton();
    }

    @And("User Selects the view all btn under recently viewed section")
    public void userSelectsTheViewAllBtnUnderRecentlyViewedSection() throws InterruptedException {
        new DashboardPage().SelectViewAll();
    }

    @And("User will add a stock into watchlist")
    public void userWillAddAStockIntoWatchlist() throws InterruptedException {
        new DashboardPage().AddStockIntoWatchlist();
        new DashboardPage().SelectWatchlist();
        new WatchlistPage().ClickOnSaveBtn();
//        new DashboardPage().AddStockIntoWatchlist();
//        new DashboardPage().SelectWatchlist();
//        new WatchlistPage().ClickOnSaveBtn();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User  search the Tesla stocks under US Stocks")
    public void userSearchTheTeslaStocksUnderUSStocks() throws InterruptedException {
        new DashboardPage().EnterStockName("TSLA");
    }

    @Then("User will see the Tesla Stock")
    public void userWillSeeTheTeslaStock() throws InterruptedException {
        new DashboardPage().VerifyTeslaStockAfterFilter();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }
    @And("User Select multi filter")
    public void userSelectMultiFilter() throws InterruptedException {
        new DashboardPage().ApplyMultiFilterforAmazon();
    }


    @And("User select Daily P and L section")
    public void userSelectDailyPAndLSection() throws InterruptedException {
        new DashboardPage().SelectDailyPAndL();
    }

    @When("User will see day p and l and return percentage")
    public void userWillSeeDayPAndLAndReturnPercentage() throws InterruptedException {
        new DashboardPage().VerifyReturnPercentage();
        new DashboardPage().VerifyReturnAmount();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User search for research")
    public void userSearchForResearch() throws InterruptedException {
        new DashboardPage().EnterResearchName("ETF");
    }

    @Then("User will verify the content of research Research tab")
    public void userWillVerifyTheContentOfResearchResearchTab() throws InterruptedException {
        new DashboardPage().VerifyResearchContent();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see all tabs along with recently viewed top picks and crafted list details")
    public void userShouldSeeAllTabsAlongWithRecentlyViewedTopPicksAndCraftedListDetails() throws InterruptedException {
       // new DashboardPage().VerifyAllVisibleSection();
        new DashboardPage().VerifyCountOfTopGainersStocks();
        basePage.AndroidBack();
        new DashboardPage().VerifyCountOfTopLosersStocks();
        basePage.AndroidBack();
//        new DashboardPage().VerifyCountOfUSYearLowTodayStocks();
//        basePage.AndroidBack();
//        new DashboardPage().VerifyCountOfUSYearHighTodayStocks();
//        basePage.AndroidBack();
        new DashboardPage().VerifyRecentlyViewedSection();
        basePage.AndroidBack();
        new DashboardPage().VerifyRecentlyViewedFromViewAllButton();
        basePage.AndroidBack();
        basePage.ClickOnCrossIcon();
        new DashboardPage().ClickOnTopPicksStock();
        basePage.AndroidBack();
        new DashboardPage().VerifyTopPicksFromViewAllButton();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @When("the user enters a stock name in the {string} search bar")
    public void theUserEntersAStockNameInTheSearchBar(String arg0) throws InterruptedException {
        new DashboardPage().EnterStockName("Apple");
    }

    @And("User click on the apple stock")
    public void userClickOnTheAppleStock() throws InterruptedException {
        new DashboardPage().ClickOnAppleStock();
    }

    @Then("the user should be navigated to the Stock Details page")
    public void theUserShouldBeNavigatedToTheStockDetailsPage() throws InterruptedException {
        new DashboardPage().VerifyStockDetailsPage();
        basePage.AndroidBack();
    }

    @And("the user selects the {string} tab")
    public void theUserSelectsTheTab(String arg0) throws InterruptedException {
        new DashboardPage().ClickOnMFTab();
    }

    @And("User clears the US Stocks search bar")
    public void userClearsTheUSStocksSearchBar() throws InterruptedException {
        new DashboardPage().ClearUSStockSearch();
    }

    @When("the user enters a mutual fund name in the {string} search bar")
    public void theUserEntersAMutualFundNameInTheSearchBar(String arg0) throws InterruptedException {
        new DashboardPage().EnterMFName("Nippon india growth fund");
    }

    @And("User click on the Fund name")
    public void userClickOnTheFundName() throws InterruptedException {
        new DashboardPage().ClickOnNipponMFFundName();
    }

    @Then("the user should be navigated to the Mutual Fund Details page")
    public void theUserShouldBeNavigatedToTheMutualFundDetailsPage() throws InterruptedException {
        new DashboardPage().ValidateMFDetailsPage();
        basePage.AndroidBack();
    }

    @And("User clears the MF search bar")
    public void userClearsTheMFSearchBar() throws InterruptedException {
        new DashboardPage().ClearMFSearchBar();
    }

    @When("the user enters a search term in the {string} search bar")
    public void theUserEntersASearchTermInTheSearchBar(String arg0) throws InterruptedException {
        new DashboardPage().EnterMFName("Tesla");
    }

    @Then("the user should be navigated to the News Details page")
    public void theUserShouldBeNavigatedToTheNewsDetailsPage() throws InterruptedException {
        new DashboardPage().NavigatedToTheNewsDetailsPage();
        basePage.AndroidBack();
    }

    @When("the user enter a search term in the {string} search bar")
    public void theUserEnterASearchTermInTheSearchBar(String arg0) throws InterruptedException {
        new DashboardPage().EnterMFName("Apple");
    }

    @Then("the user should be navigated to the Research Details page")
    public void theUserShouldBeNavigatedToTheResearchDetailsPage() throws InterruptedException {
        new DashboardPage().NavigatedToTheResearchDetailsPage();
        basePage.AndroidBack();
    }


    @And("User Select the Research Tab")
    public void userSelectTheResearchTab() throws InterruptedException {
        new DashboardPage().ClickOnResearchTab();
    }

    @And("User Select Equity option")
    public void userSelectEquityOption() throws InterruptedException {
        //new DashboardPage().SelectEquityOption();
        new DashboardPage(). SelectStockOption();
    }

    @And("User again click on filter CTA")
    public void userAgainClickOnFilterCTA() throws InterruptedException {
        new DashboardPage().SecondTimeFilterClick();
    }

    @And("User clears the applied filter")
    public void userClearsTheAppliedFilter() throws InterruptedException {
        new DashboardPage().ClearAppliedFilter();
    }

    @And("User Select one of the available option under Industry section")
    public void userSelectOneOfTheAvailableOptionUnderIndustrySection() throws InterruptedException {
        new DashboardPage().ClickOnIndustrySection();
        new DashboardPage().SelectOneOptionFromIndustrySection();
    }

    @And("User should be able to see the dashboard search page")
    public void userShouldBeAbleToSeeTheDashboardSearchPage() throws InterruptedException {
        new DashboardPage().VerifySearchPage();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("the user should be able to see our offerings sections along with popular and news section")
    public void theUserShouldBeAbleToSeeOurOfferingsSectionsAlongWithPopularAndNewsSection() {
        new DashboardPage().ValidateOurOfferingsSectionsAlongWithPopularAndNewsSection();
    }

    @And("the user should also be able to see popular funds start sip along with create goals section")
    public void theUserShouldAlsoBeAbleToSeePopularFundsStartSipAlongWithCreateGoalsSection() throws InterruptedException {
            basePage.ScrollDown(1);
            new DashboardPage().ValidatePopularFundsStartSipAlongWithCreateGoalsSection();
    }

    @And("the user should also be able to see year high today and top gainers")
    public void theUserShouldAlsoBeAbleToSeeYearHighTodayAndTopGainers() throws InterruptedException {
        basePage.ScrollDown(1);
            new DashboardPage().ValidateYearHighTodayAndTopGainers();
    }

    @And("the user should also be able to see top losers and research and perspectives section")
    public void theUserShouldAlsoBeAbleToSeeTopLosersAndResearchAndPerspectivesSection() throws InterruptedException {

        basePage.ScrollDown(1);
            new DashboardPage().ValidateTopLosersAndResearchAndPerspectivesSection();
            ClickProfileSettings();
            Logout();
    }
}



