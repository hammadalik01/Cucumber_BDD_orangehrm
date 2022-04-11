package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.CustomPage;
import com.bddcucumberframework.pagesObject.SystemUserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.TestContextSetup;

public class CustomPageStepDefination{

    public TestContextSetup testContextSetup;
    public CustomPage customPage;


    public CustomPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.customPage = testContextSetup.pageObjectManager.getCustomPage();
    }


    //Validation


    @When("user hover on PIM to see all menu option")
    public void user_hover_on_pim_to_see_all_menu_option() throws Exception {

        customPage.hoverOnPimMenuAndConfiguration();

    }

    @When("Go to custom field")
    public void go_to_custom_field() throws Exception {
        customPage.clickOnCustomFieldMenu();

    }

    @Given("User is on custom field page")
    public void user_is_on_custom_field_page() {

        String ActualUrl = testContextSetup.testBase.driver.getCurrentUrl();
        System.out.println(ActualUrl);
        Assert.assertTrue(ActualUrl.contains("https://opensource-demo.orangehrmlive.com/index.php/pim/listCustomFields"));
    }

    @When("I click on Add button")
    public void i_click_on_add_button() {

        customPage.clickOnAddButton();

    }


    @When("without fill all the field I try to save data")
    public void without_fill_all_the_field_i_try_to_save_data() {

        customPage.ClickOnSaveButton();

    }


    @Then("Required validation message show")
    public void required_validation_message_show() {

        System.out.println(customPage.getRequiredValidationMessage());
        Assert.assertTrue(customPage.getRequiredValidationMessage().contains("Required"));

    }

    @When("Enter the data and save it")
    public void enter_following_data_and_save_it() {

        customPage.AddDataIntoCustomFieldForm();
        customPage.ClickOnSaveButton();

    }


    @Then("Data save successfully and message show Successfully Saved")
    public void data_save_successfully_and_message_show_successfully_saved() {

        //customPage.getSuccessFullMessage();
        Assert.assertTrue(customPage.getSuccessFullMessage().contains("Successfully Saved"));

    }

    @When("Edit the data and save it")
    public void edit_the_data_and_save_it() {

        customPage.EditCustomField();
        customPage.ClickOnSaveButton();

    }


    @When("Select the a record and Delete it")
    public void select_the_a_record_and_delete_it() {

        customPage.SelectRecordAndDeleteIt();

    }


    @Then("successfully record deleted with message show {string}")
    public void successfully_record_deleted_with_message_show(String expectedMessage) {

        //System.out.println(customPage.getSuccessFullMessage());
        Assert.assertEquals(customPage.getSuccessFullMessage(),expectedMessage,"Custom Field not deleted");

    }




















}
