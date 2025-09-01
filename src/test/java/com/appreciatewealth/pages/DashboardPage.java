package com.appreciatewealth.pages;

import com.appreciatewealth.utils.TestUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DashboardPage extends BasePage {
    TestUtils utils = new TestUtils();
    SignInPage signInPage;

    public DashboardPage() {
        this.signInPage = new SignInPage();
    }

    @AndroidFindBy(xpath = "//*[@text='go to dashboard']")
    private WebElement clickonViewDashboard;

    @AndroidFindBy(xpath = "//*[@text='add funds']")
    private WebElement addFunds;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private WebElement ValidateMoneyTransferPage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement MoneyTransferClose;

    @AndroidFindBy(accessibility = "skip")
    private WebElement Skip;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"view all\"])[1]")
    private WebElement NewsViewAll;

    @AndroidFindBy(accessibility = "News")
    private WebElement NewsText;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"view all\"])[3]")
    private WebElement YearHighViewAll;

    @AndroidFindBy(accessibility = "US Year High Today")
    private WebElement USYearHighText;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"view all\"])[2]")
    private WebElement TopGainerViewAll;

    @AndroidFindBy(accessibility = "Top Gainers")
    private WebElement TopGainersText;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"view all\"])[2]")
    private WebElement PopularStocksViewAll;

    @AndroidFindBy(accessibility = "Popular Stocks")
    private WebElement PopularStocksText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    private WebElement NewsSearch;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")
    private WebElement NewsResults;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]/android.widget.Button")
    private WebElement NewsClear;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]")
    private WebElement HomeRewards;


    @AndroidFindBy(accessibility = "Refer a friend")
    private WebElement HomeReferFriend;


    @AndroidFindBy(id = "back")
    private WebElement RewardBack;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]")
    private WebElement Notification;


    @AndroidFindBy(accessibility = "Notifications")
    private WebElement NotificationText;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    private WebElement NotificationBack;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Appreciate\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]")

    private WebElement SearchStock;



    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement SendStockName;


