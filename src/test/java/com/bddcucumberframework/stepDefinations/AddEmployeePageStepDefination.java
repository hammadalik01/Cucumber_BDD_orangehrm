package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.AddEmployeePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class AddEmployeePageStepDefination {

    public TestContextSetup testContextSetup;
    public AddEmployeePage addemployeepage;




    public AddEmployeePageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.addemployeepage = testContextSetup.pageObjectManager.getAddEmployeePage();

    }


    @When("User on PIM menu")
    public void user_on_pim_menu() throws Exception {

        addemployeepage.userOnPIMMenu();


    }


    @Given("User go to Add Employee menu")
    public void user_go_to_add_employee_menu() throws Exception {

        addemployeepage.clickOnAddEmployee();
        Assert.assertEquals(addemployeepage.getEmployeePageHeading() , "Add Employee");

    }




    @When("User insert details in form for add Employee and save record")
    public void user_insert_details_in_form_for_add_employee_and_save_record() {

        addemployeepage.fillEmployeeDataAndSave();

    }



    @Then("User move to Personal Details page of application")
    public void user_move_to_personal_details_page_of_application() {

        Assert.assertTrue((addemployeepage.personalDetailHeading().contains("Personal Details")));

    }




}

