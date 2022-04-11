Feature: Logout Functionality

  Background:
    Given I launch application and on login page
    When User login with following credentials details
      |Admin |admin123 |
    And User click submit button

  Scenario: User logout from application
    Given User is on dashboard
    When I go to welcome menu and click on it dropdown open and click on logout option
    Then user logout successfully and redirect to login panel section







