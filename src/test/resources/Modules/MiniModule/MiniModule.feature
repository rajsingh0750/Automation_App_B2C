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


#  @Sanity @Regression
#   Scenario: Verify functionality of cross icon
#    Given the user is on Appreciate App's Dashboard
#    And User navigates to the Profile details screen
#    And User Clicks on close button
#    Then It should close the profile details pop-up

    #Done change the xpath for close btn


#  @Sanity @Regression
#   Scenario: User logs out from the mini-module
#    Given the user is on Appreciate App's Dashboard
#    And User clicks on Profile icon
#    Then User logs out and should see the sign in page

    #Done

#
#  @Sanity @Regression
#   Scenario: Verify if user is able to update the annual income
#    Given the user is on Appreciate App's Dashboard
#    And User navigates to the Profile details screen
#    And User updates the Annual Income
#    Then Annual Income should be updated under profile details
#
#    #Done in flutter screen no option to update income
#
#
##    @Sanity @Regression
##   Scenario: Validate Accounts page in MinimModule
##    Given the User is on MiniModule page
##     And the User Clicks on Accounts
##     When User is on Your Account Page
##      And User clicks on info icon
##     And User Select Okay button
##    When user is on DriveWealth Page
##    And User should see the DriveWealthAccount Details
##    Then User should see Margin and Cash Account details on DriveWealth
#
#
#  @Sanity @Regression
#   Scenario: Validate Account Details in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on Buying Power
#    And the User Clicks on Account Details
#    Then User Should See Drive Wealth Account Details
#
#    #Buying power not in app
#
#
#  @Sanity @Regression
#   Scenario: Validate Refer your friends block in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on refer now
#    Then User should see Refer and earn page with all CTAs
#    When user is on Rewards and Incentives page
#    And User is on Refer a friend page
#    And User Clicks on Rewards
#    And User Clicks on Coupons
#    Then User Should see successfully Rewards and Incentives
#
#    #Changes Done
#
#
#  #checking an updation start for flutter screen
#
#  @Sanity @Regression
#   Scenario: Validate Pricing page in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on Pricing
#    When User is on Pricing page
##    And User clicks on info icon of Goals
##    And User clicks on info icon of AUM charges
##    And User Select the Okay button
##    And User clicks on info icon of Trade
#    And User clicks on info icon of Transaction Fee
#    And User Select the Okay button
##    And User clicks on info icon of CashBack
##    And User Select the Okay button
#    Then User Should see Other fees with all the Pricing details
#
#
#     #Changes Done
#
#
  @Sanity @Regression
  Scenario: Validate CSR page in MiniModule
    Given the User is on MiniModule page
    And the User Clicks on CSR
    And User see Invest like a Woman in CSR
    And User see shoots in CSR
    And User see Investing for everyone in CSR
    Then User Should see all Our Key Initiatives details
