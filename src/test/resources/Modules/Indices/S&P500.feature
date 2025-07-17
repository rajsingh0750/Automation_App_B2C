Feature: S&P500 Indices



  Scenario: Verify if the "S&P 500" CTA is active in the drop down list
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    Then User should see market indices page


  Scenario: Verify the details seen on screen after selecting "S&P 500" CTA And Navigation of DOW and NASDAQ
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    Then User should see S&P page details

  Scenario: Verify if "←" CTA on the left side of "Market Indices" heading is active
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User select back arrow at market indices page
    Then User should see the home dashboard


  Scenario: Verify function of "Top Holdings" section
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    When User click on Buy button
    Then User should be redirected to enter amount and quantity page

    #right now stock is not clickable


  Scenario: Verify function of "Invest via ETFs" section
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock under invest via ETFs section
    When User click on Buy button
    Then User should be redirected to enter amount and quantity page


  Scenario: Verify details of Top Holdings section
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    Then User should see the details of top holdings section

    #ask to what more can in above script



#  "Scenario : Verify details of each holding card"
#
#    Given user is on particular indices screen
#    Then user should see below details :
#      |  Logo of the instrument |
#      |  Symboll of the instrument  |
#      |  Full name of the instrument  |
#      |  Its weightage  |


   # validate the above scenario manually

  Scenario: Verify Dow is active on home dashboard
    Given User is on the dashboard
    And User select DOW cta from home dashboard banner
    Then User should see market indices page


  Scenario: Verify NASDAQ is active on home dashboard
    Given User is on the dashboard
    And User select NASDAQ cta from home dashboard banner
    Then User should see market indices page




  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place Limit order with order expiry as Till Market Closed for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects order expiry as Till Market is closed
    And User Slides to Buy
    Then Limit order should be placed Successfully

  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place Limit order with order expiry as Good till Cancelled for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects Limit order expiry as Good till Cancelled
    And User Slides to Buy
    Then Limit order should be placed Successfully

  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place Limit order with order expiry as Custom Date for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects Limit order expiry as Custom Date
    And User Slides to Buy
    Then Limit order should be placed Successfully


  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place Stop order with order expiry as till Market Closed for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects order expiry as Till Market is closed
    And User Slides to Buy
    Then Stop order should be placed Successfully

  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place Stop order with order expiry as Good till Cancelled for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects Stop order expiry as Good till Cancelled
    And User Slides to Buy
    Then Stop order should be placed Successfully

  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place Stop order with order expiry as Custom Date for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects Stop order expiry as Custom Date
    And User Slides to Buy
    Then Stop order should be placed Successfully

  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place MIT order with order expiry as till Market Closed for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects order expiry as Till Market is closed
    And User Slides to Buy
    Then MIT order should be placed Successfully

  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place MIT order with order expiry as Good till Cancelled for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects MIT order expiry as Good till Cancelled
    And User Slides to Buy
    Then MIT order should be placed Successfully

  @Sanity @Regression @Trade
  Scenario: Validate if the user is able to place MIT order with order expiry as Custom Date for S&P
    Given User is on the dashboard
    And User select S&P cta from home dashboard banner
    And User click on the stock
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Pro type order Quantity
    And User enters the limit price
    And User clicks on Set time in force
    And User selects MIT order expiry as Custom Date
    And User Slides to Buy
    Then MIT order should be placed Successfully

