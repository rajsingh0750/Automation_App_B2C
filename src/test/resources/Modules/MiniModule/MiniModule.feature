Feature: MiniModule

  @Sanity @Regression
  Scenario Outline: Validate if the profile details are displayed as per the logged-in User
    Given User is on Logged in Screen
    When User enters "<email>"
    And User navigates to Profile details screen
    Then User should see the information like "<FullName>","<DOB>","<Gender>","<MaritalStatus>","<EducationQualification>","<OccupationType>" and "<AnnualIncome>" under profile details as per login
    And User should see Contact Details like "<MobileNumber>" and "<EmailId>" as per the login
    And User should see Permanent Address like "<Address>","<City>","<District>" ,"<State>","<PinCode>" as per the login
    And User should see KYC Details like "<PanNumber>" as per the login
    And User should see the Nominee Details like "<NomineeName>","<DateOfBirth>","<PhoneNumber>" as per the login
    Examples:
      | email                         | password | FullName        | DOB          | Gender | MaritalStatus | EducationQualification | OccupationType | AnnualIncome | MobileNumber | EmailId                       | Address                                                                                                                                         | City   | District | State         | PinCode | PanNumber  | NomineeName | DateOfBirth | PhoneNumber |
      | shubh.kr.rjpt@gmail.com       | Demo@123 | Shubham Kumar   | 04 Sep, 1994 | Male   | Single        | Graduate               | Salaried       | 5-10 Lakhs   | 9538256787   | shubh.kr.rjpt@gmail.com       | CO  Ashok Kumar  18  ganga nagar asroli  balmukand hero  Etah  Etah  Uttar Pradesh - 207001                                                     | Etah   |          | Uttar Pradesh | 207001  | XXXXXX328J | ASHOK KUMAR | 08/05/1960  | 8630661542  |
      | faureretruba-9695@yopmail.com | Test@123 | sanjeev Tanniru | 25 May, 1988 | Male   | Married       | Graduate               | Salaried       | 20-25 Lakhs  | 9326459356   | faureretruba-9695@yopmail.com | S / O Ashok Balayya Tanniru  57 - 1 / 21  Mata Ramabai  Ambedkar Nagar  Jijamata  Nagar  Dr E Moses Road  Worli SO  Mumbai  Maharashtra  400018 | Mumbai |          | Maharashtra   | 400018  | XXXXXX991J |             |             |             |

  @smoke
  Scenario: Verify functionality of cross icon
    Given the user is on Appreciate App's Dashboard
    And User navigates to the Profile details screen
    And User Clicks on close button
    Then It should close the profile details pop-up

  @smoke
  Scenario: User logs out from the mini-module
    Given the user is on Appreciate App's Dashboard
    And User clicks on Profile icon
    Then User logs out and should see the sign in page

  @smoke
  Scenario: Verify if user is able to update the annual income
    Given the user is on Appreciate App's Dashboard
    And User navigates to the Profile details screen
    And User updates the Annual Income
    Then Annual Income should be updated under profile details


