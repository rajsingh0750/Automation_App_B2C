package com.appreciatewealth.pages;

import com.appreciatewealth.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignUpPage extends BasePage {
    // private final LoginPage loginPage;
    TestUtils utils = new TestUtils();
    SignInPage signInPage;
    public SignUpPage(){
        this.signInPage = new SignInPage();

    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private WebElement chooseLanguageElement;

    String expectedText = "Choose language";

    public void verifyUserIsOnChooseLanguageScreen() throws InterruptedException {
        Thread.sleep(5000);
        //chooseLanguageElement.click();


        String actualText = chooseLanguageElement.getText();
        //assertThat(actualText).isEqualTo(expectedText);  // using Google Truth Assertions to valdidate that actual text on the screen is equal to the expected text.
        Assert.assertEquals(actualText, expectedText);
        signInPage.ClickContinue();


        //utils.log().info("Error caught from SignUpPage: verifyUserIsOnChooseLanguageScreen" + ex); // Write the exception to the log file, with details as to which class: which function is throwing the exception

    }
}