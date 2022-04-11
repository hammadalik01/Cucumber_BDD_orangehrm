package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EmployeeContactDetailPage;
import com.bddcucumberframework.pagesObject.EmployeePersonalDetailPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeeContactDetailsPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeeContactDetailPage employeecontactdetailpage;




    public EmployeeContactDetailsPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.employeecontactdetailpage = testContextSetup.pageObjectManager.getEmployeeContactDetailsPage();
    }


    @When("User Edit Contact details of employee")
    public void user_edit_contact_details_of_employee() {

        employeecontactdetailpage.userEditContactDetails();

    }



    @Then("Contact Details added successfully")
    public void contact_details_added_successfully() {

        Assert.assertTrue(employeecontactdetailpage.getSuccessfullMessage().contains("Successfully Saved"));

    }










}

