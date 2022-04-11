package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.DataImportPage;
import com.bddcucumberframework.pagesObject.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.List;

public class DataImportPageStepDefination {

    public TestContextSetup testContextSetup;
    public DataImportPage dataImportPage;

    public DataImportPageStepDefination(TestContextSetup testContextSetup){

        this.testContextSetup = testContextSetup;
        this.dataImportPage = testContextSetup.pageObjectManager.getDataImportPage();

    }


    @When("Go to Data Import page")
    public void go_to_data_import_page() {

        dataImportPage.UserGoToImportDataPage();


    }


    @Given("User is on Data Import page")
    public void user_is_on_data_import_page() {

        //dataImportPage.DataImportPageHeading();
        Assert.assertTrue(dataImportPage.dataImportPageHeading().contains("CSV Data Import"));

    }


    @When("I download file successfully from Data Import Section")
    public void i_download_file_successfully_from_data_import_section() {

        dataImportPage.downloadFileSuccessfully();

    }



    @When("Upload File from Data Import Section")
    public void upload_file_from_data_import_section() {

        dataImportPage.uploadFileInDataImportSection();

    }


    @When("I try to save file without upload")
    public void i_try_to_save_file_without_upload() {

        dataImportPage.saveWithoutUploadFile();

    }


    @Then("message required validation message show")
    public void message_required_validation_message_show() {

        Assert.assertTrue(dataImportPage.getRequiredErrorMessage().contains("Required"));

    }







}
