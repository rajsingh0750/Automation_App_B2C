package com.appreciatewealth.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DowPage extends BasePage{
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();

    public DowPage() {
        this.basePage = new BasePage();
        this.signInPage = new SignInPage();

    }


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"DOW\n" +
            "Tab 1 of 3\"]")
    private WebElement DOWTab;



    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'DIA') and contains(@content-desc, 'Dow Jones') and contains(@content-desc, 'ETF SPDR')]")
    private WebElement DIAStock;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"MCD\n" +
            "McDonald\\'s Corporation\n" +
            "5.70%\"]")
    private WebElement MCDStock;


    public void ClickOnDOWTab() throws InterruptedException {
        Thread.sleep(3000);
        DOWTab.click();
    }

    public void ClickOnDIAStock() throws InterruptedException {
        Thread.sleep(3000);
        DIAStock.click();

    }

    public void ClickOnYourHoldingsStockForDOW() throws InterruptedException {
        Thread.sleep(3000);
        MCDStock.click();
    }
}
