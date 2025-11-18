Feature: Watchlist Stock


#  @Sanity @Regression
#  Scenario: Verify when user create a watchlist
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects the create Button
#    And User enter the watchlist name
#    And User Selects the create Button under watchlist pop up
#    When User will come back to watchlist page
#    Then User should see the created watchlist
#
#    #Done
#
#
#
#  @Sanity @Watchlist @Regression
#  Scenario: Verify how to add a new stock to an existing watchlist.
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects the add stock Button under a watchlist
#    And User enter the stock name
#    And User click on heart icon to add this stock into watchlist
#    And User should see a message "Added to watch lists successfully"
#    When User will come back to watchlist page
#    Then User will see the stock has been added to their selected watchlist
#
#    #Done
#
#
#
#
#  @Sanity @Watchlist @Regression @left
#  Scenario: Verify how user can add a stock to a Watchlist from home dashboard
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
#    And User enters the stock name under search page
#    When User select the heart icon
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User Selects their desired watchlist
#    And User click on add Button
##    Then User should see a toast message after adding as "Watchlist changes saved"
#    When User Selects the watchlist section on home dashboard
#    Then User will see the stock
#
#    #Done
#
#  #check once toast
#
#
#
#
#  @Sanity @Regression
#  Scenario: Verify if the user can select multiple watchlist to add the same stock
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User will go to Search and add to watchlist Page
#    And User will enter the Stock name under search and add page
#    When User click on heart icon for another stock
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    When User Selects multiple watchlists for same stock
#    And User click on add Button
#    Then User should see a toast messages after adding as "Watchlist changes saved"
#
#     #Done
#
#  #check search and add xpath
#
#
#
#  @Sanity @Regression @left
#  Scenario: Verify When User try to enters the special characters for watchlist name
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects the create Button
#    And User try to enters the special characters for watchlist name
#    And User Selects the create Button under watchlist pop up
#    Then User will see a error message "Please enter watchlist name"
#
#    #Done
#
#
#
#  @Sanity @Regression
#  Scenario: Verify if the user can delete a watchlist
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects view all Button
#    And User click on edit Button
#    And User will click on delete Button
#    When User will click on yes Button
#    Then the watchlist will be deleted
#
#    #Done
#
#
#  @Sanity @Regression
#  Scenario: Verify when user try to search with space character
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User will go to Search and add to watchlist Page
#    When User enters the empty stock name
#    Then User will see an  error messages "No results for ' '"
#
#    #Done
#
#
#  @Sanity @Regression
#  Scenario: Verify the count of Top Picks US Stocks
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
#    When User will go to Top Picks section and click on view all Button
#    Then User will verify the count of Top picks Stocks
#
#    #Done
#
#
#
#    #sort -filter  end statement ask
#    #for running this we have some data
#
#  @Sanity @Regression @Regression
#  Scenario: Verify if the User is able to Select Current Price option under Sort by tab for a watchlist
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects view all Button
#    And User Selects Sort Button under watchlist page
#    And User Selects Current Price option under sort by
#    And User click on Apply Button
#
#    #Done
#
#
#  @Sanity @Regression @Regression @left
#  Scenario: Verify if the User is able to Select Day change percentage option under Sort by tab for a watchlist
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects view all Button
#    And User Selects Sort Button under watchlist page
#    And User Selects Day change percentage option under sort by
#    And User click on Apply Button
#
#    #Done
#
#
#  @Sanity @Regression @Regression
#  Scenario: Verify if the User is able to Select Company(A-Z) option under Sort by tab for a watchlist
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects view all Button
#    And User Selects Sort Button under watchlist page
#    And User Selects Company (A-Z) option under sort by
#    And User click on Apply Button
#
#    #Done
#
#
#
#  @Sanity @Regression
#  Scenario: Verify User can edit the watchlist name
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects the create Button
#    And User enters the watchlist name
#    And User Selects the create Button under watchlist pop up
#    And User will come back to watchlist page
#    And User Selects view all Button
#    And User click on edit Button
#    And User will edit the watchlist name
#    When User click on save Button
#    Then User will see a message "Watchlist name updated successfully"
#
#    #Done
#
#
#  @Sanity @Regression
#  Scenario: Verify if the user can delete a watchlist
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects view all Button
#    And User click on edit Button
#    And User will click on delete Button
#    When User will click on yes Button
#    Then the watchlist will be deleted
#
#     #Done
#
#
#  @Sanity @Regression @left
#  Scenario: Verify User user try add a watchlist with same as existing watchlist name
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects the create Button
#    And User enter the watchlist name
#    And User Selects the create Button under watchlist pop up
#    And User will come back to watchlist page
#    And User Selects the create Button
#    And User enter the same watchlist name
#    Then User will  see an error message as "This name is taken, try another watchlist name"
#
#    #Done
#
#
#
#   # PROD EXPLORATORY :-
#  @Sanity @left @Regression @left
#  Scenario: Verify when user update the watchlist name then "New watchlist name is required should" not come
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User Selects the create Button
#    And User enter the watchlist name as Amazon
#    And User Selects the create Button under watchlist pop up
#    And User enter the stock name
#    And User click on heart icon to add this stock into watchlist
#    And User will come back to watchlist page
#    And User Selects view all Button
#    And User click on edit Button
#    And User will update the watchlist name as "AMAZON1234"
#    When User click on save Button under Edit watchlist page
#    Then User will see a message "Watchlist name updated successfully"
#
#    #Done
#
#
#
#  @Sanity @Regression @left @Regression
#  Scenario: Verify if the User is able to buy the stock under watchlist section
#    Given the user is on the Dashboard
#    And User Selects the watchlist section on home dashboard
#    And User will go to Search and add to watchlist Page
#    And User will enter the Stock name under search and add page
#    And User Selects the tesla Stock
#    And User clicks on Buy now for a stock
#    And User enters min trade amount
#    And User Slides to Buy
#    And User Clicks on Go to home dashboard
#
#    #Done
#
#
##  @Regression
##  Scenario: Verify if the user can delete a watchlist
##    Given the user is on the Dashboard
##    And User Selects the watchlist section on home dashboard
##    And User Selects view all Button
##    And User click on edit Button
##    And User will click on delete Button
##    When User will click on yes Button
##    Then the watchlist will be deleted
##
##     #Done
#
#
## Adding watchlist all scenarios:-
#
#  #  using coordinate
#
#  Scenario: Verify User should able to add the stocks from popular section to watchlist
#    Given the user is on the Dashboard
#    When User click on heart icon of stock under popular stocks
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    When User click on add Button
#    And User should able to see the stock under watchlist section
#    And User will come to home dashboard
#    And User click on heart icon of stock under popular stocks
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    When User click on add Button
#    And User will remove the stock from watchlist from popular stocks
#    Then User should see stock has been removed from watchlist
#
#    #Done
#
#
#
#
#  Scenario: Verify User should able to add the stocks from year high today section to watchlist
#    Given the user is on the Dashboard
#    When User click on heart icon of stock under year high today
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    When User click on add Button
#    And User should able to see the year high today stock under watchlist section
#    And User will come to home dashboard
#    And User click on heart icon of stock under year high today
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    And User click on add Button
#    And User will remove the stock from watchlist from year high today section
#    Then User should see stock has been removed from watchlist
#
#
#
#
#  Scenario: Verify User should able to add the stocks from Top Gainer section to watchlist
#    Given the user is on the Dashboard
#    When User click on heart icon of stock under Top Gainer section
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    When User click on add Button
#    And User should able to see the top gainer stock under watchlist section
#    And User will come to home dashboard
#    When User click on heart icon of stock under Top Gainer section
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    And User click on add Button
#    And User will remove the stock from watchlist top gainer section
#    Then User should see stock has been removed from watchlist
#
#
#
#  Scenario: Verify User should able to add the stocks from Top Losers section to watchlist
#    Given the user is on the Dashboard
#    When User click on heart icon of stock under Top Losers section
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    When User click on add Button
#    And User should able to see the top losers stock under watchlist section
#    And User will come to home dashboard
#    When User click on heart icon of stock under Top Losers section
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    And User click on add Button
#    And User will remove the stock from watchlist top losers section
#    Then User should see stock has been removed from watchlist
#
#    #stock details
#
#
#  Scenario: Verify User should able to add the stocks from Recently viewed section to watchlist
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
#    And User click on heart icon under recently viewed section
#    Then Bottom sheet opens up with a list of all watchlists ever created
#    And User select the created watchlist option
#    And User click on add Button
#    And User should able to see the top losers stock under watchlist section
#    And User will be log out









    #Optimised scripts for watchlist

  ## predefined case :-  only one watchlist should be present with 4 stocks into that
 #for below script should have 2 watchlist , once with name demo 2nd with name testing , demo should be the first and testing will creating with above script


  @Main_Final
  Scenario: Verify if User can create a watchlist , remove a watchlist ,validate special watchlist name and same watchlist name
