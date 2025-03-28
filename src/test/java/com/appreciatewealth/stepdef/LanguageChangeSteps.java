package com.appreciatewealth.stepdef;

import com.appreciatewealth.pages.BasePage;
import com.appreciatewealth.pages.LanguageChangePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LanguageChangeSteps extends BasePage {
    BasePage basePage = new BasePage();

    @Given("User select change language option")
    public void user_select_change_language_option() throws InterruptedException {
       new  LanguageChangePage().SelectChangeLanguage();
    }

    @And("User select hindi section")
    public void userSelectHindiSection() throws InterruptedException {
        new  LanguageChangePage().SelectHindiLanguage();
    }

    @And("User click on continue CTA")
    public void userClickOnContinueCTA() throws InterruptedException {
        new  LanguageChangePage().ClickOnContinueBtn();
    }


    @And("User will enter the passcode")
    public void userWillEnterThePasscode() throws InterruptedException {
        new  LanguageChangePage().EnterActPasscode();
    }

    @And("User will click on profile at home dashboard")
    public void userWillClickOnProfileAtHomeDashboard() throws InterruptedException {
        basePage.ClickProfileSettings();
    }

    @Then("User will verify us wallet username refer your friend etc in hindi")
    public void userWillVerifyUsWalletUsernameReferYourFriendEtcInHindi() throws InterruptedException {
        new  LanguageChangePage().VerifyDetailsInHindi();
        new  LanguageChangePage().VerifyYesBankBalanceInHindi();
        basePage.AndroidBack();
        basePage.HindiLogout();
    }

    @And("User select yes bank balance check section")
    public void userSelectYesBankBalanceCheckSection() throws InterruptedException {
        new  LanguageChangePage().SelectYesBankBalanceInHindi();
    }

    @Then("User will verify all the details under yes bank")
    public void userWillVerifyAllTheDetailsUnderYesBank() throws InterruptedException {
        new  LanguageChangePage().VerifyAllTheDetailsUnderYesBankInHindi();
    }

    @And("User click on khate ka vivaran")
    public void userClickOnKhateKaVivaran() throws InterruptedException {
        new  LanguageChangePage().ClickOnKhateKaVivaran();
    }

    @And("User click on add funds")
    public void userClickOnAddFunds() throws InterruptedException {
        new  LanguageChangePage().ClickOnAddFunds();
    }

    @And("User click on reset mpin")
    public void userClickOnResetMpin() throws InterruptedException {
        new  LanguageChangePage().ClickOnResetMpin();
    }

    @And("User click on lenden")
    public void userClickOnLenden() throws InterruptedException {
        new  LanguageChangePage().ClickOnLenden();
    }

    @Then("User will verify details of khate ka vivaran page")
    public void userWillVerifyDetailsOfKhateKaVivaranPage() throws InterruptedException {
        new  LanguageChangePage().VerifyKhateKaVivaranPage();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.HindiLogout();

    }

    @Then("User should see the add funds page in hindi")
    public void userShouldSeeTheAddFundsPageInHindi() throws InterruptedException {
        new  LanguageChangePage().VerifyAddFundsPageInHindi();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.HindiLogout();
    }

    @And("User will see reset mpin description")
    public void userWillSeeResetMpinDescription() throws InterruptedException {
        new  LanguageChangePage().VerifyResetMpinDescription();
        basePage.AndroidBack();
        basePage.HindiLogout();
    }

    @Then("User will see len den page")
    public void userWillSeeLenDenPage() throws InterruptedException {
        new  LanguageChangePage().VerifyLendenPage();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.HindiLogout();
    }

    @And("User click on US wallet")
    public void userClickOnUSWallet() throws InterruptedException {
        new  LanguageChangePage().ClickOnUSWallet();
    }

    @Then("User will verify all the details of US wallet in hindi")
    public void userWillVerifyAllTheDetailsOfUSWalletInHindi() throws InterruptedException {
        new  LanguageChangePage().VerifyAllDetailsOfUSWallet();
        new  LanguageChangePage().VerifyKhateKaVivaranUnderAmerikiBatua();
        basePage.AndroidBack();
        new  LanguageChangePage().VerifyAddFundsUnderAmerikiBatua();
        basePage.AndroidBack();
        new  LanguageChangePage().VerifyWithdrawalUnderAmerikiBatua();
        basePage.AndroidBack();
        basePage.AndroidBack();
        basePage.HindiLogout();


    }
}
