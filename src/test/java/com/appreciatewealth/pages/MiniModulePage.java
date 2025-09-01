package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.sql.Ref;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

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
        //dashboardPage.ClickOnGoToDashboard();
       // Thread.sleep(4000);
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

    @AndroidFindBy(accessibility = "Pricing")
    private WebElement MiniPricing;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Pricing\n" +
            "Get details on applicable fees\"]")
    private WebElement Pricing;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Portfolio Re-balancing Fee\n" +
            "1.50%\"]")
    private WebElement Goalsinfo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Transaction Fee\n" +
            "0.05% of transaction value or\n" +
            "₹5 whichever is higher.\"]")
    private WebElement Tradeinfo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Cashback\n" +
            "Upto ₹20/-\"]")
    private WebElement Cashinfo;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Other fees\n" +
            "Platform cost of ₹1 per ticker/unit bought or sold, or fraction thereof, will be applicable for all.\n" +
            "The SEC (U.S. Securities and Exchange Commission) fee applies to all sell orders, with a minimum charge of $0.01, calculated basis on the total purchase amount.\n" +
            "The TAF (Trading Activity Fee), applies to all sell orders with a minimum charge of  0.01 to a maximum of $5.95.  It is calculated based on the number of units sold.\"]")
    private WebElement Other;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private WebElement PricingClose;

    @AndroidFindBy(xpath = "//*[contains(@text,'Legal')]")
    private WebElement MiniLegal;

    @AndroidFindBy(xpath = "//*[@text='Appreciate Terms and Conditions']")
    private WebElement Termspage;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Appreciate Platform\"]")
    private WebElement platform;

    @AndroidFindBy(xpath = "//*[@text='Terms of Use']")
    private WebElement platformpage;


    @AndroidFindBy(xpath = "//android.view.View[@text=\"Appreciate Broking\"]")
    private WebElement Broking;

    @AndroidFindBy(xpath = "//*[@text='Appreciate Broking IFSC Private Limited Terms & Conditions']")
    private WebElement brokingpage;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Registrations\"]")
    private WebElement Register;

    @AndroidFindBy(xpath = "//*[@index='0' and @text='Appreciate Broking IFSC Private Limited']")
    private WebElement RegisterPage;

    @AndroidFindBy(xpath = "//*[contains(@text,'view registration numbers')]")
    private WebElement ViewRegisterNumber1;

    @AndroidFindBy(xpath = "//*[contains(@text,'view registration numbers')]")
    private WebElement ViewRegisterNumber2;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"legal\"]")
    private WebElement BackBroking;

    @AndroidFindBy(accessibility = "About us")
    private WebElement Close;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Drive Wealth\"]")
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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Download\"]")
    private WebElement Download;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"email-error\"]")
    private WebElement EnterValidEmailError;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"comment-error\"]")
    private WebElement WhatThinkError;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.Toast[1]")
    private WebElement ToastMessage;

    @AndroidFindBy(accessibility = "CSR")
    private WebElement CSR;


    @AndroidFindBy(xpath = "CSR//android.view.View[@content-desc=\"Other Services\n" +
            "Advisory and other services\"]")
    private WebElement OtherServices;


    @AndroidFindBy(accessibility = "US government backed insurance for portfolios up to $500,000")
    private WebElement InsurenceNote;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"We truly believe that investing is for everyone and therefore we are on a mission to improve financial literacy and wealth creation.\"]")
    private WebElement CSRBanner;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Our CSR Mission\"]")
    private WebElement CSRBannerHeading;

    @AndroidFindBy(xpath = "//*[@text='Invest like a woman']")
    private WebElement CSRWoman;

    @AndroidFindBy(xpath = "//*[@text='Shoots']")
    private WebElement CSRShoots;

    @AndroidFindBy(xpath = "//*[@text='Investing for everyone']")
    private WebElement Everyone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Tell us how you can help. Send us a message and we will get back to you. We are always looking for volunteers and partners to improve financial literacy and access.\"]")
    private WebElement CSRHelpNote;



    @AndroidFindBy(xpath = "//*[@text='Shoots']")
    private WebElement CSRWomanDropDown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Improving access to investment tools and platforms for women\"]")
    private WebElement CSRWomanDropDownDesc;

    @AndroidFindBy(xpath = "//*[@text='Shoots']")
    private WebElement CSRShootsDropDown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Financial literacy programs at the district level in pilot districts in India\"]")
    private WebElement CSRShootsDropDownDesc;

    @AndroidFindBy(xpath = "//*[@text='Shoots']")
    private WebElement EveryoneDropDown;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"A micro-investment program for micro-entrepreneurs partnering with other social sector players\"]")
    private WebElement EveryoneDropDownDesc;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Send us your suggestions\"]")
    private WebElement suggest;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")
    private WebElement CSRSubmit;

    @AndroidFindBy(id = "email-error")
    private WebElement erroremail;

    @AndroidFindBy(accessibility = "Submit")
    private WebElement Submitbtn;

    @AndroidFindBy(id = "comment-error")
    private WebElement errorcomment;

    @AndroidFindBy(accessibility = "Refer now")
    private WebElement ReferNow;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement RewardPage;

    @AndroidFindBy(xpath = "//*[@text='Refer a friend']")
    private WebElement ReferFriend;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Rewards\"]")
    private WebElement Rewards;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Coupons\"]")
    private WebElement ReferCoupons;

    @AndroidFindBy(accessibility = "Support")
    private WebElement Support;

    @AndroidFindBy(accessibility = "Submit a Ticket")
    private WebElement SupportTicket;

    @AndroidFindBy(xpath = "General questions")
    private WebElement IssueType;

    @AndroidFindBy(accessibility = "General questions")
    private WebElement IssueTypeTwo;

    @AndroidFindBy(xpath = "//*[@text='General questions']")
    private WebElement ProfileIssueType;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement EditSubject;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Subject\"]/android.widget.EditText")
    private WebElement TapSubject;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement SubjectTicketProfile;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Your message\"]/android.widget.EditText")
    private WebElement EditMessage;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Your message\"]/android.widget.EditText")
    private WebElement TapMessage;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement MessageTicketProfile;

    @AndroidFindBy(accessibility = "submit")
    private WebElement SupportSubmit;

    @AndroidFindBy(id = "buttonSubmit")
    private WebElement ProfileTicketSubmit;


    @AndroidFindBy(id = "//android.widget.LinearLayout[@resource-id=\"com.appreciatewealth.android.uat:id/llUsWallet\"]")
    private WebElement USWalletOption;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView")
    private WebElement SupportBack;

    @AndroidFindBy(accessibility = "Change Language")
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

    @AndroidFindBy(accessibility = "About Us")
    private WebElement Us;

    @AndroidFindBy(accessibility = "Our Mission")
    private WebElement Mission;

    @AndroidFindBy(accessibility = "Our Vision and Values")
    private WebElement Vission;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[5]")
    private WebElement GoalPay;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")
    private WebElement GoalContinue;

    @AndroidFindBy(xpath = "//*[@text='Transactions']")
    private WebElement Transaction;


    @AndroidFindBy(accessibility = "What is Pattern Day Trading?")
    private WebElement WhatIsPatternDayTrading;

    @AndroidFindBy(xpath = "//*[@text='What is Pattern Day Trading?']")
    private WebElement PatternDayTradingHeading;

    @AndroidFindBy(xpath = "//*[@text='If you day trade more than 3 times in a 5-day rolling period you will be flagged as a Pattern Day Trader.")
    private WebElement PatternDayTradingDescription;

    @AndroidFindBy(xpath = "//*[@text='Appreciate has NOT ENABLED Pattern Day Trading by default']")
    private WebElement AppreciatePatternDayTradingMsg;

    @AndroidFindBy(accessibility = "Refer and earn ₹200")
    private WebElement ReferAndEarnHeading;

    @AndroidFindBy(accessibility = "Invite your friend")
    private WebElement InviteYourFriendHeading;

    @AndroidFindBy(accessibility = "They sign up and complete their 1st transaction")
    private WebElement SignUpHeading;

    @AndroidFindBy(accessibility = "You get ₹200 and they get ₹200 ")
    private WebElement OfferDealHeading;

    @AndroidFindBy(accessibility = "Your referral Code")
    private WebElement ReferalCodeHeading;


    @AndroidFindBy(accessibility = "Whatsapp")
    private WebElement WhatsapCTA;

    @AndroidFindBy(accessibility = "Copy link")
    private WebElement LinkCopyCTA;

    @AndroidFindBy(accessibility = "More options")
    private WebElement MoreOptionsCTA;


    @AndroidFindBy(accessibility = "Investment advisory")
    private WebElement InvestmentAdvisory;

    @AndroidFindBy(accessibility = "A government-registered investment advisor manages and recommends investments for clients in exchange for fees")
    private WebElement InvestmentAdvisoryDescription;

    @AndroidFindBy(accessibility = "SEBI Registered Investment Advisors who have the skills and time to study the market and advise you")
    private WebElement BenifitsDetailsOne;

    @AndroidFindBy(accessibility = "Completely transparent service; audited and compliance regulated by SEBI")
    private WebElement BenifitsDetailsTwo;

    @AndroidFindBy(accessibility = "Unbiased, Client centric, no conflict of interest advisory. Advisors receive renumeration from clients only")
    private WebElement BenifitsDetailsThree;



    @AndroidFindBy(accessibility = "If you have inadequate time")
    private WebElement ThinkingOfHiringOptionOne;

    @AndroidFindBy(accessibility = "If you are looking for passive income")
    private WebElement ThinkingOfHiringOptionTwo;

    @AndroidFindBy(accessibility = "If you can’t manage market risks and handle volatility")
    private WebElement ThinkingOfHiringOptionThree;

    @AndroidFindBy(accessibility = "If you need help meeting your retirement goals")
    private WebElement ThinkingOfHiringOptionFour;

    @AndroidFindBy(accessibility = "Request advisory services")
    private WebElement RequestAdvisoryServicesCTA;

    @AndroidFindBy(accessibility = "Please enter details investment advisory requirements. Our team will provide further details.")
    private WebElement RequestAdvisoryServicesDesc;

    @AndroidFindBy(accessibility = "Please enter services, our team will provide further details.")
    private WebElement RequestOtherServicesDesc;


    @AndroidFindBy(accessibility = "Tax Planning")
    private WebElement SelectRequestServicesType;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
    private WebElement RequestAdvisoryEnterSubject;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
    private WebElement RequestAdvisoryEnterMsg;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
    private WebElement RequestAdvisoryEnterMsgValue;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement RequestAdvisoryEnterSubjectValue;



    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    private WebElement RequestServicesEnterMsg;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    private WebElement RequestServicesEnterMsgValue;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    private WebElement CopyRefralCodeCTA;

    @AndroidFindBy(accessibility = "Goals")
    private WebElement GaolsTransaction;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
    private WebElement LatestGoalName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View")
    private WebElement LatestCash;

    @AndroidFindBy(accessibility = "Cash")
    private WebElement CashTransaction;

    @AndroidFindBy(accessibility = "All Transactions")
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

    @AndroidFindBy(accessibility = "Add-On Services")
    private WebElement AddOnService;

    @AndroidFindBy (accessibility = "Personal Details")
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

    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
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

    @AndroidFindBy(accessibility ="Change Passcode")
    WebElement ChangePasscode;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    WebElement PasscodeConfirm;

    @AndroidFindBy(xpath ="//*[@text='Set a new passcode']")
    WebElement NewPasscode;


    @AndroidFindBy(id ="note_tv")
    WebElement ProfileSubmit;

    @AndroidFindBy(id ="txvUsWalletLabel")
    WebElement BuyingPower;

    @AndroidFindBy(id ="txvAccountDetails")
    WebElement AccountDetails;

    @AndroidFindBy(xpath ="//*[@text='DriveWealth']")
    WebElement DriveWealthMini;

    @AndroidFindBy(accessibility ="Distributor or Agent details")
    WebElement DistributorDetails;

    @AndroidFindBy(id ="im_close")
    WebElement DistributorClose;

    @AndroidFindBy(accessibility ="Request advisory services")
    WebElement RequestAdvisory;

    @AndroidFindBy(accessibility ="Thinking of hiring")
    WebElement ThinkingHiring;


    @AndroidFindBy(xpath ="//android.view.View[@resource-id=\"feedback-form\"]/android.view.View/android.widget.EditText[1]")
    WebElement AddEmail;

    @AndroidFindBy(xpath ="//android.view.View[@resource-id=\"feedback-form\"]/android.view.View/android.widget.EditText[2]")
    WebElement AddFeedback;

    @AndroidFindBy(accessibility ="Recent Tickets")
    WebElement RecentTickets;


    @AndroidFindBy(accessibility ="Support Tickets")
    WebElement SupportTicketsPage;

    @AndroidFindBy(xpath ="//android.view.View[\n" +
            "  contains(@content-desc, \"Closed\") and \n" +
            "  contains(@content-desc, \"checking flow\") and \n" +
            "  contains(@content-desc, \"Ticket Number\")\n" +
            "]\n")
    WebElement RaisedSupportTicket;



    @AndroidFindBy(xpath ="//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    WebElement SupportPageBackArrow;

    @AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Closed\n" +
            "3 Apr 2025\n" +
            "checking \n" +
            "Ticket Number: 129609\"]")
    WebElement SupportTickets;


    @AndroidFindBy(accessibility ="Recent Tickets")
    WebElement CallUs;

    @AndroidFindBy(accessibility ="Recent Tickets")
    WebElement ChatWithWhatsapp;

    @AndroidFindBy(accessibility ="Recent Tickets")
    WebElement helpdesk;

    @AndroidFindBy(accessibility ="Recent Tickets")
    WebElement FAQ;

    @AndroidFindBy(xpath ="//*[@text='Documents']")
    WebElement Documents;

    @AndroidFindBy(accessibility ="Monthly Statements")
    WebElement MonthlyView;

    @AndroidFindBy(accessibility ="Confirmations")
    WebElement ConfirmationsView;

    @AndroidFindBy(accessibility ="Tax Documents")
    WebElement TaxView;

    @AndroidFindBy(id ="iv_close")
    WebElement ViewClose;

    @AndroidFindBy(id ="details_close_iv")
    WebElement DocumentsClose;

    @AndroidFindBy(accessibility ="FAQ")
    WebElement FAQs;

    @AndroidFindBy(xpath ="//*[@text='Partner FAQs']")
    WebElement ProductFAQs;

    @AndroidFindBy(xpath ="//*[@text='Partner FAQs']")
    WebElement PartnerFAQs;

    @AndroidFindBy(xpath ="//*[@text='Company FAQs']")
    WebElement CompanyFAQs;

    @AndroidFindBy(id ="txvLabelBuyingPowerBal")
    WebElement BuyingInfo;

    @AndroidFindBy(id ="txvBuyingPowerDesc")
    WebElement BuyingPowerText;

    @AndroidFindBy(id ="txvCashInUSDesc")
    WebElement CashInUsText;

    @AndroidFindBy(id ="txvCashInTransitDesc")
    WebElement CashInTransitText;

    @AndroidFindBy(id ="txvAmountHeldDesc")
    WebElement AmountHeldText;

    @AndroidFindBy(accessibility ="Okay")
    WebElement Okay;

    @AndroidFindBy(accessibility="Chat with us on WhatsApp")
    WebElement WhatsAPP;

    @AndroidFindBy(id ="txvWithdraw")
    WebElement Withdraw;

    @AndroidFindBy(xpath ="//*[@text='1']")
    WebElement TypeOne;

    @AndroidFindBy(xpath ="//*[@text='0']")
    WebElement TypeZero;

    @AndroidFindBy(id ="btnWithdraw")
    WebElement WithDrawButton;

    @AndroidFindBy(id ="tvEditTextError")
    WebElement ErrorMessage;

    @AndroidFindBy(xpath ="//*[@text='Day Trade Settings']")
    WebElement DayTradeSettings;

    @AndroidFindBy(id ="img_day_trading")
    WebElement DayTrading;

    @AndroidFindBy(id ="img_pattern_day_trading")
    WebElement PatternDayTrading;

    @AndroidFindBy(accessibility ="Enable Pattern Day Trading")
    WebElement EnableTrading;

    @AndroidFindBy(id ="switch_enable")
    WebElement SwitchEnable;

    @AndroidFindBy(id ="button_enable")
    WebElement ButtonEnable;

    @AndroidFindBy(xpath ="/hierarchy/android.widget.Toast[1]")
    WebElement PDTToastMessage;

    @AndroidFindBy(id ="switch_disable")
    WebElement SwitchDisable;

    @AndroidFindBy(id ="tv_view_account")
    WebElement ViewAccountValue;

    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Your Account Value\n" +
            "Your account value is the sum of total \n" +
            "invested value of your Trade holdings and \n" +
            "cash in US balance from your US Wallet.\n" +
            "\n" +
            "Note: It is mandatory to have an account \n" +
            "value greater than $25,000 to enable Pattern \n" +
            "Day Trading\"]")
    WebElement YourAccountValueAllDetails;



    @AndroidFindBy(id ="profile_image_iv")
    WebElement ProfileImage;

    @AndroidFindBy(xpath ="//*[@text='Choose From Device']")
    WebElement PhotoDevice;

    @AndroidFindBy(xpath ="//*[@text='Gallery']")
    WebElement Gallery;

    @AndroidFindBy(xpath ="//*[@text='Screenshots']")
    WebElement ScreenShorts;

    @AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Photo taken at 28-Nov-2023 9:42:10 pm.\"]")
    WebElement PhoneImage;

    @AndroidFindBy(id ="save_button")
    WebElement PhotoSave;

    @AndroidFindBy(accessibility ="Okay")
    WebElement InfoOkay;


    @AndroidFindBy(xpath = "//*[@text='Cash in US']")
    WebElement CashinUS;

    @AndroidFindBy(xpath = "//*[@text='Cash in Transit']")
    WebElement Cashintransit;

    @AndroidFindBy(xpath = "//*[@text='Amount Held']")
    WebElement Amtheld;

    @AndroidFindBy(xpath = "//*[@text='US Wallet']")
    WebElement Uswallet;



    @AndroidFindBy(accessibility ="calculated with rolling 30-day period")
    WebElement AUMchargesDetail;


    @AndroidFindBy(xpath ="//android.widget.ImageView[@content-desc=\"Transaction Fee\n" +
            "0.05% of transaction value or\n" +
            "₹5 whichever is higher.\"]")
    WebElement TransactionFeeDetail;



    @AndroidFindBy(accessibility ="Our Offerings")
    WebElement OurOfferings;

    @AndroidFindBy(accessibility ="Transaction Fee")
    WebElement TransactionFeeHeading;

    @AndroidFindBy(xpath ="//android.view.View[@content-desc=\"No transaction fee for the fifth buy transaction every month\n" +
            "\n" +
            "0.05% of transaction value or ₹5 whichever is higher. Minimum holding value to sell is ₹5 (implied)\"]")
    WebElement TransactionFeeDescriptionOne;



    @AndroidFindBy(xpath = "//*[@text='Sign in to Appreciate']")
    WebElement SigninPage;


    @AndroidFindBy(accessibility = "Investment Builder")
    WebElement InvestmentBuilder;

    @AndroidFindBy(accessibility = "Update Investment Builder")
    WebElement UpdateInvestmentBuilderPage;


    @AndroidFindBy(accessibility = "5-10 years")
    WebElement InvestedPeriod;


    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Update\"])[2]")
    WebElement UpdateCTAOfInvestedPlan;

    @AndroidFindBy(xpath = "//*[@text='Update Investment Builder']")
    WebElement InvestmentBuilderPage;


    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/tvUpdate\"])[1]")
    WebElement UpdateOneCTA;


    @AndroidFindBy(xpath = "//*[@text='Bonds']")
    WebElement Bonds;

    @AndroidFindBy(accessibility = "Update")
    WebElement UpdateCTA;


    @AndroidFindBy(id = "imgBack")
    WebElement BackArrowAtUpdateInvestmentBuilderPage;


    @AndroidFindBy(xpath = "//*[@text='Settings & Preferences']")
    WebElement SettingAndPreferencesPage;


    @AndroidFindBy(id = "details_close_iv")
    WebElement CrossIcon;

    @AndroidFindBy(id = "im_close")
    WebElement CrossIconTwo;


    @AndroidFindBy(xpath = "//*[@text='YES Bank Balance']")
    WebElement YesBankBalanceHeading;

    @AndroidFindBy(id = "imgBack")
    WebElement BackArrow;


    @AndroidFindBy(accessibility ="Hi, Raj")
    WebElement UserName;

    @AndroidFindBy(accessibility ="Refer your friends")
    WebElement ReferYourFriendHeading;

    @AndroidFindBy(accessibility ="Win a reward for each successful referral!")
    WebElement ReferDesc;

    @AndroidFindBy(accessibility ="Refer now")
    WebElement ReferNowCTA;

    @AndroidFindBy(xpath ="//android.view.View[@content-desc=\"YES Bank\n" +
            "Check balance\"]")
    WebElement YesBankCheckBalance;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'US Wallet')]")
    WebElement USWallet;



    @AndroidFindBy(accessibility ="Personal Details")
    WebElement PersonalDetails;

    @AndroidFindBy(accessibility ="Bank Accounts")
    WebElement BankAccounts;

    @AndroidFindBy(accessibility ="Orders")
    WebElement Orders;

    @AndroidFindBy(accessibility ="Reports")
    WebElement Reports;

    @AndroidFindBy(accessibility =" Settings & Preferences")
    WebElement SettingsAndPreferences;

    @AndroidFindBy(accessibility ="Change Language")
    WebElement ChangeLanguage;

    @AndroidFindBy(accessibility ="Legal")
    WebElement Legal;

    @AndroidFindBy(xpath ="//android.webkit.WebView")
    WebElement LegalPageWebView;


    @AndroidFindBy(accessibility ="About us")
    WebElement AboutUs;


    @AndroidFindBy(accessibility ="On a journey to empower you to achieve your financial goals by being your trusted destination for easy, reliable, and personalized financial solutions.")
    WebElement AboutUsDescription;


    @AndroidFindBy(id ="txvLabelBuyingPowerBal")
    WebElement USWalletInfoIcon;

    @AndroidFindBy(id ="txvcashInUS")
    WebElement CashinUSAmount;

    @AndroidFindBy(id ="txvcashInTransit")
    WebElement CashinTransitAmount;

    @AndroidFindBy(id ="txvAmountHeld")
    WebElement AmountHeldAmount;



    @AndroidFindBy(xpath = "//*[@text='US Wallet']")
    WebElement USWalletHeading;

    @AndroidFindBy(xpath = "//*[@text='Cash in US']")
    WebElement CashInUSHeading;

    @AndroidFindBy(xpath = "//*[@text='Cash in Transit']")
    WebElement CashInTransitHeading;

    @AndroidFindBy(xpath = "//*[@text='Amount Held']")
    WebElement AmountHeldHeading;


    @AndroidFindBy(xpath = "//*[@text='Your buying power is the total amount of cash you have available for investing in your brokerage account, including instant funding, but excluding funds tied up in open transactions.']")
    WebElement USWalletDescription;

    @AndroidFindBy(xpath = "//*[@text='The settled cash balance available to trade in your US broker account.']")
    WebElement CashInUSDescription;

    @AndroidFindBy(xpath = "//*[@text='The unsettled cash and instant funding balance available to trade. Cash in transit is not available to withdraw until it settles and reflects as Cash in US.']")
    WebElement CashInTransitDescription;

    @AndroidFindBy(xpath = "//*[@text='Amount held represents settled cash that is on hold due to open transactions.']")
    WebElement AmountHeldDescription;


    @AndroidFindBy(xpath = "//*[@text='okay']")
    WebElement OkayCTA;

    @AndroidFindBy(accessibility = "Okay")
    WebElement OkayCTAAtActVal;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.ImageView[2]")
    WebElement AccountValueType;

    @AndroidFindBy(xpath = "//*[@text='Account details']")
    WebElement AccountetailsHeading;

    @AndroidFindBy(xpath = "//*[@text='Margin Account Details']")
    WebElement MarginAcntDetails;

    @AndroidFindBy(xpath = "//*[@text='Cash Account Details']")
    WebElement CashActDetails;


    @AndroidFindBy(id = "imgBack")
    WebElement AccountDetailsPageBackArrow;


    @AndroidFindBy(xpath = "//*[@text='Withdraw']")
    WebElement WithdrawPage;

    @AndroidFindBy(xpath = "//*[@text='Withdrawing funds will reduce US Wallet']")
    WebElement WithdrawalDesc;

    @AndroidFindBy(id = "imgAvailableInfo")
    WebElement AvailableBalanceIcon;

    @AndroidFindBy(xpath = "//*[@text='How is withdraw amount calculated?']")
    WebElement WithdrawalRuleHeading;

    @AndroidFindBy(xpath = "//*[@text='The amount available to withdraw is the settled cash component of your buying power, excluding any pending transaction amount and holds. It is converted from $ to ₹ using the bank’s latest Foreign Exchange (FX) Purchase Rate.']")
    WebElement WithdrawalRuleDesc;

    @AndroidFindBy(id = "txvRateUsd")
    WebElement USDRate;

    @AndroidFindBy(id = "txvAmountWithdraw")
    WebElement AmountAvailableToWithdraw;

    @AndroidFindBy(id = "txvAvailableAmount")
    WebElement AvailableBalanceAtWithdrawPage;


    @AndroidFindBy(id = "cbWithdrawAll")
    WebElement WithdrawalAllBox;


    @AndroidFindBy(id = "editText")
    WebElement WithdrawalAmountShownForWithdraw;


    @AndroidFindBy(id = "editText")
    WebElement EnterAmtForWithdraw;


    @AndroidFindBy(id = "btnWithdraw")
    WebElement WithdrawCTA;


    @AndroidFindBy(xpath = "//*[@text='Insufficient US Wallet balance']")
    WebElement InsuficientBalanceError;


    @AndroidFindBy(id = "ivBack")
    WebElement WithdrawallPageBackCTA;



    @AndroidFindBy(xpath = "//*[@text='Withdraw money']")
    WebElement WithdrawalMoneyPage;

    @AndroidFindBy(id = "txvWithdrawAmount")
    WebElement WithdrawalAmt;

    @AndroidFindBy(xpath = "//*[@text='Please Note: This is an estimated amount, the actual amount may vary']")
    WebElement WithdrawalAmtNote;

    @AndroidFindBy(id = "ivBack")
    WebElement BankAct;

    @AndroidFindBy(xpath = "//*[@text='It will take 4 - 6 business days to receive your funds in your bank account.']")
    WebElement BusinessDays;

    @AndroidFindBy(id = "btnOkay")
    WebElement ConfirmWithdrawalCTA;


    @AndroidFindBy(xpath = "//*[@text='Withdrawal Request Accepted']")
    WebElement WithdrawalRequestAcceptedHeading;


    @AndroidFindBy(id = "txvSubTitle")
    WebElement OrderDetails;

    @AndroidFindBy(xpath = "//*[@text='go to home dashboard']")
    WebElement GoToHomeDashboard;


    @AndroidFindBy(id = "txvSubmitTicket")
    WebElement SubmitTicket;


    @AndroidFindBy(xpath = "//*[@text='Submit a Ticket']")
    WebElement SubmitTicketPage;


    @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"com.appreciatewealth.android:id/editText\"])[1]")
    WebElement EnterSubject;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.appreciatewealth.android:id/editText\"]")
    WebElement EnterSubjectValue;


    @AndroidFindBy(xpath = "(//android.widget.EditText[@resource-id=\"com.appreciatewealth.android:id/editText\"])[2]")
    WebElement EnterMsgValue;


    @AndroidFindBy(id = "buttonSubmit")
    WebElement SubmitCTA;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Personal Details\"]")
    WebElement PersonalDetailsPage;

    @AndroidFindBy(accessibility = " with relevant documents if you have any concerns with your profile data.")
    WebElement PersonalDetailsNote;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Personal Details\"]")
    WebElement PersonalDetailsHeading;

    @AndroidFindBy(accessibility = "Other Personal Info")
    WebElement OtherPersonalInfo;


    @AndroidFindBy(accessibility = "Contact Details")
    WebElement ContactDetailsHeading;

    @AndroidFindBy(accessibility = "Permanent Address")
    WebElement PermanentAddressHeading;

    @AndroidFindBy(accessibility = "Online KYC Details")
    WebElement OnlineKYCDetailsHeading;


    @AndroidFindBy(accessibility = "Nominee Details")
    WebElement NomineeDetailsHeading;

    @AndroidFindBy(accessibility = "Note: You have not appointed a nominee for your YES Bank Savings Account. Please ")
    WebElement NomineeNoteDetailsHeading;

    @AndroidFindBy(accessibility = "Submit a support ticket")
    WebElement NomineeNoteDetailsTwoHeading;

    @AndroidFindBy(accessibility = " or visit your nearest YES bank branch to update nominee details.")
    WebElement NomineeNoteDetailsThreeHeading;

    @AndroidFindBy(accessibility = "Submit a support ticket")
    WebElement SubmitASupportTicket;


    @AndroidFindBy(accessibility = "Have issues? Submit a ticket")
    WebElement SubmitATicket;


    @AndroidFindBy(accessibility = "General questions")
    WebElement GeneralQuestionIssueType;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Subject\"]/android.widget.EditText")
    WebElement MFSubmitATicketSubject;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement MFSubmitATicketSubjectValue;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Your message\"]/android.widget.EditText")
    WebElement MFSubmitATicketYourMsg;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Your message\"]/android.widget.EditText")
    WebElement MFSubmitATicketYourMsgValue;



    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterSubjectUnderPANVerificationArea;


    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    WebElement EnterMsgUnderIssueArea;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Subject\"]/android.widget.EditText")
    WebElement EnterSubjectForMF;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterSubjectForMFValue;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Your message\"]/android.widget.EditText")
    WebElement EnterMsgForMF;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\" Your message\"]/android.widget.EditText")
    WebElement EnterMsgForMFValue;

    @AndroidFindBy(accessibility = "Submit a Ticket")
    WebElement SubmitATicketPage;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Please mention your issue here and \n" +
            "our team will get back to you within 24 hours\"]")
    WebElement SubmitATicketDesc;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
    WebElement Subject;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement SubjectEnter;


    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    WebElement Message;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    WebElement MessageEnter;

    @AndroidFindBy(accessibility = "Submit")
    WebElement SubmitBtn;


    @AndroidFindBy(accessibility = "Please enter subject")
    WebElement EnterSubjectErrorMsg;

    @AndroidFindBy(accessibility = "Please enter your message")
    WebElement EnterMsgError;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView")
    WebElement SettingIcon;


    @AndroidFindBy(accessibility = "Settings")
    WebElement SettingsHeading;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"US Stocks\n" +
            "Tab 1 of 2\"]")
    WebElement USStocks;

    @AndroidFindBy(accessibility = "As of now, Yes bank is the only bank you can add for US stocks")
    WebElement YesBankNote;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@content-desc, 'Yes Bank')]")
    WebElement AddedYesBankAct;


    @AndroidFindBy(xpath = "Submit a ticket")
    WebElement SubmitATicketForMutualFunds;


    @AndroidFindBy(xpath = "")
    WebElement DistributorAgentPage;


    @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Submit a ticket')]")
    WebElement SubmitATicketForUSStocks;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterSubjectForSubmitATicketUnderUSStocks;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterMsgForSubmitATicketUnderUSStocks;

    @AndroidFindBy(xpath = "//android.widget.ImageView[starts-with(@content-desc, 'YES BANK')]")
    WebElement AddedYesBankActForMF;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mutual funds\n" +
            "Tab 2 of 2\"]")
    WebElement MF;


      @AndroidFindBy(accessibility = "For swift payments, make sure to add same bank on UPI app also")
    WebElement PaymentNote;

    @AndroidFindBy(accessibility = "All Transactions")
    WebElement AllTransactionsPage;

    @AndroidFindBy(accessibility = "Filter")
    WebElement FilterDropDown;

    @AndroidFindBy(accessibility = "Trade")
    WebElement TradeTab;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Transaction Fee\n" +
            "0.05% of transaction value or\n" +
            "₹5 whichever is higher.\"]")
    WebElement TradeTransactionFee;

    @AndroidFindBy(accessibility = "Goals")
    WebElement GoalsTab;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Transaction Fee\n" +
            "Standard: 0.75%\n" +
            "Portfolio Returns < 10%: 0.50%\"]")
    WebElement GoalsTransactionFee;


    @AndroidFindBy(accessibility = "Transaction Fee")
    WebElement GoalsTransactionFeeHeading;


    @AndroidFindBy(accessibility = "Mutual Funds")
    WebElement MutualFundsTab;

    @AndroidFindBy(accessibility = "Cash")
    WebElement CashTab;

    @AndroidFindBy(accessibility = "Change Passcode")
    WebElement ChangePasscodeSection;

    @AndroidFindBy(accessibility = "Investment Builder")
    WebElement InvestentBuilder;

    @AndroidFindBy(accessibility = "Day Trade Settings")
    WebElement DayTradeSetting;

    @AndroidFindBy(accessibility = "Biometric")
    WebElement Biometric;

    @AndroidFindBy(accessibility = "Dark mode")
    WebElement DarkMode;


    @AndroidFindBy(accessibility = "Use device settings")
    WebElement UserDeviceSettings;


    @AndroidFindBy(accessibility = "Deactivate Accounts")
    WebElement DeactivateAccounts;

    @AndroidFindBy(accessibility = "Enter the OTP sent to your mobile number")
    WebElement OtpSendHeading;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    WebElement EnterOTPFieldForPasscodeChange;


    @AndroidFindBy(accessibility = "Confirm")
    WebElement ConfirmCTA;


    @AndroidFindBy(accessibility = "1")
    WebElement OneBtnSetNewPassCode;

    @AndroidFindBy(accessibility = "2")
    WebElement TwoBtnSetNewPassCode;

    @AndroidFindBy(accessibility = "3")
    WebElement ThreeBtnSetNewPassCode;

    @AndroidFindBy(accessibility = "4")
    WebElement FourBtnSetNewPassCode;


    @AndroidFindBy(accessibility = "New passcode set!")
    WebElement NewPasscodeSetHeading;

    @AndroidFindBy(accessibility = "Please sign-in again to access the Appreciate app")
    WebElement SignInAgainDesc;


    @AndroidFindBy(accessibility = "Sign in")
    WebElement SignInCTA;


    @AndroidFindBy(accessibility = "Your Day Trade Counter")
    WebElement TradeCounterHeading;

    @AndroidFindBy(accessibility = "What is Day Trading?")
    WebElement WhatIsDayTradingBanner;

    @AndroidFindBy(accessibility = "A day trade is when a buy order and sell order of the same symbol are executed in the customer account in one trading day.")
    WebElement DayTradingDescription;

    @AndroidFindBy(accessibility = "This trading activity counts as 1 Day Trade")
    WebElement DayTradingCountOne;

    @AndroidFindBy(accessibility = "This trading activity counts as 2 Day Trades")
    WebElement DayTradingCountTwo;


    @AndroidFindBy(accessibility = "If you day trade more than 3 times in a 5 day rolling period you will be flagged as a Pattern Day Trader.")
    WebElement AboutPatternDayTrading;

    @AndroidFindBy(accessibility = "If you are flagged as a pattern day trader & don’t have $25,000 as your account value at the end of the trading day and you have not enable Pattern Day Trading")
    WebElement AccountNotePatternDayTrading;

    @AndroidFindBy(accessibility = "Your orders will be rejected with a PDT violation")
    WebElement PatternDayOrderOne;

    @AndroidFindBy(accessibility = "You will be not be able to place any order until your day trade counter reduces to less than 4 in a 5 days period")
    WebElement PatternDayOrderTwo;

    @AndroidFindBy(accessibility = "Appreciate has not enabled Pattern Day Trading by default")
    WebElement ByDefaultPatternDayTradingEnableHeading;


    @AndroidFindBy(accessibility = "What happens when you enable Pattern Day Trading?")
    WebElement EnablePatternDayTradingBanner;

    @AndroidFindBy(accessibility = "Currently we restrict you from placing a buy order")
    WebElement EnablePatternDayTradingBannerDescOne;

    @AndroidFindBy(accessibility = "If you day trade for more than 3 times in a 5 day rolling period")
    WebElement EnablePatternDayTradingBannerDescTwo;

    @AndroidFindBy(accessibility = "Your account balance is below $25,000")
    WebElement EnablePatternDayTradingBannerDescThree;

    @AndroidFindBy(accessibility = "If you enable Pattern Day Trading, we will not place the above restriction & you can day trade as long as your account value is greater than or equal to $25,000")
    WebElement EnablePatternDayTradingBannerDescFour;



    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.widget.ImageView[1]")
    WebElement YourActValueInfoIcon;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"We are sad to see you go! We'd like to know \n" +
            "what made you think of parting ways with us.\"]")
    WebElement SorryNoteForActDeactivation;


    @AndroidFindBy(accessibility = "Performance or experience issues")
    WebElement DeactivateActReasonOne;

    @AndroidFindBy(accessibility = "I don't find the platform useful")
    WebElement DeactivateActReasonTwo;

    @AndroidFindBy(accessibility = "Charges are too high")
    WebElement DeactivateActReasonThree;

    @AndroidFindBy(accessibility = "Something else")
    WebElement DeactivateActReasonFour;


    @AndroidFindBy(accessibility = "Next")
    WebElement NextCTA;


    @AndroidFindBy(accessibility = "Support Tickets")
    WebElement SupportTicketsHeading;


    @AndroidFindBy(xpath = "By.xpath(\"//android.view.View[contains(@content-desc, 'checking') and contains(@content-desc, 'Ticket Number')]\")")
    WebElement AvailableTickets;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    WebElement SupportPageBackCTA;



    @AndroidFindBy(xpath = "//*[@text='How can we help you?']")
    WebElement AppreciateHelp;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    WebElement FAQsPageBackCTA;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Transaction Fee\n" +
            "Standard: 0.75%\n" +
            "Portfolio Returns < 10%: 0.50%\"]")
    WebElement AUMCharges;



    @AndroidFindBy(accessibility = "Transaction Fee")
    WebElement AUMChargesHeading;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Standard: 0.75%\n" +
            "\n" +
            "Portfolio Returns < 10%: 0.50%\"]")
    WebElement StandardAndPortFolioReturn;

    @AndroidFindBy(accessibility = "calculated with rolling 30-day period")
    WebElement RollingPeriod;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Transaction Fee\n" +
            "0.05% of transaction value or\n" +
            "₹5 whichever is higher.\"]")
    WebElement TransactionFee;




    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"No transaction fee for the fifth buy transaction every month\n" +
            "\n" +
            "0.05% of transaction value or ₹5 whichever is higher. Minimum holding value to sell is ₹5 (implied)\"]")
    WebElement TransactionFeeNote;


    @AndroidFindBy(accessibility = "Exit load")
    WebElement ExitLoad;

    @AndroidFindBy(accessibility = "Exit Loads in Mutual Funds")
    WebElement ExitLoadMF;

    @AndroidFindBy(accessibility = "Exit loads are fees charged by mutual fund companies when investors redeem or sell their units within a specific time frame after purchase")
    WebElement ExitLoadMFDesc;

    @AndroidFindBy(accessibility = "Fund category")
    WebElement FundCategory;

    @AndroidFindBy(accessibility = "Equity funds")
    WebElement EquityFunds;

    @AndroidFindBy(accessibility = "Debt funds")
    WebElement DebtFunds;

    @AndroidFindBy(accessibility = "Liquid funds")
    WebElement LiquidFunds;

    @AndroidFindBy(accessibility = "1% - 2%")
    WebElement EquityFundsPercentage;

    @AndroidFindBy(accessibility = "0.5% - 2%")
    WebElement DebtFundsPercentage;

    @AndroidFindBy(accessibility = "0*")
    WebElement LiquidFundsPercentage;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*On redemptions above 10% of the investment: \n" +
            "• 2% if redeemed within 365 days. \n" +
            "• 1% if redeemed after 365 days but before \n" +
            "     730 days.\"]")
    WebElement LiquidFundsNote;

    @AndroidFindBy(accessibility = "Please note that actual exit load percentages may vary from one mutual fund scheme to another. Please refer to the \"overview\" section in fund details screen for the same.")
    WebElement ExitLoadMFDescription;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"STCG/LTCG tax \"]")
    WebElement LTCGTax;


    @AndroidFindBy(accessibility = "LTCG: Long-Term Capital Gains")
    WebElement LTCGHeading;

    @AndroidFindBy(accessibility = "Applies when you hold mutual fund units for more than one year.")
    WebElement LTCGShortNote;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"The tax rate on long-term capital gains for all\n" +
            "financial and non-financial assets is 12.5%.\n" +
            "Additionally, the exemption limit for these\n" +
            "gains set at ₹1.25 lakh per year.\"]")
    WebElement LTCGNote;

    @AndroidFindBy(accessibility = "Holding period")
    WebElement HoldingPeriod;

    @AndroidFindBy(accessibility = "LTCG rate")
    WebElement LTCGRate;

    @AndroidFindBy(accessibility = "Conservative Hybrid funds")
    WebElement ConservativeHybridFunds;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Always short-term\"])[2]")
    WebElement AlwaysShortTerm;

    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Slab rates\"])[2]")
    WebElement SlabRates;


    @AndroidFindBy(accessibility = "STCG tax  ")
    WebElement STCGTAX;


    @AndroidFindBy(accessibility = "STCG: Short-Term Capital Gains")
    WebElement STCGTAXHeading;

    @AndroidFindBy(accessibility = "Occurs when you redeem or sell mutual fund units within one year of purchase.")
    WebElement STCGNoteone;


    @AndroidFindBy(accessibility = "Typically, STCG is subject to a higher tax rate than LTCG.")
    WebElement STCGWarningNote;

    @AndroidFindBy(accessibility = "STCG on equity mutual funds is taxed at 20%.")
    WebElement STCGNoteTwo;


    @AndroidFindBy(accessibility = "STCG tax  ")
    WebElement OtherFeesHeading;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Other fees\n" +
            "Platform cost of ₹1 per ticker/unit bought or sold, or fraction thereof, will be applicable for all.\n" +
            "The SEC (U.S. Securities and Exchange Commission) fee applies to all sell orders, with a minimum charge of $0.01, calculated basis on the total purchase amount.\n" +
            "The TAF (Trading Activity Fee), applies to all sell orders with a minimum charge of  0.01 to a maximum of $5.95.  It is calculated based on the number of units sold.\"]")
    WebElement OtherFeesNoteOne;


    @AndroidFindBy(xpath = "STCG tax  ")
    WebElement PricingPageBackArrow;

    @AndroidFindBy(accessibility = "STCG tax  ")
    WebElement OtherFeesNoteTwo;

    @AndroidFindBy(accessibility = "STCG tax  ")
    WebElement OtherFeesNoteThree;


    @AndroidFindBy(accessibility = "Distributor or Agent details")
    WebElement DistributorAndAgentDetails;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Do you want to link a distributor or agent?\n" +
            "A distributor or agent can help you manage your investments. \n" +
            "\n" +
            "You can link by entering their code.\"]")
    WebElement LinkDistributorAgent;

    @AndroidFindBy(accessibility = "No, thanks")
    WebElement NoThanks;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView")
    WebElement AccountsPageBackArrow;

    @AndroidFindBy(accessibility = "enter code")
    WebElement EnterCodeCTA;



    @AndroidFindBy(accessibility = "Request advisory services")
    WebElement RequestAdvisoryServices;



    @AndroidFindBy(accessibility = "Request other services")
    WebElement RequestOtherServices;



    @AndroidFindBy(accessibility = "Our Mission")
    WebElement OurMisson;

    @AndroidFindBy(accessibility = "On a journey to be the #1 trusted destination for you to achieve your financial goals")
    WebElement OurMissonDesc;

    @AndroidFindBy(accessibility = "Our Vision and Values")
    WebElement OurVisionAndValue;

    @AndroidFindBy(accessibility = "Customers First, Always")
    WebElement CustomerFirst;

    @AndroidFindBy(accessibility = "Integrity and Safety are non-negotiable")
    WebElement Integrity;

    @AndroidFindBy(accessibility = "Meritocracy of people and ideas")
    WebElement Meritocracy;

    @AndroidFindBy(accessibility = "Action oriented owner-doers")
    WebElement Action;

    @AndroidFindBy(accessibility = "We build the ecosystem")
    WebElement BuildEcosystem;

    @AndroidFindBy(accessibility = "Obligation to dissent")
    WebElement Obligation;



    @AndroidFindBy(accessibility = "5 reasons you should choose Appreciate")
    WebElement ReasonHeading;

    @AndroidFindBy(accessibility = "Global investing, higher returns")
    WebElement ReasonOne;

    @AndroidFindBy(accessibility = "Investing solutions")
    WebElement ReasonTwo;

    @AndroidFindBy(accessibility = "Easy, one click, low cost")
    WebElement ReasonThree;

    @AndroidFindBy(accessibility = "Learn how and when to invest")
    WebElement ReasonFour;

    @AndroidFindBy(accessibility = "Safe, secure, trustworthy")
    WebElement ReasonFive;


    @AndroidFindBy(accessibility = "Grievance redressal")
    WebElement GrievanceRedressal;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Appreciate Terms and Conditions\"]")
    WebElement AppreciateTermsAndConditionsPage;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Appreciate Platform\"]")
    WebElement AppreciatePlatform;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Appreciate Broking\"]")
    WebElement AppreciateBroking;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Registrations\"]")
    WebElement Registrations;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"IFSC Exchange Disclosure\"]")
    WebElement IFSCEchangeDisclosure;

    @AndroidFindBy(xpath = "//android.view.View[@text=\"Commission Disclosure Statement\"]")
    WebElement CommissionDisclosureStatement;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Partner Terms and Conditions\"]")
    WebElement PartnerTermsAndConditions;


    @AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"Appreciate Mobile App\"]")
    WebElement AllTermsOfUseSection;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Legal\"]")
    WebElement GoBackToLegalAllPage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Appreciate Broking IFSC Private Limited Terms & Conditions\"]")
    WebElement AppreciateBrokingHeading;



    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Appreciate Broking IFSC Private Limited\"])[1]")
    WebElement AppreciateIFSCOneHeading;


    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Appreciate Broking IFSC Private Limited is a company registered under the provisions of the Companies Act, 2013 (including any modification or re-enactment thereof), being a Trading Member of the India International Exchange (IFSC) Limited and registered as a Trading Member with IFSCA.\"])[1]")
    WebElement AppreciateIFSCOneDesc;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"NSE IFSC Trading Member Code\"]")
    WebElement NSETradingMembeCode;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Code No. 10059\"]")
    WebElement CodeNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"IFSCA Registration Number\"]")
    WebElement IFSCARHeading;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"IFSC/BD/2022-23/0004\"]")
    WebElement IFSCARNumber;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Registration CIN Number\"]")
    WebElement RegistrationCINHeading;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"As a global access client, the following services from recognized stock exchanges in the IFSC will not be available to you\"]")
    WebElement DisclosureDesc;


    @AndroidFindBy(xpath = "//android.view.View[@text=\"1. Investor Rights & Protection\"]")
    WebElement InvestorGrievanceRedressal;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"This platform generates revenue through commissions paid by various mutual fund houses for the promotion and distribution of diverse competing schemes. Users are advised to consider this disclosure while engaging with the financial products and services provided on this platform.\"]")
    WebElement CommissionDisclosureStatementDesc;


    @AndroidFindBy(xpath = "//android.webkit.WebView[@text=\"Appreciate Mobile App\"]/android.view.View/android.view.View/android.view.View[1]")
    WebElement TermAndDiscloresures;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Market Data Agreements\"]")
    WebElement MarketDataAgreementsHeading;


    @AndroidFindBy(xpath = "//android.view.View[@text=\"1. INTRODUCTION\"]")
    WebElement IntroductionHeading;


    @AndroidFindBy(xpath = "//android.view.View[@text=\"W-8BEN (Non U.S. Citizens)\"]")
    WebElement W8BENNonUSCitizens;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Refer & Earn\n" +
            "Earn ₹200 for each referral\"]")
    WebElement ReferAndEarnSection;


    @AndroidFindBy(accessibility = "View all accounts")
    WebElement ViewAllAccounts;


    @AndroidFindBy(accessibility = "Accounts")
    WebElement AccountsPage;


    @AndroidFindBy(accessibility = "For swift payments, make sure to add same bank on UPI app also")
    WebElement MFAccountsBankNote;


    @AndroidFindBy(accessibility = "Add bank")
    WebElement AddBankCTA;



    @AndroidFindBy(accessibility = "As of now, Yes bank is the only bank you can add for US stocks")
    WebElement AddBankActNoteForUSStocks;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"About Us\n" +
            "Legal, CSR, Policies, T&Cs\"]")
    WebElement AboutUsSection;


    @AndroidFindBy(accessibility = "Know more")
    WebElement KnowMore;


    @AndroidFindBy(accessibility = "About Appreciate")
    WebElement AboutAppreciate;


    @AndroidFindBy(accessibility = "5 reasons you should choose Appreciate")
    WebElement ReasonsToInvest;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")
    WebElement AboutUSBackArrow;





    public void Login() throws Exception {
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
        Thread.sleep(5000);
      //  driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Pricing\").instance(0))"));
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        MiniPricing.click();


    }

    public void PricingDetails() throws InterruptedException {
        Thread.sleep(2000);
        Pricing.isDisplayed();
    }

    public void GoalsinfoDetails() throws InterruptedException {
        Thread.sleep(5000);
        Goalsinfo.click();
    }

    public void TradeinfoDetails() throws InterruptedException {
        Thread.sleep(5000);
        Tradeinfo.click();
    }

    public void CashinfoDetails() throws InterruptedException {
        Thread.sleep(5000);
        Cashinfo.click();
    }

    public void OtherFeesDetails() throws InterruptedException {
        Thread.sleep(3000);
//        int numberOfScrolls = 1; // Adjust the number of scrolls as needed
//
//        for (int i = 0; i < numberOfScrolls; i++) {
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
//        }
        Other.isDisplayed();
    }

    public void OtherClose() throws InterruptedException {
        Thread.sleep(3000);
        PricingClose.click();
    }

    public void LegalPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().description(\"Legal\").instance(0))"));
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
        Thread.sleep(5000);
        platform.click();
    }

    public void LegalTerms() throws InterruptedException {
        Thread.sleep(5000);
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
        Thread.sleep(5000);
        ViewRegisterNumber1.click();
    }

    public void LegalRegister2() throws InterruptedException {
        Thread.sleep(5000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(3000);
        ViewRegisterNumber2.click();
        boolean canScrollMore2 = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 500,
                "direction", "down",
                "percent", 1.0
        ));
    }

    public void LegalBack() throws InterruptedException {
        Thread.sleep(2000);
        BackBroking.click();
    }

    public void LegalClose() throws InterruptedException {
        Thread.sleep(5000);
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
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().description(\"CSR\").instance(0))"));

        Thread.sleep(3000);
        CSR.click();
    }

    public void CSRInvestWoman() throws InterruptedException {
        Thread.sleep(5000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Our Key Initiatives \").instance(0))"));
        //Thread.sleep(2000);
        CSRWoman.isDisplayed();
    }

    public void CSRShoots() throws InterruptedException {
        Thread.sleep(5000);
        CSRShoots.isDisplayed();
    }

    public void CSRInvestEveryone() throws InterruptedException {
        Thread.sleep(5000);
        Everyone.isDisplayed();
    }

    public void SuggestText() throws InterruptedException {
        Thread.sleep(3000);

        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        suggest.isDisplayed();
    }

    public void SubmitButton() throws InterruptedException {
        Thread.sleep(3000);
        Submitbtn.click();
    }

    public void ValidateEmailError(String EmailError) throws InterruptedException {
        Thread.sleep(5000);
        String EmailMsg = erroremail.getText();
        Assert.assertEquals(EmailError, EmailMsg);
    }

    public void ValidateCommentError(String CommentError) throws InterruptedException {
        Thread.sleep(5000);
        String CommentMsg = errorcomment.getText();
        Assert.assertEquals(CommentError, CommentMsg);
    }

    public void ScrollCSRClose() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"CSR\").instance(0))"));
        Thread.sleep(5000);
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
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
//                        ".scrollIntoView(new UiSelector().description(\"Support\").instance(0))"));
//
//        Thread.sleep(3000);
        Support.click();

    }

    public void ClickTicket() throws InterruptedException {
        Thread.sleep(5000);
        SupportTicket.click();

    }

    public void SelectIssue() throws InterruptedException {
        Thread.sleep(3000);
        IssueType.click();

    }

    public void EnterSubject(String SubjectName) throws InterruptedException {
        Thread.sleep(4000);
        TapSubject.click();
        Thread.sleep(2000);
        EditSubject.sendKeys(SubjectName);

    }

    public void EnterMessage(String SubjectMessage) throws InterruptedException {
        Thread.sleep(5000);
        int numberOfScrolls = 1; // Adjust the number of scrolls as needed
        for (int i = 0; i < numberOfScrolls; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        TapMessage.click();
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
        AboutUs.isDisplayed();
        AboutUsDescription.isDisplayed();

        Legal.isDisplayed();
        CSR.isDisplayed();

        InsurenceNote.isDisplayed();


    }
    public void ValidateVisionValues() throws InterruptedException {
        Thread.sleep(3000);
        Vission.isDisplayed();
    }

    public void ClosePage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"US government backed insurance for portfolios up to $500,000\").instance(0))"));
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
        GaolsTransaction.click();
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

    public void GetCashGoalName() throws InterruptedException {
        Thread.sleep(5000);
        String ActualName1 = LatestCash.getText();
        Assert.assertNotEquals(ActualName1,finalName);


    }

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
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(2000);
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
        // ClickOnClose.click();
        int x =649;
        int y = 122;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
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
        Thread.sleep(4000);
        //ClickOnClose.click();
        int x =649;
        int y = 122;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));


    }

    public void ClickSettings() throws InterruptedException {
        Thread.sleep(4000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(2000);
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

    public void ClickProfileSubmit() throws InterruptedException {
        Thread.sleep(5000);
        ProfileSubmit.click();
    }
    public void ClickBuyingPower() throws InterruptedException {
        Thread.sleep(5000);
        BuyingPower.click();
    }

    public void ClickAccountDetails() throws InterruptedException {
        Thread.sleep(5000);
        AccountDetails.click();
    }

    public void ValidateDriveWealth() throws InterruptedException {
        Thread.sleep(5000);
        DriveWealthMini.isDisplayed();
    }

    public void ClickDistributorAgent() throws InterruptedException {
        Thread.sleep(5000);
        DistributorDetails.click();
    }

    public void ClickDistributClose() throws InterruptedException {
        Thread.sleep(5000);
        DistributorClose.click();
    }

    public void ClickRequestAdvisory() throws InterruptedException {
        Thread.sleep(5000);
        RequestAdvisory.click();
    }

    public void ValidateHiring() throws InterruptedException {
        Thread.sleep(3000);
        ThinkingHiring.click();
    }

    public void EnterEmailID(String Email) throws InterruptedException {
        Thread.sleep(5000);

//        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//                "left", 100, "top", 100, "width", 600, "height", 700,
//                "direction", "down",
//                "percent", 1.0
//        ));
        AddEmail.click();
        AddEmail.sendKeys(Email);
        Thread.sleep(2000);
        boolean canScrollMore2 = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 600,
                "direction", "down",
                "percent", 1.0
        ));
    }

    public void EnterFeedback(String Feedback) throws InterruptedException {
        Thread.sleep(5000);
        AddFeedback.click();
        AddFeedback.sendKeys(Feedback);
        Thread.sleep(2000);
    }


    public void ClickRecentTickets() throws InterruptedException {
        Thread.sleep(5000);
        RecentTickets.click();
    }


    public void ValidateSupportTickets() throws InterruptedException {
        Thread.sleep(5000);
        SupportTickets.isDisplayed();
        //Thread.sleep(5000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"6439\").instance(0))"));
        //Thread.sleep(5000);
    }

    public void ClickDocuments() throws InterruptedException {
        Thread.sleep(5000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(3000);
        Documents.click();
    }

    public void ClickMonthlyStatements() throws InterruptedException {
        Thread.sleep(5000);
        MonthlyView.click();
    }

    public void ClickConfirmations() throws InterruptedException {
        Thread.sleep(5000);
        ConfirmationsView.click();
    }

    public void ClickTaxDocuments() throws InterruptedException {
        Thread.sleep(5000);
        TaxView.click();
    }

    public void ClickViewClose() throws InterruptedException {
        Thread.sleep(5000);
        ViewClose.click();
    }

    public void ClickDocumentsClose() throws InterruptedException {
        Thread.sleep(8000);
        DocumentsClose.click();
    }
    public void ClickFAQs() throws InterruptedException {
        Thread.sleep(5000);
        FAQs.click();
    }

    public void ValidateProductFAQs() throws InterruptedException {
        Thread.sleep(8000);
        ProductFAQs.click();
    }
    public void ValidatePartnerFAQs() throws InterruptedException {
        Thread.sleep(5000);
        PartnerFAQs.click();
    }
    public void ValidateCompanyFAQs() throws InterruptedException {
        Thread.sleep(5000);
        CompanyFAQs.click();
    }

    public void ClickBuyingInfo() throws InterruptedException {
        Thread.sleep(5000);
        BuyingInfo.click();
    }
    public void ValidateBuyingDescription() throws InterruptedException {
        Thread.sleep(5000);
        BuyingPowerText.isDisplayed();
    }
    public void ValidateCashUSDescription() throws InterruptedException {
        Thread.sleep(5000);
        CashInUsText.isDisplayed();
    }
    public void ValidateTransitDescription() throws InterruptedException {
        Thread.sleep(5000);
        CashInTransitText.isDisplayed();
    }
    public void ValidateAmountHeldDescription() throws InterruptedException {
        Thread.sleep(5000);
        AmountHeldText.isDisplayed();
    }

    public void ClickOkay() throws InterruptedException {
        Thread.sleep(5000);
        Okay.click();
    }
    public void ValidateWhatsAppChat() throws InterruptedException {
        Thread.sleep(5000);
        WhatsAPP.isDisplayed();
    }

    public void ClickWithdraw() throws InterruptedException {
        Thread.sleep(5000);
        Withdraw.click();
    }

    public void ClickOne() throws InterruptedException {
        Thread.sleep(5000);
        TypeOne.click();
    }
    public void ClickZero() throws InterruptedException {
        Thread.sleep(5000);
        TypeZero.click();
    }

    public void ValidateErrorMessage() throws InterruptedException {
        Thread.sleep(5000);
        ErrorMessage.isDisplayed();
    }

    public void ClickWithdrawButton() throws InterruptedException {
        Thread.sleep(5000);
        WithDrawButton.click();
    }
    public void ClickDayTradeSettings() throws InterruptedException {
        Thread.sleep(5000);
        DayTradeSettings.click();
    }

    public void ClickDayTrading() throws InterruptedException {
        Thread.sleep(5000);
        DayTrading.click();
    }

    public void ClickPatternDayTrading() throws InterruptedException {
        Thread.sleep(5000);
        PatternDayTrading.click();
    }

    public void ClickEnableTrading() throws InterruptedException {
        Thread.sleep(5000);
        EnableTrading.click();
    }
    public void SelectEnablePattern() throws InterruptedException {
        Thread.sleep(5000);
        SwitchEnable.click();
    }
    public void SelectEnablePDT() throws InterruptedException {
        Thread.sleep(5000);
        ButtonEnable.click();
    }
    public void ValidateToastMessage() throws InterruptedException {
        Thread.sleep(10000);
        PDTToastMessage.isDisplayed();
    }
    public void SelectDisablePattern() throws InterruptedException {
        Thread.sleep(5000);
        SwitchDisable.click();
    }

    public void ClickAccountValue() throws InterruptedException {
        Thread.sleep(5000);
        ViewAccountValue.click();
    }

    public void ValidateAccountText() throws InterruptedException {
        Thread.sleep(5000);
        //YourAccountValue.click();
    }

    public void ClickProfilePhoto() throws InterruptedException {
        Thread.sleep(5000);
        ProfileImage.click();
    }

    public void ClickChooseDevice() throws InterruptedException {
        Thread.sleep(5000);
        PhotoDevice.click();
    }

    public void ClickGallery() throws InterruptedException {
        Thread.sleep(5000);
        Gallery.click();
    }
    public void ChoosePhoto() throws InterruptedException {
        Thread.sleep(5000);
        ScreenShorts.click();
    }
    public void ClickImage() throws InterruptedException {
        Thread.sleep(5000);
        PhoneImage.click();
    }

    public void ClickSave() throws InterruptedException {
        Thread.sleep(5000);
        PhotoSave.click();
    }

    public void ClickInfoOkay() throws InterruptedException {
        Thread.sleep(3000);
        InfoOkay.click();
    }

    public void ClickProfileIssue() throws InterruptedException {
        Thread.sleep(5000);
        ProfileIssueType.click();
    }

    public void EnterProfileSubject(String ProfileSubjectName) throws InterruptedException {
        Thread.sleep(3000);
        SubjectTicketProfile.sendKeys(ProfileSubjectName);

    }
    public void EnterProfileMessage(String ProfileMessage) throws InterruptedException {
        Thread.sleep(3000);
        MessageTicketProfile.sendKeys(ProfileMessage);

    }

    public void ClickProfileTicketSubmit() throws InterruptedException {
        Thread.sleep(5000);
        ProfileTicketSubmit.click();
    }

    public void SelectUSWalletOption() throws InterruptedException {
        Thread.sleep(5000);
        // USWalletOption.click();
        int x =273;
        int y = 967;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void VerifyUSWalletAmt() throws InterruptedException {
        Thread.sleep(5000);

        String cashInUS = CashinUS.getText().replaceAll("[₹,]", "").trim();
        String cashInTransit = Cashintransit.getText().replaceAll("[₹,]", "").trim();
        String AmtHeld = Amtheld.getText().replaceAll("[₹,]", "").trim();
        String USWallet = Uswallet.getText().replaceAll("[₹,]", "").trim();

        double cashInUSValue = Double.parseDouble(cashInUS);
        double cashInTransitValue = Double.parseDouble(cashInTransit);
        double amtHeldValue = Double.parseDouble(AmtHeld);
        double USWalletValue= Double.parseDouble(USWallet);

// Calculate US Wallet
        double calculatedUSWallet = cashInUSValue + cashInTransitValue - amtHeldValue;

        String formattedResult = String.format("%.2f", calculatedUSWallet);
        double finalUSWallet = Double.parseDouble(formattedResult);
        System.out.println("Calculated US Wallet: " + finalUSWallet);
        // Assert.assertEquals(USWalletValue, finalUSWallet);


    }

    public void SelectAUMchargesUnderGoals() throws InterruptedException {
        Thread.sleep(4000);
        int x =400;
        int y = 446;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
        Thread.sleep(2000);
        AUMchargesDetail.isDisplayed();

    }

    public void SelectTransactionFeeUnderTrae() throws InterruptedException {
        Thread.sleep(4000);
//        int x =348;
//        int y = 805;
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(List.of(tap));
//        Thread.sleep(2000);
        TransactionFeeDetail.click();
        Thread.sleep(3000);
        TransactionFeeHeading.isDisplayed();
        TransactionFeeDescriptionOne.isDisplayed();


    }


    public void EnterCorrectPasscode() throws InterruptedException {
        Thread.sleep(4000);
        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"1\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        WebElement element2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"2\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element2).getId()
        ));

        WebElement element3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"3\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));

        WebElement element4 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"4\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element4).getId()
        ));
        Thread.sleep(3000);
    }

    public void VerifyHomeDashboard() throws InterruptedException {
        Thread.sleep(3000);
        OurOfferings.isDisplayed();
    }

    public void VerifySignInPage() throws InterruptedException {
        Thread.sleep(4000);
        SigninPage.isDisplayed();
    }

    public void ClickOnInvestmentBuilder() throws InterruptedException {
        Thread.sleep(3000);
        InvestmentBuilder.click();
    }

    public void VerifyUpdateInvestmentBuilderPage() throws InterruptedException {
        Thread.sleep(3000);
        InvestmentBuilderPage.isDisplayed();
    }

    public void UpdateTypicallyInvest() throws InterruptedException {
        Thread.sleep(3000);
        UpdateOneCTA.click();
        Thread.sleep(3000);
        Bonds.click();
        UpdateCTA.click();

    }

    public void SelectBackArrowAtUpdateInvestmentBuilderPage() throws InterruptedException {
        Thread.sleep(3000);
        BackArrowAtUpdateInvestmentBuilderPage.click();
    }

    public void VerifySettingAndPreferencesPage() throws InterruptedException {
        Thread.sleep(3000);
        SettingAndPreferencesPage.isDisplayed();
        Thread.sleep(2000);
        CrossIcon.click();

    }

    public void VerifyYesBankPage() throws InterruptedException {
        Thread.sleep(3000);
        YesBankBalanceHeading.isDisplayed();
        Transaction.isDisplayed();
    }

    public void GoBackToMiniModulePage() throws InterruptedException {
        Thread.sleep(3000);
        BackArrow.click();
    }

    public void ClickOnWhatIsPatternDayTrading() throws InterruptedException {
        Thread.sleep(3000);
        WhatIsPatternDayTrading.click();
    }

    public void VerifyDetailsOfWhatIsPatternDayTrading() throws InterruptedException {
        Thread.sleep(3000);
        PatternDayTradingHeading.isDisplayed();
        PatternDayTradingDescription.isDisplayed();
        AppreciatePatternDayTradingMsg.isDisplayed();

        CrossIconTwo.click();
    }

    public void VerifyReferNowPage() throws InterruptedException {
        Thread.sleep(3000);
        ReferAndEarnHeading.isDisplayed();
        InviteYourFriendHeading.isDisplayed();
        SignUpHeading.isDisplayed();
        OfferDealHeading.isDisplayed();
        ReferalCodeHeading.isDisplayed();

        Thread.sleep(2000);

        WhatsapCTA.isDisplayed();
        LinkCopyCTA.isDisplayed();
        MoreOptionsCTA.isDisplayed();

        // CopyRefralCodeCTA.click();
        // toast msg not coming in inspector

    }

    public void VerifyBenefitAdvisoryDetail() throws InterruptedException {
        Thread.sleep(3000);
        InvestmentAdvisory.isDisplayed();
        InvestmentAdvisoryDescription.isDisplayed();

        BenifitsDetailsOne.isDisplayed();
        BenifitsDetailsTwo.isDisplayed();
        BenifitsDetailsThree.isDisplayed();


    }

    public void VerifyThinkingOfHiringDetail() throws InterruptedException {
        Thread.sleep(3000);
        ThinkingOfHiringOptionOne.isDisplayed();
        ThinkingOfHiringOptionTwo.isDisplayed();
        ThinkingOfHiringOptionThree.isDisplayed();
        ThinkingOfHiringOptionFour.isDisplayed();

    }

    public void SelectAdvisoryServices() throws InterruptedException {
        Thread.sleep(3000);
        RequestAdvisoryServicesCTA.click();
    }

    public void VerifyRequest() throws InterruptedException {
        Thread.sleep(3000);
        RequestAdvisoryServicesCTA.isDisplayed();
        RequestAdvisoryServicesDesc.isDisplayed();



    }

    public void VerifyAllMiniModuleSections() throws InterruptedException {
        Thread.sleep(5000);

      //  UserName.isDisplayed();

//        ReferYourFriendHeading.isDisplayed();
//        ReferDesc.isDisplayed();
//        ReferNowCTA.isDisplayed();

        YesBankCheckBalance.isDisplayed();

        USWallet.isDisplayed();

        PersonalDetails.isDisplayed();
        BankAccounts.isDisplayed();
        Orders.isDisplayed();
        Reports.isDisplayed();

        SettingsAndPreferences.isDisplayed();
        ChangeLanguage.isDisplayed();

        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }

        Thread.sleep(3000);

        Support.isDisplayed();
        Pricing.isDisplayed();
        AddOnService.isDisplayed();


        CSR.isDisplayed();
        Legal.isDisplayed();
        AboutUs.isDisplayed();

        Thread.sleep(2000);



    }

    public void ClickOnUSWallet() throws InterruptedException {
        Thread.sleep(5000);
        USWallet.click();
        Thread.sleep(3000);

    }

    public void VerifyAllUSWalletDetails() throws InterruptedException {
        Thread.sleep(4000);


        CashinUS.isDisplayed();
        Cashintransit.isDisplayed();
        Amtheld.isDisplayed();

        String cash =   CashinUSAmount.getText();
        String transit =  CashinTransitAmount.getText();
        String held  =  AmountHeldAmount.getText();

        System.out.println("Amount in cash in US " + cash);
        System.out.println("Amount in cash in Transit " + transit);
        System.out.println("Amount in cash in Held " + held);


        USWalletInfoIcon.click();

        Thread.sleep(3000);

        USWalletHeading.isDisplayed();
        CashInUSHeading.isDisplayed();
        CashInTransitHeading.isDisplayed();
        AmountHeldHeading.isDisplayed();

        USWalletDescription.isDisplayed();
        CashInUSDescription.isDisplayed();
        CashInTransitDescription.isDisplayed();
        AmountHeldDescription.isDisplayed();

        Thread.sleep(2000);
        OkayCTA.click();
        Thread.sleep(2000);



    }

    public void VerifyAccountDetails() throws InterruptedException {
        Thread.sleep(3000);
        AccountDetails.click();
        Thread.sleep(3000);
        AccountetailsHeading.isDisplayed();
        DriveWealth.isDisplayed();

        MarginAcntDetails.isDisplayed();
        CashActDetails.isDisplayed();

        AccountDetailsPageBackArrow.click();




    }

    public void VerifyWithdrawalFunctionality() throws InterruptedException {
        Thread.sleep(3000);
        Withdraw.click();
        Thread.sleep(5000);

        WithdrawPage.isDisplayed();
        WithdrawalDesc.isDisplayed();


        AvailableBalanceIcon.click();
        Thread.sleep(2000);

        WithdrawalRuleHeading.isDisplayed();

        WithdrawalRuleDesc.isDisplayed();

       String usd_rate =   USDRate.getText();

       String with_amt =   AmountAvailableToWithdraw.getText();

       System.out.println("Current USD Rate $1="+ usd_rate);

       System.out.println(with_amt);

        OkayCTA.click();

        Thread.sleep(3000);



    }

    public void VerifyWithdrawalAmount() throws InterruptedException {
        // verify withdrawal amount is same as available amt  after selecting check box
        Thread.sleep(3000);
        String avl_balance =   AvailableBalanceAtWithdrawPage.getText();

        System.out.println(avl_balance);

        WithdrawalAllBox.click();

      String amt_at_withdrawal_field =   WithdrawalAmountShownForWithdraw.getText();

        double avlBalanceNumeric = Double.parseDouble(avl_balance.replaceAll("[^0-9.]", ""));
        double amtAtWithdrawalNumeric = Double.parseDouble(amt_at_withdrawal_field.replaceAll("[^0-9.]", ""));


        if (avlBalanceNumeric == amtAtWithdrawalNumeric) {
            System.out.println("The numeric values are equal.");
        } else {
            System.out.println("The numeric values are not equal.");
        }

    }

    public void VerifyIncorrectWithdrawalAmount() throws InterruptedException {
        Thread.sleep(3000);
        WithdrawalAllBox.click();

        String enter_amt =  AvailableBalanceAtWithdrawPage.getText();

        double avlBalanceNumeric = Double.parseDouble(enter_amt.replaceAll("[^0-9.]", ""));
        double amountToEnter = avlBalanceNumeric + 10.0;
        EnterAmtForWithdraw.sendKeys(String.valueOf(amountToEnter));

        Thread.sleep(2000);

        WithdrawCTA.click();

        Thread.sleep(2000);

        InsuficientBalanceError.isDisplayed();
        Thread.sleep(2000);
        WithdrawallPageBackCTA.click();

    }

    public void VerifyCorrectWithdrawalAmount() throws InterruptedException {
        Thread.sleep(3000);
        Withdraw.click();
        Thread.sleep(5000);

        String enter_amt =  AvailableBalanceAtWithdrawPage.getText();

        double avlBalanceNumeric = Double.parseDouble(enter_amt.replaceAll("[^0-9.]", ""));
        double amountToEnter = avlBalanceNumeric - 1.0;

        if(amountToEnter>0.0){
            EnterAmtForWithdraw.sendKeys(String.valueOf(amountToEnter));
        }
        else {
            System.out.println("No Sufficient fund to withdrawal");
        }


        Thread.sleep(2000);

        WithdrawCTA.click();

        Thread.sleep(2000);

        WithdrawalMoneyPage.isDisplayed();
        WithdrawalAmt.isDisplayed();
        WithdrawalAmtNote.isDisplayed();

        BankAct.isDisplayed();

        BusinessDays.isDisplayed();

        ConfirmWithdrawalCTA.click();


    }

    public void VerifyWithdrawalRequestAccepted() throws InterruptedException {
        Thread.sleep(5000);
        WithdrawalRequestAcceptedHeading.isDisplayed();
        OrderDetails.isDisplayed();
    }

    public void VerifySubmitTicketAtWithdrawalRequestAcceptedPage() throws InterruptedException {
        Thread.sleep(3000);
        SubmitTicket.click();

        Thread.sleep(3000);
        SubmitTicketPage.isDisplayed();

        IssueType.click();

        EnterSubject.click();
        Thread.sleep(2000);
        EnterSubjectValue.sendKeys("checking flow ");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        EnterMsgValue.sendKeys("checking flow ");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
        Thread.sleep(2000);
        SubmitCTA.click();


        Thread.sleep(4000);

        GoToHomeDashboard.click();
        Thread.sleep(2000);
    }

    public void ClickOnPersonalDetails() throws InterruptedException {
        Thread.sleep(3000);
        //PersonalDetails.click();
        int x =197;
        int y = 160;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void VerifyAllPersonalDetails() throws InterruptedException {
        Thread.sleep(5000);

        PersonalDetailsPage.isDisplayed();

        PersonalDetailsNote.isDisplayed();

        PersonalDetailsHeading.isDisplayed();

        OtherPersonalInfo.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore2 = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        ContactDetailsHeading.isDisplayed();
        PermanentAddressHeading.isDisplayed();
        Thread.sleep(2000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        OnlineKYCDetailsHeading.isDisplayed();
        NomineeDetailsHeading.isDisplayed();
        NomineeNoteDetailsHeading.isDisplayed();
        NomineeNoteDetailsTwoHeading.isDisplayed();
        NomineeNoteDetailsThreeHeading.isDisplayed();


    }

    public void VerifySubmitASupportTicketForNomineeDetails() throws InterruptedException {
        Thread.sleep(3000);
        SubmitASupportTicket.click();
        Thread.sleep(3000);

        SubmitATicketPage.isDisplayed();
        SubmitATicketDesc.isDisplayed();

        IssueTypeTwo.click();

        Subject.click();
        Thread.sleep(2000);
        SubjectEnter.sendKeys("checking flow");
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        Message.click();
        Thread.sleep(2000);
        MessageEnter.sendKeys("checking flow");
        Thread.sleep(2000);

        SubmitBtn.click();





    }

    public void VerifySubmitASupportTicketForPersonalDetails() throws InterruptedException {
        Thread.sleep(3000);
        SubmitATicketPage.isDisplayed();
        SubmitATicketDesc.isDisplayed();

        IssueTypeTwo.click();

        Subject.click();
        Thread.sleep(2000);
        SubjectEnter.sendKeys("checking flow");
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        Message.click();
        Thread.sleep(2000);
        MessageEnter.sendKeys("checking flow");
        Thread.sleep(2000);

        SubmitBtn.click();

        Thread.sleep(5000);






    }


    public void ClickOnBankAccounts() throws InterruptedException {
        Thread.sleep(4000);
        BankAccounts.click();

    }


    public void VerifyUSStocksBankAccounts() throws InterruptedException {
        Thread.sleep(4000);
        USStocks.click();
        Thread.sleep(2000);
        YesBankNote.isDisplayed();

        AddedYesBankAct.isDisplayed();


    }

    public void VerifyMFBankAccounts() throws InterruptedException {
        Thread.sleep(4000);
        MF.click();
        Thread.sleep(2000);
        PaymentNote.isDisplayed();
        AddedYesBankActForMF.isDisplayed();




    }

    public void ClickOnOrders() throws InterruptedException {
        Thread.sleep(4000);
        Orders.click();
    }

    public void VerifyAllTabsUnderAllTransactionsPage() throws InterruptedException {
        Thread.sleep(4000);
        AllTransactionsPage.isDisplayed();
        FilterDropDown.isDisplayed();

        TradeTab.click();
        Thread.sleep(3000);
        GoalsTab.click();
        Thread.sleep(3000);
        MutualFundsTab.click();
        Thread.sleep(3000);
        CashTab.click();
        Thread.sleep(3000);

    }

    public void ClickOnSettingsAndPreferences() throws InterruptedException {
        Thread.sleep(4000);
        SettingsAndPreferences.click();

    }


    public void VerifyAllTabsOfSettingsAndPreferences() throws InterruptedException {
        Thread.sleep(4000);
        ChangePasscodeSection.isDisplayed();
        InvestentBuilder.isDisplayed();
        DayTradeSetting.isDisplayed();
        Biometric.isDisplayed();
        DarkMode.isDisplayed();
        DeactivateAccounts.isDisplayed();

    }

    public void VerifyChangePasscodeFunctionality() throws InterruptedException {
        Thread.sleep(3000);
        ChangePasscodeSection.click();
        Thread.sleep(3000);
        ChangePasscodeSection.isDisplayed();

        OtpSendHeading.isDisplayed();
        System.out.println("Enter the otp from your device and leave confirm cta will be click by automation");
        Thread.sleep(5000);
        //EnterOTPFieldForPasscodeChange.sendKeys("904123");
        Thread.sleep(10000);
        ConfirmCTA.click();



    }

    public void SetANewPasscode() throws InterruptedException {
        Thread.sleep(5000);
//        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"1\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element).getId()
//        ));
//
//        WebElement element2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"2\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element2).getId()
//        ));
//
//        WebElement element3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"3\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element3).getId()
//        ));
//
//        WebElement element4 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"4\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element4).getId()
//        ));
        OneBtnSetNewPassCode.click();
        TwoBtnSetNewPassCode.click();
        ThreeBtnSetNewPassCode.click();
        FourBtnSetNewPassCode.click();



    }

    public void ConfirmNewPasscode() throws InterruptedException {
        Thread.sleep(5000);
//        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"1\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element).getId()
//        ));
//
//        WebElement element2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"2\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element2).getId()
//        ));
//
//        WebElement element3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"3\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element3).getId()
//        ));
//
//        WebElement element4 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"4\"]"));
//
//        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element4).getId()
//        ));
        OneBtnSetNewPassCode.click();
        TwoBtnSetNewPassCode.click();
        ThreeBtnSetNewPassCode.click();
        FourBtnSetNewPassCode.click();

    }


    public void VerifyNewPasscodeSet() throws InterruptedException {
        Thread.sleep(4000);
        NewPasscodeSetHeading.isDisplayed();
        SignInAgainDesc.isDisplayed();

        SignInCTA.click();

    }


    public void VerifyInvestmentBuilder() throws InterruptedException {
        Thread.sleep(4000);
        InvestmentBuilder.click();

        Thread.sleep(4000);

        UpdateInvestmentBuilderPage.isDisplayed();
    }


    public void UpdateInvestmentBuilder() throws InterruptedException {
        Thread.sleep(3000);
        UpdateCTAOfInvestedPlan.click();
        Thread.sleep(3000);
        UpdateInvestmentBuilderPage.isDisplayed();

        InvestedPeriod.click();

        UpdateCTA.click();

        Thread.sleep(3000);
        UpdateInvestmentBuilderPage.isDisplayed();

       // BackArrowAtUpdateInvestmentBuilderPage.click();



    }



    public void VerifyDayTradingSettings() throws InterruptedException {
        Thread.sleep(4000);
        DayTradeSetting.click();

        Thread.sleep(6000);

        TradeCounterHeading.isDisplayed();

        EnableTrading.isDisplayed();

        WhatIsDayTradingBanner.click();
        DayTradingDescription.isDisplayed();
        DayTradingCountOne.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(2000);
        DayTradingCountTwo.isDisplayed();
        WhatIsDayTradingBanner.click();
        Thread.sleep(2000);
        WhatIsPatternDayTrading.click();

        Thread.sleep(2000);
        AboutPatternDayTrading.isDisplayed();

        AccountNotePatternDayTrading.isDisplayed();

        PatternDayOrderOne.isDisplayed();
        PatternDayOrderTwo.isDisplayed();

        ByDefaultPatternDayTradingEnableHeading.isDisplayed();

        WhatIsPatternDayTrading.click();
        Thread.sleep(2000);

        EnablePatternDayTradingBanner.click();
        Thread.sleep(2000);
        EnablePatternDayTradingBannerDescOne.isDisplayed();
        EnablePatternDayTradingBannerDescTwo.isDisplayed();
        EnablePatternDayTradingBannerDescThree.isDisplayed();
        EnablePatternDayTradingBannerDescFour.isDisplayed();


        Thread.sleep(3000);
        YourActValueInfoIcon.click();
        Thread.sleep(2000);

        YourAccountValueAllDetails.isDisplayed();


        OkayCTAAtActVal.click();

        Thread.sleep(2000);

       // AccountValueType.click();


    }

    public void VerifyDeactivateAccounts() throws InterruptedException {
        Thread.sleep(5000);
        DeactivateAccounts.click();

        DeactivateAccounts.isDisplayed();

        SorryNoteForActDeactivation.isDisplayed();

        DeactivateActReasonOne.isDisplayed();
        DeactivateActReasonTwo.isDisplayed();
        DeactivateActReasonThree.isDisplayed();
        DeactivateActReasonFour.isDisplayed();

        NextCTA.isDisplayed();


    }

    public void ClickOnSupport() throws InterruptedException {
        Thread.sleep(5000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        Support.click();

    }

    public void VerifyRecentTickets() throws InterruptedException {
        Thread.sleep(4000);
        RecentTickets.click();
        Thread.sleep(4000);
        SupportTicketsHeading.isDisplayed();

        AvailableTickets.isDisplayed();

        SupportPageBackCTA.click();


    }

    public void VerifyFAQSection() throws InterruptedException {
        Thread.sleep(4000);
        FAQs.click();

        Thread.sleep(8000);

        FAQs.isDisplayed();

        AppreciateHelp.isDisplayed();

        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }

        Thread.sleep(2000);


        FAQsPageBackCTA.click();


    }

    public void ClickOnPricing() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        Pricing.click();


    }

    public void VerifyAllDetailsOFGoalsSection() throws InterruptedException {
        Thread.sleep(4000);
        GoalsTab.isDisplayed();
//
//        AUMCharges.click();
//
//        Thread.sleep(2000);
//
//        AUMChargesHeading.isDisplayed();
//
//        StandardAndPortFolioReturn.isDisplayed();
//
//        RollingPeriod.isDisplayed();
//

          GoalsTransactionFee.click();
          Thread.sleep(3000);
          GoalsTransactionFeeHeading.isDisplayed();
                Okay.click();




    }

    public void VerifyAllDetailsOFTradeSection() throws InterruptedException {
        Thread.sleep(4000);

        TradeTab.isDisplayed();

        TradeTransactionFee.click();

        Thread.sleep(2000);

        TransactionFeeNote.isDisplayed();

        Okay.click();

    }




    public void VerifyExitLoad() throws InterruptedException {
        Thread.sleep(3000);
        MutualFundsTab.isDisplayed();

        ExitLoad.click();
        Thread.sleep(2000);
        ExitLoadMF.isDisplayed();
        ExitLoadMFDesc.isDisplayed();
        FundCategory.isDisplayed();
        ExitLoad.isDisplayed();
//
//        EquityFunds.isDisplayed();
//        DebtFunds.isDisplayed();
//        LiquidFunds.isDisplayed();
//
//        EquityFundsPercentage.isDisplayed();
//        DebtFundsPercentage.isDisplayed();
//        LiquidFundsPercentage.isDisplayed();
//
//        LiquidFundsNote.isDisplayed();

        ExitLoadMFDescription.isDisplayed();


        Okay.click();

    }

    public void VerifyLTCGAndSTCGTax() throws InterruptedException {
        Thread.sleep(3000);
        LTCGTax.click();
        Thread.sleep(3000);
        LTCGHeading.isDisplayed();
        LTCGShortNote.isDisplayed();

        STCGTAXHeading.isDisplayed();

        STCGNoteone.isDisplayed();
//        LTCGNote.isDisplayed();
//
//        FundCategory.isDisplayed();
//        HoldingPeriod.isDisplayed();
//        LTCGRate.isDisplayed();
//
//        Thread.sleep(2000);
//        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//                "left", 100, "top", 100, "width", 600, "height", 800,
//                "direction", "down",
//                "percent", 0.1
//        ));
//
//        Thread.sleep(2000);

//        ConservativeHybridFunds.isDisplayed();
//        AlwaysShortTerm.isDisplayed();
//        SlabRates.isDisplayed();
            STCGWarningNote.isDisplayed();
            Okay.click();



    }

    public void VerifySTCGTax() throws InterruptedException {
        Thread.sleep(4000);
        STCGTAX.click();

        Thread.sleep(2000);

        STCGTAXHeading.isDisplayed();
        STCGNoteone.isDisplayed();
        STCGNoteTwo.isDisplayed();

        FundCategory.isDisplayed();
        HoldingPeriod.isDisplayed();
        LTCGRate.isDisplayed();


        ConservativeHybridFunds.isDisplayed();
        AlwaysShortTerm.isDisplayed();
        SlabRates.isDisplayed();

        Okay.click();


    }

    public void VerifyOtherFeesSection() throws InterruptedException {
        Thread.sleep(4000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(3000);

//        OtherFeesHeading.isDisplayed();

        OtherFeesNoteOne.isDisplayed();
//        OtherFeesNoteTwo.isDisplayed();
//        OtherFeesNoteThree.isDisplayed();
        Thread.sleep(2000);
        //PricingPageBackArrow.click();




    }

    public void ClickOnAddOnServices() throws InterruptedException {
        Thread.sleep(4000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        AddOnService.click();
    }

    public void VerifyDistributorAndAgentDetails() throws InterruptedException {
        Thread.sleep(3000);
        DistributorAndAgentDetails.click();

        Thread.sleep(2000);
        LinkDistributorAgent.isDisplayed();

        NoThanks.click();
    }

    public void VerifyRequestAdvisoryServices() throws InterruptedException {
        Thread.sleep(3000);
        RequestAdvisoryServices.click();
        Thread.sleep(2000);

        InvestmentAdvisory.isDisplayed();
        InvestmentAdvisoryDescription.isDisplayed();
        BenifitsDetailsOne.isDisplayed();
        BenifitsDetailsTwo.isDisplayed();
        BenifitsDetailsThree.isDisplayed();

        Thread.sleep(2000);
        ThinkingHiring.click();
        Thread.sleep(2000);
        ThinkingOfHiringOptionOne.isDisplayed();
        ThinkingOfHiringOptionTwo.isDisplayed();
        ThinkingOfHiringOptionThree.isDisplayed();
        ThinkingOfHiringOptionFour.isDisplayed();






    }

    public void VerifyRequestAdvisoryServicesFunction() throws InterruptedException {
        Thread.sleep(3000);
       // RequestAdvisoryServices.click();
        // using coordinated cause given xpath is not working
        int x =357;
        int y = 1511;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
        Thread.sleep(2000);


        RequestAdvisoryServicesDesc.isDisplayed();

        RequestAdvisoryEnterSubject.click();
        Thread.sleep(2000);

        RequestAdvisoryEnterSubjectValue.sendKeys("checking flow");
        Thread.sleep(2000);
        RequestAdvisoryEnterMsg.click();
        Thread.sleep(2000);
        RequestAdvisoryEnterMsgValue.sendKeys("checking flow");

        Submitbtn.click();


    }

    public void VerifyRequestOtherServices() throws InterruptedException {
        Thread.sleep(3000);

        RequestOtherServices.click();

        Thread.sleep(2000);

        RequestOtherServicesDesc.isDisplayed();

        SelectRequestServicesType.click();

        RequestAdvisoryEnterSubject.click();
        Thread.sleep(2000);

        RequestAdvisoryEnterSubjectValue.sendKeys("checking flow");
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        RequestServicesEnterMsg.click();
        Thread.sleep(2000);
        RequestServicesEnterMsgValue.sendKeys("checking flow");

        Submitbtn.click();



    }

    public void ClickOnAboutUs() throws InterruptedException {
        Thread.sleep(4000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        AboutUs.click();
    }

    public void VerifyAboutUSPage() throws InterruptedException {
        Thread.sleep(4000);
        AboutUs.isDisplayed();

        OurMisson.isDisplayed();
        OurMissonDesc.isDisplayed();

        OurVisionAndValue.isDisplayed();
        CustomerFirst.isDisplayed();
        Integrity.isDisplayed();
        Meritocracy.isDisplayed();
        Action.isDisplayed();
        BuildEcosystem.isDisplayed();
        Obligation.isDisplayed();

        Thread.sleep(2000);

        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }

        Thread.sleep(2000);

        ReasonHeading.isDisplayed();

        ReasonOne.isDisplayed();
        ReasonTwo.isDisplayed();
        ReasonThree.isDisplayed();
        ReasonFour.isDisplayed();
        ReasonFive.isDisplayed();

        GrievanceRedressal.isDisplayed();


    }

    public void ClickOnCSR() throws InterruptedException {
        Thread.sleep(4000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        CSR.click();

        
    }

    public void ClickOnElement(int x, int y) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);

        // Move to the target location
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));

        // Press down and up (i.e., tap)
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Perform the tap
        driver.perform(Collections.singletonList(tap));
    }


    public void VerifyCSRInitiatives() throws InterruptedException {
        Thread.sleep(4000);
        CSRBannerHeading.isDisplayed();
        CSRBanner.isDisplayed();

        CSRWoman.isDisplayed();
        CSRShoots.isDisplayed();
        Everyone.isDisplayed();

        CSRHelpNote.isDisplayed();

        Thread.sleep(3000);
        //CSRWomanDropDown.click();
        ClickOnElement(619,649);
        Thread.sleep(2000);
        CSRWomanDropDownDesc.isDisplayed();
        Thread.sleep(2000);

        //CSRShootsDropDown.click();
        ClickOnElement(612,941);
        Thread.sleep(2000);
        CSRShootsDropDownDesc.isDisplayed();

        Thread.sleep(2000);

        //EveryoneDropDown.click();
        ClickOnElement(616,1090);
        Thread.sleep(2000);
        EveryoneDropDownDesc.isDisplayed();

        // dropdown xpath not getting


    }


    public void VerifySuggestionFunctionality() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);


        //EnterEmailForSuggestion.click();


    }

    public void ClickOnLegal() throws InterruptedException {
        Thread.sleep(4000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        Legal.click();
    }

    public void VerifyAllLegalPageOptions() throws InterruptedException {
        Thread.sleep(5000);

        AppreciateTermsAndConditionsPage.isDisplayed();
        AppreciatePlatform.isDisplayed();
        AppreciateBroking.isDisplayed();
        Registrations.isDisplayed();
        IFSCEchangeDisclosure.isDisplayed();
        CommissionDisclosureStatement.isDisplayed();

        PartnerTermsAndConditions.isDisplayed();

        DriveWealth.isDisplayed();
        YesBank.isDisplayed();

    }

    public void VerifyAppreciatePlatformDetails() throws InterruptedException {
        Thread.sleep(3000);
        AppreciatePlatform.click();
        Thread.sleep(5000);

        AllTermsOfUseSection.isDisplayed();

      //  GoBackToLegalAllPage.click();

//        Legal.click();

    }

    public void VerifyAppreciateBrokingDetails() throws InterruptedException {
        Thread.sleep(3000);
        AppreciateBroking.click();
        Thread.sleep(3000);

        AppreciateBrokingHeading.isDisplayed();
        Thread.sleep(3000);
        for (int i = 0; i < 4; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);

        GoBackToLegalAllPage.click();
    }

    public void VerifyRegistrationDetails() throws InterruptedException {
        Thread.sleep(3000);
        Registrations.click();
        Thread.sleep(3000);

        AppreciateIFSCOneHeading.isDisplayed();
        AppreciateIFSCOneDesc.isDisplayed();

        ViewRegisterNumber1.click();

        NSETradingMembeCode.isDisplayed();
        CodeNumber.isDisplayed();

        IFSCARHeading.isDisplayed();
        IFSCARNumber.isDisplayed();


        ViewRegisterNumber1.click();

        RegistrationCINHeading.isDisplayed();


        GoBackToLegalAllPage.click();
    }

    public void VerifyIFSCExchangeDisclosureDetails() throws InterruptedException {
        Thread.sleep(3000);
        IFSCEchangeDisclosure.click();
        Thread.sleep(3000);
        IFSCEchangeDisclosure.isDisplayed();

        DisclosureDesc.isDisplayed();


        InvestorGrievanceRedressal.isDisplayed();


        GoBackToLegalAllPage.click();
    }

    public void VerifyCommissionDisclosureStatementDetails() throws InterruptedException {
        Thread.sleep(3000);
        CommissionDisclosureStatement.click();
        Thread.sleep(3000);
        CommissionDisclosureStatement.isDisplayed();

        CommissionDisclosureStatementDesc.isDisplayed();

        GoBackToLegalAllPage.click();
    }

    public void ClickOnDriveWeath() throws InterruptedException {
        Thread.sleep(3000);
        DriveWealth.click();

    }

    public void VerifyTermAndDiscloreUnderDriveWealth() throws InterruptedException {
        Thread.sleep(3000);
        TermAndDiscloresures.click();
        Thread.sleep(5000);

        MarketDataAgreementsHeading.isDisplayed();

        GoBackToLegalAllPage.click();

    }

    public void VerifyPrivacyAndPolicyDriveWealth() throws InterruptedException {
        Thread.sleep(3000);
        PrivacyPolicy.click();
        Thread.sleep(5000);

        IntroductionHeading.isDisplayed();

        GoBackToLegalAllPage.click();

    }

    public void VerifyW8BenUnderDriveWealth() throws InterruptedException {
        Thread.sleep(3000);
        W8BEN.click();
        Thread.sleep(5000);

        W8BENNonUSCitizens.isDisplayed();

        GoBackToLegalAllPage.click();
        GoBackToLegalAllPage.click();
    }

    public void VerifyYesBankFunctionality() throws InterruptedException {
        Thread.sleep(3000);
        YesBank.click();

        Download.click();
    }

    public void VerifySuggestionFunctionalityErrorMsg() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 4; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
       // SubmitUnderCSR.click();

        Thread.sleep(2000);
        EnterValidEmailError.isDisplayed();
        WhatThinkError.isDisplayed();


    }

    public void ClickOnSubmitASupportTicket() throws InterruptedException {
        Thread.sleep(3000);
        SubmitASupportTicket.click();

    }


    public void GotoSubmitASupportTicketForNominee() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 2; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
    }

    public void ClickOnSubmitATicketForUSStocksUnderBankAccountsSection() throws InterruptedException {
        Thread.sleep(3000);
        SubmitATicket.click();
    }

    public void VerifyCreateATicketForUSStocks() throws InterruptedException {
        Thread.sleep(3000);
        GeneralQuestionIssueType.click();
        Thread.sleep(2000);
        EnterSubjectUnderPANVerificationArea.sendKeys("checking");
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        EnterMsgUnderIssueArea.sendKeys("checking");
        Thread.sleep(2000);
        SubmitBtn.click();

        Thread.sleep(3000);
        USStocks.isDisplayed();


    }

    public void ClickOnMFUnderBankAccounts() throws InterruptedException {
        Thread.sleep(3000);
        MF.click();
    }

    public void VerifySubmitATicketForMFUnderBankAccountsSection() throws InterruptedException {
        Thread.sleep(3000);
        GeneralQuestionIssueType.click();

        EnterSubjectForMF.click();
        Thread.sleep(2000);
        EnterSubjectForMFValue.sendKeys("checking");
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        EnterMsgForMF.click();
        Thread.sleep(2000);
        EnterMsgForMFValue.sendKeys("checking");
        Thread.sleep(2000);
        SubmitBtn.click();




    }

    public void ClickOnReferAndEarnSection() throws InterruptedException {
        Thread.sleep(4000);
        ReferAndEarnSection.click();

    }

    public void ValidateMinimodulePage() throws InterruptedException {
        Thread.sleep(3000);
        ViewAllAccounts.isDisplayed();

    }

    public void NavigateToAboutUsSection() throws InterruptedException {
        Thread.sleep(4000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        AboutUsSection.click();

    }

    public void ClickOnKnowMoreBtn() throws InterruptedException {
        Thread.sleep(3000);
        KnowMore.click();
    }

    public void ValidateAboutAppreciatePage() throws InterruptedException {
        Thread.sleep(3000);
        AboutAppreciate.isDisplayed();
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(2000);
        ReasonsToInvest.isDisplayed();

        AboutUSBackArrow.click();

    }

    public void ClickOnLegalSection() throws InterruptedException {
        Thread.sleep(3000);
        Legal.click();

    }

    public void VerifyLegalPage() throws InterruptedException {
        Thread.sleep(8000); // Ideally use WebDriverWait instead of Thread.sleep
        try {
            if (LegalPageWebView.isDisplayed()) {
                System.out.println("Legal page is displayed successfully.");
            } else {
                System.out.println("Legal page is not displayed.");
            }
        } catch (Exception e) {
            System.out.println("Legal page verification failed: " + e.getMessage());
            // Optionally rethrow or handle accordingly
        }
    }

    public void ClickOnCSRSection() throws InterruptedException {
        Thread.sleep(3000);
        CSR.click();

    }

    public void ClickOnOtherServices() throws InterruptedException {
        Thread.sleep(4000);
        OtherServices.click();
    }

    public void ClickOnViewAllAccountsCTA() throws InterruptedException {
        Thread.sleep(4000);
        ViewAllAccounts.click();
    }

    public void ValidateAccountsPage() throws InterruptedException {
        Thread.sleep(3000);
        AccountsPage.isDisplayed();
        AddBankActNoteForUSStocks.isDisplayed();
        AddedYesBankAct.isDisplayed();

    }

    public void ClickOnSubmitATicketForUSStocks() throws InterruptedException {
        Thread.sleep(3000);
        SubmitATicketForUSStocks.click();
    }

    public void ValidateSubmitATicketFunctionalityForUSStocks() throws InterruptedException {
        Thread.sleep(4000);
        IssueType.click();
        EnterSubjectForSubmitATicketUnderUSStocks.sendKeys("Checking flow ");
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(3000);
        EnterMsgForSubmitATicketUnderUSStocks.sendKeys("Checking flow ");
        Thread.sleep(2000);
        SubmitBtn.click();

        // toast msg appearing too fast here, not able to locate in inspector

        Thread.sleep(3000);
        AccountsPage.isDisplayed();

    }

    public void ValidateAddedAccountsForMF() throws InterruptedException {
        Thread.sleep(3000);
        MFAccountsBankNote.isDisplayed();

        AddBankCTA.isDisplayed();
        AddedYesBankAct.isDisplayed();


    }

    public void ClickOnSubmitATicketForMutualFunds() throws InterruptedException {
        Thread.sleep(3000);
        SubmitATicketForMutualFunds.click();

    }

    public void ValidateSubmitAicketFunctionalityForMF() throws InterruptedException {
        GeneralQuestionIssueType.click();

        MFSubmitATicketSubject.click();
        Thread.sleep(2000);
        MFSubmitATicketSubjectValue.sendKeys("Checking flow");
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));

        Thread.sleep(2000);
        MFSubmitATicketYourMsg.click();
        Thread.sleep(2000);
        MFSubmitATicketYourMsgValue.sendKeys("Checking flow");

        Thread.sleep(2000);

        SubmitBtn.click();

        Thread.sleep(4000);
        AccountsPage.isDisplayed();




    }

    public void ValidateDistributorAgentPage() throws InterruptedException {
        Thread.sleep(3000);
        //DistributorAgentPage.isDisplayed();
        EnterCodeCTA.isDisplayed();
        NoThanks.isDisplayed();
    }

    public void ClickOnAccountsPageBackArrow() throws InterruptedException {
        Thread.sleep(3000);
        AccountsPageBackArrow.click();

    }

    public void ValidateAllSectionUnderSupportPage() throws InterruptedException {
        Thread.sleep(4000);
        RecentTickets.isDisplayed();
        SubmitATicket.isDisplayed();
        CallUs.isDisplayed();
        ChatWithWhatsapp.isDisplayed();
        helpdesk.isDisplayed();
        FAQ.isDisplayed();
    }

    public void ClickOnRecentTickets() throws InterruptedException {
        Thread.sleep(3000);
        RecentTickets.click();

    }

    public void ValidateRaisedSupportTickets() throws InterruptedException {
        Thread.sleep(5000);
        SupportTicketsPage.isDisplayed();

        RaisedSupportTicket.isDisplayed();
    }

    public void ClickOnSupportPageBackArrow() throws InterruptedException {
        Thread.sleep(2000);
        SupportPageBackArrow.click();
    }

    public void ValidateSubmitATicketErrorMsg() throws InterruptedException {
        Thread.sleep(3000);
        SubmitBtn.click();
        Thread.sleep(2000);
        EnterSubjectErrorMsg.isDisplayed();
        EnterMsgError.isDisplayed();

    }

    public void ClickOnSettingIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(SettingIcon));
        SettingIcon.click();
    }

    public void ValidateAllSectionUnderSettings() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(SettingsHeading));

        ChangePasscode.isDisplayed();
        ChangeLanguage.isDisplayed();
        InvestmentBuilder.isDisplayed();
        DayTradeSetting.isDisplayed();
        Biometric.isDisplayed();
        DarkMode.isDisplayed();
        DeactivateAccounts.isDisplayed();
        UserDeviceSettings.isDisplayed();
    }
}


