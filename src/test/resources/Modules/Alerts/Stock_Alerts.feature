Feature: Stock Alert feature for US Stocks


  Scenario: verify user should be able to Create alert for US stock
#    Given the user is on the Dashboard
#    And User Selects the search tab on dashboard
#    And User enters the stock name under search page
    When User clicks on alert icon at stock details page
    Then User should see the set alert page
    And User enters the target amount
    And User selects the expiration date till next month
    When User click on create alert CTA
    Then User should see the alert created toast
    And User should also see the stock details page



