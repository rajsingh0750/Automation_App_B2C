#Feature: Trades all buy related scenarios

#  Scenario: Once the ETB user in onboarded successfully the user should be prompted with Buying Power sticky
#    Given the user is on home dashboard
#    Then the user should be prompted with "Buying power" sticky to add funds for buying power from YES Bank

#  @Sanity @Regression @Android @Trade @Time
#  Scenario: User with sufficient buying power should be able to buy stocks in Rupees
##    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
##    And User enters the amount
#    And User enters the amount using coordinate
#    And User Slides to Buy
#    Then the order should be placed successfully
#
#    #PROD DONE



#  @Sanity @Regression
#  Scenario: User should see Market Live label if the current time in IST is between 7:30 PM to 2:30 AM
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    #And User Selects on US stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    Then User should see market live label



#
#  @Sanity @Regression @Trade
#  Scenario: Confirm that the Current Value and Invested Amount displayed on the Trade Dashboard align with the corresponding values on the Portfolio screen.
#    Given User is on Trade dashboard
#    And User Selects the All Option
#    And User sees invested amount and current value on Trade dashboard
#    And User Selects on US stock tab
#    Then Investment and Current Value on Portfolio should match with the Trade Dashboard
#
#
#    #PROD DONE   move above scenario in portfolio








#  @Sanity @Regression @Trade
#  Scenario: Confirm that the user can purchase stock by quantity even when the market is closed.
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters the quantity of the stock
#    And User Slides to Buy
#    Then the order should be placed successfully
#
#    #PROD DONE





#
#
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place Limit order with order expiry as Till Market Closed
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as limit order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects order expiry as Good till market day closed
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then Limit order should be placed Successfully
#
#    #LIMIT & FRIDAY
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place Limit order with order expiry as Good till Cancelled
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as limit order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects Limit order expiry as Good till Cancelled
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then Limit order should be placed Successfully
#
#     #LIMIT & God till cancelled
#
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place Limit order with order expiry as Custom Date
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as limit order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects Limit order expiry as Custom Date
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then Limit order should be placed Successfully
#
#      #LIMIT & Calender
#
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place Stop order with order expiry as till Market Closed
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as Stop order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects Limit order expiry as Good till Cancelled
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then Stop order should be placed Successfully
#
#     #STOP & FRIDAY
#
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place Stop order with order expiry as Good till Cancelled
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as Stop order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects Stop order expiry as Good till Cancelled
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then Stop order should be placed Successfully
#
#
#    #STOP & God till cancelled
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place Stop order with order expiry as Custom Date
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as Stop order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects Stop order expiry as Custom Date
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then Stop order should be placed Successfully
#
#    #STOP & Calender
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place MIT order with order expiry as till Market Closed
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as MIT order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
##    And User selects order expiry as Till Market is closed
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then MIT order should be placed Successfully
#
#    #MIT & FRIDAY
#
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place MIT order with order expiry as Good till Cancelled
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as MIT order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects MIT order expiry as Good till Cancelled
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then MIT order should be placed Successfully
#
#     #MIT & God till cancelled
#
#
#  @Sanity @Regression @Trade
#  Scenario: Validate if the user is able to place MIT order with order expiry as Custom Date
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User clicks on Pro button
#    And User selects order type as MIT order
#    And User enters the Pro type order Quantity
#    And User enters the limit price
#    And User selects order expiry as Till Market is closed
#    And User selects MIT order expiry as Custom Date
#    And User Clicks On Confirm
#    And User Slides to Buy
#    Then MIT order should be placed Successfully
#
#       #MIT & Calender
#
#
#
#  @Sanity @Regression
#  Scenario: Once the user buys stock in market close then all data points like P&L, total invested and current value should remain as it is until the order is processed
#    Given User is on Trade dashboard
#    And User notices the Current P and L, Current Investment and Current Amount
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters min trade amount
#    And User Slides to Buy
#    Then Current P and L, Current Investment and Current Amount should not change when the order is placed in Market close








#xpath issue

#
#  @Sanity @Regression
#  Scenario: Check when stocks are purchased during Off Market hours then, the order amount will be deducted from the Buying Power and added up to "Amount Hold".
#    Given User is on Trade dashboard
#    And User notices the current buying power before buy
#    And User notices the current money in held before buy
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters min trade amount
#    And User Slides to Buy
#    And User Clicks on Go to home dashboard
#    And User notices the current buying power after buy
#    And User notices the current money in held after buy
#    Then the order amount should be be deducted from the Buying Power and added up to Amount Hold
#





