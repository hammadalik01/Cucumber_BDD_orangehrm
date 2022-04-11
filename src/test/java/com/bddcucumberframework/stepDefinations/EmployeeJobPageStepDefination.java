package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EmployeeContactDetailPage;
import com.bddcucumberframework.pagesObject.EmployeeJobPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeeJobPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeeJobPage employeejobpage;



    public EmployeeJobPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.employeejobpage = testContextSetup.pageObjectManager.getEmployeeJobPage();
    }



    @When("User Edit job record details of employee")
    public void user_edit_job_record_details_of_employee() {

        employeejobpage.userEditJob();

    }



    @Then("job record Details edit successfully")
    public void job_record_details_edit_successfully() {

        Assert.assertTrue(employeejobpage.userGetSuccessfulMessage().contains("Successfully Updated"));

    }













}

