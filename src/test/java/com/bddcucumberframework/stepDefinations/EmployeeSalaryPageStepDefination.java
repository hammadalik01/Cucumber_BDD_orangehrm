package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EmployeeContactDetailPage;
import com.bddcucumberframework.pagesObject.EmployeeSalaryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeeSalaryPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeeSalaryPage employeesalarypage;




    public EmployeeSalaryPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.employeesalarypage = testContextSetup.pageObjectManager.getEmployeeSalaryPage();
    }


    @When("User Edit salary record details of employee")
    public void user_edit_salary_record_details_of_employee() {

        employeesalarypage.employeeSalaryEdit();

    }



    @Then("salary record Details edit successfully")
    public void salary_record_details_edit_successfully() {

        Assert.assertTrue(employeesalarypage.getSuccessfullMessage().contains("Successfully Saved"));

    }














}

