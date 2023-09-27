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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private WebElement clickonViewDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.Button")
    private WebElement addFunds;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private WebElement ValidateMoneyTransferPage;

    public void NavigatetoDashboard() throws IOException, InterruptedException {
        Thread.sleep(2000);
        signInPage.Signin();
        Thread.sleep(2000);
        clickonViewDashboard.click();

    }

    public void ValidateAddFund() throws InterruptedException {
        Thread.sleep(3000);
       boolean IsFundDisplayed = addFunds.isDisplayed();
       if(IsFundDisplayed){
           utils.log().info("Add funds button is displayed");
       }else{
           utils.log().info("add funds not displayed");
       }

    }

    public void ClickonFunds() throws InterruptedException {

      WebElement Addfundelement =  driver.findElement((AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.Button")));
        /* boolean canScrollMore = (Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                 "left", 100, "top", 100, "width", 600, "height", 600,
                 "direction", "down",
                 "percent", 1.0
         ));*/

         WebElement clickonFunds = driver.findElement((MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrolldIntoView("+ "new UiSelector().text(\"goal calculator\"));")));
        Thread.sleep(3000);
       Addfundelement.click();

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




}
