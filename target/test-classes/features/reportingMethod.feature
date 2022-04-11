Feature: Reporting Method

  Background:
    Given I launch application and on login page
    When User login with following credentials details
      |Admin |admin123 |
    And  User click submit button
    And user hover on PIM to see all menu option
    And Go to Reporting Method page

  Scenario: Add Reporting Method Successfully
    Given User is on reporting method page
    When I click on Add button for add reporting method
    And  Enter the data into reporting method form and save it
    Then Data save successfully and message show Successfully Saved

  Scenario: Delete Reporting Method Successfully
    Given User is on reporting method page
    When Select reporting record and delete it
    Then successfully record deleted with message show "Successfully Deleted"

