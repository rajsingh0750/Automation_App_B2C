package com.appreciatewealth.pages;
import java.io.BufferedReader;

import com.appreciatewealth.utils.*;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.*;
import java.util.Properties;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static io.appium.java_client.touch.offset.PointOption.point;



public class BasePage {
    public static String OTP;
    public static String otp;
    PropertyManager props = new PropertyManager();

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView\n" + "\t")
    WebElement ProfileSettings;

    @AndroidFindBy(xpath = "//*[@text='Logout']")
    WebElement LogoutButton;

    @AndroidFindBy(id ="//*[@text='Clear all']")
    WebElement CloseRecentApp;


    public static AppiumDriver driver;

    TestUtils utils = new TestUtils();

    public BasePage(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public void waitForVisibility(WebElement e, Duration duration) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public static void ClearCache(int choice){
      /*  if (choice == 1) {
            caps.setCapability(MobileCapabilityType.NO_RESET, false);
            caps.setCapability(MobileCapabilityType.FULL_RESET, true);
        } else {
            caps.setCapability(MobileCapabilityType.NO_RESET, true);
            caps.setCapability(MobileCapabilityType.FULL_RESET, false);

        }*/



    }

    public  void Logout() throws InterruptedException {

        //ProfileSettings.click();
        Thread.sleep(6000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector()" + ".textMatches(\"Logout\").instance(0))"));
        LogoutButton.click();
        //((AndroidDriver)driver).terminateApp("com.appreciatewealth.android.uat");
        Thread.sleep(6000);
    }
    public static void KillApp(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        //driver.pressKey(new KeyEvent(AndroidKey.HOME));
        //driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        //Thread.sleep(3000);
        //CloseRecentApp.click();
      /*driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        Thread.sleep(2000);
        boolean canScrollMore = true;
        while (canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 1130,
//                "elementId", ((RemoteWebElement) element).getId(),
                    "direction", "down",
                    "percent", 1.0
            ));
        }*/

    }

    public   void  KillAppRealMe(AndroidDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
        Thread.sleep(4000);
        //CloseRecentApp.click();
        WebElement element = driver.findElement(AppiumBy.xpath("//*[@text='Clear all']"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));

    }

    public static void ClickSignOut(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(2000);
    /*WebElement element= driver.findElement(AppiumBy.xpath("//*[contains(@text,'sign out')]"));
       // WebElement element4 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));*/
        int x =415;
        int y = 225;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        // System.out.println(text);

    }
    public static String FormattedDateWithAddedDays() {
        Date currentDate = new Date();

        // Create a Calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Add 90 days to the date
        calendar.add(Calendar.DAY_OF_YEAR, 90);

        // Get the updated date
        Date updatedDate = calendar.getTime();

        // Check if the updated date falls on a weekend
        calendar.setTime(updatedDate);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek == Calendar.SATURDAY) {
            // If Saturday, add 2 days to make it Monday
            calendar.add(Calendar.DAY_OF_YEAR, 2);
        } else if (dayOfWeek == Calendar.SUNDAY) {
            // If Sunday, add 1 day to make it Monday
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }

        // Get the final adjusted date
        updatedDate = calendar.getTime();

        // Create a SimpleDateFormat with the desired format pattern
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        // Format the adjusted date and return it as a string
        return dateFormat.format(updatedDate);
    }


    public static String GetCurrentDate(){
        Date currentDate = new Date();

        // Create a Calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
        return dateFormat.format(currentDate);
    }

    public String CopyOTPFromMessage() throws InterruptedException, IOException {
        Thread.sleep(3000);
//((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(5));
//Thread.sleep(3000);
        ((AndroidDriver) driver).activateApp("com.google.android.apps.messaging");
        Thread.sleep(3000);

        OTP = driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@content-desc=\"Conversation list\"]/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.TextView[2]")).getText();
        String pattern = "\\b\\d{6}\\b";

// Create a Pattern object
        Pattern r = Pattern.compile(pattern);

// Create a Matcher object
        Matcher matcher = r.matcher(OTP);

        if (matcher.find()) {
            otp = matcher.group(0);
            System.out.println("Found OTP: " + otp);
        } else {
            System.out.println("OTP not found in the content.");
        }
        //((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//        boolean canScrollMore = true;
