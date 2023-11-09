Feature: Easy Savings

  @Sanity
  Scenario: The user should see an error message prompt when attempting to apply the already used coupon.
    Given the user is on Dashboard
    When User clicks on Refer link
    And User enters the already used Coupon
    Then User should see the error message Coupon code already in use

  @Sanity
  Scenario Outline: The user should see an error message prompt when attempting to apply invalid coupon.
    Given the user is on Dashboard
    And User clicks on Refer link
    And User enters the invalid Coupon "<CouponCode>"
    Then the user should see the error message "<ErrorMessage>"
    And the user clears the coupon code

    Examples:
      | CouponCode         | ErrorMessage        |
      | eASYSAVING2023      | Invalid coupon code    |
      | easysaving2023      | Invalid coupon code    |
      | EASYsAVING2023      | Invalid coupon code    |
      | EASY SAVING2023     | Invalid coupon code    |

  @Sanity
  Scenario: Validate if the Amount in remaining and Saving is changing as per the UPI payment made by the user
    Given the user is on the Dashboard
    And User checks the current Remaining and Savings
    And User transfers adds the fund through UPI
    Then Numbers on portfolio should change as per the payment made by the user

  Scenario: Validate if days remaining shown on the Easy Savings banner is correct
    Given the user is on the Dashboard
    Then User should see the days remaining as per the current date


  Scenario: Validate if the Incentive message is displayed if the savings in the current month is equal or greater than 500
    Given User is Logged in and on Dashboard
    Then User should see the Incentive message if the user is eligible