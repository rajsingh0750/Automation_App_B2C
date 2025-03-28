package com.appreciatewealth.pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class WatchlistPage extends BasePage {
    BasePage basePage = new BasePage();
    SignInPage signInPage = new SignInPage();


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Watchlist\n" +
            "Tab 4 of 5\"]")
    private WebElement WatchlistTab;


    @AndroidFindBy(accessibility = "Add stock")
    private WebElement AddStockButton;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"RGLD\n" +
            "Royal Gold, Inc.\n" +
            "₹13,119.82\n" +
            "12.01%\"]/android.view.View")
    private WebElement YearHighTodayStockHeartIcon;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"RGLD\n" +
            "Royal Gold, Inc.\n" +
            "₹11,963.60\n" +
            "12.01%\"]")
    private WebElement RGLDStock;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"RGLD\n" +
            "Royal Gold, Inc.\n" +
            "₹13,122.84\n" +
            "12.01%\"]/android.view.View")
    private WebElement RemoveRGLDFromYearHighStocks;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'UAVS') and contains(@content-desc, 'AGEAGLE AERIAL SYSTEMS INC')]")
    private WebElement UavsStock;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AAPY\n" +
            "Kurv Yield Premium Strategy Apple AAPL ETF\n" +
            "ETF\"]/android.view.View")
    private WebElement StockHeartIcon;


    @AndroidFindBy(accessibility = "Added to watchlist successfully")
    private WebElement StockAddedWatchlistMsg;


    @AndroidFindBy(accessibility = "Watchlist")
    private WebElement VerifyWatchlistPage;


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AAPY') and contains(@content-desc, 'Kurv Yield Premium Strategy Apple AAPL ETF')]")
    private WebElement AAPYStockName;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AAPY') and contains(@content-desc, 'Kurv Yield Premium Strategy Apple AAPL ETF')]/android.view.View")
    private WebElement RemoveAAPYStock;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    private WebElement SearchBar;


   // @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AAPD DIREXION DAILY AAPL BEAR 1X')]/android.view.View")


    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AAPL') and contains(@content-desc, 'Apple, Inc.')]/android.view.View")
    private WebElement AAPLRemoveStock;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"UAVS\n" +
            "AGEAGLE AERIAL SYSTEMS INC\n" +
            "₹117.15\n" +
            "41.16%\"]/android.view.View")
    private WebElement RemoveUAVSFromPopularStocks;


    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.ImageView")
    private WebElement RemoveToast;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Search\n" +
            "Tab 3 of 5\"]")
    @iOSXCUITFindBy(accessibility = "Search\n" +
            "Tab 3 of 4")

    private WebElement SearchTab;


    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.ImageView")
    private WebElement EnterStockName2;





    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AAPL\n" +
            "Apple, Inc.\n" +
            "EQUITY\"]/android.view.View")
    private WebElement HeartIcon;



    @AndroidFindBy(accessibility = "Create new watchlist")
    private WebElement WatchlistsBotoomSheet;



    @AndroidFindBy(accessibility = "Testing")
    private WebElement TestingWatchlist;


    @AndroidFindBy(accessibility = "demo")
    private WebElement demoWatchlist;

    @AndroidFindBy(accessibility = "Save")
    private WebElement SaveButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"TSLA\n" +
            "Tesla, Inc.\n" +
            "EQUITY\"]")
    private WebElement TeslaStock;


    @AndroidFindBy(accessibility = "Save")
    private WebElement EditWatchlistSaveButton;


    @AndroidFindBy(accessibility = "Watchlist name updated successfully")
    private WebElement WatchlistUpdateSuccessMsg;


    @AndroidFindBy(accessibility = "This name is taken, try another watchlist name")
    private WebElement WatchlistNameError;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]")
    private WebElement SearchAndAddPageBackArrow;


    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'Testing')]")
    private WebElement CreatedWatchlistName;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@content-desc, 'demo')]")
    private WebElement DemoWatchlistName;


    @AndroidFindBy(accessibility = "Add")
    private WebElement addBtn;


    @AndroidFindBy(xpath = "//*[@text='Testing']")
    private WebElement BeforeWatchlistName;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement EnterWatchlistNameSameAsBefore;


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    private WebElement SearchArea;

    @AndroidFindBy(accessibility = "Watchlist changes saved")
    private WebElement AddingWatchlistToast;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]")
    private WebElement EnterSearchArea;




   // @AndroidFindBy(xpath = "//*[contains(@content-desc, 'AAPD DIREXION DAILY AAPL BEAR 1X')]")

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, 'AAPL') and contains(@content-desc, 'Apple, Inc.')]")
    private WebElement StockNames;




    @AndroidFindBy(accessibility = "Search and add to watchlist")
    private WebElement SearchAndAddToWatchlist;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"TSLA\n" +
            "Tesla, Inc.\n" +
            "EQUITY\"]/android.view.View")
    private WebElement HeartIconForTSLAStock;


    @AndroidFindBy(accessibility = "Search and add to watchlist")
    private WebElement Watchlistbox;


    @AndroidFindBy(accessibility = "Search and add to watchlist")
    private WebElement Watchlistbox1;


