package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.DashboardPage;
import com.appreciatewealth.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SignInStepDef {
    DashboardPage dashboardPage = new DashboardPage();
    BasePage basePage = new BasePage();

    @Given("App is launched")
    public void app_is_launched() throws IOException, InterruptedException {

        System.out.println("App is Launched");
    }
    @When("User clicks continue button")
    public void user_clicks_continue_button() throws InterruptedException {
        Thread.sleep(3000);
        new SignInPage().ClickContinue();
    }
    @When("User clicks on get started button")
    public void user_clicks_on_get_started_button() throws InterruptedException {
        new SignInPage().ClickonGetStarted();
    }
    @Then("User should be on Sign in page")
    public void user_should_be_on_sign_in_page() throws InterruptedException {
        new SignInPage().ValidateSigninPage();

    }


    @Then("User clicks on SignIn Button")
    public void user_clicks_on_sign_in_button() throws InterruptedException, IOException {
     /*   Thread.sleep(5000);
        new SignInPage().EnterPhonenumber("9326459356");
        Thread.sleep(5000);
        new SignInPage().Signin();
        new SignInPage().EnterPassword("Test@123");*/
        new SignInPage().Signin();
        dashboardPage.ClickOnGoToDashboard();
        Thread.sleep(3000);
        basePage.ClickProfileSettings();
        basePage.Logout();
    }

//Start of Scenario: Sign in with invalid phone-number

    @Given("User is on enter phone number screen")
    public void user_is_on_enter_phone_number_screen() throws InterruptedException {
        new SignInPage().ValidateSigninPage();
    }

    @Given("User enters invalid number")
    public void user_enters_invalid_number() throws InterruptedException {
        new SignInPage().EnterPhonenumber("9538256789");
        new SignInPage().ClickonSignin();


    }

    @Given("User enters valid password")
    public void user_enters_valid_password() throws InterruptedException {
        Thread.sleep(3000);
        new SignInPage().EnterPassword("Test@123");
        new SignInPage().ClickonSendOTP();
    }

    @Then("User should see the popup message like Invalid Username")
    public void user_should_see_the_popup() throws InterruptedException {
        new SignInPage().InvalidUsernameMessage();


    }
    //End of Scenario: Sign in with invalid phone-number

    //Start of Scenario: Sign in with invalid password
    @Given("User enters valid number")
    public void user_enters_valid_number() throws InterruptedException {
        new SignInPage().EnterPhonenumber("9538256787");
        new SignInPage().ClickonSignin();
    }

    @Given("User enters invalid password")
    public void user_enters_invalid_password() throws InterruptedException {
        Thread.sleep(3000);
        new SignInPage().EnterPassword("Test@1234");
        new SignInPage().ClickonSendOTP();
    }
//End of Scenario: Sign in with invalid password

    // Start of  Scenario: Sign in with invalid OTP
    @Given("User enters invalid OTP")
    public void user_enters_invalid_otp() throws InterruptedException {
        new SignInPage().EnterOTP("123453");
        new SignInPage().ClickonSendOTP();
    }
    @Then("User should see the popup message {string}")
    public void user_should_see_the_popup_message(String string) throws InterruptedException {
        new SignInPage().ValidateErrorMessage("Incorrect OTP entered, please try again.");
        basePage.AndroidBack();
        Thread.sleep(7000);
        new SignInPage().ClickOK();

    }
    // End of  Scenario: Sign in with invalid OTP

    // Start of Scenario: Sign in without passing phone number

    @Given("User clicks on Signin button")
    public void user_clicks_on_sign_In_button() throws InterruptedException {
        new SignInPage().ClickonSignin();
    }

    @Then("User should see the error message {string}")
    public void user_should_see_the_error_message(String string) {
        new SignInPage().ValidatePhoneErrorMessage("Please enter valid mobile number");
    }
    //End of Scenario: Sign in without passing phone number

    //Start of Scenario: Sign in without passing password
    @Given("User clicks on send me an OTP button")
    public void user_clicks_on_send_me_an_otp_button() {
        new SignInPage().ValidatePasswordErrorMessage("Please enter password");
    }
    //End of Scenario: Sign in without passing password

    // Start of Scenario: Verify if user is able to reset the password
    @Given("User is on the forgot password screen")
    public void user_is_on_the_forgot_password_screen() throws InterruptedException {
        new SignInPage().EnterPhonenumber("9538256787");
        new SignInPage().ClickonSignin();

    }

    @Given("User click on Forgot password link")
    public void user_click_on_forgot_password_link() throws InterruptedException {
        new SignInPage().ClickonForgotPassword();
    }

    @Given("User enters valid OTP and confirms the OTP")
    public void user_enters_valid_otp_and_confirms_the_otp() throws InterruptedException {
        Thread.sleep(3000);
        new SignInPage().AllowOTPfromClipboard();

    }

    @Given("User enters valid passcode")
    public void user_enters_valid_passcode() throws InterruptedException {
        Thread.sleep(3000);
        new SignInPage().EnterPasscode();
    }

    @Given("User enters new password")
    public void user_enters_new_password() {
        new SignInPage().EnterPhonenumberInResetScreen();
    }

    @Given("User confirms the new password")
    public void user_confirms_the_new_password() throws InterruptedException {
        new SignInPage().ClickonSetupPassword();
    }

    @Then("user should be on New Password set Screen")
    public void user_should_be_on_NewPasswordSetScreen() throws InterruptedException {
        Thread.sleep(4000);
        new SignInPage().ValidatePasswordisDone("New password set!");

    }



    // End of Scenario: Verify if user is able to reset the password
}

