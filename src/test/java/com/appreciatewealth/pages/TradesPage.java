package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.AssertJUnit.assertEquals;


public class TradesPage extends BasePage {
    BasePage basePage = new BasePage();

    @AndroidFindBy(accessibility = "Portfolio\n" +
            "Tab 2 of 5")

    @iOSXCUITFindBy(accessibility = "Portfolio\n" +
            "Tab 2 of 4")
    WebElement TradeButton;


    @AndroidFindBy(id = "btnBuy")
    WebElement BuyNowButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Amount\"]/android.widget.EditText")
    WebElement EnterAmount;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Amount\"]/android.widget.EditText")
    WebElement EnterAmountValue;


    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, '₹')]")
    WebElement EnteredAmt;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    WebElement GetQuantity;


    @AndroidFindBy(accessibility = "Total Fee")
    WebElement Total_Fee_Heading;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Platform Fee') and contains(@content-desc, '₹')]")
    WebElement PlatformFeeAmt;


    @AndroidFindBy(xpath = "//*[contains(@text,'Third Point sees room for Apple stock price to climb, letter says')]")
    WebElement NewsCard;

    @AndroidFindBy(xpath = "//*[contains(@text,'When starting my investing journey, should I go solo?')]")
    WebElement ResearchCard;

    @AndroidFindBy(xpath = "//*[contains(@text,'What is an analyst rating?)]")
    WebElement ResearchDetails;

    @AndroidFindBy(xpath = "//*[contains(@text,'Netflix removes indian film with')]")
    WebElement NewsDetails;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterSellAmount;

    @AndroidFindBy(xpath = "//*[@text='review order']")
    WebElement ReviewOrderButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement ReviewOrderAmount;

    @AndroidFindBy(xpath = "//*[@text='place order']")
    WebElement PlaceOrderButton;

    @AndroidFindBy(xpath = "//*[@text='₹1']")
    WebElement ValidateEnteredAmount;



    @AndroidFindBy(xpath = "Enter amount or quantity to buy")
    WebElement EnterAmtHeading;

    @AndroidFindBy(accessibility = "Order Placed")
    WebElement ValidateOrderPlaced;


    @AndroidFindBy(accessibility = "View in order history")
    WebElement viewInOrderHistory;


    @AndroidFindBy(accessibility = "Cancel order")
    WebElement CancleOrder;


    @AndroidFindBy(xpath = "//*[@text='Yes']")
    WebElement YesButton;


    @AndroidFindBy(accessibility = "CANCELLATION SUBMITTED")
    WebElement CancellationInProgress;


    @AndroidFindBy(xpath = "//*[@text='go to dashboard']")
    private WebElement clickonViewDashboard;

    @AndroidFindBy(xpath = "//*[@text='LIVE MARKET']")
    WebElement MarketLiveLabel;

    @AndroidFindBy(xpath = "//*[@text='MARKET CLOSED']")
    WebElement MarketCloseLabel;

    @AndroidFindBy(xpath = "//*[@text='View investments']")
    WebElement ViewEnhancementButton;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[3]")
    WebElement GetCurrentValue;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[1]")
    WebElement GetCurrentOverallReturns;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[2]")
    WebElement GetTotalInvested;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup")
    WebElement StockName;

    @AndroidFindBy(xpath = "//*[@text='AMZN']")
    WebElement StockNameOnDetailsPage;

    @AndroidFindBy(xpath = "//*[@text='Transactions']")
    WebElement ValidateActivitiesPage;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Invested') and matches(@content-desc, '₹\\d{1,3}(?:,\\d{3})*(?:\\.\\d{2})?')]")
    WebElement InvestedAmountOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
    WebElement StoreInvestedAmountOnDashboard;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc])[9])")
    WebElement CurrentValueOnDashboard;

    @AndroidFindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]")
    WebElement StoreCurrentValueOnDashboard;


    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Low funds! Add funds from YES Bank to trade')]")
    WebElement LowinBuyPowerErrorMessage;

    @AndroidFindBy(xpath = "//*[@text='Top picks']")
    WebElement TopPicksTab;

    @AndroidFindBy(xpath = "//*[@text='buy now']")
    WebElement BuyNowTopPicks;

    @AndroidFindBy(xpath = "//*[@text='News']")
    WebElement NewsLabel;

    @AndroidFindBy(xpath = "//*[@text='Search news']")
    WebElement SearchNews;

    @AndroidFindBy(id = "txvViewAllNews")
    WebElement ViewAllNews;


    @AndroidFindBy(id = "txvViewAllResearch")
    WebElement ViewAllResearch;

    @AndroidFindBy(id = "txvNewsTitle")
    WebElement NewsList;


    @AndroidFindBy(xpath = "//*[@text='Research & perspectives']")
    WebElement ResearchList;

    @AndroidFindBy(xpath = "//*[@text='0.0']")
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

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Minimum Transaction Amount Should be greater than ₹0.87 INR')]")
    WebElement MinimumTransactionErrorMsg;

    @AndroidFindBy(xpath = "//*[contains(@text,'Low funds! Add funds from YES Bank to trade')]")
    WebElement TransactionLimitErrorMsg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    WebElement PandLPercentage;

    @AndroidFindBy(accessibility = "Pro")
    WebElement ProTab;

    @AndroidFindBy(accessibility = "Limit")
    WebElement OrderTypeDropdown;

    @AndroidFindBy(xpath = "//*[@text='confirm selection']")
    WebElement ConfirmProOrderType;

    @AndroidFindBy(xpath = "//*[@text='Limit Order']")
    WebElement LimitOrderType;

    @AndroidFindBy(accessibility = "Stop")
    WebElement StopOrderType;

    @AndroidFindBy(accessibility = "Market If Touched(MIT)")
    WebElement MITOrderType;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Qty\"]/android.widget.EditText")
    WebElement EnterQuantity;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'UAVS') and contains(@content-desc, '₹')]")
    WebElement StockCurrentPrice;


    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"₹6.88\"]")
    WebElement EnterDecimalAmt;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Please enter the amount proceed')]")
    WebElement EnterAmtToProceedError;


    // More specific locators for stock price - try these in order of preference
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Current: ₹')]")
    WebElement CurrentStockPrice;
    
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, '₹') and contains(@content-desc, 'Current')]")
    WebElement CurrentPriceElement;
    
    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[1]")
    WebElement FirstPriceElement;
    
    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[2]")
    WebElement SecondPriceElement;
    
    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[3]")
    WebElement ThirdPriceElement;

    // More specific locator for stock price with pattern like "GOOGL\n₹16,416.98"
    @AndroidFindBy(xpath = "//android.view.View[matches(@content-desc, '^[A-Z]{2,5}\\\\n₹[0-9,]+\\.[0-9]{2}$')]")
    WebElement StockPriceWithSymbol;

    // Alternative locator for stock price
    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, '₹') and contains(@content-desc, '\n')]")
    WebElement StockPriceWithNewline;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterTradeQuantity;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Amount\"]/android.widget.EditText")
    WebElement SetLimitPrice;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, '07:00 AM IST') and contains(@content-desc, 'Good till next market day closes')]")
    WebElement ExpireTillMarketDayClose;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Good till canceled')]")
    WebElement GoodTillCancelled;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'FOXO') and contains(@content-desc, '₹')]")
    WebElement FoxoStockPrice;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Select Date\n" +
            "Choose good till effective date\"]")
    WebElement SelectCustomExpiryDate;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Wednesday 07:00 AM IST\n" +
            "Good till next market day closes\"]")
    WebElement SelectSetTimeInForce;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.TextView[2]")
    WebElement ValidateCustomExpiryDate;

    @AndroidFindBy(accessibility = "OK")
    WebElement ClickOK;

    @AndroidFindBy(xpath = "//*[@text='view details']")
    WebElement ViewDetailsCTA;

    @AndroidFindBy(xpath = "//*[@text='Cashback invites']")
    WebElement CashbackInviteLabel;

    @AndroidFindBy(xpath = "//*[@text='Invites you received']")
    WebElement InvitesReceivedLabel;

    @AndroidFindBy(xpath = "//*[@text='Invites you sent']")
    WebElement InvitesSentLabel;


    @AndroidFindBy(xpath= "//android.view.View[@content-desc=\"Limit\"]")
    WebElement ValidateOrderType;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView")
    WebElement ClickonVTStock;

    @AndroidFindBy(accessibility = "Sell")
    WebElement SellButton;

    @AndroidFindBy(id = "imgClose")
    WebElement CloseCashbackPopup;

    @AndroidFindBy(xpath = "//*[@text='Sell in Rupees']")
    WebElement SellTypeDropdown;

    @AndroidFindBy(accessibility = "Market")
    WebElement ValidateSellOrder;


    @AndroidFindBy(accessibility = "Order Placed")
    WebElement order_Placed;

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

    @AndroidFindBy(accessibility = "Go to dashboard")
    WebElement GoToTradeDashboard;


    @AndroidFindBy(xpath = "//*[@text='Transactions']")
    WebElement TransactionsSection;


    @AndroidFindBy(xpath = "//*[@text='Trade']")
    WebElement TradeOption;


    @AndroidFindBy(xpath = "//*[@text='CANCELLED']")
    WebElement CancleTag;


    @AndroidFindBy(xpath = "//*[@text='Cancelled']")
    WebElement CancleTagUnderTransactionsPage;


    @AndroidFindBy(xpath = "(//androidx.cardview.widget.CardView[@resource-id=\"com.appreciatewealth.android:id/card_view_trade_order\"])[1]/android.view.ViewGroup")
    WebElement CanclledOrder;


    @AndroidFindBy(xpath = "//*[@text='Order details']")
    WebElement OrderDetailsPage;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"₹6.88\"]")
    WebElement ValidateAmountDecimals;


    @AndroidFindBy(xpath = "//*[@text='1.33']")
    WebElement ValidateQuantityDecimals;

    @AndroidFindBy (id = "txvNetChange")
    private WebElement CurrentPandL;

    @AndroidFindBy(accessibility = "Search\n" +
            "Tab 3 of 4")
    private WebElement GlobalSearchClick;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText" )
    private WebElement GlobalSearchEnter;

    @AndroidFindBy(xpath ="//*[@text='AAPL']")
    private WebElement ValidateSearchResults;


    @AndroidFindBy(accessibility ="Activity")
    private WebElement ActivityTab;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]")
    private WebElement CurrentInvestedActivityTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private static WebElement CurrentAmountActivity;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement EstimatedPrice;

    @AndroidFindBy(id ="txvBuyingPowerValue")
    private WebElement GetBuyingPower;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement CloseSimBindingPopup;

    @AndroidFindBy(id = "infoBuyingPower")
    private WebElement InfoBuyingPower;

    @AndroidFindBy(id = "tvAmountHeltValue")
    private WebElement GetAmountHeld;

    @AndroidFindBy(xpath = "//*[@text='okay']")
    private WebElement ClickOkay;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[2]")
    private WebElement TradeAmountOnPreviewOrder;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private WebElement TradeQuantityPreviewOrder;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement TradeTotalFeePreviewOrder;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement TradeEstimatedTotalPreviewOrder;

    @AndroidFindBy(id = "txv_quantity_value_label")
    private WebElement TradeQuantityOrderPlaced;

    @AndroidFindBy(xpath = "//*[@text='₹10.05']")
    private WebElement OrderAmountTransactions;

    @AndroidFindBy(xpath = "//*[@text='continue']")
    private WebElement Continue;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[6]")
    private WebElement TradeQuantityTransactions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView")
    private WebElement SuccessFullStatusTransactions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[3]")
    private WebElement OrderTypeTransactions;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView")
    private WebElement EstimatedOrderQuantity;
    @AndroidFindBy(id = "txv_quantity_value_label")
    private WebElement EstimatedPriceOrderPlaced;
    @AndroidFindBy(accessibility = "US Upcoming Earnings")
    private WebElement CraftedListItem;

    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"NSC\n" +
            "Norfolk Southern Corporation\n" +
            "₹20336.54\n" +
            "₹0.0 (0.0%)\"]")
    private WebElement CraftedListTitle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    private WebElement CraftedStockAtFirst;

    @AndroidFindBy(accessibility = "skip")
    private WebElement Skip;

    @AndroidFindBy(id = "txvViewAllResearch")
    private WebElement ResearchView;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"GOOGL\n" +
            "Alphabet Inc. - Class A Shares\n" +
            "EQUITY\"]/android.view.View")
    private WebElement TopWatchlist;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"US Stocks\n" +
            "Tab 1 of 4\"]")
    private WebElement USStocks;

    @AndroidFindBy(accessibility = "Buy")
    private WebElement BuyNow;

    @AndroidFindBy(id = "btnBuy")
    private WebElement BuyNowAtStockDetails;


    @AndroidFindBy(accessibility = "All\n" +
            "Tab 1 of 4")
    private WebElement All;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[1]")
    WebElement Total_Amt;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[3]")
    WebElement Current_Amt;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[2]")
    WebElement Invested_Amt;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"UAVS\n" +
            "AGEAGLE AERIAL SYSTEMS INC\n" +
            "EQUITY\"]")
    WebElement UAVS;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, \"US stocks\") and contains(@content-desc, \"Returns\")]\n")
    WebElement USstockInvested;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, '₹')][3]\n")
    WebElement CurrentAmtPortfolio;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, '₹')][2]\n")
    WebElement InvestedValueUSStock;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, '₹')][3]\n")
    WebElement CurrentValueUSStock;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Portfolio\n" +
            "Tab 2 of 5\"]")
    WebElement PortFolioTab;



    @AndroidFindBy(xpath = "ivBack")
    WebElement BackArrowAtEnterAmtPage;


    @AndroidFindBy(id = "imgBack")
    WebElement BackArrowAtStockDetailsPage;


    @AndroidFindBy(accessibility = "Continue Where You Left")
    WebElement ContinueWhereYouLeft;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Resume buying') and contains(@content-desc, 'Buy now')]")
    WebElement BuyNowCTAOFContinueWhereLeftSection;


    @AndroidFindBy(accessibility = "Buy now >")
    WebElement BuyNowCTA;



    @AndroidFindBy(accessibility = "If the order doesn’t execute, it should expire by")
    WebElement OrderExpireNote;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, '07:00 AM IST') and contains(@content-desc, 'Good till next market day closes')]")
    WebElement OrderExpiryAsGoodTillMarketDayClosed;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'US Stocks') and contains(@content-desc, 'Returns') and contains(@content-desc, 'Invested')]")
    WebElement USStocksCompleteXpath;


    @AndroidFindBy(xpath = "(//android.view.View[starts-with(@content-desc, '₹')])[2]")
    WebElement ReturnAmtTotalPandLForUSStocks;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '%')])[1]")
    WebElement ReturnPercentageTotalPandLForUSStocks;

    @AndroidFindBy(xpath = "(//android.view.View[starts-with(@content-desc, '₹')])[3]")
    WebElement InvestedAmtTotalPandLForUSStocks;

    @AndroidFindBy(xpath = "(//android.view.View[starts-with(@content-desc, '₹')])[4]")
    WebElement CurrentAmtTotalPandLForUSStocks;



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