#
#    #Changes Done
#
#
#
#
#  @Sanity @Regression
#  Scenario: Validate CSR page for Suggestions in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on CSR
#    And User see Send us your suggestions
#    And User Select Submit
#    And User see the following message on email "Please enter valid email"
#    And User see the following message on suggestion "Please tell us what you think"
#    Then User Should see error message must be displayed
#
#  #Changes Done
#
#
#  @Sanity @Regression
#  Scenario: Verify When User Submit feedback from CSR page in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on CSR
#    And User see Send us your suggestions
#    And User Enter Valid EmailId
#    And User Adds Feedback
#    And User Select Submit
#    Then User Should Successfully create a feedback Note
#
#
#      #Changes Done
#
#
#  @Sanity @Regression
#  Scenario: Validate Legal page for Appreciate Terms and Condition in MiniModule
##    Given the User is on MiniModule page
#    And the User Clicks on Legal
#    And User Clicks on Appreciate Platform
#    And User see Terms of Use
#    And the User Clicks on Legal
#    And User Click on Appreciate Broking
#    And User see Appreciate Broking Information
#    And the User Clicks on Legal
#    And User Clicks on Registration
#    And User Select View Registration Number
##    And User Select back icon
#    Then User Should see all Terms and Condition in Legal details
#
#
#       #Changes Done
#
#
#
#  @Sanity @Regression
#  Scenario: Validate Legal page for Appreciate Drive Wealth for Partner Terms and Condition in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on Legal
#    And User Clicks on Drive Wealth
#    And User see Terms and Disclosure
#    And the User Clicks on Legal
#    And User Clicks on Drive Wealth
#    And User Clicks on Privacy Policy
#    And the User Clicks on Legal
#    And User Clicks on Drive Wealth
#    And User Clicks on W-BEN
#    Then User Should see all Drive Wealth for Partner Terms and Condition in Legal details
#
#       #Changes Done
#
#
#
#  @Sanity @Regression
#  Scenario: Validate Legal page for Appreciate Yes Bank in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on Legal
#    And User Clicks on YES Bank
#    And User see Do you want to download PDF file?
#    And User Clicks on Download
#    #And User see the following Toast message Downloading File
#    Then User Download the file successfully
#
#      #Changes Done
#
#
#  @Sanity @Regression
#  Scenario: Validate Support page in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on Support
#    And User Clicks on Submit a Ticket
#    And User Select issue type
#    And User enters Subject
#    And User enters Your message
#    And User clicks on the CTA for Submit a ticket
#    Then User should successfully create a support ticket
#
#     #Changes Done
#
#
#
#
#  @Sanity @Regression
#  Scenario: Validate Recent Tickets Page in Support
#   Given the User is on MiniModule page
#    And the User Clicks on Support
#    And the User Clicks on Recent Tickets
#    Then User Should see all the Recent Tickets details
#
# #Changes Done
#
#
#
##  @Sanity @Regression
##  Scenario: Validate Change Language in MiniModule
###    Given the User is on MiniModule page
##    And the User Clicks on Change Language
##    And User Clicks on Hindi language
##    And User Select Continue
##    When User is on Passcode page
##    And User Clicks on CTA of Profile
##    And User should see Profile name text must be change to प्रोफाइल
##    Then User should successfully see change language
#
#    # after changing to hindi profile is not showing in hindi lang
#
#
#  @Sanity @Regression
#  Scenario: Validate About Us in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on About Us
#    And User see Our Mission Banner
#    And User see Our Vision and Values
#    Then User Should see all the details in About Us
#
#   #Changes Done
#
#
##  @Sanity @Regression
##  Scenario: Verify the accuracy of the most recent transactions presented for both Goals and Cash in the MiniModule
##    Given the user is on Goals Dashboard for latest transaction
##    When the user clicks on the CTA for new goal
##    And user select Your Goal type
##    And user adds name of the  latest goal
##    And user select Target Date for latest goal
##    And user adds Target amount for latest goal
##    When user is on Goal Setup page
##    And user click on the CTA for one time investment
##    And user click on the CTA for See investment options
##    Then user should see the details on Target portfolio
##    And user clicks on the CTA for proceed with investment
##    And user clicks on the CTA for setup a goal
##    And user clicks on pay now and continue
##    And user click on the CTA take me back to goals
##    And the user Clicks MiniModule page
##    And the User Clicks on Transactions
##    And User is on Goals Tab and see the latest goal created
##    And User Clicks on Cash Tab and see the latest data
##    Then User should see all the latest transaction in the list
#
#
##  @Sanity @Regression
##  Scenario: Validate Change Language from English to Hindi and vice versa all the four dashboards Home, Goals, Trades, Change
###    Given the User is on MiniModule page
##    And the User Clicks on Change Language
##    And User Clicks on Hindi language
##    And User Select Continue
##    When User is on Passcode page
##    And User is on Home dashboard
##    And User Clicks on Goals dashboard
##    And User Clicks on Trade dashboard
##    And User Clicks on Change dashboard
##    And User should see Hindi language in all dashboards
##    Then User should successfully see English language in all dashboards
#
#
#    #after changing language home dashboard, goal, trade are not showing in hindi lang
#
#
##  @Sanity @Regression
##   Scenario: Validate Portfolio in MiniModule
##    Given the User is on MiniModule page
##    And the User Clicks on Portfolio
##    And User see Your portfolio
##    Then User Should see Trade and Goals portfolio
#
#    #Done
#
#
#  @Sanity @Regression
#   Scenario: Validate Add-On Services in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on Distributor or Agent Details
#    And the User Clicks on Request Advisory Services
#    Then User should see all the details of Benefits section under investment advisory
#    And User Selects Thinking of Hiring
#    Then User should see all the options in Add-on Services
#
#    #Done
#
#
#
#  @Sanity @Regression
#   Scenario: Validate Request Advisory services in Add-On Services
#    Given the User is on MiniModule page
#    And the User Clicks on Add-On Services
#    And the User Clicks on Request Advisory Services
#    And User Selects Thinking of Hiring
#    And User Select Request advisory services
#    Then User should be able to submit the Request advisory services request
#
#    #Done
#
#
#
#  @Sanity @Regression
#   Scenario: Verify the Account Passcode Change in MiniModule
#    Given the User is on MiniModule page for passcode
#    And the User Clicks on Settings & Preferences
#    And the User Clicks on Change Passcode
#    And the User Enters the OTP
#    And the User Change the new passcode
#    Then the User Confirm the new passcode
#
#      #Done
#
#
#  @Sanity @Regression
#  Scenario: Validate Support page  in MiniModule from Profile
#    Given the User is on MiniModule page
#    And User navigates to the Profile screen
#    And User Clicks on the Submit a Ticket in Profile Details
#    And User Select the issue type
#    And User enters the Subject
#    And User enters the Your message
#    And User clicks on the CTA for Submit a ticket in profile
#    Then User should successfully create a support ticket from Profile Details Page
#
#    #Done
#
#
#
#  @Sanity @Regression
#  Scenario: Validate Documents in MiniModule
#    Given the User is on MiniModule page
#    And User Clicks on the Documents
#    And User Select Monthly Statements
#    And User Select Confirmations
#    And User Select Tax Documents
#    Then User Should see Successfully all the documents in each option
#
#    #Done
#
#
#
#
#  @Sanity @Regression
#  Scenario: Validate FAQs in Support page
#    Given the User is on MiniModule page
#    And the User Clicks on Support
#    And User Clicks FAQs
#    And User Select Product FAQs
#    And User Select Partner FAQs
##    And User Select Company FAQs
#    Then FAQs pages Should load Successfully
#
#    #Done
#
#
#
#
##  @Sanity @Regression
##  Scenario: Validate Buying Power info
##    Given the User is on MiniModule page
##    And the User Clicks on Buying Power
##    And Select info icon
##    Then User should see all information related to buying power
#
#
#  @Sanity @Regression
#  Scenario: Validate Chat With Us on WhatsApp is present in MiniModule
#    Given the User is on MiniModule page
#    And the User Clicks on Support
#    Then User Should see Chat with us on whatsApp
#
#    #Done
#
#
#  @Regression
#  Scenario: Verify the presence of an error message when user Withdraw Funds from buying power
#    Given the User is on MiniModule page
#    And the User Clicks on Buying Power
#    And the User Clicks on Withdraw
#    And the User enters the amount
#    Then User should see error message must be displayed "Insufficient buying power balance"
#
#
#  @Sanity @Regression
#  Scenario: Validate Day Trade Settings in MiniModule
#Given the User is on MiniModule page
#    And the User Clicks on Settings & Preferences
#    And User Select Day Trade Settings
#    And User Clicks on Day Trading
#    And User Clicks on Pattern Day
#    Then User should see all the Trade setting descriptions
#
#
#  @Stage @Regression
#  Scenario: Verify Enable PDT in MiniModule
#   Given the User is on the MiniModule page
#    And the User Clicks on Settings & Preferences
#    And User Select Day Trade Settings
#    And User Clicks on Enable Pattern Day Trading
#    Then User should see a toast message saying PDT Enabled
#
#  @Stage @Regression
#  Scenario: Verify Disable PDT in MiniModule
#Given the User is on the MiniModule page
#    And the User Clicks on Settings & Preferences
#    And User Select Day Trade Settings
#    And User Clicks on Disable Pattern Day Trading
#    Then User should see a toast message saying PDT Disabled
#
#
#  @Sanity @Regression
#  Scenario: Validate Account Value Description in Day trade
#    Given the User is on MiniModule page
#    And the User Clicks on Settings & Preferences
#    And User Select Day Trade Settings
#    And User Clicks on View account value
#    Then User should see all description related to account value
#
#    #Done
#
#
##  @Sanity @Regression
##  Scenario: Verify Profile Upload in MiniModule
##    Given the User is on MiniModule page
##    And User navigates to the Profile screen
##    And User Select Choose From Device
##    And User Select Gallery Option
##    And User Select Photo From Device
##    Then the User Profile Photo should be Updated Successfully
#
#
#
#  @Sanity @Regression
#  Scenario: Validate US Wallet Amount
#    Given the User is on MiniModule page
#    When User click on US Wallet
#    Then User will verify the US Wallet Amount
#
#    #Done    change coordinates for us wallet, minor code changes
#  #Due to difference of 0.1 assert is not working
#
#
#
#
#
#
#  Scenario: Passcode must be clear if we enter incorrect passcode and user should be able to to re-enter the passcode again
#    Given User enter wrong passcode
#    Then The passcode must be clear by default and user should be able to re-enter the passcode again
#    And User should see the home dashboard
#
#
#    #if we enter correct passcode then , will be logged in , can't kill and check , doing for wrong one
#  Scenario: Passcode should be clear if user kill the app at passcode page
#    Given User enter wrong passcode
#    And User kills the app
#    And User will relaunch the app
#    Then User will see the Sign in page
#
#
#    #pro sim binding scenraios
#
#  Scenario: Verify screens while traversing between minimodule and Us Wallet
#    Given the User is on MiniModule page
#    And User Clicks on YES Bank
#    Then User should see Yes Bank Page
#    And User come back to minimodule page
#    And User Clicks on YES Bank
#    Then User should see Yes Bank Page
#    And User come back to minimodule page and do logout
#
#
#  Scenario: Verify investment builder page
#    Given the User is on MiniModule page
#    And the User Clicks on Settings & Preferences
#    And User click on investment builder
#    Then User should see update investment builder page
#    And User update the typically invest section
#    Then User should see update investment builder page
#    When User come back from update investment builder page
#    Then User should see setting and preferences page
#
#
#
#
#  @Sanity
#  Scenario: Verify user should be able to see Day Trading after clicking on banner itself
#    Given the User is on MiniModule page
#    And the User Clicks on Settings & Preferences
#    And User Select Day Trade Settings
#    When User click on the banner of what is pattern day trading
#    Then User should see the all details of pattern day trading
#
#



    ####                   new flutter

  @Regression
  Scenario: Verify all sections are visible under MiniModule
    Given the User is on MiniModule page
    Then User should see all the sections of minimodule are visible

    #Done Time


  @Regression
  Scenario: Verify US Wallet under MiniModule
