Feature: UAT TRADE BUY SCENARIOS

  Scenario: Validate if user stop the buy journey and come to dashboard
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    When User come back to home dashboard
    Then User should see the resume buying event at home dashboard
    And User click on Buy now cta under continue where left section
    And User clicks on Buy now for a stock
    And User enters the amount
    And User Slides to Buy
    Then the order should be placed successfully



  Scenario: Validate general Buy flow for stock
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully




  Scenario: Validate All Buy scenarios for Limit type order on UAT
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User selects order expiry as Till Market is closed
    And User selects order expiry as Good till market day closed
    And User Clicks On Confirm
    And User Slides to Buy
    Then Limit order will be placed Successfully
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User selects order expiry as Till Market is closed
    And User selects Limit order expiry as Good till Cancelled
    And User Clicks On Confirm
    And User Slides to Buy
    Then Limit order will be placed Successfully
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User selects order expiry as Till Market is closed
    And User selects Limit order expiry as Custom Date
    And User Clicks On Confirm
    And User Slides to Buy
    Then Limit order will be placed Successfully for all order types




  Scenario: Validate All Buy type scenarios for Stop type order
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Pro type order Quantity
    And User enters the Stop price
    And User selects order expiry as Till Market is closed
    And User selects Limit order expiry as Good till Cancelled
    And User Clicks On Confirm
    And User Slides to Buy
    Then Stop order should be placed Successfully
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Pro type order Quantity
    And User enters the Stop price
    And User selects order expiry as Till Market is closed
    And User selects Stop order expiry as Good till Cancelled
    And User Clicks On Confirm
    And User Slides to Buy
    Then Stop order should be placed Successfully
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Pro type order Quantity
    And User enters the Stop price
    And User selects order expiry as Till Market is closed
    And User selects Stop order expiry as Custom Date
    And User Clicks On Confirm
    And User Slides to Buy
    Then Stop order will be placed Successfully for all order types




  Scenario: Validate All Buy type scenarios for MIT type order
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Pro type order Quantity
    And User enters the MIT Target price
    And User selects order expiry as Till Market is closed
    And User Clicks On Confirm
    And User Slides to Buy
    Then MIT order should be placed Successfully
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Pro type order Quantity
    And User enters the MIT Target price
    And User selects order expiry as Till Market is closed
    And User selects MIT order expiry as Good till Cancelled
    And User Clicks On Confirm
    And User Slides to Buy
    Then MIT order should be placed Successfully
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Pro type order Quantity
    And User enters the MIT Target price
    And User selects order expiry as Till Market is closed
    And User selects MIT order expiry as Custom Date
    And User Clicks On Confirm
    And User Slides to Buy
    Then MIT order should be placed Successfully



  @UAT_Final
  Scenario: Validate all error msg during buy journey
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    When User Slides to Buy
    Then User should see without enter amount and quantity error message "Please enter amount or qty to proceed"
    When User enter the quantity more then UPI limit
    Then User should see the UPI limit error message per transaction as "UPI limit : ₹1,00,000.00 per transaction"
    When User enters an amount greater than the limit of "$250,000 or ₹2,18,43,250.00" as of today
    Then User should see the maximum transaction limit error as of today "Transaction Limit: $250,000 (₹2,18,43,250.00 as of today)"
    When User try to enter the purchase amount more then his buying power
    Then User should see low funds error message as "Low funds! Add funds from YES Bank to trade"
    When User enters the amount less than the minimum transaction amount
    Then User should see the minimum transaction amount error "Minimum Transaction Amount Should be greater than ₹0.88 INR"


    #Assertion left due to xpath , ask extract and add


  @UAT_Final
  Scenario: Validate Trade Buy Amt and quantity calculation
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks on Prod App
    And User click on the Stock on Prod App
    And User clicks on Buy now for a stock
    When User enters the purchase amount
    Then User should see the correct calculation for quantity field
    When User enters the purchase quantity
    Then User should see the correct calculation for amount field
    When User click on total fee dropdown
    Then User should see the correct calculation for quantity and platform fees

