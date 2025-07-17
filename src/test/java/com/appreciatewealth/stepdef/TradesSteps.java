package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.TradesPage;
import com.appreciatewealth.pages.WatchlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class TradesSteps extends BasePage{
    BasePage basePage = new BasePage();


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
        new TradesPage().VerifyUSStocks();
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
      //  basePage.AndroidBack();
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
        //basePage.AndroidBack();
        //basePage.AndroidBack();
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
        //basePage.AndroidBack();
        //basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User sees invested amount and current value on Trade dashboard")
    public void userSeesInvestedAmountAndCurrentValueOnTradeDashboard() throws InterruptedException {
//        new TradesPage().getInvestedOnDashboard();
//        new TradesPage().getCurrentValueOnDashboard();
        new TradesPage().getAllValueOfUSStocksInAllTab();

    }

    @Then("Investment and Current Value on Portfolio should match with the Trade Dashboard")
    public void investmentCurrentValueOnPortfolioShouldMatchWithTheTradeDashboard() throws InterruptedException {
//        new TradesPage().getInvestedOnPortfolio();
//        new TradesPage().getCurrentAmountOnPortfolio();
        new TradesPage().GetAllUSValueAtUSStocksTab();
//        new TradesPage().CompareInvestedandCurrentValue();
        //basePage.AndroidBack();
        //basePage.AndroidBack();
        new TradesPage().CompareALLTabUSStocksValuesWithUSStocksTabValues();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enter amount more than buying power")
    public void userEnterAmountMoreThanBuyingPower() throws InterruptedException {
        new TradesPage().EnterTradeAmount("99999999");

    }

    @Then("User should see the following error message Low funds! Add money to your YES Bank AC and transfer to your buying power read more here")
    public void userShouldSeeTheFollowingErrorMessage() throws InterruptedException {
        new TradesPage().CheckLowinBuyPowerMessage();
        basePage.AndroidBack();
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

        new TradesPage().EnterQuantity("1");
    }

    @And("User clicks on Top picks tab")
    public void userClicksOnTopPicksTab() {
        new TradesPage().clickonTopPicks();

    }

    @And("User clicks on watchlist icon for one of the stock")
    public void userClicksOnWatchlistIconForOneOfTheStock() throws InterruptedException {
        new TradesPage().AddtoWatchlist();
        new TradesPage().GetStocknameBeforeWatchlisted();
    }

    @Then("User should see the same stocks under Watchlist")
    public void userShouldSeeTheSameStocksUnderWatchlist() throws InterruptedException {
        new TradesPage().ClickonWatchlistTab();
        new TradesPage().GetStocknameAfterWatchlisted();
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
        new TradesPage().EnterTradeAmount("0.0001");

    }

    @Then("User should be prompted with error message Minimum Transaction Amount Should be 0.85 INR.")
    public void userShouldbePromptedWithErrorMessage() throws InterruptedException {
        new TradesPage().ValidateMinimumTransactionMsg("Minimum Transaction Amount Should be greater than ₹0.87 INR");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see percentage change of P&L based on the Current Investment and Overall returns")
    public void userShouldSeePercentageChangeOfPLBasedOnTheCurrentInvestmentAndOverallReturns() throws InterruptedException {
        new TradesPage().CalculateProfitandLossPercentage();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the maximum quantity limit")
    public void userEntersTheMaximumQuantityLimit() throws InterruptedException {
        new TradesPage().EnterQuantity("1000");
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
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User clicks on Pro button")
    public void userClicksOnProButton() throws InterruptedException {
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
        //new TradesPage().ClickReviewOrderButton();
        //new TradesPage().ClickPlaceOrderButton();
    }

    @Then("Limit order should be placed Successfully")
    public void limitOrderShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateOrderType("Limit");
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
        new TradesPage().ValidateOrderType("Stop");
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
        new TradesPage().ValidateOrderType("Market If Touched(MIT)");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the amount in three or more decimal place")
    public void userEntersTheAmountInThreeOrMoreDecimalPlace() throws InterruptedException {
        new TradesPage().EnterTradeAmount("6.88888");
    }

    @Then("Amount field should ignore the decimals after two place")
    public void amountFieldShouldIgnoreTheDecimalsAfterTwoPlace() throws InterruptedException {
        new TradesPage().ValidateAmountDecimals();
//        basePage.AndroidBack();
//        basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();
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
        new TradesPage().GoToTradeDashboard();
        new TradesPage().ComparePortfollioBeforeAndAfterBuy();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Given("User opens the global search")
    public void userOpensTheGlobalSearch() throws InterruptedException, IOException {
        new TradesPage().ClickOnGlobalSearch();

    }

    @And("User enters the stock name")
    public void userEntersTheStockName() throws InterruptedException {
        new TradesPage().EnterInGlobalSearch("UAVS");

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
       // new TradesPage().ClickReviewOrderButton();
//        new TradesPage().ValidateOrderExpiryAsGoodTillCancelled();
//        new TradesPage().ClickPlaceOrderButton();
    }


    @And("User selects Stop order expiry as Good till Cancelled")
    public void userSelectsStopOrderExpiryAsGoodTillCancelled() throws InterruptedException {
        new TradesPage().OrderExpirytillCancelled();
        new TradesPage().ClickReviewOrderButton();
//        new TradesPage().ValidateOrderExpiryAsGoodTillCancelled();
//        new TradesPage().ClickPlaceOrderButton();
    }

    @And("User selects MIT order expiry as Good till Cancelled")
    public void userSelectsMITOrderExpiryAsGoodTillCancelled() throws InterruptedException {
        new TradesPage().OrderExpirytillCancelled();
        new TradesPage().ClickReviewOrderButton();
//        new TradesPage().ValidateOrderExpiryAsGoodTillCancelled();
//        new TradesPage().ClickPlaceOrderButton();
    }

    @And("User selects Limit order expiry as Custom Date")
    public void userSelectsLimitOrderExpiryAsCustomDate() throws InterruptedException {
        new TradesPage().OrderExpiryCustom();
       // new TradesPage().ClickReviewOrderButton();
//        new TradesPage().ValidateCustomExpiryDate();
        //new TradesPage().ClickPlaceOrderButton();

    }

    @And("User selects Stop order expiry as Custom Date")
    public void userSelectsStopOrderExpiryAsCustomDate() throws InterruptedException {
        new TradesPage().OrderExpiryCustom();
        new TradesPage().ClickReviewOrderButton();
//        new TradesPage().ValidateCustomExpiryDate();
        //new TradesPage().ClickPlaceOrderButton();

    }

    @And("User selects MIT order expiry as Custom Date")
    public void userSelectsMITOrderExpiryAsCustomDate() throws InterruptedException {
        new TradesPage().OrderExpiryCustom();
        new TradesPage().ClickReviewOrderButton();
//        new TradesPage().ValidateCustomExpiryDate();
        //new TradesPage().ClickPlaceOrderButton();
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
        new TradesPage().EnterTradeAmount("1");
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
        new TradesPage().ClickOnCraftedListTitle();
        new TradesPage().ValidateCraftedTitleScreen();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @Then("User should see the following message Transaction Limit")
    public void userShouldSeeTheFollowingMessageTransactionLimit() throws InterruptedException {
        new TradesPage().ValidateTransactionLimitMsg();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User clicks on Set time in force")
    public void userClicksOnSetTimeInForce() {
        new TradesPage().SelectTimeInForce();

    }

    @And("User enters the Pro type order Quantity")
    public void userEntersTheProTypeOrderQuantity() throws InterruptedException {
        new TradesPage().EnterProOrderQty("1");
    }

    @And("User enters min trade amount")
    public void userEntersMinTradeAmount() throws InterruptedException {
        new TradesPage().EnterTradeAmount("1");
    }

    @When("User clicks on View Details CTA under Cashback Invites")
    public void userClicksOnViewDetailsCTAUnderCashbackInvites() throws InterruptedException {
        new TradesPage().ClickOnViewDetails();

    }

    @Then("User should see Invites you sent, Invites you received and close button")
    public void userShouldSeeInvitesYouSentInvitesYouReceivedAndCloseButton() throws InterruptedException {
        new TradesPage().ValidateCashbackScreen();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("The user clicks on the view all CTA")
    public void theUserClicksOnTheViewAllCTA() throws InterruptedException {
        new TradesPage().ClickOnViewAllNews();
    }

    @Then("The user should see the list of news cards")
    public void theUserShouldSeeTheListOfNewsCards() throws InterruptedException {
        new TradesPage().ValidateNewsSection();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @When("User scrolls right in the news section")
    public void userScrollsRightInTheNewsSection() throws InterruptedException {
        new TradesPage().SwipeRightNewsSection();
    }

    @And("User clicks on News Card")
    public void userClicksOnNewsCard() {
        new TradesPage().ClickOnNewsCard();
    }

    @Then("It should open the news details screen")
    public void itShouldOpenTheNewsDetailsScreen() throws InterruptedException {
        new TradesPage().ValidateNewsDetails();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @When("the user clicks on the view all CTA in Research")
    public void theUserClicksOnTheViewAllCTAInResearch() throws InterruptedException {
        new TradesPage().ClickOnResearch();
    }

    @Then("the user should see the list of Research & Perspectives card's")
    public void theUserShouldSeeTheListOfResearchPerspectivesCardS() throws InterruptedException {
        new TradesPage().ValidateResearchList();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @When("User scrolls right in the Research section")
    public void userScrollsRightInTheResearchSection() throws InterruptedException {
        new TradesPage().SwipeRightResearchSection();
    }


    @And("User clicks on Research Card")
    public void userClicksOnResearchCard() throws InterruptedException {
        new TradesPage().ClickOnResearchCard();
    }


    @Then("It should open the Research details screen")
    public void itShouldOpenTheResearchDetailsScreen() throws InterruptedException {
        //new TradesPage().ValidateResearchDetails();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }
    @And("User Slides to Buy")
    public void userSlidesToBuy() throws InterruptedException {
        new TradesPage().SliderForBuy();
    }




    @And("User Selects on US stocks")
    public void userSelectsOnUSStocks() throws InterruptedException {
        new TradesPage().ClickUSStocks();
    }



    @And("User Selects the All Option")
    public void userSelectsTheAllOption() throws InterruptedException {
        new TradesPage().SelectAll();
    }
    @And("User click on the Stock")
    public void userClickOnTheStock() throws InterruptedException {
        new TradesPage().SelectStock();

    }

    @And("User clicks on the Portfolio US stocks")
    public void userClicksOnThePortfolioUSStocks() throws InterruptedException {
        new TradesPage().SelectPortFolioTab();
    }

    @And("User must select stock name")
    public void userMustSelectStockName() throws InterruptedException {
        new TradesPage().ClickOnStockDetails();

    }

    @And("User Selects on US stock tab")
    public void userSelectsOnUSStockTab() throws InterruptedException {
        new TradesPage().SelectUSStockTab();
    }

    @Given("the user is on Appreciate App's Dashboard on IOS")
    public void theUserIsOnAppreciateAppSDashboardOnIOS() {
        
    }

    @And("User clicks on Buy now for a stock IOS")
    public void userClicksOnBuyNowForAStockIOS() throws InterruptedException {
        new TradesPage().ClickonBuyNow();
        
    }

    @Then("the order should be placed successfully in IOS")
    public void theOrderShouldBePlacedSuccessfullyInIOS() {

    }

    @Given("User is on Trade dashboard IOS")
    public void userIsOnTradeDashboardIOS() throws IOException, InterruptedException {
        new TradesPage().VerifyUSStocksIOS();
    }





    @And("User click on the Stock IOS")
    public void userClickOnTheStockIOS() throws InterruptedException {
        new TradesPage().SelectStock();
    }

    @And("User click on view in order history")
    public void userClickOnViewInOrderHistory() throws InterruptedException {
        new TradesPage().ClickOnViewInOrderHistory();
    }

    @Then("the user should see the total order amount equals the order amount plus the fees")
    public void theUserShouldSeeTheTotalOrderAmountEqualsTheOrderAmountPlusTheFees() throws InterruptedException {
        basePage.ValidateTotalOrderAmount();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User cancel the order")
    public void userCancelTheOrder() throws InterruptedException {
        new TradesPage().ClickOnCancleOrderCTA();
    }

    @And("User select yes button for cancel confirmation")
    public void userSelectYesButtonForCancelConfirmation() throws InterruptedException {
        new TradesPage().ClickOnYesButton();
    }

    @Then("User will see the {string} tag under order details page")
    public void userWillSeeTheTagUnderOrderDetailsPage(String arg0) throws InterruptedException {
        new TradesPage().VeifyCancleTag();
    }

    @And("User come to minimodule page")
    public void userComeToMinimodulePage() throws InterruptedException {
        basePage.AndroidBack();
        new TradesPage().ClickOnGotoDashboard();
        basePage.ClickProfileSettings();
        new TradesPage().SelectTransactions();

    }

    @And("User will see {string} tag under all transactions page")
    public void userWillSeeTagUnderAllTransactionsPage(String arg0) throws InterruptedException {
        new TradesPage().VerifyCancleTagUnderTransactionPage();
    }

    @And("User will go to order details of the cancelled transaction")
    public void userWillGoToOrderDetailsOfTheCancelledTransaction() throws InterruptedException {
        new TradesPage().GoToOrderDetails();
    }

    @Then("User should see the {string} tag under order details page also")
    public void userShouldSeeTheTagUnderOrderDetailsPageAlso(String arg0) throws InterruptedException {
        new TradesPage().VerifyCancelledTagUnderOrderDetailsPage("CANCELLED");
    }

    @And("User should also see {string} tag under transaction status")
    public void userShouldAlsoSeeTagUnderTransactionStatus(String arg0) throws InterruptedException {
       // new TradesPage().VerifyCancelledTagUnderTransactionStatus();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @When("User come back to home dashboard")
    public void userComeBackToHomeDashboard() throws InterruptedException {
        //new TradesPage().ComeBackToHomeDashboard();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.AndroidBack();
    }

    @Then("User should see the resume buying event at home dashboard")
    public void userShouldSeeTheResumeBuyingEventAtHomeDashboard() throws InterruptedException {
        new TradesPage().VerifyContinueToLeft();
    }

    @And("User click on Buy now cta under continue where left section")
    public void userClickOnBuyNowCtaUnderContinueWhereLeftSection() throws InterruptedException {
        new TradesPage().ClickOnBuyNowCtaUnderContinueWhereLeftSection();
    }

    @And("User selects order expiry as Good till market day closed")
    public void userSelectsOrderExpiryAsGoodTillMarketDayClosed() throws InterruptedException {
        new TradesPage().SelectOrderExpiryAsGoodTillMarketDayClosed();
    }
}