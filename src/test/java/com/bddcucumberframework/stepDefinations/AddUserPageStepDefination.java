package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.AddUserPage;
import com.bddcucumberframework.pagesObject.SystemUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.TestContextSetup;

public class AddUserPageStepDefination {

    public TestContextSetup testContextSetup;
    public AddUserPage adduserpage;
    public SoftAssert soft;



    public AddUserPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.adduserpage = testContextSetup.pageObjectManager.getAddUserPage();
        this.soft = soft =new SoftAssert();
    }



    @Given("^I Go to Add User page for add user$")
    public void i_go_to_add_user_page_for_add_user() throws Throwable {

        //adduserpage.userClickOnAddButton();
        String ExpectedPageHeading = adduserpage.userClickOnAddButton();
        //System.out.println(ExpectedPageHeading);
        Assert.assertTrue(ExpectedPageHeading.contains("Add User"));

    }


    @When("^I enter all required data into Add user form$")
    public void i_enter_all_required_data_into_add_user_form() throws Throwable {

        adduserpage.fillAllRequirementField();

    }

    @When("^I Enter password (.+) to check strength of password$")
    public void i_enter_password_to_check_strength_of_password(String password) throws Throwable {

        adduserpage.enterPassword(password);

    }

    @Then("^(.+) Password length is display as a password length$")
    public void password_length_is_display_as_a_password_length(String passwordStrength) throws Throwable {


        String ActualVeryWeakPasswordStrengthLength = adduserpage.getVeryWeakPasswordStrength();
        //System.out.println(ActualVeryWeakPasswordStrengthLength);
        Assert.assertEquals(ActualVeryWeakPasswordStrengthLength , passwordStrength);

    }

    @When("I enter nothing in password field and click on save button")
    public void i_enter_nothing_in_password_field() throws Throwable {

        adduserpage.enterPassword("");
        adduserpage.clickOnSaveButton();

    }

    @Then("Error message show that password required")
    public void error_message_show_that_password_required() throws Throwable {

        String ActualRequiredPasswordValidation = adduserpage.getRequiredPasswordValidation();
        String ExpectedRequiredPasswordValidation = "Required";
        Assert.assertEquals(ActualRequiredPasswordValidation,ExpectedRequiredPasswordValidation);

    }

    @When("In password field I enter password {string}")
    public void in_password_field_i_enter_password_something(String password) throws Throwable {

        adduserpage.enterPassword(password);

    }

    @When("In confirm password field I enter password {string}")
    public void in_confirm_password_field_i_enter_password_something(String ConfirmPassword) throws Throwable {

        adduserpage.enterConfirmPassword(ConfirmPassword);

    }

    @Then("Passwords do not match Validation error message show {string}")
    public void passwords_do_not_match_validation_error_message_show_something(String errorMessage) throws Throwable {

        System.out.println(adduserpage.getPasswordNotMatchValidation());
        Assert.assertEquals(adduserpage.getPasswordNotMatchValidation(), errorMessage);

    }

    @When("I enter correct password {string} and confirm password {string}")
    public void i_enter_correct_confirm_password_something_and_save_record(String Password , String ConfirmPassword) throws Throwable {

        adduserpage.enterPassword(Password);
        adduserpage.enterConfirmPassword(ConfirmPassword);
        Thread.sleep(2000);

    }

    @When("save the record")
    public void saveTheRecord() throws Exception {

        adduserpage.clickOnSaveButton();


    }





}
