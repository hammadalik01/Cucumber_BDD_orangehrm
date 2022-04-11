Feature: Add User Action

  Background:
    Given I launch application and on login page
    When User login with following credentials details
      |Admin |admin123 |
    And  User click submit button
    And user go to system users section by click on Users menu


  Scenario Outline: check password strength
    Given I Go to Add User page for add user
    When  I enter all required data into Add user form
    And   I Enter password <password> to check strength of password
    Then  <password strength> Password length is display as a password length

    Examples:
      |password |password strength |
      |Teste    |Very Weak         |
      |Tester01 |Weak              |
      |Tester@01|Better            |
      |Tester@01234!@$# | Strong   |
      |Tester@01234!@$#!@#$| Strongest|

  Scenario: check password field mandatory when I forget to enter password
    Given I Go to Add User page for add user
    When  I enter all required data into Add user form
    And  I enter nothing in password field and click on save button
    Then  Error message show that password required

  Scenario: check Miss Match password Validation show in confirm password field.
    Given I Go to Add User page for add user
    When  I enter all required data into Add user form
    And  In password field I enter password "Tester@01"
    And   In confirm password field I enter password "tester01"
    Then  Passwords do not match Validation error message show "Passwords do not match"


  Scenario: User Added Successfully.
    Given I Go to Add User page for add user
    When  I enter all required data into Add user form
    And I enter correct password "Tester@01" and confirm password "Tester@01"
    And  save the record
    Then page Url successfully change and successful message show in System Users Page

  Scenario: search a user which is added successfully
    Given User is on system page
    When I enter username and click on search button
    Then added user show in the record

  Scenario: Edit user record which is recently added
    Given User is on system page
    When I enter username and click on search button
    And I click on appear record
    And I go to Edit user section and edit some information
    And save the record by click on Save Button
    Then Record Updated and Successfully message show

  Scenario: Delete user record which is Edit recently
    Given User is on system page
    When I enter username into system user page and click on search button
    And I select a record which need to be delete
    And I cancel the popup for delete the record
    And I delete the record from table
    Then deleted record successfully message show
    And Deleted record not found