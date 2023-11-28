package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.DashboardPage;
import com.appreciatewealth.pages.GoalsPage;
import com.appreciatewealth.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class GoalsSteps extends BasePage {

    BasePage basePage = new BasePage();

    SignInPage signInPage = new SignInPage();

    DashboardPage dashboardPage = new DashboardPage();
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
        new GoalsPage().ValidateCurrentAge("30");
        new GoalsPage().ValidateRetirementAge("65");
        new GoalsPage().ClickonSeeTargetAmount();
        Thread.sleep(3000);
        new GoalsPage().ValidateStartGoalButton();
        new GoalsPage().Close();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();



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
        new GoalsPage().ValidateRetirementby();
        new GoalsPage().ValidateExpenseswithinflation("₹64,144 / month");
        new GoalsPage().ValidateTotalamount("₹2,15,52,384");
        new GoalsPage().ValidateToretire("To retire by Nov 2043, you need");
        new GoalsPage().Close();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

    }


    @And("user clicks on see details for a particular goals")
    public void userClicksOnSeeDetailsForAParticularGoals() throws InterruptedException {
        new GoalsPage().ClickonSeeDetails();
    }

    @Then("user should see the goals detail for the respective goal")
    public void userShouldSeeTheGoalsDetailForTheRespectiveGoal() throws InterruptedException {
        new GoalsPage().ValidateActivegoal();
        new GoalsPage().Close();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

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
        new GoalsPage().ValidateReviewgoalpage();

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
        new GoalsPage().BackGoalspage();
        new BasePage().ClickProfileSettings();
        basePage.Logout();


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

    @Then("User Should see the following message")
    public void userShouldSeetheFollowingMessage() throws InterruptedException {
        new GoalsPage().CheckLowintargetamount();
        new GoalsPage().cancelbutton();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();
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
        new BasePage().ClickProfileSettings();
        basePage.Logout();


    }


    @And("User sees invested amount and current value on Goal dashboard")
    public void userSeesInvestedAmountAndCurrentValueOnGoalDashboard() {
        System.out.println("User should see total amount");

    }


    @Then("the P&L amount should be based on the invested amount and current value")
    public void thePLAmountShouldBeBasedOnTheInvestedAmountAndCurrentValue() throws InterruptedException {
        new GoalsPage().CalculateCurrentValueGoals();
        new BasePage().ClickProfileSettings();
        basePage.Logout();



    }

    @Then("User should see percentage change of P&L based on the Invested and Current Savings")
    public void userShouldSeePercentageChangeOfPLBasedOnTheInvestedAndCurrentSavings() throws InterruptedException {
        new GoalsPage().CalculateProfitAndLossGoalsPercentage();
        new BasePage().ClickProfileSettings();
        basePage.Logout();


    }

    @When("the user is on Goals Setup page")
    public void theUserIsOnGoalsSetupPage() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().clickongoaltype();
        new GoalsPage().Entergoalname("Increment Amount in Goals");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectyearinlist(" 2025 ");
        new GoalsPage().targetamount("500");
        new GoalsPage().onetimeinvestment();
    }

    @And("user clicks on plus button")
    public void userClicksOnPlusButton() throws InterruptedException {
        new GoalsPage().GoalsIncrement();
    }


    @Then("user should see the message {string}")
    public void userShouldSeeTheMessage(String Message) throws InterruptedException {
        new GoalsPage().ValidateIncrementMessage("Nice! you may get more returns!");
        basePage.AndroidBack();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();



    }


    @And("user clicks on minus button")
    public void userClicksOnMinusButton() throws InterruptedException {
        new GoalsPage().GoalsDecrement();
    }


    @Then("user should see the following message {string}")
    public void userShouldSeeTheFollowingMessage(String Message1) throws InterruptedException {
        new GoalsPage().ValidateDecrementMessage("Target amount has decreased!");
        basePage.AndroidBack();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

    }

    @And("user selects goal type")
    public void userSelectsGoalType() throws InterruptedException {
        new GoalsPage().SelectGoalType();
    }

    @And("user edits the current age")
    public void userEditsTheCurrentAge() throws InterruptedException {
        new GoalsPage().EnterCurrentAge("17");

    }



    @Then("User should be prompted with error message {string}")
    public void userShouldBePromptedWithErrorMessage(String AgeErrorMessage) throws InterruptedException {
        new GoalsPage().ValidateAgeErrorMessage("Enter current age 18 and above");
        new GoalsPage().Close();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();
    }

    @And("user select Education Goal type")
    public void userSelectEducationGoalType() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().Educationgoaltype();
        new GoalsPage().Entergoalname("Child Education Fund");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectEducationyearinlist("2035");
        new GoalsPage().targetamount("1200000");
        new GoalsPage().onetimeinvestment();
        new GoalsPage().investment();
        new GoalsPage().Targetportfoliodashboard();
        new GoalsPage().investmentpage();
    }

    @And("user clicks on Investment details")
    public void userClicksOnInvestmentDetails() throws InterruptedException {
        new GoalsPage().EducationDetails();
    }

    @Then("the goal should be placed education fund successfully")
    public void theGoalShouldBePlacedEducationFundSuccessfully() throws InterruptedException {
        new GoalsPage().settgoal();
        new GoalsPage().Successfullinvestment();
        new GoalsPage().BackGoalspage();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

    }


    @And("user select Dream Home Goal type")
    public void userSelectDreamHomeGoalType() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().DreamHomegoaltype();
        new GoalsPage().Entergoalname("Goal Investment for Dream Home");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectDreamHomeyearinlist("2032");
        new GoalsPage().targetamount("7500000");
        new GoalsPage().onetimeinvestment();
        new GoalsPage().investment();
        new GoalsPage().Targetportfoliodashboard();
        new GoalsPage().investmentpage();

    }

    @And("user clicks on Home Investment details")
    public void userClicksOnHomeInvestmentDetails() throws InterruptedException {
        new GoalsPage().DreamDetails();


    }

    @Then("the goal should be placed Dream Home successfully")
    public void theGoalShouldBePlacedDreamHomeSuccessfully() throws InterruptedException {
        new GoalsPage().settgoal();
        new GoalsPage().Successfullinvestment();
        new GoalsPage().BackGoalspage();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

    }
    @And("user select Retire goal type")
    public void userSelectRetireGoalType() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().Retiretype();
        new GoalsPage().Entergoalname("Monthly Retirement saving");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectyearonetimepay("2032");
        new GoalsPage().targetamount("500000");
    }

    @And("user click on the CTA for monthly payment")
    public void userClickOnTheCTAForMonthlyPayment() throws InterruptedException {
        new GoalsPage().Monthlyinvestment();
        new GoalsPage().investment();
        new GoalsPage().Targetportfoliodashboard();
        new GoalsPage().investmentpage();

    }

    @When("user is on Optional payment page")
    public void userIsOnOptionalPaymentPage() throws InterruptedException {
        new GoalsPage().Optionaldashboard();

    }

    @And("user adds one-time payment for retirement")
    public void userAddsOneTimePaymentForRetirement() throws InterruptedException {
        new GoalsPage().EnteronetimeAmount("2000");


    }

    @And("user click on the CTA to proceed with one-time payment")
    public void userClickOnTheCTAToProceedWithOneTimePayment() throws InterruptedException {
        new GoalsPage().Onetimepayment();

    }

    @Then("user should be on the Step Up page")
    public void userShouldBeOnTheStepUpPage() throws InterruptedException {
        new GoalsPage().steppage();
    }

    @And("user click increase monthly investment by")
    public void userClickIncreaseMonthlyInvestmentBy() throws InterruptedException {
        new GoalsPage().InvestmentIncrement();

    }

    @And("user click on the CTA for proceed with step up")
    public void userClickOnTheCTAForProceedWithStepUp() throws InterruptedException {
        new GoalsPage().Proceedstep();

    }

    @And("user clicks on okay button")
    public void userClicksOnOkayButton() throws InterruptedException {
        new GoalsPage().oktext();

    }

    @And("user see setup details")
    public void userSeeSetupDetails() throws InterruptedException {
        new GoalsPage().stepupDetails();

    }

    @And("user see Investment details")
    public void userSeeInvestmentDetails() throws InterruptedException {
        new GoalsPage().InvetmentgoalDetails();
    }

    @And("user click on the CTA for next")
    public void userClickOnTheCTAForNext() throws InterruptedException {
        new GoalsPage().settgoal();
        new GoalsPage().GoalsPaymentdashboard();
        new GoalsPage().Paymentnext();
    }


    @And("the Retirement goal for monthly payment is successfully created")
    public void theRetirementGoalForMonthlyPaymentIsSuccessfullyCreated() throws InterruptedException {
        new GoalsPage().Successfullinvestment();


    }

    @And("user click on the CTA take me back to goals")
    public void userClickOnTheCTATakeMeBackToGoals() throws InterruptedException {
        new GoalsPage().BackGoalspage();

    }

    @Then("user sucessfully Creates monthly payment Retirement goals")
    public void userSucessfullyCreatesmonthlypaymentRetirementgoals() throws InterruptedException {
       new BasePage().ClickProfileSettings();
        basePage.Logout();

    }


    @When("the user clicks on the CTA for digital gold")
    public void theUserClicksOnTheCTAForDigitalGold() throws InterruptedException {
        new GoalsPage().SelectDigitalGold();
    }

    @And("user select Digital GoldTarget Date")
    public void userSelectDigitalGoldTargetDate() throws InterruptedException {
        new GoalsPage().SelectGoldDate();
        new GoalsPage().SelectGoldYear();
        new GoalsPage().clickgoldyear("2026");

    }

    @And("user adds Digital Gold Target amount")
    public void userAddsDigitalGoldTargetAmount() throws InterruptedException {
        new GoalsPage().Digitalamount("300");
        new GoalsPage().onetimeinvestment();
        new GoalsPage().investment();

    }

    @Then("user should see the Digital Gold details on Target portfolio")
    public void userShouldSeeTheDigitalGoldDetailsOnTargetPortfolio() throws InterruptedException {
        new GoalsPage().DigitalGoldDashboard();
        
    }

    @And("user clicks on the CTA for proceed with investment in digital gold")
    public void userClicksOnTheCTAForProceedWithInvestmentInDigitalGold() throws InterruptedException {
        new GoalsPage().DigitalInvest();
        new GoalsPage().settgoal();



    }

    @And("user select pay now for one time investment")
    public void userSelectPayNowForOneTimeInvestment() throws InterruptedException {
        new GoalsPage().DigitalGoldPay();
        
    }

    @When("user is on ontime payment block")
    public void userIsOnOntimePaymentBlock() throws InterruptedException {
        new GoalsPage().DigitalGoldonetimeblock();
        
        
    }

    @And("user clicks on continue button")
    public void userClicksOnContinueButton() throws InterruptedException {
        new GoalsPage().Digitalcontinue();
    }

    @And("user see the status as paid")
    public void userSeeTheStatusAsPaid() throws InterruptedException {
        new GoalsPage().DigitalGoldStatus();
        
    }

    @Then("the digital gold goal should be placed successfully")
    public void theDigitalGoldGoalShouldBePlacedSuccessfully() throws InterruptedException {
        new GoalsPage().DigitalGoldSuccessfull();
        new GoalsPage().BackGoalspage();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

    }


    @And("the user clicks on the CTA for goals on digital gold")
    public void theUserClicksOnTheCTAForGoalsOnDigitalGold() throws InterruptedException {
        new GoalsPage().SelectDigitalGold();
        new GoalsPage().SelectGoldDate();
        new GoalsPage().SelectGoldYear();
        new GoalsPage().clickgoldyear("2026");
        new GoalsPage().Digitalamount("2000");
        new GoalsPage().Monthlyinvestment();

    }

    @Then("User Should see the following message in digital gold {string}")
    public void userShouldSeeTheFollowingMessageInDigitalGold(String DigitalMessage) throws InterruptedException {
        new GoalsPage().ValidateDigitalMessage("Minimum monthly payment amount is ₹150 Please increase target amount to at least ₹6,635 to continue setting up this goal");
        new GoalsPage().digitalminimumclose();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();
    }


    @And("user click on the CTA to proceed without one-time payment")
    public void userClickOnTheCTAToProceedWithoutOneTimePayment() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().Retiretype();
        new GoalsPage().Entergoalname("Add retire money without one time payment");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectyearonetimepay("2032");
        new GoalsPage().targetamount("200000");
        new GoalsPage().Monthlyinvestment();
        new GoalsPage().investment();
        new GoalsPage().Targetportfoliodashboard();
        new GoalsPage().investmentpage();
        new GoalsPage().Optionaldashboard();
    }

    @And("user click on the CTA for proceed without step up")
    public void userClickOnTheCTAForProceedWithoutStepUp() throws InterruptedException {
        new GoalsPage().EnteronetimeAmount("1000");
        new GoalsPage().Retirewithoutpayment();
        new GoalsPage().steppage();
        new GoalsPage().InvestmentIncrement();
        new GoalsPage().RetireProceedwithoutstep();
        new GoalsPage().settgoal();
    }

    @Then("the Retirement goal for without one-time payment is successfully created")
    public void theRetirementGoalForWithoutOneTimePaymentIsSuccessfullyCreated() throws InterruptedException {
        new GoalsPage().GoalsPaymentdashboard();
        new GoalsPage().Paymentnext();
        new GoalsPage().Successfullinvestment();
        new GoalsPage().BackGoalspage();
        new BasePage().ClickProfileSettings();
        basePage.Logout();
    }


    @And("the user clicks on the CTA for large amount on digital gold")
    public void theUserClicksOnTheCTAForLargeAmountOnDigitalGold() throws InterruptedException {
        new GoalsPage().SelectDigitalGold();
        new GoalsPage().SelectGoldDate();
        new GoalsPage().SelectGoldYear();
        new GoalsPage().clickgoldyear("2026");
        new GoalsPage().Digitalamount("9999999999999");
        new GoalsPage().Monthlyinvestment();
    }

    @Then("User Should see the following message in digital gold for large amount {string}")
    public void userShouldSeeTheFollowingMessageInDigitalGoldForLargeAmount(String DigitalLargeMessage) throws InterruptedException {
        new GoalsPage().ValidateDigitallargeMessage("Target amount too large for selected Target date. Either decrease Target amount or increase Target date to continue.");
        new GoalsPage().digitalminimumclose();
        basePage.AndroidBack();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

    }
    @And("user select Retirement goal type")
    public void userSelectRetirementGoalType() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().Retiretype();
        new GoalsPage().Entergoalname("Step up Warning Message");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().SelectYearStepup("2100");
        new GoalsPage().targetamount("12000000000");


    }
    @And("user adds one-time payment for retirement in Stepup")
    public void userAddsOneTimePaymentForRetirementInStepup() throws InterruptedException {
        new GoalsPage().EnteronetimeAmount("999");
    }

    @When("user is in Review Goal Page")
    public void userIsInReviewGoalPage() throws InterruptedException {
        new GoalsPage().GoalRetireReview();
        
    }



    @And("user select edit step up and increase investment")
    public void userSelectEditStepUpAndIncreaseInvestment() throws InterruptedException {
        new GoalsPage().Stepupedits();
        new GoalsPage().EnterIncrement("100");

    }

    @Then("user Should see the following message in Step up {string}")
    public void userShouldSeeTheFollowingMessageInStepUp(String RetireMessage1) throws InterruptedException {
        new GoalsPage().ValidateStepupmessage("The edited Stepup has pushed your target amount beyond the maximum limit. Please reduce Stepup.");
        new GoalsPage().ReviewMessageClick();
        new GoalsPage().ClickEditBack();
        basePage.AndroidBack();
        new GoalsPage().ClickNoOptions();
        new BasePage().ClickProfileSettings();
        basePage.Logout();


    }

    @Given("the user is on the Goals Dashboard")
    public void theUserIsOnTheGoalsDashboard() throws InterruptedException, IOException {
        signInPage.DynamicSignIn("varsha.thandav@ppreciate.com");
        dashboardPage.ClickOnGoToDashboard();
        new GoalsPage().SwitchtoGoal();

    }

    @And("user select Retirement goal type for payment")
    public void userSelectRetirementGoalTypeForPayment() throws InterruptedException {
        new GoalsPage().clicknewgoal();
        new GoalsPage().Retiretype();
        new GoalsPage().Entergoalname("One Time Warning Message");
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().SelectYearStepup("2100");
        new GoalsPage().targetamount("12000000000");
    }


    @And("user select edit One time payment")
    public void userSelectEditOneTimePayment() throws InterruptedException {
        new GoalsPage().Onetimepaymentedit();
        new GoalsPage().AddOnetime("99999999");
        new GoalsPage().NavigateBack();
        new GoalsPage().ClickUpdateone();
    }

    @Then("user Should see the following message in One Time Payment {string}")
    public void userShouldSeeTheFollowingMessageInOneTimePayment(String OneTimeMessage2) throws InterruptedException {
        new GoalsPage().Validateonetimepaymentmessage("The edited One time payment has pushed your target amount beyond the maximum limit. Please reduce One time payment.");
        new GoalsPage().ReviewMessageClick();
        new GoalsPage().ClickEditBack();
        basePage.AndroidBack();
        new GoalsPage().ClickNoOptions();
        new BasePage().ClickProfileSettings();
        basePage.Logout();
    }


    @And("User Click on Draft Goals")
    public void userClickOnDraftGoals() throws InterruptedException {
        new GoalsPage().SelectDraft();

        
    }

    @And("User Select Goals in draft status")
    public void userSelectGoalsInDraftStatus() throws InterruptedException {
        new GoalsPage().CreateGoalFromDraft();
        
    }

    @And("user clicks on the CTA for setup a goal from draft page")
    public void userClicksOnTheCTAForSetupAGoalFromDraftPage() throws InterruptedException {
        new GoalsPage().settgoal();

        
    }



    @Then("User should successfully create goals from draft")
    public void userShouldSuccessfullyCreateGoalsFromDraft() throws InterruptedException {
        new BasePage().ClickProfileSettings();
        basePage.Logout();
    }

    @Given("the User is on Goals Dashboard for monthly goal pause")
    public void theUserIsOnGoalsDashboardForMonthlyGoalPause() throws InterruptedException, IOException {
        signInPage.DynamicSignIn("varshatmysuru1992@gmail.com");
        dashboardPage.ClickOnGoToDashboard();
        new GoalsPage().SwitchtoGoal();
        
    }

    @And("user selects mothly goals in Active List")
    public void userSelectsMothlyGoalsInActiveList() throws InterruptedException {
        new GoalsPage().SelectPauseGoal();

        
    }

    @And("user clicks on Pause option")
    public void userClicksOnPauseOption() throws InterruptedException {
        new GoalsPage().SelectThreeDots();
        new GoalsPage().SelectPause();

        
    }

    @And("user selects pause SIP button")
    public void userSelectsPauseSIPButton() throws InterruptedException {
        new GoalsPage().SelectSIP();

    }

    @When("user selects go back to goals")
    public void userSelectsGoBackToGoals() throws InterruptedException {
        new GoalsPage().GoalHomePage();
        
    }

    @And("user selects history")
    public void userSelectsHistory() throws InterruptedException {
        new GoalsPage().SelectHistory();
        
    }

    @Then("user should see Pause status")
    public void userShouldSeePauseStatus() throws InterruptedException {
        new GoalsPage().ValidateGoalsPauseStatus();
    }
}



