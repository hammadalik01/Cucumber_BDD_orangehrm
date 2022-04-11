package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.DeleteEmployeePage;
import com.bddcucumberframework.pagesObject.EditEmployeePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class DeleteEmployeePageStepDefination {

    public TestContextSetup testContextSetup;
    public DeleteEmployeePage deleteemployeepage;




    public DeleteEmployeePageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.deleteemployeepage = testContextSetup.pageObjectManager.getDeleteEmployeePage();

    }


    @Given("User search employee by employee ID for Delete")
    public void user_search_employee_by_employee_id_for_delete() {



    }


    @Given("User On employee List")
    public void user_on_employee_list() {


        deleteemployeepage.userSearchEmployee();

    }


    //Deleted User record

    @When("User Delete the selected record")
    public void user_delete_the_selected_record() {

        deleteemployeepage.userDeleteRecord();

    }


    @Then("Record Deleted Successfully")
    public void record_deleted_successfully() {

        Assert.assertTrue(deleteemployeepage.userGetSuccessfulMessageOnDelete().contains("Successfully Deleted"));

    }



    @When("User search Deleted record from list")
    public void user_deleted_search_record_from_list() {

        deleteemployeepage.UserSearchDeletedRecord();


    }


    @Then("Deleted record not found in list")
    public void deleted_record_not_found_in_list() {

        Assert.assertTrue(deleteemployeepage.deletedRecordNotFound().contains("No Records Found"));



    }



}

