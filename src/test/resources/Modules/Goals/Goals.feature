Feature: Goals

  @Sanity @Regression

    Given the user is on Goals Dashboard

  @Sanity @Regression

    Given the user is on Goals Dashboard

  @Sanity @Regression

    Given the user is on Goals Dashboard
    When the user clicks on the CTA for new goal
    And user select Your Goal type
    And user adds name of the goal
    And user select Target Date
    And user adds Target amount
    When user is on Goal Setup page
    And user click on the CTA for one time investment
    And user click on the CTA for See investment options
    Then user should see the details on Target portfolio
    And user clicks on the CTA for proceed with investment
    And user clicks on the CTA for setup a goal
    Then the goal should be placed successfully


  @Sanity @Regression
  Scenario: User should be able to navigate to goal details screen from goal dashboard
    Given the user is on Goals Dashboard
    And user clicks on see details for a particular goals
    Then user should see the goals detail for the respective goal

  @Sanity @Regression
  Scenario: Check whether the user is presented with a warning message when attempting to add an amount that is less than the minimum required amount in the goals section
    Given the user is on Goals Dashboard
    And User clicks on the CTA for new goal

  @Sanity @Regression
    Given the user is on Goals Dashboard









