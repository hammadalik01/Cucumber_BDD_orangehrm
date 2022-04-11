package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.TestContextSetup;

import java.util.List;
import java.util.Map;

public class LoginPageStepDefination {

    public TestContextSetup testContextSetup;
    public LoginPage loginpage;

    public LoginPageStepDefination(TestContextSetup testContextSetup){

        this.testContextSetup = testContextSetup;
        this.loginpage = testContextSetup.pageObjectManager.getLoginPage();

    }

    @Given("I launch application and on login page")
    public void i_launch_application_and_on_login_page() {

        String TitleLoginPage = loginpage.GetTitleOfLoginPage();
        //System.out.println(TitleLoginPage);
        Assert.assertTrue(TitleLoginPage.contains("OrangeHRM"));
    }



    @When("^I enter username as (.+) and password as (.+)$")
    public void i_enter_username_as_and_password_as(String invalidusername, String invalidpassword) throws Throwable {

        //System.out.println(invalidusername);
        //System.out.println(invalidpassword);
        loginpage.enterUsernameAndPassword(invalidusername,invalidpassword);

    }

    @When("User click submit button")
    public void user_click_submit_button() throws Throwable {

        loginpage.clickOnLoginButton();

    }

    @Then("^Error Message display (.+) on login page$")
    public void error_message_display_on_login_page(String errormessage) throws Throwable {

        //System.out.println(errormessage);
        String ActualMessage = loginpage.getEmptyMessage();
        Assert.assertEquals(ActualMessage , errormessage );

    }

    //Error message show when user forget to enter username

    @When("User forget to enter username")
    public void user_forget_to_enter_username() {
        loginpage.enterUsernameAndPassword("","123");
    }

    @Then("Message display Username cannot be empty on login page")
    public void message_display_on_login_page() {

        String ExpectedMessage = loginpage.getEmptyMessage();
        //System.out.println(ExpectedMessage);
        Assert.assertEquals("Username cannot be empty" , ExpectedMessage ,"Username Empty validation not show");

    }

    //Error message show when user forget to enter password

    @When("User only enter username but forget to enter password")
    public void User_only_enter_username_but_forget_to_enter_password () {

        loginpage.enterUsernameAndPassword("admin","");

    }


    @Then("Message display Password cannot be empty on login page")
    public void message_display_password_cannot_be_empty_on_login_page() {

        String ExpectedMessage = loginpage.getEmptyMessage();
        //System.out.println(ExpectedMessage);
        Assert.assertEquals("Password cannot be empty", ExpectedMessage, "password Empty validation not show");
    }

    //Login Successfully Into application

    @When("^User login with following credentials details$")
    public void user_login_with_following_credentials_details(DataTable data) throws Throwable {

        List<List<String>> obj= data.asLists();
        String validUserName = obj.get(0).get(0);
        String validPassword = obj.get(0).get(1);

        //System.out.println(validUserName);
        //System.out.println(validPassword);

        loginpage.enterUsernameAndPassword(validUserName,validPassword);

    }




































}
