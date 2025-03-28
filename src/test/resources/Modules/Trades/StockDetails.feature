Feature: Stocks data validation

  @Sanity
  Scenario: Verify Cta is not clickable after user updates amount
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search the csx stock under US Stocks
    And User click on the csx Stock
    And User clicks on Buy now for a stock
    And User enters the amount
    And User Update the enter amount
    And User Slides to Buy
    Then the order should be placed successfully

  #Done

  @Sanity
  Scenario: Verify Dividend Yield should not be negative
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search INTC under US Stocks
    When User select INTC stock
    Then dividend yield should't be negative

    #Done

  @Sanity
  Scenario: Verify Dividend Yield for tesla stock
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search tesla under US Stocks
    When User select Tesla stock
    Then dividend yield should be visible

    #Done


  @Sanity
  Scenario: Verify PE ratio and EPS value
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search INTC under US Stocks
    When User select INTC stock
    Then PE ratio and EPS value should be visible

    #Done


  @Sanity
  Scenario: Verify the percentage change under top picks fund
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User will go to Top Picks section and click on view all Button
    Then User should see the percentage change for the available funds

    #Done


  @Sanity
  Scenario: Verify for equity industry sector and market cap should be visible
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search tesla under US Stocks
    And User select Tesla stock
    When User will see the equity tag
    Then User should also see the industry sector and market cap of the equity

    #Done

  @Sanity
  Scenario: Verify for ETF industry sector and market cap should not be visible
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search tesla under US Stocks
    And User Selects the filter CTA
    And User applied ETF option
    And User click on apply Button
    And User select the ETF of Tesla
    When User will see the ETF tag
    Then User should not see the industry sector and market cap of the equity

    #Done


  @Sanity @left
  Scenario: Verify User should be able to click on the stocks after search
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search Goldman sachs under US Stocks
    Then the result stocks should be clickable

    #Some times second stock will appear after few scroll


  @Sanity
  Scenario: Verify the functionality of view report CTA under Research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User should be able to see the apple report


  @Sanity
  Scenario: Verify news data is displaying related to stocks
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Selects the news tab
    Then User should see the news related to apple stock
    And User search for amazon under US Stocks
    And User go to the amazon details page
    And User Selects the news tab
    Then User should see the news related to amazon stock
    #Done


  @Sanity @left
  Scenario: Verify Events tab under stock details page
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Selects Events tab
    Then User should see the all events if available

    #Done


#  Scenario: Verify all sections under research tab
  #  Given User is on the dashboard
##    And User Selects the search tab on dashboard
#    When User search for apple under US Stocks
#    And User go to the apple details page
#    And User Select the research tab
#    Then User should see all the research tab sections


  @Sanity
  Scenario: Verify Price Targets and analyst ratings section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify Price Targets and Analyst Ratings details

    #Done


  @Sanity
  Scenario: Verify Earnings and financial section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify Earnings and financial section details

    #Done

  @Sanity
  Scenario: Verify Peer Comparison and Indicator Components section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify Peer comparison and indicator components section



  @Sanity
  Scenario: Verify Refinitiv Report section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify refinitiv report section

    #Done

  @Sanity
  Scenario: Verify the graph of Earning section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User should see earning graph

    #Done

  @Sanity
  Scenario: Verify the graph of Financial Trend section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User should see financial trend graph

      #Done


  @Sanity @left
  Scenario:Verify the accordion should not scroll out of the screen
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for ENFR under US Stocks
    And User go to the ENFR details page
    And User click on price performance dropdown
    And User click on key metrics dropdown
    And User click on about etf dropdown
    When User will scroll
    Then the accordion should not scroll out of the screen

    #Done

  #add on option at the end


  @Sanity
  Scenario: Verify the opening price if market is closed
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search FOR under US Stocks
    When User select For stock
    Then the open price should not be visible

    #Done


#  Scenario: Verify the stock border id should be visible
##    Given User is on the dashboard
#    Then User should see stock borker id

    #not working


  #Popular stocks :- All sort scenario

  Scenario: Verify All sort options under popular stocks
    Given User is on the dashboard
    And User click on US Stocks
    And User Select Popular Stocks
    And User Selects Sort Button under watchlist page
    And User select high to low
    And User click on Apply Button
    And User Selects Sort Button under watchlist page
    And User select low to high
    And User click on Apply Button
    And User Selects Sort Button under watchlist page
    And User Selects Day change percentage option under sort by
    And User select high to low
    And User click on Apply Button
    And User Selects Sort Button under watchlist page
    And User select low to high
    And User click on Apply Button
    And User Selects Sort Button under watchlist page
    And User select name option
    And User select A to Z
    And User click on Apply Button
    And User Selects Sort Button under watchlist page
    And User select Z to A
    And User click on Apply Button


    #clear all and cross


  Scenario: Verify Filter is getting removed  while searching and clearing
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search for amazon under US Stocks
    And User Selects the filter CTA
    And User Select Stock option
    And User clicks on Apply Button
    Then User will see "No results for 'amazon'"
    And User clear the search bar
    And User search for amazon under US Stocks
    And User Selects the filter CTA
    And User click on Apply Button


  Scenario: Verify research tab for spy stock
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search for spy under US Stocks
    And User go to details page of spy stock
    When User Select the research tab
    Then User will verify the research tab for spy stock


  Scenario: Verify ROE for MNTS stock
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search for mnts under US Stocks
    And User go to details page of mnts stock
    Then User will verify ROE for mnts stock
