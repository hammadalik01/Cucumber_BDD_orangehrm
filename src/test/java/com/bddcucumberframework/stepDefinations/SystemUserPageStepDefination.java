package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.SystemUserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.TestContextSetup;

public class SystemUserPageStepDefination {

    public TestContextSetup testContextSetup;
    public SystemUserPage systemuserpage;
    public SoftAssert soft;


    public SystemUserPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.systemuserpage = testContextSetup.pageObjectManager.getSystemUserPage();
        this.soft = soft =new SoftAssert();
    }

    public void foo() {

    }

    @Then("page Url successfully change and successful message show in System Users Page")
    public void user_successfully_added_and_successful_message_show() throws Throwable {

        //Check page Url


        //System.out.println(testContextSetup.testBase.driver.getCurrentUrl());
        soft.assertTrue(testContextSetup.testBase.driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers"));

        //Check Successfull Message
        soft.assertEquals(systemuserpage.getSuccessFullMessage() , "Successfully Saved" , "User Not Save Successfully" );

    }

    @Given("^User is on system page$")
    public void user_is_on_system_page() throws Throwable {

        //System.out.println(testContextSetup.testBase.driver.getCurrentUrl());
        soft.assertTrue(testContextSetup.testBase.driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers"));


    }

    @When("^I enter username and click on search button$")
    public void i_enter_username_and_click_on_search_button() throws Throwable {

        String username = TestContextSetup.username;
        //System.out.println("The user name is This:" + username);
        systemuserpage.enterUserInSearchFieldAndClickOnSearchButton(username);

    }

    @Then("^added user show in the record$")
    public void added_user_show_in_the_record() throws Throwable {

        String username = TestContextSetup.username;
        String  ActualUsername = systemuserpage.getCorrectUsernameFromTable(username);
        Assert.assertTrue(ActualUsername.contains(username));
    }


    @When("I click on appear record")
    public void i_click_on_appear_record() {

        String Username = TestContextSetup.username;
        systemuserpage.clickOnAppearingRecord(TestContextSetup.username);
    }



    @Then("Record Updated and Successfully message show")
    public void record_updated_and_successfully_message_show() {

        //Check Successfull Message
        soft.assertEquals(systemuserpage.getSuccessFullMessage() , "Successfully Updated" , "User Record not Updated Successfully" );


    }



    @When("I enter username into system user page and click on search button")
    public void i_enter_username_into_system_user_page_and_click_on_search_button() {

        String username = TestContextSetup.username;
        String DeletedUsername = username+"Edit";
        //System.out.println("Deleted User Name is" + DeletedUsername );
        systemuserpage.enterUserInSearchFieldAndClickOnSearchButton(DeletedUsername);

    }


    @When("I select a record which need to be delete")
    public void i_select_a_record_which_need_to_be_delete() {

        systemuserpage.selectRecordForDelete();

    }


    @When("I cancel the popup for delete the record")
    public void i_cancel_the_popup_for_delete_the_record() {

        systemuserpage.CancelDeletedPopup();

    }


    @When("I delete the record from table")
    public void i_delete_the_record_from_table() {

        systemuserpage.DeleteRecord();

    }


    @Then("deleted record successfully message show")
    public void deleted_record_successfully_message_show() {

        Assert.assertEquals(systemuserpage.DeleteRecordMessageShow() , "Successfully Deleted" , "User Record not Deleted Successfully" );

    }

    @Then("Deleted record not found")
    public void Deleted_record_not_found() {

        String username = TestContextSetup.username;
        String DeletedUsername = username+"Edit";
        //System.out.println("Deleted User Name is" + DeletedUsername );
        systemuserpage.enterUserInSearchFieldAndClickOnSearchButton(DeletedUsername);
        Assert.assertEquals(systemuserpage.DeleteRecordNotFound() , "No Records Found" , "Deleted User Still Exist in table" );

    }

}
