package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PortFolioPage extends BasePage{
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Portfolio\n" +
            "Tab 2 of 5\"]")
    private WebElement PortFolioTab;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[2]")
    WebElement InvestedAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[3]")
    WebElement CurrentAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[1]")
    WebElement ReturnAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '%')])[1]")
    WebElement ReturnPercentage;


    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[3]")
    WebElement USStocksInvestedAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[4]")
    WebElement USStocksCurrentAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[2]")
    WebElement USStocksReturnAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '%')])[1]")
    WebElement USStocksReturnPercentage;



    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[2]")
    WebElement GoalsTabInvestedAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[3]")
    WebElement GoalsTabCurrentAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '₹')])[1]")
    WebElement GoalsTabReturnAmount;

    @AndroidFindBy(xpath = "(//android.view.View[contains(@content-desc, '%')])[1]")
    WebElement GoalsTabReturnPercentage;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"US Stocks\n" +
            "Tab 2 of 4\"]")
    WebElement USStock;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Goals\n" +
            "Tab 3 of 4\"]")
    WebElement Goals;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mutual Funds\n" +
            "Tab 4 of 4\"]")
    WebElement MF;






    public void ClickOnPortFolioTab() throws InterruptedException {
        Thread.sleep(3000);
        PortFolioTab.click();

    }



    public void VerifyAllTabCalculation() throws InterruptedException {
        Thread.sleep(6000);

        // 1. Get values from UI
        String investAmtStr = InvestedAmount.getAttribute("content-desc");     // e.g., "₹5,000.00"
        String currentAmtStr = CurrentAmount.getAttribute("content-desc");     // e.g., "₹4,800.00"
        String returnPercStr = ReturnPercentage.getAttribute("content-desc");  // e.g., "-4.00%"
        String returnAmtStr = ReturnAmount.getAttribute("content-desc");       // e.g., "-₹200.00"

        // 2. Log UI values
        System.out.println("Invested amount: " + investAmtStr);
        System.out.println("Current amount: " + currentAmtStr);
        System.out.println("Overall return percentage: " + returnPercStr);
        System.out.println("Total return amount: " + returnAmtStr);

        // 3. Clean and convert to numbers
        double investedAmount = new BigDecimal(investAmtStr.replaceAll("[^0-9.]", "")).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double currentAmount = new BigDecimal(currentAmtStr.replaceAll("[^0-9.]", "")).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double returnAmount = new BigDecimal(returnAmtStr.replaceAll("[^0-9.-]", "")).setScale(2, RoundingMode.HALF_UP).doubleValue();
        double returnPercentage = new BigDecimal(returnPercStr.replaceAll("[^0-9.-]", "")).setScale(2, RoundingMode.HALF_UP).doubleValue();

        // 4. Profit or Loss Check
        if (currentAmount > investedAmount) {
            System.out.println("📈 User is in profit.");
        } else if (currentAmount < investedAmount) {
            System.out.println("📉 User is in loss.");
        } else {
            System.out.println("⚖️  No profit, no loss.");
        }

        // 5. Expected Return Amount and Current Amount
        double expectedReturnAmount = (returnPercentage / 100.0) * investedAmount;
        double expectedCurrentAmount = investedAmount + expectedReturnAmount;

        // 6. Round all to 2 decimals
        expectedReturnAmount = Math.round(expectedReturnAmount * 100.0) / 100.0;
        expectedCurrentAmount = Math.round(expectedCurrentAmount * 100.0) / 100.0;
        returnAmount = Math.round(returnAmount * 100.0) / 100.0;
        currentAmount = Math.round(currentAmount * 100.0) / 100.0;

        // 7. Validate Return Amount
        if (expectedReturnAmount == returnAmount) {
            System.out.println("✅ Return amount calculation is correct.");
        } else {
            System.out.println("❌ Return amount mismatch. Expected: " + expectedReturnAmount + " | Actual: " + returnAmount);
        }

        // 8. Validate Current Amount
        if (expectedCurrentAmount == currentAmount) {
            System.out.println("✅ Current amount calculation is correct.");
        } else {
            System.out.println("❌ Current amount mismatch. Expected: " + expectedCurrentAmount + " | Actual: " + currentAmount);
        }
    }




    public void VerifyUSStocksTabCalculation() throws InterruptedException {
        Thread.sleep(6000);

        // Get values from UI
        String investAmtStr = USStocksInvestedAmount.getAttribute("content-desc");
        String currentAmtStr = USStocksCurrentAmount.getAttribute("content-desc");
        String returnPercStr = USStocksReturnPercentage.getAttribute("content-desc");
        String returnAmtStr = USStocksReturnAmount.getAttribute("content-desc");

        System.out.println("Invested amount is " + investAmtStr);
        System.out.println("Current amount is " + currentAmtStr);
        System.out.println("Overall return percentage " + returnPercStr);
        System.out.println("Overall Total return " + returnAmtStr);

        // Parse and round values
        double investedAmount = new BigDecimal(investAmtStr.replace("₹", "").replace(",", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        double currentAmount = new BigDecimal(currentAmtStr.replace("₹", "").replace(",", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        double returnAmount = new BigDecimal(returnAmtStr.replace("₹", "").replace(",", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        double returnPercentage = new BigDecimal(returnPercStr.replace("%", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        // Print whether profit or loss
        if (currentAmount > investedAmount) {
            System.out.println("📈 User is in profit");
        } else if (currentAmount < investedAmount) {
            System.out.println("📉 User is in loss");
        } else {
            System.out.println("⚖️  No profit, no loss");
        }

        // ✅ Recalculate values and validate
        double expectedReturnAmount = (returnPercentage / 100.0) * investedAmount;
        double expectedCurrentAmount = investedAmount + expectedReturnAmount;

        // Round all calculated values for comparison
        expectedReturnAmount = Math.round(expectedReturnAmount * 100.0) / 100.0;
        expectedCurrentAmount = Math.round(expectedCurrentAmount * 100.0) / 100.0;
        returnAmount = Math.round(returnAmount * 100.0) / 100.0;
        currentAmount = Math.round(currentAmount * 100.0) / 100.0;

        // Validation: return amount
        if (expectedReturnAmount == returnAmount) {
            System.out.println("✅ Return amount calculation is correct.");
        } else {
            System.out.println("❌ Return amount mismatch. Expected: " + expectedReturnAmount + " | Actual: " + returnAmount);
        }

        // Validation: current amount
        if (expectedCurrentAmount == currentAmount) {
            System.out.println("✅ Current amount calculation is correct.");
        } else {
            System.out.println("❌ Current amount mismatch. Expected: " + expectedCurrentAmount + " | Actual: " + currentAmount);
        }
    }



    public void VerifyGoalsTabCalculation() throws InterruptedException {
        Thread.sleep(6000);

        // 1. Get values from UI
        String investAmtStr = GoalsTabInvestedAmount.getAttribute("content-desc");
        String currentAmtStr = GoalsTabCurrentAmount.getAttribute("content-desc");
        String returnPercStr = GoalsTabReturnPercentage.getAttribute("content-desc");
        String returnAmtStr = GoalsTabReturnAmount.getAttribute("content-desc");

        // 2. Log UI values
        System.out.println("Invested amount is " + investAmtStr);
        System.out.println("Current amount is " + currentAmtStr);
        System.out.println("Overall return percentage " + returnPercStr);
        System.out.println("Overall Total return " + returnAmtStr);

        // 3. Clean and convert to double with 2 decimal rounding
        double investedAmount = new BigDecimal(investAmtStr.replace("₹", "").replace(",", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        double currentAmount = new BigDecimal(currentAmtStr.replace("₹", "").replace(",", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        double returnAmount = new BigDecimal(returnAmtStr.replace("₹", "").replace(",", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        double returnPercentage = new BigDecimal(returnPercStr.replace("%", "").trim())
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        // 4. Profit or Loss check
        if (currentAmount > investedAmount) {
            System.out.println("📈 User is in profit.");
        } else if (currentAmount < investedAmount) {
            System.out.println("📉 User is in loss.");
        } else {
            System.out.println("⚖️  No profit, no loss.");
        }

        // 5. Expected Calculations
        double expectedReturnAmount = (returnPercentage / 100.0) * investedAmount;
        double expectedCurrentAmount = investedAmount + expectedReturnAmount;

        // 6. Round for comparison
        expectedReturnAmount = Math.round(expectedReturnAmount * 100.0) / 100.0;
        expectedCurrentAmount = Math.round(expectedCurrentAmount * 100.0) / 100.0;
        returnAmount = Math.round(returnAmount * 100.0) / 100.0;
        currentAmount = Math.round(currentAmount * 100.0) / 100.0;

        // 7. Validate Return Amount
        if (expectedReturnAmount == returnAmount) {
            System.out.println("✅ Return amount calculation is correct.");
        } else {
            System.out.println("❌ Return amount mismatch. Expected: " + expectedReturnAmount + " | Actual: " + returnAmount);
        }

        // 8. Validate Current Amount
        if (expectedCurrentAmount == currentAmount) {
            System.out.println("✅ Current amount calculation is correct.");
        } else {
            System.out.println("❌ Current amount mismatch. Expected: " + expectedCurrentAmount + " | Actual: " + currentAmount);
        }
    }



    public void VerifyMFTabCalculation() throws InterruptedException {
        Thread.sleep(6000);

        try {
            // 1. Get raw UI strings
            String investAmtStr = InvestedAmount.getAttribute("content-desc");     // e.g., "₹9,100.00"
            String currentAmtStr = CurrentAmount.getAttribute("content-desc");     // e.g., "₹9,350.80"
            String returnPercStr = ReturnPercentage.getAttribute("content-desc");  // e.g., "2.76%"
            String returnAmtStr = ReturnAmount.getAttribute("content-desc");       // e.g., "₹250.80" or "-₹250.80"

            // 2. Log raw UI values
            System.out.println("Invested amount: " + investAmtStr);
            System.out.println("Current amount: " + currentAmtStr);
            System.out.println("Return percentage: " + returnPercStr);
            System.out.println("Return amount: " + returnAmtStr);

            // 3. Clean and convert strings to BigDecimal
            BigDecimal investedAmount = new BigDecimal(investAmtStr.replaceAll("[^0-9.]", "")).setScale(2, RoundingMode.HALF_UP);
            BigDecimal currentAmount = new BigDecimal(currentAmtStr.replaceAll("[^0-9.]", "")).setScale(2, RoundingMode.HALF_UP);
            BigDecimal returnAmount = new BigDecimal(returnAmtStr.replaceAll("[^0-9.\\-]", "")).setScale(2, RoundingMode.HALF_UP);
            BigDecimal returnPercentage = new BigDecimal(returnPercStr.replaceAll("[^0-9.\\-]", "")).setScale(2, RoundingMode.HALF_UP);

            // 4. Determine profit/loss
            int comparison = currentAmount.compareTo(investedAmount);
            BigDecimal expectedCurrentAmount;

            if (comparison > 0) {
                // Profit case
                expectedCurrentAmount = investedAmount.add(returnAmount).setScale(2, RoundingMode.HALF_UP);
                System.out.println("📈 User is in profit of ₹" + returnAmount);

                Assert.assertEquals(currentAmount, expectedCurrentAmount,
                        "❌ Profit case failed: Invested + Return should equal Current");

            } else if (comparison < 0) {
                // Loss case
                expectedCurrentAmount = investedAmount.subtract(returnAmount).setScale(2, RoundingMode.HALF_UP);
                System.out.println("📉 User is in loss of ₹" + returnAmount);

                Assert.assertEquals(currentAmount, expectedCurrentAmount,
                        "❌ Loss case failed: Invested - Return should equal Current");

            } else {
                // No profit/loss case
                System.out.println("⚖️  No profit or loss.");

                Assert.assertEquals(currentAmount, investedAmount,
                        "❌ No change case failed: Current should equal Invested");
            }

            System.out.println("✅ Current amount calculation verified successfully.");

        } catch (Exception e) {
            System.out.println("❌ Exception during MF tab calculation verification: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("Exception occurred in VerifyMFTabCalculation: " + e.getMessage());
        }
    }




    public void SelectUSStockSection() throws InterruptedException {
        Thread.sleep(3000);
        USStock.click();
    }

    public void SelectGoalsSection() throws InterruptedException {
        Thread.sleep(3000);
        Goals.click();
    }

    public void SelectMFSection() throws InterruptedException {
        Thread.sleep(3000);
        MF.click();
    }
}
