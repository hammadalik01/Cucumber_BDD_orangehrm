Feature: CSV Data Import

  Background:
    Given I launch application and on login page
    When User login with following credentials details
      |Admin |admin123 |
    And  User click submit button
    And user hover on PIM to see all menu option
    And Go to Data Import page

  Scenario: File Successfully Download
    Given User is on Data Import page
    When I download file successfully from Data Import Section
    And Upload File from Data Import Section
    And I try to save file without upload
    Then message required validation message show



