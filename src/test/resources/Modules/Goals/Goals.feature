Feature: Goals

  @Sanity @Regression
  Scenario: Validate the creation of Goal for Digital Gold

    Given the user is on Goals Dashboard
    When the user clicks on the CTA for digital gold
    And user select Digital GoldTarget Date
    And user adds Digital Gold Target amount
    Then user should see the Digital Gold details on Target portfolio
    And user clicks on the CTA for proceed with investment in digital gold
    And user select pay now for one time investment
    When user is on ontime payment block
    And user clicks on continue button
    And user see the status as paid
    Then the digital gold goal should be placed successfully


  @Sanity @Regression
  Scenario: Validate the creation of Retirement goals for Monthly Payment

    Given the user is on Goals Dashboard
    And user select Retire goal type
    And user click on the CTA for monthly payment
    When user is on Optional payment page
    And user adds one-time payment for retirement
    And user click on the CTA to proceed with one-time payment
    Then user should be on the Step Up page
    And user click increase monthly investment by
    And user click on the CTA for proceed with step up
    And user clicks on okay button
    And user see setup details
    And user see Investment details
    And user click on the CTA for next
    And the Retirement goal for monthly payment is successfully created
    And user click on the CTA take me back to goals
    Then user sucessfully Creates monthly payment Retirement goals

  @Sanity @Regression
  Scenario: Validate the creation of Retirement Goal

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
  Scenario: Validate Goal Creation without one time payment mode for Retirement Goal Type
    Given the user is on Goals Dashboard
    And user click on the CTA to proceed without one-time payment
    And user click on the CTA for proceed without step up
    Then the Retirement goal for without one-time payment is successfully created

  @Sanity @Regression
  Scenario: Validate the creation of Education Fund goals

    Given the user is on Goals Dashboard
    And user select Education Goal type
    And user clicks on Investment details
    Then the goal should be placed education fund successfully

  @Sanity @Regression
  Scenario: Validate the creation of Dream Home goals

    Given the user is on Goals Dashboard
    And user select Dream Home Goal type
    And user clicks on Home Investment details
    Then the goal should be placed Dream Home successfully

  @Sanity @Regression
  Scenario: Verify new goals creation in draft status
    Given the user is on Goals Dashboard
    When the user clicks back button from review goal page
    Then user should be prompted with dialog whether to save the goal as draft or not
    And user accepts to save as draft
    Then Goal should be saved as draft

  @Sanity @Regression
  Scenario: User should be able to navigate to goal details screen from goal dashboard
    Given the user is on Goals Dashboard
    And user clicks on see details for a particular goals
    Then user should see the goals detail for the respective goal

  @Sanity @Regression
  Scenario: User sees the Goal Calculator banner on the Goals

    Given the user is on Goals Dashboard
    And a banner or information is displayed prompting the user to Goal Calculator
    When the user clicks on the CTA for goal calculator
    Then the user should be redirected to the goal to calculate target goal amount

  @Sanity @Regression
  Scenario: Verify Whether the user is able to edit Current age and Retirement age from goal calculator screen

    Given the user is on Goals Dashboard
    When the user clicks on the CTA for goal the calculator
    And user edits the current age and retire age
    And user adds monthly expenses
    And the user clicks on the CTA for target amount
    Then user should see the same details on goal calculator details page

  @Sanity @Regression
  Scenario: Verify whether the user is presented with a confirmation message when increasing the investment amount
    Given the user is on Goals Dashboard
    When  the user is on Goals Setup page
    And user clicks on plus button
    Then user should see the message "Nice! you may get more returns!"

  @Sanity @Regression
  Scenario: Verify whether the user is presented with a confirmation message when decreasing the investment amount
    Given the user is on Goals Dashboard
    When  the user is on Goals Setup page
    And user clicks on minus button
    Then user should see the following message "Target amount has decreased!"


  @Sanity @Regression
  Scenario: The user should see an error message prompt current age less than 18

    Given the user is on Goals Dashboard
    When the user clicks on the CTA for goal calculator
    And user selects goal type
    And user edits the current age
    Then User should be prompted with error message "Enter current age 18 and above"


  @Sanity @Regression
  Scenario: Check whether the user is presented with a warning message when attempting to add an amount that is less than the minimum required amount in the goals section
    Given the user is on Goals Dashboard
    And User clicks on the CTA for new goal
    Then User Should see the following message

  @Sanity @Regression
  Scenario: Check whether the user is presented with a warning message when attempting to edit Step up value more than the target amount in the Review goals section
    Given the user is on Goals Dashboard
    And user select Retirement goal type
    And user click on the CTA for monthly payment
    When user is on Optional payment page
    And user adds one-time payment for retirement in Stepup
    And user click on the CTA to proceed with one-time payment
    Then user should be on the Step Up page
    And user click increase monthly investment by
    And user click on the CTA for proceed with step up
    And user clicks on okay button
    When user is in Review Goal Page
    And user see setup details
    And user select edit step up and increase investment
    Then user Should see the following message in Step up "The edited Stepup has pushed your target amount beyond the maximum limit. Please reduce Stepup."

  @Sanity @Regression
  Scenario: Check whether the user is presented with a warning message when attempting to edit One Time Payment value more than the target amount in the Review goals section

    Given the user is on the Goals Dashboard
    And user select Retirement goal type for payment
    When user is on Goal Setup page
    And user click on the CTA for one time investment
    And user click on the CTA for See investment options
    Then user should see the details on Target portfolio
    And user clicks on the CTA for proceed with investment
    When user is in Review Goal Page
    And user select edit One time payment
    Then user Should see the following message in One Time Payment "The edited One time payment has pushed your target amount beyond the maximum limit. Please reduce One time payment."


  @Sanity @Regression
  Scenario: Check whether the user is presented with a warning message when attempting to add an amount that is less than the minimum required amount in the digital gold section
    Given the user is on Goals Dashboard
    And the user clicks on the CTA for goals on digital gold
    Then User Should see the following message in digital gold "Minimum monthly payment amount is ₹150 Please increase target amount to at least ₹4,318 to continue setting up this goal"



  @Sanity @Regression
  Scenario: Check whether the user is presented with a warning message when attempting to add an amount that is large than the target date in the digital gold section
    Given the user is on Goals Dashboard
    And the user clicks on the CTA for large amount on digital gold
    Then User Should see the following message in digital gold for large amount "Target amount too large for selected Target date. Either decrease Target amount or increase Target date to continue."


  @Sanity @Regression
  Scenario: Validate if the Total P&L value is correct
    Given the user is on Goals Dashboard
    And User sees invested amount and current value on Goal dashboard
    Then the P&L amount should be based on the invested amount and current value

  @Sanity @Regression
  Scenario: Validate if the percentage change shown under Overview is correct for Total P&L
    Given the user is on Goals Dashboard
    Then User should see percentage change of P&L based on the Invested and Current Savings


  @Sanity @Regression
  Scenario: Verify Setup Up Goals in draft status
    Given the user is on Goals Dashboard
    And User Click on Draft Goals
    And User Select Goals in draft status
    And user clicks on the CTA for setup a goal from draft page
    And user click on the CTA take me back to goals
    Then User should successfully create goals from draft


  @Sanity @Regression
  Scenario: Verify that monthly Goals can be paused

    Given the User is on Goals Dashboard for monthly goal pause
    And user select Retire goal type
    And user click on the CTA for monthly payment
    When user is on Optional payment page
    And user adds one-time payment for retirement
    And user click on the CTA to proceed with one-time payment
    Then user should be on the Step Up page
    And user click increase monthly investment by
    And user click on the CTA for proceed with step up
    And user clicks on okay button
    And user see setup details
    And user see Investment details
    And user click on the CTA for next
    And the Retirement goal for monthly payment is successfully created
    And user click on the CTA take me back to goals
    And user selects mothly goals in Active List
    And user clicks on Pause option
    And user selects pause SIP button
    When user selects go back to goals
    And user selects history
    Then user should see Pause status


  @Sanity @Regression
  Scenario: Verify that monthly Goals can be Resume

    Given the User is on Goals Dashboard for monthly goal Resume
    And user select Retire goal type
    And user click on the CTA for monthly payment
    When user is on Optional payment page
    And user adds one-time payment for retirement
    And user click on the CTA to proceed with one-time payment
    Then user should be on the Step Up page
    And user click increase monthly investment by
    And user click on the CTA for proceed with step up
    And user clicks on okay button
    And user see setup details
    And user see Investment details
    And user click on the CTA for next
    And the Retirement goal for monthly payment is successfully created
    And user click on the CTA take me back to goals
    And user selects mothly goals in Active List
    And user clicks on Pause option
    And user selects pause SIP button
    And user selects Resume this goal
    And user click on the CTA for Skip
    And user selects history
    Then user should not see the Pause status goals in the list


  @Sanity @Regression
  Scenario: Verify that monthly Goals can be Cancel

    Given the User is on Goals Dashboard for monthly goal Cancel
    And user select Retire goal type
    And user click on the CTA for monthly payment
    When user is on Optional payment page
    And user adds one-time payment for retirement
    And user click on the CTA to proceed with one-time payment
    Then user should be on the Step Up page
    And user click increase monthly investment by
    And user click on the CTA for proceed with step up
    And user clicks on okay button
    And user see setup details
    And user see Investment details
    And user click on the CTA for next
    And the Retirement goal for monthly payment is successfully created
    And user click on the CTA take me back to goals
    And user selects mothly goals in Active List
    And user clicks on Pause option
    And user selects pause SIP button
    And user selects Resume this goal
    And user click on the CTA for Skip
    And user selects history
    Then user should not see the Pause status goals in the list