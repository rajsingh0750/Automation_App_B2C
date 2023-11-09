#Feature: LRS
#
#Scenario: Verify the presence of an error message when user uploads invalid Bank Statement.
#Given User is on Trade dashboard
#And User clicks on Add Funds
#And User clicks on Add Money to Buying Power button
#And User enters the deposit amount
#And User clicks on continue button
#And User Uploads the invalid bank statement
#Then User should see error message "Statement Name Mismatch"