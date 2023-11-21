Feature: Sign in

   Scenario: Navigate to Sign in screen
    Given App is launched
    When User clicks continue button
    And User clicks on get started button
    Then User should be on Sign in page

   Scenario: Sign in with Valid credentials
    Given User should be on Sign in page
    Then User clicks on SignIn Button

   Scenario: Sign in with invalid phone-number
    Given User is on enter phone number screen
    And User enters invalid number
    And User enters valid password
    Then User should see the popup message like Invalid Username




  Scenario: Sign in with invalid OTP
    Given User is on enter phone number screen
    And User enters valid number
    And User enters valid password
    And User enters invalid OTP
    Then User should see the popup message "Incorrect OTP entered, please try again"

  Scenario: Sign in without passing phone number
    Given User is on enter phone number screen
    And User clicks on Signin button
    Then User should see the error message "Please enter valid mobile number"

#  Scenario: Sign in without passing password
#    Given User is on enter phone number screen
#    And User enters valid number
#    And User clicks on Signin button
#    And User clicks on send me an OTP button
#    Then User should see the error message "message username or password is invalid"

  Scenario: Verify if user is able to reset the password
    Given User is on the forgot password screen
    And User click on Forgot password link
    And User enters valid number
    And User clicks on send me an OTP button
    And User enters valid OTP and confirms the OTP
    And User enters valid passcode
    And User enters new password
    And User confirms the new password
    Then user should be on New Password set Screen


#    Scenario: Get OTP from messaging app
#      Given User should be on Sign in page
#      Then User opens the messaging app copies the otp
#
#  Scenario: SignIn without OTP bypass
#    Given User should be on Sign in page
#    Then User should be able to login without OTP bypass









