package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SystemUserPage {
    WebDriver driver;
    public HelperPage helperPage;

    public SystemUserPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    //Define Element

    By successFullMessage = By.cssSelector("div[class*='message success fadable']");
    By SearchUserName = By.id("searchSystemUser_userName");
    By SearchButton = By.id("searchBtn");
    By checkbox = By.id("ohrmList_chkSelectAll");
    By Cancel_xpath = By.xpath("//parent::div[@id='deleteConfModal']//parent::div[@class='modal-footer']//input[@type='button' and @value='Cancel']");
    By DeleteBtn = By.id("btnDelete");
    By DialogDelete = By.id("dialogDeleteBtn");


    //Edit User Page
    //By EditButton = By.id("btnSave");
    //By userName  = By.id("systemUser_userName");
    //By EditRecordSaveBtn = By.id("btnSave");






    //Define Function

    public String getSuccessFullMessage(){

        WebElement MessageSucc = driver.findElement(successFullMessage);
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;

    }

    public void enterUserInSearchFieldAndClickOnSearchButton(String username){

        driver.findElement(SearchUserName).sendKeys(username);
        driver.findElement(SearchButton).click();

    }

    public String getCorrectUsernameFromTable(String username){

        WebElement EditRecordTable = driver.findElement(By.xpath("//a[text()='"+ username+"']"));
        String FetchUserName = EditRecordTable.getText();
        //System.out.println("User Fetch From the table" + FetchUserName);
        return FetchUserName;

    }

    public void clickOnAppearingRecord(String username){

        WebElement getRecord = driver.findElement(By.xpath("//a[text()='"+ username+"']"));
        getRecord.click();

    }

    //Edit User Page




    public void selectRecordForDelete(){

        WebElement checkBoxSelection = driver.findElement(checkbox);
        helperPage.WaitUntilWebElementIsVisible(checkBoxSelection);
        checkBoxSelection.click();

    }

    public void CancelDeletedPopup(){
        driver.findElement(DeleteBtn).click();
        WebElement CancelButtonPopup = driver.findElement(Cancel_xpath);
        helperPage.WaitUntilWebElementIsVisible(CancelButtonPopup);
        CancelButtonPopup.click();

    }

    public void DeleteRecord(){

        //Click on Ok Button
        driver.findElement(DeleteBtn).click();
        driver.findElement(DialogDelete).click();
    }

    public String DeleteRecordMessageShow(){

        WebElement DeleteConfirmMsg = driver.findElement(successFullMessage);
        helperPage.WaitUntilWebElementIsVisible(DeleteConfirmMsg);
        String ActualSuccessFull_Delete_message =  DeleteConfirmMsg.getText();
        return ActualSuccessFull_Delete_message;

        //System.out.println(ActualSuccessFull_Delete_message);

    }

    public String DeleteRecordNotFound(){

       return driver.findElement(By.xpath("//td[contains(text(),'No Records Found')]")).getText();

    }






































}
