package com.appreciatewealth.pages;

import com.appreciatewealth.utils.ConfigLoader;
import com.appreciatewealth.utils.TestUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import java.io.IOException;

public class SignInPage extends BasePage {

    TestUtils utils = new TestUtils();

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")

    private WebElement continueButton;



    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    //@iOSXCUITFindBy (id = "test-LOGIN")
    private WebElement signupButtom;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
    private  WebElement GetStartedButton;



    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement SignIn;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private WebElement SendOTP;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private WebElement confirmOTP;

    @AndroidFindBy (id = "com.appreciatewealth.android.uat:id/ivPasscode1")
    private WebElement Passcode1;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")
    private WebElement Passcode2;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[3]")
    private WebElement Passcode3;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[4]")
    private WebElement Passcode4;
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement TextBox;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement Password;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement UserName;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElement ValidateFirstPage;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement EnterOTP;
    //android.widget.EditText

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView")
    private WebElement NumPad1;

    @AndroidFindBy (xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")
    private WebElement SigninErrorMessage;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private WebElement  SigninButton;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement PasswordField;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[4]")
    private WebElement PhoneNumberErrorMsg;


    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement PasswordErrorMsg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[2]")
    private WebElement ForgotPasswordButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement EnterPasswordResetScreen;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.EditText")
    private WebElement ReEnterPasswordResetScreen;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private WebElement ConfirmNewPasswordButton;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement ValidatePasswordResetScreen;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.Button")
    private WebElement SetPasswordButton;

    @AndroidFindBy(xpath = "//*[@text='Invalid Username']")
    private WebElement InvalidUserNameMessage;


    @AndroidFindBy (xpath = "//*[@text='Email']")
    private WebElement TapEmail;

    @AndroidFindBy (xpath = "//*[@text='okay']")
    private WebElement okayButton;
    public SignInPage(){
        super();
    }

    public void ClickContinue() throws InterruptedException {
        //driver.executeScript("yourJavaScriptFunctionToClearCache()");
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(6000);
        continueButton.click();
    }

    public void ClickonGetStarted() throws InterruptedException {
        Thread.sleep(6000);
        GetStartedButton.click();
    }



    public void ValidateSigninPage() throws InterruptedException {
        Thread.sleep(5000);
        Boolean IsPresent = ValidateFirstPage.isDisplayed();
        Assert.assertEquals(IsPresent,Boolean.TRUE);
    }


    public void EnterPhonenumber(String number) throws InterruptedException {
        // page.waitForVisibility(TextBox,Duration.ofSeconds(5));

        //wait.until(waitForVisibility(TextBox,Duration.ofSeconds(5));
        //WebDriverWait wait = new WebDriverWait()
        Thread.sleep(5000);
        TextBox.sendKeys(number);

    }

    public void ClickonSignin() throws InterruptedException {

        Thread.sleep(5000);
        SigninButton.click();

    }

    public void EnterPassword(String password) throws InterruptedException {
        Thread.sleep(3000);
        PasswordField.sendKeys(password);
    }

    public void EnterOTP(String OTP) throws InterruptedException {
        Thread.sleep(5000);
        EnterOTP.sendKeys(OTP);
    }

    public void ClickonSendOTP() throws InterruptedException {

        Thread.sleep(5000);
        confirmOTP.click();


    }

    public void Signin() throws InterruptedException, IOException {
        Thread.sleep(5000);
        TapEmail.click();
        //TextBox.sendKeys("faureretruba-9695@yopmail.com");
        TextBox.sendKeys(ConfigLoader.getInstance().getProperty("StageEmail"));
        SendOTP.click();
        // Thread.sleep(3000);
        //Password.sendKeys("Test@123");
        //SendOTP.click();
        Thread.sleep(3000);

        EnterOTP.sendKeys("904123");
        confirmOTP.click();
        Thread.sleep(5000);
        //AllowOTPfromClipboard();
        boolean b = ((AndroidDriver) driver).isKeyboardShown();
        System.out.println("Keyboard Shown "+b);
        Thread.sleep(8000);

        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

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
     /*
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BUTTON_1));
        Thread.sleep(5000);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BUTTON_9));
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BUTTON_8));
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BUTTON_8));
      */ //driver.getCapabilities();

      /*  Thread.sleep(4000);
       String Actualname = UserName.getText();
       Assert.assertEquals(Actualname,"Hi sanjeev");*/


    }


    public void DynamicSignIn(String email) throws InterruptedException {
        Thread.sleep(5000);
        TapEmail.click();
        TextBox.sendKeys(email);
        SendOTP.click();
        // Thread.sleep(3000);
        //Password.sendKeys(password);
        // SendOTP.click();
        Thread.sleep(3000);
        EnterOTP.sendKeys("904123");
        confirmOTP.click();
        Thread.sleep(8000);
        //AllowOTPfromClipboard();
        boolean b = ((AndroidDriver) driver).isKeyboardShown();
        System.out.println("Keyboard Shown "+b);
        Thread.sleep(6000);

        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

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

    public void ValidateErrorMessage(String message){
        String ActualMessage  = SigninErrorMessage.getText();
        Assert.assertEquals(message,ActualMessage);

    }

    public void ValidatePhoneErrorMessage(String errmessage){
        String ActualMessage  = PhoneNumberErrorMsg.getText();
        Assert.assertEquals(errmessage,ActualMessage);

    }

    public void ValidatePasswordErrorMessage(String Passworderrmessage){
        String ActualMessage  = PasswordErrorMsg.getText();
        Assert.assertEquals(Passworderrmessage,ActualMessage);

    }


    public void AllowOTPfromClipboard() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(AppiumBy.xpath("//*[@text='Allow']")).click();





    }

    public void EnterPasscode() throws InterruptedException {
        Thread.sleep(8000);

        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

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

    public void OTPDynamicSignIn(String email) throws InterruptedException, IOException {
        Thread.sleep(8000);
        TapEmail.click();
        TextBox.sendKeys(email);
        SendOTP.click();
        // Thread.sleep(3000);
        // Password.sendKeys(password);
        // SendOTP.click();
        Thread.sleep(10000);
        AllowOTPfromClipboard();
        // String GetOTP = basePage.CopyOTPFromMessage();
        // EnterOTP.sendKeys(GetOTP);
        confirmOTP.click();
        Thread.sleep(10000);
        //AllowOTPfromClipboard();
        boolean b = ((AndroidDriver) driver).isKeyboardShown();
        System.out.println("Keyboard Shown " + b);
        //Thread.sleep(6000);

        WebElement element = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView"));

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

    public void EnterPhonenumberInResetScreen(){
        TextBox.sendKeys("8310279647");
    }
    public void ClickonForgotPassword() throws InterruptedException {
        Thread.sleep(2000);
        ForgotPasswordButton.click();

    }

    public void EnterNewPassword() throws InterruptedException {
        Thread.sleep(2000);
        EnterPasswordResetScreen.sendKeys("Test@1234567");



    }
    public void ClickonSetupPassword() throws InterruptedException {
        Thread.sleep(3000);
        SetPasswordButton.click();
    }

    public void ConfirmNewPassword() throws InterruptedException {
        Thread.sleep(2000);
        ReEnterPasswordResetScreen.sendKeys("Test@1234567");
    }

    public void ClickonConfirmPassword() throws InterruptedException {
        Thread.sleep(2000);
        ConfirmNewPasswordButton.click();

    }

    public void ValidatePasswordisDone(String SuccessMessage) throws InterruptedException {
        Thread.sleep(2000);
        String ActualMsg = ValidatePasswordResetScreen.getText();
        Assert.assertEquals(ActualMsg,SuccessMessage);

    }

    public void InvalidUsernameMessage() throws InterruptedException {
        Thread.sleep(2000);
        InvalidUserNameMessage.isDisplayed();
        TextBox.clear();

    }

    public void ClickOK() throws InterruptedException {
        Thread.sleep(2000);
        okayButton.click();
    }

}
