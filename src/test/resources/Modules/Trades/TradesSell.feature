Feature: Trades all Sell related scenarios

  @Sanity @Regression
  Scenario: User with sufficient stocks in holdings should be able to sell stocks in Rupees
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Sell
    And User enters the amount for sell
    And User Slides to Sell
    Then the sell order should be placed successfully

    #PROD DONE


  @Sanity @Regression
  Scenario: User with sufficient stocks in holdings should be able to sell stocks in Quantity
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Sell
    And User enters the Quantity for sell
    And User Slides to Sell
    Then the sell order of quantity type should be placed successfully

    #PROD DONE


  #for all order type change the stock name with low ruppes

  @Sanity @Regression
  Scenario: Validate if the user is able to place Limit order in Sell
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Sell
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Sell Quantity
    And User enters the limit price for sell
    And User selects order expiry as Till Market is closed
    And User selects order expiry as Good till market day closed
    And User Clicks On Confirm
    And User Slides to Sell
    Then Limit order in sell should be placed Successfully

    #PROD DONE



  @Sanity @Regression
  Scenario: Validate if the user is able to place Stop order in Sell
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Sell
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Sell Quantity
    And User enters the limit price for sell
    And User selects order expiry as Till Market is closed
    And User selects Stop order expiry as Good till Cancelled
    And User Clicks On Confirm
    And User Slides to Sell
    Then Stop order in sell should be placed Successfully

   #PROD DONE


  @Sanity @Regression
  Scenario: Validate if the user is able to place MIT order in Sell
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Sell
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Sell Quantity
    And User enters the limit price for sell
    And User selects order expiry as Till Market is closed
    And User selects MIT order expiry as Custom Date
    And User Clicks On Confirm
    And User Slides to Sell
    Then MIT order in sell should be placed Successfully

   ##PROD DONE

  @Sanity @Regression
  Scenario: Validate Quantity in holding is decreased after selling the stock in Quantity during Market close
    Given User is on Trade dashboard
    And User checks the current holdings and clicks on Stock
    And User clicks on Sell
    And User enters the Quantity to sell
    And User Slides to Sell
   # And User Clicks on Go to home dashboard
    Then Quantity in Holdings should decrease and minus sign should display

    #CONFIMR IT


  @Sanity @Regression
  Scenario: Once the user sells stock in market close then all data points like P&L, total invested and current value should remain as it is until the order is processed
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Sell
    And User selects order type as Sell in Rupees
    And User enters the amount for sell
    And User Slides to Sell
    Then Current P and L, Current Investment and Current Amount should not change when the order is placed in Market close

#xpath issue

  @Sanity
  Scenario: Check when stocks are sold during off market, then Amount held will be = Original Amount of Stock hold - Sold amount of stock
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User navigates to Activity tab and notice the Current Amount
    And User clicks on Sell
    And User selects order type as Sell in Rupees
    And User enters the amount for sell order
    And User Slides to Sell
       #And User Clicks on Go to home dashboard
    And User clicks on Stock
    Then Current Amount on Activity should be decreased by equivalent to sold amount of the stock

    #not getting xpath for current amt in activity tab



  @Sanity
  Scenario: Check Activity tab after sell, it should show the recent stock sold as a card item.
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Sell
    And User selects order type as Sell in Rupees
    And User enters the amount for sell and notices the estimated quantity as per the entered amount
    #And User clicks on review order button
    #And User notices the Order Quantity, Trade amount
    #And User clicks on place order
    And User Slides to Sell
    And User notices the Order Quantity and Estimated Price
    And User Clicks on Go to home dashboard
    And User clicks on Stock
    And User navigates to Activity tab
    Then Order status should be Successfull with correct details

