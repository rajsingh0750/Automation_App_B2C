package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.WatchlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class WatchlistSteps extends BasePage {
    BasePage basePage = new BasePage();

    @And("User Selects the watchlist section on home dashboard")
    public void user_selects_the_watchlist_section_on_home_dashboard() throws InterruptedException {
        new WatchlistPage().SelectWatchlistTab();
    }

    @And("User Selects the add stock Button under a watchlist")
    public void user_selects_the_add_stock_button_under_a_watchlist() throws InterruptedException {
        new WatchlistPage().SelectAddStockButton();
    }

    @And("User click on heart icon to add this stock into watchlist")
    public void user_click_on_heart_icon_to_add_this_stock_into_watchlist() throws InterruptedException {
        new WatchlistPage().SelectStockHeartIcon();
        basePage.AndroidBack();
    }

    @And("User should see a message {string}")
    public void user_should_see_a_message(String string) throws InterruptedException {
        new WatchlistPage().VerifySuccessMsg("Added to watch lists successfully");
    }

    @When("User will come to watchlist page")
    public void user_will_come_to_watchlist_page() throws InterruptedException {
        new WatchlistPage().VerifyWatchlistPage();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @Then("User will see the stock has been added to their selected watchlist")
    public void user_will_see_the_stock_has_been_added_to_their_selected_watchlist() throws InterruptedException {
        new WatchlistPage().VerifyStockName();
        new WatchlistPage().RemoveStock();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User enter the stock name")
    public void userEnterTheStockName() throws InterruptedException {
        new WatchlistPage().EnterStockName("AAPY");

    }

    @And("User Selects the search tab on dashboard")
    public void userSelectsTheSearchTabOnDashboard() throws InterruptedException {
        new WatchlistPage().SelectSearchTabOnDashboard();
    }

    @And("User enters the stock name under search page")
    public void userEntersTheStockNameUnderSearchPage() throws InterruptedException {
        new WatchlistPage().EnterStockNameUnderSearchPage("AAPL");
    }

    @When("User select the heart icon")
    public void userSelectTheHeartIcon() throws InterruptedException {
        new WatchlistPage().SelectHeartIcon();
    }

    @Then("Bottom sheet opens up with a list of all watchlists ever created")
    public void bottomSheetOpensUpWithAListOfAllWatchlistsEverCreated() throws InterruptedException {
        new WatchlistPage().VerifyWatchlistsBotoomSheet();
    }

    @And("User Selects their desired watchlist")
    public void userSelectsTheirDesiredWatchlist() throws InterruptedException {
        new WatchlistPage().SelectWatchlistfromBotoomSheet();
    }

    @And("User click on save Button")
    public void userClickOnSaveButton() throws InterruptedException {
        new WatchlistPage().SelectSaveButton();
    }

    @Then("User will see the stock")
    public void userWillSeeTheStock() throws InterruptedException {
        new WatchlistPage().VerifyStockNames();
       // new WatchlistPage().RemoveAAPDStock();
      //  new WatchlistPage().VerifyRemoveToast();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User will go to Search and add to watchlist Page")
    public void userWillGoToSearchAndAddToWatchlistPage() throws InterruptedException {
        new WatchlistPage().SelectSearchAndAddToWatchlistPage();
    }

    @And("User click on heart icon for another stock")
    public void userClickOnHeartIconForAnotherStock() throws InterruptedException {
        new WatchlistPage().SelectHeartIconForAnotherStock();
    }

    @And("User Selects multiple watchlists for same stock")
    public void userSelectsMultipleWatchlistsForSameStock() throws InterruptedException {
        new WatchlistPage().SelectSelectsMultipleWatchlistsForSameStock1();
        new WatchlistPage().SelectSelectsMultipleWatchlistsForSameStock2();
    }

//    @And("User will verify all the watchlist Names")
//    public void userWillVerifyAllTheWatchlistNames() throws InterruptedException {
//        new WatchlistPage().VerifyWatchlistNames();
//    }

    @And("User Selects one watchlist")
    public void userSelectsOneWatchlist() throws InterruptedException {
        new WatchlistPage().SelectsOneWatchlist();
    }

    @And("User will verify stocks under that watchlist")
    public void userWillVerifyStocksUnderThatWatchlist() throws InterruptedException {
        new WatchlistPage().VerifyStocksUnderThatWatchlist();
    }

    @And("User Selects view all Button")
    public void userSelectsViewAllButton() throws InterruptedException {
        new WatchlistPage().SelectViewAllButton();
    }

    @And("User click on edit Button")
    public void userClickOnEditButton() throws InterruptedException {
        new WatchlistPage().SelectEditButton();
    }

    @And("User will click on delete Button")
    public void userWillClickOnDeleteButton() throws InterruptedException {
        new WatchlistPage().SelectDeleteButton();
    }

    @When("User will click on yes Button")
    public void userWillClickOnYesButton() throws InterruptedException {
        new WatchlistPage().SelectYesButton();
    }

    @Then("the watchlist will be deleted")
    public void theWatchlistWillBeDeleted() throws InterruptedException {
       // new WatchlistPage().VerifyDeletedWatchlistToast();
        new WatchlistPage().VerifyDeletedWatchlist();
//        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User will change the watchlist name")
    public void userWillChangeTheWatchlistName() throws InterruptedException {
        new WatchlistPage().EditWatchlistNameAsBefore();
    }


    @And("User see the updated watchlist name")
    public void userSeeTheUpdatedWatchlistName() {
        new WatchlistPage().VerifyUpdatedWatchlistName();
    }



    @Then("User will see an error message {string}")
    public void userWillSeeAnErrorMessage(String arg0) throws InterruptedException {
        new WatchlistPage().VerifyErrorMessage("New watchlist name is required");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @Then("User will see an  error messages {string}")
    public void userWillSeeAnErrorMessages(String arg0) throws InterruptedException {
        new WatchlistPage().VerifyErrorMessage2("No results for ' '");
        basePage.AndroidBack();
        basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @When("User will go to Top Picks section and click on view all Button")
    public void userWillGoToTopPicksSectionAndClickOnViewAllButton() throws InterruptedException {
        new WatchlistPage().GotoTopPicksFund();
    }

    @Then("User will verify the count of Top picks Stocks")
    public void userWillVerifyTheCountOfTopPicksStocks() throws InterruptedException {
        new WatchlistPage().VerifyCountOfTopPicksStocks();
        basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User Selects the create Button")
    public void userSelectsTheCreateButton() throws InterruptedException {
        new WatchlistPage().SelectCreateButton();
    }

    @When("User try to enters the special characters for watchlist name")
    public void userTryToEntersTheSpecialCharactersForWatchlistName() throws InterruptedException {
        new WatchlistPage().EnterSpecialCharactersForWatchlistName("@#$()");
    }


    @Then("User will see a error message {string}")
    public void userWillSeeAErrorMessage(String arg0) throws InterruptedException {
        new WatchlistPage().VerifySpecialCharacterErrorMessage("Please enter watchlist name");
//        basePage.ClickProfileSettings();
//        basePage.Logout();

    }

    @And("User Selects Sort Button under watchlist page")
    public void userSelectsSortButtonUnderWatchlistPage() throws InterruptedException {
        new WatchlistPage().SelectSortButton();
    }

    @And("User Selects Current Price option under sort by")
    public void userSelectsCurrentPriceOptionUnderSortBy() throws InterruptedException {
        new WatchlistPage().SelectCurrentPriceOption();
    }

    @And("User click on Apply Button")
    public void userClickOnApplyButton() throws InterruptedException {
        new WatchlistPage().SelectapplyButton();
        //new WatchlistPage().VerifyCountOfTopPicksStocks();
//        basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User Selects Day change percentage option under sort by")
    public void userSelectsDayChangePercentageOptionUnderSortBy() throws InterruptedException {
        new WatchlistPage().SelectDayChangePercentageOption();
    }

    @And("User Selects Company \\(A-Z) option under sort by")
    public void userSelectsCompanyAZOptionUnderSortBy() throws InterruptedException {
        new WatchlistPage().SelectCompanyAZOption();
    }

    @And("User Selects the Stock")
    public void userSelectsTheStock() throws InterruptedException {
        new WatchlistPage().SelectStock();
    }

    @And("User enters the watchlist name")
    public void userEntersTheWatchlistName() throws InterruptedException {
        new WatchlistPage().EntersTheWatchlistName("test");

    }

    @And("User will go to previous page")
    public void userWillGoToPreviousPage() throws InterruptedException {
        basePage.AndroidBack();
    }

    @And("User will edit the watchlist name")
    public void userWillEditTheWatchlistName() throws InterruptedException {
        new WatchlistPage().EditTheWatchlistName();
    }

    @Then("User will see a message {string}")
    public void userWillSeeAMessage(String arg0) throws InterruptedException {
        new WatchlistPage().VerifyEditWatchlistSuccessMsg();
        basePage.AndroidBack();

    }

    @And("User Selects the search tab on dashboard IOS")
    public void userSelectsTheSearchTabOnDashboardIOS() throws IOException, InterruptedException {
        new WatchlistPage().SelectSearchTabOnDashboard();

    }

    @And("User enter the watchlist name")
    public void userEnterTheWatchlistName() throws InterruptedException {
        new WatchlistPage().EntersTheWatchlistName("Testing");
    }

    @Then("User will  see an error message as {string}")
    public void userWillSeeAnErrorMessageAs(String arg0) throws InterruptedException {
        new WatchlistPage().VerifyWatchlistNameError("This name is taken, try another watchlist name");
        new WatchlistPage().ClickOnCrossIcon();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enter the watchlist name as Amazon")
    public void userEnterTheWatchlistNameAsAmazon() throws InterruptedException {
        new WatchlistPage().EntersTheWatchlistName("Amazon");
    }

    @And("User will update the watchlist name as {string}")
    public void userWillUpdateTheWatchlistNameAs(String arg0) throws InterruptedException {
        new WatchlistPage().EditWatchlistName("Amazon1234");
    }

    @And("User Selects the create Button under watchlist pop up")
    public void userSelectsTheCreateButtonUnderWatchlistPopUp() throws InterruptedException {
        new WatchlistPage().SelectcreateButton();
    }

    @When("User click on save Button under Edit watchlist page")
    public void userClickOnSaveButtonUnderEditWatchlistPage() throws InterruptedException {
        new WatchlistPage().SelectEditWatchlistSaveButton();
    }

    @When("User will come back to watchlist page")
    public void userWillComeBackToWatchlistPage() throws InterruptedException {
//        new WatchlistPage().ComeToWatchlistPage();
        basePage.AndroidBack();
    }

    @Then("User should see the created watchlist")
    public void userShouldSeeTheCreatedWatchlist() throws InterruptedException {
        new WatchlistPage().VerifyCreatedWatchlist();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User click on add Button")
    public void userClickOnAddButton() throws InterruptedException {
        new WatchlistPage().SelectaddBtn();
    }

    @Then("User should see a toast message after adding as {string}")
    public void userShouldSeeAToastMessageAfterAddingAs(String arg0) throws InterruptedException {
        new WatchlistPage().VerifyingAddingWatchlistToast();
//        basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User will enter the Stock name under search and add page")
    public void userWillEnterTheStockNameUnderSearchAndAddPage() throws InterruptedException {
        new WatchlistPage().EnterStockNameUnderSearchAndAddPage("TSLA");
    }

    @When("User enters the empty stock name")
    public void userEntersTheEmptyStockName() throws InterruptedException {
        new WatchlistPage().EnterStockNameUnderSearchAndAddPage(" ");
    }

    @When("User click on heart icon of stock under popular stocks")
    public void userClickOnHeartIconOfStockUnderPopularStocks() throws InterruptedException {
        new WatchlistPage().ClickOnPopularStockHeartIcon();
    }

    @And("User select the created watchlist option")
    public void userSelectTheCreatedWatchlistOption() throws InterruptedException {
        new WatchlistPage().SelectCreatedWatchlist();
    }

    @And("User should able to see the stock under watchlist section")
    public void userShouldAbleToSeeTheStockUnderWatchlistSection() throws InterruptedException {
        new WatchlistPage().VerifyStockFromPopularStocks();
    }

    @And("User click on save Button under manage watchlist sheet")
    public void userClickOnSaveButtonUnderManageWatchlistSheet() throws InterruptedException {
        new WatchlistPage().ClickOnSaveBtn();
    }

    @And("User enter the same watchlist name")
    public void userEnterTheSameWatchlistName() throws InterruptedException {
        new WatchlistPage().EnterWatchlistNameAgain("Testing");
    }

    @And("User will come to home dashboard")
    public void userWillComeToHomeDashboard() throws InterruptedException {
        basePage.AndroidBack();
    }

    @And("User will remove the stock from watchlist from popular stocks")
    public void userWillRemoveTheStockFromWatchlistFromPopularStocks() throws InterruptedException {
        new WatchlistPage().RemoveFromPopularStocks();
    }

    @Then("User should see stock has been removed from watchlist")
    public void userShouldSeeStockHasBeenRemovedFromWatchlist() throws InterruptedException {
        new WatchlistPage().VerifyStockRemoveUnderWatchlist();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User click on heart icon of stock under year high today")
    public void userClickOnHeartIconOfStockUnderYearHighToday() throws InterruptedException {
        new WatchlistPage().ClickOnYearHighTodayStockHeartIcon();
    }


    @And("User should able to see the year high today stock under watchlist section")
    public void userShouldAbleToSeeTheYearHighTodayStockUnderWatchlistSection() throws InterruptedException {
        new WatchlistPage().VerifyStockFromYearHighTodayStocks();
    }

    @And("User will remove the stock from watchlist from year high today section")
    public void userWillRemoveTheStockFromWatchlistFromYearHighTodaySection() throws InterruptedException {
        new WatchlistPage().RemoveFromYearHighTodayStocks();
    }


    @When("User click on heart icon of stock under Top Gainer section")
    public void userClickOnHeartIconOfStockUnderTopGainerSection() throws InterruptedException {
        new WatchlistPage().ClickOnTopGainerStockHeartIcon();
    }

    @And("User should able to see the top gainer stock under watchlist section")
    public void userShouldAbleToSeeTheTopGainerStockUnderWatchlistSection() throws InterruptedException {
        new WatchlistPage().VerifyStockFromTopGainer();
    }

    @And("User will remove the stock from watchlist top gainer section")
    public void userWillRemoveTheStockFromWatchlistTopGainerSection() throws InterruptedException {
        new WatchlistPage().RemoveFromTopGainers();
    }

    @When("User click on heart icon of stock under Top Losers section")
    public void userClickOnHeartIconOfStockUnderTopLosersSection() throws InterruptedException {
        new WatchlistPage().ClickOnTopLosersStockHeartIcon();
    }

    @And("User will remove the stock from watchlist top losers section")
    public void userWillRemoveTheStockFromWatchlistTopLosersSection() throws InterruptedException {
        new WatchlistPage().RemoveFromTopLosers();
    }

    @And("User should able to see the top losers stock under watchlist section")
    public void userShouldAbleToSeeTheTopLosersStockUnderWatchlistSection() throws InterruptedException {
        new WatchlistPage().VerifyStockFromTopGainer();
    }


    @And("User click on heart icon under recently viewed section")
    public void userClickOnHeartIconUnderRecentlyViewedSection() throws InterruptedException {
        new WatchlistPage().ClickOnRecentlyViewedHeartIcon();
    }

    @And("User will be log out")
    public void userWillBeLogOut() throws InterruptedException {
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see a toast messages after adding as {string}")
    public void userShouldSeeAToastMessagesAfterAddingAs(String arg0) throws InterruptedException {
        new WatchlistPage().VerifyingAddingWatchlistToast();
        basePage.AndroidBack();
        basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
    }

    @And("User Selects the tesla Stock")
    public void userSelectsTheTeslaStock() throws InterruptedException {
        new WatchlistPage().SelectTeslaStock();
    }

    @And("User click on cross icon")
    public void userClickOnCrossIcon() throws InterruptedException {
        new WatchlistPage().ClickOnCrossIcon();

    }

    @And("User Select view all Button")
    public void userSelectViewAllButton() throws InterruptedException {
        new WatchlistPage().SelectSecondViewAllButton();
    }

    @And("User enter the stock name under search page")
    public void userEnterTheStockNameUnderSearchPage() throws InterruptedException {
        new WatchlistPage().EnterStockNameUnderSearchPage("UAVS");
    }

    @And("User click on the heart icon of displayed stock")
    public void userClickOnTheHeartIconOfDisplayedStock() throws InterruptedException {
        new WatchlistPage().ClickOnTheHeartIcon();
    }

    @And("User click on the create new watchlist cta")
    public void userClickOnTheCreateNewWatchlistCta() throws InterruptedException {
        new WatchlistPage().ClickOnTheCreateNewWatchlistCta();
    }

    @And("User enters a new watchlist name")
    public void userEntersANewWatchlistName() throws InterruptedException {
        new WatchlistPage().EnterWatchlistNameAgain("New");
    }

    @And("User uncheck the created watchlist")
    public void userUncheckTheCreatedWatchlist() throws InterruptedException {
        new WatchlistPage().UncheckTheNewWatchlist();
    }

    @And("User clear the search bar under US Stocks")
    public void userClearTheSearchBarUnderUSStocks() throws InterruptedException {
        new WatchlistPage().ClearSearchBar();
    }

    @And("User click on the heart icon of listed stock under recently viewed section")
    public void userClickOnTheHeartIconOfListedStockUnderRecentlyViewedSection() throws InterruptedException {
        new WatchlistPage().ClickOnTheHeartIconOfListedStockUnderRecentlyViewedSection();
    }

    @And("User click on created watchlist")
    public void userClickOnCreatedWatchlist() throws InterruptedException {
        new WatchlistPage().ClickOnCreatedWatchlist();
    }

    @Then("User should see the newly created watchlist")
    public void userShouldSeeTheNewlyCreatedWatchlist() throws InterruptedException {
        new WatchlistPage().ValidateNewlyCreatedWatchlist();
    }
}
