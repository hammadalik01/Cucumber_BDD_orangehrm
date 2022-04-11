package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportingMethodPage {
    WebDriver driver;
    public HelperPage helperPage;


    public ReportingMethodPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    By reportingMethodMenu_id = By.id("menu_pim_viewReportingMethods");
    By reportingMethodHeading_xpath = By.xpath("//h1[contains(text(),'Reporting Methods')]");
    By reportingMethodFieldName = By.id("reportingMethod_name");
    By saveButton = By.id("btnSave");
    By AddButton = By.id("btnAdd");
    By DeleteCheckbox_xpath = By.xpath("//a[text()='Direction']//parent::td[@class='tdName tdValue']//preceding-sibling::td[@class='check']//input[@type='checkbox']");
    By DeleteButton_id = By.id("btnDel");






    public void goToReportingMethodPage() {
        WebElement ReportingMethodMenu = driver.findElement(reportingMethodMenu_id);
        helperPage.WaitUntilWebElementIsVisible(ReportingMethodMenu);
        ReportingMethodMenu.click();

    }

    public String getPageHeading(){

        String ReportingMethodHeading = driver.findElement(reportingMethodHeading_xpath).getText();
        return ReportingMethodHeading;

    }

    public void clickOnAddButton(){

        WebElement AddReportingButton = driver.findElement(AddButton);
        helperPage.WaitUntilWebElementIsVisible(AddReportingButton);
        AddReportingButton.click();

    }

    public void AddDataIntoReportingMethodForm(){

        driver.findElement(reportingMethodFieldName).sendKeys("Direction");
        driver.findElement(saveButton).click();

    }

    public void deleteSelectedReportingMethod(){

        driver.findElement(DeleteCheckbox_xpath).click();
        driver.findElement(DeleteButton_id).click();


    }











}
