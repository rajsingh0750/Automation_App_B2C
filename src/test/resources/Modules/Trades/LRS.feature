Feature: LRS

  @Sanity @Regression
  Scenario: Verify if the user is able to add money to buying power when the statement is already uploaded
    Given the user is on Appreciate App's Dashboard
    And User clicks on Add Funds
    And User clicks on Add Money to Buying Power button
    And User enters the amount to be deposited
    And User clicks on continue button
    And User click on tranfer from yes bank
#    And User Uploads the statement for first time
    And User Enters the PAN details
    And User Enters the CustomerID
    And User click on Proceed
    And User Enters the first OTP
    And User Confirms all the agreement checkbox
    And User Selects YesLogin
    And User submits the Net Banking Details
    And User enters the Net Banking OTP
    And User see Transaction Details
    Then the transaction should be successfull





  @Regression
  Scenario: Verify the presence of an error message when user uploads Bank Statement of different user.
    Given User is on Trade dashboard
    And User clicks on Add Funds
    And User clicks on Add Money to Buying Power button
    And User enters the deposit amount
    And User uploads the invalid bank statement
    Then User should see error message "Statement Name Mismatch"


  @Sanity
  Scenario: Check if error shows up when more than YES Bank balance entered for transfer.
    Given User is on Trade dashboard
    And User clicks on Add Funds
    And User clicks on Add Money to Buying Power button
    And User enters the amount which is more than current balance in the YES bank
    Then User should see the error message like Insufficient YES Bank balance


  @Sanity
  Scenario: Check if error message shows up when the users enters the amount in decimals where all digits are in zero
    Given User is on Trade dashboard
    And User clicks on Add Funds
    And User clicks on Add Money to Buying Power button
    And User enters the amount in decimal with all zeros
    Then User should see the error message like Please enter amount to proceed

  @Sanity
  Scenario: Check if user is able to enter the complete YES Bank balance and proceed.
    Given User is on Trade dashboard
    And User clicks on Add Funds
    And User clicks on Add Money to Buying Power button
    And User enters full amount available in the Yes bank
    Then User should be able to proceed for further in the LRS journey

  @Sanity
  Scenario: Check that bank statement more than 12 months are not rejected by Perfios
    Given User is on Trade dashboard
    And User clicks on Add Funds
    And User clicks on Add Money to Buying Power button
    And User enters the deposit amount
    And User uploads the bank statement of more than twelve months and it should get uploaded successfully


  @Sanity
  Scenario: Check message app
    Given User is on enter phone number screen
    Then User is on Message App

