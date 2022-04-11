package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeImmigrationRecordPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeeImmigrationRecordPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    //Define Element

    By immigrationMenu_xpath = By.xpath("//a[contains(text(),'Immigration')]");
    By AddButton_xpath  = By.xpath("//input[@id='btnAdd']");
    By Immigration_id = By.id("immigration_number");
    By ButtonSave_xpath =By.xpath("//input[@id='btnSave']");
    By SuccessFullMessage_xpath = By.cssSelector("div[class*='message success fadable']");




    //Define function

    public void EditEmployeeImmigrationRecord(){
        //Immigration Record Added
        driver.findElement(immigrationMenu_xpath).click();
        driver.findElement(AddButton_xpath).click();
        driver.findElement(Immigration_id).sendKeys("123456789");
        driver.findElement(ButtonSave_xpath).click();

    }

    public String getSuccessfullyMessage(){
        //WebElement MessageSucc = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='message success fadable']")));
        WebElement MessageSucc = driver.findElement(SuccessFullMessage_xpath);
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        //String ExpectedSuccessFull_message ="Successfully Saved";
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;

        //System.out.println(ActualSuccessFull_message);
        
    }












}
