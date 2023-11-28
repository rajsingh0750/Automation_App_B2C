package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.DashboardPage;
import com.appreciatewealth.pages.SignInPage;
import com.appreciatewealth.pages.TradesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class TradesSteps extends BasePage{
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();
    DashboardPage dashboardPage = new DashboardPage();

    // Start of Scenario: Once the ETB user in onboarded successfully the user should be prompted with Buying Power sticky


    /*@Given("the user on home dashboard")
    public void the_user_on_home_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user should be prompted with {string} sticky to add funds for buying power from YES Bank")
    public void the_user_should_be_prompted_with_sticky_to_add_funds_for_buying_power_from_yes_bank(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/

    // End of Scenario: Once the ETB user in onboarded successfully the user should be prompted with Buying Power sticky

    //Start of Scenario: User with sufficient buying power should be able to buy stocks

    @Given("User is on Trade dashboard")
    public void user_is_on_trade_dashboard() throws IOException, InterruptedException {
        new TradesPage().NavigatetoTradeDashboard();
    }

    @Given("User clicks on Buy now for a stock")
    public void user_clicks_on_buy_now_for_a_stock() throws InterruptedException {
        new TradesPage().ClickonBuyNow();
        //new TradesPage().CloseSimBindingPopupTrade();
    }

    @Given("User enters the amount")
    public void user_enters_the_amount() throws InterruptedException {
        new TradesPage().EnterTradeAmount("1");
    }

    @Given("User clicks on review order button")
    public void user_clicks_on_review_order_button() throws InterruptedException {
        new TradesPage().ClickReviewOrderButton();
    }

    @Given("User clicks on place order")
    public void user_clicks_on_place_order() throws InterruptedException {
        new TradesPage().ClickPlaceOrderButton();
    }

    @Then("the order should be placed successfully")
    public void the_order_should_be_placed_successfully() throws InterruptedException {
        new TradesPage().ValidateIfOrderPlaced();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    //End of Scenario: User with sufficient buying power should be able to buy stocks

    @Then("User should see market live label")
    public void userShouldSeeMarketLiveLabel() throws InterruptedException {
        Thread.sleep(3000);
        new TradesPage().CheckMarketIfOpen();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User clicks on View Enhancements")
    public void userClicksOnViewEnhancements() throws InterruptedException {
        new TradesPage().ClickonViewEnhancements();

    }

    @Then("User should see Holdings with accurate data")
    public void userShouldSeeHoldingsWithAccurateData() throws InterruptedException {
        Thread.sleep(5000);
        new TradesPage().CalculateCurrentValue();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User clicks on Stock name")
    public void userClicksOnStockName() throws InterruptedException {
        new TradesPage().ClickonStock();


    }

    @Then("User should see the stock details of the respective stock")
    public void userShouldSeeTheStockDetailsOfTheRespectiveStock() throws InterruptedException {
        new TradesPage().ValidateStockLink();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User sees invested amount and current value on Trade dashboard")
    public void userSeesInvestedAmountAndCurrentValueOnTradeDashboard() throws InterruptedException {
        new TradesPage().getInvestedOnDashboard();
        new TradesPage().getCurrentValueOnDashboard();

    }

    @Then("Investment and Current Value on Portfolio should match with the Trade Dashboard")
    public void investmentCurrentValueOnPortfolioShouldMatchWithTheTradeDashboard() throws InterruptedException {
        Thread.sleep(5000);
        new TradesPage().getInvestedOnPortfolio();
        new TradesPage().getCurrentAmountOnPortfolio();
        new TradesPage().CompareInvestedandCurrentValue();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enter amount more than buying power")
    public void userEnterAmountMoreThanBuyingPower() throws InterruptedException {
        new TradesPage().EnterTradeAmount("100000");

    }

    @Then("User should see the following error message Low funds! Add money to your YES Bank AC and transfer to your buying power read more here")
    public void userShouldSeeTheFollowingErrorMessage() throws InterruptedException {
        new TradesPage().CheckLowinBuyPowerMessage();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }


    @And("User click on Buy stocks for one of the stock under Top picks")
    public void userClickOnBuyStocksForOneOfTheStockUnderTopPicks() throws InterruptedException {
        new TradesPage().clickonTopPicks();
        new TradesPage().clickonBuyStockinLeastPrice();
        //new TradesPage().CloseSimBindingPopupTrade();

    }

    @And("User selects the order type as Quantity")
    public void userSelectsTheOrderTypeAsQuantity() throws InterruptedException {
        new TradesPage().SelectOrderType();

    }

    @And("User enters the quantity of the stock")
    public void userEntersTheQuantityOfTheStock() throws InterruptedException {

        new TradesPage().EnterTradeAmount("1");
    }

    @And("User clicks on Top picks tab")
    public void userClicksOnTopPicksTab() {
        new TradesPage().clickonTopPicks();

    }

    @And("User clicks on watchlist icon for one of the stock")
    public void userClicksOnWatchlistIconForOneOfTheStock() throws InterruptedException {
        new TradesPage().AddtoWatchlist();



    }

    @Then("User should see the same stocks under Watchlist")
    public void userShouldSeeTheSameStocksUnderWatchlist() throws InterruptedException {
        //new TradesPage().GetStocknameBeforeWatchlisted();
        new TradesPage().ClickonWatchlistTab();
        //new TradesPage().GetStocknameAfterWatchlisted();
        new TradesPage().CheckIfWatchlisted();
        new TradesPage().RemovefromWatchlist();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User clicks on watchlist icon from Watchlist screen")
    public void userClicksOnWatchlistIconFromWatchlistScreen() throws InterruptedException {
        new TradesPage().ClickonWatchlistTab();
        new TradesPage().RemovefromWatchlist();

    }

    @Then("User should not see the stock under Watchlist")
    public void userShouldNotSeeTheStockUnderWatchlsit() throws InterruptedException {
        new TradesPage().CheckIfRemovedfromWatchlisted();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User enters the amount less than the required limit")
    public void userEntersTheAmountLessThanTheRequiredLimit() throws InterruptedException {
        new TradesPage().EnterTradeAmount("0.83");

    }

    @Then("User should be prompted with error message Minimum Transaction Amount Should be {string} INR.")
    public void userShouldbePromptedWithErrorMessage(String arg0) throws InterruptedException {
        new TradesPage().ValidateMinimumTransactionMsg("Minimum Transaction Amount Should be 0.83 INR.");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see percentage change of P&L based on the Current Investment and Overall returns")
    public void userShouldSeePercentageChangeOfPLBasedOnTheCurrentInvestmentAndOverallReturns() throws InterruptedException {
        new TradesPage().CalculateProfitandLossPercentage();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the maximum quantity limit")
    public void userEntersTheMaximumQuantityLimit() throws InterruptedException {
        new TradesPage().EnterTradeAmount("1000000");
    }

    @Then("User should see the following message Transaction Limit")
    public void userShouldSeeTheFollowingMessage() throws InterruptedException {
        new TradesPage().ValidateTransactionLimitMsg();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User minimizes the app and again switch to Appreciate app")
    public void userMinimizesTheAppAndAgainSwitchToAppreciateApp() throws InterruptedException {
        new TradesPage().MinimizeApp();
    }

    @Then("the error message should be removed")
    public void theErrorMessageShouldBeRemoved() throws InterruptedException {
        new TradesPage().ValidateErrorMessageRemoved();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("the entered value should be retained")
    public void theEnteredValueShouldBeRetained() throws InterruptedException {
        new TradesPage().ValidateEnteredAmount();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User clicks on Pro button")
    public void userClicksOnProButton() {
        new TradesPage().SelectPro();
    }


    @And("User selects order type as limit order")
    public void userSelectsOrderTypeAsLimitOrder() throws InterruptedException {
        new TradesPage().SelectProOrderType();
    }


    @And("User enters the Quantity")
    public void userEntersTheQuantity() throws InterruptedException {
        new TradesPage().EnterQuantity("1");
    }

    @And("User enters the limit price")
    public void userEntersTheLimitPrice() throws InterruptedException {
        new TradesPage().EnterLimitPrice("1");
    }

    @And("User selects order expiry as Till Market is closed")
    public void userSelectsOrderExpiryAsTillMarketIsClosed() throws InterruptedException {
        new TradesPage().OrderExpirytillMarketClose();
        new TradesPage().ClickReviewOrderButton();
        new TradesPage().ClickPlaceOrderButton();
    }

    @Then("Limit order should be placed Successfully")
    public void limitOrderShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateOrderType(" Limit");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @And("User selects order type as Stop order")
    public void userSelectsOrderTypeAsStopOrder() throws InterruptedException {
        new TradesPage().SelectStopOrder();
    }


    @Then("Stop order should be placed Successfully")
    public void stopOrderShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateOrderType(" Stop Order");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User selects order type as MIT order")
    public void userSelectsOrderTypeAsMITOrder() throws InterruptedException {
        new TradesPage().SelectMITOrder();
    }

    @Then("MIT order should be placed Successfully")
    public void mitOrderShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateOrderType(" Market If Touched(MIT)");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the amount in three or more decimal place")
    public void userEntersTheAmountInThreeOrMoreDecimalPlace() throws InterruptedException {
        new TradesPage().EnterTradeAmount("1.333");
    }

    @Then("Amount field should ignore the decimals after two place")
    public void amountFieldShouldIgnoreTheDecimalsAfterTwoPlace() throws InterruptedException {
        new TradesPage().ValidateAmountDecimals();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @And("User enters the quantity in nine or more decimal place")
    public void userEntersTheQuantityInNineOrMoreDecimalPlace() throws InterruptedException {
        new TradesPage().EnterTradeQuantityThroughKeyboard();
    }

    @Then("Amount field should ignore the decimals after eight place")
    public void amountFieldShouldIgnoreTheDecimalsAfterEightPlace() throws InterruptedException {
        new TradesPage().ValidateQuantityDecimals();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }


    @And("User notices the Current P and L, Current Investment and Current Amount")
    public void userNoticesTheCurrentPAndLCurrentInvestmentAndCurrentAmount() throws InterruptedException {
        new TradesPage().CurrentPandLBeforeBuy();
        new TradesPage().GetCurrentInvestmentBeforeBuy();
        new TradesPage().GetCurrentAmountBeforeBuy();

    }

    @Then("Current P and L, Current Investment and Current Amount should not change when the order is placed in Market close")
    public void currentPAndLCurrentInvestmentAndCurrentAmountShouldNotChangeWhenTheOrderIsPlacedInMarketClose() throws InterruptedException {
        //new TradesPage().GoToTradeDashboard();
        new TradesPage().ComparePortfollioBeforeAndAfterBuy();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User opens the global search")
    public void userOpensTheGlobalSearch() throws InterruptedException {
        new TradesPage().ClickOnGlobalSearch();

    }

    @And("User enters the stock name")
    public void userEntersTheStockName() throws InterruptedException {
        new TradesPage().EnterInGlobalSearch("AAPL");

    }

    @Then("User should see the relevant Search results")
    public void userShouldSeeTheRelevantSearchResults() throws InterruptedException {
        new TradesPage().ValidateGlobalSearchResults();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @And("User selects Limit order expiry as Good till Cancelled")
    public void userSelectsLimitOrderExpiryAsGoodTillCancelled() throws InterruptedException {
        new TradesPage().OrderExpirytillCancelled();
        new TradesPage().ClickReviewOrderButton();
        new TradesPage().ValidateOrderExpiryAsGoodTillCancelled();
        new TradesPage().ClickPlaceOrderButton();
    }


    @And("User selects Stop order expiry as Good till Cancelled")
    public void userSelectsStopOrderExpiryAsGoodTillCancelled() throws InterruptedException {
        new TradesPage().OrderExpirytillCancelled();
        new TradesPage().ClickReviewOrderButton();
        new TradesPage().ValidateOrderExpiryAsGoodTillCancelled();
        new TradesPage().ClickPlaceOrderButton();
    }

    @And("User selects MIT order expiry as Good till Cancelled")
    public void userSelectsMITOrderExpiryAsGoodTillCancelled() throws InterruptedException {
        new TradesPage().OrderExpirytillCancelled();
        new TradesPage().ClickReviewOrderButton();
        new TradesPage().ValidateOrderExpiryAsGoodTillCancelled();
        new TradesPage().ClickPlaceOrderButton();
    }

    @And("User selects Limit order expiry as Custom Date")
    public void userSelectsLimitOrderExpiryAsCustomDate() throws InterruptedException {
        new TradesPage().OrderExpiryCustom();
        new TradesPage().ClickReviewOrderButton();
        new TradesPage().ValidateCustomExpiryDate();
        new TradesPage().ClickPlaceOrderButton();

    }

    @And("User selects Stop order expiry as Custom Date")
    public void userSelectsStopOrderExpiryAsCustomDate() throws InterruptedException {
        new TradesPage().OrderExpiryCustom();
        new TradesPage().ClickReviewOrderButton();
        new TradesPage().ValidateCustomExpiryDate();
        new TradesPage().ClickPlaceOrderButton();

    }

    @And("User selects MIT order expiry as Custom Date")
    public void userSelectsMITOrderExpiryAsCustomDate() throws InterruptedException {
        new TradesPage().OrderExpiryCustom();
        new TradesPage().ClickReviewOrderButton();
        new TradesPage().ValidateCustomExpiryDate();
        new TradesPage().ClickPlaceOrderButton();
    }

    @And("User clicks on Stock name and notices the stock name")
    public void userClicksOnStockNameAndNoticesTheStockName() throws InterruptedException {
        new TradesPage().GetStockNameOnPortfolio();
        new TradesPage().ClickonStock();

    }

    @And("User notices the current buying power before buy")
    public void userNoticesTheCurrentBuyingPowerBeforeBuy() throws InterruptedException {
        new TradesPage().GetCurrentBuyingPower();
    }

    @And("User notices the current money in held before buy")
    public void userNoticesTheCurrentMoneyInHeldBeforeBuy() throws InterruptedException {
        new TradesPage().GetAmountHeldBeforeBuy();
    }

    @And("User enters the trade amount")
    public void userEntersTheTradeAmount() throws InterruptedException {
        new TradesPage().EnterTradeAmount("1000");
    }


    @And("User notices the current buying power after buy")
    public void userNoticesTheCurrentBuyingPowerAfterBuy() throws InterruptedException {
        new TradesPage().GetPostBuyingPower();
    }


    @And("User notices the current money in held after buy")
    public void userNoticesTheCurrentMoneyInHeldAfterBuy() throws InterruptedException {
        new TradesPage().GetAmountHeldAfterBuy();
    }

    @Then("the order amount should be be deducted from the Buying Power and added up to Amount Hold")
    public void theOrderAmountShouldBeBeDeductedFromTheBuyingPowerAndAddedUpToAmountHold() {
        new TradesPage().CompareBuyingPowerAndHeldAmount();

    }

    @And("User clicks an item from crafted list")
    public void userClicksAnItemFromCraftedList() throws InterruptedException {
        new TradesPage().GetCraftedStockName();
        new TradesPage().ClickOnCraftedList();
    }


    @Then("crafted list should get loaded")
    public void craftedListShouldGetLoaded() throws InterruptedException {
        new TradesPage().ValidateCraftedTitleScreen();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }


    @Given("User is on the Trade dashboard")
    public void userIsOnTheTradeDashboard() throws InterruptedException, IOException {
        signInPage.DynamicSignIn("Varsha.thandav@ppreciate.com");
        dashboardPage.ClickOnGoToDashboard();
        new TradesPage().DynamicTradeDashboard();
    }
}



