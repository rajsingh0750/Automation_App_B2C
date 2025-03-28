Feature: Dashboard


  Scenario: User sees the Add Funds banner on the Dashboard

  Given the user is on Appreciate App's Dashboard
  And a banner or information is displayed prompting the user to Add Funds
  When the user clicks on the CTA for adding funds
  Then the user should be redirected to the funds adding money transfer screen

  Scenario: User Sees the News Banner in Home Dashboard

    Given the user is on Appreciate App's Dashboard
    And User should see news and select view all
    Then User should See list of news Displayed

  Scenario: User Sees the Years High today Banner in Home Dashboard

    Given the user is on Appreciate App's Dashboard
    And User should see Year High today and select view all
    Then User should See list of US year High today stocks

  Scenario: User Sees the Top Gainer Banner in Home Dashboard

    Given the user is on Appreciate App's Dashboard
    And User should see Top Gainer and select view all
    Then User should See list of Top Gainers stocks

  Scenario: User Sees the Popular Stocks Banner in Home Dashboard

    Given the user is on Appreciate App's Dashboard
    And User should see Popular Stocks and select view all
    Then User should See list of Popular stocks


  Scenario: Verify Search Functionality in News Tab from Home dashboard

    Given the user is on Appreciate App's Dashboard
    And User should see news and select view all
    And User should search for news
    Then User Should see list of news

  Scenario: Verify Rewards Tab from Home dashboard

    Given the user is on Appreciate App's Dashboard
    And User Should select reward option
    Then User Should see by default Refer a friend must be selected successfully


  Scenario: Verify Notification Tab from Home dashboard

    Given the user is on Appreciate App's Dashboard
    And User Should select notification option
    Then User Should see all Notification


  @Sanity
  Scenario: Verify the count of stocks under Search Tab
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    Then User will see the count of stocks


  @Sanity
  Scenario: Verify Recently viewed under Search Tab
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    And User Selects view all Button
    And User will verify the Recently viewed page


  @Sanity
  Scenario: Verify if 'US stocks' tab is selected by default in top nav bar
    Given the user is on the Dashboard
    When User Selects the search tab on dashboard
    Then User will see US Stocks is selected by default


  @Sanity
  Scenario: Verify if the 'filter' CTA is active under Search page
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    Then User will see filter CTA under Search page



  @Sanity
  Scenario: Verify the Stock Detail under News Tab
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    And User Selects the News tab
    When User search the stock under News Tab
    Then User will verify the News details


  @Sanity
  Scenario: Verify the content of Research News under Research Tab
    Given the user is on the Dashboard
    When User Selects the search tab on dashboard
    When User Selects the Research Tab
    Then User will verify the content of news under Research tab

    #Static research data


  @Sanity
  Scenario: Verify the Bottom sheet of filter CTA
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    And User  search the stocks under US Stocks
    When User Selects the filter CTA
    Then User will see the Bottom sheet for filter CTA



  @Sanity
  Scenario: Verify the count of US Top Gainers stocks for crafted list under Search Tab
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    When User Selects US Top Gainers option under crafted list
    Then User will verify the count of Top Gainers stocks



  @Sanity
  Scenario: Verify the count of US Top Losers stocks for crafted list under Search Tab
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    When User Selects US Top Losers option under crafted list
    Then User will verify the count of Top Losers stocks


  @Sanity
  Scenario: Verify the count of US Year High Today stocks for crafted list under Search Tab
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    When User Selects US Year High Today option under crafted list
    Then User will verify the count of US Year High Today stocks



#  @Sanity
#  Scenario: Verify when user enters the Special character under search page
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
#    When User enters the special characters in search bar
#    Then User will see No results


    ## varsha given scripts

  @Sanity
  Scenario: Verify Stocks are displaying
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    And User  search the Tesla stocks under US Stocks
    And User will click on Tesla stock
    And User will go back and select the filter
    When User click on apply Button
    Then User will see the Tesla Stock



#   #Amazon
#  @Sanity @left
#  Scenario: Verify when user apply Multi-Filter for stocks under search tab
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
#    And User search the stocks under US Stocks
#    And User Selects the filter CTA
#    And User Select multi filter
#    When User click on apply Button
#    Then User will see the  Stock



  @Sanity @left
  Scenario: Verify when user search with multiple stocks
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    And User search multiple stocks under search tab


#  @Sanity @left
#  Scenario: Verify when user add and remove a stock from recently views section under search tab
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
#    And User Selects the view all btn under recently viewed section
#    And User will add a stock into watchlist


  @Sanity
  Scenario: Verify If Total P&L is zero amount should be shown as "0.00"
    Given the user is on the Dashboard
    And User clicks on the Portfolio US stocks
    And User Selects on US stocks
    When User will see day p and l and return percentage

    #Done

    #in both one checking 0.00 value along with if it's coming valid then after decimal only 2 points should be there

  @Sanity
  Scenario: Verify If day's P&L is zero amount should be shown as "0.00"
    Given the user is on the Dashboard
    And User clicks on the Portfolio US stocks
    And User Selects on US stocks
    And User select Daily P and L section
    When User will see day p and l and return percentage

     #Done


  @Sanity
  Scenario: Verify All Total P&L amount
    Given the user is on the Dashboard
    And User clicks on the Portfolio US stocks
    When User will see day p and l and return percentage

     #Done

  @Sanity
  Scenario: Verify All Daily P&L amount
    Given the user is on the Dashboard
    And User clicks on the Portfolio US stocks
    And User select Daily P and L section
    When User will see day p and l and return percentage

     #Done


  @Sanity
  Scenario: Verify the content of Research News under Research Tab
    Given the user is on the Dashboard
    When User Selects the search tab on dashboard
    When User Selects the Research Tab
    And User search for research
    Then User will verify the content of research Research tab

    #static data used