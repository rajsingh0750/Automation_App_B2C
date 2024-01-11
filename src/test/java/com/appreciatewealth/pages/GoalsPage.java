package com.appreciatewealth.pages;

import com.appreciatewealth.utils.TestUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Calendar;

public class GoalsPage extends BasePage {

    static BasePage basePage = new BasePage();

    TestUtils utils = new TestUtils();
    private String goalsname;

    DashboardPage dashboardPage;

    private String ActualPandL;

    public GoalsPage() {

        this.dashboardPage = new DashboardPage();
    }

    // Adding funds in Goal Dashboard
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.ImageView")
    private WebElement clickonViewGoals;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.Button")
    private WebElement addFunds;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement ValidateMoneyTransferPage;


    // Verify Goal Calculator
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]")
    private WebElement clickongoalcalculator;

    @AndroidFindBy(xpath = "//*[@text= 'Retire with Maximum Savings']")
    private WebElement Selectgoaltype;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private WebElement SelectContinue;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement ValidateGoalCalculatorScreen;

    @AndroidFindBy(xpath = "//*[contains(@text,'30')]")
    private WebElement ValidateCurrentAge;

    @AndroidFindBy(xpath = "//*[contains(@text,'65')]")
    private WebElement ValidateRetireAge;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement EnterAmount;

    @AndroidFindBy(xpath = "//*[@text= 'see target amount']")
    private WebElement SelectSeeTargetButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button")
    private WebElement SelectStartgoalsetupButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button")
    private WebElement ValidateStartGoalSetUp;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement Tapcurrent;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement Sendcurrentage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement TapRetire;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement SendRetireAge;

    /*@AndroidFindBy(xpath = "//*[@index='0' and @text='Current age' and @class='android.widget.EditText']")
    private WebElement EnterCurrentAge;

    @AndroidFindBy(xpath = "//*[@index='1' and @text='You want to retire at the age of' and @class='android.widget.EditText']")
    private WebElement EnterRetireAge;*/

    @AndroidFindBy(xpath = "//*[@index='1' and @text='30']")
    private WebElement ValidateYourcurrentage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[4]")
    private WebElement ValidateRetirementby;

    @AndroidFindBy(xpath = "//*[@index='5' and @text='₹20,000 / month']")
    private WebElement ValidateCurrentexpenses;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[8]")
    private WebElement ValidateExpenseswithinflation;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    private WebElement ValidateToretire;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private WebElement ValidateTotalamount;


    //Verifying the Goals details in Active tab

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]")
    private WebElement goalsnameondashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]")
    private WebElement seedetailsactivegoal;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Summary\"]")
    private WebElement Summarygoal;

    //Creating new goals from the dashboard
    @AndroidFindBy(xpath = "//*[@text='new goal']")
    private WebElement Clickonnewgoal;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement goaltype;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")
    private WebElement SelectOkay;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement Entergoalname;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement targetdate;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    private WebElement targetyear;


    @AndroidFindBy(xpath = "//*[@index='1' and @text='OK']")
    private WebElement oktargetdate;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
    private WebElement targetamount;


    @AndroidFindBy(xpath = "//*[@index='3' and @text='I want to make a one time investment']")
    private WebElement goalonetimeinvestment;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private WebElement goalinvestmentoptions;

    @AndroidFindBy(xpath = "//*[@index='1' and @text='Target portfolio']")
    private WebElement Targetportfoliodashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")
    private WebElement clickproceedwithinvestment;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private WebElement clicksetupgoal;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private WebElement goalsuccessfullpage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement Lowintargetamount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement clickcancelicon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
    private WebElement ValidateReviewgoalpage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[1]")
    private WebElement clickbackbutton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Would you like to save this goal in drafts?')]")
    private WebElement Validateprompt;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")
    private WebElement ClickYesbutton;

    @AndroidFindBy(xpath = "//*[@text='Drafts']")
    private WebElement clickdrafttab;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
    WebElement InvestedAmountOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]")
    WebElement CurrentValueOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    WebElement TotalValueOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]")
    WebElement GetInvestedAmountOnDashboard;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]")
    WebElement GetCurrentValueOnDashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    WebElement GetTotalValuePercentage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView[3]")
    WebElement IncrementInvestment;

    @AndroidFindBy(xpath = "//*[@text='Nice! you may get more returns!']")
    WebElement PromptMessage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView[2]")
    WebElement DecrementInvestment;

    @AndroidFindBy(xpath = "//*[@text='Target amount has decreased!']")
    WebElement DecrementPromptMessage;

    @AndroidFindBy(xpath = "//*[@text='Enter current age 18 and above']")
    WebElement AgeErrorMessage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    WebElement ErrorClose;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")
    WebElement TypeEducationFund;

   // @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.ScrollView/android.widget.ViewAnimator/android.widget.ListView/android.widget.TextView[3]")
   // WebElement Educationyear;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement EducationInvestmentdetails;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup")
    WebElement TypeDreamHome;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement DreamHomeInvestmentdetails;

    @AndroidFindBy(xpath = "//*[@text='see monthly payment needed']")
    WebElement MonthlyPayment;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
    WebElement OptionalPayment;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.widget.EditText")
    WebElement EnteronetimePayment;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement Proceedwithonetime;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
    WebElement StepUppage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView[2]")
    WebElement IncreaseMonthlyInvest;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement proceedwithstepup;


    @AndroidFindBy(xpath = "//*[@text='okay']")
    WebElement OkayButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement Stepup;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.cardview.widget.CardView[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement Investmonthly;

    @AndroidFindBy(xpath = "//*[@index='1' and @text='Goals Payment']")
    WebElement GoalsPaymentpage;

    @AndroidFindBy(xpath = "//*[@text='next']")
    WebElement Next;

    @AndroidFindBy(id = "tvTakeMeBack")
    WebElement takemebacktogoalpage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]")
    WebElement GoalStatus;
    @AndroidFindBy(id = "topLayoutGoldSip")
    WebElement Clickdigitalgold;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    WebElement GoldTargetDate;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    WebElement GoldTargetYear;

    @AndroidFindBy(xpath = "//*[@index='1' and @text='OK']")
    WebElement GoldDateok;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText")
    WebElement GoldAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
    WebElement Goldportfolio;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement Goldinvestment;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[5]")
    WebElement paynowgold;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement onetimeinvestblock;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")
    WebElement ContinueButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[5]")
    WebElement GoldStatus;

    @AndroidFindBy(xpath = "//*[contains(@text,'Goal Successfully')]")
    WebElement Goldsuccessfull;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement goldmonthinvest;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[7]")
    WebElement GoldMonthlypay;

    @AndroidFindBy(xpath = "//*[@index='11' and @text='setup a goal']")
    WebElement goldset;

    //@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button")
    //WebElement monthnext;

    @AndroidFindBy(xpath = "//*[@index='1' and @text='SIP payment']")
    WebElement GoldSIP;

    @AndroidFindBy(xpath = "//*[@index='6' and @text='continue']")
    WebElement digitalcontinue;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[7]")
    WebElement digitalmstatus;

    @AndroidFindBy(id = "tvContentConfirmation")
    WebElement DigitalgoldMinimum;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement Digitalminimumcancel;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[3]")
    WebElement Retirewithout;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView")
    WebElement proceedRetirewithout;


    //@AndroidFindBy(xpath = "//*[@index='1' and @text='next']")
    //WebElement Retirewithoutnext;

    @AndroidFindBy(xpath = "//*[@text='Target amount too large for selected Target date. Either decrease Target amount or increase Target date to continue.']")
    WebElement DigitalLargeamount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView")
    WebElement RetireReviewPage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.cardview.widget.CardView[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement Retirestepupedit;

    @AndroidFindBy(xpath = "//*[@text='Edit step up']")
    WebElement editstepup;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement TapStepup;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement Sendincrement;

    @AndroidFindBy(xpath = "//*[@text='The edited Stepup has pushed your target amount beyond the maximum limit. Please reduce Stepup.']")
    WebElement Warningeditstepup;

    @AndroidFindBy(xpath = "//*[@text='The edited One time payment has pushed your target amount beyond the maximum limit. Please reduce One time payment.']")
    WebElement Warningeditonetime;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
    WebElement editonetimepayment;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement taponetime;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    WebElement sendonetime;

    @AndroidFindBy(xpath = "//*[@text='update']")
    WebElement Updateonetime;

    @AndroidFindBy(xpath = "//*[@text='okay']")
    WebElement messageok;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    WebElement SetupBack;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement NoOption;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]")
    WebElement GoalsDraftData;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Drafts\"]")
    WebElement DraftTab;

    @AndroidFindBy(id = "txvActiveTitle")
    WebElement PauseGoalName;

    @AndroidFindBy(id = "three_dot")
    WebElement ThreeDots;

    @AndroidFindBy(xpath = "//*[@text='pause']")
    WebElement Pause;

    @AndroidFindBy(xpath = "//*[@text='pause 1 SIP']")
    WebElement PauseSIP;

    @AndroidFindBy(xpath = "//*[@text='go back to goals']")
    WebElement BackToGoals;

    @AndroidFindBy(xpath = "//*[@text='History']")
    WebElement History;

    @AndroidFindBy(id = "tvTransactionStatus")
    WebElement PauseStatus;

    @AndroidFindBy(id = "tvTakeMeBack")
    WebElement ResumeGoal;

    @AndroidFindBy(id = "bt_okay_confirmation")
    WebElement ResumeGoalOk;

    @AndroidFindBy(xpath = "//*[@text='skip']")
    WebElement ResumeSkip;

    @AndroidFindBy(id = "txv_no_goal")
    WebElement ResumeHistory;
    public static String RandomGoalName;
    public static String finalName;

    public void NavigatetoGoals() throws IOException, InterruptedException {

        Thread.sleep(5000);
        dashboardPage.NavigatetoDashboard();
        Thread.sleep(5000);
        clickonViewGoals.click();

    }

    public void SwitchtoGoal() throws IOException, InterruptedException {
        Thread.sleep(3000);
         clickonViewGoals.click();

    }

    public void ValidateAddFund() throws InterruptedException {
        Thread.sleep(3000);
        boolean IsFundDisplayed = addFunds.isDisplayed();
        if (IsFundDisplayed) {
            utils.log().info("Add funds button is displayed");
        } else {
            utils.log().info("add funds not displayed");
        }

    }

    public void ClickonFunds() throws InterruptedException {


        /*boolean canScrollMore = (Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 600,
                "direction", "down",
                "percent", 1.0*/
        // ));
        Thread.sleep(3000);
        // WebElement Addfundelement =  driver.findElement((AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.Button")));
        addFunds.click();
    }

    public void ValidateMoneyTransferScreen() throws InterruptedException {
        Thread.sleep(3000);
        boolean IsMoneyTransferScreenPresent = ValidateMoneyTransferPage.isDisplayed();
        if (IsMoneyTransferScreenPresent) {
            utils.log().info("Money transfer screen is displayed");
        } else {
            utils.log().info("Money transfer screen is not displayed");
        }

    }

