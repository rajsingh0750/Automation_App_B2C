Feature: LRS


  @Sanity @Regression @Prod
   Scenario: Verify if the user is able to add money to buying power from MiniModule
    Given the user is on Appreciate App's Dashboard
    And User clicks on Profile icon
    And User clicks on Money Transfer CTA
    And User clicks on Add Money to Buying Power button
    And User enters the amount to be deposited
    And User clicks on continue button

    #And User Uploads the statement for first time
    And User click on tranfer from yes bank
    #And User Selects Next Button
    #And User Selects Next Button
    #And User Selects Next Button
    #And User Selects Next Button
    #And User Enters the PAN details
    #And User Enters the CustomerID
    #And User Enters the first OTP
    And User Selects Source of funds
    And User Clicks on Funds Drop Down
    #And User Confirms all the agreement checkbox
    And User Select Agree CheckBox
    And User click on Proceed
    And User Clicks On Confirm
    And User Adds MPIN
    #And User Selects YesLogin
    #And User submits the Net Banking Details
    #And User enters the Net Banking OTP
    Then the transaction should be successfull


  @Sanity @Regression @Prod
   Scenario: Validate Terms and Conditions in Review Transfer Screen
    Given the user is on Appreciate App's Dashboard
    And User clicks on Profile icon
    And User clicks on Money Transfer CTA
    And User clicks on Add Money to Buying Power button
    And User enters the amount to be deposited
    And User clicks on continue button
    And User Select Terms and Conditions option from review transfer screen
    Then User Should See Successfully Terms and Condition Description

  @Sanity @Regression @Prod
   Scenario: Verify if the user is able to add money to buying power  with the minimum allowed amount (1.20 Paise)
    Given the user is on Appreciate App's Dashboard
    And User clicks on Profile icon
    And User clicks on Money Transfer CTA
    And User clicks on Add Money to Buying Power button
    And User enters the amount in paise to be deposited
    And User clicks on continue button
    And User click on tranfer from yes bank
    #And User Selects Next Button
    #And User Selects Next Button
    #And User Selects Next Button
    #And User Selects Next Button
    And User Selects Source of funds
    And User Clicks on Funds Drop Down
    And User Select Agree CheckBox
    And User click on Proceed
    And User Clicks On Confirm  
    And User Adds MPIN
    Then the transaction should be successfull

  @Sanity @Regression @Prod
   Scenario: Check if error shows up when more than YES Bank balance entered for transfer.
    Given the user is on Appreciate App's Dashboard
    And User clicks on Profile icon
    And User clicks on Money Transfer CTA
    And User clicks on Add Money to Buying Power button
    And User enters the amount which is more than current balance in the YES bank
    Then User should see the error message like Insufficient YES Bank balance


     @Sanity @Regression @Prod
     Scenario: Validate FAQs in Upload Your Bank Statement
      Given the user is on Appreciate App's Dashboard
      And User clicks on Profile icon
      And User clicks on Money Transfer CTA
      And User clicks on Add Money to Buying Power button
     And User enters the amount to be deposited
     And User clicks on continue button
      And User Select Edit Upload statement
    #And User click on the tranfer from yes bank
    And User Selects Read FAQs
    Then User should see the FAQs Descriptions






  #@Regression @Stage
#  Scenario: Verify the presence of an error message when user uploads Bank Statement of different user.
  #Given User is on Trade dashboard
#    And User clicks on Add Funds
#    And User clicks on Add Money to Buying Power button
#    And User enters the deposit amount
#    And User uploads the invalid bank statement
#    Then User should see error message "Statement Name Mismatch"
#





 




#  @Sanity @Regression @Prod
#  Scenario: Validate Others in Bank listing
#    Given User is on Trade dashboard
#    And User clicks on Add Funds
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on the tranfer from yes bank
#    And User Select a Bank
#    And User Select Others
#    And User Selects Read FAQs
#    Then User should see the FAQs Descriptions



#  @Sanity @Regression @Prod
#  Scenario: Verify if the user is able to add money to buying power from Trade Dashboard
#    Given User is on Trade dashboard
#    And User clicks on Add Funds
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on tranfer from yes bank
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    #And User Enters the PAN details
#    #And User Enters the CustomerID
#    #And User Enters the first OTP
#    And User Selects Source of funds
#    And User Clicks on Funds Drop Down
#    And User Confirms all the agreement checkbox
#    And User click on Proceed
#    #And User Selects YesLogin
#    #And User submits the Net Banking Details
#    #And User enters the Net Banking OTP
#    And User Adds MPIN
#    Then the transaction should be successfull


