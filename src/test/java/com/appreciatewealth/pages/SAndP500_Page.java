package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SAndP500_Page extends BasePage{
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();

    public SAndP500_Page() {
        this.basePage = new BasePage();
        this.signInPage = new SignInPage();

    }

    @AndroidFindBy(xpath = "//*[contains(@text,'Accounts')]")
    private WebElement test;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"S&P500\n" +
            "0.12%\"]")
    private WebElement SAndP500;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"DOW\n" +
            "1.40%\"]")
    private WebElement DOW;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"NASDAQ\n" +
            "0.04%\"]")
    private WebElement NASDAQAtHomeDashboard;


    @AndroidFindBy(accessibility = "Market Indices")
    private WebElement MarketIndicesPage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"S&P500\n" +
            "Tab 2 of 3\"]")
    private WebElement SAndPTab;


    @AndroidFindBy(accessibility = "Tracking movement of the ETFs")
    private WebElement TrackingMovement;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '%')])[4]")
    private WebElement TrackingMovementPercentage;


    @AndroidFindBy(accessibility = "Invest via ETFs")
    private WebElement InvestViaETFs;

    @AndroidFindBy(accessibility = "Top Holdings")
    private WebElement TopHolding;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'SPY')]")
    private WebElement SpyETF;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'VOO')]")
    private WebElement VOOETF;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'IVV')]")
    private WebElement IVVETF;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DOW\n" +
            "Tab 1 of 3\"]")
    private WebElement Dow;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"NASDAQ\n" +
            "Tab 3 of 3\"]")
    private WebElement NASDAQ;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'GOOGL') and contains(@content-desc, 'Alphabet Inc. Class A')]")
    private WebElement GoogleStock;


    @AndroidFindBy(id = "btnBuy")
    private WebElement BuyCTA;


    @AndroidFindBy(xpath = "//*[@text='Please enter the Amount or Qty to buy']")
    private WebElement EnterAmtHeading;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'SPY') and contains(@content-desc, 'S&P 500') and contains(@content-desc, 'ETF Trust SPDR')]")
    private WebElement SPYStock;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Holdings\n" +
            "Weighting\"]")
    private WebElement HoldingsAndWeighting;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.appreciatewealth.android:id/editText\" and @text=\"₹0.00\"]")
    private WebElement AmountField;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.appreciatewealth.android:id/editText\" and @text=\"₹0.00\"]")
    private WebElement EnterAmt;





    public void ClickOnSAndP500() throws InterruptedException {
        Thread.sleep(4000);
        SAndP500.click();

    }

    public void VerifyMarketIndicesPage() throws InterruptedException {
        Thread.sleep(3000);
        MarketIndicesPage.isDisplayed();
    }

    public void VerifySAndPageDetailsPage() throws InterruptedException {
        Thread.sleep(3000);
        MarketIndicesPage.isDisplayed();
        SAndPTab.isDisplayed();
        SAndPTab.click();
        Thread.sleep(2000);

        TrackingMovement.isDisplayed();

        String temp =  TrackingMovementPercentage.getAttribute("content-desc");
        System.out.println("Tracking movement percentage is " + temp);

        Thread.sleep(2000);
        InvestViaETFs.isDisplayed();
        TopHolding.isDisplayed();

        Thread.sleep(2000);
        SpyETF.isDisplayed();
        VOOETF.isDisplayed();
        IVVETF.isDisplayed();

    }

    public void NavigateToDow() throws InterruptedException {
        Thread.sleep(3000);
        Dow.click();
        Thread.sleep(2000);
        InvestViaETFs.isDisplayed();

    }

    public void NavigateToNASDAQ() throws InterruptedException {
        Thread.sleep(3000);
        NASDAQ.click();
        Thread.sleep(2000);
        InvestViaETFs.isDisplayed();
    }

    public void ClickOnBackArrow() throws InterruptedException {
        Thread.sleep(3000);
        int x =68;
        int y = 116;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void ClickOnTopHoldingStock() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);

        GoogleStock.click();
    }

    public void ClickOnBuyButton() throws InterruptedException {
        Thread.sleep(3000);
        BuyCTA.click();

    }

    public void VerifyEnterAmtPage() throws InterruptedException {
        Thread.sleep(5000);
        EnterAmtHeading.isDisplayed();

    }

    public void ClickOnStockUnderInvestViaETFs() throws InterruptedException {
        Thread.sleep(3000);
        SPYStock.click();
    }

    public void VerifyHoldingsAndWeighting() throws InterruptedException {
        Thread.sleep(3000);
        HoldingsAndWeighting.isDisplayed();
    }

    public void ClickOnDOW() throws InterruptedException {
        Thread.sleep(4000);
        DOW.click();
    }

    public void ClickOnNASDAQ() throws InterruptedException {
        Thread.sleep(4000);
        NASDAQAtHomeDashboard.click();
    }

    public void EnterAmount(String number) throws InterruptedException {
        Thread.sleep(3000);
        AmountField.click();
        Thread.sleep(2000);
        EnterAmt.sendKeys(number);
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }
}
