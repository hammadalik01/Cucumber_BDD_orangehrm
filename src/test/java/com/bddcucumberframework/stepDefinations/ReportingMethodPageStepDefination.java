package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.CustomPage;
import com.bddcucumberframework.pagesObject.ReportingMethodPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;

public class ReportingMethodPageStepDefination {

    public TestContextSetup testContextSetup;
    public ReportingMethodPage reportingMethodPage;


    public ReportingMethodPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.reportingMethodPage = testContextSetup.pageObjectManager.getRepotingMethodPage();
    }


    //Add Reporting Method
    @When("Go to Reporting Method page")
    public void go_to_reporting_method_page() {
        reportingMethodPage.goToReportingMethodPage();
    }

    @When("I click on Add button for add reporting method")
    public void I_click_on_Add_button_for_add_reporting_method() {

        reportingMethodPage.clickOnAddButton();



    }


    @Given("User is on reporting method page")
    public void user_is_on_reporting_method_page() {

        Assert.assertTrue(reportingMethodPage.getPageHeading().contains("Reporting Methods"));
        System.out.println(reportingMethodPage.getPageHeading());


    }


    @When("Enter the data into reporting method form and save it")
    public void enter_the_data_into_reporting_method_form_and_save_it() {

        reportingMethodPage.AddDataIntoReportingMethodForm();

    }

    @When("Select reporting record and delete it")
    public void select_reporting_record_and_delete_it() {

        reportingMethodPage.deleteSelectedReportingMethod();

    }



















}
