package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.*;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MiniModuleSteps extends BasePage {

    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();

    DashboardPage dashboardPage = new DashboardPage();


    @Given("the User is on MiniModule page")
    public void the_user_is_on_mini_module_page() throws Exception {
        new SignInPage().DynamicSignIn_Prod("raj.singh@ppreciate.com");
        new MiniModulePage().NavigateToMiniModule();

    }
    @And("the User Clicks on Accounts")
    public void theUserClicksOnAccounts() throws InterruptedException {
        new MiniModulePage().AccountsPage();

    }

    @Given("User is on Your Account Page")
    public void user_is_on_your_account_page() throws InterruptedException {
        new MiniModulePage().YourAccountsPage();
    }


    @Given("User clicks on info icon")
    public void user_clicks_on_info_icon() throws InterruptedException {
        new MiniModulePage().InfoDetails();

    }

    @Given("User Select Okay button")
    public void user_select_okay_button() throws InterruptedException {
        new MiniModulePage().okay();
    }
    @When("user is on DriveWealth Page")
    public void user_is_on_drive_wealth_page() throws InterruptedException {
        new MiniModulePage().DriveWealthoption();
        new MiniModulePage().WealthDetailspage();
    }
    @When("User should see the DriveWealthAccount Details")
    public void user_should_see_the_drive_wealth_account_details() throws InterruptedException {
        new MiniModulePage().AccountMargin();

    }
    @Then("User should see Margin and Cash Account details on DriveWealth")
    public void user_should_see_margin_and_cash_account_details_on_drive_wealth() throws InterruptedException {
        new MiniModulePage().AccountCash();
        basePage.AndroidBack();
        basePage.Logout();
    }


    @And("the User Clicks on Pricing")
    public void theUserClicksOnPricing() throws InterruptedException, IOException {
        new MiniModulePage().PricingPage();

    }

    @When("User is on Pricing page")
    public void userIsOnPricingPage() throws InterruptedException {
        new MiniModulePage().PricingDetails();

    }

    @And("User clicks on info icon of Goals")
    public void userClicksOnInfoIconOfGoals() throws InterruptedException {
        new MiniModulePage().GoalsinfoDetails();

    }


    @And("User clicks on info icon of Trade")
    public void userClicksOnInfoIconOfTrade() throws InterruptedException {
        new MiniModulePage().TradeinfoDetails();

    }

    @And("User clicks on info icon of CashBack")
    public void userClicksOnInfoIconOfCashBack() throws InterruptedException {
        new MiniModulePage().CashinfoDetails();

    }

    @Then("User Should see Other fees with all the Pricing details")
    public void userShouldSeeOtherFeesWithAllThePricingDetails() throws InterruptedException {
        new MiniModulePage().OtherFeesDetails();
        basePage.AndroidBack();
        //new MiniModulePage().OtherClose();
        basePage.Logout();
    }

    @And("the User Clicks on Legal")
    public void theUserClicksOnLegal() throws InterruptedException {
        new MiniModulePage().LegalPage();

    }


    @And("User Clicks on Appreciate Platform")
    public void userClicksOnAppreciatePlatform() throws InterruptedException {
        new MiniModulePage().PlatformDetails();

    }

    @And("User see Terms of Use")
    public void userSeeTermsOfUse() throws InterruptedException {
        new MiniModulePage().LegalTerms();
        // new MiniModulePage().LegalClose();
        basePage.AndroidBack();

    }

    @And("User Click on Appreciate Broking")
    public void userClickOnAppreciateBroking() throws InterruptedException {
        new MiniModulePage().BrokingDetails();
        basePage.AndroidBack();
    }

    @And("User see Appreciate Broking Information")
    public void userSeeAppreciateBrokingInformation() throws InterruptedException {
        new MiniModulePage().LegalBroking();
        // new MiniModulePage().LegalClose();
    }

    @And("User Clicks on Registration")
    public void userClicksOnRegistration() throws InterruptedException {
        new MiniModulePage().RegisterDetails();
        //new MiniModulePage().RegisterPage();

    }

    @And("User Select View Registration Number")
    public void userSelectViewRegistrationNumber() throws InterruptedException{
        new MiniModulePage().LegalRegister1();
        new MiniModulePage().LegalRegister2();

    }

    @And("User Select back icon")
    public void userSelectBackIcon() throws InterruptedException {
        new MiniModulePage().LegalBack();

    }

    @Then("User Should see all Terms and Condition in Legal details")
    public void userShouldSeeAllTermsAndConditionInLegalDetails() throws InterruptedException {
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User Clicks on Drive Wealth")
    public void userClicksOnDriveWealth() throws InterruptedException {
        new MiniModulePage().DriveClick();


    }

    @And("User see Terms and Disclosure")
    public void userSeeTermsAndDisclosure() throws InterruptedException {
        new MiniModulePage().TermsClick();
        basePage.AndroidBack();
        // new MiniModulePage().LegalClose();
    }

    @And("User Clicks on Privacy Policy")
    public void userClicksOnPrivacyPolicy() throws InterruptedException {
        new MiniModulePage().PrivacyClick();
        basePage.AndroidBack();
        // new MiniModulePage().LegalClose();

    }

    @And("User Clicks on W-BEN")
    public void userClicksOnWBEN() throws InterruptedException {
        new MiniModulePage().W8BENClick();
        basePage.AndroidBack();
    }

    @Then("User Should see all Drive Wealth for Partner Terms and Condition in Legal details")
    public void userShouldSeeAllDriveWealthForPartnerTermsAndConditionInLegalDetails() throws InterruptedException {
        basePage.Logout();
    }


    @And("User Clicks on YES Bank")
    public void userClicksOnYESBank() throws InterruptedException {
        new MiniModulePage().ClickYesBank();

    }


    @And("User see Do you want to download PDF file?")
    public void userSeeDoYouWantToDownloadPDFFile() throws InterruptedException {
        new MiniModulePage().fileblock();

    }

    @And("User Clicks on Download")
    public void userClicksOnDownload() throws InterruptedException {
        new MiniModulePage().DownloadClick();

    }

    @And("User see the following Toast message Downloading File")
    public void userSeeTheFollowingToastMessageDownloadingFile() throws InterruptedException {
        new MiniModulePage().CheckMessage("Downloading File");
    }
    @Then("User Download the file successfully")
    public void userDownloadTheFileSuccessfully() throws InterruptedException {
        basePage.AndroidBack();
        basePage.Logout();
    }


    @And("the User Clicks on CSR")
    public void theUserClicksOnCSR() throws InterruptedException {
        new MiniModulePage().ClickCSR();

    }

    @And("User see Invest like a Woman in CSR")
    public void userSeeInvestLikeAWomanInCSR() throws InterruptedException {
        new MiniModulePage().CSRInvestWoman();

    }

    @And("User see shoots in CSR")
    public void userSeeShootsInCSR() throws InterruptedException {
        new MiniModulePage().CSRShoots();

    }

    @And("User see Investing for everyone in CSR")
    public void userSeeInvestingForEveryoneInCSR() throws InterruptedException {
        new MiniModulePage().CSRInvestEveryone();

    }

    @Then("User Should see all Our Key Initiatives details")
    public void userShouldSeeAllOurKeyInitiativesDetails() throws InterruptedException {
        //new MiniModulePage().LegalClose();
        basePage.AndroidBack();
        basePage.Logout();
    }


    @And("User see Send us your suggestions")
    public void userSeeSendUsYourSuggestions() throws InterruptedException {
        new MiniModulePage().SuggestText();

    }

    @And("User Select Submit")
    public void userSelectSubmit() throws InterruptedException {
        new MiniModulePage().SubmitButton();

    }

    @And("User see the following message on email {string}")
    public void userSeeTheFollowingMessageOnEmail(String EmailError) throws InterruptedException {
        new MiniModulePage().ValidateEmailError("Please enter valid email");

    }

    @And("User see the following message on suggestion {string}")
    public void userSeeTheFollowingMessageOnSuggestion(String CommentError) throws InterruptedException {
        new MiniModulePage().ValidateCommentError("Please tell us what you think");
    }

    @Then("User Should see error message must be displayed")
    public void userShouldSeeErrorMessageMustBeDisplayed() throws InterruptedException {
        //new MiniModulePage().ScrollCSRClose();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("the User Clicks on refer now")
    public void theUserClicksOnReferNow() throws InterruptedException {
        new MiniModulePage().ClickReferNow();

    }

    @When("user is on Rewards and Incentives page")
    public void userIsOmRewardsAndIncentivesPage() throws InterruptedException {
        new MiniModulePage().ValidateRewardsPage();

    }

    @And("User is on Refer a friend page")
    public void userIsOnReferAFriendPage() throws InterruptedException {
        new MiniModulePage().ValidateReferFriendPage();

    }

    @And("User Clicks on Rewards")
    public void userClicksOnRewards() throws InterruptedException {
        new MiniModulePage().ClickRewards();

    }

    @And("User Clicks on Coupons")
    public void userClicksOnCoupons() throws InterruptedException {
        new MiniModulePage().ClickCoupons();

    }

    @Then("User Should see successfully Rewards and Incentives")
    public void userShouldSeeSuccessfullyRewardsAndIncentives() throws InterruptedException {
        new MiniModulePage().AndroidBack();
        basePage.Logout();
    }

    @And("the User Clicks on Support")
    public void theUserClicksOnSupport() throws InterruptedException {
        new MiniModulePage().SupportPage();

    }

    @And("User Clicks on Submit a Ticket")
    public void userClicksOnSubmitATicket() throws InterruptedException {
        new MiniModulePage().ClickTicket();

    }

    @And("User Select issue type")
    public void userSelectIssueType() throws InterruptedException {
        new MiniModulePage().SelectIssue();


    }

    @And("User enters Subject")
    public void userEntersSubject() throws InterruptedException {
        new MiniModulePage().EnterSubject("Support ticket for testing Scripts");
        //basePage.AndroidBack();

    }

    @And("User enters Your message")
    public void userEntersYourMessage() throws InterruptedException {
        new MiniModulePage().EnterMessage("Support message for testing Scripts");

    }

    @And("User clicks on the CTA for Submit a ticket")
    public void userClicksOnTheCTAForSubmitATicket() throws InterruptedException {
        new MiniModulePage().ClickSubmit();

    }

    @Then("User should successfully create a support ticket")
    public void userShouldSuccessfullyCreateASupportTicket() throws InterruptedException {
        //new MiniModulePage().ClickBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("the User Clicks on Change Language")
    public void theUserClicksOnChangeLanguage() throws InterruptedException {
        new MiniModulePage().ClickChangeLanguage();

    }

    @And("User Clicks on Hindi language")
    public void userClicksOnHindiLanguage() throws InterruptedException {
        new MiniModulePage().ClickHindi();

    }

    @And("User Select Continue")
    public void userSelectContinue() throws InterruptedException {
        new MiniModulePage().Continuebutton();

    }

    @When("User is on Passcode page")
    public void userIsOnPasscodePage() throws InterruptedException {
        Thread.sleep(8000);
        new SignInPage().EnterPasscode();

    }

    @And("User Clicks on CTA of Profile")
    public void userClicksOnCTAOfProfile() throws IOException, InterruptedException {
        Thread.sleep(3000);
        basePage.ClickProfileSettings();

    }


    @And("User should see Profile name text must be change to प्रोफाइल")
    public void userShouldSeeProfileNameTextMustBeChangeToप्रोफाइल() throws InterruptedException {
        new MiniModulePage().ValidateTextChange("प्रोफाइल");
    }

    @Then("User should successfully see change language")
    public void userShouldSuccessfullySeeChangeLanguage() throws InterruptedException {
        new MiniModulePage().ClickHindiLanguageChange();
        new MiniModulePage().ClickEnglish();
        new MiniModulePage().Continuebutton();
        Thread.sleep(8000);
        new SignInPage().EnterPasscode();
        new BasePage().ClickProfileSettings();
        basePage.Logout();
    }

    @And("the User Clicks on About Us")
    public void theUserClicksOnAboutUs() throws InterruptedException {
        new MiniModulePage().AboutUsPage();

    }

    @And("User see Our Mission Banner")
    public void userSeeOurMissionBanner() throws InterruptedException {
        new MiniModulePage().ValidateAboutUsPage();

    }

    @And("User see Our Vision and Values")
    public void userSeeOurVisionAndValues() throws InterruptedException {
        new MiniModulePage().ValidateVisionValues();

    }

    @Then("User Should see all the details in About Us")
    public void userShouldSeeAllTheDetailsInAboutUs() throws InterruptedException {
        //new MiniModulePage().ClosePage();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Given("the user is on Goals Dashboard for latest transaction")
    public void theUserIsOnGoalsDashboardForLatestTransaction() throws Exception {
        signInPage.DynamicSignIn("varsha.thandav@ppreciate.com");
        //dashboardPage.ClickOnGoToDashboard();
        new GoalsPage().SwitchtoGoal();

    }


    @And("user adds name of the  latest goal")
    public void userAddsNameOfTheLatestGoal() throws InterruptedException {
        new GoalsPage().EnterRandomGoalName();


    }

    @And("user select Target Date for latest goal")
    public void userSelectTargetDateForLatestGoal() throws InterruptedException {
        new GoalsPage().clicktargetdate();
        new GoalsPage().clicktargetyear();
        new GoalsPage().selectyearinlist("2025");
    }

    @And("user adds Target amount for latest goal")
    public void userAddsTargetAmountForLatestGoal() throws InterruptedException {
        new GoalsPage().targetamount("500");
    }


    @And("user clicks on pay now and continue")
    public void userClicksOnPayNowAndContinue() throws InterruptedException {
        new MiniModulePage().MiniGoalPay();
        new MiniModulePage().MiniGoalContinue();

    }

    @And("the user Clicks MiniModule page")
    public void theUserClicksMiniModulePage() throws IOException, InterruptedException {
        basePage.ClickProfileSettings();
    }

    @And("the User Clicks on Transactions")
    public void theUserClicksOnTransactions() throws InterruptedException {
        new MiniModulePage().MiniTransactions();

    }

    @And("User is on Goals Tab and see the latest goal created")
    public void userIsOnGoalsTabAndSeeTheLatestGoalCreated() throws InterruptedException {
        new MiniModulePage().MiniGoal();
        new MiniModulePage().GetGoalNameFromTransaction();

    }

    @And("User Clicks on Cash Tab and see the latest data")
    public void userClicksOnCashTabAndSeeTheLatestData() throws InterruptedException {
        new MiniModulePage().MiniCash();
        new MiniModulePage().GetCashGoalName();

    }

    @Then("User should see all the latest transaction in the list")
    public void userShouldSeeAllTheLatestTransactionInTheList() throws InterruptedException {
        //new MiniModulePage().MiniTransClose();
        basePage.AndroidBack();
        basePage.Logout();
    }


    @And("User is on Home dashboard")
    public void userIsOnHomeDashboard() throws InterruptedException {
        new MiniModulePage().DashboardOption();

    }

    @And("User Clicks on Goals dashboard")
    public void userClicksOnGoalsDashboard() throws IOException, InterruptedException {
        new MiniModulePage().ClickHomeGoal();

    }

    @And("User Clicks on Trade dashboard")
    public void userClicksOnTradeDashboard() throws InterruptedException {
        new MiniModulePage().ClickHomeTrade();

    }

    @And("User Clicks on Change dashboard")
    public void userClicksOnChangeDashboard() throws InterruptedException {
        new MiniModulePage().ClickHomeChange();

    }

    @And("User should see Hindi language in all dashboards")
    public void userShouldSeeHindiLanguageInAllDashboards() throws InterruptedException {
        new BasePage().ClickProfileSettings();
        new MiniModulePage().ClickHindiLanguageChange();

    }

    @Then("User should successfully see English language in all dashboards")
    public void userShouldSuccessfullySeeEnglishLanguageInAllDashboards() throws InterruptedException, IOException {
        new MiniModulePage().ClickEnglish();
        new MiniModulePage().Continuebutton();
        Thread.sleep(8000);
        new SignInPage().EnterPasscode();
        new GoalsPage().SwitchtoGoal();
        new MiniModulePage().TradeOption();
        new MiniModulePage().ChangeOption();
        new BasePage().ClickProfileSettings();
        basePage.Logout();

    }


    @And("the User Clicks on Portfolio")
    public void theUserClicksOnPortfolio() throws InterruptedException {
        new MiniModulePage().MiniPortfolio();

    }

    @And("User see Your portfolio")
    public void userSeeYourPortfolio() throws InterruptedException {
        new MiniModulePage().MiniYourPortfolio();

    }

    @Then("User Should see Trade and Goals portfolio")
    public void userShouldSeeTradeAndGoalsPortfolio() throws InterruptedException {
        new MiniModulePage().MiniTradeText();
        new MiniModulePage().MiniGoalText();
        new MiniModulePage().MiniPortfolioClose();
        basePage.Logout();
    }

    @And("the User Clicks on Add-On Services")
    public void theUserClicksOnAddOnServices() throws InterruptedException {
        new MiniModulePage().MiniAddOnServices();
    }

    @Then("User Should see all Add-On Services details")
    public void userShouldSeeAllAddOnServicesDetails() throws InterruptedException {
        //new MiniModulePage().OtherClose();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Given("User is on Logged in Screen")
    public void userIsLoggedInScreen() {
        System.out.println("User is on Logged in Screen");
    }

    @When("User enters {string}")
    public void userEntersAnd(String email) throws Exception {
        new SignInPage().DynamicSignIn(email);

    }
    @And("User navigates to Profile details screen")
    public void userNavigatesToProfileDetailsScreen() throws IOException, InterruptedException {
        new MiniModulePage().NavigateToMiniModule();
        new MiniModulePage().ClickOnProfile();
    }

    @Then("User should see the information like {string},{string},{string},{string},{string},{string} and {string} under profile details as per login")
    public void userShouldSeeTheInformationLikeAndUnderProfileDetailsAsPerLogin(String FullName,String DOB,String Gender, String MaritalStatus, String EducationalQualification, String OccupationType, String AnnualIncome) throws InterruptedException {
        new MiniModulePage().ValidatePersonalAndOtherDetails(FullName,DOB,Gender,MaritalStatus,EducationalQualification,OccupationType,AnnualIncome);
    }


    @And("User should see Contact Details like {string} and {string} as per the login")
    public void userShouldSeeContactDetailsLikeAndAsPerTheLogin(String MobileNumber, String EmailId) throws InterruptedException {
        new MiniModulePage().ValidateContactDetails(MobileNumber,EmailId);
    }

    @And("User should see Permanent Address like {string},{string},{string} ,{string},{string} as per the login")
    public void userShouldSeePermanentAddressLikeAsPerTheLogin(String Address, String City, String District, String State, String PinCode) throws InterruptedException {
        new MiniModulePage().ValidatePermanentAddress(Address,City,District,State,PinCode);
    }


    @And("User should see KYC Details like {string} as per the login")
    public void userShouldSeeKYCDetailsLikeAsPerTheLogin(String PanNumber) throws InterruptedException {
        new MiniModulePage().ValidateKYCDetails(PanNumber);
    }

    @And("User should see the Nominee Details like {string},{string},{string} as per the login")
    public void userShouldSeeTheNomineeDetailsLikeAsPerTheLogin(String NomineeName, String DateOfBirth, String PhoneNumber) throws InterruptedException {
        new MiniModulePage().ValidateNomineeDetails(NomineeName,DateOfBirth,PhoneNumber);
        basePage.AndroidBack();

    }

    @And("User navigates to the Profile details screen")
    public void userNavigatesToTheProfileDetailsScreen() throws InterruptedException {
        new MiniModulePage().ClickOnProfileFromDashboard();
        new MiniModulePage().ClickOnProfile();

    }
    @And("User Clicks on close button")
    public void userClicksOnCloseButton() throws InterruptedException {
        new MiniModulePage().CloseProfileScreen();
    }

    @Then("It should close the profile details pop-up")
    public void itShouldCloseTheProfileDetailsPopUp() throws InterruptedException {
        new MiniModulePage().ValidateProfileScreen();
        basePage.Logout();
    }


    @And("User clicks on Profile icon")
    public void userClicksOnProfileIcon() throws InterruptedException {
        //new MiniModulePage().ClickOnProfileFromDashboard();
        basePage.ClickProfileSettings();


    }


    @Then("User logs out and should see the sign in page")
    public void userLogsOutAndShouldSeeTheSignInPage() throws InterruptedException {
        basePage.Logout();
    }

    @And("User updates the Annual Income")
    public void userUpdatesTheAnnualIncome() throws InterruptedException {
        new MiniModulePage().UpdateAnnualIncome();
    }


    @Then("Annual Income should be updated under profile details")
    public void annualIncomeShouldBeUpdatedUnderProfileDetails() throws InterruptedException {
        new MiniModulePage().ValidateUpdatedIncome();
        basePage.AndroidBack();
        basePage.Logout();

    }

    @Given("the User is on MiniModule page for passcode")
    public void theUserIsOnMiniModulePageForPasscode() throws Exception {
        new SignInPage().DynamicSignIn("varshatmysuru1992@gmail.com");
        //signInPage.OTPDynamicSignIn("varsha.thandav@ppreciate.com");
        new MiniModulePage().NavigateToMiniModule();


    }

    @And("the User Clicks on Settings & Preferences")
    public void theUserClicksOnSettingsPreferences() throws InterruptedException {
        new MiniModulePage().ClickSettings();


    }

    @And("the User Clicks on Change Passcode")
    public void theUserClicksOnChangePasscode() throws InterruptedException {
        new MiniModulePage().ClickPasscode();
        new MiniModulePage().ClickPasscode();

    }

    @And("the User Enters the OTP")
    public void theUserEntersTheOTP() throws InterruptedException {
        new MiniModulePage().AddingOTP();

    }

    @And("the User Change the new passcode")
    public void theUserChangeTheNewPasscode() throws InterruptedException {
        new MiniModulePage().SetPasscode();

    }

    @Then("the User Confirm the new passcode")
    public void theUserConfirmTheNewPasscode() throws Exception {
        new MiniModulePage().SetPasscode();
        signInPage.DynamicSignIn("varsha.thandav@ppreciate.com");
        new MiniModulePage().NavigateToMiniModule();
        //basePage.Logout();
        new MiniModulePage(). ClickOnSettingIcon();

    }


    @And("User Clicks on the Submit a Ticket in Profile Details")
    public void userClicksOnTheSubmitATicketInProfileDetails() throws InterruptedException {
        new MiniModulePage().ClickProfileSubmit();


    }

    @Then("User should successfully create a support ticket from Profile Details Page")
    public void userShouldSuccessfullyCreateASupportTicketFromProfileDetailsPage() throws InterruptedException {
        //new MiniModulePage().MiniTransClose();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User navigates to the Profile screen")
    public void userNavigatesToTheProfileScreen() throws InterruptedException {
        new MiniModulePage().ClickOnProfile();
    }

    @And("the User Clicks on Buying Power")
    public void theUserClicksOnBuyingPower() throws InterruptedException {
        new MiniModulePage().ClickBuyingPower();

    }

    @And("the User Clicks on Account Details")
    public void theUserClicksOnAccountDetails() throws InterruptedException {
        new MiniModulePage().ClickAccountDetails();

    }

    @Then("User Should See Drive Wealth Account Details")
    public void userShouldSeeDriveWealthAccountDetails() throws InterruptedException {
        new MiniModulePage().ValidateDriveWealth();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("the User Clicks on Distributor or Agent Details")
    public void theUserClicksOnDistributorOrAgentDetails() throws InterruptedException {
        new MiniModulePage().ClickDistributorAgent();
        new MiniModulePage().ValidateDistributorAgentPage();
        //new MiniModulePage().ClickDistributClose();
        basePage.AndroidBack();
    }

    @And("the User Clicks on Request Advisory Services")
    public void theUserClicksOnRequestAdvisoryServices() throws InterruptedException {
        new MiniModulePage().ClickRequestAdvisory();

    }

    @And("User Selects Thinking of Hiring")
    public void userSelectsThinkingOfHiring() throws InterruptedException {
        new MiniModulePage().ValidateHiring();

    }

    @Then("User should see all the options in Add-on Services")
    public void userShouldSeeAllTheOptionsInAddOnServices() throws InterruptedException {
        new MiniModulePage(). VerifyThinkingOfHiringDetail();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User Enter Valid EmailId")
    public void userEnterValidEmailId() throws InterruptedException {
        new MiniModulePage().EnterEmailID("varsha.thandav@ppreciate.com");

    }

    @And("User Adds Feedback")
    public void userAddsFeedback() throws InterruptedException {
        new MiniModulePage().EnterFeedback("Adding Automation feedback");

    }

    @Then("User Should Successfully create a feedback Note")
    public void userShouldSuccessfullyCreateAFeedbackNote() throws InterruptedException {
        //new MiniModulePage().ScrollCSRClose();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("the User Clicks on Recent Tickets")
    public void theUserClicksOnRecentTickets() throws InterruptedException {
        new MiniModulePage().ClickRecentTickets();

    }

    @Then("User Should see all the Recent Tickets details")
    public void userShouldSeeAllTheRecentTicketsDetails() throws InterruptedException {
        new MiniModulePage().ValidateSupportTickets();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User Clicks on the Documents")
    public void userClicksOnTheDocuments() throws InterruptedException {
        new MiniModulePage().ClickDocuments();

    }

    @And("User Select Monthly Statements")
    public void userSelectMonthlyStatements() throws InterruptedException {
        new MiniModulePage().ClickMonthlyStatements();
        basePage.AndroidBack();
        //new MiniModulePage().ClickViewClose();

    }

    @And("User Select Confirmations")
    public void userSelectConfirmations() throws InterruptedException {
        new MiniModulePage().ClickConfirmations();
        basePage.AndroidBack();
        //new MiniModulePage().ClickViewClose();


    }

    @And("User Select Tax Documents")
    public void userSelectTaxDocuments() throws InterruptedException {
        new MiniModulePage().ClickTaxDocuments();
        basePage.AndroidBack();
        //new MiniModulePage().ClickViewClose();

    }

    @Then("User Should see Successfully all the documents in each option")
    public void userShouldSeeSuccessfullyAllTheDocumentsInEachOption() throws InterruptedException {
        //new MiniModulePage().ClickDocumentsClose();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User Clicks FAQs")
    public void userClicksFAQs() throws InterruptedException {
        new MiniModulePage().ClickFAQs();

    }

    @And("User Select Product FAQs")
    public void userSelectProductFAQs() throws InterruptedException {
        new MiniModulePage().ValidateProductFAQs();

    }

    @And("User Select Partner FAQs")
    public void userSelectPartnerFAQs() throws InterruptedException {
        new MiniModulePage().ValidatePartnerFAQs();

    }

    @And("User Select Company FAQs")
    public void userSelectCompanyFAQs() throws InterruptedException {
        new MiniModulePage().ValidateCompanyFAQs();

    }

    @Then("FAQs pages Should load Successfully")
    public void faqsPagesShouldLoadSuccessfully() throws InterruptedException {
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("Select info icon")
    public void selectInfoIcon() throws InterruptedException {
        new MiniModulePage().ClickBuyingInfo();

    }

    @Then("User should see all information related to buying power")
    public void userShouldSeeAllInformationRelatedToBuyingPower() throws InterruptedException {
        new MiniModulePage().ValidateBuyingDescription();
        new MiniModulePage().ValidateCashUSDescription();
        new MiniModulePage().ValidateTransitDescription();
        new MiniModulePage().ValidateAmountHeldDescription();
        new MiniModulePage().ClickOkay();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User Should see Chat with us on whatsApp")
    public void userShouldSeeChatWithUsOnWhatsApp() throws InterruptedException {
        new MiniModulePage().ValidateWhatsAppChat();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("the User Clicks on Withdraw")
    public void theUserClicksOnWithdraw() throws InterruptedException {
        new MiniModulePage().ClickWithdraw();

    }

    @And("the User enters the amount")
    public void theUserEntersTheAmount() throws InterruptedException {
        new MiniModulePage().ClickOne();
        new MiniModulePage().ClickZero();
        new MiniModulePage().ClickZero();
        new MiniModulePage().ClickZero();
        new MiniModulePage().ClickWithdrawButton();
    }

    @Then("User should see error message must be displayed {string}")
    public void userShouldSeeErrorMessageMustBeDisplayed(String arg0) throws InterruptedException {
        new MiniModulePage().ValidateErrorMessage();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User Select Day Trade Settings")
    public void userSelectDayTradeSettings() throws InterruptedException {
        new MiniModulePage().ClickDayTradeSettings();

    }

    @And("User Clicks on Day Trading")
    public void userClicksOnDayTrading() throws InterruptedException {
        new MiniModulePage().ClickDayTrading();
        new MiniModulePage().ClickDistributClose();

    }

    @And("User Clicks on Pattern Day")
    public void userClicksOnPatternDay() throws InterruptedException {
        new MiniModulePage().ClickPatternDayTrading();
        new MiniModulePage().ClickDistributClose();

    }

    @Then("User should see all the Trade setting descriptions")
    public void userShouldSeeAllTheTradeSettingDescriptions() throws InterruptedException {
        new MiniModulePage().ClickEnableTrading();
        new MiniModulePage().ClickDistributClose();
        basePage.AndroidBack();
//        new MiniModulePage().ClickDocumentsClose();
//        basePage.Logout();
    }

    @Given("the User is on the MiniModule page")
    public void theUserIsOnTheMiniModulePage() throws Exception {
        signInPage.DynamicSignIn("varsha.thandav@ppreciate.com");
        new MiniModulePage().NavigateToMiniModule();
    }

    @And("User Clicks on Enable Pattern Day Trading")
    public void userClicksOnEnablePatternDayTrading() throws IOException, InterruptedException {
        new MiniModulePage().SelectEnablePattern();
        new MiniModulePage().SelectEnablePDT();
        //new MiniModulePage().ClickDistributClose();

    }

    @Then("User should see a toast message saying PDT Enabled")
    public void userShouldSeeAToastMessageSayingPDTEnabled() throws InterruptedException {
        //new MiniModulePage().ValidateToastMessage();
        basePage.AndroidBack();
        new MiniModulePage().ClickDocumentsClose();
        basePage.Logout();
    }

    @And("User Clicks on Disable Pattern Day Trading")
    public void userClicksOnDisablePatternDayTrading() throws InterruptedException {
        new MiniModulePage().SelectDisablePattern();
        new MiniModulePage().SelectEnablePDT();

    }

    @Then("User should see a toast message saying PDT Disabled")
    public void userShouldSeeAToastMessageSayingPDTDisabled() throws InterruptedException {
        basePage.AndroidBack();
        new MiniModulePage().ClickDocumentsClose();
        basePage.Logout();

    }

    @And("User Clicks on View account value")
    public void userClicksOnViewAccountValue() throws InterruptedException {
        new MiniModulePage().ClickAccountValue();


    }

    @Then("User should see all description related to account value")
    public void userShouldSeeAllDescriptionRelatedToAccountValue() throws InterruptedException {
        new MiniModulePage().ValidateAccountText();
        new MiniModulePage().ClickDistributClose();
        basePage.AndroidBack();
        new MiniModulePage().ClickDocumentsClose();
        basePage.Logout();
    }

    @And("User Select Choose From Device")
    public void userSelectChooseFromDevice() throws InterruptedException {
        new MiniModulePage().ClickProfilePhoto();
        new MiniModulePage().ClickChooseDevice();

    }

    @And("User Select Gallery Option")
    public void userSelectGalleryOption() throws InterruptedException {
        new MiniModulePage().ClickGallery();
        new MiniModulePage().ChoosePhoto();
    }

    @And("User Select Photo From Device")
    public void userSelectPhotoFromDevice() throws InterruptedException {
        new MiniModulePage().ClickImage();

    }

    @Then("the User Profile Photo should be Updated Successfully")
    public void theUserProfilePhotoShouldBeUpdatedSuccessfully() throws InterruptedException {
        new MiniModulePage().ClickSave();
        new MiniModulePage().CloseProfileScreen();
        basePage.Logout();

    }

    @And("User Select the Okay button")
    public void userSelectTheOkayButton() throws InterruptedException {
        new MiniModulePage().ClickInfoOkay();
    }

    @And("User Select the issue type")
    public void userSelectTheIssueType() throws InterruptedException {
        new MiniModulePage().ClickProfileIssue();
    }

    @And("User enters the Subject")
    public void userEntersTheSubject() throws InterruptedException {
        new MiniModulePage().EnterProfileSubject("Ticket For Automation testing");

    }

    @And("User enters the Your message")
    public void userEntersTheYourMessage() throws InterruptedException {
        new MiniModulePage().EnterProfileMessage("Ticket For Automation testing");
    }

    @And("User clicks on the CTA for Submit a ticket in profile")
    public void userClicksOnTheCTAForSubmitATicketInProfile() throws InterruptedException {
        new MiniModulePage().ClickProfileTicketSubmit();
    }

    @When("User click on US Wallet")
    public void userClickOnUSWallet() throws InterruptedException {
        new MiniModulePage().SelectUSWalletOption();
    }

    @Then("User will verify the US Wallet Amount")
    public void userWillVerifyTheUSWalletAmount() throws InterruptedException {
        new MiniModulePage().VerifyUSWalletAmt();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User clicks on info icon of AUM charges")
    public void userClicksOnInfoIconOfAUMCharges() throws InterruptedException {
        new MiniModulePage(). SelectAUMchargesUnderGoals();
    }

    @And("User clicks on info icon of Transaction Fee")
    public void userClicksOnInfoIconOfTransactionFee() throws InterruptedException {
        new MiniModulePage(). SelectTransactionFeeUnderTrae();
    }


    @Given("User enter wrong passcode")
    public void userEnterWrongPasscode() throws InterruptedException {
        signInPage. EnterWrongPasscode("raj.singh@ppreciate.com");
    }

    @Then("The passcode must be clear by default and user should be able to re-enter the passcode again")
    public void thePasscodeMustBeClearByDefaultAndUserShouldBeAbleToReEnterThePasscodeAgain() throws InterruptedException {
        new MiniModulePage(). EnterCorrectPasscode();
    }

    @And("User should see the home dashboard")
    public void userShouldSeeTheHomeDashboard() throws InterruptedException {
        new MiniModulePage(). VerifyHomeDashboard();
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

    @And("User kills the app")
    public void userKillsTheApp() throws InterruptedException {
        basePage.KillApp((AndroidDriver) driver);
    }

    @And("User will relaunch the app")
    public void userWillRelaunchTheApp() {
        launchApp();
    }

    @Then("User will see the Sign in page")
    public void userWillSeeTheSignInPage() throws InterruptedException {
        new MiniModulePage(). VerifySignInPage();
    }

    @Then("User should see Yes Bank Page")
    public void userShouldSeeYesBankPage() throws InterruptedException {
        new MiniModulePage(). VerifyYesBankPage();
    }

    @And("User come back to minimodule page")
    public void userComeBackToMinimodulePage() throws InterruptedException {
        new MiniModulePage(). GoBackToMiniModulePage();
    }

    @And("User come back to minimodule page and do logout")
    public void userComeBackToMinimodulePageAndDoLogout() throws InterruptedException {
        new MiniModulePage(). GoBackToMiniModulePage();
        basePage.Logout();
    }

    @And("User click on investment builder")
    public void userClickOnInvestmentBuilder() throws InterruptedException {
        new MiniModulePage(). ClickOnInvestmentBuilder();
    }

    @Then("User should see update investment builder page")
    public void userShouldSeeUpdateInvestmentBuilderPage() throws InterruptedException {
        new MiniModulePage(). VerifyUpdateInvestmentBuilderPage();
    }

    @And("User update the typically invest section")
    public void userUpdateTheTypicallyInvestSection() throws InterruptedException {
        new MiniModulePage(). UpdateTypicallyInvest();
    }

    @When("User come back from update investment builder page")
    public void userComeBackFromUpdateInvestmentBuilderPage() throws InterruptedException {
        new MiniModulePage(). SelectBackArrowAtUpdateInvestmentBuilderPage();
    }

    @Then("User should see setting and preferences page")
    public void userShouldSeeSettingAndPreferencesPage() throws InterruptedException {
        new MiniModulePage(). ClickOnSettingIcon();
//        basePage.Logout();

    }

    @When("User click on the banner of what is pattern day trading")
    public void userClickOnTheBannerOfWhatIsPatternDayTrading() throws InterruptedException {
        new MiniModulePage(). ClickOnWhatIsPatternDayTrading();
    }

    @Then("User should see the all details of pattern day trading")
    public void userShouldSeeTheAllDetailsOfPatternDayTrading() throws InterruptedException {
        new MiniModulePage(). VerifyDetailsOfWhatIsPatternDayTrading();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User should see Refer and earn page with all CTAs")
    public void userShouldSeeReferAndEarnPageWithAllCTAs() throws InterruptedException {
        new MiniModulePage(). VerifyReferNowPage();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @Then("User should see all the details of Benefits section under investment advisory")
    public void userShouldSeeAllTheDetailsOfBenefitsSectionUnderInvestmentAdvisory() throws InterruptedException {
        new MiniModulePage(). VerifyBenefitAdvisoryDetail();
    }

    @And("User Select Request advisory services")
    public void userSelectRequestAdvisoryServices() throws InterruptedException {
        new MiniModulePage(). SelectAdvisoryServices();
    }

    @Then("User should be able to submit the Request advisory services request")
    public void userShouldBeAbleToSubmitTheRequestAdvisoryServicesRequest() throws InterruptedException {
        new MiniModulePage(). VerifyRequest();
    }

    @Then("User should see all the sections of minimodule are visible")
    public void userShouldSeeAllTheSectionsOfMinimoduleAreVisible() throws InterruptedException {
        new MiniModulePage(). VerifyAllMiniModuleSections();
       // basePage.Logout();
    }

    @And("User click on US Wallet under minimodule")
    public void userClickOnUSWalletUnderMinimodule() throws InterruptedException {
        new MiniModulePage(). ClickOnUSWallet();
    }

    @Then("User should see all the details of US wallet")
    public void userShouldSeeAllTheDetailsOfUSWallet() throws InterruptedException {
        MiniModulePage miniModulePage = new MiniModulePage();

        try {
            miniModulePage.VerifyAllUSWalletDetails();
        } catch (Exception e) {
            System.out.println("VerifyAllUSWalletDetails failed: " + e.getMessage());
        }

        try {
            miniModulePage.VerifyAccountDetails();
        } catch (Exception e) {
            System.out.println("VerifyAccountDetails failed: " + e.getMessage());
        }

        try {
            miniModulePage.VerifyWithdrawalFunctionality();
        } catch (Exception e) {
            System.out.println("VerifyWithdrawalFunctionality failed: " + e.getMessage());
        }

        try {
            miniModulePage.VerifyWithdrawalAmount();
        } catch (Exception e) {
            System.out.println("VerifyWithdrawalAmount failed: " + e.getMessage());
        }

        try {
            miniModulePage.VerifyIncorrectWithdrawalAmount();
        } catch (Exception e) {
            System.out.println("VerifyIncorrectWithdrawalAmount failed: " + e.getMessage());
        }

        try {
            miniModulePage.VerifyCorrectWithdrawalAmount();
        } catch (Exception e) {
            System.out.println("VerifyCorrectWithdrawalAmount failed: " + e.getMessage());
        }

        try {
            miniModulePage.VerifyWithdrawalRequestAccepted();
        } catch (Exception e) {
            System.out.println("VerifyWithdrawalRequestAccepted failed: " + e.getMessage());
        }

        try {
            miniModulePage.VerifySubmitTicketAtWithdrawalRequestAcceptedPage();
        } catch (Exception e) {
            System.out.println("VerifySubmitTicketAtWithdrawalRequestAcceptedPage failed: " + e.getMessage());
        }

        try {
            basePage.ClickProfileSettings();
        } catch (Exception e) {
            System.out.println("ClickProfileSettings failed: " + e.getMessage());
        }

        try {
            basePage.Logout();
        } catch (Exception e) {
            System.out.println("Logout failed: " + e.getMessage());
        }
    }


    @And("User click on Personal Details under minimodule")
    public void userClickOnPersonalDetailsUnderMinimodule() throws InterruptedException {
        new MiniModulePage(). ClickOnPersonalDetails();
    }

    @Then("User should see all the details of Personal Details")
    public void userShouldSeeAllTheDetailsOfPersonalDetails() throws InterruptedException {
        new MiniModulePage(). VerifyAllPersonalDetails();
      //  new MiniModulePage(). VerifySubmitASupportTicketForNomineeDetails();
       // new MiniModulePage(). VerifySubmitASupportTicketForPersonalDetails();
        basePage.AndroidBack();
//        new MiniModulePage(). ClickOnBankAccounts();
//        new MiniModulePage(). VerifyUSStocksBankAccounts();
//        new MiniModulePage(). VerifyMFBankAccounts();
//        basePage.AndroidBack();
//        Thread.sleep(3000);
//        new MiniModulePage(). ClickOnOrders();
//        new MiniModulePage(). VerifyAllTabsUnderAllTransactionsPage();
//        basePage.AndroidBack();
//        basePage.ClickProfileSettings();
//        basePage.Logout();

    }

    @And("User click on Bank Accounts under minimodule")
    public void userClickOnBankAccountsUnderMinimodule() throws InterruptedException {
        new MiniModulePage(). ClickOnBankAccounts();
    }

    @Then("User should see all the details of Bank Accounts")
    public void userShouldSeeAllTheDetailsOfBankAccounts() throws InterruptedException {
        new MiniModulePage(). VerifyUSStocksBankAccounts();
        new MiniModulePage(). VerifyMFBankAccounts();
        basePage.AndroidBack();

    }

    @And("User click on Orders under minimodule")
    public void userClickOnOrdersUnderMinimodule() throws InterruptedException {
        new MiniModulePage(). ClickOnOrders();
    }

    @Then("User should see all tabs under All Transactions page")
    public void userShouldSeeAllTabsUnderAllTransactionsPage() throws InterruptedException {
        new MiniModulePage(). VerifyAllTabsUnderAllTransactionsPage();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User click on Settings and Preferences")
    public void userClickOnSettingsAndPreferences() throws InterruptedException {
        new MiniModulePage(). ClickOnSettingsAndPreferences();
    }

    @Then("User should see all details of Settings and Preferences")
    public void userShouldSeeAllDetailsOfSettingsAndPreferences() throws InterruptedException {
        new MiniModulePage(). VerifyAllTabsOfSettingsAndPreferences();
        new MiniModulePage(). VerifyChangePasscodeFunctionality();
        new MiniModulePage(). SetANewPasscode();
        new MiniModulePage(). ConfirmNewPasscode();
        new MiniModulePage(). VerifyNewPasscodeSet();
        new SignInPage().DynamicSignIn_Prod("raj.singh@ppreciate.com");
        basePage.ClickProfileSettings();
        new MiniModulePage(). ClickOnSettingsAndPreferences();
        new MiniModulePage(). VerifyInvestmentBuilder();
        new MiniModulePage(). UpdateInvestmentBuilder();
        basePage.AndroidBack();
        new MiniModulePage(). VerifyDayTradingSettings();
        basePage.AndroidBack();
        new MiniModulePage(). VerifyDeactivateAccounts();

        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User click on Support section")
    public void userClickOnSupportSection() throws InterruptedException {
        new MiniModulePage(). ClickOnSupport();
    }

    @Then("User will verify all the functionality of support section")
    public void userWillVerifyAllTheFunctionalityOfSupportSection() throws InterruptedException {
        new MiniModulePage(). VerifyFAQSection();
        new MiniModulePage(). VerifyRecentTickets();
        //new MiniModulePage(). VerifySubmitASupportTicketForNomineeDetails();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.Logout();

    }

    @And("User click on Pricing section")
    public void userClickOnPricingSection() throws InterruptedException {
        new MiniModulePage(). ClickOnPricing();
    }

    @Then("User will verify all the details of Pricing section")
    public void userWillVerifyAllTheDetailsOfPricingSection() throws InterruptedException {
        new MiniModulePage(). VerifyAllDetailsOFGoalsSection();
        new MiniModulePage(). VerifyAllDetailsOFTradeSection();

        new MiniModulePage(). VerifyExitLoad();
        new MiniModulePage(). VerifyLTCGAndSTCGTax();
//        new MiniModulePage(). VerifySTCGTax();
        new MiniModulePage(). VerifyOtherFeesSection();

        try {
            basePage.ClickUsingCoordinate(75, 114);
            Thread.sleep(3000);
        } catch (Exception e) {
            basePage.AndroidBack();
            // Optionally, log the exception or rethrow if needed
            System.out.println("ClickUsingCoordinate failed: " + e.getMessage());
            Thread.sleep(3000);
        }
        basePage.Logout();
    }

    @And("User click on Add on Services")
    public void userClickOnAddOnServices() throws InterruptedException {
        new MiniModulePage(). ClickOnAddOnServices();
    }

    @Then("User will verify all details of Add on Services")
    public void userWillVerifyAllDetailsOfAddOnServices() throws InterruptedException {
        new MiniModulePage(). VerifyDistributorAndAgentDetails();
        new MiniModulePage(). VerifyRequestAdvisoryServices();
        new MiniModulePage(). VerifyRequestAdvisoryServicesFunction();
        basePage.AndroidBack();

        new MiniModulePage(). VerifyRequestOtherServices();
        basePage.AndroidBack();
//        basePage.AndroidBack();
//        basePage.Logout();


    }

    @And("User click on About Us")
    public void userClickOnAboutUs() throws InterruptedException {
        new MiniModulePage(). ClickOnAboutUs();
    }

    @Then("User will verify all details related to about us page")
    public void userWillVerifyAllDetailsRelatedToAboutUsPage() throws InterruptedException {
        new MiniModulePage(). VerifyAboutUSPage();
        basePage.AndroidBack();
        basePage.Logout();
    }

    @And("User click on CSR")
    public void userClickOnCSR() throws InterruptedException {
        new MiniModulePage(). ClickOnCSR();
    }

    @Then("User will verify all details about CSR page")
    public void userWillVerifyAllDetailsAboutCSRPage() throws InterruptedException {
        new MiniModulePage(). VerifyCSRInitiatives();
        new MiniModulePage(). VerifySuggestionFunctionalityErrorMsg();
     //   new MiniModulePage(). VerifySuggestionFunctionality();
        // having issue with email and msg keyboard
        basePage.AndroidBack();
        basePage.Logout();


    }

    @And("User click on Legal")
    public void userClickOnLegal() throws InterruptedException {
        new MiniModulePage(). ClickOnLegal();
    }

    @Then("User will verify all details for Legal section")
    public void userWillVerifyAllDetailsForLegalSection() throws InterruptedException {
        new MiniModulePage(). VerifyAllLegalPageOptions();
        new MiniModulePage(). VerifyAppreciatePlatformDetails();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
       new MiniModulePage(). VerifyAppreciateBrokingDetails();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). VerifyRegistrationDetails();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). VerifyIFSCExchangeDisclosureDetails();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). VerifyCommissionDisclosureStatementDetails();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). ClickOnDriveWeath();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). VerifyTermAndDiscloreUnderDriveWealth();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). VerifyPrivacyAndPolicyDriveWealth();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). VerifyW8BenUnderDriveWealth();
        basePage.AndroidBack();
        new MiniModulePage(). ClickOnLegal();
        new MiniModulePage(). VerifyYesBankFunctionality();

        basePage.AndroidBack();
        basePage.Logout();

    }

    @And("User click on Submit a support ticket")
    public void userClickOnSubmitASupportTicket() throws InterruptedException {
        new MiniModulePage(). ClickOnSubmitASupportTicket();
    }

    @Then("User should be able to create a support ticket")
    public void userShouldBeAbleToCreateASupportTicket() throws InterruptedException {
        new MiniModulePage(). VerifySubmitASupportTicketForPersonalDetails();
    }

    @And("User selects Recent tickets")
    public void userSelectsRecentTickets() {
    }

    @And("User click on Submit a support ticket for nominee details")
    public void userClickOnSubmitASupportTicketForNomineeDetails() throws InterruptedException {
        new MiniModulePage(). GotoSubmitASupportTicketForNominee();
        new MiniModulePage(). ClickOnSubmitASupportTicket();
    }

    @Then("User should be able to create a support ticket under nominee")
    public void userShouldBeAbleToCreateASupportTicketUnderNominee() throws InterruptedException {
        new MiniModulePage(). VerifySubmitASupportTicketForPersonalDetails();
        basePage.AndroidBack();

    }

    @And("User click on Submit a ticket for US stocks under Bank Accounts section")
    public void userClickOnSubmitATicketForUSStocksUnderBankAccountsSection() throws InterruptedException {
        new MiniModulePage(). ClickOnSubmitATicketForUSStocksUnderBankAccountsSection();
    }

    @Then("User should be able to create a Ticket for US Stocks")
    public void userShouldBeAbleToCreateATicketForUSStocks() throws InterruptedException {
        new MiniModulePage(). VerifyCreateATicketForUSStocks();
    }

    @And("User click on Mutual funds under Bank accounts")
    public void userClickOnMutualFundsUnderBankAccounts() throws InterruptedException {
        new MiniModulePage(). ClickOnMFUnderBankAccounts();
    }

    @And("User click on Submit a ticket for MF under Bank Accounts section")
    public void userClickOnSubmitATicketForMFUnderBankAccountsSection() throws InterruptedException {
        new MiniModulePage(). VerifySubmitATicketForMFUnderBankAccountsSection();
        basePage.AndroidBack();

    }

    @And("User click on Refer and Earn section")
    public void userClickOnReferAndEarnSection() throws InterruptedException {
        new MiniModulePage(). ClickOnReferAndEarnSection();
    }

    @And("User should see the Refer page along with sharing options")
    public void userShouldSeeTheReferPageAlongWithSharingOptions() throws InterruptedException {
        new MiniModulePage(). VerifyReferNowPage();
        basePage.AndroidBack();
    }

    @Then("User should be able to see the minimodule page")
    public void userShouldBeAbleToSeeTheMinimodulePage() throws InterruptedException {
        new MiniModulePage(). ValidateMinimodulePage();

    }


    @And("the user navigates to the About Us section")
    public void theUserNavigatesToTheAboutUsSection() throws InterruptedException {
        new MiniModulePage(). NavigateToAboutUsSection();
    }

    @Then("the user should see the {string} page along with the Legal and CSR sections")
    public void theUserShouldSeeThePageAlongWithTheLegalAndCSRSections(String arg0) throws InterruptedException {
        new MiniModulePage(). ValidateAboutUsPage();
    }

    @When("the user clicks the Know More button")
    public void theUserClicksTheKnowMoreButton() throws InterruptedException {
        new MiniModulePage(). ClickOnKnowMoreBtn();
    }

    @Then("the user should be redirected to the About Appreciate page")
    public void theUserShouldBeRedirectedToTheAboutAppreciatePage() throws InterruptedException {
        new MiniModulePage(). ValidateAboutAppreciatePage();
    }

    @And("the user clicks on the Legal section")
    public void theUserClicksOnTheLegalSection() throws InterruptedException {
        new MiniModulePage(). ClickOnLegalSection();
    }

    @Then("the user should see the Legal page details")
    public void theUserShouldSeeTheLegalPageDetails() throws InterruptedException {
        new MiniModulePage(). VerifyLegalPage();
        basePage.AndroidBack();
    }

    @And("the user clicks on the CSR section")
    public void theUserClicksOnTheCSRSection() throws InterruptedException {
        new MiniModulePage(). ClickOnCSRSection();
    }

    @Then("the user should see the CSR Mission page along with the Suggestions & Feedback functionality")
    public void theUserShouldSeeTheCSRMissionPageAlongWithTheSuggestionsFeedbackFunctionality() throws InterruptedException {
        new MiniModulePage(). ClickOnCSRSection();
    }

    @And("the user navigates to the Other Services section")
    public void theUserNavigatesToTheOtherServicesSection() throws InterruptedException {
        new MiniModulePage(). ClickOnOtherServices();
    }

    @And("the user clicks on the View All Accounts CTA")
    public void theUserClicksOnTheViewAllAccountsCTA() throws InterruptedException {
        new MiniModulePage(). ClickOnViewAllAccountsCTA();
    }

    @Then("the user should be redirected to the Accounts page which displays both US Stocks and Mutual Funds sections")
    public void theUserShouldBeRedirectedToTheAccountsPageWhichDisplaysBothUSStocksAndMutualFundsSections() throws InterruptedException {
        new MiniModulePage(). ValidateAccountsPage();
    }

    @When("the user clicks the Submit a Ticket button under the US Stocks section")
    public void theUserClicksTheSubmitATicketButtonUnderTheUSStocksSection() throws InterruptedException {
        new MiniModulePage(). ClickOnSubmitATicketForUSStocks();
    }

    @Then("the user should be able to submit a ticket for the US Stocks section")
    public void theUserShouldBeAbleToSubmitATicketForTheUSStocksSection() throws InterruptedException {
        new MiniModulePage(). ValidateSubmitATicketFunctionalityForUSStocks();
    }

    @When("the user clicks on the Mutual Funds section")
    public void theUserClicksOnTheMutualFundsSection() throws InterruptedException {
        new MiniModulePage(). ClickOnMFUnderBankAccounts();
    }

    @Then("the user should see the added accounts for Mutual Funds")
    public void theUserShouldSeeTheAddedAccountsForMutualFunds() throws InterruptedException {
        new MiniModulePage(). ValidateAddedAccountsForMF();
    }

    @When("the user clicks the Submit a Ticket button under the Mutual Funds section")
    public void theUserClicksTheSubmitATicketButtonUnderTheMutualFundsSection() throws InterruptedException {
        new MiniModulePage(). ClickOnSubmitATicketForMutualFunds();
    }

    @Then("the user should be able to submit a ticket under the Mutual Funds section")
    public void theUserShouldBeAbleToSubmitATicketUnderTheMutualFundsSection() throws InterruptedException {
        new MiniModulePage(). ValidateSubmitAicketFunctionalityForMF();
        new MiniModulePage(). ClickOnAccountsPageBackArrow();
        basePage.Logout();
    }

    @Then("the User should see all section under support page")
    public void theUserShouldSeeAllSectionUnderSupportPage() throws InterruptedException {
        new MiniModulePage(). ValidateAllSectionUnderSupportPage();
    }

    @And("User click on Recent Tickets")
    public void userClickOnRecentTickets() throws InterruptedException {
        new MiniModulePage(). ClickOnRecentTickets();
    }

    @Then("User should see all the raised support ticket under Support Tickets Page")
    public void userShouldSeeAllTheRaisedSupportTicketUnderSupportTicketsPage() throws InterruptedException {
        new MiniModulePage(). ValidateRaisedSupportTickets();
        new MiniModulePage(). ClickOnSupportPageBackArrow();
        new MiniModulePage().ClickTicket();
        new MiniModulePage().ValidateSubmitATicketErrorMsg();
        basePage.AndroidBack();
        basePage.Logout();

    }

    @And("the User click on setting icon")
    public void theUserClickOnSettingIcon() {
        new MiniModulePage(). ClickOnSettingIcon();
    }

    @Then("the User should see all section under settings tab")
    public void theUserShouldSeeAllSectionUnderSettingsTab() {
        new MiniModulePage(). ValidateAllSectionUnderSettings();
    }
}
