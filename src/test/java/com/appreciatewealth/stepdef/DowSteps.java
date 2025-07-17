package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.DowPage;
import com.appreciatewealth.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class DowSteps extends BasePage {
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();

    @Given("User select DOW index")
    public void user_select_dow_index() throws InterruptedException {
       new DowPage().ClickOnDOWTab();
    }

    @And("User click on DIA stock under DOW tab")
    public void userClickOnDIAStockUnderDOWTab() throws InterruptedException {
        new DowPage().ClickOnDIAStock();
    }

    @And("User click on stock under top holdings of DOW section")
    public void userClickOnStockUnderTopHoldingsOfDOWSection() throws InterruptedException {
        new DowPage().ClickOnYourHoldingsStockForDOW();
    }
}