//    public void NavigatetoTradeDashboard() throws InterruptedException, IOException {
//        Thread.sleep(5000);
//        signInPage.Signin();
//        Thread.sleep(8000);
//        //clickonViewDashboard.click();
//        //Thread.sleep(10000);
//        Skip.click();
//        TradeButton.click();
//
//    }
    public void VerifyUSStocks() throws InterruptedException, IOException {
        Thread.sleep(5000);
        signInPage.Signin();
        //Thread.sleep(8000);
        //Skip.click();
        Thread.sleep(8000);
       // TradeButton.click();

        /*String accessibilityId = TradeButton.getAttribute("content-desc");

        // System.out.println("Accessibility ID: " + accessibilityId);
        // Regular expression to match the number inside parentheses
        String regex = "US Stocks [0-9]*\\.[0-9]+% Total returns";
        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(accessibilityId);

        // Find and print the number inside the parentheses
        if (matcher.find()) {
            // Group 1 contains the number inside the parentheses
            String number = matcher.group(1);
            System.out.println("The numeric value is: " + number);
        } else {
            System.out.println("No numeric value found inside parentheses.");
        }
*/
    }

    public void VerifyUSStocksIOS() throws IOException, InterruptedException {
        Thread.sleep(2000);
        signInPage.IOSSignIn();
        Thread.sleep(8000);
        TradeButton.click();


    }

    public void ClickonBuyNow() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until the BuyNow button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(BuyNow));

        BuyNow.click();

        // Optional: If using BuyNowAtStockDetails later
        // wait.until(ExpectedConditions.elementToBeClickable(BuyNowAtStockDetails));
        // BuyNowAtStockDetails.click();

    }

    public void EnterTradeAmount(String amount) throws InterruptedException {
         Thread.sleep(3000);
        EnterAmount.click();
        Thread.sleep(2000);
        // ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
        EnterAmountValue.sendKeys(amount);
        // Thread.sleep(5000);

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        Thread.sleep(2000);
    }

    public void ClickReviewOrderButton() throws InterruptedException {
        Thread.sleep(4000);
        ReviewOrderButton.click();
    }

    public void ValidateOrderAmount(String finalAmount) throws InterruptedException {
        Thread.sleep(3000);
        String ActualAmount = ReviewOrderAmount.getText();
        Assert.assertEquals(ActualAmount, finalAmount);
    }

    public void ClickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(5000);
        PlaceOrderButton.click();
    }

    public void ValidateIfOrderPlaced() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until the validation element is visible
        wait.until(ExpectedConditions.visibilityOf(ValidateOrderPlaced));
        System.out.println("Order placement validation element is visible.");

        // Wait until the GoToTradeDashboard button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(GoToTradeDashboard));
        GoToTradeDashboard.click();


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

    public void CalculateCurrentValue() throws InterruptedException {
        String OverallReturn = Total_Amt.getAttribute("content-desc");
        String Totalinvested = Invested_Amt.getAttribute("content-desc");
        String CurrentValuewithCurrency = Current_Amt.getAttribute("content-desc");

        OverallReturn = OverallReturn.replace("₹", "").replace(",", "").trim();
        Totalinvested = Totalinvested.replace("₹", "").replace(",", "").trim();
        CurrentValuewithCurrency = CurrentValuewithCurrency.replace("₹", "").replace(",", "").trim();


        double overallReturnValue = Double.parseDouble(OverallReturn);
        double totalInvestedValue = Double.parseDouble(Totalinvested);
        double totalCurrentValuewithCurrency= Double.parseDouble(CurrentValuewithCurrency);

        double finalValue = overallReturnValue + totalInvestedValue;
        double finalValue2= Double.parseDouble(String.format("%.2f", finalValue));

        System.out.println("Final Value: ₹" + String.format("%.2f", finalValue));


        Assert.assertEquals(totalCurrentValuewithCurrency, finalValue2);



//       String OverallReturn = GetCurrentOverallReturns.getText();
//
//        String OverallReturnwithoutCurrency = OverallReturn.replaceAll("[₹,]", "");
//        double doubleoverallreturn = Double.parseDouble(OverallReturnwithoutCurrency);
//
//        String Totalinvested = GetTotalInvested.getText();
//        String OverallInvestedwithoutCurrency = Totalinvested.replaceAll("[₹,]", "");
//        double doublefinalInvestment = Double.parseDouble(OverallInvestedwithoutCurrency);
//        // int totalinvested = Integer.parseInt(Totalinvested);
//        System.out.println("this is the total invested amount from app " + doublefinalInvestment);
//        double Finalvalue = doublefinalInvestment + doubleoverallreturn;
//        System.out.println("this is the total current value amount from app " + Finalvalue);
//        //String ExpectedCurrentValue = String.valueOf(""+Finalvalue);*/
//        Thread.sleep(5000);
//        String CurrentValuewithCurrency = GetCurrentValue.getText();
//        String CurrentActualValue = CurrentValuewithCurrency.replaceAll("[₹,]", "");
//        double CurrentValueindouble = Double.parseDouble(CurrentActualValue);
//        Assert.assertEquals(CurrentValueindouble, Finalvalue);
    }

    public void ClickonViewEnhancements() throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Portfolio\").instance(0))"));
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




            //StockName.click();
            StockNameOnPortfolio = StockName.getText();
            System.out.println(StockNameOnPortfolio);
        }
    }

    public void ValidateStockLink() throws InterruptedException {

        Thread.sleep(5000);
        StockNameOnDetailsPage.isDisplayed();

        //String getStocknameDetailsPage = StockNameOnDetailsPage.getText();
        //Thread.sleep(5000);
        //ValidateActivitiesPage.isDisplayed();
        //Assert.assertEquals(StockNameOnPortfolio, getStocknameDetailsPage);

    }

    public void ClickOnStockDetails() throws InterruptedException {
        Thread.sleep(3000);
        int x =638;
        int y = 825;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));


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
        Thread.sleep(5000);

        String tmp1 = USstockInvested.getAttribute("content-desc");

        Thread.sleep(3000);


        String[] lines = tmp1.split("\n");

        String investedAmount = lines[4];


        RunTimeInvestedAmountonDashboard = investedAmount.replaceAll("[^0-9.]", "");

        // System.out.println("Numeric Value: " + numericValue);


        return RunTimeInvestedAmountonDashboard;


    }

    public String getCurrentValueOnDashboard() throws InterruptedException {

        Thread.sleep(5000);

        String tm1 =  CurrentAmtPortfolio.getAttribute("content-desc");
        RunTimeCurrentAmountonDashboard = tm1.replaceAll("[^0-9.]", "");

        //System.out.println("Numeric Value: " + numericValue);

        return RunTimeCurrentAmountonDashboard;



    }


    public String getInvestedOnPortfolio() throws InterruptedException {
        Thread.sleep(4000);

        String tm1 =  InvestedValueUSStock.getAttribute("content-desc");
        RunTimeInvestedAmountonPortfolio = tm1.replaceAll("[^0-9.]", "");

        // System.out.println("Numeric Value: " + numericValue);

        return  RunTimeInvestedAmountonPortfolio;
    }
    public String getCurrentAmountOnPortfolio() throws InterruptedException {
        Thread.sleep(4000);
        String tm1 =    CurrentValueUSStock.getAttribute("content-desc");
        RunTimeurrentAmountonPortfolio = tm1.replaceAll("[^0-9.]", "");

        // System.out.println("Numeric Value: " + numericValue);

        return  RunTimeurrentAmountonPortfolio;

    }


