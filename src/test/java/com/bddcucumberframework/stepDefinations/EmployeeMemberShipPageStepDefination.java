package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EmployeeContactDetailPage;
import com.bddcucumberframework.pagesObject.EmployeeMemberShipPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeeMemberShipPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeeMemberShipPage employeemembershippage;




    public EmployeeMemberShipPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.employeemembershippage = testContextSetup.pageObjectManager.getEmployeeMemberShipPage();
    }


    @Given("User On Memberships section")
    public void user_on_memberships_section() {

        employeemembershippage.goToMemberShip();
        Assert.assertTrue(employeemembershippage.getHeading().contains("Assigned Memberships"));

    }



    @When("User added Memberships record into details of employee")
    public void user_added_memberships_record_into_details_of_employee() {

        employeemembershippage.addMemberShipRecord();

    }



    @Then("Memberships record added successfully")
    public void memberships_record_added_successfully() {

        Assert.assertTrue(employeemembershippage.getSuccessfulMessage().contains("Successfully Saved"));

    }














}

