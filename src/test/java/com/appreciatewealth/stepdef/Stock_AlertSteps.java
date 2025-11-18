package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.Stock_AlertsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stock_AlertSteps extends BasePage {

    BasePage basePage = new BasePage();

    @When("User clicks on alert icon at stock details page")
    public void user_clicks_on_alert_icon_at_stock_details_page() {
        new Stock_AlertsPage(). ClickOnAlertIcon();
    }
    @Then("User should see the set alert page")
    public void user_should_see_the_set_alert_page() {
        new Stock_AlertsPage(). Validate_SetAlertPage();
    }
    @Then("User enters the target amount")
    public void user_enters_the_target_amount() {
        new Stock_AlertsPage(). EnterTargetAmt();
    }
    @Then("User selects the expiration date till next month")
    public void user_selects_the_expiration_date_till_next_month() {
        new Stock_AlertsPage(). SelectNextMonthExpiration();

    }
    @When("User click on create alert CTA")
    public void user_click_on_create_alert_cta() {
        new Stock_AlertsPage(). ClickOnAlertCTA();
    }
    @Then("User should see the alert created toast")
    public void user_should_see_the_alert_created_toast() {
        new Stock_AlertsPage(). ValidateAlertToast();
    }
    @Then("User should also see the stock details page")
    public void user_should_also_see_the_stock_details_page() {
        new Stock_AlertsPage(). ValidateStockDetails();
    }
}
