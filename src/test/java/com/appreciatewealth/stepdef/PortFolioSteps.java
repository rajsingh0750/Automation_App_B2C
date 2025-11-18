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
//        new PortFolioPage().SelectMFSection();
//        new PortFolioPage().VerifyMFTabCalculation();
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


    @Then("User Clicks on US Stocks in Portfolio")
    public void userClicksOnUSStocksInPortfolio() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().ClickOnUSStocks();
    }

    @Then("User Clicks on Goals in Portfolio")
    public void userClicksOnGoalsInPortfolio() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().ClickOnGoals();
    }

    @And("User will verify calculation of US Stocks")
    public void userWillVerifyCalculationOfUSStocks() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().VerifyUSStocksCalculation();
    }

    @And("User will verify calculation of Goals")
    public void userWillVerifyCalculationOfGoals() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().VerifyGoalsCalculation();
    }

    @Then("User Clicks on Mutual Funds in Portfolio")
    public void userClicksOnMutualFundsInPortfolio() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().ClickOnMF();
    }

    @And("User will verify calculation of Mutual Funds")
    public void userWillVerifyCalculationOfMutualFunds() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
       // new PortFolioPage().VerifyMFCalculation();
        ClickProfileSettings();
        Logout();
    }

    @Then("User will verify the calculation of all sections")
    public void userWillVerifyTheCalculationOfAllSections() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().VerifyAllCalculation();
    }

    @Then("User gets the US Stocks value on Home Dashboard")
    public void userGetsTheUSStocksValueOnHomeDashboard() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().GetUSStock_ValueOn_Dashboard();
    }

    @And("User gets the Goals value on Home Dashboard")
    public void userGetsTheGoalsValueOnHomeDashboard() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().GetGoals_ValueOn_Dashboard();
    }

    @And("User gets the Mutual Funds Value on Home Dashboard")
    public void userGetsTheMutualFundsValueOnHomeDashboard() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().GetMF_ValueOn_Dashboard();
    }

    @And("User verify the US Stocks value with US Stocks value on Home Dashboard")
    public void userVerifyTheUSStocksValueWithUSStocksValueOnHomeDashboard() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().USStockVerify();
    }

    @And("User verify the Mutual Funds value with Mutual Funds value on Home Dashboard")
    public void userVerifyTheMutualFundsValueWithMutualFundsValueOnHomeDashboard() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().MFStockVerify();
        ClickProfileSettings();
        Logout();
    }

    @And("User verify the Goals value with Goals value on Home Dashboard")
    public void userVerifyTheGoalsValueWithGoalsValueOnHomeDashboard() throws InterruptedException{
        // Write code here that turns the phrase above into concrete actions
        new PortFolioPage().GoalsVerify();
    }
}