#    Given the User is on MiniModule page
#    And User click on US Wallet under minimodule
    Then User should see all the details of US wallet

    #Add funds left in above scenario , do simbinding and do
    #Done



  @Regression
  Scenario: Verify Personal details under MiniModule
#    Given the User is on MiniModule page
    And User click on Personal Details under minimodule
    Then User should see all the details of Personal Details

    #ask to check static data except field
    #Submit  a ticket under us stocks bank accounts
  # add accounts and submit a ticker in mf bank accounts

  #time done , submit  a ticket add in separate



  @Regression
  Scenario: Verify Bank Accounts and Orders section under MiniModule
    Given the User is on MiniModule page
    And User click on Bank Accounts under minimodule
    Then User should see all the details of Bank Accounts

    #Done time done


#  @Regression
#  Scenario: Verify User should see all tabs under minimodule
#    Given the User is on MiniModule page
#    And User click on Orders under minimodule
#    Then User should see all tabs under All Transactions page

     #Done this test case cover in above one


  @Regression
  Scenario: Verify Settings and Preferences under minimodule
    Given the User is on MiniModule page
    And User click on Settings and Preferences
    Then User should see all details of Settings and Preferences

    #Done Time



  @Regression
  Scenario: Verify Support section under minimodule
    Given the User is on MiniModule page
    And User click on Support section
    Then User will verify all the functionality of support section

     #Done  #hold for above one


  @Regression
  Scenario: Verify Pricing section under minimodule
    Given the User is on MiniModule page
    And User click on Pricing section
    Then User will verify all the details of Pricing section

     #Done  ltcg and stcg ave changed  time


  @Regression
  Scenario: Verify Add on Services under minimodule
    Given the User is on MiniModule page
    And User click on Add on Services
    Then User will verify all details of Add on Services

     #Done  #some toast msg have to add ,   time done


  @Regression
  Scenario: Verify About Us under minimodule
    Given the User is on MiniModule page
    And User click on About Us
    Then User will verify all details related to about us page
     #Done  #time done


  @Regression
  Scenario: Verify CSR Section under minimodule