public void CompareInvestedandCurrentValue() throws InterruptedException {

    Thread.sleep(5000);

    System.out.println(RunTimeInvestedAmountonDashboard);
    System.out.println(RunTimeCurrentAmountonDashboard);
    System.out.println(RunTimeInvestedAmountonPortfolio);
    System.out.println( RunTimeurrentAmountonPortfolio);

    Thread.sleep(5000);


    Assert.assertEquals(RunTimeInvestedAmountonDashboard, RunTimeInvestedAmountonPortfolio);
    // Assert.assertEquals(RunTimeCurrentAmountonDashboard, RunTimeurrentAmountonPortfolio);

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
        //TopWatchlist.click();

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
        Thread.sleep(5000);
        SelectOrderType.sendKeys("1");
        // Thread.sleep(2000);
        // SelectQuantityTypeOrder.click();
        // ConfirmOrderType.click();
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

    public void ValidateMinimumTransactionMsg(String msg) throws InterruptedException {
        Thread.sleep(3000);
//        String Actualmsg = MinimumTransactionErrorMsg.getText();
//        Assert.assertEquals(Actualmsg, msg);
        MinimumTransactionErrorMsg.isDisplayed();
    }

    public void CalculateProfitandLossPercentage() throws InterruptedException {
        Thread.sleep(8000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\"))"));
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 600,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));
            Thread.sleep(8000);
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
        Thread.sleep(8000);
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

    public void SelectPro() throws InterruptedException {
     Thread.sleep(3000);
        ProTab.click();
    }



    public void SelectProOrderType() throws InterruptedException {
        Thread.sleep(1000);
        OrderTypeDropdown.click();
       // Thread.sleep(3000);
        // LimitOrderType.click();
        // Thread.sleep(5000);
        // ConfirmProOrderType.click();
    }

    public void SelectStopOrder() throws InterruptedException {
        // Thread.sleep(5000);

        //OrderTypeDropdown.click();
        Thread.sleep(3000);
        StopOrderType.click();
        // Thread.sleep(5000);
        //  ConfirmProOrderType.click();
    }
    public void SelectMITOrder() throws InterruptedException {
        //Thread.sleep(2000);
        //  OrderTypeDropdown.click();
        Thread.sleep(3000);
        MITOrderType.click();
        //  ConfirmProOrderType.click();
    }


    public void EnterQuantity(String Quantity) throws InterruptedException {
        Thread.sleep(2000);
        //EnterQuantity.click();

        int x =229;
        int y = 815;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        Thread.sleep(2000);
        EnterQuantity.sendKeys(Quantity);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void EnterLimitPrice() throws InterruptedException {
        Thread.sleep(3000);

        int x =240;
        int y = 1051;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        //SetLimitPrice.click();

        System.out.println("=== STARTING STOCK PRICE EXTRACTION ===");

        String temp = StockCurrentPrice.getAttribute("content-desc");
        System.out.println("Selected price element content: " + temp);

        String[] parts = temp.split("\n");
        System.out.println("Number of parts after split: " + parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + ": '" + parts[i] + "'");
        }

        double stockPrice = 0.0;
        if (parts.length >= 2) {
            String priceWithSymbol = parts[1]; // ₹167.49
            System.out.println("Price with symbol: '" + priceWithSymbol + "'");
            String cleanedPrice = priceWithSymbol.replace("₹", "").replace(",", "").trim();
            System.out.println("Cleaned price: '" + cleanedPrice + "'");

            try {
                stockPrice = Double.parseDouble(cleanedPrice);
                System.out.println("Extracted stock price: " + stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse price: " + cleanedPrice);
                System.out.println("Exception: " + e.getMessage());
                stockPrice = 0.0;
            }
        } else {
            System.out.println("Unexpected content-desc format: " + temp);
            stockPrice = 0.0;
        }

// Add 1 to the stock price
        double newPrice = stockPrice - 5;
        System.out.println("New price (stock price + 1): " + newPrice);

// Convert double to String (you can format it if needed)
        String newPriceStr = String.valueOf(newPrice);
        System.out.println("New price as string: '" + newPriceStr + "'");

// Now send this string to the SetLimitPrice field
        SetLimitPrice.sendKeys(newPriceStr);
        System.out.println("Sent to SetLimitPrice field: '" + newPriceStr + "'");

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        System.out.println("=== ENDING STOCK PRICE EXTRACTION ===");

    }
    public void OrderExpirytillMarketClose() throws InterruptedException {
        Thread.sleep(4000);
        ExpireTillMarketDayClose.click();
    }

    public void OrderExpirytillCancelled() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            // Wait until OrderExpireNote is visible
            wait.until(ExpectedConditions.visibilityOf(OrderExpireNote));

            if (OrderExpireNote.isDisplayed()) {
                GoodTillCancelled.click();
            } else {
                System.out.println("OrderExpireNote not displayed, skipping click on GoodTillCancelled.");
            }
        } catch (Exception e) {
            System.out.println("Exception while handling order expiry selection: " + e.getMessage());
        }


    }
    public void OrderExpiryCustom() throws InterruptedException {
        SelectCustomExpiryDate.click();
        Thread.sleep(5000);
        ClickOK.click();
    }

    public void ValidateOrderType(String EnterOrderType) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        ValidateIfOrderPlaced();
