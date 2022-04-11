Feature: Add and delete job Functionality

  Background:
    Given I launch application and on login page
    When User login with following credentials details
      |Admin |admin123 |
    And User click submit button
    And user go to system admin
    And user go to Job menu
    And User go to job Title page

  Scenario: Add job titles

    Given User go to Add Job Title page
    When User insert following details in form for add job title and save record

        |Founder	|SQA Trainings| C:\WebProject\Demo-Orange-hrm\images\image.png|Zeeshan |
        |Co Founder	|SQA Trainings| C:\WebProject\Demo-Orange-hrm\images\image.png| Imran |
        |Coordinator|SQA Trainings| C:\WebProject\Demo-Orange-hrm\images\image.png| uneeba |

    Then Record save successfully with message "Successfully Saved" and user also redirect to the view job title list page


  Scenario: Delete Job Title
    Given user is on job title list page
    When user select those record which need to delete
    And User delete all record
    Then record deleted Successfully with message of "Successfully Deleted"