#  @Sanity @Regression
#  Scenario: Validate if user cancel the order it should get reflected at minimodule and order details page
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters the amount
#    And User Slides to Buy
#    And User click on view in order history
#    And User cancel the order
#    Then User will see the "CANCELLATION SUBMITTED" tag under order details page


#    And User come to minimodule page
#    And User will see "Cancelled" tag under all transactions page
#    And User will go to order details of the cancelled transaction
#    Then User should see the "Cancelled" tag under order details page also
#    And User should also see "Cancelled" tag under transaction status

    #for transaction status due to some backend logic , some times it will load , sometimes it's not
    #i.e why  i commented that line.

  #PROD DONE 30 JUN :- From user come to minimodule page all lines have different UI in  latest build for minimodule page




#  Scenario: Validate if user stop the buy journey and come to dashboard
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    When User come back to home dashboard
#    Then User should see the resume buying event at home dashboard
#    And User click on Buy now cta under continue where left section
#    And User clicks on Buy now for a stock
#    And User enters the amount
#    And User Slides to Buy
#    Then the order should be placed successfully
#
#
#   #PROD DONE 30 JUN



#
#
#  @Sanity @Regression
#  Scenario: Verify the presence of an error message when attempting to purchase stocks exceeding the available buying power.
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters the maximum quantity limit
#    Then User should see the following error message Low funds! Add money to your YES Bank AC and transfer to your buying power read more here
#
#    #PROD DONE
#
#
#
#  @Sanity @Regression
#  Scenario: Verify the presence of an error message when usd value crosses the limit of 2,50,000.
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters the maximum quantity limit
#    Then User should see the following message Transaction Limit
#
#
#
#  @Regression
#  Scenario: The user should see an error message prompt when attempting to purchase a stock quantity below the minimum required limit.
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User clicks on Buy now for a stock
#    And User enters the amount less than the required limit
#    Then User should be prompted with error message Minimum Transaction Amount Should be 0.85 INR.
#
#
#    #PROD DONE
#
#
#  @Regression
#  Scenario: Validate if the entered amount/quantity in trade is retained once the user switch to other app
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User clicks on Buy now for a stock
#    And User enters the amount
#    And User minimizes the app and again switch to Appreciate app
#    Then the entered value should be retained
#    #PROD DONE
#
#
#  @Sanity @Regression
#  Scenario: Validate on order details page total order amount will equal to Order amount + fees and user is allowed to enter amount at most two decimal place only
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters the amount in three or more decimal place
#    Then Amount field should ignore the decimals after two place
#    And User Slides to Buy
#    And User click on view in order history
#    Then the user should see the total order amount equals the order amount plus the fees
#
#    #PROD DONE 30 JUN



  #Below scenario merge it and complete

#
#  Scenario: Validate All Buy error msg , switch app , total = order amt + fees
#    Given User is on Trade dashboard
#    And User Selects the search tab on dashboard
#    When User search the stocks under US Stocks
#    And User click on the Stock
#    And User clicks on Buy now for a stock
#    And User enters the amount in three or more decimal place
#    Then Amount field should ignore the decimals after two place
#    And User clears the entered amt
#
#    And User clicks on Buy now for a stock
#    And User enters the maximum quantity limit
#    Then User should see the following error message Low funds! Add money to your YES Bank AC and transfer to your buying power read more here




