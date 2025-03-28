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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import javax.annotation.concurrent.Immutable;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TradesPage extends BasePage {
    BasePage basePage = new BasePage();

    @AndroidFindBy(accessibility = "Portfolio\n" +
            "Tab 2 of 5")

    @iOSXCUITFindBy(accessibility = "Portfolio\n" +
            "Tab 2 of 4")
    WebElement TradeButton;


    @AndroidFindBy(id = "btnBuy")
    WebElement BuyNowButton;

    @AndroidFindBy(xpath = "//*[@text='₹0.00']")
    WebElement EnterAmount;

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

    @AndroidFindBy(xpath = "//*[@text='Order Placed']")
    WebElement ValidateOrderPlaced;


    @AndroidFindBy(xpath = "//*[@text='view in order history']")
    WebElement viewInOrderHistory;


    @AndroidFindBy(xpath = "//*[@text='cancel order']")
    WebElement CancleOrder;


    @AndroidFindBy(xpath = "//*[@text='Yes']")
    WebElement YesButton;


    @AndroidFindBy(xpath = "//*[@text='CANCELLATION IN PROCESS']")
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


    @AndroidFindBy(xpath = "//*[contains(@text,'Low funds! Add funds from YES Bank to trade')]")
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

    @AndroidFindBy(xpath = "//*[@text='Minimum Transaction Amount Should be 0.85 INR.']")
    WebElement MinimumTransactionErrorMsg;

    @AndroidFindBy(xpath = "//*[contains(@text,'Low funds! Add funds from YES Bank to trade')]")
    WebElement TransactionLimitErrorMsg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    WebElement PandLPercentage;

    @AndroidFindBy(xpath = "//*[@text='Pro']")
    WebElement ProTab;

    @AndroidFindBy(xpath = "//*[@text='Limit']")
    WebElement OrderTypeDropdown;
    @AndroidFindBy(xpath = "//*[@text='confirm selection']")
    WebElement ConfirmProOrderType;

    @AndroidFindBy(xpath = "//*[@text='Limit Order']")
    WebElement LimitOrderType;

    @AndroidFindBy(xpath = "//*[@text='Stop']")
    WebElement StopOrderType;

    @AndroidFindBy(xpath = "//*[@text='Market If Touched(MIT)']")
    WebElement MITOrderType;

    @AndroidFindBy(xpath = "//*[@text='0.0']")
    WebElement EnterQuantity;

    @AndroidFindBy(xpath = "//*[@text='0']")
    WebElement EnterTradeQuantity;


    @AndroidFindBy(xpath = "//*[@text='₹0.00']")
    WebElement SetLimitPrice;

    @AndroidFindBy(id = "layoutMainGoodTillNextMarketDay")
    WebElement ExpireTillMarketDayClose;

    @AndroidFindBy(xpath = "//*[contains(@text,'Good till cancelled')]")
    WebElement GoodTillCancelled;



    @AndroidFindBy(xpath = "//*[contains(@text,'Select Date')]")
    WebElement SelectCustomExpiryDate;

    @AndroidFindBy(xpath = "//*[@text='Set time in force']")
    WebElement SelectSetTimeInForce;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[4]/android.widget.TextView[2]")
    WebElement ValidateCustomExpiryDate;
    @AndroidFindBy(xpath = "//*[@text='OK']")
    WebElement ClickOK;

    @AndroidFindBy(xpath = "//*[@text='view details']")
    WebElement ViewDetailsCTA;

    @AndroidFindBy(xpath = "//*[@text='Cashback invites']")
    WebElement CashbackInviteLabel;

    @AndroidFindBy(xpath = "//*[@text='Invites you received']")
    WebElement InvitesReceivedLabel;

    @AndroidFindBy(xpath = "//*[@text='Invites you sent']")
    WebElement InvitesSentLabel;


    @AndroidFindBy(id= "txvOrderTypeValue")
    WebElement ValidateOrderType;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView")
    WebElement ClickonVTStock;

    @AndroidFindBy(xpath = "//*[@text='sell']")
    WebElement SellButton;

    @AndroidFindBy(id = "imgClose")
    WebElement CloseCashbackPopup;

    @AndroidFindBy(xpath = "//*[@text='Sell in Rupees']")
    WebElement SellTypeDropdown;

    @AndroidFindBy(id = "txvOrderTypeValue")
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

    @AndroidFindBy(xpath = "//*[@text='₹6.89']")
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


    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[4]")
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
            "Tab 2 of 4\"]")
    private WebElement USStocks;

    @AndroidFindBy(id = "btnBuy")
    private WebElement BuyNow;


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
        TradeButton.click();

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

        //WebElement clickonbuynow = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        //driver.findElement(By.xpath("//*[@index='9' and @text='buy now']")).click();

        Thread.sleep(6000);
        BuyNow.click();
    }

    public void EnterTradeAmount(String amount) throws InterruptedException {
        // Thread.sleep(5000);
        EnterAmount.click();
        Thread.sleep(5000);
        // ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
        EnterAmount.sendKeys(amount);
        // Thread.sleep(5000);

        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        Thread.sleep(5000);
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
        Thread.sleep(5000);
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
        String Actualmsg = MinimumTransactionErrorMsg.getText();
        Assert.assertEquals(Actualmsg, msg);
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
        Thread.sleep(6000);
        ProTab.click();
    }



    public void SelectProOrderType() throws InterruptedException {
        Thread.sleep(5000);
        OrderTypeDropdown.click();
        Thread.sleep(3000);
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
        EnterQuantity.click();
        EnterQuantity.sendKeys(Quantity);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void EnterLimitPrice(String LimitPrice){
        SetLimitPrice.click();
        SetLimitPrice.sendKeys(LimitPrice);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }
    public void OrderExpirytillMarketClose() throws InterruptedException {
        Thread.sleep(5000);
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
        driver.findElement(AppiumBy.id("constraintChildOtherPicks")).click();
        /*driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));*/
        // WebElement clickonbuynow =

        //ClickonVTStock.click();
    }

    public void EnterSellAmount(String Amount) throws InterruptedException {
        Thread.sleep(6000);
        EnterAmount.click();
        EnterAmount.sendKeys(Amount);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }


    public void ClickOnSell() throws InterruptedException {
        Thread.sleep(5000);
        SellButton.click();
    }
    public void SelectSellType() throws InterruptedException {
        Thread.sleep(4000);
        EnterAmount.click();
    }

    public void ValidateSellOrderType(String OrderType) throws InterruptedException {
        Thread.sleep(8000);
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
        double PostSellHoldings = Double.parseDouble(CurrentHoldings)-1;
        Assert.assertEquals(ActualHoldings,PostSellHoldings);

    }

    public void ValidateMinusSign() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"buy now\").instance(0))"));
        Thread.sleep(4000);
        GetMinusSignInHoldings.isDisplayed();

    }
    public void ValidateAmountDecimals() throws InterruptedException {
        Assert.assertEquals(ValidateAmountDecimals.getText(),"₹6.89");
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
        //ActivityTab.click();
            //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"News\").instance(0))"));
            //Thread.sleep(8000);
            WebElement element = driver.findElement(AppiumBy.xpath("//*[contains(@text,'Activity')]"));
            driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "elementId"  ,((RemoteWebElement)element).getId(),
                    "direction","Right",
                    "percent",1
            ));
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
        EnterTradeQuantity.click();
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
        int startY = 1419; // Y-coordinate remains the same
        int startX = 104;  // Adjust this value for the start position of the swipe
        int endX = 654;   // Adjust this value for the end position of the swipe

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
        Thread.sleep(5000);
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
}