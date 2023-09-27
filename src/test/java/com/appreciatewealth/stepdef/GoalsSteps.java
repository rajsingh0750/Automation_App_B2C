package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.GoalsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class GoalsSteps {
    public GoalsSteps() {

    }

    @Given("the user is on Goals Dashboard")
    public void theUserIsOnGoalsDashboard() throws IOException, InterruptedException {
        new GoalsPage().NavigatetoGoals();
    }

    @Given("a banner or information is displayed prompting the user to Goal Calculator")
    public void a_banner_or_information_is_displayed_prompting_the_user_to_goal_calculator() throws InterruptedException {
        new GoalsPage().Validategoalcalculator();

    }

    @When("the user clicks on the CTA for goal calculator")
    public void the_user_clicks_on_the_cta_for_goal_calculator() throws InterruptedException {
        new GoalsPage().ClickOnGoalCalculator();

    }

    @Then("the user should be redirected to the goal to calculate target goal amount")
    public void the_user_should_be_redirected_to_the_goal_to_calculate_target_goal_amount() throws InterruptedException {
        new GoalsPage().SelectGoalType();
        new GoalsPage().EnterAmount("20000");
        new GoalsPage().ValidateCurrentAge("35");
        new GoalsPage().ValidateRetirementAge("65");
        new GoalsPage().ClickonSeeTargetAmount();
        Thread.sleep(3000);
        new GoalsPage().ValidateStartGoalButton();

    }


    @When("the user clicks on the CTA for goal the calculator")
    public void theUserClicksOnTheCTAForGoalTheCalculator() throws InterruptedException {

        new GoalsPage().Validategoalcalculator();
        new GoalsPage().ClickOnGoalCalculator();
        new GoalsPage().SelectGoalType();

    }

    @And("user edits the current age and retire age")
    public void userEditsTheCurrentAgeAndRetireAge() throws InterruptedException {
        new GoalsPage().EnterCurrentAge("30");
        new GoalsPage().EnterRetireAge("50");

    }

    @And("user adds monthly expenses")
    public void userAddsMonthlyExpenses() throws InterruptedException {
        new GoalsPage().EnterAmount("20000");
        Thread.sleep(2000);


    }

    @And("the user clicks on the CTA for target amount")
    public void theUserClicksOnTheCTAForTargetAmount() throws InterruptedException {
        //new GoalsPage().PressEnter();
        new GoalsPage().NavigateBack();
        new GoalsPage().ClickonSeeTargetAmount();
        Thread.sleep(3000);


    }

    @Then("user should see the same details on goal calculator details page")
    public void userShouldSeeTheSameDetailsOnGoalCalculatorDetailsPage() throws InterruptedException {
        Thread.sleep(3000);
        new GoalsPage().ValidateYourcurrentage("30");
        new GoalsPage().ValidateRetirementby("26 Sep, 2043");
        new GoalsPage().ValidateExpenseswithinflation("₹64,144 / month");
        new GoalsPage().ValidateTotalamount("₹2,15,52,384");
        new GoalsPage().ValidateToretire("To retire by Sep 2043, you need");

    }


    @And("user clicks on see details for a particular goals")
    public void userClicksOnSeeDetailsForAParticularGoals() throws InterruptedException {
        new GoalsPage().ClickonSeeDetails();
    }

    @Then("user should see the goals detail for the respective goal")
    public void userShouldSeeTheGoalsDetailForTheRespectiveGoal() throws InterruptedException {
        new GoalsPage().ValidateActivegoal();
    }

    @When("the user clicks on the CTA for new goal")
    public void theUserClicksOnTheCTAForNewGoal() throws InterruptedException {
        new GoalsPage().clicknewgoal();
    }

    @And("user select Your Goal type")
    public void userSelectYourGoalType() throws InterruptedException {
        new GoalsPage().clickongoaltype();
    }


    @And("user adds name of the goal")
    public void userAddsNameOfTheGoal() throws InterruptedException {
        new GoalsPage().Entergoalname("Investment for Retirement");
    }

    @And("user select Target Date")
    public void userSelectTargetDate() throws InterruptedException {
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectyearinlist(" 2025 ");


    }

    @And("user adds Target amount")
    public void userAddsTargetAmount() throws InterruptedException {
        new GoalsPage().targetamount("20000");
    }

    @When("user is on Goal Setup page")
    public void userIsOnGoalSetupPage() throws InterruptedException {

    }

    @And("user click on the CTA for one time investment")
    public void userClickOnTheCTAForOneTimeInvestment() throws InterruptedException {
        new GoalsPage().onetimeinvestment();
    }

    @And("user click on the CTA for See investment options")
    public void userClickOnTheCTAForSeeInvestmentOptions() throws InterruptedException {
        new GoalsPage().investment();
    }

    @Then("user should see the details on Target portfolio")
    public void userShouldSeeTheDetailsOnTargetPortfolio() throws InterruptedException {
        new GoalsPage().Targetportfoliodashboard();
    }

    @And("user clicks on the CTA for proceed with investment")
    public void userClicksOnTheCTAForProceedWithInvestment() throws InterruptedException {
        new GoalsPage().investmentpage();
    }

    @And("user clicks on the CTA for setup a goal")
    public void userClicksOnTheCTAForSetupAGoal() throws InterruptedException {
        new GoalsPage().settgoal();
    }

    @Then("the goal should be placed successfully")
    public void theGoalShouldBePlacedSuccessfully() throws InterruptedException {
        new GoalsPage().Successfullinvestment();
    }


    @And("User clicks on the CTA for new goal")
    public void userClicksOnTheCTAForNewGoal() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().clickongoaltype();
        new GoalsPage().Entergoalname("To check warning message");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectyearinlist(" 2025 ");
        new GoalsPage().targetamount("100");
        new GoalsPage().onetimeinvestment();


    }

    @Then("User Should see the following message {string}")
    public void userShouldSeeTheFollowingMessage(String msg) throws InterruptedException {
        new GoalsPage().CheckLowintargetamount("Minimum one time payment amount is ₹150 Please increase target amount to at least ₹221 to continue setting up this goal");
        new GoalsPage().cancelbutton();
    }


    @When("the user clicks back button from review goal page")
    public void theUserClicksBackButtonFromReviewGoalPage() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().clickongoaltype();
        new GoalsPage().Entergoalname("Retirement Saving Draft");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectyearinlist(" 2025 ");
        new GoalsPage().targetamount("10000");
        new GoalsPage().onetimeinvestment();
        new GoalsPage().investment();
        new GoalsPage().Targetportfoliodashboard();
        new GoalsPage().investmentpage();
        new GoalsPage().ValidateReviewgoalpage();
    }

    @Then("user should be prompted with dialog whether to save the goal as draft or not")
    public void userShouldBePromptedWithDialogWhetherToSaveTheGoalAsDraftOrNot() throws InterruptedException {
        new GoalsPage().Backbutton();
        new GoalsPage().Validatepromptmessage();

    }

    @And("user accepts to save as draft")
    public void userAcceptsToSaveAsDraft() throws InterruptedException {
        new GoalsPage().Yesoption();

    }

    @Then("Goal should be saved as draft")
    public void goalShouldBeSavedAsDraft() throws InterruptedException {
        new GoalsPage().Draft();

    }


}
