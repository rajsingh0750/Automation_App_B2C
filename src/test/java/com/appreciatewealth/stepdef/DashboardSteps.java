package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class DashboardSteps extends BasePage {

    BasePage basePage = new BasePage();


        public DashboardSteps() {

        }


        @Given("the user is on Appreciate App's Dashboard")
        public void the_user_is_on_appreciate_app_s_dashboard() throws IOException, InterruptedException {
            new DashboardPage().NavigatetoDashboard();
        }

        @Given("a banner or information is displayed prompting the user to Add Funds")
        public void a_banner_or_information_is_displayed_prompting_the_user_to_add_funds() throws InterruptedException {
            new DashboardPage().ValidateAddFund();
        }

        @When("the user clicks on the CTA for adding funds")
        public void the_user_clicks_on_the_cta_for_adding_funds() throws InterruptedException {
            new DashboardPage().ClickonFunds();
        }

        @Then("the user should be redirected to the funds adding money transfer screen")
        public void the_user_should_be_redirected_to_the_funds_adding_money_transfer_screen() throws InterruptedException {
            new DashboardPage().ValidateMoneyTransferScreen();
            new DashboardPage().ClickClose();
            new BasePage().ClickProfileSettings();
            basePage.Logout();

        }


    }

