package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.TradesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class TradesSteps {


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
    }

    @Given("User enters the amount")
    public void user_enters_the_amount() throws InterruptedException {
        new TradesPage().EnterTradeAmount("2000");
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
    }

    //End of Scenario: User with sufficient buying power should be able to buy stocks

    @Then("User should see market live label")
    public void userShouldSeeMarketLiveLabel() throws InterruptedException {
        Thread.sleep(3000);
        new TradesPage().CheckMarketIfOpen();
    }

    @And("User clicks on View Enhancements")
    public void userClicksOnViewEnhancements() throws InterruptedException {

        new TradesPage().ClickonViewEnhancements();

    }

    @Then("User should see Holdings with accurate data")
    public void userShouldSeeHoldingsWithAccurateData() throws InterruptedException {
        Thread.sleep(3000);
        new TradesPage().CalculateCurrentValue();
    }

    @And("User clicks on Stock name")
    public void userClicksOnStockName() throws InterruptedException {
        new TradesPage().ClickonStock();


    }

    @Then("User should see the stock details of the respective stock")
    public void userShouldSeeTheStockDetailsOfTheRespectiveStock() throws InterruptedException {
        new TradesPage().ValidateStockLink();
    }

    @And("User sees invested amount and current value on Trade dashboard")
    public void userSeesInvestedAmountAndCurrentValueOnTradeDashboard() throws InterruptedException {
        new TradesPage().getInvestedandCurrentonDashboard();

    }

    @Then("Investment and Current Value on Portfolio should match with the Trade Dashboard")
    public void investmentCurrentValueOnPortfolioShouldMatchWithTheTradeDashboard() throws InterruptedException {
        Thread.sleep(3000);
        new  TradesPage().getInvestedandCurrentonPortfolio();
        new TradesPage().CompareInvestedandCurrentValue();
    }

    @And("User enter amount more than buying power")
    public void userEnterAmountMoreThanBuyingPower() throws InterruptedException {
        new TradesPage().EnterTradeAmount("100000");

    }

    @Then("User should see the following error message {string}")
    public void userShouldSeeTheFollowingErrorMessage(String msg) {
        new TradesPage().CheckLowinBuyPowerMessage("Low funds! Add money to your YES Bank A/C and transfer to your buying power \n" +
                "read more here");

    }


    @And("User click on Buy stocks for one of the stock under Top picks")
    public void userClickOnBuyStocksForOneOfTheStockUnderTopPicks() throws InterruptedException {
        new TradesPage().clickonTopPicks();
        new TradesPage().clickonBuyStockinLeastPrice();

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
        new TradesPage().GetStocknameBeforeWatchlisted();
    }

    @Then("User should see the same stocks under Watchlist")
    public void userShouldSeeTheSameStocksUnderWatchlist() throws InterruptedException {
        new TradesPage().ClickonWatchlistTab();
        new TradesPage().GetStocknameAfterWatchlisted();
        new TradesPage().CheckIfWatchlisted();
        new TradesPage().RemovefromWatchlist();

    }

    @And("User clicks on watchlist icon from Watchlist screen")
    public void userClicksOnWatchlistIconFromWatchlistScreen() throws InterruptedException {
        new TradesPage().ClickonWatchlistTab();
        new TradesPage().RemovefromWatchlist();

    }

    @Then("User should not see the stock under Watchlist")
    public void userShouldNotSeeTheStockUnderWatchlsit() throws InterruptedException {
        new TradesPage().CheckIfRemovedfromWatchlisted();
    }

    @And("User enters the amount less than the required limit")
    public void userEntersTheAmountLessThanTheRequiredLimit() throws InterruptedException {
        new TradesPage().EnterTradeAmount("0.83");

    }

    @Then("User shouldbe prompted with error message {string}")
    public void userShouldbePromptedWithErrorMessage(String arg0) {
        new TradesPage().ValidateMinimumTransactionMsg("Minimum Transaction Amount Should be 0.84 INR.");
    }
}


