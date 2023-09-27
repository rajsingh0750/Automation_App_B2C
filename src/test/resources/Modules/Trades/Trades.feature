Feature: Trading

#  Scenario: Once the ETB user in onboarded successfully the user should be prompted with Buying Power sticky
#    Given the user is on home dashboard
#    Then the user should be prompted with "Buying power" sticky to add funds for buying power from YES Bank

  @Sanity @Regression
  Scenario: User with sufficient buying power should be able to buy stocks
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

  @Sanity @Regression
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
    And User enters the amount
    Then User should see the following error message "Low funds! Add money to your YES Bank A/C and transfer to your buying power read more here"

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
    Then User shouldbe prompted with error message "Minimum Transaction Amount Should be 0.84 INR."















