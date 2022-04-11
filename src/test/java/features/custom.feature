Feature: Custom form Action

  Background:
    Given I launch application and on login page
    When User login with following credentials details
      |Admin |admin123 |
    And  User click submit button
    And user hover on PIM to see all menu option
    And Go to custom field


  Scenario: Required validation message show in custom field form
    Given User is on custom field page
    When I click on Add button
    And without fill all the field I try to save data
    Then Required validation message show

  Scenario: Add custom field Successfully
    Given User is on custom field page
    When I click on Add button
    And  Enter the data and save it
    Then Data save successfully and message show Successfully Saved

  Scenario: Edit custom field Successfully
    Given User is on custom field page
    When  Edit the data and save it
    Then Data save successfully and message show Successfully Saved

  Scenario: Delete custom field record Successfully
    Given User is on custom field page
    When  Select the a record and Delete it
    Then successfully record deleted with message show "Successfully Deleted"







