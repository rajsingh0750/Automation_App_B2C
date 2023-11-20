package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import java.io.IOException;

import static com.appreciatewealth.pages.GoalsPage.finalName;

public class MiniModulePage extends BasePage {
    BasePage basePage = new BasePage();
    SignInPage signInPage;

    DashboardPage dashboardPage;




    public MiniModulePage() {
        this.signInPage = new SignInPage();
        this.dashboardPage = new DashboardPage();
        this.basePage = new BasePage();
    }

    public void NavigateToMiniModule() throws InterruptedException, IOException {
        Thread.sleep(5000);
        dashboardPage.ClickOnGoToDashboard();
        Thread.sleep(4000);
        basePage.ClickProfileSettings();
    }


    @AndroidFindBy(xpath = "//*[contains(@text,'Accounts')]")
    private WebElement MiniAccounts;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement YourAccounts;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement AccountBalance;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout")
    private WebElement Infoicon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")
    private WebElement Accountokay;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]")
    private WebElement TabDriveWealth;

    @AndroidFindBy(xpath = "//*[@text= 'DriveWealth Account Details']")
    private WebElement DriveWealthDetails;

    @AndroidFindBy(xpath = "//*[@text= 'AIAH000007']")
    private WebElement MarginDetails;
    @AndroidFindBy(xpath = "//*[@text= 'AIQQ000011']")
    private WebElement CashDetails;

    @AndroidFindBy(xpath = "//*[contains(@text,'Pricing')]")
    private WebElement MiniPricing;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement PricingPage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[3]")
    private WebElement Goalsinfo;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[3]")
    private WebElement Tradeinfo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView[3]")
    private WebElement Cashinfo;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement Other;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement PricingClose;

    @AndroidFindBy(xpath = "//*[contains(@text,'Legal')]")
    private WebElement MiniLegal;
    @AndroidFindBy(xpath = "//*[@text='Appreciate Terms and Conditions']")
    private WebElement Termspage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Appreciate Platform\"]")
    private WebElement platform;

    @AndroidFindBy(xpath = "//*[@text='Terms of Use']")
    private WebElement platformpage;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Appreciate Broking\"]")
    private WebElement Broking;

    @AndroidFindBy(xpath = "//*[@text='Appreciate Broking IFSC Private Limited Terms & Conditions']")
    private WebElement brokingpage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Registrations\"]")
    private WebElement Register;
    @AndroidFindBy(xpath = "//*[@index='0' and @text='Appreciate Broking IFSC Private Limited']")
    private WebElement RegisterPage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button[1]")
    private WebElement ViewRegisterNumber1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button[2]")
    private WebElement ViewRegisterNumber2;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"legal\"]")
    private WebElement BackBroking;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement Close;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Drive Wealth\"]")
    private WebElement DriveWealth;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Terms & Disclosures\"]")
    private WebElement TermsDisclosures;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Privacy Policy\"]")
    private WebElement PrivacyPolicy;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"W-8BEN\"]")
    private WebElement W8BEN;

    @AndroidFindBy(xpath = "//*[@text='YES Bank']")
    private WebElement YesBank;

    @AndroidFindBy(xpath = "//*[@text='Do you want to download PDF file?']")
    private WebElement popupblock;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Download\"]")
    private WebElement Download;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.Toast[1]")
    private WebElement ToastMessage;

    @AndroidFindBy(xpath = "//*[@text='CSR']")
    private WebElement CSR;
    @AndroidFindBy(xpath = "//*[@text='Invest like a woman']")
    private WebElement CSRWoman;

    @AndroidFindBy(xpath = "//*[@text='Shoots']")
    private WebElement CSRShoots;

    @AndroidFindBy(xpath = "//*[@text='Investing for everyone']")
    private WebElement Everyone;

    @AndroidFindBy(xpath = "//*[@text='Send us your suggestions']")
    private WebElement suggest;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")
    private WebElement CSRSubmit;

    @AndroidFindBy(xpath = "//*[@text='Please enter valid email']")
    private WebElement erroremail;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.TextView[3]")
    private WebElement errorcomment;

    @AndroidFindBy(xpath = "//*[@text='refer now']")
    private WebElement ReferNow;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement RewardPage;

    @AndroidFindBy(xpath = "//*[@text='Refer a friend']")
    private WebElement ReferFriend;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Rewards\"]")
    private WebElement Rewards;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Coupons\"]")
    private WebElement ReferCoupons;

    @AndroidFindBy(xpath = "//*[@text='Support']")
    private WebElement Support;

    @AndroidFindBy(xpath = "//*[@text='Submit a Ticket']")
    private WebElement SupportTicket;

    @AndroidFindBy(xpath = "//*[@text='General questions']")
    private WebElement IssueType;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement EditSubject;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement EditMessage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")
    private WebElement SupportSubmit;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView")
    private WebElement SupportBack;

    @AndroidFindBy(xpath = "//*[@text='Change Language']")
    private WebElement Language;
    @AndroidFindBy(xpath = "//*[@text='Hindi']")
    private WebElement Hindi;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")
    private WebElement ContinueLanguage;

    @AndroidFindBy(xpath = "//*[@text='भाषा बदलें']")
    private WebElement HindiLanguage;

    @AndroidFindBy(xpath = "//*[@text='English']")
    private WebElement English;

    @AndroidFindBy(xpath = "//*[@text='प्रोफाइल']")
    private WebElement TextChange;

    @AndroidFindBy(xpath = "//*[@text='About Us']")
    private WebElement Us;

    @AndroidFindBy(xpath = "//*[@text='Our Mission']")
    private WebElement Mission;

    @AndroidFindBy(xpath = "//*[@text='Our Vision and Values']")
    private WebElement Vission;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[5]")
    private WebElement GoalPay;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")
    private WebElement GoalContinue;

    @AndroidFindBy(xpath = "//*[@text='Transactions']")
    private WebElement Transaction;

    @AndroidFindBy(xpath = "//*[@text='Goals']")
    private WebElement GaolsTransaction;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]")
    private WebElement LatestGoalName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]")
    private WebElement LatestCash;

    @AndroidFindBy(xpath = "//*[@text='Cash']")
    private WebElement CashTransaction;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement TransactionClose;

    @AndroidFindBy(xpath = "//*[@text='trade' and @class='android.widget.TextView']")
    private WebElement TradeDashboard;

    @AndroidFindBy(xpath = "//*[@text='change']")
    private WebElement ChangeDashboard;

    @AndroidFindBy(xpath = "//*[@text='डैशबोर्ड']")
    private WebElement HomeDashboard;
    @AndroidFindBy(xpath = "//*[@text='Portfolio']")
    private WebElement Portfolio;

    @AndroidFindBy(xpath = "//*[@text='लक्ष्य']")
    private WebElement HindiGoal;

    @AndroidFindBy(xpath = "//*[@text='ट्रेड' and @class='android.widget.TextView']")
    private WebElement HindiTrade;

    @AndroidFindBy(xpath = "//*[@text='बदलाव']")
    private WebElement HindiChange;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement YourPortfolioHeading;

    @AndroidFindBy(xpath = "//*[@text='Trade']")
    private WebElement PortfolioTrade;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView")
    private WebElement PortfolioGoals;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView")
    private WebElement PortfolioClose;

    @AndroidFindBy(xpath = "//*[@text='Add-On Services']")
    private WebElement AddOnService;

    @AndroidFindBy (xpath = "//*[@text='Profile']")
    WebElement ProfileDetails;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[4]")
    WebElement GetFullName;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[6]")
    WebElement GetDOB;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[8]")
    WebElement GetGender;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[10]")
    WebElement GetMaritalStatus;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement GetEducationQualification;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement GetOccupationType;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    WebElement GetAnnualIncome;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/edMobileNumber")
    WebElement GetMobileNumber;


    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/edEmailId")
    WebElement GetEmailId;

    @AndroidFindBy (xpath = "//*[contains(@text,'Ashok')]")
    WebElement GetAddress;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/tvUpdateCity")
    WebElement GetCity;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/tvUpdateDistrict")
    WebElement GetDistrict;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/tvUpdateState")
    WebElement GetState;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/tvUpdatePincode")
    WebElement GetPinCode;

    @AndroidFindBy (xpath = "//*[contains(@text,'XXXXX')]")
    WebElement GetPanCard;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/nominee_name_tv")
    WebElement GetNomineeName;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/nominee_date_of_birth_tv")
    WebElement GetNomineeDOB;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/nominee_phone_number_tv")
    WebElement GetNomineePhoneNumber;
    @AndroidFindBy(xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    WebElement ClickOnClose;

    @AndroidFindBy(xpath ="//*[@text='Profile']")
    WebElement ValidateProfilePage;
    @AndroidFindBy(xpath ="//*[@text='update']")
    WebElement UpdateAnnualIncome;

    @AndroidFindBy(xpath ="//*[@text='10-20 Lakhs']")
    WebElement UpdateAnnualIncomeToTwenty;

    @AndroidFindBy(xpath ="//*[@text='20-25 Lakhs']")
    WebElement UpdateAnnualIncomeToTwentyFive;

    @AndroidFindBy(xpath ="//*[@text='Settings & Preferences']")
    WebElement SettingPasscode;

    @AndroidFindBy(xpath ="//*[@text='Change Passcode']")
    WebElement ChangePasscode;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement PasscodeConfirm;

    @AndroidFindBy(xpath ="//*[@text='Set a new passcode']")
    WebElement NewPasscode;




    public void Login() throws IOException, InterruptedException {
        signInPage.DynamicSignIn("varshatmysuru1992@gmail.com");
        dashboardPage.ClickOnGoToDashboard();
        Thread.sleep(5000);
        basePage.ClickProfileSettings();

    }

    public void AccountsPage() throws InterruptedException {
        Thread.sleep(2000);
        MiniAccounts.click();


    }

    public void YourAccountsPage() throws InterruptedException {
        Thread.sleep(3000);
        AccountBalance.isDisplayed();
    }

    public void InfoDetails() throws InterruptedException {
        Thread.sleep(3000);
        Infoicon.click();
    }

    public void okay() throws InterruptedException {
        Thread.sleep(3000);
        Accountokay.click();
    }

    public void DriveWealthoption() throws InterruptedException {
        Thread.sleep(3000);
        TabDriveWealth.click();
    }

    public void WealthDetailspage() throws InterruptedException {
        Thread.sleep(3000);
        DriveWealthDetails.isDisplayed();
    }

    public void AccountMargin() throws InterruptedException {
        Thread.sleep(3000);
        MarginDetails.click();

    }

    public void AccountCash() throws InterruptedException {
        Thread.sleep(3000);
        CashDetails.click();

    }

    public void PricingPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Pricing\").instance(0))"));
        Thread.sleep(2000);
        MiniPricing.click();


    }

    public void PricingDetails() throws InterruptedException {
        Thread.sleep(2000);
        PricingPage.isDisplayed();
    }

    public void GoalsinfoDetails() throws InterruptedException {
        Thread.sleep(2000);
        Goalsinfo.click();
    }

    public void TradeinfoDetails() throws InterruptedException {
        Thread.sleep(2000);
        Tradeinfo.click();
    }

    public void CashinfoDetails() throws InterruptedException {
        Thread.sleep(2000);
        Cashinfo.click();
    }

    public void OtherFeesDetails() throws InterruptedException {
        Thread.sleep(2000);
        Other.isDisplayed();
    }

    public void OtherClose() throws InterruptedException {
        Thread.sleep(3000);
        PricingClose.click();
    }

    public void LegalPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Legal\").instance(0))"));
        Thread.sleep(2000);
        MiniLegal.click();


    }

    public void TermsandConditionpage() throws InterruptedException {
        Thread.sleep(2000);
        Termspage.isDisplayed();
    }

    public void TermsandConditionclose() throws InterruptedException {
        Thread.sleep(2000);
        Close.click();
    }

    public void PlatformDetails() throws InterruptedException {
        Thread.sleep(2000);
        platform.click();
    }

    public void LegalTerms() throws InterruptedException {
        Thread.sleep(2000);
        platformpage.isDisplayed();
    }

    public void BrokingDetails() throws InterruptedException {
        Thread.sleep(2000);
        Broking.click();
    }

    public void LegalBroking() throws InterruptedException {
        Thread.sleep(2000);
        brokingpage.isDisplayed();
    }

    public void RegisterDetails() throws InterruptedException {
        Thread.sleep(2000);
        Register.click();
    }

    public void RegisterPage() throws InterruptedException {
        Thread.sleep(2000);
        RegisterPage.isDisplayed();
    }

    public void LegalRegister1() throws InterruptedException {
        Thread.sleep(2000);
        ViewRegisterNumber1.click();
    }

    public void LegalRegister2() throws InterruptedException {
        Thread.sleep(2000);
        ViewRegisterNumber2.click();
    }

    public void LegalBack() throws InterruptedException {
        Thread.sleep(2000);
        BackBroking.click();
    }

    public void LegalClose() throws InterruptedException {
        Thread.sleep(2000);
        Close.click();
    }

    public void DriveClick() throws InterruptedException {
        Thread.sleep(3000);
        DriveWealth.click();
    }

    public void TermsClick() throws InterruptedException {
        Thread.sleep(3000);
        TermsDisclosures.click();
    }

    public void PrivacyClick() throws InterruptedException {
        Thread.sleep(3000);
        PrivacyPolicy.click();
    }

    public void W8BENClick() throws InterruptedException {
        Thread.sleep(3000);
        W8BEN.click();
    }

    public void ClickYesBank() throws InterruptedException {
        Thread.sleep(3000);
        YesBank.click();
    }

    public void fileblock() throws InterruptedException {
        Thread.sleep(3000);
        popupblock.isDisplayed();
    }

    public void DownloadClick() throws InterruptedException {
        Thread.sleep(3000);
        Download.click();
    }

    public void CheckMessage(String message) throws InterruptedException {
        String ActualToastmsg = ToastMessage.getText();
        System.out.println(ActualToastmsg);
        Assert.assertEquals(ActualToastmsg, message);

    }

    public void ClickCSR() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"CSR\").instance(0))"));
        Thread.sleep(2000);
        CSR.click();
    }

    public void CSRInvestWoman() throws InterruptedException {
        Thread.sleep(2000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Our Key Initiatives \").instance(0))"));
        //Thread.sleep(2000);
        CSRWoman.isDisplayed();
    }

    public void CSRShoots() throws InterruptedException {
        Thread.sleep(3000);
        CSRShoots.isDisplayed();
    }

    public void CSRInvestEveryone() throws InterruptedException {
        Thread.sleep(3000);
        Everyone.isDisplayed();
    }

    public void SuggestText() throws InterruptedException {
        Thread.sleep(3000);
        suggest.isDisplayed();
    }

    public void SubmitButton() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 700,
                    "direction", "down",
                    "percent", 1.0
            ));
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")).click();
        }
    }

    public void ValidateEmailError(String EmailError) throws InterruptedException {
        Thread.sleep(3000);
        String EmailMsg = erroremail.getText();
        Assert.assertEquals(EmailError, EmailMsg);
    }

    public void ValidateCommentError(String CommentError) throws InterruptedException {
        Thread.sleep(3000);
        String CommentMsg = errorcomment.getText();
        Assert.assertEquals(CommentError, CommentMsg);
    }

    public void ScrollCSRClose() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"CSR\").instance(0))"));
        Thread.sleep(3000);
        Close.click();
    }

    public void ClickReferNow() throws InterruptedException {
        Thread.sleep(3000);
        ReferNow.click();
    }

    public void ValidateRewardsPage() throws InterruptedException {
        Thread.sleep(3000);
        Rewards.isDisplayed();
    }

    public void ValidateReferFriendPage() throws InterruptedException {
        Thread.sleep(3000);
        ReferFriend.isDisplayed();
    }

    public void ClickRewards() throws InterruptedException {
        Thread.sleep(3000);
        Rewards.click();
    }

    public void ClickCoupons() throws InterruptedException {
        Thread.sleep(3000);
        ReferCoupons.click();
    }

    public void SupportPage() throws InterruptedException {
        Thread.sleep(3000);
        Support.click();

    }

    public void ClickTicket() throws InterruptedException {
        Thread.sleep(3000);
        SupportTicket.click();

    }

    public void SelectIssue() throws InterruptedException {
        Thread.sleep(3000);
        IssueType.click();

    }

    public void EnterSubject(String SubjectName) throws InterruptedException {
        Thread.sleep(3000);
        EditSubject.sendKeys(SubjectName);

    }

    public void EnterMessage(String SubjectMessage) throws InterruptedException {
        Thread.sleep(3000);
        EditMessage.sendKeys(SubjectMessage);

    }


    public void ClickSubmit() throws InterruptedException {
        Thread.sleep(3000);
        SupportSubmit.click();

    }


    public void ClickBack() throws InterruptedException {
        Thread.sleep(3000);
        SupportBack.click();

    }

    public void ClickChangeLanguage() throws InterruptedException {
        Thread.sleep(3000);
        Language.click();

    }

    public void ClickHindi() throws InterruptedException {
        Thread.sleep(3000);
        Hindi.click();

    }

    public void Continuebutton() throws InterruptedException {
        Thread.sleep(3000);
        ContinueLanguage.click();

    }

    public void ClickHindiLanguageChange() throws InterruptedException {
        Thread.sleep(3000);
        HindiLanguage.click();

    }


    public void ValidateTextChange(String ChangeText) throws InterruptedException {
        Thread.sleep(3000);
        String Textword = TextChange.getText();
        System.out.println(Textword);
        Assert.assertEquals(ChangeText, Textword);
    }

    public void ClickEnglish() throws InterruptedException {
        Thread.sleep(3000);
        English.click();
    }

    public void AboutUsPage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"About Us\").instance(0))"));
        Thread.sleep(3000);
        Us.click();

    }

    public void ValidateAboutUsPage() throws InterruptedException {
        Thread.sleep(3000);
        Mission.isDisplayed();
    }
    public void ValidateVisionValues() throws InterruptedException {
        Thread.sleep(3000);
        Vission.isDisplayed();
    }

    public void ClosePage() throws InterruptedException {
        Thread.sleep(3000);
        Close.click();
    }

    public void MiniGoalPay() throws InterruptedException {
        Thread.sleep(3000);
        GoalPay.click();
    }
    public void MiniGoalContinue() throws InterruptedException {
        Thread.sleep(3000);
        GoalContinue.click();
    }

    public void MiniTransactions() throws InterruptedException {
        Thread.sleep(3000);
        Transaction.click();
    }


    public void MiniGoal() throws InterruptedException {
        Thread.sleep(3000);
        GaolsTransaction.isDisplayed();
    }
    public void GetGoalNameFromTransaction() throws InterruptedException {
        Thread.sleep(5000);
        String ActualName = LatestGoalName.getText();
        Assert.assertNotEquals(ActualName,finalName);


    }

    public void MiniCash() throws InterruptedException {
        Thread.sleep(3000);
        CashTransaction.click();
    }

    /*public void GetCashGoalName() throws InterruptedException {
        Thread.sleep(5000);
        String ActualName1 = LatestCash.getText();
        Assert.assertNotEquals(ActualName1,finalName);


    }*/

    public void MiniTransClose() throws InterruptedException {
        Thread.sleep(3000);
        TransactionClose.click();
    }

    public void TradeOption() throws InterruptedException {
        Thread.sleep(8000);
        TradeDashboard.click();
    }

    public void ChangeOption() throws InterruptedException {
        Thread.sleep(8000);
        ChangeDashboard.click();
    }

    public void DashboardOption() throws InterruptedException {
        Thread.sleep(5000);
        HomeDashboard.isDisplayed();
    }

    public void ClickHomeGoal() throws InterruptedException {
        Thread.sleep(5000);
        HindiGoal.isDisplayed();
    }
    public void ClickHomeTrade() throws InterruptedException {
        Thread.sleep(5000);
        HindiTrade.isDisplayed();
    }

    public void ClickHomeChange() throws InterruptedException {
        Thread.sleep(5000);
        HindiChange.isDisplayed();
    }


    public void MiniPortfolio() throws InterruptedException {
        Thread.sleep(3000);
        Portfolio.click();
    }

    public void MiniYourPortfolio() throws InterruptedException {
        Thread.sleep(3000);
        YourPortfolioHeading.isDisplayed();
    }
    public void MiniTradeText() throws InterruptedException {
        Thread.sleep(3000);
        PortfolioTrade.isDisplayed();
    }


    public void MiniGoalText() throws InterruptedException {
        Thread.sleep(3000);
        PortfolioGoals.isDisplayed();
    }

    public void MiniPortfolioClose() throws InterruptedException {
        Thread.sleep(3000);
        PortfolioClose.click();
    }

    public void MiniAddOnServices() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Add-On Services\").instance(0))"));
        Thread.sleep(3000);
        AddOnService.click();


    }

    public void ClickOnProfileFromDashboard() throws InterruptedException {
        Thread.sleep(4000);
        basePage.ClickProfileSettings();

    }

    public void ClickOnProfile() throws InterruptedException {
        Thread.sleep(4000);
        ProfileDetails.click();

    }
    public void ValidatePersonalAndOtherDetails(String FullName,String DOB,String Gender, String MaritalStatus, String EducationalQualification, String OccupationType, String AnnualIncome) throws InterruptedException {
        Thread.sleep(4000);
        String RunTimeFullName = GetFullName.getText();
        Assert.assertEquals(RunTimeFullName,FullName);

        String RunTimeDOB = GetDOB.getText();
        Assert.assertEquals(RunTimeDOB,DOB);

        String RunTimeGender = GetGender.getText();
        Assert.assertEquals(RunTimeGender,Gender);

        String GetRuntimeMaritalStatus= GetMaritalStatus.getText();
        Assert.assertEquals(GetRuntimeMaritalStatus,MaritalStatus);

        String GetRunTimeEducationalQualification = GetEducationQualification.getText();
        Assert.assertEquals(GetRunTimeEducationalQualification,EducationalQualification);

        String GetRunTimeOccupationType = GetOccupationType.getText();
        Assert.assertEquals(GetRunTimeOccupationType,OccupationType);

        String GetRunTimeAnnualIncome = GetAnnualIncome.getText();
        Assert.assertEquals(GetRunTimeAnnualIncome,AnnualIncome);

        //basePage.AndroidBack();
        //basePage.Logout();

    }

    public void ValidateContactDetails(String MobileNumber, String EmailId) throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Email ID\").instance(0))"));
        Thread.sleep(8000);
        String GetRunTimeMobileNumber = GetMobileNumber.getText();
        Assert.assertEquals(GetRunTimeMobileNumber,MobileNumber);
        String GetRunTimeEmailId= GetEmailId.getText();
        Assert.assertEquals(GetRunTimeEmailId,EmailId);
    }

    public void ValidatePermanentAddress(String Address, String City, String District, String State, String PinCode) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Pin Code\").instance(0))"));
        Thread.sleep(3000);
        String GetRunTimeAddress = GetAddress.getText();
        Assert.assertEquals(GetRunTimeAddress,Address);

        String GetRunTimeCity = GetCity.getText();
        Assert.assertEquals(GetRunTimeCity,City);

        String GetRunTimeDistrict = GetDistrict.getText();
        Assert.assertEquals(GetRunTimeDistrict,District);

        String GetRunTimeState = GetState.getText();
        Assert.assertEquals(GetRunTimeState,State);

        String GetRunTimePinCode = GetPinCode.getText();
        Assert.assertEquals(GetRunTimePinCode,PinCode);


    }

    public void ValidateKYCDetails(String PanNumber) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Nominee Details\").instance(0))"));
        Thread.sleep(3000);
        String GetRunTimeKYCDetails = GetPanCard.getText();
        Assert.assertEquals(GetRunTimeKYCDetails,PanNumber);

    }

    public void ValidateNomineeDetails(String NomineeName, String DateOfBirth, String PhoneNumber) throws InterruptedException {
        String GetRunTimeNomineeName= GetNomineeName.getText();
        Assert.assertEquals(GetRunTimeNomineeName,NomineeName);

        String GetRunTimeNomineeDOB = GetNomineeDOB.getText();
        Assert.assertEquals(GetRunTimeNomineeDOB,DateOfBirth);

        String GetRunTimeNomineePhoneNumber= GetNomineePhoneNumber.getText();
        Assert.assertEquals(GetRunTimeNomineePhoneNumber,PhoneNumber);

        basePage.AndroidBack();
        basePage.Logout();

    }
    public void CloseProfileScreen() throws InterruptedException {
        Thread.sleep(4000);
        ClickOnClose.click();
    }

    public void ValidateProfileScreen() throws InterruptedException {
        Thread.sleep(2000);
        ValidateProfilePage.isDisplayed();
        // basePage.Logout();
    }

    public void UpdateAnnualIncome() throws InterruptedException {
        Thread.sleep(2000);
        UpdateAnnualIncome.click();
        Thread.sleep(4000);
        UpdateAnnualIncomeToTwenty.click();
        UpdateAnnualIncome.click();
        Thread.sleep(2000);
    }

    public void ValidateUpdatedIncome() throws InterruptedException {
        String UpdatedIncome =  GetAnnualIncome.getText();
        Assert.assertEquals(UpdatedIncome,"10-20 Lakhs");
        UpdateAnnualIncome.click();
        Thread.sleep(5000);
        UpdateAnnualIncomeToTwentyFive.click();
        UpdateAnnualIncome.click();
        Thread.sleep(5000);
        ClickOnClose.click();

    }

    public void ClickSettings() throws InterruptedException {
        Thread.sleep(5000);
        SettingPasscode.click();
    }

    public void ClickPasscode() throws InterruptedException {
        Thread.sleep(5000);
        ChangePasscode.click();
    }

    public void AddingOTP() throws InterruptedException {
        Thread.sleep(8000);
        //signInPage.AllowOTPfromClipboard();
        //PasscodeConfirm.click();
        Thread.sleep(8000);
        signInPage.AllowOTPfromClipboard();
        //boolean b = ((AndroidDriver) driver).isKeyboardShown();
        //System.out.println("Keyboard Shown " + b);
        //Thread.sleep(6000);

        /*WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        WebElement element2 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element2).getId()
        ));

        WebElement element3 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));

        WebElement element4 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element4).getId()
        ));

    }
*/
    }
    public void SetPasscode() throws InterruptedException {
        Thread.sleep(5000);
        NewPasscode.isDisplayed();
        Thread.sleep(8000);
        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        WebElement element2 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element2).getId()
        ));

        WebElement element3 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));

        WebElement element4 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element4).getId()
        ));

    }

}


