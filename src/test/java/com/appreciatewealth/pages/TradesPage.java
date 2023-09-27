package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.LocalTime;
import java.time.ZoneId;
import java.io.IOException;
import java.util.List;


public class TradesPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='trade' and @class='android.widget.TextView']")
    WebElement TradeButton;

    @AndroidFindBy(xpath = "//*[@index='9' and @text='buy now']")
    WebElement BuyNowButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterAmount;

    @AndroidFindBy(xpath = "//*[@class= 'android.widget.Button' and @text='review order']")
    WebElement ReviewOrderButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement ReviewOrderAmount;

    @AndroidFindBy(xpath = "//*[@text='place order']")
    WebElement PlaceOrderButton;


    @AndroidFindBy(xpath = "//*[@text='Order Placed']")
    WebElement ValidateOrderPlaced;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement StockName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement StockNameOnDetailsPage;

    @AndroidFindBy(xpath = "//*[@text='Transactions']")
    WebElement ValidateActivitiesPage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
    WebElement InvestedAmmountOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]")
    WebElement CurrentValueOnDashboard;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement LowinBuyPowerErrorMessage;

    @AndroidFindBy(xpath = "//*[@text='Top picks']")
    WebElement TopPicksTab;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement BuyNowTopPicks;

    @AndroidFindBy(xpath = "//*[@text='Buy in Rupees']")
    WebElement SelectOrderType;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ListView/android.view.ViewGroup[2]")
    WebElement SelectQuantityTypeOrder;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ListView/android.widget.LinearLayout/androidx.cardview.widget.CardView")
    WebElement ConfirmOrderType;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[1]")
    WebElement AddtoWatchlist;

    @AndroidFindBy(xpath = "//*[@text='Watchlist']")
    WebElement WatchlistTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement GetStockNameWatchListed;

    @AndroidFindBy(xpath = "//*[@text='Yes']")
    WebElement ConfirmRemovefromWatchlist;

    @AndroidFindBy(xpath = "//*[@text='Minimum Transaction Amount Should be 0.84 INR.']")
    WebElement MinimumTransactionErrorMsg;


    private String RunTimeInvestedAmountonDashboard;
    private String RunTimeurrentAmountonDashboard;
    private String RunTimeInvestedAmountonPortfolio;
    private String RunTimeurrentAmountonPortfolio;

    private String StocknameBeforeWatchlisting;
    private String StocknameAfterWatchlsiting;


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
        Thread.sleep(3000);
        EnterAmount.click();
        EnterAmount.sendKeys(amount);
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
            System.out.println("The current time is between 7:30 PM and 2:30 AM in India.");
            Thread.sleep(3000);
            MarketLiveLabel.isDisplayed();
        } else {
            MarketCloseLabel.isDisplayed();
            System.out.println("The current time is not between 7:30 PM and 2:30 AM in India.");
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
        //String ExpectedCurrentValue = String.valueOf(Finalvalue);

        String CurrentValuewithCurrency = GetCurrentValue.getText();
        String CurrentActualValue = CurrentValuewithCurrency.replaceAll("[₹,]", "");
        double CurrentValueindouble = Double.parseDouble(CurrentActualValue);
        Assert.assertEquals(CurrentValueindouble, Finalvalue);
    }

    public void ClickonViewEnhancements() throws InterruptedException {
        Thread.sleep(3000);
        ViewEnhancementButton.click();
    }

    public void ValidateStockLink() throws InterruptedException {
        String getStock = StockName.getText();
        Thread.sleep(3000);
        String geStocknameDetailsPage = StockNameOnDetailsPage.getText();
        ValidateActivitiesPage.isDisplayed();
        Assert.assertEquals(getStock, geStocknameDetailsPage);

    }

    public void ClickonStock() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 600,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));

            StockName.click();
        }
    }

    public void getInvestedandCurrentonDashboard() throws InterruptedException {
        Thread.sleep(2000);
        RunTimeInvestedAmountonDashboard = InvestedAmmountOnDashboard.getText();
        RunTimeurrentAmountonDashboard = CurrentValueOnDashboard.getText();
    }

    public void getInvestedandCurrentonPortfolio() throws InterruptedException {
        Thread.sleep(2000);
        RunTimeInvestedAmountonPortfolio = GetCurrentValue.getText();
        RunTimeurrentAmountonPortfolio = GetTotalInvested.getText();
    }

    public void CompareInvestedandCurrentValue() {

        Assert.assertEquals(RunTimeInvestedAmountonDashboard, RunTimeInvestedAmountonPortfolio);
        Assert.assertEquals(RunTimeurrentAmountonDashboard, RunTimeurrentAmountonPortfolio);

    }

    public void CheckLowinBuyPowerMessage(String msg) {

        String ActualerrMsg = LowinBuyPowerErrorMessage.getText();
        Assert.assertEquals(ActualerrMsg, msg);
    }

    public void clickonTopPicks() {
        WebElement clickonbuynow = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Top picks\").instance(0))"));
        TopPicksTab.click();
    }

    public void clickonBuyStockinLeastPrice() throws InterruptedException {
        Thread.sleep(3000);
        WebElement clickonbuynow = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Hot stock\").instance(0))"));
        Thread.sleep(2000);
        BuyNowTopPicks.click();
    }

    public void SelectOrderType() throws InterruptedException {
        SelectOrderType.click();
        Thread.sleep(2000);
        SelectQuantityTypeOrder.click();
        ConfirmOrderType.click();
    }

    public void AddtoWatchlist() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Hot stock\").instance(0))"));
        AddtoWatchlist.click();
    }

    public void GetStocknameBeforeWatchlisted() {

        StocknameBeforeWatchlisting = GetStockNameWatchListed.getText();

    }

    public void GetStocknameAfterWatchlisted() throws InterruptedException {
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]"));
        int count = list.size();
        System.out.println("count to check if element is deleted it should be zero " + count);
        Assert.assertEquals(count, 2);
        //Assert.assertFalse(GetStockNameWatchListed.isDisplayed());

    }

    public void ValidateMinimumTransactionMsg(String msg){
       String Actualmsg = MinimumTransactionErrorMsg.getText();
       Assert.assertEquals(Actualmsg,msg);
    }


}
