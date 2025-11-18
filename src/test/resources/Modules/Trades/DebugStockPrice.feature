Feature: Debug Stock Price Extraction

  Scenario: Debug stock price elements on screen
    Given User is on Trade dashboard
    And User clicks on Buy now for a stock
    And User debugs all price elements on screen
    And User tests stock price extraction
    And User enters the limit price 