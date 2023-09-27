package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.SignInPage;
import com.appreciatewealth.pages.SignUpPage;
import com.appreciatewealth.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class SignUpSteps {
    SignInPage loginPage;

    public SignUpSteps(){

    }
    TestUtils utils = new TestUtils();

    SignUpPage signUp = new SignUpPage();

    @Given("user has launched the the app")
    public void user_launch_the_appreciate_application() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test");
        signUp.verifyUserIsOnChooseLanguageScreen();
        utils.log().info("user launches the Appreciate application");
        //signUp.splashScreenVisibleToUser();
    }

    @Then("the user should navigate to  Choose your language page")
    public void the_user_should_navigate_to_choose_your_language_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        utils.log().info("the user should navigate to  Choose your language page");
        //new SignUpPage().verifyUserIsOnChooseLanguageScreen();
    }

}