Feature: MiniModule

#  @Stage @Regression
#  Scenario Outline: Validate if the profile details are displayed as per the logged-in User
#    Given User is on Logged in Screen
#    When User enters "<email>"
#    And User navigates to Profile details screen
#    Then User should see the information like "<FullName>","<DOB>","<Gender>","<MaritalStatus>","<EducationQualification>","<OccupationType>" and "<AnnualIncome>" under profile details as per login
#    And User should see Contact Details like "<MobileNumber>" and "<EmailId>" as per the login
#    And User should see Permanent Address like "<Address>","<City>","<District>" ,"<State>","<PinCode>" as per the login
#    And User should see KYC Details like "<PanNumber>" as per the login
#    And User should see the Nominee Details like "<NomineeName>","<DateOfBirth>","<PhoneNumber>" as per the login
#    Examples:
#      | email                         | password | FullName        | DOB          | Gender | MaritalStatus | EducationQualification | OccupationType | AnnualIncome | MobileNumber | EmailId                       | Address                                                                                                                                         | City   | District | State         | PinCode | PanNumber  | NomineeName | DateOfBirth | PhoneNumber |
#      | shubh.kr.rjpt@gmail.com       | Demo@123 | Shubham Kumar   | 04 Sep, 1994 | Male   | Single        | Graduate               | Salaried       | 5-10 Lakhs   | 9538256787   | shubh.kr.rjpt@gmail.com       | CO  Ashok Kumar  18  ganga nagar asroli  balmukand hero  Etah  Etah  Uttar Pradesh - 207001                                                     | Etah   |          | Uttar Pradesh | 207001  | XXXXXX328J | ASHOK KUMAR | 08/05/1960  | 8630661542  |
#      | faureretruba-9695@yopmail.com | Test@123 | sanjeev Tanniru | 25 May, 1988 | Male   | Married       | Graduate               | Salaried       | 20-25 Lakhs  | 9326459356   | faureretruba-9695@yopmail.com | S / O Ashok Balayya Tanniru  57 - 1 / 21  Mata Ramabai  Ambedkar Nagar  Jijamata  Nagar  Dr E Moses Road  Worli SO  Mumbai  Maharashtra  400018 | Mumbai |          | Maharashtra   | 400018  | XXXXXX991J |             |             |             |


  @Sanity @Regression
   Scenario: Verify functionality of cross icon
    Given the user is on Appreciate App's Dashboard
    And User navigates to the Profile details screen
    And User Clicks on close button
    Then It should close the profile details pop-up

    #Done change the xpath for close btn


  @Sanity @Regression
   Scenario: User logs out from the mini-module
    Given the user is on Appreciate App's Dashboard
    And User clicks on Profile icon
    Then User logs out and should see the sign in page

    #Done


  @Sanity @Regression
   Scenario: Verify if user is able to update the annual income
    Given the user is on Appreciate App's Dashboard
    And User navigates to the Profile details screen
    And User updates the Annual Income
    Then Annual Income should be updated under profile details

    #Done change the xpath for close btn


    @Sanity @Regression
   Scenario: Validate Accounts page in MinimModule
    Given the User is on MiniModule page
     And the User Clicks on Accounts
     When User is on Your Account Page
      And User clicks on info icon
     And User Select Okay button
    When user is on DriveWealth Page
    And User should see the DriveWealthAccount Details
    Then User should see Margin and Cash Account details on DriveWealth


  @Sanity @Regression
   Scenario: Validate Account Details in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Buying Power
    And the User Clicks on Account Details
    Then User Should See Drive Wealth Account Details

    #Buying power not in app


  @Sanity @Regression
   Scenario: Validate Refer your friends block in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on refer now
    When user is on Rewards and Incentives page
    And User is on Refer a friend page
    And User Clicks on Rewards
    And User Clicks on Coupons
    Then User Should see successfully Rewards and Incentives

    #Done

  @Sanity @Regression
   Scenario: Validate Pricing page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Pricing
    When User is on Pricing page
    And User clicks on info icon of Goals
    And User clicks on info icon of AUM charges
    And User Select the Okay button
    And User clicks on info icon of Trade
    And User clicks on info icon of Transaction Fee
    And User Select the Okay button
    And User clicks on info icon of CashBack
    And User Select the Okay button
    Then User Should see Other fees with all the Pricing details



    #Done


  @Sanity @Regression
  Scenario: Validate CSR page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on CSR
    And User see Invest like a Woman in CSR
    And User see shoots in CSR
    And User see Investing for everyone in CSR
    Then User Should see all Our Key Initiatives details


    #Done

  @Sanity @Regression
  Scenario: Validate CSR page for Suggestions in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on CSR
    And User see Send us your suggestions
    And User Select Submit
    And User see the following message on email "Please enter valid email"
    And User see the following message on suggestion "Please tell us what you think"
    Then User Should see error message must be displayed

    #Done


  @Sanity @Regression
  Scenario: Verify When User Submit feedback from CSR page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on CSR
    And User see Send us your suggestions
    And User Enter Valid EmailId
    And User Adds Feedback
    And User Select Submit
    Then User Should Successfully create a feedback Note


    #Done   change the function of valid email id


  @Sanity @Regression
  Scenario: Validate Legal page for Appreciate Terms and Condition in MiniModule
