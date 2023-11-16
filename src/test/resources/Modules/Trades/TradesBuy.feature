Feature: Trades all buy related scenarios

#  Scenario: Once the ETB user in onboarded successfully the user should be prompted with Buying Power sticky
#    Given the user is on home dashboard
#    Then the user should be prompted with "Buying power" sticky to add funds for buying power from YES Bank

  @Sanity @Regression
  Scenario: User with sufficient buying power should be able to buy stocks in Rupees
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    And User enters the amount
    And User clicks on review order button
    And User clicks on place order
    Then the order should be placed successfully

  @Sanity @Regression
  Scenario: User should see Market Live label if the current time in IST is between 7:30 PM to 2:30 AM
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    Then User should see market live label

  @Regression
  Scenario: Verify the accuracy of the numbers displayed in the Current Value, Overall Returns, and Total Invested sections within the Portfolio.
    Given User is on Trade dashboard
    And User clicks on View Enhancements
    Then User should see Holdings with accurate data

  @Sanity @Regression
  Scenario: Verify whether clicking on a stock name from the Portfolio screen successfully navigates the user to the Stock Details screen.
    Given User is on Trade dashboard
    And User clicks on View Enhancements
    And User clicks on Stock name
    Then User should see the stock details of the respective stock

  @Sanity @Regression
  Scenario: Confirm that the Current Value and Invested Amount displayed on the Trade Dashboard align with the corresponding values on the Portfolio screen.
    Given User is on Trade dashboard
    And User sees invested amount and current value on Trade dashboard
    And User clicks on View Enhancements
    Then Investment and Current Value on Portfolio should match with the Trade Dashboard

  @Sanity @Regression
  Scenario: Verify the presence of an error message when attempting to purchase stocks exceeding the available buying power.
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    And User selects the order type as Quantity
    And User enters the maximum quantity limit
    Then User should see the following error message Low funds! Add money to your YES Bank AC and transfer to your buying power read more here

  @Sanity @Regression
  Scenario: Verify the presence of an error message when usd value crosses the limit of 2,50,000.
    Given User is on Trade dashboard
    And User click on Buy stocks for one of the stock under Top picks
    And User selects the order type as Quantity
    And User enters the maximum quantity limit
    Then User should see the following message Transaction Limit


  @Sanity @Regression
  Scenario: Confirm that the user can purchase stock by quantity even when the market is closed.
    Given User is on Trade dashboard
    And User click on Buy stocks for one of the stock under Top picks
    And User selects the order type as Quantity
    And User enters the quantity of the stock
    And User clicks on review order button
    And User clicks on place order
    Then the order should be placed successfully

  @Regression
  Scenario: User should be able to move stock from Top picks to Watchlist
    Given User is on Trade dashboard
    And User clicks on Top picks tab
    And User clicks on watchlist icon for one of the stock
    Then User should see the same stocks under Watchlist

  @Regression
  Scenario: User should be able to remove stock from Watchlist
    Given User is on Trade dashboard
    And User clicks on Top picks tab
    And User clicks on watchlist icon for one of the stock
    And User clicks on watchlist icon from Watchlist screen
    Then User should not see the stock under Watchlist

  @Regression
  Scenario: The user should see an error message prompt when attempting to purchase a stock quantity below the minimum required limit.
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    And User enters the amount less than the required limit
    Then User should be prompted with error message Minimum Transaction Amount Should be "0.83" INR.

    @Regression
    Scenario: Validate if the error message is removed once the user switch to other app
      Given User is on Trade dashboard
      And User clicks on Buy now for a stock
      And User enters the amount less than the required limit
      #And User should be prompted with error message "Minimum Transaction Amount Should be 0.84 INR."
      And User minimizes the app and again switch to Appreciate app
      Then the error message should be removed

    @Regression
    Scenario: Validate if the percentage change shown under Portfolio is correct for Total P&L
      Given User is on Trade dashboard
      Then User should see percentage change of P&L based on the Current Investment and Overall returns

   @Regression
    Scenario: Validate if the entered amount/quantity in trade is retained once the user switch to other app
      Given User is on Trade dashboard
      And User clicks on Buy now for a stock
      And User enters the amount
      And User minimizes the app and again switch to Appreciate app
      Then the entered value should be retained

     @Sanity @Regression
     Scenario: Validate if the user is able to place Limit order
       Given User is on Trade dashboard
       And User clicks on Buy now for a stock
       And User clicks on Pro button
       And User selects order type as limit order
       And User enters the Quantity
       And User enters the limit price
       And User clicks on review order button
       And User selects order expiry as Till Market is closed
       Then Limit order should be placed Successfully


  @Sanity @Regression
  Scenario: Validate if the user is able to place Stop order
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as Stop order
    And User enters the Quantity
    And User enters the limit price
    And User clicks on review order button
    And User selects order expiry as Till Market is closed
    Then Stop order should be placed Successfully

  @Sanity @Regression
  Scenario: Validate if the user is able to place MIT order
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    And User clicks on Pro button
    And User selects order type as MIT order
    And User enters the Quantity
    And User enters the limit price
    And User clicks on review order button
    And User selects order expiry as Till Market is closed
    Then MIT order should be placed Successfully


@Sanity @Regression
Scenario: Validate while buying stock user is allowed to enter amount at most two decimal place only
  Given User is on Trade dashboard
  And User clicks on Buy now for a stock
  And User enters the amount in three or more decimal place
  Then Amount field should ignore the decimals after two place


  @Sanity @Regression
  Scenario: Validate while buying stock user is allowed to enter Quantity at most eight decimal place only
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    And User selects the order type as Quantity
    And User enters the quantity in nine or more decimal place
    Then Amount field should ignore the decimals after eight place

  @Sanity @Regression
  Scenario: Once the user buys stock in market close then all data points like P&L, total invested and current value should remain as it is until the order is processed
    Given User is on Trade dashboard
    And User notices the Current P and L, Current Investment and Current Amount
    And User clicks on Buy now for a stock
    And User enters the amount
    And User clicks on review order button
    And User clicks on place order
    And the order should be placed successfully
    Then Current P and L, Current Investment and Current Amount should not change when the order is placed in Market close


  @Sanity @Regression
    Scenario: Verify if the user enters the text in global search then relevant stocks are appearing on screen
    Given User is on Trade dashboard
    And User opens the global search
    And User enters the stock name
    Then User should see the relevant Search results






