#  @Sanity @Regression @Prod
#  Scenario: Verify if the user is able to add money to buying power from Goal Dashboard
#    Given the user is on Goals Dashboard
#    And User clicks on Add Funds
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on tranfer from yes bank
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    #And User Enters the PAN details
#    #And User Enters the CustomerID
#    #And User Enters the first OTP
#    And User Selects Source of funds
#    And User Clicks on Funds Drop Down
#    And User Confirms all the agreement checkbox
#    And User click on Proceed
#    #And User Selects YesLogin
#    #And User submits the Net Banking Details
#    #And User enters the Net Banking OTP
#    And User Adds MPIN
#    Then the transaction should be successfull




#  @Sanity @Regression @Prod
#  Scenario: Verify if the user is able to add money to buying power from Home Dashboard Plus icon
#    Given the user is on Appreciate App's Dashboard
#    And User clicks on Plus icon from Small investment and Large returns
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on tranfer from yes bank
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    #And User Enters the PAN details
#    #And User Enters the CustomerID
#    #And User Enters the first OTP
#    And User Selects Source of funds
#    And User Clicks on Funds Drop Down
#    And User Confirms all the agreement checkbox
#    And User click on Proceed
#    #And User Selects YesLogin
#    #And User submits the Net Banking Details
#    #And User enters the Net Banking OTP
#    And User Adds MPIN
#    Then the transaction should be successfull


#  @Sanity @Regression @Prod
#  Scenario: Verify if the user is able to add money to buying power from Home Dashboard Small Investment Section
#    Given the user is on Appreciate App's Dashboard
#    And User clicks on add funds from Small investment and Large returns section
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on tranfer from yes bank
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    And User Selects Next Button
#    #And User Enters the PAN details
#    #And User Enters the CustomerID
#    #And User Enters the first OTP
#    And User Selects Source of funds
#    And User Clicks on Funds Drop Down
#    And User Confirms all the agreement checkbox
#    And User click on Proceed
#    #And User Selects YesLogin
#    #And User submits the Net Banking Details
#    #And User enters the Net Banking OTP
#    And User Adds MPIN
#    Then the transaction should be successfull
















#

  #@Sanity @Regression @Prod
#  Scenario: Verify the presence of an error message when user adds wrong Phone number and Customer ID.
#    Given the user is on Appreciate App's Dashboard
#    And User clicks on Profile icon
#    And User clicks on Money Transfer CTA
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on tranfer from yes bank
#    And User Enter the Phone Number
#    And User Enter Wrong Customer ID
#    And User click on Proceed
#    Then the User should see error message "Transaction Processing Error!"


#  @Sanity @Regression @Prod
#  Scenario: Verify the presence of an error message when user adds Invalid PAN.
#    Given the user is on Appreciate App's Dashboard
#    And User clicks on Profile icon
#    And User clicks on Money Transfer CTA
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on tranfer from yes bank
#    And User Enter the Phone Number
#    And User Enter Wrong PAN ID
#    And User click on Proceed
#    #Then the User should see the error message as "Transaction Processing Error!"
#    Then the User should see the error message "Please enter valid PAN number."


#  @Sanity @Regression @Prod
#  Scenario: Verify if the user is able to add money to buying power from Home Dashboard
#    Given the user is on Appreciate App's Dashboard
#    #And User Select Profile
#    And User clicks on Add Funds
#    And User clicks on Add Money to Buying Power button
#    And User enters the amount to be deposited
#    And User clicks on continue button
#    And User click on tranfer from yes bank
#    #And User Selects Next Button
#    #And User Selects Next Button
#    #And User Selects Next Button
#    #And User Selects Next Button
#    #And User Enters the PAN details
#    #And User Enters the CustomerID
#    #And User Enters the first OTP
#    And User Selects Source of funds
#    And User Clicks on Funds Drop Down
#    #And User Confirms all the agreement checkbox
#    And User Select Agree CheckBox
#    And User click on Proceed
#    And User Clicks On Confirm
#    And User Adds MPIN
#    #And User Selects YesLogin
#    #And User submits the Net Banking Details
#    #And User enters the Net Banking OTP
#    Then the transaction should be successfull