//        Thread.sleep(5000);
//        String ActualOrderType = ValidateOrderType.getAttribute("content-desc");
//        Assert.assertEquals(ActualOrderType,EnterOrderType);

        wait.until(ExpectedConditions.elementToBeClickable(GoToTradeDashboard));
        GoToTradeDashboard.click();
    }

    public void ClickOnSellStocks() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        Thread.sleep(5000);
        driver.findElement(AppiumBy.id("constraintChildOtherPicks")).click();
        /*driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));*/
        // WebElement clickonbuynow =

        //ClickonVTStock.click();
    }

    public void EnterSellAmount(String Amount) throws InterruptedException {
        Thread.sleep(5000);
        EnterAmount.click();
        EnterAmount.sendKeys(Amount);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }


    public void ClickOnSell() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until the Sell button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(SellButton));

        SellButton.click();
    }


    public void SelectSellType() throws InterruptedException {
        Thread.sleep(4000);
        EnterAmount.click();
    }

    public void ValidateSellOrderType(String OrderType) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait for up to 10 seconds

        try {
            wait.until(ExpectedConditions.visibilityOf(ValidateSellOrder));

            if (ValidateSellOrder.isDisplayed()) {
                String ActualType = ValidateSellOrder.getAttribute("content-desc");
                Assert.assertEquals(ActualType, OrderType, "Order type does not match expected value.");
            } else {
                Assert.fail("ValidateSellOrder element is not displayed.");
            }
        } catch (Exception e) {
            Assert.fail("Exception while validating sell order type: " + e.getMessage());
        }

    }
    public void SelectSellTypeOrder() throws InterruptedException {
        SelectOrderTypeSell.click();
        Thread.sleep(2000);
        SelectQuantityTypeOrder.click();
        ConfirmOrderType.click();

    }

    public void EnterQuantitySell(String Quantity) throws InterruptedException {
        Thread.sleep(4000);
        EnterTradeQuantity.click();
        EnterTradeQuantity.sendKeys(Quantity);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void EnterLimitPriceSell(String Price){
        SetLimitPriceSell.click();
        SetLimitPriceSell.sendKeys(Price);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void GoToTradeDashboard() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10-second timeout

        try {
            wait.until(ExpectedConditions.visibilityOf(order_Placed));

            if (order_Placed.isDisplayed()) {
                GoToTradeDashboard.click();
            } else {
                System.out.println("Order placed element is not displayed, skipping click.");
            }
        } catch (Exception e) {
            System.out.println("Exception while trying to navigate to trade dashboard: " + e.getMessage());
        }

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
        double PostSellHoldings = Double.parseDouble(CurrentHoldings)-1;
        Assert.assertEquals(ActualHoldings,PostSellHoldings);

    }

    public void ValidateMinusSign() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        Thread.sleep(4000);
        GetMinusSignInHoldings.isDisplayed();

    }
    public void ValidateAmountDecimals() throws InterruptedException {
        Assert.assertEquals(ValidateAmountDecimals.getText(),"₹6.88");
    }

    public void ValidateQuantityDecimals() throws InterruptedException {
        Thread.sleep(6000);
        String ActualText = ValidateQuantityDecimals.getText();
        Assert.assertEquals(ActualText,"1.33");

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
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        Thread.sleep(8000);
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

    public void ClickOnGlobalSearch() throws InterruptedException, IOException {
        Thread.sleep(5000);
        signInPage.Signin();
        Thread.sleep(5000);
        //Skip.click();
        GlobalSearchClick.click();
    }

    public void EnterInGlobalSearch(String StockName) throws InterruptedException {
        Thread.sleep(2000);
        GlobalSearchEnter.sendKeys(StockName);
    }

    public void ValidateGlobalSearchResults() throws InterruptedException {
        Thread.sleep(5000);
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
        Thread.sleep(8000);
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
        double value = 1000;
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
                .replace(" M", "")
                .trim());
        System.out.println("Buying Power before buy: "+BuyingPower);

        double BuyingPowerPostBuy = BuyingPower-6;

        double BuyingPower2 = Double.parseDouble(GetBuyingPowerAfterBuy.replace("₹", "")
                .replace(" M", "")
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
        Thread.sleep(5000);
        QuantityOnSellScreen = EstimatedOrderQuantity.getText();
        System.out.println("Estimated Quantity on Sells Screen "+QuantityOnSellScreen);
        return QuantityOnSellScreen;
    }

    /*public void CheckOrderDetailsPreview() throws InterruptedException {
        Thread.sleep(5000);
        TradeAmountOnPreview = TradeAmountOnPreviewOrder.getText();
        System.out.println("Trade amount on preview screen "+TradeAmountOnPreview);
        QuantityOnPreviewScreen = TradeQuantityPreviewOrder.getText();
        System.out.println("Trade quantity on preview screen "+  QuantityOnPreviewScreen);
        Assert.assertEquals(TradeAmountOnPreview,"₹10");
        Assert.assertEquals(QuantityOnPreviewScreen,QuantityOnSellScreen);

    }
*/
    public void CheckOrderDetailsPlaceOrder() throws InterruptedException {
        Thread.sleep(5000);
        TradeAmountOnPreview = TradeAmountOnPreviewOrder.getText();
        Assert.assertEquals(TradeAmountOnPreview,"₹10.05");
        QuantityOnPlaceOrderScreen = TradeQuantityOrderPlaced.getText();
        System.out.println("Trade quantity on order placed screen "+  QuantityOnPlaceOrderScreen);
        GetEstimatedCreditAmount =  EstimatedPriceOrderPlaced.getText();
        System.out.println("Estimated amount on placed order screen "+  GetEstimatedCreditAmount);
        Assert.assertEquals(QuantityOnPlaceOrderScreen,GetEstimatedCreditAmount);
    }

    public void CheckOrderDetailsActivityTab() throws InterruptedException {
        Thread.sleep(5000);
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
    public void ClickOnCraftedList() throws InterruptedException {
        Thread.sleep(5000);
        CraftedListItem.click();
    }
    public void ClickOnCraftedListTitle() throws InterruptedException {
        Thread.sleep(8000);
        CraftedListTitle.click();
    }


    public void ValidateCraftedTitleScreen() throws InterruptedException {
        Thread.sleep(5000);
        //CraftedItemLabel = CraftedStockAtFirst.getText();
       String Title = CraftedStockAtFirst.getText();
       Assert.assertEquals(Title,CraftedItemLabel);
        Thread.sleep(5000);
        BuyNowButton.isDisplayed();
    }

    public void SelectTimeInForce(){
        SelectSetTimeInForce.click();
    }

    public void EnterProOrderQty(String Qty) throws InterruptedException {
        Thread.sleep(4000);
       // EnterTradeQuantity.click();
        int x =196;
        int y = 684;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        EnterTradeQuantity.sendKeys(Qty);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void ClickContinue() throws InterruptedException {
        Thread.sleep(3000);
        Continue.click();
    }

    public void ClickOnViewDetails() throws InterruptedException {
        Thread.sleep(3000);
        ViewDetailsCTA.click();
    }

    public void ValidateCashbackScreen() throws InterruptedException {
        Thread.sleep(3000);
        InvitesReceivedLabel.isDisplayed();
        InvitesSentLabel.isDisplayed();
        CloseCashbackPopup.isDisplayed();
        CloseCashbackPopup.click();
        Thread.sleep(5000);
    }

    public void ClickOnViewAllNews() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"News\").instance(0))"));
        Thread.sleep(5000);
        NewsLabel.isDisplayed();

    }

    public void ValidateNewsSection() throws InterruptedException {
        ViewAllNews.click();
        Thread.sleep(5000);
        SearchNews.isDisplayed();
        List<WebElement> Newslist = driver.findElements(By.id("txvNewsTitle"));
        int NewsListSize = Newslist.size();
        if(NewsListSize==0){
            System.out.println("News list is empty--> Size: "+NewsListSize);
        }else {
            System.out.println("News is present-> Size: "+NewsListSize);
        }
        Thread.sleep(4000);
    }

    public void SwipeRightNewsSection() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"News\").instance(0))"));
        Thread.sleep(8000);
        WebElement element = driver.findElement(AppiumBy.xpath("//*[contains(@text,'UPDATE 3-Apple taps insider Kevan Parekh as CFO, replacing Maestri')]"));
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId"  ,((RemoteWebElement)element).getId(),
                "direction","left",
                "percent",1
        ));

    }

    public void ClickOnNewsCard(){
        NewsCard.click();
    }
    public void ValidateNewsDetails() throws InterruptedException {
        Thread.sleep(3000);
        NewsCard.isDisplayed();
    }


    public void ClickOnResearch() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Research & perspectives\").instance(0))"));
        Thread.sleep(5000);
        ViewAllResearch.click();
    }

    public void ValidateResearchList() throws InterruptedException {
        Thread.sleep(5000);
        ResearchList.isDisplayed();
    }

    public void SwipeRightResearchSection() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Research & perspectives\").instance(0))"));
        Thread.sleep(8000);
        WebElement element = driver.findElement(AppiumBy.xpath("//*[contains(@text,'When starting my investing journey, should I go solo?')]"));
        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId"  ,((RemoteWebElement)element).getId(),
                "direction","left",
                "percent",1
        ));
        Thread.sleep(3000);
        ResearchView.click();



    }

    public void ClickOnResearchCard() throws InterruptedException {
        Thread.sleep(8000);
        ResearchCard.click();
    }

    public void ValidateResearchDetails() throws InterruptedException {
        Thread.sleep(3000);
        ResearchDetails.isDisplayed();
    }
    public void SliderForBuy() throws InterruptedException {
        Thread.sleep(6000);
        int startY = 1501; // Y-coordinate remains the same
        int startX = 104;  // Adjust this value for the start position of the swipe
        int endX = 650;   // Adjust this value for the end position of the swipe

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeRight = new Sequence(finger, 1);

        // Move to the starting position
        swipeRight.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));

        // Press down to start the swipe
        swipeRight.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

        // Move to the end position to simulate the swipe
        swipeRight.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, startY));

        // Release the button to complete the swipe
        swipeRight.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(List.of(swipeRight));
        Thread.sleep(3000);
    }


    public void ClickUSStocks() throws InterruptedException {
        Thread.sleep(4000);
        USStocks.click();
//        Thread.sleep(3000);
//        int x =638;
//        int y = 825;
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(List.of(tap));

    }

    public void SelectAll() throws InterruptedException {
        Thread.sleep(3000);
        All.click();
    }

    public void SelectStock() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until UAVS is clickable
        wait.until(ExpectedConditions.elementToBeClickable(UAVS));

        UAVS.click();
    }

    public void SelectUSStockTab() throws InterruptedException {
        Thread.sleep(3000);
        USStocks.click();
    }


    public void ClickOnViewInOrderHistory() throws InterruptedException {
        Thread.sleep(6000);
        ValidateOrderPlaced.isDisplayed();
        viewInOrderHistory.click();

    }

    public void ClickOnCancleOrderCTA() throws InterruptedException {
        Thread.sleep(3000);
        CancleOrder.click();
    }

    public void ClickOnYesButton() throws InterruptedException {
        Thread.sleep(3000);
        YesButton.click();
    }

    public void VeifyCancleTag() throws InterruptedException {
        Thread.sleep(3000);
        CancellationInProgress.isDisplayed();
    }

    public void ClickOnGotoDashboard() throws InterruptedException {
        Thread.sleep(3000);
        GoToTradeDashboard.click();
    }

    public void SelectTransactions() throws InterruptedException {
        Thread.sleep(4000);
        TransactionsSection.click();
        Thread.sleep(2000);
        TradeOption.click();

    }

    public void VerifyCancleTagUnderTransactionPage() throws InterruptedException {
        Thread.sleep(3000);
        String temp =  CancleTagUnderTransactionsPage.getText();

        Assert.assertEquals(temp, "Cancelled");
    }

    public void GoToOrderDetails() throws InterruptedException {
        Thread.sleep(3000);
        CanclledOrder.click();
        Thread.sleep(3000);
        OrderDetailsPage.isDisplayed();

    }

    public void VerifyCancelledTagUnderOrderDetailsPage(String cancelled) throws InterruptedException {
        Thread.sleep(3000);
       String cancel_tag =  CancleTag.getText();
        Assert.assertEquals(cancel_tag, cancelled);
    }

    public void VerifyCancelledTagUnderTransactionStatus() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(3000);
        String cancel_tag =  CancleTagUnderTransactionsPage.getText();
        Assert.assertEquals(cancel_tag, "Cancelled");



    }

    public void SelectPortFolioTab() throws InterruptedException {
        Thread.sleep(3000);
        PortFolioTab.click();
    }

    public void ComeBackToHomeDashboard() throws InterruptedException {
        Thread.sleep(3000);
        BackArrowAtEnterAmtPage.click();
        Thread.sleep(2000);
        BackArrowAtStockDetailsPage.click();
    }

    public void VerifyContinueToLeft() throws InterruptedException {
        Thread.sleep(3000);
        ContinueWhereYouLeft.isDisplayed();

       // BuyNowCTAOFContinueWhereLeftSection.isDisplayed();



    }

    public void ClickOnBuyNowCtaUnderContinueWhereLeftSection() throws InterruptedException {
        Thread.sleep(2000);
         BuyNowCTA.click();

    }

    public void SelectOrderExpiryAsGoodTillMarketDayClosed() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            // Wait until the OrderExpireNote is visible
            wait.until(ExpectedConditions.visibilityOf(OrderExpireNote));

            if (OrderExpireNote.isDisplayed()) {
                OrderExpiryAsGoodTillMarketDayClosed.click();
            } else {
                System.out.println("OrderExpireNote is not visible. Skipping click.");
            }
        } catch (Exception e) {
            System.out.println("Exception while selecting order expiry: " + e.getMessage());
        }
    }

    // Class-level variables
    double allTabReturnAmount;
    double allTabReturnPercentage;
    double allTabInvestedAmount;

    double USStockTabReturnAmount;
    double USStockTabReturnPercentage;
    double USStockTabInvestedAmount;

    public void getAllValueOfUSStocksInAllTab() throws InterruptedException {
        Thread.sleep(5000);

        String tmp = USStocksCompleteXpath.getAttribute("content-desc");
        String[] lines = tmp.split("\n");

        if (lines.length < 5) {
            System.out.println("Unexpected content format: " + tmp);
            return;
        }

        String returnLine = lines[2];
        String investedAmountStr = lines[4];

        String returnAmountStr = returnLine.split(" ")[0];
        String returnPercentageStr = returnLine.replaceAll(".*\\((.*)\\).*", "$1");

        // ✅ Assigning to global variables (no `double` keyword)
        allTabReturnAmount = Math.abs(Double.parseDouble(returnAmountStr.replace("₹", "").replace(",", "")));
        allTabReturnPercentage = Double.parseDouble(returnPercentageStr.replace("%", ""));
        allTabInvestedAmount = Double.parseDouble(investedAmountStr.replace("₹", "").replace(",", ""));

        System.out.println("Return Amount (All Tab): " + allTabReturnAmount);
        System.out.println("Return Percentage (All Tab): " + allTabReturnPercentage);
        System.out.println("Invested Amount (All Tab): " + allTabInvestedAmount);
    }

    public void GetAllUSValueAtUSStocksTab() throws InterruptedException {
        Thread.sleep(4000);

        String returnAmtStr = ReturnAmtTotalPandLForUSStocks.getAttribute("content-desc");
        String returnPercentageStr = ReturnPercentageTotalPandLForUSStocks.getAttribute("content-desc");
        String investedAmountStr = InvestedAmtTotalPandLForUSStocks.getAttribute("content-desc");
        String currentAmountStr = CurrentAmtTotalPandLForUSStocks.getAttribute("content-desc");

        // ✅ Assigning to global variables (no `double` keyword)
        USStockTabReturnAmount = Double.parseDouble(returnAmtStr.replace("₹", "").replace(",", "").trim());
        USStockTabReturnPercentage = Double.parseDouble(returnPercentageStr.replace("%", "").trim());
        USStockTabInvestedAmount = Double.parseDouble(investedAmountStr.replace("₹", "").replace(",", "").trim());
        double currentAmt = Double.parseDouble(currentAmountStr.replace("₹", "").replace(",", "").trim());

        System.out.println("Return Amount (US Tab): " + USStockTabReturnAmount);
        System.out.println("Return Percentage (US Tab): " + USStockTabReturnPercentage);
        System.out.println("Invested Amount (US Tab): " + USStockTabInvestedAmount);
        System.out.println("Current Amount: " + currentAmt);
    }

    public void CompareALLTabUSStocksValuesWithUSStocksTabValues() {
        // ✅ Now comparing the actual global variables
        assertEquals("Return Amount mismatch!", allTabReturnAmount, Math.abs(USStockTabReturnAmount), 0.001);
        assertEquals("Return Percentage mismatch!", allTabReturnPercentage, USStockTabReturnPercentage, 0.001);
        assertEquals("Invested Amount mismatch!", allTabInvestedAmount, USStockTabInvestedAmount, 0.001);

        System.out.println("✅ All compared values match successfully!");
    }


    public void EnterAmtUsingCoordinate() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until EnterAmountValue is visible BEFORE clicking the coordinate
        wait.until(ExpectedConditions.visibilityOf(EnterAmountValue));

        basePage.ClickUsingCoordinate(211, 695);  // Taps at given coordinates

        // Wait again in case there's a delay before the input is ready
        wait.until(ExpectedConditions.elementToBeClickable(EnterAmountValue));
        EnterAmountValue.sendKeys("1");

        // Perform keyboard action (e.g., pressing "Go" on soft keyboard)
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    // Helper method to find the correct stock price element
    private WebElement findCorrectStockPriceElement() {
        // List of possible stock price elements to check (in order of preference)
        WebElement[] priceElements = {
            StockPriceWithSymbol,      // Most specific - matches exact pattern
            StockPriceWithNewline,     // Contains both ₹ and newline
            CurrentStockPrice,
            CurrentPriceElement,
            FirstPriceElement,
            SecondPriceElement,
            ThirdPriceElement,
            StockCurrentPrice
        };

        String[] elementNames = {
            "StockPriceWithSymbol",
            "StockPriceWithNewline",
            "CurrentStockPrice",
            "CurrentPriceElement",
            "FirstPriceElement",
            "SecondPriceElement",
            "ThirdPriceElement",
            "StockCurrentPrice"
        };

        for (int i = 0; i < priceElements.length; i++) {
            try {
                if (priceElements[i].isDisplayed()) {
                    String content = priceElements[i].getAttribute("content-desc");
                    System.out.println("Checking " + elementNames[i] + ": " + content);

                    // Check if this looks like a stock price (contains stock symbol and price)
                    // Pattern: "GOOGL\n₹16,416.98" or similar
                    if (content != null && content.contains("₹") && content.contains("\n")) {
                        String[] parts = content.split("\n");
                        if (parts.length >= 2 && parts[1].contains("₹")) {
                            // Additional check: first part should be a stock symbol (3-5 letters, no numbers)
                            String stockSymbol = parts[0].trim();
                            if (stockSymbol.matches("^[A-Z]{2,5}$")) {
                                System.out.println("Found likely stock price element: " + elementNames[i]);
                                System.out.println("Stock Symbol: " + stockSymbol);
                                System.out.println("Price: " + parts[1]);
                                return priceElements[i];
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Element " + elementNames[i] + " not found or not visible");
            }
        }

        // If none found, return the original as fallback
        System.out.println("No specific stock price element found, using fallback");
        return StockCurrentPrice;
    }

    // Debug method to help identify all price elements on the screen
    public void debugAllPriceElements() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("=== DEBUGGING ALL PRICE ELEMENTS ===");
        
        try {
            // Find all elements with ₹ symbol
            List<WebElement> allPriceElements = driver.findElements(By.xpath("//android.view.View[contains(@content-desc, '₹')]"));
            System.out.println("Found " + allPriceElements.size() + " elements with ₹ symbol");
            
            for (int i = 0; i < allPriceElements.size(); i++) {
                try {
                    String content = allPriceElements.get(i).getAttribute("content-desc");
                    System.out.println("Element " + (i+1) + ": " + content);
                } catch (Exception e) {
                    System.out.println("Element " + (i+1) + ": Error reading content - " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error finding price elements: " + e.getMessage());
        }
        
        System.out.println("=== END DEBUGGING ===");
    }

//    public void OrderExpirytillMarketClose() throws InterruptedException {
//        Thread.sleep(4000);
//        ExpireTillMarketDayClose.click();
//    }

    // Simple method to test stock price extraction without coordinate tap
    public void testStockPriceExtraction() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("=== TESTING STOCK PRICE EXTRACTION ===");

        // Use helper method to find the correct stock price element
        WebElement priceElement = findCorrectStockPriceElement();
        String temp = priceElement.getAttribute("content-desc");
        System.out.println("Selected price element content: " + temp);

        String[] parts = temp.split("\n");
        System.out.println("Number of parts after split: " + parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + ": '" + parts[i] + "'");
        }

        double stockPrice = 0.0;
        if (parts.length >= 2) {
            String priceWithSymbol = parts[1]; // ₹167.49
            System.out.println("Price with symbol: '" + priceWithSymbol + "'");
            String cleanedPrice = priceWithSymbol.replace("₹", "").replace(",", "").trim();
            System.out.println("Cleaned price: '" + cleanedPrice + "'");

            try {
                stockPrice = Double.parseDouble(cleanedPrice);
                System.out.println("Extracted stock price: " + stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse price: " + cleanedPrice);
                System.out.println("Exception: " + e.getMessage());
                stockPrice = 0.0;
            }
        } else {
            System.out.println("Unexpected content-desc format: " + temp);
            stockPrice = 0.0;
        }

        double newPrice = stockPrice + 1;
        System.out.println("New price (stock price + 1): " + newPrice);
        System.out.println("=== END TESTING ===");
    }

    public void EnterStopPrice() throws InterruptedException {
        Thread.sleep(3000);

        int x =240;
        int y = 1051;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        //SetLimitPrice.click();

        System.out.println("=== STARTING STOCK PRICE EXTRACTION ===");

        String temp = StockCurrentPrice.getAttribute("content-desc");
        System.out.println("Selected price element content: " + temp);

        String[] parts = temp.split("\n");
        System.out.println("Number of parts after split: " + parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + ": '" + parts[i] + "'");
        }

        double stockPrice = 0.0;
        if (parts.length >= 2) {
            String priceWithSymbol = parts[1]; // ₹167.49
            System.out.println("Price with symbol: '" + priceWithSymbol + "'");
            String cleanedPrice = priceWithSymbol.replace("₹", "").replace(",", "").trim();
            System.out.println("Cleaned price: '" + cleanedPrice + "'");

            try {
                stockPrice = Double.parseDouble(cleanedPrice);
                System.out.println("Extracted stock price: " + stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse price: " + cleanedPrice);
                System.out.println("Exception: " + e.getMessage());
                stockPrice = 0.0;
            }
        } else {
            System.out.println("Unexpected content-desc format: " + temp);
            stockPrice = 0.0;
        }

// Add 1 to the stock price
        double newPrice = stockPrice + 1;
        System.out.println("New price (stock price + 1): " + newPrice);

// Convert double to String (you can format it if needed)
        String newPriceStr = String.valueOf(newPrice);
        System.out.println("New price as string: '" + newPriceStr + "'");

// Now send this string to the SetLimitPrice field
        SetLimitPrice.sendKeys(newPriceStr);
        System.out.println("Sent to SetLimitPrice field: '" + newPriceStr + "'");

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        System.out.println("=== ENDING STOCK PRICE EXTRACTION ===");

    }

    public void EnterTheMITTargetPrice() throws InterruptedException {
        Thread.sleep(3000);

        int x =240;
        int y = 1051;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        //SetLimitPrice.click();

        System.out.println("=== STARTING STOCK PRICE EXTRACTION ===");

        String temp = StockCurrentPrice.getAttribute("content-desc");
        System.out.println("Selected price element content: " + temp);

        String[] parts = temp.split("\n");
        System.out.println("Number of parts after split: " + parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + ": '" + parts[i] + "'");
        }

        double stockPrice = 0.0;
        if (parts.length >= 2) {
            String priceWithSymbol = parts[1]; // ₹167.49
            System.out.println("Price with symbol: '" + priceWithSymbol + "'");
            String cleanedPrice = priceWithSymbol.replace("₹", "").replace(",", "").trim();
            System.out.println("Cleaned price: '" + cleanedPrice + "'");

            try {
                stockPrice = Double.parseDouble(cleanedPrice);
                System.out.println("Extracted stock price: " + stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse price: " + cleanedPrice);
                System.out.println("Exception: " + e.getMessage());
                stockPrice = 0.0;
            }
        } else {
            System.out.println("Unexpected content-desc format: " + temp);
            stockPrice = 0.0;
        }

// Add 1 to the stock price
        double newPrice = stockPrice -5 ;
        System.out.println("New price (stock price + 1): " + newPrice);

// Convert double to String (you can format it if needed)
        String newPriceStr = String.valueOf(newPrice);
        System.out.println("New price as string: '" + newPriceStr + "'");

// Now send this string to the SetLimitPrice field
        SetLimitPrice.sendKeys(newPriceStr);
        System.out.println("Sent to SetLimitPrice field: '" + newPriceStr + "'");

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        System.out.println("=== ENDING STOCK PRICE EXTRACTION ===");

    }

    public void ClearEnteredAmtValue() throws InterruptedException {
        Thread.sleep(3000);
        basePage.ClickUsingCoordinate(211, 695);

        EnterDecimalAmt.clear();
        Thread.sleep(2000);

        EnterAmtToProceedError.isDisplayed();



    }

    public void EnterLimitPriceForSell() throws InterruptedException {
        Thread.sleep(3000);

        int x =240;
        int y = 1051;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        //SetLimitPrice.click();

        System.out.println("=== STARTING STOCK PRICE EXTRACTION ===");

        String temp = StockCurrentPrice.getAttribute("content-desc");
        System.out.println("Selected price element content: " + temp);

        String[] parts = temp.split("\n");
        System.out.println("Number of parts after split: " + parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + ": '" + parts[i] + "'");
        }

        double stockPrice = 0.0;
        if (parts.length >= 2) {
            String priceWithSymbol = parts[1]; // ₹167.49
            System.out.println("Price with symbol: '" + priceWithSymbol + "'");
            String cleanedPrice = priceWithSymbol.replace("₹", "").replace(",", "").trim();
            System.out.println("Cleaned price: '" + cleanedPrice + "'");

            try {
                stockPrice = Double.parseDouble(cleanedPrice);
                System.out.println("Extracted stock price: " + stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse price: " + cleanedPrice);
                System.out.println("Exception: " + e.getMessage());
                stockPrice = 0.0;
            }
        } else {
            System.out.println("Unexpected content-desc format: " + temp);
            stockPrice = 0.0;
        }

// Add 1 to the stock price
        double newPrice = stockPrice + 5;
        System.out.println("New price (stock price + 1): " + newPrice);

// Convert double to String (you can format it if needed)
        String newPriceStr = String.valueOf(newPrice);
        System.out.println("New price as string: '" + newPriceStr + "'");

// Now send this string to the SetLimitPrice field
        SetLimitPrice.sendKeys(newPriceStr);
        System.out.println("Sent to SetLimitPrice field: '" + newPriceStr + "'");

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        System.out.println("=== ENDING STOCK PRICE EXTRACTION ===");

    }

    public void EnterStopPriceForSell() throws InterruptedException {
        Thread.sleep(3000);

        int x =240;
        int y = 1051;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        //SetLimitPrice.click();

        System.out.println("=== STARTING STOCK PRICE EXTRACTION ===");

        String temp = StockCurrentPrice.getAttribute("content-desc");
        System.out.println("Selected price element content: " + temp);

        String[] parts = temp.split("\n");
        System.out.println("Number of parts after split: " + parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + ": '" + parts[i] + "'");
        }

        double stockPrice = 0.0;
        if (parts.length >= 2) {
            String priceWithSymbol = parts[1]; // ₹167.49
            System.out.println("Price with symbol: '" + priceWithSymbol + "'");
            String cleanedPrice = priceWithSymbol.replace("₹", "").replace(",", "").trim();
            System.out.println("Cleaned price: '" + cleanedPrice + "'");

            try {
                stockPrice = Double.parseDouble(cleanedPrice);
                System.out.println("Extracted stock price: " + stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse price: " + cleanedPrice);
                System.out.println("Exception: " + e.getMessage());
                stockPrice = 0.0;
            }
        } else {
            System.out.println("Unexpected content-desc format: " + temp);
            stockPrice = 0.0;
        }

// Add 1 to the stock price
        double newPrice = stockPrice - 1;
        System.out.println("New price (stock price + 1): " + newPrice);

// Convert double to String (you can format it if needed)
        String newPriceStr = String.valueOf(newPrice);
        System.out.println("New price as string: '" + newPriceStr + "'");

// Now send this string to the SetLimitPrice field
        SetLimitPrice.sendKeys(newPriceStr);
        System.out.println("Sent to SetLimitPrice field: '" + newPriceStr + "'");

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        System.out.println("=== ENDING STOCK PRICE EXTRACTION ===");
    }

    public void EnterTheMITTargetPriceForSell() throws InterruptedException {
        Thread.sleep(3000);

        int x =240;
        int y = 1051;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        //SetLimitPrice.click();

        System.out.println("=== STARTING STOCK PRICE EXTRACTION ===");

        String temp = StockCurrentPrice.getAttribute("content-desc");
        System.out.println("Selected price element content: " + temp);

        String[] parts = temp.split("\n");
        System.out.println("Number of parts after split: " + parts.length);
        for (int i = 0; i < parts.length; i++) {
            System.out.println("Part " + i + ": '" + parts[i] + "'");
        }

        double stockPrice = 0.0;
        if (parts.length >= 2) {
            String priceWithSymbol = parts[1]; // ₹167.49
            System.out.println("Price with symbol: '" + priceWithSymbol + "'");
            String cleanedPrice = priceWithSymbol.replace("₹", "").replace(",", "").trim();
            System.out.println("Cleaned price: '" + cleanedPrice + "'");

            try {
                stockPrice = Double.parseDouble(cleanedPrice);
                System.out.println("Extracted stock price: " + stockPrice);
            } catch (NumberFormatException e) {
                System.out.println("Failed to parse price: " + cleanedPrice);
                System.out.println("Exception: " + e.getMessage());
                stockPrice = 0.0;
            }
        } else {
            System.out.println("Unexpected content-desc format: " + temp);
            stockPrice = 0.0;
        }

// Add 1 to the stock price
        double newPrice = stockPrice + 1;
        System.out.println("New price (stock price + 1): " + newPrice);

// Convert double to String (you can format it if needed)
        String newPriceStr = String.valueOf(newPrice);
        System.out.println("New price as string: '" + newPriceStr + "'");

// Now send this string to the SetLimitPrice field
        SetLimitPrice.sendKeys(newPriceStr);
        System.out.println("Sent to SetLimitPrice field: '" + newPriceStr + "'");

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        System.out.println("=== ENDING STOCK PRICE EXTRACTION ===");

    }


    public void EnterThePurchaseAmount() throws InterruptedException {
        Thread.sleep(3000);
        String tmp = FoxoStockPrice.getAttribute("content-desc"); // e.g., "FOXO\n₹13.78"

        BigDecimal stockPrice = BigDecimal.ZERO;
        if (tmp.contains("₹")) {
            String priceStr = tmp.split("₹")[1].trim(); // "13.78"
            stockPrice = new BigDecimal(priceStr);
        }

        System.out.println("Stock Price extracted: ₹" + stockPrice);

        // Add ₹5
        BigDecimal purchaseAmount = stockPrice.add(BigDecimal.valueOf(5));
        String amountToEnter = purchaseAmount.toPlainString(); // avoid scientific notation

        System.out.println("Amount to enter: ₹" + amountToEnter);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until EnterAmountValue is visible BEFORE clicking the coordinate
        wait.until(ExpectedConditions.visibilityOf(EnterAmountValue));

        basePage.ClickUsingCoordinate(211, 695);  // Taps at given coordinates

        // Wait again in case there's a delay before the input is ready
        wait.until(ExpectedConditions.elementToBeClickable(EnterAmountValue));

        // Send the calculated amount
        EnterAmountValue.sendKeys(amountToEnter);

        // Perform keyboard action (e.g., pressing "Go" on soft keyboard)
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }


    public void ValidateCalculationForQuantityField() throws InterruptedException {
        Thread.sleep(3000);

        // Get values from UI
        String enteredAmountStr = EnteredAmt.getText();      // E.g., "1000"
        String quantityStr = GetQuantity.getText();          // E.g., "72.5"
        String stockInfo = FoxoStockPrice.getAttribute("content-desc"); // E.g., "FOXO\n₹13.78"

        System.out.println("Entered amt is "+ enteredAmountStr);
        System.out.println("Quantity showing on UI"+ quantityStr);
        System.out.println("Stock Price is " + stockInfo);





        // Extract stock price from the string
        BigDecimal stockPrice = BigDecimal.ZERO;
        if (stockInfo.contains("₹")) {
            // Remove ₹ and any non-numeric characters except dot and digits
            String priceStr = stockInfo.replaceAll("[^0-9.]", "").trim();  // "13.78"
            stockPrice = new BigDecimal(priceStr);
        }

        System.out.println("Stock Price extracted: ₹" + stockPrice);

        // Convert entered amount to BigDecimal
        String cleanAmountStr = enteredAmountStr.replaceAll("[^0-9.]", "").trim();
        BigDecimal enteredAmount = new BigDecimal(cleanAmountStr);

        System.out.println("Entered amt is " + enteredAmount);


        // Perform quantity = amount / price (with scale and rounding mode)
        BigDecimal expectedQuantity = enteredAmount.divide(stockPrice, 8, RoundingMode.HALF_UP);

        System.out.println("Expected Quantity using formula: " + expectedQuantity);

        // Convert actual quantity from UI
       // BigDecimal actualQuantity = new BigDecimal(quantityStr);
        // Convert actual quantity from UI (cleaning ₹ and text)
       // String cleanQuantityStr = quantityStr.replaceAll("[^0-9.]", "").trim();
        BigDecimal actualQuantity = new BigDecimal(quantityStr);




        // Compare expected and actual quantities
        if (expectedQuantity.compareTo(actualQuantity) == 0) {
            System.out.println("✅ Quantity is correct.");
        } else {
            System.out.println("❌ Quantity mismatch! Expected: " + expectedQuantity + ", Actual: " + actualQuantity);
        }

        // Optionally, assert
        // Assert.assertEquals(expectedQuantity, actualQuantity);*/




    }


    public void EnterThePurchaseQuantity() {


    }

    public void ValidateCalculationForAmountField() throws InterruptedException {
        Thread.sleep(3000);

        // Get and clean entered amount
        String enteredAmountStr = EnteredAmt.getText();
        System.out.println("Visible amt is " + enteredAmountStr);
        String cleanAmountStr = enteredAmountStr.replaceAll("[^0-9.]", "").trim();
        BigDecimal enteredAmount = new BigDecimal(cleanAmountStr);

        // Round to 2 decimal places
        enteredAmount = enteredAmount.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Amt after removing extra characters and rounding: " + enteredAmount);

        // Get and clean stock price
        String stockInfo = FoxoStockPrice.getAttribute("content-desc"); // e.g., "FOXO\n₹13.78"
        BigDecimal stockPrice = BigDecimal.ZERO;
        if (stockInfo.contains("₹")) {
            String priceStr = stockInfo.replaceAll("[^0-9.]", "").trim();  // Extract "13.78"
            stockPrice = new BigDecimal(priceStr);
        }

        System.out.println("Stock Price after cleaning: " + stockPrice);

        // Multiply stockPrice by 2
        BigDecimal temp = stockPrice.multiply(new BigDecimal("2.0")).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Expected Amount (StockPrice * 2): " + temp);

        // Assert both amounts are equal
        Assert.assertEquals(enteredAmount, temp);
    }

    public void ClickOnTotalFeeDropdown() throws InterruptedException {
        Thread.sleep(5000);
        int x =629;
        int y = 1027;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

    }

    public void CalculatePlatFormFee() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait until the validation element is visible
        wait.until(ExpectedConditions.visibilityOf(Total_Fee_Heading));
        System.out.println("Order placement validation element is visible.");

        // Extract the content-desc value
        String temp = PlatformFeeAmt.getAttribute("content-desc");  // e.g., "Platform Fee\n₹2.00"
        System.out.println("Raw content-desc: " + temp);

        // Remove everything except digits and dot
        String numberStr = temp.replaceAll("[^0-9.]", "").trim();  // "2.00"
        System.out.println("Cleaned amount string: " + numberStr);

        // Convert to BigDecimal and extract integer part
        BigDecimal feeAmount = new BigDecimal(numberStr);
        int platformFeeInt = feeAmount.intValue();  // Will be 2

        // Expected value
        int expectedFee = 2;

        // Print match result
        if (platformFeeInt == expectedFee) {
            System.out.println("✅ Platform Fee match: Expected = " + expectedFee + ", Actual = " + platformFeeInt);
        } else {
            System.out.println("❌ Platform Fee mismatch: Expected = " + expectedFee + ", Actual = " + platformFeeInt);
        }

        // Assert
        Assert.assertEquals( platformFeeInt, expectedFee);
    }


}