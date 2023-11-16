package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;


public class TradesPage extends BasePage {
    BasePage basePage = new BasePage();

    @AndroidFindBy(xpath = "//*[@text='trade' and @class='android.widget.TextView']")
    WebElement TradeButton;

    @AndroidFindBy(xpath = "//*[@index='9' and @text='buy now']")
    WebElement BuyNowButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterSellAmount;
    @AndroidFindBy(xpath = "//*[@text='review order']")
    WebElement ReviewOrderButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement ReviewOrderAmount;

    @AndroidFindBy(xpath = "//*[@text='place order']")
    WebElement PlaceOrderButton;
    @AndroidFindBy(xpath = "//*[@text='₹2,000']")
    WebElement ValidateEnteredAmount;

    @AndroidFindBy(xpath = "//*[@text='Order Placed']")
    WebElement ValidateOrderPlaced;

    @AndroidFindBy(xpath = "//*[@text='go to dashboard']")
    private WebElement clickonViewDashboard;

    @AndroidFindBy(xpath = "//*[@text='LIVE MARKET']")
    WebElement MarketLiveLabel;

    @AndroidFindBy(xpath = "//*[@text='MARKET CLOSED']")
    WebElement MarketCloseLabel;

    @AndroidFindBy(xpath = "//*[@text='View investments']")
    WebElement ViewEnhancementButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement GetCurrentValue;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement GetCurrentOverallReturns;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[2]")
    WebElement GetTotalInvested;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup")
    WebElement StockName;

    @AndroidFindBy(xpath = "//*[@text='AMZN']")
    WebElement StockNameOnDetailsPage;