#    Given the User is on MiniModule page
    And the User Clicks on Legal
    And User Clicks on Appreciate Platform
    And User see Terms of Use
    And the User Clicks on Legal
    And User Click on Appreciate Broking
    And User see Appreciate Broking Information
    And the User Clicks on Legal
    And User Clicks on Registration
    And User Select View Registration Number
#    And User Select back icon
    Then User Should see all Terms and Condition in Legal details


    #changesd all according  to old one



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

    # change the navigation for all, path of w-ben
    #Done


  @Sanity @Regression
  Scenario: Validate Legal page for Appreciate Yes Bank in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Legal
    And User Clicks on YES Bank
    And User see Do you want to download PDF file?
    And User Clicks on Download
    #And User see the following Toast message Downloading File
    Then User Download the file successfully

    #Done


  @Sanity @Regression
  Scenario: Validate Support page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Support
    And User Clicks on Submit a Ticket
    And User Select issue type
    And User enters Subject
    And User enters Your message
    And User clicks on the CTA for Submit a ticket
    Then User should successfully create a support ticket

    #Done




  @Sanity @Regression
  Scenario: Validate Recent Tickets Page in Support
   Given the User is on MiniModule page
    And the User Clicks on Support
    And the User Clicks on Recent Tickets
    Then User Should see all the Recent Tickets details





#  @Sanity @Regression
#  Scenario: Validate Change Language in MiniModule
##    Given the User is on MiniModule page
#    And the User Clicks on Change Language
#    And User Clicks on Hindi language
#    And User Select Continue
#    When User is on Passcode page
#    And User Clicks on CTA of Profile
#    And User should see Profile name text must be change to प्रोफाइल
#    Then User should successfully see change language

    # after changing to hindi profile is not showing in hindi lang


  @Sanity @Regression
  Scenario: Validate About Us in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on About Us
    And User see Our Mission Banner
    And User see Our Vision and Values
    Then User Should see all the details in About Us

    #Done


#  @Sanity @Regression
#  Scenario: Verify the accuracy of the most recent transactions presented for both Goals and Cash in the MiniModule
#    Given the user is on Goals Dashboard for latest transaction
#    When the user clicks on the CTA for new goal
#    And user select Your Goal type
#    And user adds name of the  latest goal
#    And user select Target Date for latest goal
#    And user adds Target amount for latest goal
#    When user is on Goal Setup page
#    And user click on the CTA for one time investment
#    And user click on the CTA for See investment options
#    Then user should see the details on Target portfolio
#    And user clicks on the CTA for proceed with investment
#    And user clicks on the CTA for setup a goal
#    And user clicks on pay now and continue
#    And user click on the CTA take me back to goals
#    And the user Clicks MiniModule page
#    And the User Clicks on Transactions
#    And User is on Goals Tab and see the latest goal created
#    And User Clicks on Cash Tab and see the latest data
#    Then User should see all the latest transaction in the list


#  @Sanity @Regression
#  Scenario: Validate Change Language from English to Hindi and vice versa all the four dashboards Home, Goals, Trades, Change
##    Given the User is on MiniModule page
#    And the User Clicks on Change Language
#    And User Clicks on Hindi language
#    And User Select Continue
#    When User is on Passcode page
#    And User is on Home dashboard
#    And User Clicks on Goals dashboard
#    And User Clicks on Trade dashboard
#    And User Clicks on Change dashboard
#    And User should see Hindi language in all dashboards
#    Then User should successfully see English language in all dashboards


    #after changing language home dashboard, goal, trade are not showing in hindi lang


  @Sanity @Regression
   Scenario: Validate Portfolio in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Portfolio
    And User see Your portfolio
    Then User Should see Trade and Goals portfolio

    #Done


  @Sanity @Regression
   Scenario: Validate Add-On Services in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Add-On Services
    Then User Should see all Add-On Services details

    #Done



  @Sanity @Regression
   Scenario: Validate  Distributor and Request Advisory services in Add-On Services
    Given the User is on MiniModule page
    And the User Clicks on Add-On Services
    And the User Clicks on Distributor or Agent Details
    And the User Clicks on Request Advisory Services
    And User Selects Thinking of Hiring
    Then User should see all the options in Add-on Services

    #Done



  @Sanity @Regression
   Scenario: Verify the Account Passcode Change in MiniModule
    Given the User is on MiniModule page for passcode
    And the User Clicks on Settings & Preferences
    And the User Clicks on Change Passcode
    And the User Enters the OTP
    And the User Change the new passcode
    Then the User Confirm the new passcode

      #Done


  @Sanity @Regression
  Scenario: Validate Support page  in MiniModule from Profile
    Given the User is on MiniModule page
    And User navigates to the Profile screen
    And User Clicks on the Submit a Ticket in Profile Details
    And User Select the issue type
    And User enters the Subject
    And User enters the Your message
    And User clicks on the CTA for Submit a ticket in profile
    Then User should successfully create a support ticket from Profile Details Page

    #Done



  @Sanity @Regression
  Scenario: Validate Documents in MiniModule
    Given the User is on MiniModule page
    And User Clicks on the Documents
    And User Select Monthly Statements
    And User Select Confirmations
    And User Select Tax Documents
    Then User Should see Successfully all the documents in each option

    #Done




  @Sanity @Regression
  Scenario: Validate FAQs in Support page
    Given the User is on MiniModule page
    And the User Clicks on Support
    And User Clicks FAQs
    And User Select Product FAQs
    And User Select Partner FAQs
