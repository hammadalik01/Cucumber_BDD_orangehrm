package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeEmergencyContactDetailPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeeEmergencyContactDetailPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    //Define Element


    //By SaveButton_id = By.id("btnSave");
    By EmergencyContact_menu = By.xpath("//a[contains(text(),'Emergency Contacts')]");
    By addBtnContact_id = By.id("btnAddContact");
    By EmergencyContact_id= By.id("emgcontacts_name");
    By EmergencyContactRelation_id = By.id("emgcontacts_relationship");
    By EmgContactHomePhone_id = By.id("emgcontacts_homePhone");
    By SaveButton_id = By.id("btnSaveEContact");
    By SuccessFullMsg = By.cssSelector("div[class*='message success fadable']");



    By editButton_xpath = By.xpath("//input[@id='btnSave']");
    By contactStreet1_id = By.id("contact_street1");
    By contactStreet2_id = By.id("contact_street2");
    By contactCity_id= By.id("contact_city");
    By contact_provence = By.id("contact_province");
    By contactMapZip = By.id("contact_emp_zipcode");
    By contactCountry = By.id("contact_country");
    By SaveBtn_xpath = By.xpath("//input[@id='btnSave']");
    By SuccessFullMessage_CssSelector = By.cssSelector("div[class*='message success fadable']");













    //Define function

    public void userEditEmergencyContactDetailsSuccessfully(){

        driver.findElement(EmergencyContact_menu).click();
        driver.findElement(addBtnContact_id).click();
        driver.findElement(EmergencyContact_id).sendKeys("emgcontacts_name");
        driver.findElement(EmergencyContactRelation_id).sendKeys("emgcontacts_relationship");
        driver.findElement(EmgContactHomePhone_id).sendKeys("1234567");
        driver.findElement(SaveButton_id).click();

    }

    public String successfulMessageShowContactDetailsAdded(){

        WebElement Emergncy_MessageSucc = driver.findElement(SuccessFullMsg);
        helperPage.WaitUntilWebElementIsVisible(Emergncy_MessageSucc);
        String ActualEmergncy_SuccessFull_message =  Emergncy_MessageSucc.getText();
        return ActualEmergncy_SuccessFull_message;

    }
















}
