package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.AddUserPage;
import com.bddcucumberframework.pagesObject.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.TestContextSetup;

public class LogoutPageStepDefination {

    public TestContextSetup testContextSetup;
    public LogoutPage logoutPage;



    public LogoutPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.logoutPage = testContextSetup.pageObjectManager.getLogoutPage();
    }



    @Given("User is on dashboard")
    public void user_is_on_dashboard() {

        String getCurrentUrl= testContextSetup.testBase.driver.getCurrentUrl();
        System.out.println(getCurrentUrl);

    }


    @When("I go to welcome menu and click on it dropdown open and click on logout option")
    public void i_go_to_welcome_menu_and_click_on_it_dropdown_open_and_click_on_logout_option() throws InterruptedException {

        logoutPage.userGotoLogoutLink();
    }



    @Then("user logout successfully and redirect to login panel section")
    public void user_logout_successfully_and_redirect_to_login_panel_section() {

        testContextSetup.loginpageurl = logoutPage.getCurrentUrl();
        //System.out.println(testContextSetup.loginpageurl);
        Assert.assertTrue(testContextSetup.loginpageurl.contains("https://opensource-demo.orangehrmlive.com/index.php/auth/login"));

    }








}