#    Given the User is on MiniModule page
    And User click on CSR
    Then User will verify all details about CSR page
    #Done

  #add some more funcationility in above one  and logout also


#  @Regression
#  Scenario: Verify Legal Section under minimodule
##    Given the User is on MiniModule page
##    And User click on Legal
#    Then User will verify all details for Legal section
#     #Done  #have to check all




  @Main_Final
  Scenario: Verify Personal details Bank Accounts And Order section under MiniModule
    Given the User is on MiniModule page
    And User click on Personal Details under minimodule
    Then User should see all the details of Personal Details
    And User click on Bank Accounts under minimodule
    Then User should see all the details of Bank Accounts
    And User click on Orders under minimodule
    Then User should see all tabs under All Transactions page




  @Main_Final
  Scenario: Verify Pricing , Add-On Services and About Us under minimodule
    Given the User is on MiniModule page
    And User click on Pricing section
    Then User will verify all the details of Pricing section
    And User click on Add on Services
    Then User will verify all details of Add on Services
    And User click on About Us
    Then User will verify all details related to about us page


  @Main_Final
  Scenario: Verify Settings and Preferences under minimodule
    Given the User is on MiniModule page
    And User click on Settings and Preferences
    Then User should see all details of Settings and Preferences



  @Main_Final
  Scenario: Verify US Wallet under MiniModule
    Given the User is on MiniModule page
    And User click on US Wallet under minimodule
    Then User should see all the details of US wallet


  @Main_Final
  Scenario: Verify all sections are visible under MiniModule
    Given the User is on MiniModule page
    Then User should see all the sections of minimodule are visible
    And User click on CSR
    Then User will verify all details about CSR page

    #above one all and csr enter msg and desc xpath not getting, add step for error validation, submit btn xpath not getting


  @Main_Final
  Scenario: Verify Legal Section under minimodule
    Given the User is on MiniModule page
    And User click on Legal
    Then User will verify all details for Legal section


    #Work on above one


  #one scenarios for validating all submit a ticket


  @Main_Final
  Scenario: Verify all submit a support ticket under minimodule
    Given the User is on MiniModule page
    And User click on Personal Details under minimodule
    And User click on Submit a support ticket
    Then User should be able to create a support ticket
    And User click on Submit a support ticket for nominee details
    Then User should be able to create a support ticket under nominee
    And User click on Bank Accounts under minimodule
    And User click on Submit a ticket for US stocks under Bank Accounts section
    Then User should be able to create a Ticket for US Stocks
    And User click on Mutual funds under Bank accounts
    And User click on Submit a ticket for MF under Bank Accounts section
    And User click on Support section
    Then User will verify all the functionality of support section




    #New minimodule UI


  Scenario: Verify Refer and Earn Section along with Pricing Section under minimodule
    Given the User is on MiniModule page
    And User click on Refer and Earn section
    And User should see the Refer page along with sharing options
    And User click on cross icon
    Then User should be able to see the minimodule page
    And User click on Pricing section
    Then User will verify all the details of Pricing section

    #Done



  Scenario: Verify the "About Us" section under MiniModule
    Given the User is on MiniModule page
    And the user navigates to the About Us section
    Then the user should see the "About Us" page along with the Legal and CSR sections
    When the user clicks the Know More button
    Then the user should be redirected to the About Appreciate page
    And the user clicks on the Legal section
    Then the user should see the Legal page details
    And the user clicks on the CSR section
    Then the user should see the CSR Mission page along with the Suggestions & Feedback functionality

    #last step left

  Scenario: Verify the Other Services section under MiniModule
    Given the User is on MiniModule page
    And the user navigates to the Other Services section
    And the User Clicks on Distributor or Agent Details
    And the User Clicks on Request Advisory Services
    Then User should see all the details of Benefits section under investment advisory
    And User Selects Thinking of Hiring
    Then User should see all the options in Add-on Services

    #changes done to new ui


  Scenario: Validate that the user can view and interact with added accounts under the MiniModule
    Given the User is on MiniModule page
    And the user clicks on the View All Accounts CTA
    Then the user should be redirected to the Accounts page which displays both US Stocks and Mutual Funds sections
    When the user clicks the Submit a Ticket button under the US Stocks section
    Then the user should be able to submit a ticket for the US Stocks section
    When the user clicks on the Mutual Funds section
    Then the user should see the added accounts for Mutual Funds
    When the user clicks the Submit a Ticket button under the Mutual Funds section
    Then the user should be able to submit a ticket under the Mutual Funds section

     #changes done to new ui


  #Validate error msg also Done
  Scenario: Validate Support Tab under MiniModule
    Given the User is on MiniModule page
    When the User Clicks on Support
    Then the User should see all section under support page
    And User Clicks on Submit a Ticket
    And User Select issue type
    And User enters Subject
    And User enters Your message
    And User clicks on the CTA for Submit a ticket
    Then User should successfully create a support ticket
    And User click on Recent Tickets
    Then User should see all the raised support ticket under Support Tickets Page


    #Done

  Scenario: Validate Settings Section under MiniModule
    Given the User is on MiniModule page
