//    @AndroidFindBy(xpath = " //android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
//    private WebElement NewsSearch;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'results found')]")
    private WebElement StocksCount;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Recently viewed\"]")
    private WebElement RecentlyviewedPage;

    @AndroidFindBy(accessibility = "Recently viewed")
    private WebElement RecentlyViewedSection;


    @AndroidFindBy(accessibility = "Top Picks")
    private WebElement TopPicks;


    @AndroidFindBy(accessibility = "Scrim")
    private WebElement CrossIcon;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"APLE\n" +
            "Apple Hospitality REIT, Inc.\n" +
            "EQUITY\"]")
    private WebElement StocksDetail;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"News\n" +
            "Tab 3 of 4\"]")
    private WebElement NewsTab;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"ANAERGIA INC: VIA UNIT, AWARDED PUBLIC TENDER BY ASA LIVORNO WITH TOTAL INVESTMENT IN PROJECT OF ABOUT C$25 MLN\n" +
            "2 Jul, 2025 11:55 AM\"]")
    private WebElement StockNews;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"US Stocks\n" +
            "Tab 1 of 4\"]")
    private WebElement UsStocks;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mutual funds\n" +
            "Tab 2 of 4\"]")
    private WebElement MutualFunds;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"News\n" +
            "Tab 3 of 4\"]")
    private WebElement News;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Research\n" +
            "Tab 4 of 4\"]")
    private WebElement ReasearchTab;


    @AndroidFindBy(accessibility = "Choose from a crafted list")
    private WebElement CraftedListSection;



    @AndroidFindBy(accessibility = "Search")
    private WebElement SearchPage;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Please enter amount or qty to proceed')]")
    private WebElement AmtAndQuantityError;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'UPI limit')]")
    private WebElement UPILimitErrorMessage;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Transaction Limit')]")
    private WebElement AsOfTodayLimitError;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Low funds! Add funds from YES Bank to trade')]")
    private WebElement LowFundWarningMsg;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Minimum Transaction Amount Should be greater than')]")
    private WebElement MinimumTransactionAmount;




    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"FOXO\n" +
            "FOXO Technologies Inc\n" +
            "EQUITY\"]")
    private WebElement FoxoStock;


    @AndroidFindBy(accessibility = "Filter")
    private WebElement FilterCTA;


    @AndroidFindBy(accessibility = "Filter")
    private WebElement FilterPage;



    @AndroidFindBy(accessibility = "Filter(1)")
    private WebElement AppliedFilter;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    WebElement EnterStockName;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterTheStockName;





    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Top Textile Companies in India\n" +
            "11 Mar, 2025 07:52 AM\"]")
    private WebElement ResearchNews;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Top Textile Companies in India\"]")
    private WebElement ResearchNewsHeading;


    @AndroidFindBy(accessibility = "US Top Gainers")
    WebElement USTopGainers;


    @AndroidFindBy(accessibility = "Stocks and ETFs with the highest price gains today in the US Market.")
    WebElement TopGainersHeading;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, ' items')]")
    WebElement TopGainersStocksCount;

    @AndroidFindBy(accessibility = "US Top Losers")
    WebElement USTopLosers;


    @AndroidFindBy(accessibility = "Stocks and ETFs with the highest price drops today in the US Market.")
    WebElement TopLosersHeading;

    @AndroidFindBy(accessibility = "US Year High Today")
    WebElement USYearHighToday;

    @AndroidFindBy(accessibility = "US Year Low Today")
    WebElement USYearLowToday;


    @AndroidFindBy(accessibility = "Stocks and ETFs making 52 week high today.")
    WebElement USYearHighTodayHeading;


    @AndroidFindBy(accessibility = "Stocks and ETFs making 52 week low today.")
    WebElement USYearLowTodayHeading;


    @AndroidFindBy(accessibility = "Buy")
    WebElement BuyCTA;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mutual funds\n" +
            "Tab 2 of 4\"]")
    WebElement MFTab;


    @AndroidFindBy(accessibility = "\uE16A")
    WebElement ClearCrossIcon;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    WebElement MFSearchTab;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterFund;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Nippon India Growth Fund - (G)\n" +
            "Mid Cap Fund\"]")
    WebElement NipponIndiaMF;


    @AndroidFindBy(accessibility = "Returns")
    WebElement ReturnsTab;


    @AndroidFindBy(accessibility = "Overview")
    WebElement OverviewTab;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView[2]")
    WebElement ClearMFSearchBar;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Tesla')]")
    WebElement TeslaNews;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Research\n" +
            "Tab 4 of 4\"]")
    WebElement ResearchTab;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'Apple')]")
    WebElement AppleResearch;



    @AndroidFindBy(accessibility = "No results for '@#'")
    WebElement NoResultsmsg;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"TSLA\n" +
            "Tesla, Inc.\n" +
            "EQUITY\"]")
    WebElement SelectTeslaStock;


    @AndroidFindBy(accessibility = "Industry")
    WebElement IndustryFiler;


    @AndroidFindBy(accessibility = "Consumer Cyclical")
    WebElement ConsumerCyclicalFilter;


    @AndroidFindBy(accessibility = "EQUITY")
    WebElement EquityFilter;


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"\uE16A\"]")
    WebElement SelectCrossIcon;

    @AndroidFindBy(accessibility = "Services")
    WebElement ServicesFilter;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AMZN\n" +
            "Amazon.com Inc.\n" +
            "EQUITY\"]")
    WebElement AmazonStock;


    @AndroidFindBy(accessibility = "ETF")
    WebElement ETF;


    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"View all\"])[1]")
    WebElement ViewAllbtn;

    @AndroidFindBy(accessibility = "View all")
    WebElement TopPicksViewAllbtn;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, ' items')]")
    WebElement TopPicksStocksCount;


    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'AAPL') and contains(@content-desc, 'EQUITY')]")
    WebElement AppleStock;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"TSLA\n" +
            "Tesla, Inc.\n" +
            "EQUITY\"]")
    private WebElement TeslaStockAfterFilter;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"ENFR\n" +
            "Alerian Energy Infrastructure ETF\n" +
            "ETF\"]")
    WebElement ENFR;


    @AndroidFindBy(id = "imgTodayPerformance")
    WebElement PricePerformanceDropdown;


    @AndroidFindBy(id = "imgCompanyStatistics")
    WebElement KeyMetricsDropdown;



    @AndroidFindBy(xpath = "//*[@text='Price Performance']")
    WebElement PricePerformance;

    @AndroidFindBy(xpath = "//*[@text='Key Metrics']")
    WebElement KeyMetrics;


    @AndroidFindBy(accessibility = "Your data is 100% secure\\nIFSCA Registration No.: IFSC/BD/2022-23/0004 NSEIX\\nStock Broker ID: 10059")
    WebElement StockBrokerID;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Daily P&L\n" +
            "Tab 3 of 3\"]")
    WebElement DailyPAndL;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '%')])")
    WebElement USReturnPercentage;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[1]")
    WebElement USStocksReturnAmount;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    WebElement ResearchSearch;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    WebElement EnterResearchName;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"What is an ETF?\n" +
            "10 Dec, 2021 08:57 AM\"]")
    WebElement ETFResearch;


    @AndroidFindBy(accessibility = "What is an ETF?")
    WebElement ETFResearchContentPage;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    WebElement BackArrowResearchContentPage;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"SPY\n" +
            "S&P 500 ETF Trust SPDR\n" +
            "ETF\"]")
    WebElement SpyStock;


    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@text, 'Watchlist')]")
    private WebElement ByDefaultWatchlist;



    @AndroidFindBy(accessibility = "EQUITY")
    WebElement Equity;

    @AndroidFindBy(accessibility = "STOCK")
    WebElement STOCK;


    @AndroidFindBy(accessibility = "Filter(1)")
    WebElement SecondTimeFilter;


    @AndroidFindBy(accessibility = "Clear all")
    WebElement ClearAllCTA;


    @AndroidFindBy(accessibility = "Industry")
    WebElement IndustrySection;

    @AndroidFindBy(accessibility = "All")
    WebElement AllOption;


    @AndroidFindBy(accessibility = "Our Offerings")
    WebElement OurOfferings;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Popular US Stocks\n" +
            "View all\"]")
    WebElement PopularUSStocks;

    @AndroidFindBy(accessibility = "News")
    WebElement NewsSection;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Popular funds\n" +
            "View all \"]")
    WebElement PopularFunds;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Start with ₹100\n" +
            "View all \"]")
    WebElement StartWith_100;

    @AndroidFindBy(accessibility = "Create Goal")
    WebElement CreateGoal;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Year High Today\n" +
            "View all\"]")
    WebElement YearHighToday;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Top Gainers\n" +
            "View all\"]")
    WebElement TopGainers;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Top Losers\n" +
            "View all\"]")
    WebElement TopLosers;

    @AndroidFindBy(accessibility = "Research & Perspectives")
    WebElement ResearchAndPerspectives;


    public void NavigatetoDashboard() throws IOException, InterruptedException {
        Thread.sleep(5000);
       // signInPage.Signin();
        new SignInPage().DynamicSignIn("varshatmysuru1992@gmail.com");
        Thread.sleep(3000);
        //Skip.click();

        //clickonViewDashboard.click();

    }

    public void ClickOnGoToDashboard() throws InterruptedException {
        Thread.sleep(8000);
        clickonViewDashboard.click();
    }

    public void ValidateAddFund() throws InterruptedException {
        Thread.sleep(5000);
        boolean IsFundDisplayed = addFunds.isDisplayed();
        if (IsFundDisplayed) {
            utils.log().info("Add funds button is displayed");
        } else {
            utils.log().info("add funds not displayed");
        }

    }

    public void ClickonFunds() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        Thread.sleep(3000);
        addFunds.click();


    }

    public void ValidateMoneyTransferScreen() throws InterruptedException {
        Thread.sleep(3000);
        boolean IsMoneyTransferScreenPresent = ValidateMoneyTransferPage.isDisplayed();
        if (IsMoneyTransferScreenPresent) {
            utils.log().info("Money transfer screen is displayed");
        } else {
            utils.log().info("Money transfer screen is not displayed");
        }

    }

    public void ClickClose() throws InterruptedException {
        Thread.sleep(5000);
        MoneyTransferClose.click();
    }

    public void ClickNewsViewAll() throws InterruptedException {
        Thread.sleep(5000);
        NewsViewAll.click();
    }

    public void ValidateNewsText() throws InterruptedException {
        Thread.sleep(2000);
        NewsText.isDisplayed();
    }

    public void ClickYearViewAll() throws InterruptedException {
        Thread.sleep(5000);
//        int numberOfScrolls = 1; // Adjust the number of scrolls as needed
//
//        for (int i = 0; i < numberOfScrolls; i++) {
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
//        }
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 800,
                    "direction", "down",
                    "percent", 1.0
            ));
            Thread.sleep(5000);
            //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Year High today\").instance(0))"));
            YearHighViewAll.click();
        }
    }

    public void ValidateYearsHighText() throws InterruptedException {
        Thread.sleep(3000);
        USYearHighText.isDisplayed();
    }

    public void ClickTopGainersViewAll() throws InterruptedException {
        Thread.sleep(5000);
        //int numberOfScrolls = 2; // Adjust the number of scrolls as needed
        //for (int i = 0; i < numberOfScrolls; i++) {
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
    //}

    boolean canScrollMore = true;
        while(canScrollMore)

    {
        canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 1000,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(5000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Top Gainer\").instance(0))"));
        TopGainerViewAll.click();
    }
}


    public void ValidateTopGainersText() throws InterruptedException {
        Thread.sleep(3000);
        TopGainersText.isDisplayed();
    }

    public void ClickPopularStocksViewAll() throws InterruptedException {
        Thread.sleep(5000);
        int numberOfScrolls = 3; // Adjust the number of scrolls as needed
        for (int i = 0; i < numberOfScrolls; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        TopGainerViewAll.click();
    }

    public void ValidatePopularStocksText() throws InterruptedException {
        Thread.sleep(3000);
        PopularStocksText.isDisplayed();
    }

    public void ClickOnReward() throws InterruptedException {
        Thread.sleep(3000);
        HomeRewards.click();
    }

    public void ReferFriendText() throws InterruptedException {
        Thread.sleep(3000);
        HomeReferFriend.isDisplayed();
    }

    public void ClickRewardBack() throws InterruptedException {
        Thread.sleep(3000);
        RewardBack.click();
    }




    public void ClickOnNewsSearch() throws InterruptedException {
        Thread.sleep(3000);
        NewsSearch.click();

    }

    public void NewsTextSearch() throws InterruptedException {
        Thread.sleep(5000);
        NewsSearch.sendKeys("Apple");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        NewsResults.isDisplayed();
    }
    public void SelectNewsClear() throws InterruptedException {
        Thread.sleep(3000);
        NewsClear.click();

    }

    public void SelectNotification() throws InterruptedException {
        Thread.sleep(3000);
       Notification.click();

    }

    public void ValidateNotificationtext() throws InterruptedException {
        Thread.sleep(3000);
        NotificationText.isDisplayed();

    }

    public void SelectNotificationBack() throws InterruptedException {
        Thread.sleep(3000);
        NotificationBack.click();

    }

    public void EnterStockName(String msg) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for SearchStock to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(SearchStock));
        SearchStock.click();

        // Wait for SendStockName to be visible
        wait.until(ExpectedConditions.visibilityOf(SendStockName));
        SendStockName.sendKeys(msg);

        System.out.println("Entering stock name: " + msg);

        //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void CountStocks() throws InterruptedException {
        Thread.sleep(4000);

        String accessibilityId = StocksCount.getAttribute("content-desc");

        String regex = "(\\d+) results found";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accessibilityId);

        if (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("The numeric value is: " + number);
        } else {
            System.out.println("No numeric value found before 'results found'.");
        }

    }

    public void VerifyRecentlyViewedPage() throws InterruptedException {
        Thread.sleep(3000);
        RecentlyviewedPage.isDisplayed();
        CrossIcon.click();
    }

    public void VerifyStocksDetails() throws InterruptedException {
        Thread.sleep(3000);
        StocksDetail.isDisplayed();

    }

    public void SelectNewsTab() throws InterruptedException {
        Thread.sleep(4000);
        NewsTab.click();
    }

    public void VerifyStockNews() throws InterruptedException {
        Thread.sleep(4000);
        StockNews.isDisplayed();

    }

    public void VerifyUSStock() throws InterruptedException {
        Thread.sleep(3000);
        UsStocks.isDisplayed();
    }

    public void VerifyFilterCTAUnderSearchPage() throws InterruptedException {
        Thread.sleep(3000);
        FilterCTA.isDisplayed();
    }


    public void VerifyResearchMNewsContent() throws InterruptedException {
        Thread.sleep(6000);
        ReasearchTab.click();
       // ResearchNews.isDisplayed();
        Thread.sleep(3000);
        ResearchNews.click();
        Thread.sleep(8000);
        ResearchNewsHeading.isDisplayed();

    }

    public void SelectFilterCTA() throws InterruptedException {
        //AppliedFilter.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(FilterPage));
        FilterPage.click();
    }

    public void VerifyFilterCTA() throws InterruptedException {
        Thread.sleep(3000);
        FilterPage.isDisplayed();

    }

    public void EnterStockNameUnderNewsTab(String msg) throws InterruptedException {
        Thread.sleep(5000);
        EnterStockName.click();
        EnterTheStockName.sendKeys(msg);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));


    }

    public void SelectUSTopGainersOption() throws InterruptedException {
        Thread.sleep(4000);
        USTopGainers.click();

    }

    public void VerifyCountOfTopGainersStocks() throws InterruptedException {
        Thread.sleep(3000);
        USTopGainers.click();
        Thread.sleep(4000);
        TopGainersHeading.isDisplayed();
        String accessibilityId = TopGainersStocksCount.getAttribute("content-desc");

        String regex = "(\\d+) items";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accessibilityId);

        if (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("The numeric value is: " + number);
        } else {
            System.out.println("No items found");
        }
    }

    public void SelectUSTopLosersOption() throws InterruptedException {
        Thread.sleep(4000);
        USTopLosers.click();

    }

    public void VerifyCountOfTopLosersStocks() throws InterruptedException {
        Thread.sleep(3000);
        USTopLosers.click();
        Thread.sleep(4000);
        TopLosersHeading.isDisplayed();
        String accessibilityId = TopGainersStocksCount.getAttribute("content-desc");

        String regex = "(\\d+) items";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accessibilityId);

        if (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("The numeric value is: " + number);
        } else {
            System.out.println("No items found");
        }
    }

    public void SelectUSYearHighTodayOption() throws InterruptedException {
        Thread.sleep(4000);
        USYearHighToday.click();

    }

    public void VerifyCountOfUSYearHighTodayStocks() throws InterruptedException {
        Thread.sleep(3000);
        USYearHighToday.click();
        Thread.sleep(4000);
        USYearHighTodayHeading.isDisplayed();
        String accessibilityId = TopGainersStocksCount.getAttribute("content-desc");

        String regex = "(\\d+) items";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accessibilityId);

        if (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("The numeric value is: " + number);
        } else {
            System.out.println("No items found");
        }
    }

    public void EnterStockNameUnderSearchPage() throws InterruptedException {
        Thread.sleep(5000);
        SearchStock.click();
        SearchStock.sendKeys("@#");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void VerifyNoResultsmsg() throws InterruptedException {
        Thread.sleep(4000);
        NoResultsmsg.isDisplayed();
    }

    public void GoToTeslaStock() throws InterruptedException {
        Thread.sleep(5000);
//        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//                "left", 100, "top", 100, "width", 600, "height", 700,
//                "direction", "down",
//                "percent", 1.0
//        ));
        SelectTeslaStock.click();
        Thread.sleep(4000);

    }

    public void ApplyTeslaFilter() throws InterruptedException {
        Thread.sleep(4000);
        IndustryFiler.click();
        ConsumerCyclicalFilter.click();

    }

    public void ApplyMultiFilterforAmazon() throws InterruptedException {
        Thread.sleep(4000);
        ETF.click();
        IndustryFiler.click();
        Thread.sleep(3000);
        ServicesFilter.click();

    }

    public void VerifyAmazonStock() throws InterruptedException {
        Thread.sleep(4000);
        AmazonStock.isDisplayed();
    }

    public void SelectETF() throws InterruptedException {
        Thread.sleep(3000);
        ETF.click();
    }

    public void SelectEquity() throws InterruptedException {
        Thread.sleep(3000);
        EquityFilter.click();
    }

    public void ClearSearchBar2() throws InterruptedException {
        Thread.sleep(3000);
        EquityFilter.click();
    }


    public void ClearSearchBar() throws InterruptedException {
        Thread.sleep(3000);
        SelectCrossIcon.click();
    }

    public void SelectViewAll() throws InterruptedException {
        Thread.sleep(3000);
        ViewAllbtn.click();
    }

    public void AddStockIntoWatchlist() throws InterruptedException {
        Thread.sleep(3000);
        int x =649;
        int y = 747;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void SelectWatchlist() throws InterruptedException {
        Thread.sleep(3000);
        int x =617;
        int y = 1127;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
        Thread.sleep(3000);

    }

    public void VerifyTeslaStockAfterFilter() throws InterruptedException {
        Thread.sleep(4000);
        TeslaStockAfterFilter.isDisplayed();
        new DashboardPage().CountStocks();

    }


    public void SelectDailyPAndL() throws InterruptedException {
        Thread.sleep(4000);
        DailyPAndL.click();
    }

    public void VerifyReturnPercentage() throws InterruptedException {
        Thread.sleep(4000);
        try {
            String return_percentage = USReturnPercentage.getAttribute("content-desc");
            
            // Remove the % symbol and convert to double
            String numericValue = return_percentage.replace("%", "");
            double percentage = Double.parseDouble(numericValue);
            
            // Check if decimal places are exactly 2
            String[] parts = numericValue.split("\\.");
            if (parts.length > 1 && parts[1].length() > 2) {
                Assert.fail("Return percentage should have exactly 2 decimal places. Current value: " + return_percentage + "%");
            }
            
            // Format the percentage with 2 decimal places
            String formattedPercentage = String.format("%.2f", percentage);
            
            // Add back the % symbol
            String finalPercentage = formattedPercentage + "%";
            
            if (percentage == 0) {
                Assert.fail("Return percentage cannot be 0%. Current value: " + finalPercentage);
            } else {
                System.out.println("US Stocks percentage is " + finalPercentage);
            }
        } catch (Exception e) {
            System.out.println("Error occurred while verifying return percentage: " + e.getMessage());
            Assert.fail("Failed to verify return percentage: " + e.getMessage());
        }
    }

    public void VerifyReturnAmount() throws InterruptedException {
        Thread.sleep(4000);
        try {
            String return_amt = USStocksReturnAmount.getAttribute("content-desc");

            // Remove the ₹ symbol and convert to double
            String numericValue = return_amt.replace("₹", "");
            double amount = Double.parseDouble(numericValue);

            // Check if decimal places are exactly 2
            String[] parts = numericValue.split("\\.");
            if (parts.length > 1 && parts[1].length() > 2) {
                Assert.fail("Return amount should have exactly 2 decimal places. Current value: ₹" + return_amt);
            }

            // Format the amount with 2 decimal places
            String formattedAmount = String.format("%.2f", amount);

            // Add back the ₹ symbol
            String finalAmount = "₹" + formattedAmount;

            if (amount == 0) {
                Assert.fail("Return amount cannot be 0. Current value: " + finalAmount);
            } else {
                System.out.println("US Stocks return amount is " + finalAmount);
            }
        } catch (Exception e) {
            System.out.println("Error occurred while verifying return amount: " + e.getMessage());
            Assert.fail("Failed to verify return amount: " + e.getMessage());
        }
    }

    public void EnterResearchName(String etf) throws InterruptedException {
        Thread.sleep(3000);
        ResearchSearch.click();
        Thread.sleep(2000);
        EnterResearchName.sendKeys(etf);
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void VerifyResearchContent() throws InterruptedException {
        Thread.sleep(3000);
        ETFResearch.click();
        Thread.sleep(3000);
        ETFResearchContentPage.isDisplayed();
        Thread.sleep(2000);
        BackArrowResearchContentPage.click();

    }

    public void ClickOnSpyStock() throws InterruptedException {
        Thread.sleep(3000);
        SpyStock.click();
    }

    public void VerifyAllVisibleSection() throws InterruptedException {
        Thread.sleep(5000);
        SearchPage.isDisplayed();
        UsStocks.isDisplayed();
        MutualFunds.isDisplayed();
        News.isDisplayed();
        ReasearchTab.isDisplayed();
        CraftedListSection.isDisplayed();
        RecentlyViewedSection.isDisplayed();
        ViewAllbtn.isDisplayed();


    }

    public void VerifyCountOfUSYearLowTodayStocks() throws InterruptedException {
        Thread.sleep(3000);
        USYearLowToday.click();
        Thread.sleep(4000);
        USYearLowTodayHeading.isDisplayed();
        String accessibilityId = TopGainersStocksCount.getAttribute("content-desc");

        String regex = "(\\d+) items";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accessibilityId);

        if (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("The numeric value is: " + number);
        } else {
            System.out.println("No items found");
        }
    }

    public void VerifyRecentlyViewedSection() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(RecentlyViewedSection));
        // clicking on stock under recently viewed
        Thread.sleep(2000);
        int x =367;
        int y = 1055;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        Thread.sleep(5000);
        BuyCTA.isDisplayed();


    }

    public void VerifyRecentlyViewedFromViewAllButton() throws InterruptedException {
        Thread.sleep(3000);
        ViewAllbtn.click();

        Thread.sleep(3000);
        RecentlyviewedPage.isDisplayed();

        // clicking on stock using coordinate not getting xpath
        int x =387;
        int y = 1360;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        Thread.sleep(3000);
        BuyCTA.isDisplayed();

    }

    public void ClickOnTopPicksStock() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(3000);

        // clicking on top picks stocks

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(TopPicks));

        int x =345;
        int y = 1241;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        Thread.sleep(5000);
        BuyCTA.isDisplayed();

    }

    public void VerifyTopPicksFromViewAllButton() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(3000);
        TopPicksViewAllbtn.click();
        Thread.sleep(3000);
        String accessibilityId = TopPicksStocksCount.getAttribute("content-desc");

        String regex = "(\\d+) items";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accessibilityId);

        if (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("The numeric value of top picks stocks are: " + number);
        } else {
            System.out.println("No numeric value found before 'items'.");
        }

    }

    public void ClickOnAppleStock() throws InterruptedException {
        Thread.sleep(4000);
        AppleStock.click();
    }

    public void VerifyStockDetailsPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // waits up to 10 seconds
        wait.until(ExpectedConditions.visibilityOf(BuyCTA));

        // Optional: Add a check to confirm visibility
        if (BuyCTA.isDisplayed()) {
            System.out.println("BuyCTA is visible.");
        } else {
            System.out.println("BuyCTA is NOT visible.");
        }
    }

    public void ClickOnMFTab() throws InterruptedException {
        Thread.sleep(3000);
        MFTab.click();
    }

    public void ClearUSStockSearch() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(ClearCrossIcon));

        ClearCrossIcon.click();
    }

    public void EnterMFName(String nipponIndiaGrowthFund) throws InterruptedException {
        Thread.sleep(3000);
        MFSearchTab.click();
        Thread.sleep(2000);
        EnterFund.sendKeys(nipponIndiaGrowthFund);
    }

    public void ClickOnNipponMFFundName() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(NipponIndiaMF));

        NipponIndiaMF.click();

    }

    public void ValidateMFDetailsPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(OverviewTab));
        OverviewTab.isDisplayed();
    }

    public void ClearMFSearchBar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(SearchPage));
        ClearMFSearchBar.click();
    }

    public void NavigatedToTheNewsDetailsPage() {
        try {
            Thread.sleep(3000);

            // Tap on the specified coordinates
            int x = 363;
            int y = 507;
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence tap = new Sequence(finger, 1);
            tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
            tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(List.of(tap));

            Thread.sleep(3000);

            // Validate if Tesla news is displayed
            if (TeslaNews.isDisplayed()) {
                System.out.println("Tesla news is displayed successfully.");
            } else {
                System.out.println("Tesla news element is not visible. News may not be loading correctly.");
            }

        } catch (NoSuchElementException e) {
            System.out.println("Tesla news element not found. News may not be loading or displayed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while navigating to the News Details Page: " + e.getMessage());
        }
    }

    public void NavigatedToTheResearchDetailsPage() {
        try {
            Thread.sleep(3000);

            // Tap on the specified coordinates
            int x = 363;
            int y = 507;
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence tap = new Sequence(finger, 1);
            tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
            tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(List.of(tap));

            Thread.sleep(8000);

            // Validate if Tesla news is displayed
            if (AppleResearch.isDisplayed()) {
                System.out.println("Tesla news is displayed successfully.");
            } else {
                System.out.println("Tesla news element is not visible. News may not be loading correctly.");
            }

        } catch (NoSuchElementException e) {
            System.out.println("Tesla news element not found. News may not be loading or displayed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while navigating to the News Details Page: " + e.getMessage());
        }
    }

    public void ClickOnResearchTab() throws InterruptedException {
        Thread.sleep(3000);
        ResearchTab.click();
    }

    public void SelectEquityOption() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(Equity));
        Equity.click();
    }
    public void SelectStockOption() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(STOCK));
        STOCK.click();
    }

    public void SecondTimeFilterClick() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(SecondTimeFilter));
        SecondTimeFilter.click();
    }

    public void ClearAppliedFilter() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(ClearAllCTA));
        ClearAllCTA.click();
    }

    public void ClickOnIndustrySection() throws InterruptedException {
        Thread.sleep(3000);
        IndustrySection.click();
    }

    public void SelectOneOptionFromIndustrySection() throws InterruptedException {
        Thread.sleep(3000);
        AllOption.click();
    }

    public void VerifySearchPage() throws InterruptedException {
        Thread.sleep(3000);
        SearchPage.isDisplayed();
    }

    public void ClickOnFoxoStockProd() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            // Wait until the FoxoStock element is visible
            wait.until(ExpectedConditions.visibilityOf(FoxoStock));

            if (FoxoStock.isDisplayed()) {
                FoxoStock.click();
            } else {
                System.out.println("FoxoStock element is not visible. Skipping click.");
            }
        } catch (Exception e) {
            System.out.println("Exception while clicking on FoxoStock: " + e.getMessage());
        }
    }

    public void ValidateAmtAndQuantityError(String s) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(AmtAndQuantityError));

        String msg = AmtAndQuantityError.getAttribute("content-desc");
        System.out.println("Recieved amt and quantity error message " + msg);

    }

    public void ValidateUPILimitErrorMessage(String s) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(UPILimitErrorMessage));

        String msg = UPILimitErrorMessage.getAttribute("content-desc");
        System.out.println("UPI limit error message " + msg);
    }

    public void ValidateMaximumTransactionLimitErrorAsOfToday(String s) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(AsOfTodayLimitError));

        String msg = AsOfTodayLimitError.getAttribute("content-desc");
        System.out.println("As Of today limit error " + msg);
    }

    public void ValidateLowFundWarningMsg(String s) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(LowFundWarningMsg));

        String msg = LowFundWarningMsg.getAttribute("content-desc");
        System.out.println("As Of today limit error " + msg);
    }

    public void ValidateMinimumTransactionAmountWarning(String s) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(MinimumTransactionAmount));

        String msg = MinimumTransactionAmount.getAttribute("content-desc");
        System.out.println("As Of today limit error " + msg);
    }

    public void ValidateOurOfferingsSectionsAlongWithPopularAndNewsSection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOf(OurOfferings));
        wait.until(ExpectedConditions.visibilityOf(PopularUSStocks));
        wait.until(ExpectedConditions.visibilityOf(NewsSection));
    }


    public void ValidatePopularFundsStartSipAlongWithCreateGoalsSection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(PopularFunds));
        wait.until(ExpectedConditions.visibilityOf(StartWith_100));
        wait.until(ExpectedConditions.visibilityOf(CreateGoal));
    }

    public void ValidateYearHighTodayAndTopGainers() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOf(YearHighToday));
        wait.until(ExpectedConditions.visibilityOf(TopGainers));

    }

    public void ValidateTopLosersAndResearchAndPerspectivesSection() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOf(TopLosers));
        wait.until(ExpectedConditions.visibilityOf(ResearchAndPerspectives));
    }

//    public void VerifyDailyReturn() throws InterruptedException {
//        Thread.sleep(4000);
//        try {
//            String daily_return = DailyReturn.getAttribute("content-desc");
//
//            // Remove the ₹ symbol and convert to double
//            String numericValue = daily_return.replace("₹", "");
//            double amount = Double.parseDouble(numericValue);
//
//            // Check if decimal places are exactly 2
//            String[] parts = numericValue.split("\\.");
//            if (parts.length > 1 && parts[1].length() > 2) {
//                Assert.fail("Daily return should have exactly 2 decimal places. Current value: ₹" + daily_return);
//            }
//
//            // Format the amount with 2 decimal places
//            String formattedAmount = String.format("%.2f", amount);
//
//            // Add back the ₹ symbol
//            String finalAmount = "₹" + formattedAmount;
//
//            if (amount == 0) {
//                Assert.assertEquals(finalAmount, "₹0.00", "Daily return should be formatted as ₹0.00 when value is 0");
//            } else {
//                System.out.println("Daily return amount is " + finalAmount);
//            }
//        } catch (Exception e) {
//            System.out.println("Error occurred while verifying daily return: " + e.getMessage());
//            Assert.fail("Failed to verify daily return: " + e.getMessage());
//        }
//    }
}




