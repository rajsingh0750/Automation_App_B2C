package com.appreciatewealth.pages;

import com.beust.ah.A;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StockDetailsPage extends BasePage{
    SignInPage signInPage;

    public StockDetailsPage (){
        this.signInPage = new SignInPage();
    }


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"CSX\n" +
            "CSX Corp.\n" +
            "EQUITY\"]")
    private WebElement CSX;


    @AndroidFindBy(xpath = "//*[@text='₹1']")
    private WebElement AmountField;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"TSLA\n" +
            "Tesla, Inc.\n" +
            "EQUITY\"]")
    private WebElement Tesla;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"FOR\n" +
            "Forestar Group Inc\n" +
            "EQUITY\"]")
    private WebElement For;



    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/txvTodayPerformancePrice\"])[2]")
    private WebElement openPrice;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"INTC\n" +
            "Intel Corporation\n" +
            "EQUITY\"]")
    private WebElement INTC;



    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\"])[5]")
    private WebElement EPSValue;


    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\"])[6]")
    private WebElement PERatio;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, '%')]")
    private WebElement StockPercentage;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\" and @text=\"-\"]")
    private WebElement Dividend;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.appreciatewealth.android:id/companyStatisticsPrice' and contains(@text, '%')]")
    private WebElement ValidDividend;

    @AndroidFindBy(xpath = "//*[@text='EQUITY']")
    WebElement EquityTag;


    @AndroidFindBy(xpath = "//*[@text='Consumer Cyclical']")
    WebElement TeslaIndustryType;

    @AndroidFindBy(xpath = "//*[@text='Auto & Truck Manufacturers']")
    WebElement TeslaSector;

    @AndroidFindBy(xpath = "//*[@text='Mega']")
    WebElement MarketCap;

    @AndroidFindBy(accessibility = "ETF")
    WebElement ETF;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"TSLZ\n" +
            "T-Rex 2x Inverse Tesla Daily Target ETF\n" +
            "ETF\"]")
    WebElement TeslaETFTSLZ;


    @AndroidFindBy(xpath = "//*[@text='ETF']")
    WebElement ETFTag;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\"])[1]")
    WebElement IndustryType;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\"])[2]")
    WebElement IndustrySector;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\"])[4]")
    WebElement IndustryFullTimeEmployees;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\"])[5]")
    WebElement IndustryMarketCap;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"GEM\n" +
            "GOLDMAN SACHS ACTIVEBETA EM\n" +
            "ETF\"]")
    WebElement GoldmanSachsStockOne;

    @AndroidFindBy(xpath = "//*[@text='GOLDMAN SACHS ACTIVEBETA EM']")
    WebElement GoldmanSachsStockOneName;


    @AndroidFindBy(xpath = "//*[@text='GOLDMAN SACHS INV GRD CORP']")
    WebElement GoldmanSachsStockTwoName;

    @AndroidFindBy(xpath = "//*[@text='GOLDMAN SACHS EQL WGHT LARGE']")
    WebElement GoldmanSachsStockThreeName;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.appreciatewealth.android:id/imgBack\"]")
    WebElement BackArrow;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"GIGB\n" +
            "GOLDMAN SACHS INV GRD CORP\n" +
            "ETF\"]")
    WebElement GoldmanSachsStockTwo;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"GSEW\n" +
            "GOLDMAN SACHS EQL WGHT LARGE\n" +
            "ETF\"]")
    WebElement GoldmanSachsStockThree;


    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'AAPL')]")
    WebElement AppleEquity;



    @AndroidFindBy(xpath = "//*[@text='Research']")
    WebElement ResearchTab;

    @AndroidFindBy(xpath = "//*[@text='view report']")
    WebElement viewreport;



    @AndroidFindBy(xpath = "//*[@text='AAPL']")
    WebElement AAPLHeading;


    @AndroidFindBy(id = "pdfview")
    WebElement AAPLReportPdf;


    @AndroidFindBy(xpath = "//*[@text='News']")
    WebElement NewsTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/txvNewsTitle\" and contains(@text, \"Apple\")]")
    WebElement AapleNews;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/txvNewsTitle\" and contains(@text, \"Amazon\")]")
    WebElement AmazonNews;


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"\uE16A\"]")
    WebElement CrossBtn;

    @AndroidFindBy(id = "iv_icon")
    WebElement EventsLogo;


    @AndroidFindBy(id = "txv_label")
    WebElement NoEventsLogo;

    @AndroidFindBy(id = "txv_label")
    WebElement NoEvents;


    @AndroidFindBy(xpath = "//*[@text='Price Targets']")
    WebElement PriceTargets;


    @AndroidFindBy(xpath = "//*[@text='Analyst Ratings']")
    WebElement AnalystRatings;

    @AndroidFindBy(xpath = "//*[@text='Earnings']")
    WebElement Earnings;


    @AndroidFindBy(xpath = "//*[@text='Financial Trend']")
    WebElement FinancialTrend;

    @AndroidFindBy(xpath = "//*[@text='Peer Comparison']")
    WebElement PeerComparison;


    @AndroidFindBy(xpath = "//*[@text='Indicator Components']")
    WebElement IndicatorComponents;


    @AndroidFindBy(xpath = "//*[@text='Refinitiv Report']")
    WebElement RefinitivReport;


    @AndroidFindBy(xpath = "//*[@text='41 Wall Street analysts are predicting a possible upside of 7.5% with a mean price of ₹21.80 K within the next 12 months.']")
    WebElement PriceTargetDescription;



    @AndroidFindBy(id = "seekBarCurrent")
    WebElement SeekBarCurrentPrice;


    @AndroidFindBy(id = "seekBarAvg")
    WebElement SeekBarAveragePrice;


    @AndroidFindBy(id = "txnHighPrice")
    WebElement SeekBarHighPrice;


    @AndroidFindBy(id = "txnLowPrice")
    WebElement SeekBarLowPrice;


    @AndroidFindBy(xpath = "//*[@text='47 Wall Street analysts have issued ratings and price targets for Apple, Inc. in the last 12 months.']")
    WebElement AnalystRatingsDescription;

    @AndroidFindBy(xpath = "//*[@text='Buy']")
    WebElement BuyTag;

    @AndroidFindBy(xpath = "//*[@text='Hold']")
    WebElement HoldTag;

    @AndroidFindBy(xpath = "//*[@text='Sell']")
    WebElement SellTag;

    @AndroidFindBy(id = "tv_buy")
    WebElement BuyRatings;

    @AndroidFindBy(id = "tv_buy_per")
    WebElement BuyPercentage;

    @AndroidFindBy(id = "tv_hold")
    WebElement HoldRatings;

    @AndroidFindBy(id = "tv_hold_per")
    WebElement HoldPercentage;

    @AndroidFindBy(id = "tv_sell")
    WebElement SellRatings;

    @AndroidFindBy(id = "tv_sell_per")
    WebElement SellPercentage;




    @AndroidFindBy(xpath = "//*[@text='Actual EPS']")
    WebElement ActualEPS;

    @AndroidFindBy(xpath = "//*[@text='Expected EPS']")
    WebElement ExpectedEPS;

    @AndroidFindBy(xpath = "//*[@text='Next Earnings Release:']")
    WebElement NextEarningRelease;

    @AndroidFindBy(id = "txv_earnings_release")
    WebElement NextEarningReleaseDate;


    @AndroidFindBy(id = "earningBubbleChart")
    WebElement EarningsGraph;


    @AndroidFindBy(id = "financialTrendChart")
    WebElement FinancialTrendGraph;


    @AndroidFindBy(xpath = "//*[@text='Quarterly']")
    WebElement QuarterlyTrendheading;


    @AndroidFindBy(xpath = "//*[@text='Annually']")
    WebElement AnnualyTrendheading;


    @AndroidFindBy(xpath = "//*[@text='Total Revenue']")
    WebElement TotalRevenue;

    @AndroidFindBy(xpath = "//*[@text='Net Income Before Taxes']")
    WebElement NetIncomeBeforeTaxes;


    @AndroidFindBy(xpath = "//*[@text='Peer Comparison']")
    WebElement PeerComparisonAvgScoreHeading;


    @AndroidFindBy(xpath = "//*[@text='Average score']")
    WebElement AverageScoreIndicatorComponents;


    @AndroidFindBy(xpath = "//*[@text='You can find detailed analysis provided by our data partner Refinitv in the following report. Please note that the report is curated by Refinitiv. Appreciate does not control the information provided here. All values in the report are in USD.']")
    WebElement RefinitivReportDescription;

    @AndroidFindBy(id = "imgTodayPerformance")
    WebElement PricePerformanceDropdown;


    @AndroidFindBy(id = "imgCompanyStatistics")
    WebElement KeyMetricsDropdown;

    @AndroidFindBy(xpath = "//*[@text='Price Performance']")
    WebElement PricePerformance;

    @AndroidFindBy(xpath = "//*[@text='Key Metrics']")
    WebElement KeyMetrics;

    @AndroidFindBy(accessibility = "Your data is 100% secure\\nIFSCA Registration No.: IFSC/BD/2022-23/0004 NSEIX\\nStock Broker ID: 10059")
    WebElement StockBrokerID;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AMZN\n" +
            "Amazon.com Inc.\n" +
            "EQUITY\"]")
    WebElement AmazonEquity;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"ENFR\n" +
            "Alerian Energy Infrastructure ETF\n" +
            "ETF\"]")
    WebElement ENFR;



    @AndroidFindBy(accessibility = "US Stocks")
    WebElement USStocks;

    @AndroidFindBy(accessibility = "Popular Stocks")
    WebElement PopularStocks;


    @AndroidFindBy(accessibility = "High to Low")
    WebElement HighToLow;

    @AndroidFindBy(accessibility = "Low to High")
    WebElement LowTOHigh;

    @AndroidFindBy(accessibility = "% Change")
    WebElement PercentageChange;


    @AndroidFindBy(accessibility = "Name")
    WebElement NameOption;


    @AndroidFindBy(accessibility = "A - Z")
    WebElement AToZ;

    @AndroidFindBy(accessibility = "Z - A")
    WebElement ZToA;


    @AndroidFindBy(accessibility = "STOCK")
    WebElement STOCKOption;

    @AndroidFindBy(accessibility = "About Alerian Energy Infrastructure ETF")
    WebElement AboutETFDropdown;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"SPY\n" +
            "S&P 500 ETF Trust SPDR\n" +
            "ETF\"]")
    WebElement SpyStock;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"MNTS\n" +
            "Momentus Inc\n" +
            "EQUITY\"]")
    WebElement mntcStock;


    @AndroidFindBy(accessibility = "Top Holdings")
    WebElement TopHoldings;


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.appreciatewealth.android:id/companyStatisticsPrice\" and contains(@text, '%')]")
    WebElement ROEOfMNTSStock;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView")
    WebElement StockDetailsBackArrow;



    public void GoToHomeDashboard() throws InterruptedException, IOException {
        Thread.sleep(5000);
       // signInPage.Signin();
       // new SignInPage().DynamicSignIn("varshatmysuru1992@gmail.com");
        signInPage.DynamicSignIn_Prod("raj.singh@ppreciate.com");
        Thread.sleep(5000);
    }

    public void ClickOnCSXStock() throws InterruptedException {
        Thread.sleep(4000);
        CSX.click();
    }

    public void UpdateAmount() throws InterruptedException {
        Thread.sleep(3000);
        AmountField.click();
        Thread.sleep(2000);
        AmountField.sendKeys("5");
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));

    }

    public void ClickOnTeslaStock() throws InterruptedException {
        Thread.sleep(3000);
        Tesla.click();
    }

    public void ClickOnForStock() throws InterruptedException {
        Thread.sleep(3000);
        For.click();
    }

    public void verifyOpenPriceInClosedMarket() throws InterruptedException {
//        // Wait for element to be visible
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(openPrice));
//
//        // Scroll to element
//        scrollDownToElement(openPrice);
//
//        // Get the open price and verify
//        String actualOpenPrice = openPrice.getText();
//        System.out.println("Opening price when market is closed: " + actualOpenPrice);
//
//        // Verify price is in correct format (contains currency symbol and 'K')
//        Assert.assertTrue(actualOpenPrice.contains("₹") && actualOpenPrice.contains("K"),
//                "Open price should be in format '₹X.XX K' but found: " + actualOpenPrice);
        Thread.sleep(4000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(3000);
        String actualOpenPrice = openPrice.getText();
        Assert.assertEquals(actualOpenPrice,"-");
        System.out.println("getting open value correct in closed market");




    }

    // Reusable scroll method
    private void scrollDownToElement(WebElement element) {
        try {
            driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100,
                    "top", 100,
                    "width", 600,
                    "height", 700,
                    "direction", "down",
                    "percent", 1.0
            ));
        } catch (Exception e) {
            throw new RuntimeException("Failed to scroll to element: " + e.getMessage());
        }
    }

    public void ClickOnINTCStock() throws InterruptedException {
        Thread.sleep(3000);
        INTC.click();
    }

    /**
     * Verifies EPS and PE Ratio values
     * Validates actual values if present, or validates hyphen if values are not available
     */
    public void verifyEPSValueAndPERatio() throws InterruptedException {
//        // Wait for elements to be visible
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        //scrollToFinancialMetrics();
//        for (int i = 0; i < 1; i++) {
//            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
//        }
//        // Get EPS and PE Ratio values
//        String eps = EPSValue.getText().trim();
//        String peRatio = PERatio.getText().trim();
//
//        System.out.println("EPS Value: " + eps);
//        System.out.println("P/E Ratio: " + peRatio);
//
//        // Validate both metrics
//        validateFinancialMetric("EPS", eps);
//        validateFinancialMetric("P/E Ratio", peRatio);

//        above one code @Boss

        Thread.sleep(5000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }

        Thread.sleep(3000);

        String eps = EPSValue.getText();
        String pe_ratio = PERatio.getText();

        System.out.println("EPS Value: " + eps);
        System.out.println("P/E Ratio: " + pe_ratio);

        // Check EPS value
        if (eps.equals("-")) {
            System.out.println("Note: EPS value is currently unavailable (-)");
        } else {
            try {
                // Remove the Rupee symbol and any other non-numeric characters except decimal point and minus sign
                String cleanEps = eps.replaceAll("[^0-9.-]", "");
                double epsValue = Double.parseDouble(cleanEps);
                System.out.println("EPS value is present and equals: " + epsValue);
            } catch (NumberFormatException e) {
                System.out.println("EPS value is present but not a valid number: " + eps);
            }
        }

        // Check P/E Ratio value
        if (pe_ratio.equals("-")) {
            System.out.println("Note: P/E Ratio is currently unavailable (-)");
        } else {
            try {
                double peValue = Double.parseDouble(pe_ratio);
                System.out.println("P/E Ratio value is present and equals: " + peValue);
            } catch (NumberFormatException e) {
                System.out.println("P/E Ratio value is present but not a valid number: " + pe_ratio);
            }
        }

        // Combined condition check
        if (eps.equals("-") && pe_ratio.equals("-")) {
            System.out.println("Warning: Both EPS and P/E Ratio values are unavailable");
        } else if (!eps.equals("-") && !pe_ratio.equals("-")) {
            System.out.println("Success: Both EPS and P/E Ratio values are available");
            System.out.println("Summary - EPS: " + eps + ", P/E Ratio: " + pe_ratio);
        } else {
            System.out.println("Note: One of the values (EPS or P/E Ratio) is unavailable");
        }
    }

    /**
     * Scrolls to the financial metrics section
     */
    private void scrollToFinancialMetrics() {
        try {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"
            ));
            // Short wait for elements to stabilize after scroll
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException("Failed to scroll to financial metrics: " + e.getMessage());
        }
    }

    /**
     * Validates a financial metric value
     * @param metricName Name of the metric (EPS or P/E Ratio)
     * @param value The value to validate
     */
    private void validateFinancialMetric(String metricName, String value) {
        if (value.equals("-")) {
            // Case 1: Value is not available
            System.out.println(metricName + " is not available (shown as '-')");
        } else {
            // Case 2: Value is available - validate format
            try {
                // Remove any currency symbols and convert to double
                String numericValue = value.replaceAll("[₹,]", "").trim();
                double numValue = Double.parseDouble(numericValue);
                
                // Validate the numeric value is reasonable
                Assert.assertTrue(isReasonableValue(metricName, numValue),
                    metricName + " value " + numValue + " is outside expected range");
                
                System.out.println(metricName + " validation passed with value: " + value);
            } catch (NumberFormatException e) {
                Assert.fail(metricName + " value '" + value + "' is not in expected numeric format");
            }
        }
    }

    /**
     * Checks if the value is within reasonable range for the given metric
     * @param metricName Name of the metric
     * @param value Value to check
     * @return boolean indicating if value is reasonable
     */
    private boolean isReasonableValue(String metricName, double value) {
        switch (metricName) {
            case "EPS":
                // Example range: -1000 to 1000 for EPS
                return value >= -1000 && value <= 1000;
            case "P/E Ratio":
                // Example range: -100 to 500 for P/E Ratio
                return value >= -100 && value <= 500;
            default:
                return false;
        }
    }

    public void VerifyPercentageChange() throws InterruptedException {
        Thread.sleep(3000);
        String temp = StockPercentage.getAttribute("content-desc");
        // System.out.println(temp);

        Pattern pattern = Pattern.compile("\\(([-+]?[0-9]*\\.?[0-9]+%)\\)");
        Matcher matcher = pattern.matcher(temp);

        // Check if a match is found
        if (matcher.find()) {
            String percentage = matcher.group(1); // Extract the percentage
            percentage = percentage.replace("%", "");
            System.out.println("Extracted Percentage: " + percentage);
            double value = Double.parseDouble(percentage);
            if (percentage.equals("0") || percentage.equals("0.0")) {
                System.out.println("Warning: Stock percentage value is 0% - This may need investigation");
            } else {
                System.out.println("Percentage value is " + value);
            }
        } else {
            System.out.println("Warning: No percentage found in the content description");
        }

    }

    public void VerifyDividend() throws InterruptedException {
        Thread.sleep(5000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }

        Thread.sleep(3000);
        String temp =  Dividend.getText();

        if(Objects.equals(temp, "-")){
            System.out.println("Dividend yield is null");
        }




    }

    public void VerifyNegativeDividend() throws InterruptedException {
        Thread.sleep(5000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }

        Thread.sleep(3000);
        String dividend =  ValidDividend.getText();
        dividend = dividend.replace("%", "");
        double d = Double.parseDouble(dividend);
        if(d<0){
            Assert.fail("Dividend value can't be 0 ");
        }
        else {
            System.out.println("divided yield percentage is " + d);
        }


    }

    public void VerifyEquityTag() throws InterruptedException {
        Thread.sleep(5000);
        EquityTag.isDisplayed();
    }

    public void VerifyAboutTSLA() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 3; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        TeslaIndustryType.isDisplayed();
        TeslaSector.isDisplayed();
        MarketCap.isDisplayed();

    }

    public void SelectETFOption() throws InterruptedException {
        Thread.sleep(3000);
        ETF.click();
    }

    public void SelectTeslaETF() throws InterruptedException {
        Thread.sleep(3000);
        TeslaETFTSLZ.click();
    }

    public void VerifyETFTag() throws InterruptedException {
        Thread.sleep(5000);
        ETFTag.isDisplayed();
    }

    public void VerifyTeslaETFDetail() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 2; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);

        String ind =  IndustryType.getText();
        String sec =   IndustrySector.getText();
        String emp =  IndustryFullTimeEmployees.getText();
        String mar_cap = IndustryMarketCap.getText();

        Assert.assertEquals(ind, "-");
        Assert.assertEquals(sec, "-");
        Assert.assertEquals(emp, "-");
        Assert.assertEquals(mar_cap, "-");

        System.out.println("For ETF all the data is coming null ");


    }

    public void ClickOnStocks() throws InterruptedException {
        Thread.sleep(4000);
        GoldmanSachsStockOne.click();
        Thread.sleep(3000);
        GoldmanSachsStockOneName.isDisplayed();
        BackArrow.click();
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(3000);
        GoldmanSachsStockTwo.click();
        Thread.sleep(3000);
        GoldmanSachsStockTwoName.isDisplayed();
        BackArrow.click();
//        Thread.sleep(2000);
//        boolean canScrollMoreTwo = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//                "left", 100, "top", 100, "width", 600, "height", 700,
//                "direction", "down",
//                "percent", 1.0
//        ));
//        Thread.sleep(3000);
//        GoldmanSachsStockThree.click();
//        Thread.sleep(3000);
//        GoldmanSachsStockThreeName.isDisplayed();
//        BackArrow.click();

    }

    public void ClickOnAppleEquity() throws InterruptedException {
        Thread.sleep(4000);
        AppleEquity.click();
    }

    public void SelectResearchTab() throws InterruptedException {
        Thread.sleep(6000);
        ResearchTab.click();
    }

    public void VerifyAppleReport() throws InterruptedException {
        Thread.sleep(4000);
        for (int i = 0; i < 5; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
            Thread.sleep(2000);
        }
        Thread.sleep(3000);

        viewreport.click();
        Thread.sleep(3000);

        AAPLHeading.isDisplayed();
        AAPLReportPdf.isDisplayed();
    }

    public void SelectNewsTab() throws InterruptedException {
        Thread.sleep(4000);
        NewsTab.click();
    }

    public void VeifyApleNews() throws InterruptedException {
        Thread.sleep(4000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 500,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(3000);
        AapleNews.isDisplayed();
    }

    public void VeifyEvents() throws InterruptedException {
        Thread.sleep(3000);
        try {
            if (EventsLogo.isDisplayed()) {
                System.out.println("Events are present for this stock");
                return;
            }
        } catch (Exception e) {
            // If the first condition fails (catching exception), we check the second one
//            if (NoEventsLogo.isDisplayed()) {
//                String temp = NoEvents.getText();
//                System.out.println(temp);
//            }
            System.out.println("No events are present fot this stock");
        }
    }


    public void VerifyResearchTabAllSections() throws InterruptedException {
        Thread.sleep(3000);
        PriceTargets.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        AnalystRatings.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore_two = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        Earnings.isDisplayed();
        FinancialTrend.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore_five = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 900,
                "direction", "down",
                "percent", 1.0
        ));
        PeerComparison.isDisplayed();
        Thread.sleep(2000);

        boolean canScrollMore_six = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        IndicatorComponents.isDisplayed();

        Thread.sleep(2000);
        boolean canScrollMore_seven = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 900,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        RefinitivReport.isDisplayed();

    }

    public void VerifyPriceSectionDetails() throws InterruptedException {
        Thread.sleep(3000);
        PriceTargets.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
       // PriceTargetDescription.isDisplayed();

       String current =  SeekBarCurrentPrice.getText();
       System.out.println("current price " + current);


       String average =  SeekBarAveragePrice.getText();
        System.out.println("average price " + average);


        String high =  SeekBarHighPrice.getText();
        System.out.println("average price " + average);


        String low =  SeekBarLowPrice.getText();
        System.out.println("average price " + average);

        
    }

    public void VerifyAnalystSectionDetails() throws InterruptedException {
        Thread.sleep(3000);
        AnalystRatings.isDisplayed();
        AnalystRatingsDescription.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 300,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);

        BuyTag.isDisplayed();
        HoldTag.isDisplayed();
        SellTag.isDisplayed();

        BuyRatings.isDisplayed();
        String buy_rate =  BuyRatings.getText();
        System.out.println("Buy rating is " + buy_rate);
        String buy_percentage =  BuyPercentage.getText();
        System.out.println("Buy rating is " + buy_percentage);
        Thread.sleep(2000);

        HoldRatings.isDisplayed();
        String hold_rate =  HoldRatings.getText();
        System.out.println("Hold rating is " + hold_rate);
        String hold_percentage =  HoldPercentage.getText();
        System.out.println("Hold percentage is " + hold_percentage);
        Thread.sleep(2000);

        SellRatings.isDisplayed();
        String sell_rate =  SellRatings.getText();
        System.out.println("Sell rating is " + sell_rate);
        String sell_percentage =  SellPercentage.getText();
        System.out.println("Sell percentage is " + sell_percentage);

    }

    public void VerifyEarningsDetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Earnings\"))"));
        Thread.sleep(2000);
        Earnings.isDisplayed();
        Thread.sleep(2000);
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Expected EPS\"))"));
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 300,
                "direction", "down",
                "percent", 1.0
        ));

        Thread.sleep(2000);
        ActualEPS.isDisplayed();
        ExpectedEPS.isDisplayed();
        NextEarningRelease.isDisplayed();
        NextEarningReleaseDate.isDisplayed();
        FinancialTrend.isDisplayed();
        QuarterlyTrendheading.isDisplayed();
        AnnualyTrendheading.isDisplayed();

    }

    public void VerifyFinancialTrendDetails() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 300,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(2000);
        TotalRevenue.isDisplayed();
        NetIncomeBeforeTaxes.isDisplayed();

    }

    public void VerifyPeerComparisonDetails() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Peer Comparison\"))"));
        Thread.sleep(2000);
        PeerComparisonAvgScoreHeading.isDisplayed();
        Thread.sleep(2000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));

        IndicatorComponents.isDisplayed();
        AverageScoreIndicatorComponents.isDisplayed();


    }

    public void VerifyRefinitivReportDetails() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"view report\"))"));
        Thread.sleep(3000);
        RefinitivReportDescription.isDisplayed();
    }

    public void VerifyEarningSectionGraph() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 500,
                "direction", "down",
                "percent", 0.1
        ));

        Thread.sleep(3000);
        EarningsGraph.isDisplayed();
    }

    public void VerifyFinancialTrendSectionGraph() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 2; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        FinancialTrendGraph.isDisplayed();
    }

    public void ClickOnAmazonEquity() throws InterruptedException {
        Thread.sleep(3000);
        AmazonEquity.click();
    }


    public void VerifyAmazonNews() throws InterruptedException {
        Thread.sleep(4000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 500,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(2000);
        AmazonNews.isDisplayed();
    }

    public void ClearStockName() throws InterruptedException {
        Thread.sleep(4000);
        CrossBtn.click();
    }

    public void ClickOnPricePerformanceDropdown() throws InterruptedException {
        Thread.sleep(4000);
        PricePerformanceDropdown.click();
    }

    public void ClickOnENFRETF() throws InterruptedException {
        Thread.sleep(4000);
        ENFR.click();
    }

    public void ClickOnKeyMetricsDropdown() throws InterruptedException {
        Thread.sleep(3000);
        KeyMetricsDropdown.click();
    }

    public void ScrollAbove() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
    }

    public void VerifyOverViewSection() throws InterruptedException {
        Thread.sleep(3000);
        PricePerformance.isDisplayed();
        KeyMetrics.isDisplayed();
    }

    public void VerifyStockBrokerID() throws InterruptedException {
        Thread.sleep(3000);
        // First do controlled scrolls
        for (int i = 0; i < 4; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".setMaxSearchSwipes(1).scrollForward()"));
            Thread.sleep(1500); // Wait between scrolls
        }
        
        Thread.sleep(10000); // Wait for screen to stabilize
        
        try {
            // Try to find the element by scrolling to it specifically
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().descriptionContains(\"Stock Broker ID\"))"));
            Thread.sleep(1500);
            StockBrokerID.isDisplayed();
        } catch (Exception e) {
            System.out.println("Attempting final scroll to locate StockBrokerID");
            // One final gentle scroll if needed
            driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".setMaxSearchSwipes(1).scrollForward()"));
            Thread.sleep(1500);
            StockBrokerID.isDisplayed();
        }
    }

    public void SelectUSStocks() throws InterruptedException {
        Thread.sleep(5000);
        USStocks.click();
    }

    public void SelectPopularStocks() throws InterruptedException {
        Thread.sleep(4000);
        PopularStocks.click();
    }

    public void SelectHighToLow() throws InterruptedException {
        Thread.sleep(3000);
        HighToLow.click();
    }

    public void SelectLowTOHigh() throws InterruptedException {
        Thread.sleep(3000);
        LowTOHigh.click();
    }

    public void SelectNameOption() throws InterruptedException {
        Thread.sleep(3000);
        NameOption.click();
    }

    public void SelectAtoZ() throws InterruptedException {
        Thread.sleep(3000);
        AToZ.click();
    }

    public void SelectZtoA() throws InterruptedException {
        Thread.sleep(3000);
        ZToA.click();
    }

    public void SelectSTOCKOption() throws InterruptedException {
        Thread.sleep(3000);
        STOCKOption.click();
    }

    public void ClickOnAboutETF() throws InterruptedException {
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 800,
                "direction", "down",
                "percent", 0.1
        ));
        Thread.sleep(3000);
        AboutETFDropdown.click();
    }

    public void ClickOnSpyStock() throws InterruptedException {
        Thread.sleep(3000);
        SpyStock.click();
    }

    public void VerifySpyResearchSection() throws InterruptedException {
        Thread.sleep(3000);
        TopHoldings.isDisplayed();
        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        StockDetailsBackArrow.click();
    }

    public void ClickOnmntcStock() throws InterruptedException {
        Thread.sleep(3000);
        mntcStock.click();
    }

    public void VerifyROEOfMNTSStock() throws InterruptedException {
        // Wait for the element to load
        Thread.sleep(3000);

        // Scroll to the bottom of the page (assuming this is the correct action)
        for (int i = 0; i < 2; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }

        Thread.sleep(3000);

        // Get the text from the element
        String mntc_roe = ROEOfMNTSStock.getText();

        // Remove the '%' symbol and convert the remaining string to a double
        try {
            String numericValue = mntc_roe.replace("%", ""); // Remove the % symbol
            double roeValue = Double.parseDouble(numericValue); // Convert to double

            // Validate if the value is in the valid range
            if (roeValue < -5 || roeValue > 50) {
                // If value is not in the range, print a message and fail the test
                String errorMsg = "Current ROE is " + mntc_roe + ", which is not in the correct range (-5% to 50%).";
                System.out.println(errorMsg);
                Assert.fail(errorMsg);  // This will fail the test and print the message
            } else {
                // If value is within the range, print a success message (optional)
                System.out.println("ROE is within the correct range: " + mntc_roe);
            }

        } catch (NumberFormatException e) {
            // Handle the case where the text is not a valid number
            String errorMsg = "Error: Could not parse the ROE value. Current text: " + mntc_roe;
            System.out.println(errorMsg);
            Assert.fail(errorMsg); // This will fail the test and print the error message
        }
    }

}
