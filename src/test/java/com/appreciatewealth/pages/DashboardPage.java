package com.appreciatewealth.pages;

import com.appreciatewealth.utils.TestUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.IOException;

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

    public void NavigatetoDashboard() throws IOException, InterruptedException {
        Thread.sleep(8000);
        signInPage.Signin();
        Thread.sleep(8000);
        //clickonViewDashboard.click();

    }
    public void ClickOnGoToDashboard() throws InterruptedException {
        Thread.sleep(8000);
        clickonViewDashboard.click();
    }

    public void ValidateAddFund() throws InterruptedException {
        Thread.sleep(5000);
       boolean IsFundDisplayed = addFunds.isDisplayed();
       if(IsFundDisplayed){
           utils.log().info("Add funds button is displayed");
       }else{
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
        if(IsMoneyTransferScreenPresent){
            utils.log().info("Money transfer screen is displayed");
        }else{
            utils.log().info("Money transfer screen is not displayed");
        }

    }

    public void ClickClose() throws InterruptedException {
        Thread.sleep(5000);
        MoneyTransferClose.click();
    }




}
