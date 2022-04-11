package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditUserPage {
    WebDriver driver;
    public HelperPage helperPage;


    public EditUserPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    //Define Element


    //Edit User Page
    By EditButton = By.id("btnSave");
    By userName  = By.id("systemUser_userName");
    By EditRecordSaveBtn = By.id("btnSave");



    //Edit User Page
    public void editUserRecord(){

        //click on Edit Button
        driver.findElement(EditButton).click();
        driver.findElement(userName).sendKeys("Edit");

    }

    public void ClickOnSaveButton() throws Exception {

        WebElement EditRecord = driver.findElement(EditRecordSaveBtn);
        helperPage.waitAndclickElementUsingJS(EditRecord);

    }



}