//   public void Validategoalcalculator() throws InterruptedException {
//       boolean canScrollMore = (Boolean)driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//               "left", 100, "top", 200, "width", 750, "height", 1104,
//                       "direction", "down",
//                       "percent", 1.0
//               ));


    public void Validategoalcalculator() throws InterruptedException {


        Thread.sleep(5000);
        WebElement clickongoalcalculator = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"goal calculator\").instance(0))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]"));
        Thread.sleep(5000);
        clickongoalcalculator.isDisplayed();

    }


    public void ClickOnGoalCalculator() throws InterruptedException {
        Thread.sleep(5000);
        WebElement clickongoalcalculator = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"goal calculator\").instance(0))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]"));
        Thread.sleep(5000);
        clickongoalcalculator.click();

    }

    public void SelectGoalType() throws InterruptedException {
        Thread.sleep(5000);
        Selectgoaltype.click();
        SelectContinue.click();
    }

    public void EnterCurrentAge(String Age) throws InterruptedException {
        Thread.sleep(5000);
        Tapcurrent.click();
        Sendcurrentage.clear();
        // EnterCurrentAge.clear();
        Sendcurrentage.sendKeys(Age);
    }

    public void EnterRetireAge(String RetireAge) throws InterruptedException {
        Thread.sleep(5000);
        TapRetire.click();
        SendRetireAge.clear();
        SendRetireAge.sendKeys(RetireAge);
    }

    public void EnterAmount(String Amount) throws InterruptedException {
        Thread.sleep(5000);
        EnterAmount.sendKeys(Amount);
    }

    public void ValidateYourcurrentage(String currentAge) throws InterruptedException {
        Thread.sleep(3000);
        String ActualcurrentAge = ValidateYourcurrentage.getText();
        Assert.assertEquals(ActualcurrentAge, currentAge);
    }

    public void ValidateRetirementby() throws InterruptedException {
        Thread.sleep(5000);
        String ActualRetirementAge = ValidateRetirementby.getText();
        //BasePage.formatDate();
       Assert.assertEquals(ActualRetirementAge,BasePage.formatDateWithAddedYears() );
    }

    public void ValidateCurrentexpenses(String Expenses) throws InterruptedException {
        Thread.sleep(5000);
        String ActualExpenses = ValidateCurrentexpenses.getText();
        Assert.assertEquals(ActualExpenses, Expenses);
    }

    public void ValidateExpenseswithinflation(String inflation) throws InterruptedException {
        Thread.sleep(5000);
        String Actualinflation = ValidateExpenseswithinflation.getText();
        Assert.assertEquals(Actualinflation, inflation);
    }

    public void ValidateToretire(String Toretire) throws InterruptedException {
        Thread.sleep(5000);
        String ActualToretire = ValidateToretire.getText();
        Assert.assertEquals(ActualToretire, Toretire);
    }

    public void ValidateTotalamount(String Totalamount) throws InterruptedException {
        Thread.sleep(5000);
        String ActualTotalamount = ValidateTotalamount.getText();
        Assert.assertEquals(ActualTotalamount, Totalamount);
    }


    public void ValidateCurrentAge(String Age) throws InterruptedException {
        Thread.sleep(5000);
        String ActualAge = ValidateCurrentAge.getText();
        Assert.assertEquals(ActualAge, Age);
    }

    public void ValidateRetirementAge(String RetirementAge) throws InterruptedException {
        Thread.sleep(5000);
        String Age2 = ValidateRetireAge.getText();
        Assert.assertEquals(RetirementAge, Age2);
    }

    public void ClickonSeeTargetAmount() throws InterruptedException {
        Thread.sleep(5000);
        SelectSeeTargetButton.click();
    }

    public void ValidateStartGoalButton() throws InterruptedException {
        Thread.sleep(5000);
        ValidateStartGoalSetUp.isDisplayed();
    }

    public void PressEnter() {
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        // driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void NavigateBack() {
        driver.navigate().back();
    }


    //Validate Active Goal Tabs list and navigate to summary page
    public void ValidateActivegoal() throws InterruptedException {

        System.out.println("Goal Name ");


    }

    public void ClickonSeeDetails() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Drafts\").instance(0))"));
        /*boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 700,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));*/
            //driver.switchTo().frame(goalsnameondashboard);
            Thread.sleep(5000);
            goalsnameondashboard.click();
            //System.out.println("Goal Name " + goalsname);
           //WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView"));
            Thread.sleep(5000);
            //driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                   // "elementId", ((RemoteWebElement) element).getId()
           // ));
