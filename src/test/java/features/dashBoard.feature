Feature: Navigation to appropriate page

  Background:
    Given I launch application and on login page
    When User login with following credentials details
    |Admin |admin123 |
    And  User click submit button

  Scenario: User go to System User page of application
    Given user is on dashboard page
    When user go to system users section by click on Users menu
    Then user successfully move to system user page of application