#    And User Select Company FAQs
    Then FAQs pages Should load Successfully

    #Done




#  @Sanity @Regression
#  Scenario: Validate Buying Power info
#    Given the User is on MiniModule page
#    And the User Clicks on Buying Power
#    And Select info icon
#    Then User should see all information related to buying power


  @Sanity @Regression
  Scenario: Validate Chat With Us on WhatsApp is present in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on Support
    Then User Should see Chat with us on whatsApp

    #Done


  @Regression
  Scenario: Verify the presence of an error message when user Withdraw Funds from buying power
    Given the User is on MiniModule page
    And the User Clicks on Buying Power
    And the User Clicks on Withdraw
    And the User enters the amount
    Then User should see error message must be displayed "Insufficient buying power balance"


  @Sanity @Regression
  Scenario: Validate Day Trade Settings in MiniModule
Given the User is on MiniModule page
    And the User Clicks on Settings & Preferences
    And User Select Day Trade Settings
    And User Clicks on Day Trading
    And User Clicks on Pattern Day
    Then User should see all the Trade setting descriptions


  @Stage @Regression
  Scenario: Verify Enable PDT in MiniModule
   Given the User is on the MiniModule page
    And the User Clicks on Settings & Preferences
    And User Select Day Trade Settings
    And User Clicks on Enable Pattern Day Trading
    Then User should see a toast message saying PDT Enabled

  @Stage @Regression
  Scenario: Verify Disable PDT in MiniModule
Given the User is on the MiniModule page
    And the User Clicks on Settings & Preferences
    And User Select Day Trade Settings
    And User Clicks on Disable Pattern Day Trading
    Then User should see a toast message saying PDT Disabled


  @Sanity @Regression
  Scenario: Validate Account Value Description in Day trade
    Given the User is on MiniModule page
    And the User Clicks on Settings & Preferences
    And User Select Day Trade Settings
    And User Clicks on View account value
    Then User should see all description related to account value

    #Done


#  @Sanity @Regression
#  Scenario: Verify Profile Upload in MiniModule
#    Given the User is on MiniModule page
#    And User navigates to the Profile screen
#    And User Select Choose From Device
#    And User Select Gallery Option
#    And User Select Photo From Device
#    Then the User Profile Photo should be Updated Successfully



  @Sanity @Regression
  Scenario: Validate US Wallet Amount
    Given the User is on MiniModule page
    When User click on US Wallet
    Then User will verify the US Wallet Amount

    #Done    change coordinates for us wallet, minor code changes
  #Due to difference of 0.1 assert is not working






  Scenario: Passcode must be clear if we enter incorrect passcode and user should be able to to re-enter the passcode again
    Given User enter wrong passcode
    Then The passcode must be clear by default and user should be able to re-enter the passcode again
    And User should see the home dashboard


    #if we enter correct passcode then , will be logged in , can't kill and check , doing for wrong one
  Scenario: Passcode should be clear if user kill the app at passcode page
    Given User enter wrong passcode
    And User kills the app
    And User will relaunch the app
    Then User will see the Sign in page


    #pro sim binding scenraios

  Scenario: Verify screens while traversing between minimodule and Us Wallet
    Given the User is on MiniModule page
    And User Clicks on YES Bank
    Then User should see Yes Bank Page
    And User come back to minimodule page
    And User Clicks on YES Bank
    Then User should see Yes Bank Page
    And User come back to minimodule page and do logout


  Scenario: Verify investment builder page
    Given the User is on MiniModule page
    And the User Clicks on Settings & Preferences
    And User click on investment builder
    Then User should see update investment builder page
    And User update the typically invest section
    Then User should see update investment builder page
    When User come back from update investment builder page
    Then User should see setting and preferences page

