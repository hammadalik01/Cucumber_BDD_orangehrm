package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeeContactDetailPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeeContactDetailPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    //Define Element


    By SaveButton_id = By.id("btnSave");
    By contactDetails_menu = By.xpath("//a[contains(text(),'Contact Details')]");
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

    public void userEditContactDetails(){

        driver.findElement(contactDetails_menu).click();
        driver.findElement(editButton_xpath).click();
        driver.findElement(contactStreet1_id).clear();
        driver.findElement(contactStreet1_id).sendKeys("karu 17");
        driver.findElement(contactStreet2_id).clear();
        driver.findElement(contactCity_id).sendKeys("Tallinn");
        driver.findElement(contact_provence).sendKeys("kööginurgaga");
        driver.findElement(contactMapZip).sendKeys("10120");
        Select contcountry = new Select(driver.findElement(contactCountry));
        contcountry.selectByVisibleText("Estonia");
        driver.findElement(SaveBtn_xpath).click();

    }

    public String getSuccessfullMessage(){


        //WebElement MessageSucc = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='message success fadable']")));

        WebElement MessageSucc = driver.findElement(SuccessFullMessage_CssSelector);
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;
        //System.out.println(ActualSuccessFull_message);

    }










}
