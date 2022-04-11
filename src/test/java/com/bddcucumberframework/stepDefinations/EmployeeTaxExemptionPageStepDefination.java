package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EmployeeSalaryPage;
import com.bddcucumberframework.pagesObject.EmployeeTaxExamptionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeeTaxExemptionPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeeTaxExamptionPage employeetaxexamptionpage;




    public EmployeeTaxExemptionPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.employeetaxexamptionpage = testContextSetup.pageObjectManager.getEmployeeTaxExamptionPage();
    }

    @Given("User On Tax Exemptions page")
    public void user_on_tax_exemptions_page() {

        employeetaxexamptionpage.userOnTaxExemptionSection();
        Assert.assertTrue(employeetaxexamptionpage.TaxExemptionSectionHeading().contains("Tax Exemptions"));

    }


    @When("User added tax exemption record into details of employee")
    public void user_added_tax_exemption_record_into_details_of_employee() {

        employeetaxexamptionpage.userAddedTaxExemptionRecord();

    }


    @Then("tax exemption Details edit successfully")
    public void tax_exemption_details_edit_successfully() {

        Assert.assertTrue(employeetaxexamptionpage.getTaxExemptionSuccessfulMsg().contains("Successfully Saved"));


    }














}

