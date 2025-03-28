package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class LanguageChangePage extends BasePage{
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();

    public LanguageChangePage() {
        this.basePage = new BasePage();
        this.signInPage = new SignInPage();

    }

    @AndroidFindBy(xpath = "//*[@text='Change Language']")
    private WebElement ChangeLanguage;

    @AndroidFindBy(xpath = "(//androidx.cardview.widget.CardView[@resource-id=\"com.appreciatewealth.android.uat:id/cardChooseLanguage\"])[2]/android.view.ViewGroup")
    private WebElement HindiLanguage;

    @AndroidFindBy(xpath = "//*[@text='Continue']")
    private WebElement ContinueBtn;

    @AndroidFindBy(xpath = "//*[@text='अप्रिशेट पासकोड दर्ज करें']")
    private WebElement AppreciatePasscodeInHindi;


    @AndroidFindBy(xpath = "//*[@text='नमस्ते varsha']")
    private WebElement HindiUserName;

    @AndroidFindBy(xpath = "//*[@text='अपने दोस्तों को संदर्भित करें']")
    private WebElement HindiFriendReferOne;

    @AndroidFindBy(xpath = "//*[@text='प्रत्येक सफल रेफरल के लिए पुरस्कार जीतें!']")
    private WebElement HindiFriendReferTwo;

    @AndroidFindBy(xpath = "//*[@text='अभी रेफ़र करें']")
    private WebElement HindiFriendReferThree;

    @AndroidFindBy(xpath = "//*[@text='अमेरिकी बटुआ']")
    private WebElement HindiUSWallet;

    @AndroidFindBy(xpath = "//*[@text='YES बैंक']")
    private WebElement HindiYesBank;


    @AndroidFindBy(xpath = "//*[@text='बैलेंस की जाँच करें']")
    private WebElement CheckBalanceInHindi;


    @AndroidFindBy(xpath = "//*[@text='बपंजीकरण पर वापस जाएँ']")
    private WebElement GobackToPanjikaran;


    @AndroidFindBy(xpath = "//*[@text='कुछ गलत हो गया।']")
    private WebElement FailedFetchDescription;

    @AndroidFindBy(id = "txvRetryDesc")
    private WebElement FailedFetchDescriptionTwo;

    @AndroidFindBy(xpath = "//*[@text='पुन: प्रयास करें।']")
    private WebElement TryAgainInHindi;


    @AndroidFindBy(xpath = "//*[@text='Yes बैंक बैलेंस।']")
    private WebElement YesBankBalanceHindiHeading;

    @AndroidFindBy(xpath = "//*[@text='बैलेंस होल्ड करें।']")
    private WebElement BalanceHold;

    @AndroidFindBy(xpath = "//*[@text='नेट बैलेंस।']")
    private WebElement NetBalance;

    @AndroidFindBy(xpath = "//*[@text='खाते का विवरण।']")
    private WebElement khatekavivaran;

    @AndroidFindBy(xpath = "//*[@text='फंड जोड़ें']")
    private WebElement AddFunds;

    @AndroidFindBy(xpath = "//*[@text='Yes बैंक MPIN रीसेट करें']")
    private WebElement MPINReset;

    @AndroidFindBy(xpath = "//*[@text='लेनदेन।']")
    private WebElement Lenden;

    @AndroidFindBy(xpath = "//*[@text='इसके द्वारा संचालित।']")
    private WebElement YesbankBottomText;

    @AndroidFindBy(xpath = "//*[@text='खाता संख्या।']")
    private WebElement accountNumber;

    @AndroidFindBy(xpath = "//*[@text='खाते का प्रकार।']")
    private WebElement accountType;

    @AndroidFindBy(xpath = "//*[@text='IFSC कोड।']")
    private WebElement IFSCCode;


    @AndroidFindBy(xpath = "//*[@text='विवरण साझा करें।']")
    private WebElement vivaranCTA;

    @AndroidFindBy(xpath = "//*[@text='Yes बैंक मिनी स्टेटमेंट']")
    private WebElement YesBankMiniStatement;

    @AndroidFindBy(xpath = "//*[@text='Savings']")
    private WebElement SavingActTypeEnglish;


    @AndroidFindBy(xpath = "//*[@text='अपने बचत पर आकर्षक रिटर्न अर्जित करने के लिए हर महीने ₹500 बचाएं']")
    private WebElement AddFundsDescription;

    @AndroidFindBy(xpath = "//*[@text='राशि।']")
    private WebElement Amount;

    @AndroidFindBy(xpath = "//*[@text='अभी भेज दो']")
    private WebElement SendNow;

    @AndroidFindBy(xpath = "//*[@text='अब आपको आधार OTP के माध्यम से प्रमाणीकरण के लिए Yes बैंक के सुरक्षित पोर्टल पर पुनः निर्देशित किया जाएगा, यह आपके द्वारा सेट किए गए पिछले MPIN को रद्द कर देगा.']")
    private WebElement MPINResetDescription;

    @AndroidFindBy(xpath = "//*[@text='जारी रखें।']")
    private WebElement okayBtn;

    @AndroidFindBy(id = "tvClose")
    private WebElement CrossCTA;


    @AndroidFindBy(xpath = "//*[@text='19 मार्च 2025 at 07:51 pm']")
    private WebElement StaticStatementDate;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/txnDescription\" and @text=\"003CAOR250780090-MISC-REMIT-LIQ-BORING CANAL\"]")
    private WebElement OneTransaction;


    @AndroidFindBy(xpath = "//*[@text='अमेरिकी बटुआ']")
    private WebElement AmerikiBatua;

    @AndroidFindBy(xpath = "//*[@text='अमेरिकी बटुआ']")
    private WebElement AmerikiBatuaInfoCTA;


    @AndroidFindBy(xpath = "//*[@text='आपका US वॉलेट आपके ब्रोकरेज खाते में निवेश करने के लिए उपलब्ध नकदी की कुल राशि है, जिसमें तत्काल धन शामिल है, लेकिन खुले लेनदेन में बंधी निधियों को शामिल नहीं किया गया है।']")
    private WebElement AmerikiBatuaInfo;

    @AndroidFindBy(xpath = "//*[@text='अमेरिका में नकदी।']")
    private WebElement AmerikamenakdiHeading;

    @AndroidFindBy(xpath = "//*[@text='आपके US ब्रोकर खाते में ट्रेड करने के लिए उपलब्ध व्यवस्थित नकद बैलेंस।']")
    private WebElement AmerikamenakdiDescription;

    @AndroidFindBy(xpath = "//*[@text='ट्रांजिट में नकदी।']")
    private WebElement NakdiTransitHeading;

    @AndroidFindBy(xpath = "//*[@text='व्यापार के लिए आवंटित नकदी और तत्काल फंडिंग शेष उपलब्ध है। ट्रांजिट में नकद निकासी के लिए तब तक उपलब्ध नहीं है जब तक कि यह व्यवस्थित ना हो जाए और US में नकदी के रूप में प्रदर्शित ना हो।']")
    private WebElement NakdiTransitDescription;

    @AndroidFindBy(xpath = "//*[@text='रखी गई राशि।']")
    private WebElement RashiHeading;

    @AndroidFindBy(xpath = "//*[@text='धारण की गई राशि सेटल्ड कैश का प्रतिनिधित्व करती है जो खुले लेनदेन के कारण होल्ड पर है।']")
    private WebElement RashiDescription;


    @AndroidFindBy(xpath = "//*[@text='ठीक है']")
    private WebElement ThikHaiCTA;


    @AndroidFindBy(xpath = "//*[@text='ड्राइववेल्थ।")
    private WebElement DriveWealthHeading;

    @AndroidFindBy(xpath = "//*[@text='मार्जिन खाते के विवरण।']")
    private WebElement Marginkhata;

    @AndroidFindBy(xpath = "//*[@text='कैश खातों के विवरण']")
    private WebElement Cashkhata;


    @AndroidFindBy(xpath = "//*[@text='ट्रान्सफर राशि दर्ज करें।']")
    private WebElement TransferRashiHeading;


    @AndroidFindBy(xpath = "//*[@text='Yes बैंक खाते से पैसे ट्रांसफर करें।']")
    private WebElement YesBankTransferAmtHeading;


    @AndroidFindBy(xpath = "//*[@text='अभी भेज दो']")
    private WebElement AbhiBhejDoCTA;

    @AndroidFindBy(xpath = "//*[@text='निकासी करें।']")
    private WebElement NikashiKareCTA;


    @AndroidFindBy(xpath = "//*[@text='सब कुछ निकालें।']")
    private WebElement WithdrawalAllHindi;

    @AndroidFindBy(xpath = "//*[@text='निकासी']")
    private WebElement NikashiCTA;


    @AndroidFindBy(xpath = "//*[@text='Withdrawing funds will reduce US Wallet']")
    private WebElement WithdrawalDescriptionInEnglish;


    @AndroidFindBy(xpath = "//*[@text='उपलब्धः ₹']")
    private WebElement AvailableAmtInHindi;



    public void SelectChangeLanguage() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(3000);
        ChangeLanguage.click();
    }

    public void SelectHindiLanguage() throws InterruptedException {
        Thread.sleep(3000);
        HindiLanguage.click();
    }

    public void ClickOnContinueBtn() throws InterruptedException {
        Thread.sleep(3000);
        ContinueBtn.click();
    }

    public void EnterActPasscode() throws InterruptedException {
        Thread.sleep(4000);
        AppreciatePasscodeInHindi.isDisplayed();
        Thread.sleep(2000);
        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"1\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

        WebElement element2 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"9\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element2).getId()
        ));

        WebElement element3 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"8\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element3).getId()
        ));

        WebElement element4 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"8\"]"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element4).getId()
        ));
    }

    public void VerifyDetailsInHindi() throws InterruptedException {
        Thread.sleep(3000);

        HindiUserName.isDisplayed();
        HindiFriendReferOne.isDisplayed();
        HindiFriendReferTwo.isDisplayed();
        HindiFriendReferThree.isDisplayed();

        HindiYesBank.isDisplayed();
        HindiUSWallet.isDisplayed();

        CheckBalanceInHindi.isDisplayed();
    }

    public void VerifyYesBankBalanceInHindi() throws InterruptedException {
        Thread.sleep(3000);
        CheckBalanceInHindi.click();
        Thread.sleep(3000);
        GobackToPanjikaran.click();
        Thread.sleep(2000);
        FailedFetchDescription.isDisplayed();
        FailedFetchDescriptionTwo.isDisplayed();
        // above one checking id
        TryAgainInHindi.isDisplayed();


    }

    public void SelectYesBankBalanceInHindi() throws InterruptedException {
        Thread.sleep(3000);
        CheckBalanceInHindi.click();
    }

    public void VerifyAllTheDetailsUnderYesBankInHindi() throws InterruptedException {
        Thread.sleep(3000);
        YesBankBalanceHindiHeading.isDisplayed();

        BalanceHold.isDisplayed();
        NetBalance.isDisplayed();

        khatekavivaran.isDisplayed();
        AddFunds.isDisplayed();
        MPINReset.isDisplayed();
        Lenden.isDisplayed();

        YesbankBottomText.isDisplayed();

    }

    public void ClickOnKhateKaVivaran() throws InterruptedException {
        Thread.sleep(3000);

    }

    public void ClickOnAddFunds() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void ClickOnResetMpin() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void ClickOnLenden() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void VerifyKhateKaVivaranPage() throws InterruptedException {
        Thread.sleep(3000);
        khatekavivaran.isDisplayed();
        accountNumber.isDisplayed();
        accountType.isDisplayed();
        IFSCCode.isDisplayed();

        SavingActTypeEnglish.isDisplayed();  // in hindi it's not in app

        vivaranCTA.isDisplayed();

    }

    public void VerifyAddFundsPageInHindi() throws InterruptedException {
        Thread.sleep(3000);
        AddFunds.isDisplayed();
        AddFundsDescription.isDisplayed();
        Amount.isDisplayed();
        SendNow.isDisplayed();
    }

    public void VerifyResetMpinDescription() throws InterruptedException {
        Thread.sleep(3000);
        MPINReset.isDisplayed();
        MPINResetDescription.isDisplayed();
        okayBtn.isDisplayed();
        CrossCTA.click();
    }

    public void VerifyLendenPage() throws InterruptedException {
        Thread.sleep(3000);
        Lenden.isDisplayed();
        YesBankMiniStatement.isDisplayed();

        StaticStatementDate.isDisplayed();

        OneTransaction.isDisplayed();
    }

    public void ClickOnUSWallet() throws InterruptedException {
        Thread.sleep(3000);
        AmerikiBatua.click();
    }

    public void VerifyAllDetailsOfUSWallet() throws InterruptedException {
        Thread.sleep(3000);
        AmerikiBatua.isDisplayed();
        AmerikiBatuaInfoCTA.click();

        AmerikiBatua.isDisplayed();
        AmerikiBatuaInfo.isDisplayed();
        AmerikamenakdiHeading.isDisplayed();
        AmerikamenakdiDescription.isDisplayed();
        NakdiTransitHeading.isDisplayed();
        NakdiTransitDescription.isDisplayed();
        RashiHeading.isDisplayed();
        RashiDescription.isDisplayed();

        ThikHaiCTA.click();




    }

    public void VerifyKhateKaVivaranUnderAmerikiBatua() throws InterruptedException {
        Thread.sleep(3000);
        khatekavivaran.click();
        Thread.sleep(3000);
        khatekavivaran.isDisplayed();
        DriveWealthHeading.isDisplayed();
        Marginkhata.isDisplayed();
        Cashkhata.isDisplayed();

    }

    public void VerifyAddFundsUnderAmerikiBatua() throws InterruptedException {
        Thread.sleep(3000);
        AddFunds.click();
        Thread.sleep(3000);
        TransferRashiHeading.isDisplayed();
        YesBankTransferAmtHeading.isDisplayed();
        Amount.isDisplayed();
        AbhiBhejDoCTA.isDisplayed();


    }

    public void VerifyWithdrawalUnderAmerikiBatua() throws InterruptedException {
        Thread.sleep(3000);
        NikashiKareCTA.click();
        Thread.sleep(3000);
        NikashiKareCTA.isDisplayed();
        Amount.isDisplayed();
        WithdrawalAllHindi.isDisplayed();
        NikashiCTA.isDisplayed();

        WithdrawalDescriptionInEnglish.isDisplayed();  // hindi is not for this description

        AvailableAmtInHindi.isDisplayed();
    }
}
