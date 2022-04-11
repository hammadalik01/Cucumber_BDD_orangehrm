package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeeJobPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeeJobPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    //Define Element
    By SuccessfulMsg = By.cssSelector("div[class*='message success fadable']");
    By job_xpath = By.xpath("(//a[contains(text(),'Job')])[4]");
    By saveBtn_id = By.id("btnSave");
    By jobTitle_xpath = By.id("job_job_title");
    By jobEmpStatus_id = By.id("job_emp_status");
    By jobEmpCategory_id = By.id("job_eeo_category");
    By jobLocation_id = By.id("job_location");
    By saveBtn_xpath = By.xpath("//input[@id='btnSave']");







    //Define function


    public void userEditJob(){

        driver.findElement(job_xpath).click();
        driver.findElement(saveBtn_id).click();

        //Job_Tittle
        Select job_title = new Select(driver.findElement(jobTitle_xpath));
        job_title.selectByVisibleText("QA Engineer");

        //Emp Status
        driver.findElement(jobEmpStatus_id).click();
        new Select(driver.findElement(jobEmpStatus_id)).selectByVisibleText("Full-Time Contract");

        //Job Category
        Select job_category = new Select(driver.findElement(jobEmpCategory_id));
        job_category.selectByVisibleText("Officials and Managers");

        //Job Location
        Select job_location = new Select (driver.findElement(jobLocation_id));
        job_location.selectByVisibleText("New York Sales Office");
        driver.findElement(saveBtn_xpath).click();

    }

    public String userGetSuccessfulMessage(){

        WebElement JobMessageSucc = driver.findElement(SuccessfulMsg);
        helperPage.WaitUntilWebElementIsVisible(JobMessageSucc);
        String ActualjobSuccessFull_message =  JobMessageSucc.getText();
        return ActualjobSuccessFull_message;

    }













}