//    @AndroidFindBy(accessibility = "Search and add to watchlist")
//    private WebElement WatchlistNameFour;
//
//    @AndroidFindBy(accessibility = "Search and add to watchlist")
//    private WebElement WatchlistNameThree;
//
//    @AndroidFindBy(accessibility = "Search and add to watchlist")
//    private WebElement WatchlistNameTwo;
//
//    @AndroidFindBy(accessibility = "Search and add to watchlist")
//    private WebElement WatchlistName;





    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"View all\"])[1]")
    private WebElement ViewAllButton;

    @AndroidFindBy(accessibility = "Edit")
    private WebElement EditButton;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]")
    private WebElement DeleteButton;

    @AndroidFindBy(accessibility = "Yes")
    private WebElement YesButton;

    @AndroidFindBy(accessibility = "Watchlist")
    private WebElement Watchlistpage;


    @AndroidFindBy(accessibility = "View all")
    private WebElement ViewAll;


    @AndroidFindBy(accessibility = "No results for ' '")
    private WebElement NoResultError;

    @AndroidFindBy(xpath = "//android.view.View[contains(@content-desc, ' items')]")
    private WebElement TopPicksStocksCount;


    @AndroidFindBy(accessibility = "Create")
    private WebElement CreateButton;

    @AndroidFindBy(accessibility = "Create")
    private WebElement WatchlistCreateButton;



    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement EnterWatchlistName;


    @AndroidFindBy(accessibility = "Please enter watchlist name")
    private WebElement SpecialCharacterErrorMessage;


    @AndroidFindBy(accessibility = "Scrim")
    private WebElement CrossBtn;



    @AndroidFindBy(accessibility = "Sort")
    private WebElement SortButton;

    @AndroidFindBy(accessibility = "Current price")
    private WebElement CurrentPriceOption;

    @AndroidFindBy(accessibility = "Apply")
    private WebElement ApplyButton;



    @AndroidFindBy(accessibility = "Day change %")
    private WebElement DayChangePercentage;

    @AndroidFindBy(accessibility = "Company (A-Z)")
    private WebElement CompanyAZ;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"AAPD\n" +
            "DIREXION DAILY AAPL BEAR 1X\n" +
            "ETF\"]")
    private WebElement SelectTheStock;


    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"test\"]")
    private WebElement EditWatchlistName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Amazon\"]")
    private WebElement EditAmazonWatchlistName;



    @AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement EnterEditWatchlistName;


    @AndroidFindBy(xpath = "//*[@text='Watchlist 2']")
    private WebElement ByDefaultWatchlist;

    @AndroidFindBy(xpath = "//*[@text='Watchlist 3']")
    private WebElement ByDefaultThirdWatchlist;

    @AndroidFindBy(xpath = "//*[@text='Watchlist 4']")
    private WebElement ByDefaultfourthWatchlist;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"UAVS\n" +
            "AGEAGLE AERIAL SYSTEMS INC\n" +
            "₹117.15\n" +
            "41.16%\"]/android.view.View")
    private WebElement UAVSPopularStockHeartIcon;



    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"\uE16A\"]")
    private WebElement ClearCrossCTA;



    @AndroidFindBy(accessibility = "No results for 'amazon'")
    private WebElement NoResultsForAmazon;


    public WatchlistPage() {
        this.basePage = new BasePage();
        this.signInPage = new SignInPage();

    }

    public void SelectWatchlistTab() throws InterruptedException {
        Thread.sleep(4000);
        WatchlistTab.click();
    }

    public void SelectAddStockButton() throws InterruptedException {
        Thread.sleep(3000);
        AddStockButton.click();
    }

    public void SelectStockHeartIcon() throws InterruptedException {
        Thread.sleep(4000);
//        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
//        Thread.sleep(2000);
        StockHeartIcon.click();
    }

    public void VerifySuccessMsg(String message) throws InterruptedException {
        //Thread.sleep(3000);
        StockAddedWatchlistMsg.isDisplayed();

    }

    public void VerifyWatchlistPage() throws InterruptedException {
        Thread.sleep(3000);
        VerifyWatchlistPage.isDisplayed();
    }

    public void VerifyStockName() throws InterruptedException {
        Thread.sleep(3000);
        AAPYStockName.isDisplayed();
    }

    public void EnterStockName(String name) throws InterruptedException {
        Thread.sleep(4000);
        SearchBar.click();
        Thread.sleep(2000);
        SearchBar.sendKeys(name);
        Thread.sleep(2000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));

    }

    public void SelectSearchTabOnDashboard() throws InterruptedException {
        Thread.sleep(4000);
        SearchTab.click();
    }

    public void EnterStockNameUnderSearchPage(String name) throws InterruptedException {
        Thread.sleep(4000);
        EnterStockName2.click();
        Thread.sleep(2000);
        EnterStockName2.sendKeys(name);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));

    }

    public void SelectHeartIcon() throws InterruptedException {
        Thread.sleep(3000);
        HeartIcon.click();
    }

    public void VerifyWatchlistsBotoomSheet() throws InterruptedException {
        Thread.sleep(3000);
        WatchlistsBotoomSheet.isDisplayed();
    }

    public void SelectWatchlistfromBotoomSheet() throws InterruptedException {
        Thread.sleep(3000);
        TestingWatchlist.click();
    }

    public void SelectSaveButton() throws InterruptedException {
        Thread.sleep(3000);
        EditWatchlistSaveButton.click();
    }

    public void VerifyStockNames() throws InterruptedException {
        Thread.sleep(3000);
        StockNames.isDisplayed();
    }

    public void SelectSearchAndAddToWatchlistPage() throws InterruptedException {
        Thread.sleep(3000);
        SearchAndAddToWatchlist.click();
    }

    public void SelectHeartIconForAnotherStock() throws InterruptedException {
        Thread.sleep(3000);
        HeartIconForTSLAStock.click();
    }

    public void SelectSelectsMultipleWatchlistsForSameStock1() throws InterruptedException {
        Thread.sleep(3000);
//        Watchlistbox.click();
//        Watchlistbox1.click();

//        int x =618;
//        int y = 1007;
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(List.of(tap));

        TestingWatchlist.click();



    }

    public void SelectSelectsMultipleWatchlistsForSameStock2() throws InterruptedException {
        Thread.sleep(2000);
//        int p =618;
//        int q = 1149;
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
//        Sequence tap = new Sequence(finger, 1);
//        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), p, q));
//        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
//        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
//        driver.perform(List.of(tap));
          demoWatchlist.click();
    }

