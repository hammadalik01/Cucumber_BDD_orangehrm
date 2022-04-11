package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditEmployeePage {
    WebDriver driver;
    public HelperPage helperPage;

    public EditEmployeePage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    //Define Element
    By employeeList_id = By.id("menu_pim_viewEmployeeList");
    By employeeSearch_id = By.id("empsearch_id");
    By employeeSeach_Btn = By.id("searchBtn");
    By employeeRecord_xpath = By.xpath("//a[contains(text(),'1')]");
    By Edit_Button_Xpath = By.xpath("//input[@id='btnSave']");
    By personalDate_id = By.id("personal_DOB");
    By SaveButton_id = By.id("btnSave");
    By DateValidation_xpath = By.xpath("//span[@for='personal_DOB']");
    By personalPage_xpath = By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='employee-details']/div[@id='pdMainContainer']/div[1]");






    //Define function
    public void userGoToEditMenu(){

        WebElement AddEmployee = driver.findElement(employeeList_id);
        helperPage.WaitUntilWebElementIsVisible(AddEmployee);
        AddEmployee.click();

    }

    public void searchEmployeeByIDAndGoToThatEmployee(){


        driver.findElement(employeeSearch_id).sendKeys("1.1");
        driver.findElement(employeeSeach_Btn).click();
        driver.findElement(employeeRecord_xpath).click();

    }

    public String userOnPersonalPageOfEmployee(){

        String PersonalPageHeading = driver.findElement(personalPage_xpath).getText();
        return PersonalPageHeading;

    }

    public void userClickOnEditButtonForUpdateForm(){

        driver.findElement(Edit_Button_Xpath).click();

    }

    public void userEnterWrongFormatOfDate(){

        WebElement DateOfBirth = driver.findElement(personalDate_id);
        DateOfBirth.clear();
        DateOfBirth.sendKeys("01-25-1992");

    }

    public void saveRecord(){

        driver.findElement(SaveButton_id).click();

    }

    public String dateValidationErrorMessage(){

        WebElement validation_msg = driver.findElement(DateValidation_xpath);
        helperPage.WaitUntilWebElementIsVisible(validation_msg);
        String ActualValidationErrorMsg = validation_msg.getText();
        return ActualValidationErrorMsg;

        //String ExpectedValidationErrorMsg = "Should be a valid date in yyyy-mm-dd";
        //System.out.println(ActualValidationErrorMsg);

    }














}
