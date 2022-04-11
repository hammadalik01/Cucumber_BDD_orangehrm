package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.AddEmployeePage;
import com.bddcucumberframework.pagesObject.EditEmployeePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EditEmployeePageStepDefination {

    public TestContextSetup testContextSetup;
    public EditEmployeePage editemployeePage;




    public EditEmployeePageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.editemployeePage = testContextSetup.pageObjectManager.getEditEmployeePage();

    }



    @Given("User go to Edit Employee menu")
    public void user_go_to_edit_employee_menu() {

        editemployeePage.userGoToEditMenu();


    }


    @Given("User search employee by employee ID")
    public void user_search_employee_by_employee_id() {

        editemployeePage.searchEmployeeByIDAndGoToThatEmployee();

    }


    @Given("User On personal page")
    public void user_on_personal_page() {

        Assert.assertTrue(editemployeePage.userOnPersonalPageOfEmployee().contains("Personal Details"));

    }


    @When("User go to personal page and enter date in wrong format")
    public void user_go_to_personal_page_and_enter_date_in_wrong_format() {

        editemployeePage.userClickOnEditButtonForUpdateForm();
        editemployeePage.userEnterWrongFormatOfDate();

    }


    @When("User save data")
    public void user_save_data() {

        editemployeePage.saveRecord();

    }


    @Then("Date validation error message show")
    public void date_validation_error_message_show() {

        Assert.assertEquals(editemployeePage.dateValidationErrorMessage(), "Should be a valid date in yyyy-mm-dd format");

    }














}

