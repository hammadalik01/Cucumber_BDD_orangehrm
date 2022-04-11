Feature: Add and Edit Employee

  Background:
    Given I launch application and on login page
    When User login with following credentials details
      |Admin |admin123 |
    And User click submit button
    And User on PIM menu


  Scenario: Add Employee Record successfully

    Given User go to Add Employee menu
    When User insert details in form for add Employee and save record
    Then User move to Personal Details page of application


  Scenario: Check Date validation message show  Employee Record successfully

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User go to personal page and enter date in wrong format
    And User save data
    Then Date validation error message show


  Scenario: Check user edit Employee Personal Details successfully

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When user click on Edit Button
    And User edit employee personal information
    And User save data
    Then User personal data edit successfully


  Scenario: Check user edit custom Field successfully

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User edit employee custom Field information
    And User save data
    Then User custom Field edit successfully

  Scenario: Check user Attached file successfully in employee personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User browse a file and upload it
    Then file upload successfully with message


  Scenario: Check user upload profile image successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User upload profile picture
    Then profile picture upload successfully


  Scenario: Check user add contact Details successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User Edit Contact details of employee
    Then Contact Details added successfully


  Scenario: Check user edit emergency contact Details successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User Edit emergency Contact details of employee
    Then Emergency Contact Details added successfully


  Scenario: Check user edit Immigration Record successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User Edit immigration record details of employee
    Then Immigration record Details added successfully

  Scenario: Check user edit job Record successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User Edit job record details of employee
    Then job record Details edit successfully


  Scenario: Check user added employee Salary Record successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On personal page
    When User Edit salary record details of employee
    Then salary record Details edit successfully

  Scenario: Check user added employee tax Exemption Record successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On Tax Exemptions page
    When User added tax exemption record into details of employee
    Then tax exemption Details edit successfully
    
  Scenario: Check user added employee MemberShip Record successfully in personal section

    Given User go to Edit Employee menu
    And User search employee by employee ID
    And User On Memberships section
    When User added Memberships record into details of employee
    Then Memberships record added successfully
    
    
   Scenario: Delete Employee Record successfully

    Given User go to Edit Employee menu
    And User search employee by employee ID for Delete
    And User On employee List
    When User Delete the selected record
    Then Record Deleted Successfully


   Scenario: Delete Employee Record not found in list

    Given User go to Edit Employee menu
    And User search employee by employee ID for Delete
    And User On employee List
    When User search Deleted record from list
    Then Deleted record not found in list
      