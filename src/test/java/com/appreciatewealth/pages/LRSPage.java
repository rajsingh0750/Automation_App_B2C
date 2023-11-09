package com.appreciatewealth.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LRSPage extends BasePage {

    @AndroidFindBy(xpath = "//*[@text='add funds']")
    WebElement AddFundsButton;

    @AndroidFindBy(xpath = "//*[@text='Add funds']")
    WebElement AddMoneytoBuyingPower;

    @AndroidFindBy(xpath = "//*[@text='continue']")
    WebElement ContinueButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    WebElement EnterDepositAmount;

    @AndroidFindBy (xpath = "//*[@text='upload bank statement']")
    WebElement UploadStatementButton;

    @AndroidFindBy(xpath="//*[@text='HDFC']")
    WebElement SelectHDFC;

    @AndroidFindBy(xpath="//*[@text='select and next']")
    WebElement SelectandContinue;
    @AndroidFindBy(xpath="//*[@text='upload manually']")
    WebElement uploadManually;

    @AndroidFindBy(xpath = "//*[@text='I Confirm']")
    WebElement IconfirmButton;

    @AndroidFindBy(xpath = "//*[contains(@text,'You have successfully uploaded')]")
    WebElement SuccessStatementUploadMsg;
    @AndroidFindBy(xpath = "//*[@text='UPLOAD YOUR BANK E-STATEMENTS']")
    WebElement UploadEstatementButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    WebElement SelectStatementFromDrive;

    @AndroidFindBy(xpath = "//*[@text='Or click here to finish']")
    WebElement ClickonFinish;

    @AndroidFindBy(xpath = "//*[@text='Statement Name Mismatch']")
    WebElement InvalidBankStatementmsg;

    @AndroidFindBy(xpath = "//*[@text='Insufficient YES Bank balance']")
    WebElement InSufficientBalanceMsg;

    @AndroidFindBy(xpath = "//*[@text='Please enter amount to proceed']")
    WebElement BlankAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView")
    WebElement BankStatement12plusMonths;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    WebElement EnterBankStatementPasscode;

    @AndroidFindBy(xpath = "//*[@text='Submit']")
    WebElement SubmitClick;

    @AndroidFindBy(xpath="//*[@text='Axis']")
    WebElement SelectAxis;

    SignInPage signInPage;

    public LRSPage() {
        this.signInPage = new SignInPage();
    }


    public void ClickAddFunds() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        AddFundsButton.click();


    }
    public void AddMoneytoBuyingPower() throws InterruptedException {
        Thread.sleep(2000);
        AddMoneytoBuyingPower.click();
    }
    public void EnterDepositAmount(String amount) throws InterruptedException {
        EnterDepositAmount.click();
        Thread.sleep(3000);
        EnterDepositAmount.sendKeys(amount);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void ClickonContinue(){
        ContinueButton.click();
    }

    public void ClickonUploadStatement(){
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"transfer from YES a/c to buying power\").instance(0))"));
        UploadStatementButton.click();
    }

    public void SelectBankAccount() throws InterruptedException {
        Thread.sleep(3000);
        SelectHDFC.click();
        SelectandContinue.click();

    }

    public void UploadBankStatement() throws InterruptedException {
        Thread.sleep(3000);
        uploadManually.click();
        Thread.sleep(5000);
        IconfirmButton.click();
        Thread.sleep(3000);
        UploadEstatementButton.click();
        Thread.sleep(3000);
        SelectStatementFromDrive.click();
        Thread.sleep(10000);
        ClickonFinish.click();

    }

    public void ValidateInvalidBankStatementMsg(String msg) throws InterruptedException {
        Thread.sleep(20000);
        String ActualMsg =  InvalidBankStatementmsg.getText();
        Assert.assertEquals(ActualMsg,msg);

    }

    public void CheckInsufficientAmountMessage(){
        InSufficientBalanceMsg.isDisplayed();

    }

    public void CheckBlankAmountMessage(){
        BlankAmount.isDisplayed();
    }

    public void SelectAxisBank() throws InterruptedException {
        Thread.sleep(3000);
        SelectAxis.click();
        SelectandContinue.click();
    }

    public void SelectStatementPlus12Months() throws InterruptedException {
        Thread.sleep(3000);
        uploadManually.click();
        Thread.sleep(5000);
        IconfirmButton.click();
        Thread.sleep(3000);
        UploadEstatementButton.click();
        Thread.sleep(5000);
        BankStatement12plusMonths.click();
        Thread.sleep(10000);
        EnterBankStatementPasscode.sendKeys("SHUB894852019");
        Thread.sleep(20000);
        SubmitClick.click();
        Thread.sleep(20000);
        SuccessStatementUploadMsg.isDisplayed();
        ClickonFinish.click();
        Thread.sleep(20000);

    }












}