#    Given the user is on the Dashboard
    And User Selects the watchlist section on home dashboard
    And User Selects the create Button
    And User try to enters the special characters for watchlist name
    And User Selects the create Button under watchlist pop up
    Then User will see a error message "Please enter watchlist name"
    And User enter the watchlist name
    And User Selects the create Button under watchlist pop up
    When User will come back to watchlist page
    Then User should see the created watchlist
    And User Selects the add stock Button under a watchlist
    And User enter the stock name
    And User click on heart icon to add this stock into watchlist
    When User will come back to watchlist page
    Then User will see the stock has been added to their selected watchlist
    And User Selects the create Button
    And User enter the same watchlist name
    Then User will  see an error message as "This name is taken, try another watchlist name"


    #PRod done implicit ait added



  @Main_Final
  Scenario: Verify user can add a stock to a Watchlist from home dashboard, watchlist search, edit and delete a watchlist name
    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    And User enters the stock name under search page
    When User select the heart icon
    Then Bottom sheet opens up with a list of all watchlists ever created
    And User Selects their desired watchlist
    And User click on add Button
    Then User should see a toast message after adding as "Watchlist changes saved"
    When User Selects the watchlist section on home dashboard
    Then User will see the stock
    And User will go to Search and add to watchlist Page
    And User will enter the Stock name under search and add page
    When User click on heart icon for another stock
    Then Bottom sheet opens up with a list of all watchlists ever created
    When User Selects multiple watchlists for same stock
    And User click on add Button
    Then User should see a toast messages after adding as "Watchlist changes saved"
    And User Selects view all Button
    And User click on edit Button
    And User will update the watchlist name as "AMAZON1234"
    When User click on save Button under Edit watchlist page
    Then User will see a message "Watchlist updated successfully"
    And User Selects view all Button
    And User click on edit Button
    And User will click on delete Button
    When User will click on yes Button
    Then the watchlist will be deleted

    #PROD DONE   implicit add 


  @Main_Final
  Scenario: Verify the functionality of enter space , count top picks under search tab and sort under watchlist
