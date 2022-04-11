package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EmployeeContactDetailPage;
import com.bddcucumberframework.pagesObject.EmployeeEmergencyContactDetailPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeeEmergencyContactPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeeEmergencyContactDetailPage employeeemergencycontactdetailpage;




    public EmployeeEmergencyContactPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.employeeemergencycontactdetailpage = testContextSetup.pageObjectManager.getEmployeeEmergencyContactDetailsPage();
    }

    @When("User Edit emergency Contact details of employee")
    public void user_edit_emergency_contact_details_of_employee() {

        employeeemergencycontactdetailpage.userEditEmergencyContactDetailsSuccessfully();

    }




    @Then("Emergency Contact Details added successfully")
    public void emergency_contact_details_added_successfully() {


        Assert.assertTrue(employeeemergencycontactdetailpage.successfulMessageShowContactDetailsAdded().contains("Successfully Saved"));

    }














}

