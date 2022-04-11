package com.bddcucumberframework.stepDefinations;

import com.bddcucumberframework.pagesObject.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.TestContextSetup;

public class DashboardPageStepDefination {

    public TestContextSetup testContextSetup;
    public DashboardPage dashboardPage;
    public String dashboardmainHeading;


    public DashboardPageStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.dashboardPage = testContextSetup.pageObjectManager.getDashboardPage();
    }



    @Then("^User login into application URl should be changed$")
    public void user_login_into_application_url_should_be_changed() throws Throwable {

        //System.out.println(dashboardPage.getCurrentUrl());
        Assert.assertTrue(dashboardPage.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/dashboard"),"User Not Login into application");
    }



    @Then("^Dashboard heading should be shown on Main page$")
    public void dashboard_heading_should_be_shown_on_main_page() throws Throwable {
        testContextSetup.dashboardmainHeading = dashboardPage.DashboardHeading();
        //System.out.println(dashboardPage.DashboardHeading());
        //System.out.println(testContextSetup.dashboardmainHeading);
        Assert.assertTrue(testContextSetup.dashboardmainHeading.contains("Dashboard"),"User not login into application");

    }


    //User go to System users section

    @Given("^user is on dashboard page$")
    public void user_is_on_dashboard_page() throws Throwable {

        //testContextSetup.testBase.driver.getCurrentUrl();
        System.out.println(testContextSetup.testBase.driver.getCurrentUrl());
        Assert.assertTrue(testContextSetup.testBase.driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/index.php/dashboard"),"User Not Login into application");





    }

    @When("^user go to system users section by click on Users menu$")
    public void user_go_to_system_users_section_by_click_on_users_menu() throws Throwable {

        dashboardPage.userGotoUserSystemPage();

    }

    @Then("^user successfully move to system user page of application$")
    public void user_successfully_move_to_system_user_page_of_application() throws Throwable {

        String ActualHeaderText = dashboardPage.getActualHeadingText();
        System.out.println(ActualHeaderText);
        String ExpectedHeaderText = "System Users";
        Assert.assertEquals(ActualHeaderText, ExpectedHeaderText);

    }









}
