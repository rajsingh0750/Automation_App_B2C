package com.appreciatewealth.pages;

import com.appreciatewealth.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class GoalsLRSPage extends BasePage{
    TestUtils utils = new TestUtils();
    DashboardPage dashboardPage;
    public GoalsLRSPage() {
        this.dashboardPage = new DashboardPage();
    }

    @AndroidFindBy(xpath = "//*[@text='add funds']")
    private WebElement AddFunds;

    @AndroidFindBy(xpath = "//*[@text='add money to buying power']")
    private WebElement BuyingPower;


}
