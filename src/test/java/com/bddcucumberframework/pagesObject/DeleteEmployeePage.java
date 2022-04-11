package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteEmployeePage {
    WebDriver driver;
    public HelperPage helperPage;

    public DeleteEmployeePage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    //Define Element

    By empSearch_id = By.id("empsearch_id");
    By empSearchBtn_id = By.id("searchBtn");
    By AllCheckList_id = By.id("ohrmList_chkSelectAll");
    By DeleteBtn_id = By.id("btnDelete");
    By DeleteDialogue_id = By.id("dialogDeleteBtn");
    By Successful_Message= By.cssSelector("div[class*='message success fadable']");
    By Msg_RecordNotFound = By.xpath("//td[contains(text(),'No Records Found')]");









    //Define function

    public void userSearchEmployee(){

        driver.findElement(empSearch_id).sendKeys("1.1");
        driver.findElement(empSearchBtn_id).click();

    }

    public void userDeleteRecord(){

        driver.findElement(AllCheckList_id).click();
        driver.findElement(DeleteBtn_id).click();
        driver.findElement(DeleteDialogue_id).click();
    }


    public String userGetSuccessfulMessageOnDelete(){

        WebElement MessageSucc = driver.findElement(Successful_Message);
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;

    }


    public void UserSearchDeletedRecord(){
        driver.findElement(empSearch_id).clear();
        driver.findElement(empSearch_id).sendKeys("1.1");
        driver.findElement(empSearchBtn_id).click();
    }


    public String deletedRecordNotFound(){

        WebElement RecordNot = driver.findElement(Msg_RecordNotFound);
        String ActualMessage = RecordNot.getText();
        return ActualMessage;

    }







}