    @AndroidFindBy(xpath = "//*[@text='Transactions']")
    WebElement ValidateActivitiesPage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
    WebElement InvestedAmountOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
    WebElement StoreInvestedAmountOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]")
    WebElement CurrentValueOnDashboard;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]")
    WebElement StoreCurrentValueOnDashboard;


    @AndroidFindBy(xpath = "//*[contains(@text,'Transaction Limit')]")
    WebElement LowinBuyPowerErrorMessage;

    @AndroidFindBy(xpath = "//*[@text='Top picks']")
    WebElement TopPicksTab;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement BuyNowTopPicks;

    @AndroidFindBy(xpath = "//*[@text='Buy in Rupees']")
    WebElement SelectOrderType;

    @AndroidFindBy(xpath = "//*[@text='Sell in Rupees']")
    WebElement SelectOrderTypeSell;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[2]")
    WebElement SelectQuantityTypeOrder;
    @AndroidFindBy(xpath = "//*[@text='confirm selection']")
    WebElement ConfirmOrderType;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[1]")
    WebElement AddtoWatchlist;

    @AndroidFindBy(xpath = "//*[@text='Watchlist']")
    WebElement WatchlistTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    WebElement GetStockNameWatchListed;

    @AndroidFindBy(xpath = "//*[@text='Yes']")
    WebElement ConfirmRemovefromWatchlist;

    @AndroidFindBy(xpath = "//*[@text='Minimum Transaction Amount Should be 0.83 INR.']")
    WebElement MinimumTransactionErrorMsg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TextView")
    WebElement TransactionLimitErrorMsg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    WebElement PandLPercentage;

    @AndroidFindBy(xpath = "//*[@text='pro']")
    WebElement ProTab;

    @AndroidFindBy(xpath = "//*[@text='Limit']")
    WebElement OrderTypeDropdown;
    @AndroidFindBy(xpath = "//*[@text='confirm selection']")
    WebElement ConfirmProOrderType;

    @AndroidFindBy(xpath = "//*[@text='Limit Order']")
    WebElement LimitOrderType;

    @AndroidFindBy(xpath = "//*[@text='Stop Order']")
    WebElement StopOrderType;

    @AndroidFindBy(xpath = "//*[@text='Market If Touched(MIT) Order']")
    WebElement MITOrderType;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterQuantity;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement SetLimitPrice;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.RadioButton[1]")
    WebElement ExpireTillMarketDayClose;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.RadioButton[2]")
    WebElement GoodTillCancelled;



    @AndroidFindBy(xpath = "//*[@text='Select date']")
    WebElement SelectCustomExpiryDate;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView[2]")
    WebElement ValidateCustomExpiryDate;
    @AndroidFindBy(xpath = "//*[@text='OK']")
    WebElement ClickOK;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView[2]")
    WebElement ValidateOrderType;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView")
    WebElement ClickonVTStock;

    @AndroidFindBy(xpath = "//*[@text='sell']")
    WebElement SellButton;

    @AndroidFindBy(xpath = "//*[@text='Sell in Rupees']")
    WebElement SellTypeDropdown;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]")
    WebElement ValidateSellOrder;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterQuantitySell;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement SetLimitPriceSell;

    @AndroidFindBy(id = "com.appreciatewealth.android.uat:id/txvQty")
    WebElement GetQuantityInHoldings;

    @AndroidFindBy(xpath = "//*[@text='(-)']")
    WebElement GetMinusSignInHoldings;

    @AndroidFindBy(id = "com.appreciatewealth.android.uat:id/txvQty")
    WebElement GetHoldingsPostSell;

    @AndroidFindBy(xpath = "//*[@text='go to dashboard']")
    WebElement GoToTradeDashboard;
    @AndroidFindBy(xpath = "//*[@text='₹1.33']")
    WebElement ValidateAmountDecimals;

    @AndroidFindBy(xpath = "//*[@text='1.33333333']")
    WebElement ValidateQuantityDecimals;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    private WebElement CurrentPandL;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement GlobalSearchClick;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText" )
    private WebElement GlobalSearchEnter;

    @AndroidFindBy(xpath ="//*[@text='AAPL']")
    private WebElement ValidateSearchResults;


    @AndroidFindBy(xpath ="//*[@text='Activity']")
    private WebElement ActivityTab;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]")
    private WebElement CurrentInvestedActivityTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private static WebElement CurrentAmountActivity;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement EstimatedPrice;

    @AndroidFindBy(id ="com.appreciatewealth.android.uat:id/txvBuyingPowerValue")
    private WebElement GetBuyingPower;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement CloseSimBindingPopup;

    @AndroidFindBy(xpath = "//*[@text='Buying power']")
    private WebElement InfoBuyingPower;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement GetAmountHeld;

    @AndroidFindBy(xpath = "//*[@text='okay']")
    private WebElement ClickOkay;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[2]")
    private WebElement TradeAmountOnPreviewOrder;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private WebElement TradeQuantityPreviewOrder;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement TradeTotalFeePreviewOrder;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement TradeEstimatedTotalPreviewOrder;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private WebElement TradeQuantityOrderPlaced;

    @AndroidFindBy(xpath = "//*[@text='₹9.32']")
    private WebElement OrderAmountTransactions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[2]")
    private WebElement TradeQuantityTransactions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView")
    private WebElement SuccessFullStatusTransactions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement OrderTypeTransactions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[2]")
    private WebElement EstimatedOrderQuantity;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[2]")
    private WebElement EstimatedPriceOrderPlaced;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView")
    private WebElement CraftedListItem;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement CraftedListTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement CraftedStockAtFirst;

    private static String QuantityOnSellScreen;

    private static String QuantityOnPreviewScreen;

    private static String QuantityOnPlaceOrderScreen;

    private static String TradeQuantityTransactionScreen;

    private static String TradeAmountOnPreview;
    private static String TradeAmountOnPlaceOrder;

    private static String TradeAmountOnTransactionScreen;
    private static String GetEstimatedCreditAmount;

    private static String RunTimeInvestedAmountonDashboard;
    private static String RunTimeCurrentAmountonDashboard;
    private static String RunTimeInvestedAmountonPortfolio;
    private static String RunTimeurrentAmountonPortfolio;

    private String StocknameBeforeWatchlisting;
    private String StocknameAfterWatchlsiting;
    private String ActualPandL;



    private static String  CurrentHoldings;

    private static String  getCurrentAmountBeforeSell;
    private static String  getCurrentAmountAfterSell;
    private static String GetBuyingPowerBeforeBuy;
    private static String GetBuyingPowerAfterBuy;

    private static String GetAmountHeldBeforeBuy;
    private static String GetAmountHeldAfterBuy;

    private static String CraftedItemLabel;

    private static String StockNameOnPortfolio;
    SignInPage signInPage;

    public TradesPage() {
        this.signInPage = new SignInPage();
    }


    public void NavigatetoTradeDashboard() throws InterruptedException, IOException {
        Thread.sleep(2000);
        signInPage.Signin();
        Thread.sleep(2000);
        clickonViewDashboard.click();
        Thread.sleep(2000);
        TradeButton.click();

    }

    public void ClickonBuyNow() throws InterruptedException {

        WebElement clickonbuynow = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        driver.findElement(By.xpath("//*[@index='9' and @text='buy now']")).click();
        Thread.sleep(3000);

    }

    public void EnterTradeAmount(String amount) throws InterruptedException {
        Thread.sleep(5000);
        EnterAmount.click();
        Thread.sleep(5000);
        EnterAmount.sendKeys(amount);
        Thread.sleep(5000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void ClickReviewOrderButton() throws InterruptedException {
        Thread.sleep(3000);
        ReviewOrderButton.click();
    }

    public void ValidateOrderAmount(String finalAmount) throws InterruptedException {
        Thread.sleep(3000);
        String ActualAmount = ReviewOrderAmount.getText();
        Assert.assertEquals(ActualAmount, finalAmount);
    }

    public void ClickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(3000);
        PlaceOrderButton.click();
    }

    public void ValidateIfOrderPlaced() throws InterruptedException {
        Thread.sleep(3000);
        ValidateOrderPlaced.isDisplayed();

    }

    public void CheckMarketIfOpen() throws InterruptedException {

        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        LocalTime currentTimeIST = LocalTime.now(istZone);

        LocalTime startTime = LocalTime.of(19, 0); // 7:30 PM
        LocalTime endTime = LocalTime.of(1, 30);   // 2:30 AM the next day

        if (currentTimeIST.isAfter(startTime) || currentTimeIST.isBefore(endTime)) {
            System.out.println(" Market is open since the current time is between 7:30 PM and 2:30 AM in India.");
            Thread.sleep(3000);
            MarketLiveLabel.isDisplayed();
        } else {
            MarketCloseLabel.isDisplayed();
            System.out.println("Market is closed since the current time is not between 7:30 PM and 2:30 AM in India.");
        }


    }

    public void CalculateCurrentValue() {

        String OverallReturn = GetCurrentOverallReturns.getText();
        String OverallReturnwithoutCurrency = OverallReturn.replaceAll("[₹,]", "");
        double doubleoverallreturn = Double.parseDouble(OverallReturnwithoutCurrency);

        String Totalinvested = GetTotalInvested.getText();
        String OverallInvestedwithoutCurrency = Totalinvested.replaceAll("[₹,]", "");
        double doublefinalInvestment = Double.parseDouble(OverallInvestedwithoutCurrency);
        // int totalinvested = Integer.parseInt(Totalinvested);
        System.out.println("this is the total invested amount from app " + doublefinalInvestment);
        double Finalvalue = doublefinalInvestment - doubleoverallreturn;
        System.out.println("this is the total current value amount from app " + Finalvalue);
        //String ExpectedCurrentValue = String.valueOf(""+Finalvalue);

        String CurrentValuewithCurrency = GetCurrentValue.getText();
        String CurrentActualValue = CurrentValuewithCurrency.replaceAll("[₹,]", "");
        double CurrentValueindouble = Double.parseDouble(CurrentActualValue);
        Assert.assertEquals(CurrentValueindouble, Finalvalue);
    }

    public void ClickonViewEnhancements() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Portfolio\").instance(0))"));
        ViewEnhancementButton.click();
    }


    public void GetStockNameOnPortfolio() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 600,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));

            StockNameOnPortfolio = StockName.getText();
            System.out.println(StockNameOnPortfolio);
        }
    }

    public void ValidateStockLink() throws InterruptedException {

        Thread.sleep(5000);
        String geStocknameDetailsPage = StockNameOnDetailsPage.getText();
        Thread.sleep(5000);
        ValidateActivitiesPage.isDisplayed();
        //Assert.assertEquals(StockNameOnPortfolio, geStocknameDetailsPage);

    }

    public void ClickonStock() throws InterruptedException {
        Thread.sleep(5000);
        // GetStockNameOnPortfolio();
        StockName.click();
    }


   /* public void getInvestedandCurrentonDashboard() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        Thread.sleep(5000);
        RunTimeInvestedAmountonDashboard = InvestedAmountOnDashboard.getText();
        RunTimeCurrentAmountonDashboard = CurrentValueOnDashboard.getText();
    }*/

    public String getInvestedOnDashboard() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        Thread.sleep(5000);
        RunTimeInvestedAmountonDashboard = InvestedAmountOnDashboard.getText();
        return RunTimeInvestedAmountonDashboard;
    }

    public String getCurrentValueOnDashboard() throws InterruptedException {
        //Thread.sleep(2000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        Thread.sleep(5000);
        RunTimeCurrentAmountonDashboard = CurrentValueOnDashboard.getText();
        return RunTimeCurrentAmountonDashboard;
    }



    public String getInvestedOnPortfolio() throws InterruptedException {
        Thread.sleep(2000);
        RunTimeInvestedAmountonPortfolio = GetCurrentValue.getText();
        return RunTimeInvestedAmountonPortfolio;
    }

    public String getCurrentAmountOnPortfolio() throws InterruptedException {
        Thread.sleep(2000);
        RunTimeurrentAmountonPortfolio = GetTotalInvested.getText();
        return RunTimeurrentAmountonPortfolio;
    }



    public void CompareInvestedandCurrentValue() throws InterruptedException {
        System.out.println("On Dashboard Invested "+RunTimeInvestedAmountonDashboard);
        System.out.println("On Portfolio Invested  "+RunTimeInvestedAmountonPortfolio);
        System.out.println("On Dashboard current value "+RunTimeCurrentAmountonDashboard);
        System.out.println("On Portfolio current value "+RunTimeurrentAmountonPortfolio);

        Assert.assertEquals(RunTimeInvestedAmountonDashboard, RunTimeurrentAmountonPortfolio);
        Assert.assertEquals(RunTimeCurrentAmountonDashboard, RunTimeInvestedAmountonPortfolio);

    }

    public void CheckLowinBuyPowerMessage() throws InterruptedException {
        Thread.sleep(6000);
        LowinBuyPowerErrorMessage.isDisplayed();
        //String ActualerrMsg = LowinBuyPowerErrorMessage.getText();
        //Assert.assertEquals(ActualerrMsg, msg);
    }

    public void clickonTopPicks() {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Top picks\").instance(0))"));
        TopPicksTab.click();
    }

    public void clickonBuyStockinLeastPrice() throws InterruptedException {
        //WebElement clickonbuynow = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Hot stock\").instance(0))"));
        Thread.sleep(9000);
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 700,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));
            Thread.sleep(9000);
            BuyNowTopPicks.click();
        }
    }

    public void SelectOrderType() throws InterruptedException {
        Thread.sleep(2000);
        SelectOrderType.click();
        Thread.sleep(2000);
        SelectQuantityTypeOrder.click();
        ConfirmOrderType.click();
    }

    public void AddtoWatchlist() throws InterruptedException {
        Thread.sleep(5000);
        // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Hot stock\").instance(0))"));
        AddtoWatchlist.click();
    }

    public void GetStocknameBeforeWatchlisted() throws InterruptedException {
        Thread.sleep(5000);
        StocknameBeforeWatchlisting = GetStockNameWatchListed.getText();

    }

    public void GetStocknameAfterWatchlisted() throws InterruptedException {
        Thread.sleep(5000);
        StocknameAfterWatchlsiting = GetStockNameWatchListed.getText();
    }

    public void ClickonWatchlistTab() {
        WatchlistTab.click();
    }

    public void CheckIfWatchlisted() {
        Assert.assertEquals(StocknameBeforeWatchlisting, StocknameAfterWatchlsiting);

    }

    public void RemovefromWatchlist() throws InterruptedException {
        Thread.sleep(2000);
        AddtoWatchlist.click();
        ConfirmRemovefromWatchlist.click();
        Thread.sleep(2000);

    }

    public void CheckIfRemovedfromWatchlisted() throws InterruptedException {
        Thread.sleep(8000);
        List<WebElement> list = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]"));
        int count = list.size();
        System.out.println("count to check if element is deleted it should be zero " + count);
        Assert.assertEquals(count, 0);
        //basePage.Logout();

        //Assert.assertFalse(GetStockNameWatchListed.isDisplayed());

    }

    public void ValidateMinimumTransactionMsg(String msg) {
        String Actualmsg = MinimumTransactionErrorMsg.getText();
        Assert.assertEquals(Actualmsg, msg);
    }

    public void CalculateProfitandLossPercentage() throws InterruptedException {
        Thread.sleep(5000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\"))"));
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 600,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));
            Thread.sleep(5000);
            String OverallReturn = StoreCurrentValueOnDashboard.getText();
            String OverallReturnwithoutCurrency = OverallReturn.replaceAll("[₹,]", "");
            double doubleoverallreturn = Double.parseDouble(OverallReturnwithoutCurrency);

            String Totalinvested = StoreInvestedAmountOnDashboard.getText();
            String OverallInvestedwithoutCurrency = Totalinvested.replaceAll("[₹,]", "");
            double doublefinalInvestment = Double.parseDouble(OverallInvestedwithoutCurrency);
            //double Finalvalue = (doublefinalInvestment - doubleoverallreturn) / 100;
            double Finalvalue = (doubleoverallreturn - doublefinalInvestment) / doublefinalInvestment * 100;
            DecimalFormat df = new DecimalFormat("#.##");
            String formattedResult = df.format(Finalvalue);
            String Percentagechange;
            if (formattedResult.contains("-")) {
                String withoutminus = formattedResult.replaceAll("[-]", "");
                Percentagechange = " " + String.valueOf(withoutminus) + "%";
                System.out.println(Percentagechange);
            } else {
                Percentagechange = " " + String.valueOf(formattedResult) + "%";
                System.out.println(Percentagechange);
            }
            ActualPandL = PandLPercentage.getText();
            Assert.assertEquals(ActualPandL, Percentagechange);

            //System.out.println(Percentagechange);


        }

    }

    public void ValidateTransactionLimitMsg() throws InterruptedException {
        Thread.sleep(5000);
        TransactionLimitErrorMsg.isDisplayed();
        //String ActualMsg = TransactionLimitErrorMsg.getText();
        //Assert.assertEquals(ActualMsg, msg);

    }

    public void MinimizeApp() throws InterruptedException {
        Thread.sleep(2000);
        ((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(5));
    }

    public void ValidateErrorMessageRemoved() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("//*[@text='Minimum Transaction Amount Should be 0.85 INR.']"));
        int count = list.size();
        System.out.println("count to check if element is deleted it should be zero " + count);
        Assert.assertEquals(count, 0);
        basePage.AndroidBack();
        Thread.sleep(2000);
        //basePage.Logout();

    }

    public void ValidateEnteredAmount() throws InterruptedException {
        Thread.sleep(5000);
        ValidateEnteredAmount.isDisplayed();
    }

    public void SelectPro(){
        ProTab.click();
    }

    public void SelectProOrderType() throws InterruptedException {
        Thread.sleep(5000);
        OrderTypeDropdown.click();
        LimitOrderType.click();
        Thread.sleep(5000);
        ConfirmProOrderType.click();
    }

    public void SelectStopOrder() throws InterruptedException {
        Thread.sleep(5000);
        OrderTypeDropdown.click();
        StopOrderType.click();
        Thread.sleep(5000);
        ConfirmProOrderType.click();
    }
    public void SelectMITOrder() throws InterruptedException {
        Thread.sleep(2000);
        OrderTypeDropdown.click();
        MITOrderType.click();
        ConfirmProOrderType.click();
    }


    public void EnterQuantity(String Quantity) throws InterruptedException {
        Thread.sleep(2000);
        EnterQuantity.click();
        EnterQuantity.sendKeys(Quantity);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void EnterLimitPrice(String LimitPrice){
        SetLimitPrice.click();
        SetLimitPrice.sendKeys(LimitPrice);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }
    public void OrderExpirytillMarketClose(){

        ExpireTillMarketDayClose.click();
    }

    public void OrderExpirytillCancelled() throws InterruptedException {
        Thread.sleep(5000);
        GoodTillCancelled.click();
    }
    public void OrderExpiryCustom() throws InterruptedException {
        SelectCustomExpiryDate.click();
        Thread.sleep(5000);
        ClickOK.click();
    }

    public void ValidateOrderType(String EnterOrderType) throws InterruptedException {
        Thread.sleep(5000);
        ValidateIfOrderPlaced();
        Thread.sleep(5000);
        String ActualOrderType = ValidateOrderType.getText();
        Assert.assertEquals(ActualOrderType,EnterOrderType);
    }

    public void ClickOnSellStocks() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//*[@text='VT']")).click();
        /*driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));*/
        // WebElement clickonbuynow =

        //ClickonVTStock.click();
    }

    public void EnterSellAmount(String Amount) throws InterruptedException {
        Thread.sleep(3000);
        EnterSellAmount.click();
        EnterSellAmount.sendKeys(Amount);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }


    public void ClickOnSell() throws InterruptedException {
        Thread.sleep(3000);
        SellButton.click();
    }
    public void SelectSellType() throws InterruptedException {
        Thread.sleep(4000);
        SellTypeDropdown.click();
        Thread.sleep(2000);
        ConfirmOrderType.click();
    }

    public void ValidateSellOrderType(String OrderType) throws InterruptedException {
        Thread.sleep(3000);
        String ActualType = ValidateSellOrder.getText();
        Assert.assertEquals(ActualType,OrderType);

    }
    public void SelectSellTypeOrder() throws InterruptedException {
        SelectOrderTypeSell.click();
        Thread.sleep(2000);
        SelectQuantityTypeOrder.click();
        ConfirmOrderType.click();

    }

    public void EnterQuantitySell(String Quantity) throws InterruptedException {
        Thread.sleep(4000);
        EnterQuantitySell.click();
        EnterQuantitySell.sendKeys(Quantity);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void EnterLimitPriceSell(String Price){
        SetLimitPriceSell.click();
        SetLimitPriceSell.sendKeys(Price);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void GoToTradeDashboard() throws InterruptedException {
        Thread.sleep(5000);
        GoToTradeDashboard.click();

    }

    public void GetQuantityInHoldingsBeforeSell() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        Thread.sleep(5000);
        CurrentHoldings = GetQuantityInHoldings.getText();
        System.out.println("Current Holdings "+CurrentHoldings);

    }


    public void ValidateQuantityInHoldings() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        Thread.sleep(4000);
        String CurrentHoldingsAfterSell = GetQuantityInHoldings.getText();
        //System.out.println("holding after Sell "+CurrentHoldingsAfterSell);
        double ActualHoldings = Double.parseDouble(CurrentHoldingsAfterSell);
        System.out.println("holding after Sell "+ActualHoldings);
        double PostSellHoldings = Double.parseDouble(CurrentHoldings) - 1;
        Assert.assertEquals(ActualHoldings,PostSellHoldings);

    }

    public void ValidateMinusSign() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        Thread.sleep(4000);
        GetMinusSignInHoldings.isDisplayed();

    }
    public void ValidateAmountDecimals() throws InterruptedException {
        Assert.assertEquals(ValidateAmountDecimals.getText(),"₹1.33");
    }

    public void ValidateQuantityDecimals() throws InterruptedException {
        Thread.sleep(6000);
        String ActualText = ValidateQuantityDecimals.getText();
        Assert.assertEquals(ActualText,"1.33333333");

    }
    public void EnterTradeQuantityThroughKeyboard() throws InterruptedException {
        EnterAmount.click();
        Thread.sleep(2000);
        EnterAmount.sendKeys("1.");
        for (int i = 0; i < 9; i++) {
            ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        }
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public String CurrentPandLBeforeBuy() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Top picks\").instance(0))"));
        Thread.sleep(5000);
        return CurrentPandL.getText();

    }

    public String CurrentPandLAfterBuy(){
        return CurrentPandL.getText();
    }


    public String getCurrentInvestmentAfterBuy() throws InterruptedException {
        return InvestedAmountOnDashboard.getText();
    }

    public String GetCurrentInvestmentBeforeBuy() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        return InvestedAmountOnDashboard.getText();
    }

    public String GetCurrentAmountBeforeBuy(){
        return CurrentValueOnDashboard.getText();
    }
    public String GetCurrentAmountAfterBuy(){
        return CurrentValueOnDashboard.getText();
    }


    public void ComparePortfollioBeforeAndAfterBuy() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        Thread.sleep(5000);
        Assert.assertEquals(GetCurrentInvestmentBeforeBuy(),getCurrentInvestmentAfterBuy());
        System.out.println("CurrentInvestmentBeforeBuy "+GetCurrentInvestmentBeforeBuy());
        System.out.println("getCurrentInvestmentAfterBuy "+getCurrentInvestmentAfterBuy());
        Assert.assertEquals( GetCurrentAmountBeforeBuy(),GetCurrentAmountAfterBuy());
        System.out.println("GetCurrentAmountBeforeBuy "+GetCurrentInvestmentBeforeBuy());
        System.out.println("GetCurrentAmountAfterBuy "+GetCurrentAmountAfterBuy());
        Assert.assertEquals( CurrentPandLBeforeBuy(),CurrentPandLAfterBuy());
        System.out.println("CurrentPandLBeforeBuy "+CurrentPandLBeforeBuy());
        System.out.println("CurrentPandLAfterBuy "+CurrentPandLAfterBuy());

    }

    public void ClickOnGlobalSearch() throws InterruptedException {
        Thread.sleep(2000);
        GlobalSearchClick.click();
    }

    public void EnterInGlobalSearch(String StockName) throws InterruptedException {
        Thread.sleep(2000);
        GlobalSearchEnter.sendKeys(StockName);
    }

    public void ValidateGlobalSearchResults(){
        ValidateSearchResults.isDisplayed();
    }
    public  void ValidateOrderExpiryAsGoodTillCancelled() throws InterruptedException {
        Thread.sleep(3000);
        String ActualDate = ValidateCustomExpiryDate.getText();
        System.out.println("90 days after that "+FormattedDateWithAddedDays());
        Assert.assertEquals(ActualDate,FormattedDateWithAddedDays());

    }

    public void ValidateCustomExpiryDate() throws InterruptedException {
        Thread.sleep(3000);
        String ActualDate = ValidateCustomExpiryDate.getText();
        Assert.assertEquals(ActualDate,GetCurrentDate());

    }

    public void CloseSimBindingPopupTrade() throws InterruptedException {
        Thread.sleep(2000);
        CloseSimBindingPopup.click();

    }

    public void NavigateToActivityTab() throws InterruptedException {
        Thread.sleep(4000);
        ActivityTab.click();
    }
    public static void GetCurrentAmountBeforeSell() throws InterruptedException {
        Thread.sleep(4000);
        getCurrentAmountBeforeSell = CurrentAmountActivity.getText();
        System.out.println("1 " +getCurrentAmountBeforeSell);
    }

    public static void GetCurrentAmountAfterSell() throws InterruptedException {
        Thread.sleep(4000);
        getCurrentAmountAfterSell = CurrentAmountActivity.getText();
        System.out.println("2 "+getCurrentAmountAfterSell);
    }

    public void CalculateRemainingAmountPostSell() throws InterruptedException {
        Thread.sleep(5000);
        double Amount = Double.parseDouble(getCurrentAmountBeforeSell.replaceAll("[₹,]", ""));
        System.out.println("Amount Before Sell "+Amount);
        double value = 1013.26;
        double FinalAmount = Amount-value;
        System.out.println("Post Sell Amount "+FinalAmount);
        double ActualAmount = Double.parseDouble(getCurrentAmountAfterSell.replaceAll("[₹,]", ""));
        Assert.assertEquals(ActualAmount,FinalAmount);
    }

    public void GetCurrentBuyingPower() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Top picks\").instance(0))"));
        Thread.sleep(3000);
        GetBuyingPowerBeforeBuy =  GetBuyingPower.getText();
    }

    public void GetPostBuyingPower() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Top picks\").instance(0))"));
        Thread.sleep(3000);
        GetBuyingPowerAfterBuy =  GetBuyingPower.getText();
    }

    public void GetAmountHeldBeforeBuy() throws InterruptedException {
        InfoBuyingPower.click();
        Thread.sleep(3000);
        GetAmountHeldBeforeBuy =  GetAmountHeld.getText();
        ClickOkay.click();
    }

    public void GetAmountHeldAfterBuy() throws InterruptedException {
        InfoBuyingPower.click();
        Thread.sleep(3000);
        GetAmountHeldAfterBuy =  GetAmountHeld.getText();
        ClickOkay.click();
    }

    public void CompareBuyingPowerAndHeldAmount(){
        double BuyingPower = Double.parseDouble(GetBuyingPowerBeforeBuy.replace("₹", "")
                .replace(" K", "")
                .trim());
        System.out.println("Buying Power before buy: "+BuyingPower);

        double BuyingPowerPostBuy = BuyingPower-1;

        double BuyingPower2 = Double.parseDouble(GetBuyingPowerAfterBuy.replace("₹", "")
                .replace(" K", "")
                .trim());
        System.out.println("Buying Power post buy: "+BuyingPower2);

        double AmountHeld  = Double.parseDouble(GetAmountHeldBeforeBuy.replace("₹", "")
                .replace(" K", "")
                .trim());
        System.out.println("Buying Amount held before buy: "+AmountHeld);

        double AmountHeldPostBuy = AmountHeld+1;

        double AmountHeld2  = Double.parseDouble(GetAmountHeldAfterBuy.replace("₹", "")
                .replace(" K", "")
                .trim());
        System.out.println("Buying Amount held after buy: "+AmountHeld);

        Assert.assertEquals(BuyingPower2,BuyingPowerPostBuy);
        Assert.assertEquals(AmountHeld2,AmountHeldPostBuy);

    }


    public String GetQuantityEstimateOnPreview() throws InterruptedException {
        Thread.sleep(2000);
        QuantityOnSellScreen = EstimatedOrderQuantity.getText();
        System.out.println("Estimated Quantity on Sells Screen "+QuantityOnSellScreen);
        return QuantityOnSellScreen;
    }

    public void CheckOrderDetailsPreview() throws InterruptedException {
        Thread.sleep(2000);
        TradeAmountOnPreview = TradeAmountOnPreviewOrder.getText();
        System.out.println("Trade amount on preview screen "+TradeAmountOnPreview);
        QuantityOnPreviewScreen = TradeQuantityPreviewOrder.getText();
        System.out.println("Trade quantity on preview screen "+  QuantityOnPreviewScreen);
        Assert.assertEquals(TradeAmountOnPreview,"₹10");
        Assert.assertEquals(QuantityOnPreviewScreen,QuantityOnSellScreen);

    }

    public void CheckOrderDetailsPlaceOrder() throws InterruptedException {
        Thread.sleep(2000);
        QuantityOnPlaceOrderScreen = TradeQuantityOrderPlaced.getText();
        System.out.println("Trade quantity on order placed screen "+  QuantityOnPlaceOrderScreen);
        GetEstimatedCreditAmount =  EstimatedPriceOrderPlaced.getText();
        System.out.println("Estimated amount on placed order screen "+  GetEstimatedCreditAmount);
        Assert.assertEquals(QuantityOnPlaceOrderScreen,QuantityOnPreviewScreen);
    }

    public void CheckOrderDetailsActivityTab() throws InterruptedException {
        Thread.sleep(2000);
        String  ActualMsg = SuccessFullStatusTransactions.getText();
        Assert.assertEquals(ActualMsg,"Successful");
        String ActualAmount = OrderAmountTransactions.getText();
        System.out.println("Actual amount on transaction screen " +ActualAmount);
        Assert.assertEquals(ActualAmount,GetEstimatedCreditAmount);
        String ActualQuantity = TradeQuantityTransactions.getText();
        System.out.println("Actual quantity on transaction screen " +ActualQuantity);
        Assert.assertEquals(ActualQuantity,QuantityOnPlaceOrderScreen);
        String status = OrderTypeTransactions.getText();
        Assert.assertEquals(status,"SELL-MARKET");


    }
    public void GetCraftedStockName() throws InterruptedException {
        Thread.sleep(2000);
        CraftedItemLabel = CraftedListItem.getText();
        System.out.println(CraftedItemLabel);
    }
    public void ClickOnCraftedList(){
        CraftedListItem.click();
    }

    public void ValidateCraftedTitleScreen() throws InterruptedException {
        Thread.sleep(5000);
        String Title = CraftedListTitle.getText();
        Assert.assertEquals(Title,CraftedItemLabel);
        Thread.sleep(5000);
        BuyNowButton.isDisplayed();



    }



}