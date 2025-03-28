Feature: Language change


  @Sanity
  Scenario: Verify us wallet , refer , username, check balance should be in hindi
    Given the User is on MiniModule page
    And User select change language option
    And User select hindi section
    And User click on continue CTA
    And User will enter the passcode
    When User will click on profile at home dashboard
    Then User will verify us wallet username refer your friend etc in hindi



  @Sanity
  Scenario: Verify yes bank balance in hindi
    Given the User is on MiniModule page
    And User select change language option
    And User select hindi section
    And User click on continue CTA
    And User will enter the passcode
    And User will click on profile at home dashboard
    And User select yes bank balance check section
    Then User will verify all the details under yes bank


  @Sanity
  Scenario: Verify khate ka vivaran under yes bank balance check
    Given the User is on MiniModule page
    And User select change language option
    And User select hindi section
    And User click on continue CTA
    And User will enter the passcode
    And User will click on profile at home dashboard
    And User select yes bank balance check section
    When User click on khate ka vivaran
    Then User will verify details of khate ka vivaran page



  @Sanity
  Scenario: Verify add funds under yes bank balance check
    Given the User is on MiniModule page
    And User select change language option
    And User select hindi section
    And User click on continue CTA
    And User will enter the passcode
    And User will click on profile at home dashboard
    And User select yes bank balance check section
    And User click on add funds
    Then User should see the add funds page in hindi


  @Sanity
  Scenario: Verify reset mpin under yes bank balance check
    Given the User is on MiniModule page
    And User select change language option
    And User select hindi section
    And User click on continue CTA
    And User will enter the passcode
    And User will click on profile at home dashboard
    And User select yes bank balance check section
    And User click on reset mpin
    Then User will see reset mpin description



  @Sanity
  Scenario: Verify lenden section under yes bank balance check
    Given the User is on MiniModule page
    And User select change language option
    And User select hindi section
    And User click on continue CTA
    And User will enter the passcode
    And User will click on profile at home dashboard
    And User select yes bank balance check section
    And User click on lenden
    Then User will see len den page


  @Sanity
  Scenario: Verify US Wallet in hindi
    Given the User is on MiniModule page
    And User select change language option
    And User select hindi section
    And User click on continue CTA
    And User will enter the passcode
    And User will click on profile at home dashboard
    And User click on US wallet
    Then User will verify all the details of US wallet in hindi
