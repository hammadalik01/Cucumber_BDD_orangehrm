Feature:Login Action


  Background:
    Given I launch application and on login page


  Scenario: validation message show when User forget to enter username in login page
    When User forget to enter username
    And  User click submit button
    Then Message display Username cannot be empty on login page

  Scenario: validation message show when  User forget to enter password in login page
    When User only enter username but forget to enter password
    And  User click submit button
    Then Message display Password cannot be empty on login page

  Scenario Outline: User enter invalid Credentials in login page
    When I enter username as <invalidUsername> and password as <InvalidPassword>
    And  User click submit button
    Then Error Message display <errorMessage> on login page

    Examples:
    |invalidUsername|InvalidPassword|errorMessage|
    |admin   | admin     |Invalid credentials |
    |admin12 |admin12    |Invalid credentials |

  Scenario: User login successfully
    When User login with following credentials details
    |Admin |admin123 |
    And  User click submit button
    Then User login into application URl should be changed
    And Dashboard heading should be shown on Main page




