//        while (canScrollMore) {
//            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
//                    "left", 100, "top", 100, "width", 600, "height", 600,
//// "elementId", ((RemoteWebElement) element).getId(),
//                    "direction", "down",
//                    "percent", 1.0
//            ));
        Thread.sleep(5000);
        //BasePage.SwipeUP();
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@text='WORK']")).click();


        ((AndroidDriver) driver).activateApp(ConfigLoader.getInstance().getProperty("androidAppPackage"));




        return otp;
    }

    public static void SwipeUP() throws InterruptedException {
        Thread.sleep(2000);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
        Thread.sleep(3000);
    /*WebElement element= driver.findElement(AppiumBy.xpath("//*[contains(@text,'sign out')]"));
       // WebElement element4 = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView"));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId()
        ));*/
        int startX = 352;
        int startY = 1075;
        int endY = 700;  // Adjust this value for the end position of the swipe

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipeUp = new Sequence(finger, 1);

// Move to the starting position
        swipeUp.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));

// Press down to start the swipe
        swipeUp.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));

// Move to the end position to simulate the swipe
        swipeUp.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), startX, endY));

// Release the button to complete the swipe
        swipeUp.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(List.of(swipeUp));


        // System.out.println(text);

    }
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }


    public void ClickProfileSettings() throws InterruptedException {
        Thread.sleep(10000);
        ProfileSettings.click();
    }
    public void AndroidBack() throws InterruptedException {
        Thread.sleep(5000);
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void clear(WebElement e) {
        waitForVisibility(e, Duration.ofSeconds(5));
        e.clear();
    }

    public static String formatDateWithAddedYears() {
        // Get the current date
        Date currentDate = new Date();

        // Create a Calendar instance and set it to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Add 10 years to the date
        calendar.add(Calendar.YEAR, 20);

        // Get the updated date
        Date updatedDate = calendar.getTime();

        // Create a SimpleDateFormat with the desired format pattern
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");

        // Format the updated date and return it as a string

        return dateFormat.format(updatedDate);
    }

    public void click(WebElement e) {
        waitForVisibility(e, Duration.ofSeconds(5));
        e.click();
    }

    public void click(WebElement e, String msg) {
        waitForVisibility(e, Duration.ofSeconds(5));
        utils.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e, Duration.ofSeconds(5));
        e.sendKeys(txt);
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        waitForVisibility(e, Duration.ofSeconds(5));
        utils.log().info(msg);
        e.sendKeys(txt);
    }

    public String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e, Duration.ofSeconds(5));
        return e.getAttribute(attribute);
    }

    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }

    public String getText(WebElement e, String msg) {
        String txt;
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public String getText(By e, String msg) {
        String txt;
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                txt = getAttribute(e, "text");
                break;
            case "iOS":
                txt = getAttribute(e, "label");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
        utils.log().info(msg + txt);
        return txt;
    }

    public void closeApp() {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                break;
            case "iOS":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
    }

    public void launchApp() {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                break;
            case "iOS":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
    }

    public WebElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
                        + "new UiSelector()."+ childLocAttr +"(\"" + childLocValue + "\"));"));
    }

    public WebElement iOSScrollToElementUsingMobileScroll(WebElement e) {
        RemoteWebElement element = ((RemoteWebElement) e);
        String elementID = element.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", elementID);
//	  scrollObject.put("direction", "down");
//	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
//	  scrollObject.put("name", "test-ADD TO CART");
        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        return e;
    }

    public By iOSScrollToElementUsingMobileScrollParent(WebElement parentE, String predicateString) {
        RemoteWebElement parent = (RemoteWebElement)parentE;
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", parentID);
//	  scrollObject.put("direction", "down");
        scrollObject.put("predicateString", predicateString);
//	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
        driver.executeScript("mobile:scroll", scrollObject);
        By m = MobileBy.iOSNsPredicateString(predicateString);
        System.out.println("Mobilelement is " + m);
        return m;
    }

/*    public MobileElement scrollToElement(MobileElement element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if(!isFound){
            throw new Exception("Element not found");
        }
        return element;
    }

    public By scrollToElement(By element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 3; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if(!isFound){
            throw new Exception("Element not found");
        }
        return element;
    }*/

    public boolean find(final WebElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public boolean find(final By element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (driver.findElement(element).isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

/*    public void swipe(int startX, int startY, int endX, int endY, int millis)
            throws InterruptedException {
        TouchAction t = new TouchAction(driver);
        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
                .perform();
    }*/
}