//    public void VerifyWatchlistNames() throws InterruptedException {
//        Thread.sleep(3000);
//        WatchlistNameFour.isDisplayed();
//        WatchlistNameThree.isDisplayed();
//        WatchlistNameTwo.isDisplayed();
//        WatchlistName.isDisplayed();
//
//    }

    public void SelectsOneWatchlist() throws InterruptedException {
        Thread.sleep(3000);

    }

    public void VerifyStocksUnderThatWatchlist() throws InterruptedException {
        Thread.sleep(3000);

    }

    public void SelectViewAllButton() throws InterruptedException {
        Thread.sleep(4000);
        ViewAllButton.click();
    }

    public void SelectEditButton() throws InterruptedException {
        Thread.sleep(3000);
        EditButton.click();
    }

    public void SelectDeleteButton() throws InterruptedException {
        Thread.sleep(3000);
        // DeleteButton.click();
        int x =632;
        int y = 150;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

    }

    public void SelectYesButton() throws InterruptedException {
        Thread.sleep(3000);
        YesButton.click();
    }

    public void VerifyDeletedWatchlist() throws InterruptedException {
        Thread.sleep(3000);
        Watchlistpage.isDisplayed();
    }

    public void VerifyUpdatedWatchlistName() {

    }

    public void VerifyErrorMessage(String newWatchlistNameIsRequired) throws InterruptedException {
        Thread.sleep(5000);
//        String CommentMsg = errorcomment.getText();
//        Assert.assertEquals(newWatchlistNameIsRequired, CommentMsg);
    }

    public void VerifyErrorMessage2(String s) throws InterruptedException {
        Thread.sleep(4000);
         String no_result = NoResultError.getAttribute("content-desc");
         Assert.assertEquals(no_result, s);
    }

    public void GotoTopPicksFund() throws InterruptedException {
        Thread.sleep(5000);
        int maxScrolls = 2;
        int scrollCount = 0;
        boolean canScrollMore = true;

        while (scrollCount < maxScrolls && canScrollMore) {
            canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 600, "height", 700,
                    "direction", "down",
                    "percent", 1.0
            ));

            // Increment the scroll count
            scrollCount++;
        }
        Thread.sleep(3000);
        ViewAll.click();

    }

    public void VerifyCountOfTopPicksStocks() throws InterruptedException {
        Thread.sleep(3000);
        String accessibilityId = TopPicksStocksCount.getAttribute("content-desc");

        String regex = "(\\d+) items";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(accessibilityId);

        if (matcher.find()) {
            String number = matcher.group(1);
            System.out.println("The numeric value is: " + number);
        } else {
            System.out.println("No numeric value found before 'items'.");
        }
    }

    public void SelectCreateButton() throws InterruptedException {
        Thread.sleep(5000);
        CreateButton.click();
    }

    public void EnterSpecialCharactersForWatchlistName(String InvalidStock) throws InterruptedException {
        Thread.sleep(5000);
        ByDefaultfourthWatchlist.click();
        Thread.sleep(2000);
        ByDefaultfourthWatchlist.clear();
        Thread.sleep(2000);
        EnterWatchlistName.click();
        Thread.sleep(2000);
        EnterWatchlistName.sendKeys(InvalidStock);


    }


    public void VerifySpecialCharacterErrorMessage(String msg) throws InterruptedException {
        Thread.sleep(5000);
        String CommentMsg = SpecialCharacterErrorMessage.getAttribute("content-desc");
        Assert.assertEquals(msg, CommentMsg);
        CrossBtn.click();
    }

    public void SelectSortButton() throws InterruptedException {
        Thread.sleep(5000);
        SortButton.click();
    }

    public void SelectCurrentPriceOption() throws InterruptedException {
        Thread.sleep(3000);
        CurrentPriceOption.click();
    }

    public void SelectapplyButton() throws InterruptedException {
        Thread.sleep(3000);
        ApplyButton.click();
    }

    public void SelectDayChangePercentageOption() throws InterruptedException {
        Thread.sleep(3000);
        DayChangePercentage.click();
    }

    public void SelectCompanyAZOption() throws InterruptedException {
        Thread.sleep(3000);
        CompanyAZ.click();
    }

    public void SelectStock() throws InterruptedException {
        Thread.sleep(3000);
        SelectTheStock.click();
    }

    public void EntersTheWatchlistName(String test) throws InterruptedException {
        Thread.sleep(4000);
        ByDefaultThirdWatchlist.click();
        Thread.sleep(2000);
        ByDefaultThirdWatchlist.clear();
        Thread.sleep(2000);
        EnterWatchlistName.sendKeys(test);
    }

    public void EditTheWatchlistName() throws InterruptedException {
        Thread.sleep(4000);
        EditWatchlistName.click();
        EditWatchlistName.clear();
        EnterEditWatchlistName.sendKeys("watchlist5");
        Thread.sleep(2000);

    }


    public void ClickOnSaveBtn() throws InterruptedException {
        Thread.sleep(4000);
        SaveButton.click();

    }

    public void EditWatchlistName(String name) throws InterruptedException {
        Thread.sleep(4000);
        EditAmazonWatchlistName.click();
        EditAmazonWatchlistName.clear();
        EnterEditWatchlistName.sendKeys(name);
        Thread.sleep(2000);

    }

    public void SelectcreateButton() throws InterruptedException {
        Thread.sleep(3000);
        WatchlistCreateButton.click();
    }

    public void SelectEditWatchlistSaveButton() throws InterruptedException {
        Thread.sleep(3000);
        EditWatchlistSaveButton.click();
    }

    public void ComeToWatchlistPage() throws InterruptedException {
        Thread.sleep(6000);
        SearchAndAddPageBackArrow.click();

    }

    public void VerifyCreatedWatchlist() throws InterruptedException {
        Thread.sleep(3000);
        CreatedWatchlistName.isDisplayed();

    }

    public void SelectaddBtn() throws InterruptedException {
        Thread.sleep(3000);
        addBtn.click();
    }

    public void RemoveStock() throws InterruptedException {
        Thread.sleep(3000);
        RemoveAAPYStock.click();

    }

    public void VerifyingAddingWatchlistToast() throws InterruptedException {
        Thread.sleep(2000);
        AddingWatchlistToast.isDisplayed();
    }

    public void EnterStockNameUnderSearchAndAddPage(String stname) throws InterruptedException {
        Thread.sleep(3000);
        SearchArea.click();
        Thread.sleep(2000);
        EnterSearchArea.sendKeys(stname);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));


    }

    public void EditWatchlistNameAsBefore() throws InterruptedException {
        Thread.sleep(3000);
        BeforeWatchlistName.click();
        BeforeWatchlistName.clear();
        Thread.sleep(2000);
        EnterWatchlistNameSameAsBefore.sendKeys("Testing");
        Thread.sleep(2000);
        EditWatchlistSaveButton.click();

    }

    public void VerifyEditWatchlistSuccessMsg() {
        WatchlistUpdateSuccessMsg.isDisplayed();
    }

    public void VerifyWatchlistNameError(String werror) throws InterruptedException {
        Thread.sleep(3000);
       String temp =  WatchlistNameError.getAttribute("content-desc");
       Assert.assertEquals(temp, werror);
        Thread.sleep(2000);
        CrossBtn.click();

    }

    public void ClickOnPopularStockHeartIcon() throws InterruptedException {
        Thread.sleep(5000);
        //UAVSPopularStockHeartIcon.click();
        int x =438;
        int y = 1316;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void SelectCreatedWatchlist() throws InterruptedException {
        Thread.sleep(3000);
       // DemoWatchlistName.click();
        TestingWatchlist.click();
    }

    public void VerifyStockFromPopularStocks() throws InterruptedException {
        Thread.sleep(4000);
        WatchlistTab.click();
        Thread.sleep(3000);
      //  UavsStock.isDisplayed();

       // Removing Popular Stock Added
        int x =623;
        int y = 649;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        Thread.sleep(3000);

        AddStockButton.isDisplayed();

    }

    public void RemoveAAPDStock() throws InterruptedException {
        Thread.sleep(3000);
     //   AAPDRemoveStock.click();
        AAPLRemoveStock.click();
    }

    public void VerifyRemoveToast() throws InterruptedException {
        Thread.sleep(3000);
        //RemoveToast.isDisplayed();
    }

    public void EnterWatchlistNameAgain(String test) throws InterruptedException {
        Thread.sleep(5000);
        ByDefaultfourthWatchlist.click();
        Thread.sleep(2000);
        ByDefaultfourthWatchlist.clear();
        Thread.sleep(2000);
        EnterWatchlistName.sendKeys(test);
    }

    public void RemoveFromPopularStocks() throws InterruptedException {
        Thread.sleep(5000);
       // RemoveUAVSFromPopularStocks.click();
        int x =442;
        int y = 1316;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
        Thread.sleep(3000);
        TestingWatchlist.click();
        EditWatchlistSaveButton.click();
    }

    public void VerifyStockRemoveUnderWatchlist() throws InterruptedException {
        Thread.sleep(3000);
        WatchlistTab.click();
        Thread.sleep(2000);
        AddStockButton.isDisplayed();
    }

    public void ClickOnYearHighTodayStockHeartIcon() throws InterruptedException {
        Thread.sleep(5000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        //YearHighTodayStockHeartIcon.click();
        int x =440;
        int y = 1390;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void VerifyStockFromYearHighTodayStocks() throws InterruptedException {
        Thread.sleep(4000);
        WatchlistTab.click();

        Thread.sleep(3000);
        int x =623;
        int y = 649;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        Thread.sleep(3000);

        AddStockButton.isDisplayed();
    }

    public void RemoveFromYearHighTodayStocks() throws InterruptedException {
        Thread.sleep(4000);
        int x =440;
        int y = 1390;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
        Thread.sleep(2000);
        TestingWatchlist.click();
        Thread.sleep(2000);
        SaveButton.click();
    }


    public void ClickOnTopGainerStockHeartIcon() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        boolean canScrollMore = (Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 600, "height", 700,
                "direction", "down",
                "percent", 1.0
        ));
        Thread.sleep(3000);
        int x =483;
        int y = 1333;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

    }

    public void VerifyStockFromTopGainer() throws InterruptedException {
        Thread.sleep(4000);
        WatchlistTab.click();
        Thread.sleep(3000);
        int x =623;
        int y = 649;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));

        Thread.sleep(3000);

        AddStockButton.isDisplayed();
    }

    public void RemoveFromTopGainers() throws InterruptedException {
        Thread.sleep(4000);
        int x =483;
        int y = 1333;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
        Thread.sleep(2000);
        TestingWatchlist.click();
        Thread.sleep(2000);
        SaveButton.click();
    }

    public void ClickOnTopLosersStockHeartIcon() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 2; i++) {
            driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollToEnd(1)"));
        }
        Thread.sleep(3000);
        int x =440;
        int y = 1367;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void RemoveFromTopLosers() throws InterruptedException {
        Thread.sleep(4000);
        int x =440;
        int y = 1367;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
        Thread.sleep(2000);
        TestingWatchlist.click();
        Thread.sleep(2000);
        SaveButton.click();
    }

    public void ClickOnRecentlyViewedHeartIcon() throws InterruptedException {
        Thread.sleep(4000);
        int x =625;
        int y = 916;
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1);
        tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
        tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(tap));
    }

    public void SelectTeslaStock() throws InterruptedException {
        Thread.sleep(4000);
        TeslaStock.click();
    }

    public void ClearSearch() throws InterruptedException {
        Thread.sleep(3000);
        ClearCrossCTA.click();
    }

    public void VerifyNoResultsForAmazon() throws InterruptedException {
        Thread.sleep(3000);
        NoResultsForAmazon.isDisplayed();
    }
}

