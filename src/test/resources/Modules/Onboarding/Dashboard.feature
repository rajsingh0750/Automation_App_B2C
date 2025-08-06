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
#    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    Then User will see the count of stocks

    #PROD DONE


  @Sanity
  Scenario: Verify Recently viewed under Search Tab
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
    And User Selects view all Button
    And User will verify the Recently viewed page

#PROD DONE


  @Sanity
  Scenario: Verify if 'US stocks' tab is selected by default in top nav bar
    Given the user is on the Dashboard
    When User Selects the search tab on dashboard
    Then User will see US Stocks is selected by default

    #PROD DONE


  @Sanity
  Scenario: Verify if the 'filter' CTA is active under Search page
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks
    Then User will see filter CTA under Search page

  #PROD DONE


  @Sanity
  Scenario: Verify the Stock Detail under News Tab
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
    And User Selects the News tab
    When User search the stock under News Tab
    Then User will verify the News details

    #PROD DONE  static data


  @Sanity
  Scenario: Verify the content of Research News under Research Tab
    Given the user is on the Dashboard
    When User Selects the search tab on dashboard
    When User Selects the Research Tab
    Then User will verify the content of news under Research tab

    #Static research data



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
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
    And User search multiple stocks under search tab

    #PROD DONE


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
    When User Selects on US stocks
    Then User will see day p and l and return percentage

    #Done

    #in both one checking 0.00 value along with if it's coming valid then after decimal only 2 points should be there

  @Sanity
  Scenario: Verify If day's P&L is zero amount should be shown as "0.00"
    Given the user is on the Dashboard
    And User clicks on the Portfolio US stocks
    And User Selects on US stocks
    When User select Daily P and L section
    Then User will see day p and l and return percentage

     #Done


  @Sanity
  Scenario: Verify All Total P&L amount
    Given the user is on the Dashboard
    When User clicks on the Portfolio US stocks
    Then User will see day p and l and return percentage

      #PROD DONE

  @Sanity
  Scenario: Verify  Daily P&L return percentage and return amount under portfolio tab
    Given the user is on the Dashboard
    And User clicks on the Portfolio US stocks
    When User select Daily P and L section
    Then User will see day p and l and return percentage

     #PROD DONE




  #OPPTIMISE SEARCH TAB

  @main_final
  Scenario: Verify Search page
    Given the user is on the Dashboard
    When User Selects the search tab on dashboard
    Then User should see all tabs along with recently viewed top picks and crafted list details

  #PROD DONE

  # search stock in all tab with count and filter

  @main_final
  Scenario: Verify Searching and clear functionality for all tabs under search page
    Given the user is on the Dashboard
    When User Selects the search tab on dashboard
    When the user enters a stock name in the "US Stock" search bar
    And User click on the apple stock
    Then the user should be navigated to the Stock Details page
    And User clears the US Stocks search bar
    And the user selects the "Mutual Funds" tab
    When the user enters a mutual fund name in the "Mutual Fund" search bar
    And User click on the Fund name
    Then the user should be navigated to the Mutual Fund Details page
    And User clears the MF search bar
    And User Selects the News tab
    When the user enters a search term in the "News" search bar
    Then the user should be navigated to the News Details page
    And User clears the US Stocks search bar
    And User Select the Research Tab
    When the user enter a search term in the "Research" search bar
    Then the user should be navigated to the Research Details page
    And User clears the US Stocks search bar
    And User Selects on US stock tab
    When the user enters a stock name in the "US Stock" search bar
    And User Selects the filter CTA
    And User Select Equity option
    And User click on Apply Button
    And User again click on filter CTA
    And User clears the applied filter
    And User Selects the filter CTA
    And User Select one of the available option under Industry section
    And User click on Apply Button
    And User should be able to see the dashboard search page


  #PROD DONE


  #Add one scernaiio here which validate all available sections on home dashboard 


#1. Our offering
#    2. Trading signals
#    3. Popular stocks
#    4. News
#    5. Create a goal
#    6. Top Gainer
#    7. Popular funds
#    8. Start with 100
#    9. Research

  #Few are left to add in UAT /  Prod and UAT are different




  #Search Optimise complete