#Merged all Optimise Buy Scenario


  @Prod_Final
  Feature: Validate Buy Journey Scenarios on Prod

  Background:
    Given User is on Trade dashboard
    And User Selects the search tab on dashboard
    When User search the stocks under US Stocks on Prod App
    And User click on the Stock on Prod App
    And User clicks on Buy now for a stock

  Scenario: Validate if user stop the buy journey and come to dashboard on prod
    When User come back to home dashboard
    Then User should see the resume buying event at home dashboard
    And User click on Buy now cta under continue where left section
    And User clicks on Buy now for a stock
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully

  Scenario: Validate Fraction normal Buy flow type scenario on prod
    And User enters the amount using coordinate
    And User Slides to Buy
    Then the order should be placed successfully

  Scenario: Validate all error msg during buy journey
    When User Slides to Buy
    Then User should see without enter amount and quantity error message "Please enter amount or qty to proceed"
    When User enter the quantity more then UPI limit
    Then User should see the UPI limit error message per transaction as "UPI limit : ₹1,00,000.00 per transaction"
    When User enters an amount greater than the limit of "$250,000 or ₹2,18,43,250.00" as of today
    Then User should see the maximum transaction limit error as of today "Transaction Limit: $250,000 (₹2,18,43,250.00 as of today)"
    When User try to enter the purchase amount more then his buying power
    Then User should see low funds error message as "Low funds! Add funds from YES Bank to trade"
    When User enters the amount less than the minimum transaction amount
    Then User should see the minimum transaction amount error "Minimum Transaction Amount Should be greater than ₹0.88 INR"


  Scenario: Validate Trade Buy Amt and quantity calculation along with platform fee
    When User enters the purchase amount
    Then User should see the correct calculation for quantity field
    When User enters the purchase quantity
    Then User should see the correct calculation for amount field
    When User click on total fee dropdown
    Then User should see the correct calculation for quantity and platform fees



    @Prod_Final
    Scenario: Validate All Buy type scenarios for Limit type order on prod
      Given User is on Trade dashboard
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock

      And User clicks on Pro button
      And User selects order type as limit order
      And User enters the Pro type order Quantity
      And User enters the limit price
      And User selects order expiry as Till Market is closed
      And User selects order expiry as Good till market day closed

      And User Clicks On Confirm
      And User Slides to Buy
      Then Limit order will be placed Successfully
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as limit order
      And User enters the Pro type order Quantity
      And User enters the limit price

      And User selects order expiry as Till Market is closed
      And User selects Limit order expiry as Good till Cancelled

      And User Clicks On Confirm
      And User Slides to Buy
      Then Limit order will be placed Successfully
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as limit order
      And User enters the Pro type order Quantity
      And User enters the limit price

      And User selects order expiry as Till Market is closed
      And User selects Limit order expiry as Custom Date
      And User Clicks On Confirm
      And User Slides to Buy
      Then Limit order will be placed Successfully for all order types




    @Prod_Final
    Scenario: Validate All Buy type scenarios for Stop type order on prod
      Given User is on Trade dashboard
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as Stop order
      And User enters the Pro type order Quantity
      And User enters the Stop price
      And User selects order expiry as Till Market is closed
      And User selects Limit order expiry as Good till Cancelled
      And User Clicks On Confirm
      And User Slides to Buy
      Then Stop order should be placed Successfully
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as Stop order
      And User enters the Pro type order Quantity
      And User enters the Stop price
      And User selects order expiry as Till Market is closed
      And User selects Stop order expiry as Good till Cancelled
      And User Clicks On Confirm
      And User Slides to Buy
      Then Stop order should be placed Successfully
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as Stop order
      And User enters the Pro type order Quantity
      And User enters the Stop price
      And User selects order expiry as Till Market is closed
      And User selects Stop order expiry as Custom Date
      And User Clicks On Confirm
      And User Slides to Buy
      Then Stop order will be placed Successfully for all order types



    @Prod_Final
    Scenario: Validate All Buy type scenarios for MIT type order on prod
      Given User is on Trade dashboard
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as MIT order
      And User enters the Pro type order Quantity
      And User enters the MIT Target price
      And User selects order expiry as Till Market is closed
      And User selects order expiry as Good till market day closed
      And User Clicks On Confirm
      And User Slides to Buy
      Then MIT order should be placed Successfully
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as MIT order
      And User enters the Pro type order Quantity
      And User enters the MIT Target price
      And User selects order expiry as Till Market is closed
      And User selects MIT order expiry as Good till Cancelled
      And User Clicks On Confirm
      And User Slides to Buy
      Then MIT order should be placed Successfully
      And User Selects the search tab on dashboard
      When User search the stocks under US Stocks on Prod App
      And User click on the Stock on Prod App
      And User clicks on Buy now for a stock
      And User clicks on Pro button
      And User selects order type as MIT order
      And User enters the Pro type order Quantity
      And User enters the MIT Target price
      And User selects order expiry as Till Market is closed
      And User selects MIT order expiry as Custom Date
      And User Clicks On Confirm
      And User Slides to Buy
      Then MIT order should be placed Successfully







  # In merge one : modification if starting one type fail further execution should't stop add try catch and send to further  execution


