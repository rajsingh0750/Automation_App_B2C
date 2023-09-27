Feature: Dashboard
Scenario: User sees the Add Funds banner on the Dashboard

  Given the user is on Appreciate App's Dashboard
  And a banner or information is displayed prompting the user to Add Funds
  When the user clicks on the CTA for adding funds
  Then the user should be redirected to the funds adding money transfer screen