#    Given the user is on the Dashboard
    And User Selects the watchlist section on home dashboard
    And User will go to Search and add to watchlist Page
    When User enters the empty stock name
    Then User will see an  error messages "No results for ' '"
    And User Selects the search tab on dashboard
    When User will go to Top Picks section and click on view all Button
    Then User will verify the count of Top picks Stocks
    And User Selects the watchlist section on home dashboard
    And User Selects view all Button
    And User Selects Sort Button under watchlist page
    And User Selects Current Price option under sort by
    And User click on Apply Button
    And User Selects Sort Button under watchlist page
    And User Selects Day change percentage option under sort by
    And User click on Apply Button
    And User Selects Sort Button under watchlist page
    And User Selects Company (A-Z) option under sort by
    And User click on Apply Button
    And User will be log out

    #PROD DONE   implicit add









    #creating for adding watchlist from every place and verify toast
#    1. popular us stocks , year hhigh today , top gainers , top loosers , stock details add to watchlist
#    2. search and add to watchist , also from stock details  -> can add in buy journey




  @Main_Final @left
  Scenario: Verify user is able to add and remove stock from a watchlist
#    Given the user is on the Dashboard
    And User Selects the search tab on dashboard
    And User enter the stock name under search page
    And User click on the heart icon of displayed stock
    And User click on the create new watchlist cta
    And User enters a new watchlist name
    And User Selects the create Button
    And User click on the heart icon of displayed stock
    And User uncheck the created watchlist
    And User click on save Button
    And User clear the search bar under US Stocks
    And User click on the heart icon of listed stock under recently viewed section
    And User click on created watchlist
    And User click on add Button
    When User Selects the watchlist section on home dashboard
    Then User should see the newly created watchlist
    And User Selects view all Button
    And User click on edit Button
    And User will click on delete Button
    When User will click on yes Button
    Then the watchlist will be deleted

     #Done    implicit add

    #Add top picks in above one and all before is displayed things criteria
   # yha per save v ho sakta g (issue is coordinate due to uncertainty)


  @Main_Final_buy
  Scenario: Verify if the User is able to buy the stock under watchlist section
    Given the user is on the Dashboard
    And User Selects the watchlist section on home dashboard
    And User will go to Search and add to watchlist Page
    And User will enter the Stock name under search and add page
    And User Selects the tesla Stock
    And User clicks on Buy now for a stock
    And User enters min trade amount
    And User Slides to Buy
    And User Clicks on Go to home dashboard




    #Watchlist All Scenario done  !!

  #1. without selecting any watchlist if add , should show an error






