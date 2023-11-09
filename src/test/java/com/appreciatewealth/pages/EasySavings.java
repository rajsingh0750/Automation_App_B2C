package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EasySavings extends BasePage {

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.ImageView")
    WebElement ReferLink;

    @AndroidFindBy (xpath = "//*[@text='Coupons']")
    WebElement CouponsTab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button")
    WebElement AddFunds;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterCoupons;

    @AndroidFindBy (xpath = "//*[@text='apply']")
    WebElement Apply;

    @AndroidFindBy (xpath = "//*[@text='try again']")
    WebElement TryAgain;

    @AndroidFindBy (xpath = "//*[@text='Coupon code already in use']")
    WebElement CouponAlreadyUsedMsg;

    @AndroidFindBy (xpath = "//*[@text='Invalid coupon code']")
    WebElement ValidateInvalidCode;

    @AndroidFindBy (xpath = "//*[contains(@text,'remaining')]")
    WebElement RemainingDeposit;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/tvSavingsMonth")
    WebElement SavingsThisMonth;
    @AndroidFindBy (xpath = "//*[@text='add funds']")
    WebElement AddFundsCommon;

    @AndroidFindBy (xpath = "//*[@text='transfer now']")
    WebElement TransferNow;

    @AndroidFindBy (xpath = "//*[contains(@text,'@')]")
    WebElement SelectUPI;

    @AndroidFindBy (xpath = "//*[@text='go to dashboard']")
    WebElement Dashboard;

    @AndroidFindBy (xpath = "//*[contains(@text,'DAYS')]")
    WebElement DaysRemaining;

    @AndroidFindBy (xpath = "//*[contains(@text,'Appreciate incentive this month')]")
    WebElement IncentiveMessage;

    SignInPage signInPage;
    BasePage basePage;
    DashboardPage dashboardPage;

    private static String capturedValue;
    private static double value;

    private static double CurrentSavingsDouble;
    private static String CurrentRemainingSavings;

    private static double CurrentSavingsModified;

    public EasySavings(){
        this.signInPage = new SignInPage();
        this.dashboardPage= new DashboardPage();
        this.basePage = new BasePage();
    }

    public void clickOnRefer() throws InterruptedException {
        Thread.sleep(4000);
        ReferLink.click();
    }

    public void EnterCouponCode(String Coupons) throws InterruptedException {
        Thread.sleep(2000);
        CouponsTab.click();
        EnterCoupons.click();
        EnterCoupons.sendKeys(Coupons);
        Apply.click();

    }

    public void ValidateErrorMessageCouponAlreadyUsed(String ErrMsg) throws InterruptedException {
        Thread.sleep(3000);
      String ActualMsg =  CouponAlreadyUsedMsg.getText();
        Assert.assertEquals(ActualMsg,ErrMsg);

    }
    public void TryAgain(){
        TryAgain.click();
    }

    public void ClickOnCouponTab() throws InterruptedException {
        Thread.sleep(2000);
        CouponsTab.click();
    }
    public void AddInvalidCoupons(String CouponCode) throws InterruptedException {
        Thread.sleep(2000);
        CouponsTab.click();
        EnterCoupons.click();
        EnterCoupons.sendKeys(CouponCode);
        Apply.click();
        //EnterCoupons.clear();

    }
    public void ClearCoupon(){
        EnterCoupons.clear();
    }
    public void ValidateInvalidCouponMesssage(String ErrorMessage) throws InterruptedException {
        Thread.sleep(2000);
        String ActualMsg= ValidateInvalidCode.getText();
        Assert.assertEquals(ActualMsg,ErrorMessage);

    }

    public void CalculateSavingAndDepositRemaining() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Easy Savings\"))"));

       // String CurrentRemainingAfterPayment = RemainingDeposit.getText();
      //String RemovedRupee =  CurrentRemainingAfterPayment.replaceAll("₹([0-9]*\\.[0-9]+) remaining", "").trim();
        String input = RemainingDeposit.getText();
        String regex = "₹([0-9]*\\.[0-9]+) remaining";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
       capturedValue = matcher.find() ? matcher.group(1) : "";
      double ActualRemaining = Double.parseDouble(capturedValue);
        System.out.println("Captured Remaining amount after Payment: " + capturedValue);

        // String RemovedSymbols = CurrentRemainingDeposit.replaceAll("₹[0-9]*\\.[0-9]+ remaining", "").trim();

            double PostPaymentRemaining = value - 1;
            Assert.assertEquals(ActualRemaining,PostPaymentRemaining);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Savings this month\"))"));
        Thread.sleep(2000);
        CurrentRemainingSavings = SavingsThisMonth.getText();
        String CurrentSavings =CurrentRemainingSavings.replaceAll("[₹,]", "");
       double ActualSavings = Double.parseDouble(CurrentSavings);
            double PostPaymentSavings =  CurrentSavingsModified +1;
            System.out.println("PostPaymentSavings :" +PostPaymentSavings);
        Assert.assertEquals(ActualSavings,PostPaymentSavings);




    }

    public double GetCurrentRemaining() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Savings this month\"))"));
        Thread.sleep(4000);
        String input  = RemainingDeposit.getText();
        //System.out.println(CurrentRemainingDeposit);
        String regex = "₹([0-9]*\\.[0-9]+) remaining";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        capturedValue = matcher.find() ? matcher.group(1) : "";
        //System.out.println("Captured Value before payment: " + capturedValue);
        // String RemovedSymbols = CurrentRemainingDeposit.replaceAll("₹[0-9]*\\.[0-9]+ remaining", "").trim();
        value =  Double.parseDouble(capturedValue);
        System.out.println("Captured Remaining before payment: " + value);
    return value;
    }

    public double GetCurrentSavings() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Savings this month\"))"));
        Thread.sleep(3000);
        CurrentRemainingSavings =SavingsThisMonth.getText();
       String CurrentSavings =CurrentRemainingSavings.replaceAll("[₹,]", "");
         CurrentSavingsModified = Double.parseDouble(CurrentSavings);
        System.out.println(CurrentSavings);
        return CurrentSavingsModified;
    }



    public void TypeAmountForTransfer() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Savings this month\"))"));
        AddFunds.click();
        Thread.sleep(5000);
        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        TransferNow.click();
        Thread.sleep(2000);
        SelectUPI.click();
        TransferNow.click();
        Thread.sleep(35000);
        Dashboard.click();

    }

    public void TypeInvalidAmountForTransfer() throws InterruptedException {
        Thread.sleep(3000);
       // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\"))"));
        //AddFunds.click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
        WebElement element2 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element2).getId()
        ));
        WebElement element3 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));
        WebElement element4 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element4).getId()
        ));
        WebElement element5 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element5).getId()
        ));
        WebElement element6 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element6).getId()
        ));
        WebElement element7 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element7).getId()
        ));


    }

    public void ValidateRemainingDays(){
        LocalDate today = LocalDate.now();
        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        long daysRemaining = ChronoUnit.DAYS.between(today, endOfMonth);
        System.out.println("Days Remaining: "+daysRemaining);
      String finalDays =  daysRemaining+" DAYS";
     String ActualDays = DaysRemaining.getText();
     Assert.assertEquals(ActualDays,finalDays);

    }

    public void TypeAmountTransferForIncentive() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Savings this month\"))"));
        AddFunds.click();
        Thread.sleep(5000);
        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
        WebElement element2 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
        WebElement element3 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
        WebElement element4 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        TransferNow.click();
        Thread.sleep(2000);
        SelectUPI.click();
        TransferNow.click();
        Thread.sleep(8000);
        Dashboard.click();


    }


    public void TypeAmountTransferForBuyingPower() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
        WebElement element2 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        TransferNow.click();
        Thread.sleep(2000);


    }

    public void TypeAmountInvalidInDecimals() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
        WebElement element2 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element2).getId()
        ));

        WebElement element3 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));

        TransferNow.click();
        Thread.sleep(2000);


    }


    public void TypeFullAmount() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));
        WebElement element3 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));

        TransferNow.click();
        Thread.sleep(2000);


    }






    public void ValidateIncentiveMessage() throws InterruptedException {
        if (GetCurrentSavings() >= 500) {
            IncentiveMessage.isDisplayed();
        } else {
            TypeAmountTransferForIncentive();
            Thread.sleep(2000);
            IncentiveMessage.isDisplayed();

        }

    }
}
