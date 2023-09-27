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

public class GoalsPage extends BasePage {

    TestUtils utils = new TestUtils();
    private String goalsname;

    DashboardPage dashboardPage;

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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")
    private WebElement Selectgoaltype;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private WebElement SelectContinue;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
    private WebElement ValidateGoalCalculatorScreen;

    @AndroidFindBy(xpath = "//*[contains(@text,'35')]")
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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[1]")
    private WebElement goalsnameondashboard;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]")
    private WebElement seedetailsactivegoal;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
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


    public void NavigatetoGoals() throws IOException, InterruptedException {

        Thread.sleep(2000);
        dashboardPage.NavigatetoDashboard();
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


        WebElement clickongoalcalculator = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"goal calculator\").instance(0))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]"));
        Thread.sleep(3000);
        clickongoalcalculator.isDisplayed();

    }


    public void ClickOnGoalCalculator() throws InterruptedException {
        Thread.sleep(3000);
        clickongoalcalculator.click();

    }

    public void SelectGoalType() throws InterruptedException {
        Thread.sleep(3000);
        Selectgoaltype.click();
        SelectContinue.click();
    }

    public void EnterCurrentAge(String Age) throws InterruptedException {
        Thread.sleep(3000);
        Tapcurrent.click();
        Sendcurrentage.clear();
        // EnterCurrentAge.clear();
        Sendcurrentage.sendKeys(Age);
    }

    public void EnterRetireAge(String RetireAge) throws InterruptedException {
        Thread.sleep(3000);
        TapRetire.click();
        SendRetireAge.clear();
        SendRetireAge.sendKeys(RetireAge);
    }

    public void EnterAmount(String Amount) throws InterruptedException {
        Thread.sleep(3000);
        EnterAmount.sendKeys(Amount);
    }

    public void ValidateYourcurrentage(String currentAge) throws InterruptedException {
        Thread.sleep(3000);
        String ActualcurrentAge = ValidateYourcurrentage.getText();
        Assert.assertEquals(ActualcurrentAge, currentAge);
    }

    public void ValidateRetirementby(String RetirementAge) throws InterruptedException {
        Thread.sleep(3000);
        String ActualRetirementAge = ValidateRetirementby.getText();
        Assert.assertEquals(ActualRetirementAge, RetirementAge);
    }

    public void ValidateCurrentexpenses(String Expenses) throws InterruptedException {
        Thread.sleep(3000);
        String ActualExpenses = ValidateCurrentexpenses.getText();
        Assert.assertEquals(ActualExpenses, Expenses);
    }

    public void ValidateExpenseswithinflation(String inflation) throws InterruptedException {
        Thread.sleep(3000);
        String Actualinflation = ValidateExpenseswithinflation.getText();
        Assert.assertEquals(Actualinflation, inflation);
    }

    public void ValidateToretire(String Toretire) throws InterruptedException {
        Thread.sleep(3000);
        String ActualToretire = ValidateToretire.getText();
        Assert.assertEquals(ActualToretire, Toretire);
    }

    public void ValidateTotalamount(String Totalamount) throws InterruptedException {
        Thread.sleep(3000);
        String ActualTotalamount = ValidateTotalamount.getText();
        Assert.assertEquals(ActualTotalamount, Totalamount);
    }


    public void ValidateCurrentAge(String Age) throws InterruptedException {
        Thread.sleep(3000);
        String ActualAge = ValidateCurrentAge.getText();
        Assert.assertEquals(ActualAge, Age);
    }

    public void ValidateRetirementAge(String RetirementAge) throws InterruptedException {
        Thread.sleep(3000);
        String Age2 = ValidateRetireAge.getText();
        Assert.assertEquals(RetirementAge, Age2);
    }

    public void ClickonSeeTargetAmount() throws InterruptedException {
        Thread.sleep(3000);
        SelectSeeTargetButton.click();
    }

    public void ValidateStartGoalButton() throws InterruptedException {
        Thread.sleep(3000);
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
        // driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"All goals\").instance(0))"));
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 500,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));
            //driver.switchTo().frame(goalsnameondashboard);
            Thread.sleep(3000);
            goalsname = goalsnameondashboard.getText();
            System.out.println("Goal Name " + goalsname);
            WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.ImageView"));
            Thread.sleep(3000);
            driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                    "elementId", ((RemoteWebElement) element).getId()
            ));
