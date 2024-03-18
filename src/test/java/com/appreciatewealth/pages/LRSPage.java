package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import java.io.IOException;

public class LRSPage extends BasePage {
    BasePage basePage = new BasePage();

    @AndroidFindBy(xpath = "//*[@text='add funds']")
    WebElement AddFundsButton;

    @AndroidFindBy(xpath = "//*[@text='go to dashboard']")
    private WebElement clickonViewDashboard;

    @AndroidFindBy(xpath = "//*[@text='Transaction Submitted Successfully!']")
    WebElement CheckTransactionStatusMsg;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView")
    WebElement OTP1Click;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    WebElement OTP1Enter;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
    WebElement EnterNetOTP;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
    WebElement CheckBox1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
    WebElement CheckBox2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
    WebElement CheckBox3;

    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
    WebElement CheckBox4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[9]/android.view.View/android.view.View/android.view.View/android.widget.CheckBox")
    WebElement CheckBox5;

    @AndroidFindBy(xpath = "//*[@text='Ok']")
    WebElement ClickOk;

    @AndroidFindBy(xpath = "//*[@text='AUTHORIZE']")
    WebElement ClickAuthorize;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView[1]")
    WebElement LoginCheckBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText")
    WebElement LoginIdEnter;

    @AndroidFindBy(xpath = "//*[contains(@text,'login')]")
    WebElement LoginClick;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
    WebElement EnterPassword;

    @AndroidFindBy(xpath = "//*[contains(@text,'Password')]")
    WebElement PasswordClick;

    @AndroidFindBy(xpath = "//*[@text='Next']")
    WebElement Next;

    @AndroidFindBy(id = "btnTransfer")
    WebElement TransferFromYesBank;

    @AndroidFindBy(xpath = "//*[@text='add money to buying power']")
    WebElement AddMoneytoBuyingPower;

    @AndroidFindBy(id = "btnPayNow")
    WebElement TransferNow;

    @AndroidFindBy(xpath = "//*[@text='NEXT']")
    WebElement NEXTButton;
    @AndroidFindBy(xpath = "//*[contains(@text,'PAN')]")
    WebElement PAN;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    WebElement EnterPan;
    @AndroidFindBy(xpath = "//*[contains(@text,'Customer ID')]")
    WebElement CustomerID;

    @AndroidFindBy  (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    WebElement EnterCustomerID;
    @AndroidFindBy(id = "one_btn")
    WebElement EnterDepositAmount;

    @AndroidFindBy (id = "btnTransfer")
    WebElement UploadStatementButton;

    @AndroidFindBy(xpath="//*[@text='HDFC']")
    WebElement SelectHDFC;

    @AndroidFindBy(xpath="//*[@text='select and next']")
    WebElement SelectandContinue;
    @AndroidFindBy(xpath="//*[@text='upload manually']")
    WebElement uploadManually;

    @AndroidFindBy(xpath = "//*[@text='I Confirm']")
    WebElement IconfirmButton;

    @AndroidFindBy(xpath = "//*[@text='Confirm']")
    WebElement Confirm;

    @AndroidFindBy(xpath = "//*[@text='Proceed']")
    WebElement Proceed;
    @AndroidFindBy(xpath = "//*[contains(@text,'You have successfully uploaded')]")
    WebElement SuccessStatementUploadMsg;
    @AndroidFindBy(xpath = "//*[@text='UPLOAD YOUR BANK E-STATEMENTS']")
    WebElement UploadEstatementButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/android.widget.LinearLayout[8]")
    WebElement SelectStatementFromDrive;

    @AndroidFindBy(xpath = "//*[@text='Or click here to finish']")
    WebElement ClickonFinish;

    @AndroidFindBy(xpath = "//*[@text='Statement Name Mismatch']")
    WebElement InvalidBankStatementmsg;

    @AndroidFindBy(xpath = "//*[@text='Insufficient YES Bank balance']")
    WebElement InSufficientBalanceMsg;

    @AndroidFindBy(xpath = "//*[@text='Please enter amount to proceed']")
    WebElement BlankAmount;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.ScrollView/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.GridView/androidx.cardview.widget.CardView[10]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]")
    WebElement BankStatement12plusMonths;

    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    WebElement EnterBankStatementPasscode;

