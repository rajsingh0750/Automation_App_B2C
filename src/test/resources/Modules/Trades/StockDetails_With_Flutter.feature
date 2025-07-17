Feature: Stocks data validation

  #In all scroll function sometimes it's scrolling too slow but sometimes it's not working due to new flutter screen

  @Sanity @Regression
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

  #changes done


  @Sanity @Regression
  Scenario: Verify Dividend Yield should not be negative
#    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search INTC under US Stocks
    When User select INTC stock
    Then dividend yield should't be negative


    #PROD done

  @Sanity @Regression
  Scenario: Verify Dividend Yield for tesla stock
#    Given User is on the dashboard
#    And User Selects the search tab on dashboard
    And User search tesla under US Stocks
    When User select Tesla stock
    Then dividend yield should be visible

    #Done  for tesla currenllty divident details is null
    #PROD done


  @Sanity @Regression
  Scenario: Verify PE ratio and EPS value
#    Given User is on the dashboard
#    And User Selects the search tab on dashboard
    And User search INTC under US Stocks
    When User select INTC stock
    Then PE ratio and EPS value should be visible

     #PROD done


  @Sanity @Regression
  Scenario: Verify the percentage change under top picks fund
#    Given User is on the dashboard
#    And User Selects the search tab on dashboard
    When User will go to Top Picks section and click on view all Button
    Then User should see the percentage change for the available funds

     #PROD done


  @Sanity @Regression
  Scenario: Verify for equity industry sector and market cap should be visible
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search tesla under US Stocks
    And User select Tesla stock
    When User will see the equity tag
    Then User should also see the industry sector and market cap of the equity

     #changes done

  @Sanity @Regression
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

        #changes done



  @Sanity @Regression
  Scenario: Verify the functionality of view report CTA under Research tab
#    Given User is on the dashboard
#    And User Selects the search tab on dashboard
#    When User search for apple under US Stocks
#    And User go to the apple details page
#    And User Select the research tab
    Then User should be able to see the apple report

     # not clicking on view report


  @Sanity @Regression
  Scenario: Verify news data is displaying related to stocks
#    Given User is on the dashboard
#    And User Selects the search tab on dashboard
#    When User search for apple under US Stocks
#    And User go to the apple details page
#    And User Selects the news tab
#    Then User should see the news related to apple stock
    And User search for amazon under US Stocks
    And User go to the amazon details page
    And User Selects the news tab
    Then User should see the news related to amazon stock

    #Prod done



  @Sanity @left @Regression
  Scenario: Verify Events tab under stock details page
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Selects Events tab
    Then User should see the all events if available

   #changes done  # static event , cause not getting id xpath for dynamic


#  Scenario: Verify all sections under research tab
  #  Given User is on the dashboard
##    And User Selects the search tab on dashboard
#    When User search for apple under US Stocks
#    And User go to the apple details page
#    And User Select the research tab
#    Then User should see all the research tab sections


  @Sanity @Regression
  Scenario: Verify Price Targets and analyst ratings section under research tab
#    Given User is on the dashboard
#    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify Price Targets and Analyst Ratings details

    #PROD DONE


  @Sanity @Regression
  Scenario: Verify Earnings and financial section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify Earnings and financial section details

    #Done

  @Sanity @Regression
  Scenario: Verify Peer Comparison and Indicator Components section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify Peer comparison and indicator components section



  @Sanity @Regression
  Scenario: Verify Refinitiv Report section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User will verify refinitiv report section

    #Done

  @Sanity @Regression
  Scenario: Verify the graph of Earning section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User should see earning graph

    #Done

  @Sanity @Regression
  Scenario: Verify the graph of Financial Trend section under research tab
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And User Select the research tab
    Then User should see financial trend graph

      #Done


  @Sanity @left @Regression
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


  @Sanity @Regression
  Scenario: Verify the opening price if market is closed
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search FOR under US Stocks
    When User select For stock
    Then the open price should not be visible

    #Done   have bug in uat 107


  #Popular stocks :- All sort scenario
  @Regression
  Scenario: Verify All sort options under popular stocks
    Given User is on the dashboard
    And User click on US Stocks
    And User Select Popular Stocks
    And User Selects Sort Button under watchlist page
    And User select high to low
    And User clicks on Apply Button
    And User Selects Sort Button under watchlist page
    And User select low to high
    And User clicks on Apply Button
    And User Selects Sort Button under watchlist page
    And User Selects Day change percentage option under sort by
    And User select high to low
    And User clicks on Apply Button
    And User Selects Sort Button under watchlist page
    And User select low to high
    And User clicks on Apply Button
    And User Selects Sort Button under watchlist page
    And User select name option
    And User select A to Z
    And User clicks on Apply Button
    And User Selects Sort Button under watchlist page
    And User select Z to A
    And User click on Apply Button

     #changes done



  @Regression
  Scenario: Verify research tab for spy stock
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search for spy under US Stocks
    And User go to details page of spy stock
    When User Select the research tab
    Then User will verify the research tab for spy stock

     #changes done


  @Regression
  Scenario: Verify ROE for MNTS stock
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    And User search for mnts under US Stocks
    And User go to details page of mnts stock
    Then User will verify ROE for mnts stock


    #give scrn to abhishek for confirmation  ROE showing blacnk



  #optimising scripts


  # Overview tab
  # Reseaerch tab
  # graph daily , wekly click , news and events
  #activity tab



  @main_final
  Scenario: Verify Overview tab functionality on Stock Details page
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And selects the Overview tab
    When the user clicks on the graph arrow dropdown
    Then the user should see all relevant information under the Price Performance section
    And navigates to the "Key Metrics" section
    Then the user should see accurate data related to the stock’s key metrics
    And navigates to the "About" section
    Then the user should see complete and relevant information about the stock





  @main_final
  Scenario: Verify the functionality of the Research tab under Stock Details
    Given User is on the dashboard
    And User Selects the search tab on dashboard
    When User search for apple under US Stocks
    And User go to the apple details page
    And selects the Research tab
    When the user clicks on the graph arrow dropdown
    Then the user should see all relevant details under the "Price Targets" and "Analyst Ratings" sections
    And navigates to the "Earnings" section
    Then the user should be able to view the graph in the "Earnings" section
    And navigates to the "Financial Trend" section
    Then the user should see the "Financial Trend" graph for both Quarterly and Annual views
    And navigates to the "Peer Comparison" section
    Then the user should see all relevant data under the "Peer Comparison" section
    And the user should see details related to "Indicator Components" and the "Refinitiv Report"


#
#  @main_final
#  Scenario: Verify the functionality of the News and Events tabs under Stock Details
#    Given the user is on the dashboard
#    And the user selects the search tab
#    When the user searches for "Apple" under US Stocks
#    And navigates to the Apple stock details page
#    And selects the "News" tab
#    When the user clicks on a news item displayed on the screen
#    Then the user should be navigated to the news details page
#    And selects the "Events" tab
#    Then the user should see all available event dates




  #stopping optimising cause uat and prod showing black and present data






