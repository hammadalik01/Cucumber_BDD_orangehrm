package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.AddUserPage;
import com.bddcucumberframework.pagesObject.JobPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.List;

public class JobPageStepDefination {

    public TestContextSetup testContextSetup;
    public JobPage jobPagepage;




    public JobPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.jobPagepage = testContextSetup.pageObjectManager.getJobPage();

    }

    @When("user go to system admin")
    public void user_go_to_system_admin() throws Exception {

        jobPagepage.userHoverOnAdmin();


    }



    @When("user go to Job menu")
    public void user_go_to_job_menu() {

        jobPagepage.userGoToJobMenuPage();


    }



    @When("User go to job Title page")
    public void user_go_to_job_title_page() {

        jobPagepage.userClickToJobMenuPage();


    }


    @Given("User go to Add Job Title page")
    public void user_go_to_add_job_title_page() {

        jobPagepage.userGoToAddJobTitlePage();
        Assert.assertTrue(testContextSetup.testBase.driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList"));
        System.out.println(testContextSetup.testBase.driver.getCurrentUrl());


    }




    @Then("Record save successfully with message {string} and user also redirect to the view job title list page")
    public void record_save_successfully_with_message_and_user_also_redirect_to_the_view_job_title_list_page(String string) {

        Assert.assertTrue(jobPagepage.SuccessFullMessageOnAddRecord().contains("Successfully Saved"));

    }

    //For Delete all Record


    @Given("user is on job title list page")
    public void user_is_on_job_title_list_page() {



        jobPagepage.userClickToJobMenuPage();
        jobPagepage.userGoToAddJobTitlePage();
        Assert.assertTrue(testContextSetup.testBase.driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList"));

    }


    @When("user select those record which need to delete")
    public void user_select_those_record_which_need_to_delete() {

        jobPagepage.selectAllRecordWhichNeedToDelete();


    }


    @When("User delete all record")
    public void user_delete_all_record() {

        jobPagepage.deleteAllRecord();


    }


    @Then("record deleted Successfully with message of {string}")
    public void record_deleted_successfully_with_message_of(String ExpectedDeleteMessage) {
        Assert.assertEquals(jobPagepage.successFullMessageOnDeleteRecord(),ExpectedDeleteMessage);

    }








}
