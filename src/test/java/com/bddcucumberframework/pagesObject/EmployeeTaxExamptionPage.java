package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeeTaxExamptionPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeeTaxExamptionPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }



    //Define Element
   By TaxExemption_xpath = By.xpath("//a[contains(text(),'Tax Exemptions')]");
   By Heading_xpath = By.xpath("//h1[contains(text(),'Tax Exemptions')]");
   By SaveBtn_xpath = By.xpath("//input[@id='btnSave']");
   By taxFederal_id = By.id("tax_federalStatus");
   By taxFedralExemption = By.id("tax_federalExemptions");






    //Define function

    public void userOnTaxExemptionSection(){

        WebElement TaxExemptionsXpath = driver.findElement(TaxExemption_xpath);
        helperPage.WaitUntilWebElementIsVisible(TaxExemptionsXpath);
        TaxExemptionsXpath.click();
    }

    public String TaxExemptionSectionHeading(){

        WebElement Heading = driver.findElement(Heading_xpath);
        return Heading.getText();

    }

    public void userAddedTaxExemptionRecord(){

        driver.findElement(SaveBtn_xpath).click();
        Select federalStatus = new Select (driver.findElement(taxFederal_id));
        federalStatus.selectByVisibleText("Single");
        WebElement federalExemptions = driver.findElement(taxFedralExemption);
        federalExemptions.clear();
        federalExemptions.sendKeys("100");
        driver.findElement(SaveBtn_xpath).click();

    }

    public String getTaxExemptionSuccessfulMsg(){

        WebElement MessageSucc = driver.findElement(By.cssSelector("div[class*='message success fadable']"));
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;

    }

















}
