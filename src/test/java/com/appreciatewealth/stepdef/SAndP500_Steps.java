package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.SAndP500_Page;
import com.appreciatewealth.pages.SignInPage;
import com.appreciatewealth.pages.TradesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SAndP500_Steps extends BasePage {
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();


    @Given("User select S&P cta from home dashboard banner")
    public void user_select_s_p_cta_from_home_dashboard_banner() throws InterruptedException {
        new SAndP500_Page().ClickOnSAndP500();
    }

    @Then("User should see market indices page")
    public void userShouldSeeMarketIndicesPage() throws InterruptedException {
        new SAndP500_Page().VerifyMarketIndicesPage();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User should see S&P page details")
    public void userShouldSeeSPPageDetails() throws InterruptedException {
        new SAndP500_Page().VerifySAndPageDetailsPage();
        new SAndP500_Page().NavigateToDow();
        new SAndP500_Page().NavigateToNASDAQ();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User select back arrow at market indices page")
    public void userSelectBackArrowAtMarketIndicesPage() throws InterruptedException {
        new SAndP500_Page().ClickOnBackArrow();
    }

    @And("User click on the stock")
    public void userClickOnTheStock() throws InterruptedException {
        new SAndP500_Page().ClickOnTopHoldingStock();
    }

    @When("User click on Buy button")
    public void userClickOnBuyButton() throws InterruptedException {
        new SAndP500_Page().ClickOnBuyButton();
    }

    @Then("User should be redirected to enter amount and quantity page")
    public void userShouldBeRedirectedToEnterAmountAndQuantityPage() throws InterruptedException {
        new SAndP500_Page().VerifyEnterAmtPage();
        new SAndP500_Page().EnterAmount("1");
        new TradesPage().SliderForBuy();
        new TradesPage().ValidateIfOrderPlaced();
//        basePage.AndroidBack();
//        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User click on the stock under invest via ETFs section")
    public void userClickOnTheStockUnderInvestViaETFsSection() throws InterruptedException {
        new SAndP500_Page().ClickOnStockUnderInvestViaETFs();
    }

    @Then("User should see the details of top holdings section")
    public void userShouldSeeTheDetailsOfTopHoldingsSection() throws InterruptedException {
        new SAndP500_Page().VerifyHoldingsAndWeighting();
        basePage.AndroidBack();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }


    @And("User select DOW cta from home dashboard banner")
    public void userSelectDOWCtaFromHomeDashboardBanner() throws InterruptedException {
        new SAndP500_Page().ClickOnDOW();
    }

    @And("User select NASDAQ cta from home dashboard banner")
    public void userSelectNASDAQCtaFromHomeDashboardBanner() throws InterruptedException {
        new SAndP500_Page().ClickOnNASDAQ();
    }
}
