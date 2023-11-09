package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.*;
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
    public void the_user_is_on_mini_module_page() throws InterruptedException, IOException {
     signInPage.DynamicSignIn("varshatmysuru1992@gmail.com");
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
        new MiniModulePage().OtherClose();
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
        new MiniModulePage().LegalClose();
    }

    @And("User Click on Appreciate Broking")
    public void userClickOnAppreciateBroking() throws InterruptedException {
        new MiniModulePage().BrokingDetails();
    }

    @And("User see Appreciate Broking Information")
    public void userSeeAppreciateBrokingInformation() throws InterruptedException {
        new MiniModulePage().LegalBroking();
        new MiniModulePage().LegalClose();
    }

    @And("User Clicks on Registration")
    public void userClicksOnRegistration() throws InterruptedException {
        new MiniModulePage().RegisterDetails();
        new MiniModulePage().RegisterPage();

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
        new MiniModulePage().LegalClose();
        basePage.Logout();
    }

    @And("User Clicks on Drive Wealth")
    public void userClicksOnDriveWealth() throws InterruptedException {
        new MiniModulePage().DriveClick();

        
    }

    @And("User see Terms and Disclosure")
    public void userSeeTermsAndDisclosure() throws InterruptedException {
        new MiniModulePage().TermsClick();
        new MiniModulePage().LegalClose();
    }

    @And("User Clicks on Privacy Policy")
    public void userClicksOnPrivacyPolicy() throws InterruptedException {
        new MiniModulePage().PrivacyClick();
        new MiniModulePage().LegalClose();
        
    }

    @And("User Clicks on W-BEN")
    public void userClicksOnWBEN() throws InterruptedException {
        new MiniModulePage().W8BENClick();
        new MiniModulePage().LegalClose();
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
        new MiniModulePage().LegalClose();
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
        new MiniModulePage().LegalClose();
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
        new MiniModulePage().ScrollCSRClose();
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
        new MiniModulePage().ClickBack();
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
        new MiniModulePage().ClickChangeLanguage();
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
        new MiniModulePage().ClosePage();
        basePage.Logout();
    }

    @Given("the user is on Goals Dashboard for latest transaction")
    public void theUserIsOnGoalsDashboardForLatestTransaction() throws InterruptedException, IOException {
        signInPage.DynamicSignIn("varshatmysuru1992@gmail.com");
        dashboardPage.ClickOnGoToDashboard();
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
        new GoalsPage().selectyearinlist(" 2025 ");
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

    }

    @Then("User should see all the latest transaction in the list")
    public void userShouldSeeAllTheLatestTransactionInTheList() throws InterruptedException {
        new MiniModulePage().MiniTransClose();
        basePage.Logout();
    }


    @And("User is on Home dashboard")
    public void userIsOnHomeDashboard() throws InterruptedException {
        new MiniModulePage().DashboardOption();

    }

    @And("User Clicks on Goals dashboard")
    public void userClicksOnGoalsDashboard() throws IOException, InterruptedException {
        new GoalsPage().SwitchtoGoal();

    }

    @And("User Clicks on Trade dashboard")
    public void userClicksOnTradeDashboard() throws InterruptedException {
        new MiniModulePage().TradeOption();

    }

    @And("User Clicks on Change dashboard")
    public void userClicksOnChangeDashboard() throws InterruptedException {
        new MiniModulePage().ChangeOption();

    }

    @And("User should see Hindi language in all dashboards")
    public void userShouldSeeHindiLanguageInAllDashboards() throws InterruptedException {
        new BasePage().ClickProfileSettings();
        new MiniModulePage().ClickChangeLanguage();

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
        new MiniModulePage().OtherClose();
        basePage.Logout();
    }

    @Given("User is on Logged in Screen")
    public void userIsLoggedInScreen() {
        System.out.println("User is on Logged in Screen");
    }

    @When("User enters {string}")
    public void userEntersAnd(String email) throws InterruptedException {
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
        new MiniModulePage().ClickOnProfileFromDashboard();


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
        //basePage.AndroidBack();
        basePage.Logout();

    }

    @Given("the User is on MiniModule page for passcode")
    public void theUserIsOnMiniModulePageForPasscode() throws InterruptedException, IOException {
        //signInPage.DynamicSignIn("varsha.thandav@ppreciate.com");
        signInPage.OTPDynamicSignIn("varsha.thandav@ppreciate.com");
        new MiniModulePage().NavigateToMiniModule();


    }

    @And("the User Clicks on Settings & Preferences")
    public void theUserClicksOnSettingsPreferences() throws InterruptedException {
        new MiniModulePage().ClickSettings();


    }

    @And("the User Clicks on Change Passcode")
    public void theUserClicksOnChangePasscode() throws InterruptedException {
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
    public void theUserConfirmTheNewPasscode() throws InterruptedException, IOException {
        new MiniModulePage().SetPasscode();
        signInPage.OTPDynamicSignIn("varsha.thandav@ppreciate.com");
        new MiniModulePage().NavigateToMiniModule();
        basePage.Logout();

    }


}
