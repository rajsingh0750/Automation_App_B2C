package com.appreciatewealth.stepdefinitions;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;

public class LanguageChangeSteps extends BasePage {
    
    private SignInPage signInPage;
    
    public LanguageChangeSteps() {
        this.signInPage = new SignInPage();
    }
    
    @And("User click on sign out CTA")
    public void userClickOnSignOutCTA() throws InterruptedException {
        ClickSignOut(driver);
    }
    
    @And("User wait for resend otp")
    public void userWaitForResendOtp() throws InterruptedException {
        signInPage.HindiDynamicSignIn("varshatmysuru1992@gmail.com");
    }
} 