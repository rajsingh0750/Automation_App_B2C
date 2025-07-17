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
}
