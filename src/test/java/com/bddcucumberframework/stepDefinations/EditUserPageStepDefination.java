package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EditUserPage;
import com.bddcucumberframework.pagesObject.SystemUserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.TestContextSetup;

public class EditUserPageStepDefination {

    public TestContextSetup testContextSetup;
    public EditUserPage editUserPage;
    public SoftAssert soft;



    public EditUserPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.editUserPage = testContextSetup.pageObjectManager.getEditUserPage();
        this.soft = soft =new SoftAssert();
    }


    //Edit User
    @When("I go to Edit user section and edit some information")
    public void i_go_to_edit_user_section_and_edit_some_information() throws InterruptedException {

        editUserPage.editUserRecord();
        Thread.sleep(2000);

    }

    @When("save the record by click on Save Button")
    public void save_the_record_by_click_on_save_button() throws Exception {

        editUserPage.ClickOnSaveButton();

    }



}