//           driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//                 "left", 100, "top", 100, "width", 600, "height", 650,
//              "elementId", ((RemoteWebElement) element).getId(),
//                 "direction", "up",
//               "percent", 2.0
//           ));


            WebElement goalsnameondetailscreen = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Summary\").instance(0))"));
            Thread.sleep(5000);
            //String goalsnameondetailspage = Summarygoal.getText();
            //Assert.assertEquals(goalsname, goalsnameondetailspage);

            // seedetailsactivegoal.click();
        }



    // Verify Creating a New goal from goal dashboard
    public void clicknewgoal() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"new goal\").instance(0))"));
        Thread.sleep(5000);
        Clickonnewgoal.click();

    }

    //Select goal type from goal creation
    public void clickongoaltype() throws InterruptedException {
        Thread.sleep(5000);
        goaltype.click();
        SelectOkay.click();

    }

    //Creating Goals Name random
    public void EnterRandomGoalName(){
       RandomGoalName = generateRandomString(6);
       finalName = RandomGoalName +"LatestGoal";
       Entergoalname.sendKeys(finalName);

    }

    //Enter goal name in goal creation page
    public void Entergoalname(String Name) throws InterruptedException {
        Thread.sleep(5000);
        Entergoalname.sendKeys(Name);
    }

    // Select the target date in goal creation page
    public void clicktargetdate() throws InterruptedException {
        Thread.sleep(5000);
        targetdate.click();

    }

    public void clicktargetyear() throws InterruptedException {
        Thread.sleep(5000);
        targetyear.click();

    }

    public void selectyearinlist(String Year) throws InterruptedException {

        WebElement clicktargetyear = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"2025\").instance(0))"));
        driver.findElement(By.xpath("//*[@index='1' and @text='2025']")).click();
        Thread.sleep(5000);
        oktargetdate.click();


    }

    public void targetamount(String Amount) throws InterruptedException {
        Thread.sleep(5000);
        targetamount.sendKeys(Amount);
    }

    // Investment option selections
    public void onetimeinvestment() throws InterruptedException {
        Thread.sleep(5000);
        goalonetimeinvestment.click();


    }

    public void investment() throws InterruptedException {
        Thread.sleep(5000);
        goalinvestmentoptions.click();


    }

    public void Targetportfoliodashboard() throws InterruptedException {
        Thread.sleep(8000);
        Targetportfoliodashboard.isDisplayed();
    }

    public void investmentpage() throws InterruptedException {
        Thread.sleep(8000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"proceed with investment\").instance(0))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
    }

    public void settgoal() throws InterruptedException {
        Thread.sleep(5000);
        clicksetupgoal.click();


    }

    public void Successfullinvestment() throws InterruptedException {
        Thread.sleep(5000);
        goalsuccessfullpage.isDisplayed();
    }

    public void CheckLowintargetamount() throws InterruptedException {
        Thread.sleep(5000);
        Lowintargetamount.isDisplayed();
       // System.out.println("Minimum Amount msg " + Lowintargetamount);
       // Assert.assertEquals(ActuallowMsg, msg);


    }

    public void cancelbutton() throws InterruptedException {
        Thread.sleep(5000);
        clickcancelicon.click();
    }

    public void ValidateReviewgoalpage() throws InterruptedException {
        Thread.sleep(5000);
        ValidateReviewgoalpage.isDisplayed();

    }

    public void Backbutton() throws InterruptedException {
        Thread.sleep(5000);
        clickbackbutton.click();
    }

    public void Validatepromptmessage() throws InterruptedException {
        Thread.sleep(2000);
        Validateprompt.isDisplayed();

    }

    public void Yesoption() throws InterruptedException {
        Thread.sleep(2000);
        ClickYesbutton.click();

    }

    public void Draft() throws InterruptedException {
        Thread.sleep(5000);
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 700,
                    "direction", "down",
                    "percent", 1.0
            ));
            driver.findElement(By.xpath("//*[@text='Drafts']")).click();
            clickdrafttab.isDisplayed();
            //basePage.Logout();


        }


    }

    public void CalculateCurrentValueGoals() {
        String OverallReturn = CurrentValueOnDashboard.getText();
        String OverallReturnwithoutCurrency = OverallReturn.replaceAll("[₹,]", "");
        double doublecurrentreturn = Double.parseDouble(OverallReturnwithoutCurrency);

        String Totalinvested = InvestedAmountOnDashboard.getText();
        String OverallInvestedwithoutCurrency = Totalinvested.replaceAll("[₹,]", "");
        double doublefinalInvestment = Double.parseDouble(OverallInvestedwithoutCurrency);
        System.out.println("this is the total invested amount from app " + doublefinalInvestment);
        double Finalvalue = doublefinalInvestment - doublecurrentreturn;
        System.out.println("this is the total current value amount from app " + doublecurrentreturn);
        System.out.println("this is the P&L total amount " + Finalvalue);
    }

    public void CalculateProfitAndLossGoalsPercentage() throws InterruptedException {
        Thread.sleep(5000);
        String OverallReturn = GetCurrentValueOnDashboard.getText();
        String OverallReturnwithoutCurrency = OverallReturn.replaceAll("[₹,]", "");
        double doublecurrentreturn = Double.parseDouble(OverallReturnwithoutCurrency);

        String Totalinvested = GetInvestedAmountOnDashboard.getText();
        String OverallInvestedwithoutCurrency = Totalinvested.replaceAll("[₹,]", "");
        double doublefinalInvestment = Double.parseDouble(OverallInvestedwithoutCurrency);
//double Finalvalue = (doublefinalInvestment - doubleoverallreturn) / 100;
        double Finalvalue = (doublecurrentreturn - doublefinalInvestment) / doublefinalInvestment * 100;
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedResult = df.format(Finalvalue);
        String Percentagechange;
        if (formattedResult.contains("-")) {
            String withoutminus = formattedResult.replaceAll("[-]", "");
            Percentagechange = " " + String.valueOf(withoutminus) + "%";
            System.out.println(Percentagechange);
        } else {
            Percentagechange = " " + String.valueOf(formattedResult) + "%";
            System.out.println(Percentagechange);
        }

        ActualPandL = GetTotalValuePercentage.getText();
        Thread.sleep(5000);
        System.out.println("This is actual P&L " + ActualPandL);
        Assert.assertEquals(ActualPandL, Percentagechange);
    }

    public void GoalsIncrement() throws InterruptedException {
        Thread.sleep(5000);
        IncrementInvestment.click();

    }

    public void ValidateIncrementMessage(String Message) throws InterruptedException {
        Thread.sleep(5000);
        String msg = PromptMessage.getText();
        Assert.assertEquals(Message, msg);
    }

    public void GoalsDecrement() throws InterruptedException {
        Thread.sleep(5000);
        DecrementInvestment.click();
    }

    public void ValidateDecrementMessage(String Message1) throws InterruptedException {
        Thread.sleep(5000);
        String msgd = DecrementPromptMessage.getText();
        Assert.assertEquals(Message1, msgd);
    }


  /*  public void EditsCurrentAge(String CurrentAge) throws InterruptedException {
        Thread.sleep(3000);
        Tapcurrent.click();
        Sendcurrentage.clear();
        // EnterCurrentAge.clear();
        Sendcurrentage.sendKeys(CurrentAge);
    }*/
    public void ValidateAgeErrorMessage(String AgeErrorMessage1) throws InterruptedException {
        Thread.sleep(5000);
        String errormessage = AgeErrorMessage.getText();
        Assert.assertEquals(AgeErrorMessage1, errormessage);
    }

    public void Close() throws InterruptedException {
        Thread.sleep(9000);
        ErrorClose.click();
    }

    //Calculation for Retirement Year in Goals
    public static int CalculateRetirementYear(int Retirementage, int CurrentAge) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int finalyear = Retirementage-CurrentAge + year;
        System.out.println("this is the RetireBy year" + finalyear);
        return finalyear;


    }
     //Calculation for Target Amount for Retirement goals
    public static double CalculateTotalTargetValue(double ExpensesWithInflation) throws InterruptedException {
        double TargetValue = ExpensesWithInflation * 12 * 28;
        System.out.println("this is the Target Amount" +TargetValue );

        return TargetValue;



    }

     // Creation of education Goal
    public void Educationgoaltype() throws InterruptedException {
        Thread.sleep(5000);
        goaltype.click();
        TypeEducationFund.click();
        SelectOkay.click();
    }



    public void selectEducationyearinlist(String Year) throws InterruptedException {

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"2035\").instance(0))")).click();
        //driver.findElement(By.xpath("//*[@index='2' and @text='2035']")).click();
        Thread.sleep(5000);
        oktargetdate.click();


    }

    public void EducationDetails() throws InterruptedException {
        Thread.sleep(5000);
        EducationInvestmentdetails.click();


    }
    // Creation of dream home Goal
    public void DreamHomegoaltype() throws InterruptedException {
        Thread.sleep(5000);
        goaltype.click();
        TypeDreamHome.click();
        SelectOkay.click();
    }

    public void DreamDetails() throws InterruptedException {
        Thread.sleep(5000);
        DreamHomeInvestmentdetails.click();


    }


    public void selectDreamHomeyearinlist(String Year) throws InterruptedException {

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"2032\").instance(0))")).click();
        //driver.findElement(By.xpath("//*[@index='2' and @text='2035']")).click();
        Thread.sleep(5000);
        oktargetdate.click();

    }

    public void Retiretype() throws InterruptedException {
        Thread.sleep(5000);
        goaltype.click();
        SelectOkay.click();
    }

    public void Monthlyinvestment() throws InterruptedException {
        Thread.sleep(5000);
        MonthlyPayment.click();


    }

    public void selectyearonetimepay(String Year) throws InterruptedException {

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"2032\").instance(0))"));
        driver.findElement(By.xpath("//*[@index='3' and @text='2032']")).click();
        Thread.sleep(5000);
        oktargetdate.click();


    }

    public void Optionaldashboard() throws InterruptedException {
        Thread.sleep(5000);
        OptionalPayment.isDisplayed();
    }

    public void EnteronetimeAmount(String OnetimeAmount) throws InterruptedException {
        Thread.sleep(5000);
        EnteronetimePayment.sendKeys(OnetimeAmount);
    }

    public void Onetimepayment() throws InterruptedException {
        Thread.sleep(3000);
        Proceedwithonetime.click();


    }

    public void steppage() throws InterruptedException {
        Thread.sleep(5000);
        StepUppage.isDisplayed();
    }

    public void InvestmentIncrement() throws InterruptedException {
        Thread.sleep(5000);
        IncreaseMonthlyInvest.click();
    }

    public void Proceedstep() throws InterruptedException {
        Thread.sleep(5000);
        proceedwithstepup.click();

    }

    public void oktext() throws InterruptedException {
        Thread.sleep(5000);
        OkayButton.click();

    }

    public void stepupDetails() throws InterruptedException {
        Thread.sleep(5000);
        Stepup.click();


    }

    public void InvetmentgoalDetails() throws InterruptedException {
        Thread.sleep(5000);
        Investmonthly.click();


    }

    public void GoalsPaymentdashboard() throws InterruptedException {
        Thread.sleep(5000);
        GoalsPaymentpage.isDisplayed();


    }
    public void Paymentnext() throws InterruptedException {
        Thread.sleep(5000);
        Next.click();


    }

    public void BackGoalspage() throws InterruptedException {
        Thread.sleep(8000);
        takemebacktogoalpage.click();


    }
   /* public void Validategoalstatus() throws InterruptedException {
        Thread.sleep(5000);

        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Active\").instance(0))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]"));
        Thread.sleep(5000);


    }*/

    public void SelectDigitalGold() throws InterruptedException {
        Thread.sleep(5000);
        //WebElement Clickdigitalgold =driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"More on goals\").instance(0))"));
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 700,
                    "direction", "down",
                    "percent", 1.0
            ));
            //driver.findElement(By.xpath("//*[@index='3' and @text='Build a savings habit and grow your Gold investment safely and securely.']"));
            //Thread.sleep(5000);
            Clickdigitalgold.click();

        }
    }



    public void SelectGoldDate() throws InterruptedException {
        Thread.sleep(5000);
        GoldTargetDate.click();

    }

    public void SelectGoldYear() throws InterruptedException {
        Thread.sleep(5000);
        GoldTargetYear.click();


    }

    public void clickgoldyear(String Year) throws InterruptedException {

        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"2026\").instance(0))"));
        driver.findElement(By.xpath("//*[@index='2' and @text='2026']")).click();
        Thread.sleep(5000);
        GoldDateok.click();


    }

    public void Digitalamount(String Goldamt) throws InterruptedException {
        Thread.sleep(5000);
        GoldAmount.sendKeys(Goldamt);
    }

    public void DigitalGoldDashboard() throws InterruptedException {
        Thread.sleep(5000);
        Goldportfolio.isDisplayed();
    }

    public void DigitalInvest() throws InterruptedException {
        Thread.sleep(5000);
        Goldinvestment.click();
    }

    public void DigitalGoldPay() throws InterruptedException {
        Thread.sleep(5000);
        paynowgold.click();
    }

    public void DigitalGoldonetimeblock() throws InterruptedException {
        Thread.sleep(5000);
        onetimeinvestblock.isDisplayed();
    }

    public void Digitalcontinue() throws InterruptedException {
        Thread.sleep(5000);
        ContinueButton.click();
    }

    public void DigitalGoldStatus() throws InterruptedException {
        Thread.sleep(5000);
        GoldStatus.isDisplayed();
    }

    public void DigitalGoldSuccessfull() throws InterruptedException {
        Thread.sleep(5000);
        Goldsuccessfull.isDisplayed();
    }

    public void DigitalMonthInvestment() throws InterruptedException {
        Thread.sleep(5000);
        goldmonthinvest.click();
    }

    public void digitalsetup() throws InterruptedException {
        Thread.sleep(5000);
        goldset.click();


    }

    /*public void digitalnext() throws InterruptedException {
        Thread.sleep(3000);
        monthnext.click();
    }*/

    /*public void GoldPayMonth() throws InterruptedException {
        Thread.sleep(3000);
        GoldMonthlypay .click();
    }
*/

    /*public void digitalgoldSIPblock() throws InterruptedException {
        Thread.sleep(3000);
        GoldSIP.isDisplayed();
    }*/


    /*public void digitalcontinuebutton() throws InterruptedException {
        Thread.sleep(3000);
      digitalcontinue.click();
    }*/

   /* public void digitalmonthgoldstatus() throws InterruptedException {
        Thread.sleep(3000);
        digitalmstatus.isDisplayed();
    }*/

    public void ValidateDigitalMessage(String DigitalMessage ) throws InterruptedException {
        Thread.sleep(5000);
        //DigitalgoldMinimum.isDisplayed();
        String minimum = DigitalgoldMinimum.getText();
        Assert.assertEquals(DigitalMessage, minimum);
    }

    public void digitalminimumclose() throws InterruptedException {
        Thread.sleep(5000);
        clickcancelicon.click();
   }

    public void Retirewithoutpayment() throws InterruptedException {
        Thread.sleep(5000);
        Retirewithout.click();


    }

    public void RetireProceedwithoutstep() throws InterruptedException {
        Thread.sleep(3000);
        proceedRetirewithout.click();

    }
    /*public void Retirewithout() throws InterruptedException {
        Thread.sleep(3000);
        Retirewithoutnext.click();

    }*/

    public void ValidateDigitallargeMessage(String DigitalLargeMessage) throws InterruptedException {
        Thread.sleep(5000);
        String minimum = DigitalLargeamount.getText();
        Assert.assertEquals(DigitalLargeMessage, minimum);
    }

    public void GoalRetireReview() throws InterruptedException {
        Thread.sleep(5000);
        RetireReviewPage.isDisplayed();
    }

    public void Stepupedits() throws InterruptedException {
        Thread.sleep(5000);
        Retirestepupedit.click();
    }

    /*public void Stepupview() throws InterruptedException {
        Thread.sleep(3000);
        editstepup.isDisplayed();
    }*/

    public void EnterIncrement(String Percentage) throws InterruptedException {
        Thread.sleep(5000);
        TapStepup.click();
        Sendincrement.clear();
        // EnterCurrentAge.clear();
        Sendincrement.sendKeys(Percentage);
    }

    public void ValidateStepupmessage(String RetireMessage1) throws InterruptedException {
        Thread.sleep(5000);
        String incrementstepup = Warningeditstepup.getText();
        Assert.assertEquals(RetireMessage1, incrementstepup);
    }
    public void SelectYearStepup(String Year) throws InterruptedException {

        /*boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 1000, "height", 1100,
                    "direction", "down",
                    "percent", 1.0
            ));*/


          //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"2100\"))"));
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(10)"));
        int numberOfScrolls = 14; // Adjust the number of scrolls as needed

        for (int i = 0; i < numberOfScrolls; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@text='2100']")).click();
            Thread.sleep(3000);
            oktargetdate.click();


        }

    public void ReviewMessageClick() throws InterruptedException {
        Thread.sleep(5000);
        messageok.click();
    }

    public void AddOnetime(String Payment) throws InterruptedException {
        Thread.sleep(5000);
        taponetime.click();
        sendonetime.clear();
        sendonetime.sendKeys(Payment);
    }
    public void ClickUpdateone() throws InterruptedException {
        Thread.sleep(5000);
        Updateonetime.click();
    }
    public void Onetimepaymentedit() throws InterruptedException {
        Thread.sleep(5000);
        editonetimepayment.click();
    }
    public void Validateonetimepaymentmessage(String OneTimeMessage2) throws InterruptedException {
        Thread.sleep(5000);
        String paymentmsg = Warningeditonetime.getText();
        Assert.assertEquals(OneTimeMessage2, paymentmsg);
    }

    public void ClickNoOptions() throws InterruptedException {
        Thread.sleep(5000);
        NoOption.click();

    }

    public void ClickEditBack() throws InterruptedException {
        Thread.sleep(5000);
        SetupBack.click();

    }

    public void SelectDraft() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"new goal\").instance(0))"));
        Thread.sleep(5000);
        DraftTab.click(); // Select Draft Tab

    }

    public void CreateGoalFromDraft() throws InterruptedException {
        Thread.sleep(5000);
        GoalsDraftData.click();// Select Goal which are in draft status

    }

    public void SelectPauseGoal() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"new goal\").instance(0))"));
        Thread.sleep(5000);
        PauseGoalName.click();

    }

    public void SelectThreeDots() throws InterruptedException {
        Thread.sleep(5000);
        ThreeDots.click();

    }

    public void SelectPause() throws InterruptedException {
        Thread.sleep(5000);
       Pause.click();

    }

    public void SelectSIP() throws InterruptedException {
        Thread.sleep(5000);
        PauseSIP.click();

    }

    public void GoalHomePage() throws InterruptedException {
        Thread.sleep(5000);
        BackToGoals.click();

    }

    public void SelectHistory() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"new goal\").instance(0))"));
        Thread.sleep(5000);
        History.click();

    }


    public void ValidateGoalsPauseStatus() throws InterruptedException {
        Thread.sleep(5000);
        PauseStatus.isDisplayed();

    }
    public void ClickResumeGoal() throws InterruptedException {
        Thread.sleep(8000);
        ResumeGoal.click();

    }

    public void ClickResumeOk() throws InterruptedException {
        Thread.sleep(5000);
        ResumeGoalOk.click();

    }

    public void ClickResumeSkip() throws InterruptedException {
        Thread.sleep(8000);
        ResumeSkip.click();

    }

    public void ValidateHistoryTab() throws InterruptedException {
        Thread.sleep(5000);
        ResumeHistory.isDisplayed();

    }




}






