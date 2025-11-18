Feature: Portfolio Calculations


  #before running check which tab u invested

#  Gherkin syntax

  @main_final
  Scenario: Verify the calculation for all section under portfolio tab
    Given the user is on the Dashboard
    And User click on Portfolio tab
    Then User will verify the calculation for all sections


    #Add navigation :- done
    #Assert is not there only cause of incorrect values appears on  dashboard
    #confirm and add it


#  @main_final
#  Scenario: Verify the return percentage on Home dashboard and portfolio sections
#    Given the user is on the Dashboard
#    And User click on Portfolio tab
#    Then User notice the return percentage for us stocks goals and mutual funds
#    And User click on Portfolio tab
#    When User selects US Stock tab
#    Then User should see the same total return percentage as home dashboard for US Stocks
##    And User selects goals tab
##    Then User should see the same total return percentage as home dashboard for Goals
#    And User selects mutual funds tab
#    Then User should see the same total return percentage as home dashboard for Mutual funds





  @main_final
  Scenario: Verify the calculation for all, US Stocks and Goal section under portfolio tab
#    Given the user is on the Dashboard
    And User click on Portfolio tab
    Then User will verify the calculation of all sections
    Then User Clicks on US Stocks in Portfolio
    And User will verify calculation of US Stocks
    Then User Clicks on Goals in Portfolio
    And User will verify calculation of Goals
    Then User Clicks on Mutual Funds in Portfolio
    And User will verify calculation of Mutual Funds

    #cmt mf calculation



  @main_final @left
  Scenario: Get US Stocks value
    Given the user is on the Dashboard
    Then User gets the US Stocks value on Home Dashboard
#    And User gets the Goals value on Home Dashboard
    And User gets the Mutual Funds Value on Home Dashboard
    And User click on Portfolio tab
    Then User Clicks on US Stocks in Portfolio
    And User verify the US Stocks value with US Stocks value on Home Dashboard
#    Then User Clicks on Goals in Portfolio
#    And User verify the Goals value with Goals value on Home Dashboard
    And User Clicks on Mutual Funds in Portfolio
    And User verify the Mutual Funds value with Mutual Funds value on Home Dashboard