package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddJobPage {
    WebDriver driver;
    public HelperPage helperPage;

    public AddJobPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    //Define Element

    By AddJobTitle_id = By.id("jobTitle_jobTitle");
    By AddJobDescription_id = By.id("jobTitle_jobDescription");
    By JobFileButton_id = By.id(("jobTitle_jobSpec"));
    By JobNotes_id = By.id("jobTitle_note");



    //Define function

    public void addDetails(String jobName , String jobDescription , String FilePath ,String Notes){

        // Fill all Field
        driver.findElement(AddJobTitle_id).sendKeys(jobName);
        driver.findElement(AddJobDescription_id).sendKeys(jobDescription);

        // Upload File
        WebElement button = driver.findElement(JobFileButton_id);
        button.sendKeys(FilePath);

        //Notes
        driver.findElement(JobNotes_id).sendKeys(Notes);

    }

    public void addRecord(){
        //Click on Add Job button
        driver.findElement(By.id("btnAdd")).click();
    }



    public void saveRecord(){
        //Click on Save button
        driver.findElement(By.id("btnSave")).click();
    }






}