    @AndroidFindBy(xpath = "//*[@text='Submit']")
    WebElement SubmitClick;

    @AndroidFindBy(xpath="//*[@text='Axis']")
    WebElement SelectAxis;

    @AndroidFindBy(xpath="//*[@text='view details']")
    WebElement ViewDetails;

    @AndroidFindBy(id ="txvOrderHistory")
    WebElement MoneyTransactionDetails;

    @AndroidFindBy(id ="tvTransferAmountValue")
    WebElement TransferAmount;

    @AndroidFindBy(id ="tvDepositAmountValue")
    WebElement DepositAmount;

    @AndroidFindBy(id = "cvBuyingPower")
    WebElement MoneyTransfer;

    @AndroidFindBy (xpath = "//*[@index='2' and @text='add funds']")
    WebElement AddFundsSmallInvestmentSection;

    @AndroidFindBy (xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView")
    WebElement PlusIcon;

    @AndroidFindBy(xpath="//*[@text='Add funds']")
    WebElement AddFunds;

    @AndroidFindBy(id="btnSelectBank")
    WebElement SelectBank;

    @AndroidFindBy(xpath="//*[@text='go to dashboard']")
    WebElement GoToDashboard;

    @AndroidFindBy(xpath = "//*[contains(@text,' Mobile Number')]")
    WebElement PhoneNumber;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")
    WebElement EnterNumber;

    @AndroidFindBy(id="txv_processing_error")
    WebElement TransactionError;


    @AndroidFindBy(xpath="//*[@text='Invalid Identifiers -  Mobile Number / Customer ID ']")
    WebElement ErrorNumberAndCustomer;

    @AndroidFindBy(xpath="//*[@text='Invalid Identifiers -  Mobile Number / PAN ']")
    WebElement ErrorNumberAndPAN;

    @AndroidFindBy(id = "tvDescriptionReadMore")
    WebElement ClickReadMore;

    @AndroidFindBy(xpath = "//*[@text='Why is TCS charged to me?']")
    WebElement TCSDescription;

    @AndroidFindBy(id="btnOkay")
    WebElement Okay;

    @AndroidFindBy(id="txvTc")
    WebElement TransferTerms;

    @AndroidFindBy(id="common_header")
    WebElement LRSTerms;

    @AndroidFindBy(xpath="//*[@text='0']")
    WebElement EnterDepositZero;


    @AndroidFindBy(xpath="//*[@text='.']")
    WebElement EnterDepositDecimal;

    @AndroidFindBy(xpath="//*[@text='Please enter valid PAN number.']")
    WebElement ErrorPANText;

    @AndroidFindBy(id="bt_okay_confirmation")
    WebElement ButtonOk;

    @AndroidFindBy(id="txvHaveQuestions")
    WebElement BankFAQs;

    @AndroidFindBy(id="txvTitle")
    WebElement FAQsDescription;


    @AndroidFindBy(id="userId")
    WebElement HDFCUserID;

    @AndroidFindBy(id="password")
    WebElement HDFCPassword;

    @AndroidFindBy(xpath="//*[@text='Next']")
    WebElement HDFCNext;





    SignInPage signInPage;

    public LRSPage() {
        this.signInPage = new SignInPage();
    }


    public void ClickAddFunds() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"add funds\").instance(0))"));
        AddFundsButton.click();


    }
    public void AddMoneytoBuyingPower() throws InterruptedException {
        Thread.sleep(5000);
        //AddMoneytoBuyingPower.click();
        AddFunds.click();
    }
    public void EnterDepositAmount() throws InterruptedException {
        Thread.sleep(5000);
        EnterDepositAmount.click();

        //EnterDepositAmount.sendKeys(amount);
        //((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }

    public void ClickOnTransfer() throws InterruptedException {
        Thread.sleep(5000);
        TransferNow.click();
    }

    public void ClickonUploadStatement() throws InterruptedException {
        Thread.sleep(5000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"transfer from YES a/c to buying power\").instance(0))"));
        UploadStatementButton.click();
        //Thread.sleep(8000);
    }

    public void SelectBankAccount() throws InterruptedException {
        Thread.sleep(3000);
        SelectBank.click();
        Thread.sleep(3000);
        SelectHDFC.click();
        //SelectandContinue.click();

    }

    public void UploadBankStatement() throws InterruptedException {
        Thread.sleep(3000);
        uploadManually.click();
        Thread.sleep(5000);
        IconfirmButton.click();
        Thread.sleep(5000);
        UploadEstatementButton.click();
        Thread.sleep(5000);
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
        Thread.sleep(5000);
        SelectBank.click();
        Thread.sleep(5000);
        SelectAxis.click();
        //Thread.sleep(5000);
        //SelectandContinue.click();
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
        EnterBankStatementPasscode.sendKeys("VARS861552949");
        Thread.sleep(20000);
        SubmitClick.click();
        Thread.sleep(20000);
        SuccessStatementUploadMsg.isDisplayed();
        ClickonFinish.click();
        Thread.sleep(20000);

    }

    public void TransferFromYesBank() throws InterruptedException {
        Thread.sleep(8000);
        Thread.sleep(21000);
        //Thread.sleep(5000);
        //driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"transfer from YES a/c to buying power\").instance(0))"));
        TransferFromYesBank.click();

    }



    public void EnterPAN() throws InterruptedException {
        Thread.sleep(30000);
        PAN.click();
        EnterPan.sendKeys("ATKPV4759N");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }

    public void EnterYesBankCustomerID(){
        CustomerID.click();

        EnterCustomerID.sendKeys("32413278");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }

    public void ClickonProceed() throws InterruptedException {
        Proceed.click();
        Thread.sleep(20000);

    }

    public void EnterOTP1() throws IOException, InterruptedException {
        Thread.sleep(8000);
        String otp = basePage.CopyOTPFromMessage();
        OTP1Click.click();
        OTP1Enter.sendKeys(otp);
        Proceed.click();

    }

    public void SelectCheckBoxes() throws InterruptedException {
        Thread.sleep(15000);
        int numberOfScrolls = 6; // Adjust the number of scrolls as needed

        for (int i = 0; i < numberOfScrolls; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        CheckBox1.click();
        Thread.sleep(3000);
        ClickOk.click();
        Thread.sleep(2000);
        CheckBox2.click();
        Thread.sleep(3000);
        ClickOk.click();
        Thread.sleep(2000);
        CheckBox3.click();
        Thread.sleep(3000);
        ClickOk.click();
        Thread.sleep(2000);
        CheckBox4.click();
        Thread.sleep(3000);
        ClickOk.click();
        Thread.sleep(2000);
        CheckBox5.click();
        Thread.sleep(3000);
        ClickOk.click();
        Thread.sleep(2000);
        NEXTButton.click();

    }

    public void SelectYesOnline() throws InterruptedException {
        Thread.sleep(10000);
        WebElement element4 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.TextView[1]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element4).getId()
        ));
        // LoginCheckBox.click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Next\").instance(0))"));
        Thread.sleep(5000);
        Next.click();

    }

    public void SubmitCustomerIDandPassword() throws InterruptedException {
        Thread.sleep(10000);
        // LoginClick.click();
        LoginIdEnter.sendKeys("varsha92");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(10000);
        PasswordClick.click();
        EnterPassword.sendKeys("Rogger@321");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
        ClickAuthorize.click();
        Thread.sleep(10000);

    }

    public void EnterNetBankingOTP() throws IOException, InterruptedException {
        String NetOTP = basePage.CopyOTPFromMessage();
        EnterNetOTP.sendKeys(NetOTP);
        Confirm.click();
        Thread.sleep(6000);

    }
    public void FetchDetails() throws IOException, InterruptedException {
        Thread.sleep(10000);
        ViewDetails.click();
    }

    public void TransactionDetails() throws IOException, InterruptedException {
        Thread.sleep(10000);
        MoneyTransactionDetails.click();
    }


    public void ValidateTransferAmount() throws IOException, InterruptedException {
        Thread.sleep(10000);
        TransferAmount.isDisplayed();
    }

    public void ValidateDepositAmount() throws IOException, InterruptedException {
        Thread.sleep(12000);
        DepositAmount.isDisplayed();
    }


    public void ClickOnDashboard() throws IOException, InterruptedException {
        Thread.sleep(5000);
        GoToDashboard.click();
    }

        public void ValidateTransactionIsSuccessFull() throws InterruptedException {
            Thread.sleep(5000);
        CheckTransactionStatusMsg.isDisplayed();
            Thread.sleep(5000);
        clickonViewDashboard.click();

    }

    public void MoneyTransferClick() throws InterruptedException {
        Thread.sleep(3000);
        MoneyTransfer.click();
    }

    public void ClickAddFundsFromSmallInvestment() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"start SIP\").instance(0))"));
        Thread.sleep(5000);
        AddFundsSmallInvestmentSection.click();
    }


    public void ClickOnPlusIcon() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"start SIP\").instance(0))"));
        Thread.sleep(8000);
        PlusIcon.click();
    }

    public void EnterPhoneNumber() throws InterruptedException {
        Thread.sleep(10000);
        PhoneNumber.click();
        EnterNumber.sendKeys("7019871038");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }
    public void EnterWrongYesBankCustomerID(){
        CustomerID.click();

        EnterCustomerID.sendKeys("5674536472");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }

    public void ValidateErrorTransaction(String s) throws InterruptedException {
        Thread.sleep(5000);
        TransactionError.isDisplayed();
    }

    public void ValidateErrorTransactionPAN(String p) throws InterruptedException {
        Thread.sleep(5000);
        TransactionError.isDisplayed();
    }

    public void ValidateMessage() throws InterruptedException {
        Thread.sleep(5000);
        ErrorNumberAndCustomer.isDisplayed();
    }

    public void ValidateErrorMessage() throws InterruptedException {
        Thread.sleep(5000);
        ErrorNumberAndPAN.isDisplayed();
    }

    public void ReviewReadMore() throws InterruptedException {
        Thread.sleep(8000);
        ClickReadMore.click();
    }
    public void ValidateTCSDescription() throws InterruptedException {
        Thread.sleep(10000);
        TCSDescription.isDisplayed();
    }

    public void ReviewOkay() throws InterruptedException {
        Thread.sleep(5000);
        Okay.click();
    }

    public void SelectTransfer() throws InterruptedException {
        Thread.sleep(5000);
        TransferTerms.click();
    }

    public void ValidateLRSTerms() throws InterruptedException {
        Thread.sleep(5000);
        LRSTerms.isDisplayed();
    }

    public void EnterAllowedAmount() throws InterruptedException {
        Thread.sleep(5000);
        EnterDepositZero.click();

    }
    public void EnterAllowedAmountZero() throws InterruptedException {
        Thread.sleep(5000);
        EnterDepositDecimal.click();
    }

    public void EnterInvalidPAN() throws InterruptedException {
        Thread.sleep(30000);
        PAN.click();
        EnterPan.sendKeys("THG456JN7J");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));

    }

    public void ValidateErrorText(String P) throws InterruptedException {
        Thread.sleep(5000);
        ErrorPANText.isDisplayed();
    }

    public void SelectButtonOkay() throws InterruptedException {
        Thread.sleep(5000);
        ButtonOk.click();

    }


    public void SelectFAQs() throws InterruptedException {
        Thread.sleep(8000);
        BankFAQs.click();

    }

    public void ValidateFAQSDescription() throws InterruptedException {
        Thread.sleep(5000);
        FAQsDescription.isDisplayed();
    }







}