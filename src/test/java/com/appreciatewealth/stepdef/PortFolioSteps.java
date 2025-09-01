package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.PortFolioPage;
import com.appreciatewealth.pages.SAndP500_Page;
import com.appreciatewealth.pages.WatchlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;


public class PortFolioSteps extends BasePage {
    BasePage basePage = new BasePage();


    @Given("User click on Portfolio tab")
    public void user_click_on_portfolio_tab() throws InterruptedException {
        new PortFolioPage().ClickOnPortFolioTab();
    }

    @Then("User will verify the calculation for all sections")
    public void userWillVerifyTheCalculationForAllSections() throws InterruptedException {
        new PortFolioPage().VerifyAllTabCalculation();
        new PortFolioPage().SelectUSStockSection();
        new PortFolioPage().VerifyUSStocksTabCalculation();
        new PortFolioPage().SelectGoalsSection();
        new PortFolioPage().VerifyGoalsTabCalculation();
        new PortFolioPage().SelectMFSection();
        new PortFolioPage().VerifyMFTabCalculation();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @Then("User notice the return percentage for us stocks goals and mutual funds")
    public void userNoticeTheReturnPercentageForUsStocksGoalsAndMutualFunds() {
        new PortFolioPage().StoreReturnPercentageValueFromDashboard();
    }

    @And("User selects US Stock tab")
    public void userSelectsUSStockTab() throws InterruptedException {
        new PortFolioPage().SelectUSStockSection();
    }

    @And("User selects goals tab")
    public void userSelectsGoalsTab() throws InterruptedException {
        new PortFolioPage().SelectGoalsSection();
    }

    @And("User selects mutual funds tab")
    public void userSelectsMutualFundsTab() throws InterruptedException {
        new PortFolioPage().SelectMFSection();
    }

    @Then("User should see the same total return percentage as home dashboard for US Stocks")
    public void userShouldSeeTheSameTotalReturnPercentageAsHomeDashboardForUSStocks() {
        new PortFolioPage().CompareUSStockReturnPercentage();
    }

    @Then("User should see the same total return percentage as home dashboard for Goals")
    public void userShouldSeeTheSameTotalReturnPercentageAsHomeDashboardForGoals() {
        new PortFolioPage().CompareGoalsReturnPercentage();
    }

    @Then("User should see the same total return percentage as home dashboard for Mutual funds")
    public void userShouldSeeTheSameTotalReturnPercentageAsHomeDashboardForMutualFunds() throws InterruptedException {
        new PortFolioPage().CompareMFReturnPercentage();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }
}
