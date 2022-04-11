package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EmployeeContactDetailPage;
import com.bddcucumberframework.pagesObject.EmployeeImmigrationRecordPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeeImmigrationRecordPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeeImmigrationRecordPage Employeeimmigrationrecordpage ;




    public EmployeeImmigrationRecordPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.Employeeimmigrationrecordpage = testContextSetup.pageObjectManager.getEmployeeImmigrationRecordPage();
    }


    @When("User Edit immigration record details of employee")
    public void user_edit_immigration_record_details_of_employee() {

        Employeeimmigrationrecordpage.EditEmployeeImmigrationRecord();

    }



    @Then("Immigration record Details added successfully")
    public void immigration_record_details_added_successfully() {


        Assert.assertTrue(Employeeimmigrationrecordpage.getSuccessfullyMessage().contains("Successfully Saved"));


    }










}

