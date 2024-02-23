
Feature:

  Background:
    Given Navigate to website
    And Click to Sign in button
    And Enter username as "username" and password as "password"
    When Click login button
    Then Verify that you are logged in.

    Scenario Outline:Convert amount dollars
      And Click to Pay Bills button
      And Click to Purchase Foreign Currency button
      And select currency as "<value>"
      And Enter to Amount as "<amount>"
      And Click to Dollar checkbox
      And Click to calculate
      And Click to purchase
      Then successfully message should be displayed

      Examples:
      | amount | value |
      | 75 | EUR |
      | 100 | GBP |
      | 200 | NOK |

      Scenario Outline:Convert to the selected currency unit
        And Click to Bills button
        And Click to Purchase Foreign Currency button
        And select currency as "<value>"
        And Enter to Amount as "<amount2>"
        And Click to selected currency checkbox
        And Click to calculete
        And Click to purchase
        Then successfully message shold be displayed

        Examples:

        |amount2|value|
        |50     |JPY  |
        |90     |SGD  |
        |135    |MXN  |