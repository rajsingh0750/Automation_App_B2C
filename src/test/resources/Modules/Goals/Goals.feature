Feature: Goals

  @Sanity @Regression
  Scenario: User sees the Add Funds banner on the Goals

    Given the user is on Goals Dashboard
    And a banner or information is displayed prompting the user to Add Funds
    When the user clicks on the CTA for adding funds
    Then the user should be redirected to the funds adding money transfer screen

  @Sanity @Regression
  Scenario: User sees the Goal Calculator banner on the Goals

    Given the user is on Goals Dashboard
    And a banner or information is displayed prompting the user to Goal Calculator
    When the user clicks on the CTA for goal calculator
    Then the user should be redirected to the goal to calculate target goal amount


  @Regression
  Scenario: Verify Whether the user is able to edit Current age and Retirement age from goal calculator screen

    Given the user is on Goals Dashboard
    When the user clicks on the CTA for goal the calculator
    And user edits the current age and retire age
    And user adds monthly expenses
    And the user clicks on the CTA for target amount
    Then user should see the same details on goal calculator details page

  @Sanity @Regression
  Scenario: Validate the creation of new goals

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
    Then User Should see the following message "Minimum monthly payment amount is 150 Please increase target amount to at least 221 to continue setting up this goal"

    @Sanity @Regression
  Scenario: Verify new goals creation in draft status
    Given the user is on Goals Dashboard
    When the user clicks back button from review goal page
    Then user should be prompted with dialog whether to save the goal as draft or not
    And user accepts to save as draft
    Then Goal should be saved as draft









