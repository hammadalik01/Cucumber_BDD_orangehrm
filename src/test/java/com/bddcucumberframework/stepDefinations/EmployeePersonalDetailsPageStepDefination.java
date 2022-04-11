package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.EditEmployeePage;
import com.bddcucumberframework.pagesObject.EmployeePersonalDetailPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;


public class EmployeePersonalDetailsPageStepDefination {

    public TestContextSetup testContextSetup;
    public EmployeePersonalDetailPage employeepersonaldetailpage;




    public EmployeePersonalDetailsPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.employeepersonaldetailpage = testContextSetup.pageObjectManager.getEmployeePersonalDetailsPage();

    }




    @When("user click on Edit Button")
    public void user_click_on_edit_button() {

        employeepersonaldetailpage.userClickOnEditButtonForUpdateForm();

    }



    @When("User edit employee personal information")
    public void user_edit_employee_personal_information() {

        employeepersonaldetailpage.employeePersonalDetailsEdit();

    }


    @Then("User personal data edit successfully")
    public void user_personal_data_edit_successfully() {

        Assert.assertTrue(employeepersonaldetailpage.editEmployeePersonalInformationSuccessfully().contains("Successfully Saved"));

    }


    @When("User edit employee custom Field information")
    public void user_edit_employee_custom_field_information() {

        employeepersonaldetailpage.userEditCustomField();


    }


    @Then("User custom Field edit successfully")
    public void user_custom_field_edit_successfully() {

        Assert.assertTrue(employeepersonaldetailpage.userCustomFieldEditMessageShow().contains("Successfully Updated"));

    }


    @When("User browse a file and upload it")
    public void user_browse_a_file_and_upload_it() {

        employeepersonaldetailpage.userUploadFile();


    }


    @Then("file upload successfully with message")
    public void file_upload_successfully_with_message() {

        employeepersonaldetailpage.successFullMessageOnUploadFile();
        Assert.assertTrue(employeepersonaldetailpage.successFullMessageOnUploadFile().contains("Successfully Saved"));

    }

    @When("User upload profile picture")
    public void user_upload_profile_picture() {

        employeepersonaldetailpage.uploadProfilePicture();


    }



    @Then("profile picture upload successfully")
    public void profile_picture_upload_successfully() {

        Assert.assertTrue(employeepersonaldetailpage.successFullMessageAfterUpload().contains("Successfully Uploaded"));




    }
















}

