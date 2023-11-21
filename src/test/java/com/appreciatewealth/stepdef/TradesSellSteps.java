package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.TradesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class TradesSellSteps extends BasePage {
    BasePage basePage = new BasePage();

    @Given("User clicks on Stock")
    public void user_clicks_on_stock() throws InterruptedException {
        new TradesPage().ClickOnSellStocks();

    }

    @And("User clicks on Sell")
    public void user_clicks_on_sell() throws InterruptedException {
        new TradesPage().ClickOnSell();
        //ƒnew TradesPage().CloseSimBindingPopupTrade();
    }

    @And("User selects order type as Sell in Rupees")
    public void user_selects_order_type_as_sell_in_rupees() throws InterruptedException {
        new TradesPage().SelectSellType();
    }

    @And("User enters the amount for sell")
    public void userEntersTheAmountForSell() throws InterruptedException {
        new TradesPage().EnterSellAmount("8");
    }

    @Then("the sell order should be placed successfully")
    public void the_sell_order_should_be_placed_successfully() throws InterruptedException {
        new TradesPage().ValidateSellOrderType(" Market");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();



    }


    @And("User selects order type as Sell in Quantity")
    public void userSelectsOrderTypeAsSellInQuantity() throws InterruptedException {
        new TradesPage().SelectSellTypeOrder();

    }

    @And("User enters the Quantity for sell")
    public void userEntersTheQuantityForSell() throws InterruptedException {
        new TradesPage().EnterSellAmount("0.1");


    }

    @Then("the sell order of quantity type should be placed successfully")
    public void theSellOrderOfQuantityTypeShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateSellOrderType(" Market");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User enters the Sell Quantity")
    public void userEntersTheSellQuantity() throws InterruptedException {
        new TradesPage().EnterQuantitySell("1");

    }

    @And("User enters the Sell Limit Price")
    public void userEntersTheSellLimitPrice() {
        new TradesPage().EnterLimitPriceSell("10000");

    }

    @Then("Limit order in sell should be placed Successfully")
    public void limitOrderInSellShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateOrderType(" Limit");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }



    @Then("Stop order in sell should be placed Successfully")
    public void stopOrderInSellShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateOrderType("Stop Order");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @Then("MIT order in sell should be placed Successfully")
    public void mitOrderInSellShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateOrderType(" Market If Touched(MIT)");
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User checks the current holdings and clicks on Stock")
    public void userChecksTheCurrentHoldingsAndClicksOnStock() throws InterruptedException {
        new TradesPage().GetQuantityInHoldingsBeforeSell();
        new TradesPage().ClickOnSellStocks();

    }
    @And("User enters the Quantity to sell")
    public void userEntersTheQuantityToSell() throws InterruptedException {
        new TradesPage().EnterSellAmount("0.1");
    }

    @And("User Clicks on Go to home dashboard")
    public void userClicksOnGoToHomeDashboard() throws InterruptedException {
        new TradesPage().GoToTradeDashboard();
    }

    @Then("Quantity in Holdings should decrease and minus sign should display")
    public void quantityInHoldingsShouldDecreaseAndMinusSignShouldDisplay() throws InterruptedException {
        // new TradesPage().ValidateMinusSign();

        new TradesPage().ValidateQuantityInHoldings();
        //basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }


    @And("User navigates to Activity tab and notice the Current Amount")
    public void userNavigatesToActivityTabAndNoticeTheCurrentAmount() throws InterruptedException {
        new TradesPage().NavigateToActivityTab();
         TradesPage.GetCurrentAmountBeforeSell();
    }

    @And("User enters the amount for sell order")
    public void userEntersTheAmountForSellOrder() throws InterruptedException {
        new TradesPage().EnterSellAmount("1000");
    }


    @Then("Current Amount on Activity should be decreased by equivalent to sold amount of the stock")
    public void currentAmountOnActivityShouldBeDecreasedByEquivalentToSoldAmountOfTheStock() throws InterruptedException {
        new TradesPage().NavigateToActivityTab();
        TradesPage.GetCurrentAmountAfterSell();
        new TradesPage().CalculateRemainingAmountPostSell();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();

    }

    @And("User enters the amount for sell and notices the estimated quantity as per the entered amount")
    public void userEntersTheAmountForSellAndNoticesTheEstimatedQuantityAsPerTheEnteredAmount() throws InterruptedException {
        new TradesPage().EnterSellAmount("10");
        new TradesPage().GetQuantityEstimateOnPreview();


    }

    @And("User notices the Order Quantity, Trade amount")
    public void userNoticesTheOrderQuantityTradeAmount() throws InterruptedException {
        new TradesPage().CheckOrderDetailsPreview();
    }

    @And("User notices the Order Quantity and Estimated Price")
    public void userNoticesTheOrderQuantityAndEstimatedPrice() throws InterruptedException {
        new TradesPage().CheckOrderDetailsPlaceOrder();
    }


    @And("User navigates to Activity tab")
    public void userNavigatesToActivityTab() throws InterruptedException {
        new TradesPage().NavigateToActivityTab();
    }

    @Then("Order status should be Successfull with correct details")
    public void orderStatusShouldBeSuccessfullWithCorrectDetails() throws InterruptedException {
        new TradesPage().CheckOrderDetailsActivityTab();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("the Order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() throws InterruptedException {
        new TradesPage().ValidateIfOrderPlaced();
    }

    @Then("current P and L, Current Investment and Current Amount should not change when the order is placed in Market close")
    public void currentPAndLCurrentInvestmentAndCurrentAmountShouldNotChangeWhenTheOrderIsPlacedInMarketClose() throws InterruptedException {
        new TradesPage().GoToTradeDashboard();
        new TradesPage().ComparePortfollioBeforeAndAfterBuy();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }
}
