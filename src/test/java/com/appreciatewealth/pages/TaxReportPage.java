package com.appreciatewealth.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.io.File;

public class TaxReportPage extends BasePage{
    SignInPage signInPage;

    public TaxReportPage(){
        this.signInPage = new SignInPage();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Profile\n" +
            "Tab 5 of 5\"]")
    WebElement ProfileTab;

    @AndroidFindBy(xpath = "//*[@text='Reports']")
    WebElement ReportsTab;


    @AndroidFindBy(accessibility = "Tax Reports")
    WebElement TaxReports;


    @AndroidFindBy(accessibility = "Transaction Activity")
    WebElement TransactionActivity;


    @AndroidFindBy(accessibility = "Apr 2023 - Mar 2024")
    WebElement MonthRange;


    @AndroidFindBy(accessibility = "Download")
    WebElement DownloadCTA;


    @AndroidFindBy(accessibility = "Document downloaded successfully")
    WebElement SuccessDownloadMsg;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Date range not selected.\"]")
    WebElement DateRangeErrorMsg;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[4]")
    WebElement EmailIcon;


    @AndroidFindBy(xpath = "//android.widget.ImageView[starts-with(@content-desc, 'Email sent!')]")
    WebElement SuccessEmailMsg;


    @AndroidFindBy(accessibility = "Okay")
    WebElement OkayCTA;


    @AndroidFindBy(accessibility = "Note: Transaction Activity will be generated and available to investors every financial year, in April.")
    WebElement Transaction_Note;


    @AndroidFindBy(accessibility = "Transaction Activity")
    WebElement TransactionactivityPage;


    @AndroidFindBy(accessibility = "PDF")
    WebElement PDFOption;


    @AndroidFindBy(accessibility = "Excel")
    WebElement ExcelOption;

    @AndroidFindBy(accessibility = "Capital Gains")
    private WebElement CapitalGains;

    @AndroidFindBy(accessibility = "Dividend & Interest")
    private WebElement DividendandInterest;

    @AndroidFindBy(accessibility = "Schedule FA")
    private WebElement ScheduleFA;

    @AndroidFindBy(accessibility = "Form 1042-S (US Stocks)")
    private WebElement USForm;

    @AndroidFindBy(accessibility = "Form 1042-S (Goals)")
    private WebElement GoalsForm;


    @AndroidFindBy(accessibility = "Apr 2023 - Mar 2024")
    private WebElement CapitalGainDateRange;


    @AndroidFindBy(accessibility = "Note: Capital Gains report will be generated and available to investors every financial year, in April.")
    private WebElement CapitalGainDescription;


    @AndroidFindBy(accessibility = "Download")
    private WebElement DownloadButton;




    @AndroidFindBy(accessibility = "Note: Dividend Summary will be generated and available to investors every financial year, in April.")
    private WebElement DividendAndInterestDescription;


    @AndroidFindBy(accessibility = "Note: Schedule FA will be generated and available to investors every financial year, in April.")
    private WebElement ScheduleFADescription;


    @AndroidFindBy(accessibility = "Jan 2024 - Dec 2024")
    private WebElement USStocksFormDateRange;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Note: Tax Documents are based on the US tax season from January 1st to December 31st.\n" +
            "Form 1042-S will be available in April. \n" +
            " \n" +
            "Form 1042-S is generated only if interest and dividends exceed $10 or there were sell-side transactions throughout the year that exceeded $20\"]")
    private WebElement USStocksFormDescription;


    public void VerifyTransactionactivityPage() throws InterruptedException {
        Thread.sleep(5000);
        TransactionactivityPage.isDisplayed();
        DownloadCTA.isDisplayed();
        EmailIcon.isDisplayed();

    }

    public void SelectProfileTab() throws InterruptedException {
        Thread.sleep(3000);
        ProfileTab.click();

    }

    public void SelectReportsTab() throws InterruptedException {
        Thread.sleep(3000);
        ReportsTab.click();
    }

    public void SelectTaxReportsOption() throws InterruptedException {
        Thread.sleep(5000);
        TaxReports.click();
    }

    public void SelectTransactionActivity() throws InterruptedException {
        Thread.sleep(5000);
        TransactionActivity.click();
    }

    public void SelectMonthRange() throws InterruptedException {
        Thread.sleep(4000);
        MonthRange.click();
    }

    public void SelectDownloadCTA() throws InterruptedException {
        Thread.sleep(3000);
        DownloadCTA.click();
    }

    public void VerifyDownload(String documentDownloadedSuccessfully) throws InterruptedException {
        Thread.sleep(2000);
        String download_toast = SuccessDownloadMsg.getAttribute("content-desc");
        Assert.assertEquals(documentDownloadedSuccessfully, download_toast);
    }

    public void VerifyDateRangeError(String expectedMessage) throws InterruptedException {
//        // Retry logic to catch quick toast messages
//        final int MAX_RETRIES = 10;
//        final int RETRY_INTERVAL = 100; // milliseconds
//        String actualMessage = null;
//
//        for (int i = 0; i < MAX_RETRIES; i++) {
//            try {
//                actualMessage = DateRangeErrorMsg.getAttribute("content-desc");
//                if (actualMessage != null && !actualMessage.isEmpty()) {
//                    break;
//                }
//            } catch (Exception e) {
//                // Continue if element is not yet visible
//            }
//            Thread.sleep(RETRY_INTERVAL);
//        }
//
//        Assert.assertEquals(expectedMessage, actualMessage,
//            "Expected toast message '" + expectedMessage + "' was not found");

        // above one @boss
        String download_toast = DateRangeErrorMsg.getAttribute("content-desc");
        Assert.assertEquals(expectedMessage, download_toast);
    }

    public void SelectEmailIcon() throws InterruptedException {
        Thread.sleep(3000);
        EmailIcon.click();
    }


    public void VerifySuccessEmailMsg(String expectedMessage) throws InterruptedException {
//        Thread.sleep(5000);
//        String emailMessage = SuccessEmailMsg.getAttribute("content-desc");
//
//        String emailSentText = emailMessage.split("\n")[0];
//        System.out.println(emailSentText);
//
//        Assert.assertEquals(email_error,emailSentText);
//
//        OkayCTA.click();
        Thread.sleep(5000);
        String actualMessage = SuccessEmailMsg.getAttribute("content-desc");
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage.startsWith(expectedMessage),
                "Expected message to start with '" + expectedMessage + "' but got '" + actualMessage + "'");

        OkayCTA.click();

    }

    public void TransactionNote(String note) throws InterruptedException {
        Thread.sleep(4000);
        String download_toast = Transaction_Note.getAttribute("content-desc");
        Assert.assertEquals(note, download_toast);

    }

    public boolean isDownloadButtonEnabled() {
        return DownloadCTA.isEnabled();
    }

    public boolean isElementEnabled(WebElement element) {
        try {
            return element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isElementDisabled(WebElement element) {
        try {
            String enabled = element.getAttribute("enabled");
            return "false".equals(enabled);
        } catch (Exception e) {
            return false;
        }
    }

    public void verifyDownloadButtonState(boolean shouldBeEnabled) {
        Assert.assertEquals(isDownloadButtonEnabled(), shouldBeEnabled,
                "Download button enabled state should be: " + shouldBeEnabled);
    }

    public void selectFileFormat(String fileType) throws InterruptedException {
        Thread.sleep(2000);
        switch(fileType.toLowerCase()) {
            case "pdf":
                PDFOption.click();
                break;
            case "excel":
                ExcelOption.click();
                break;
            default:
                throw new IllegalArgumentException("Unsupported file type: " + fileType);
        }
    }

    public boolean verifyDownloadedFileType(String expectedFileType) {
        // Get the latest downloaded file from downloads directory
        File downloadDir = new File(System.getProperty("user.home") + "/Downloads");
        File[] files = downloadDir.listFiles();

        if (files == null || files.length == 0) {
            return false;
        }

        // Get the most recent file
        File latestFile = files[0];
        for (File file : files) {
            if (file.lastModified() > latestFile.lastModified()) {
                latestFile = file;
            }
        }

        // Check file extension
        String fileName = latestFile.getName().toLowerCase();
        switch(expectedFileType.toLowerCase()) {
            case "pdf":
                return fileName.endsWith(".pdf");
            case "excel":
                return fileName.endsWith(".xlsx") || fileName.endsWith(".xls");
            default:
                return false;
        }
    }

    public void verifyFileDownloadedWithType(String expectedFileType) throws InterruptedException {
        Thread.sleep(3000); // Wait for download to complete
        Assert.assertTrue(verifyDownloadedFileType(expectedFileType),
                "Downloaded file is not of type: " + expectedFileType);
    }

    public void SelectCapitalGains() throws InterruptedException {
        Thread.sleep(5000);
        CapitalGains.click();
    }

    public void SelectDividendandInterest() throws InterruptedException {
        Thread.sleep(4000);
        DividendandInterest.click();
    }

    public void SelectScheduleFA() throws InterruptedException {
        Thread.sleep(4000);
        ScheduleFA.click();
    }

    public void SelectUSForm() throws InterruptedException {
        Thread.sleep(4000);
        USForm.click();
    }

    public void SelectGoalsForm() throws InterruptedException {
        Thread.sleep(8000);
        GoalsForm.click();
    }

    public void VerifyCapitalGainDetails() throws InterruptedException {
        Thread.sleep(4000);
        CapitalGainDateRange.isDisplayed();
        CapitalGainDescription.isDisplayed();
        DownloadButton.isDisplayed();
        EmailIcon.isDisplayed();
    }

    public void VerifyDividendAndInterestDetails() throws InterruptedException {
        Thread.sleep(4000);
        CapitalGainDateRange.isDisplayed();
        DividendAndInterestDescription.isDisplayed();
        DownloadButton.isDisplayed();
        EmailIcon.isDisplayed();
    }

    public void VerifyScheduleFADetails() throws InterruptedException {
        Thread.sleep(4000);
        CapitalGainDateRange.isDisplayed();
        ScheduleFADescription.isDisplayed();
        DownloadButton.isDisplayed();
        EmailIcon.isDisplayed();
    }

    public void VerifyFormUSStocksDetails() throws InterruptedException {
        Thread.sleep(4000);
        USStocksFormDateRange.isDisplayed();
        USStocksFormDescription.isDisplayed();
        DownloadButton.isDisplayed();
        EmailIcon.isDisplayed();
    }

    public void VerifyGoalsFormDetails() throws InterruptedException {
        Thread.sleep(4000);
        USStocksFormDateRange.isDisplayed();
        USStocksFormDescription.isDisplayed();
        DownloadButton.isDisplayed();
        EmailIcon.isDisplayed();
    }

    public void SelectTransactionDateForUSStocks() throws InterruptedException {
        Thread.sleep(4000);
        USStocksFormDateRange.click();
    }
}