#@Sanity @Regression
#Scenario: Validate Accounts page in MinimModule
#Given the User is on MiniModule page
#And the User Clicks on Accounts
#When User is on Your Account Page
#And User clicks on info icon
#And User Select Okay button
#When user is on DriveWealth Page
#And User should see the DriveWealthAccount Details
#Then User should see Margin and Cash Account details on DriveWealth

  @Sanity @Regression
  Scenario: Validate Account Details in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Buying Power
    And the User Clicks on Account Details
    Then User Should See Drive Wealth Account Details


  @Sanity @Regression
  Scenario: Validate Refer your friends block in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on refer now
    When user is on Rewards and Incentives page
    And User is on Refer a friend page
    And User Clicks on Rewards
    And User Clicks on Coupons
    Then User Should see successfully Rewards and Incentives

  @Sanity @Regression
  Scenario: Validate Pricing page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Pricing
    When User is on Pricing page
    And User clicks on info icon of Goals
    And User Select Okay button
    And User clicks on info icon of Trade
    And User Select Okay button
    And User clicks on info icon of CashBack
    And User Select Okay button
    Then User Should see Other fees with all the Pricing details

  @Sanity @Regression
  Scenario: Validate CSR page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on CSR
    And User see Invest like a Woman in CSR
    And User see shoots in CSR
    And User see Investing for everyone in CSR
    Then User Should see all Our Key Initiatives details

  @Sanity @Regression
  Scenario: Validate CSR page for Suggestions in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on CSR
    And User see Send us your suggestions
    And User Select Submit
    And User see the following message on email "Please enter valid email"
    And User see the following message on suggestion "Please tell us what you think"
    Then User Should see error message must be displayed

  @Sanity @Regression
  Scenario: Verify When User Submit feedback from CSR page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on CSR
    And User see Send us your suggestions
    And User Enter Valid EmailId
    And User Adds Feedback
    And User Select Submit
    Then User Should Successfully create a feedback Note


  @Sanity @Regression
  Scenario: Validate Legal page for Appreciate Terms and Condition in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Legal
    And User Clicks on Appreciate Platform
    And User see Terms of Use
    And the User Clicks on Legal
    And User Click on Appreciate Broking
    And User see Appreciate Broking Information
    And the User Clicks on Legal
    And User Clicks on Registration
    And User Select View Registration Number
    And User Select back icon
    Then User Should see all Terms and Condition in Legal details

  @Sanity @Regression
  Scenario: Validate Legal page for Appreciate Drive Wealth for Partner Terms and Condition in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Legal
    And User Clicks on Drive Wealth
    And User see Terms and Disclosure
    And the User Clicks on Legal
    And User Clicks on Drive Wealth
    And User Clicks on Privacy Policy
    And the User Clicks on Legal
    And User Clicks on Drive Wealth
    And User Clicks on W-BEN
    Then User Should see all Drive Wealth for Partner Terms and Condition in Legal details

  @Sanity @Regression
  Scenario: Validate Legal page for Appreciate Yes Bank in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Legal
    And User Clicks on YES Bank
    And User see Do you want to download PDF file?
    And User Clicks on Download
    And User see the following Toast message Downloading File
    Then User Download the file successfully


  @Sanity @Regression
  Scenario: Validate Support page  in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Support
    And User Clicks on Submit a Ticket
    And User Select issue type
    And User enters Subject
    And User enters Your message
    And User clicks on the CTA for Submit a ticket
    Then User should successfully create a support ticket


  @Sanity @Regression
  Scenario: Validate Recent Tickets Page in Support
    Given the User is on MiniModule page
    And the User Clicks on Support
    And the User Clicks on Recent Tickets
    Then User Should see all the Recent Tickets details

  @Sanity @Regression
  Scenario: Validate Change Language in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Change Language
    And User Clicks on Hindi language
    And User Select Continue
    When User is on Passcode page
    And User Clicks on CTA of Profile
    And User should see Profile name text must be change to प्रोफाइल
    Then User should successfully see change language

  @Sanity @Regression
  Scenario: Validate About Us in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on About Us
    And User see Our Mission Banner
    And User see Our Vision and Values
    Then User Should see all the details in About Us

  @Sanity @Regression
  Scenario: Verify the accuracy of the most recent transactions presented for both Goals and Cash in the MiniModule
    Given the user is on Goals Dashboard for latest transaction
    When the user clicks on the CTA for new goal
    And user select Your Goal type
    And user adds name of the  latest goal
    And user select Target Date for latest goal
    And user adds Target amount for latest goal
    When user is on Goal Setup page
    And user click on the CTA for one time investment
    And user click on the CTA for See investment options
    Then user should see the details on Target portfolio
    And user clicks on the CTA for proceed with investment
    And user clicks on the CTA for setup a goal
    And user clicks on pay now and continue
    And user click on the CTA take me back to goals
    And the user Clicks MiniModule page
    And the User Clicks on Transactions
    And User is on Goals Tab and see the latest goal created
    And User Clicks on Cash Tab and see the latest data
    Then User should see all the latest transaction in the list


  @Sanity @Regression
  Scenario: Validate Change Language from English to Hindi and vice versa all the four dashboards Home, Goals, Trades, Change
    Given the User is on MiniModule page
    And the User Clicks on Change Language
    And User Clicks on Hindi language
    And User Select Continue
    When User is on Passcode page
    And User is on Home dashboard
    And User Clicks on Goals dashboard
    And User Clicks on Trade dashboard
    And User Clicks on Change dashboard
    And User should see Hindi language in all dashboards
   Then User should successfully see English language in all dashboards


  @Sanity @Regression
  Scenario: Validate Portfolio in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Portfolio
    And User see Your portfolio
    Then User Should see Trade and Goals portfolio


  @Sanity @Regression
  Scenario: Validate Add-On Services in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Add-On Services
    Then User Should see all Add-On Services details

  @Sanity @Regression
  Scenario: Validate  Distributor and Request Advisory services in Add-On Services
    Given the User is on MiniModule page
    And the User Clicks on Add-On Services
    And the User Clicks on Distributor or Agent Details
    And the User Clicks on Request Advisory Services
    And User Selects Thinking of Hiring
    Then User should see all the options in Add-on Services



@Sanity @Regression
 Scenario: Verify the Account Passcode Change in MiniModule
      Given the User is on MiniModule page for passcode
      And the User Clicks on Settings & Preferences
      And the User Clicks on Change Passcode
      And the User Enters the OTP
      And the User Change the new passcode
      Then the User Confirm the new passcode


  @Sanity @Regression
  Scenario: Validate Support page  in MiniModule from Profile
    Given the User is on MiniModule page
    And User navigates to the Profile screen
    And User Clicks on the Submit a Ticket in Profile Details
    And User Select issue type
    And User enters Subject
    And User enters Your message
    And User clicks on the CTA for Submit a ticket
    Then User should successfully create a support ticket from Profile Details Page



  @Sanity @Regression
  Scenario: Validate Documents in MiniModule
    Given the User is on MiniModule page
    And User Clicks on the Documents
    And User Select Monthly Statements
    And User Select Confirmations
    And User Select Tax Documents
    Then User Should see Successfully all the documents in each option






