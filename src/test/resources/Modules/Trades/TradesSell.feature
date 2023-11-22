Feature: Trades all buy related scenarios

  @Sanity @Regression
  Scenario: User with sufficient stocks in holdings should be able to sell stocks in Rupees
    Given User is on Trade dashboard
    And User clicks on Stock
    And User clicks on Sell
    And User selects order type as Sell in Rupees
    And User enters the amount for sell
    And User clicks on review order button
    And User clicks on place order
    Then the sell order should be placed successfully

  @Sanity @Regression
  Scenario: User with sufficient stocks in holdings should be able to sell stocks in Quantity
    Given User is on Trade dashboard
    And User clicks on Stock
    And User clicks on Sell
    And User selects order type as Sell in Quantity
    And User enters the Quantity for sell
    And User clicks on review order button
    And User clicks on place order
    Then the sell order of quantity type should be placed successfully

  @Sanity @Regression
  Scenario: Validate if the user is able to place Limit order in Sell
    Given User is on Trade dashboard
    And User clicks on Stock
    And User clicks on Sell
    And User clicks on Pro button
    And User selects order type as limit order
    And User enters the Sell Quantity
    And User enters the Sell Limit Price
    And User clicks on the review order button
    And User selects order expiry as Till Market is closed in sell
    Then Limit order in sell should be placed Successfully


  @Sanity @Regression
  Scenario: Validate if the user is able to place Stop order in Sell
    Given User is on Trade dashboard
    And User clicks on Stock
    And User clicks on Sell
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Sell Quantity
    And User enters the Sell Limit Price
    And User clicks on review order button
    And User selects order expiry as Till Market is closed
    Then Stop order in sell should be placed Successfully

  @Sanity @Regression
  Scenario: Validate if the user is able to place MIT order in Sell
    Given User is on Trade dashboard
    And User clicks on Stock
    And User clicks on Sell
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Sell Quantity
    And User enters the Sell Limit Price
    And User clicks on review order button
    And User selects order expiry as Till Market is closed
    Then MIT order in sell should be placed Successfully

  @Sanity @Regression
  Scenario: Validate Quantity in holding is decreased after selling the stock in Quantity during Market close
    Given User is on Trade dashboard
    And User checks the current holdings and clicks on Stock
    And User clicks on Sell
    And User selects order type as Sell in Quantity
    And User enters the Quantity to sell
    And User clicks on review order button
    And User clicks on place order
    And User Clicks on Go to home dashboard
    Then Quantity in Holdings should decrease and minus sign should display

  @Sanity @Regression
  Scenario: Once the user sells stock in market close then all data points like P&L, total invested and current value should remain as it is until the order is processed
    Given User is on Trade dashboard
    And User clicks on Stock
    And User clicks on Sell
    And User selects order type as Sell in Rupees
    And User enters the amount for sell
    And User clicks on review order button
    And User clicks on place order
    And the Order should be placed successfully
    Then current P and L, Current Investment and Current Amount should not change when the order is placed in Market close