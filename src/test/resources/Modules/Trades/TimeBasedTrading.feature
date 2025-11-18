Feature: Time-Based Trading Scenarios

  @Morning @TimeBased
  Scenario: Morning trading session validation
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully

  @Afternoon @TimeBased
  Scenario: Afternoon trading session validation
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully

  @Evening @TimeBased
  Scenario: Evening trading session validation
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully

  @Night @TimeBased
  Scenario: Night trading session validation
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully

  @MarketOpen @TimeBased
  Scenario: Market hours trading validation
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully

  @MarketClosed @TimeBased
  Scenario: After-hours trading validation
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    And User click on the Stock
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully
