Feature: Portfolio Calculations


  #before running check which tab u invested

  @main_final
  Scenario: Verify the calculation for all section under portfolio tab
    Given the user is on the Dashboard
    And User click on Portfolio tab
    Then User will verify the calculation for all sections


    #Add navigation :- done
    #Assert is not there only cause of incorrect values appears on  dashboard
    #confirm and add it


  @main_final
  Scenario: Verify the return percentage on Home dashboard and portfolio sections
    Given the user is on the Dashboard
    And User click on Portfolio tab
    Then User notice the return percentage for us stocks goals and mutual funds
    And User click on Portfolio tab
    When User selects US Stock tab
    Then User should see the same total return percentage as home dashboard for US Stocks
#    And User selects goals tab
#    Then User should see the same total return percentage as home dashboard for Goals
    And User selects mutual funds tab
    Then User should see the same total return percentage as home dashboard for Mutual funds