//           driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//                 "left", 100, "top", 100, "width", 600, "height", 650,
//              "elementId", ((RemoteWebElement) element).getId(),
//                 "direction", "up",
//               "percent", 2.0
//           ));


            WebElement goalsnameondetailscreen = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Summary\").instance(0))"));
            Thread.sleep(3000);
            String goalsnameondetailspage = Summarygoal.getText();
            Assert.assertEquals(goalsname, goalsnameondetailspage);

            // seedetailsactivegoal.click();
        }

    }

    // Verify Creating a New goal from goal dashboard
    public void clicknewgoal() throws InterruptedException {
        Thread.sleep(3000);
        Clickonnewgoal.click();

    }

    //Select goal type from goal creation
    public void clickongoaltype() throws InterruptedException {
        Thread.sleep(3000);
        goaltype.click();
        SelectOkay.click();

    }


    //Enter goal name in goal creation page
    public void Entergoalname(String Name) throws InterruptedException {
        Thread.sleep(3000);
        Entergoalname.sendKeys(Name);
    }

    // Select the target date in gold creation page
    public void clicktargetdate() throws InterruptedException {
        Thread.sleep(3000);
        targetdate.click();

    }

    public void clicktargetyear() throws InterruptedException {
        Thread.sleep(3000);
        targetyear.click();

    }

    public void selectyearinlist(String Year) throws InterruptedException {

        WebElement clicktargetyear = driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"2025\").instance(0))"));
        driver.findElement(By.xpath("//*[@index='2' and @text='2025']")).click();
        Thread.sleep(3000);
        oktargetdate.click();


    }

    public void targetamount(String Amount) throws InterruptedException {
        Thread.sleep(3000);
        targetamount.sendKeys(Amount);
    }

    // Investment option selections
    public void onetimeinvestment() throws InterruptedException {
        Thread.sleep(3000);
        goalonetimeinvestment.click();


    }

    public void investment() throws InterruptedException {
        Thread.sleep(3000);
        goalinvestmentoptions.click();


    }

    public void Targetportfoliodashboard() throws InterruptedException {
        Thread.sleep(3000);
        Targetportfoliodashboard.isDisplayed();
    }

    public void investmentpage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"proceed with investment\").instance(0))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
    }

    public void settgoal() throws InterruptedException {
        Thread.sleep(3000);
        clicksetupgoal.click();


    }

    public void Successfullinvestment() throws InterruptedException {
        Thread.sleep(3000);
        goalsuccessfullpage.isDisplayed();
    }

    public void CheckLowintargetamount(String msg) throws InterruptedException {
        String ActuallowMsg = Lowintargetamount.getText();
        System.out.println("Minimum Amount msg " + Lowintargetamount);
        Assert.assertEquals(ActuallowMsg, msg);

    }

    public void cancelbutton() throws InterruptedException {
        Thread.sleep(3000);
        clickcancelicon.click();
    }

    public void ValidateReviewgoalpage() throws InterruptedException {
        Thread.sleep(2000);
        ValidateReviewgoalpage.isDisplayed();

    }

    public void Backbutton() throws InterruptedException {
        Thread.sleep(2000);
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
        Thread.sleep(2000);
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 500,
                    "direction", "down",
                    "percent", 1.0
            ));
            driver.findElement(By.xpath("//*[@text='Drafts']")).click();
            clickdrafttab.isDisplayed();


        }


    }
}



