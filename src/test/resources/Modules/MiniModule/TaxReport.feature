Feature: TaxReport


  #startign 5 scripts (UAT:-varshatmysuru1992@gmail.com) :- checking if reports available then only their value

  #mannually check back arrow btn , below all script using android back

  @Sanity
  Scenario: Verify when reports are available under capital gains
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    When User select Capital gains under US Investments
    Then User should see the date range along with capital gain note description



  @Sanity
  Scenario: Verify when reports are available under Dividend and interest
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    When User select Dividend and interest under US Investments
    Then User should see the date range along with Dividend and interest note description


  @Sanity
  Scenario: Verify when reports are available under Schedule FA
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select Schedule FA section under US Investments
    Then User should see the date range along with Schedule FA note


  @Sanity
  Scenario: Verify when reports are available under Form 1042-S (US Stocks)
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form US Stock section under US Investments
    Then User should see the date range along with Form US Stocks note


  @Sanity
  Scenario: Verify when reports are available under Form 1042-S (Goals)
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form Goals section under US Investments
    Then User should see the date range along with Form Goals note


  @Sanity
  Scenario: Verify when user try to download Capital Gains  without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Capital gains under US Investments
    When User will click on download CTA without selecting the date range
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify user should be able to download the capital gains report
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Capital gains under US Investments
    And User select the transaction month range
    When User will click on download CTA
    Then User should able to download the activity report with successfull download toast message "Document downloaded successfully"


  @Sanity
  Scenario: Verify when user try to send the Capital Gains report via email without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Capital gains under US Investments
    When User will click on email icon
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify User is able to sent the Capital Gains report via email
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Capital gains under US Investments
    And User select the transaction month range
    When User will click on email icon
    Then User should able send the email successfully


  @Sanity
  Scenario: Verify when user try to download Divided and Interest report without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Dividend and interest under US Investments
    When User will click on download CTA without selecting the date range
    Then User should see date range error message as "Date range not selected."

  @Sanity
  Scenario: Verify user should be able to download the Dividend and interest report
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Dividend and interest under US Investments
    And User select the transaction month range
    When User will click on download CTA
    Then User should able to download the activity report with successfull download toast message "Document downloaded successfully"

  @Sanity
  Scenario: Verify when user try to send the Dividend and interest report via email without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Dividend and interest under US Investments
    When User will click on email icon
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify User is able to sent the Dividend and interest report via email
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Dividend and interest under US Investments
    And User select the transaction month range
    When User will click on email icon
    Then User should able send the email successfully


  @Sanity
  Scenario: Verify when user try to download Schedule FA report without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Schedule FA section under US Investments
    When User will click on download CTA without selecting the date range
    Then User should see date range error message as "Date range not selected."

  @Sanity
  Scenario: Verify user should be able to download the Schedule FA report
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Schedule FA section under US Investments
    And User select the transaction month range
    When User will click on download CTA
    Then User should able to download the activity report with successfull download toast message "Document downloaded successfully"

  @Sanity
  Scenario: Verify when user try to send the Schedule FA report via email without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Schedule FA section under US Investments
    When User will click on email icon
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify User is able to sent the Schedule FA report via email
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Schedule FA section under US Investments
    And User select the transaction month range
    When User will click on email icon
    Then User should able send the email successfully


  @Sanity
  Scenario: Verify when user try to download Form 1042-S (US Stocks) report without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form US Stock section under US Investments
    When User will click on download CTA without selecting the date range
    Then User should see date range error message as "Date range not selected."

  @Sanity
  Scenario: Verify user should be able to download the Form 1042-S (US Stocks) report
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form US Stock section under US Investments
    And User select the US Stocks transaction month range
    When User will click on download CTA
    Then User should able to download the activity report with successfull download toast message "Document downloaded successfully"

  @Sanity
  Scenario: Verify when user try to send the Form 1042-S (US Stocks) report via email without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form US Stock section under US Investments
    When User will click on email icon
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify User is able to sent the Form 1042-S (US Stocks) report via email
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form US Stock section under US Investments
    And User select the US Stocks transaction month range
    When User will click on email icon
    Then User should able send the email successfully


  @Sanity
  Scenario: Verify when user try to download Form 1042-S (Goals) report without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form Goals section under US Investments
    When User will click on download CTA without selecting the date range
    Then User should see date range error message as "Date range not selected."

  @Sanity
  Scenario: Verify user should be able to download the Form 1042-S (Goals) report
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form Goals section under US Investments
    And User select the US Stocks transaction month range
    When User will click on download CTA
    Then User should able to download the activity report with successfull download toast message "Document downloaded successfully"

  @Sanity
  Scenario: Verify when user try to send the Form 1042-S (Goals) report via email without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form Goals section under US Investments
    When User will click on email icon
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify User is able to sent the Form 1042-S (Goals) report via email
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select Form Goals section under US Investments
    And User select the US Stocks transaction month range
    When User will click on email icon
    Then User should able send the email successfully



  @Sanity
  Scenario: Verify User is able to see the transaction activity page
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select transaction activity tab
    Then User should see the transaction activity heading download CTA and email icon

  @Sanity
  Scenario: Verify User is able to download the transaction activity under reports tab
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select transaction activity tab
    And User select the transaction month range
    When User will click on download CTA
    Then User should able to download the activity report with successfull download toast message "Document downloaded successfully"

  @Sanity
  Scenario: Verify when user try to download transaction activity without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select transaction activity tab
    When User will click on download CTA without selecting the date range
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify User is able to sent the transaction activity via email
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select transaction activity tab
    And User select the transaction month range
    When User will click on email icon
    Then User should able send the email successfully

  @Sanity
  Scenario: Verify when user try to send the transaction activity report via email without selecting the date range
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    And User select the tax reports section under reports page
    And User select transaction activity tab
    When User will click on email icon
    Then User should see date range error message as "Date range not selected."


  @Sanity
  Scenario: Verify the transaction activity note
    Given the user is on the Dashboard
    And User select profile tab
    And User select reports tab under minimodule
    When User select the tax reports section under reports page
    Then User should be able to see the transaction note












