package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeSalaryPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeeSalaryPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }



    //Define Element
    By salaryXpath = By.xpath("//a[contains(text(),'Salary')]");
    By AddSalary_id =By.id("addSalary");
    By SalaryComponent_id = By.id("salary_salary_component");
    By PayerIdCode_id = By.id("salary_payperiod_code");
    By SalaryCurrency_id = By.id("salary_currency_id");
    By basicSalary_id = By.id("salary_basic_salary");
    By SalaryBtnSave = By.id("btnSalarySave");












    //Define function

    public void employeeSalaryEdit(){

        driver.findElement(salaryXpath).click();
        driver.findElement(AddSalary_id).click();
        driver.findElement(SalaryComponent_id).sendKeys("Monthly Salary");
        Select PayFrequently = new Select(driver.findElement(PayerIdCode_id));
        PayFrequently.selectByVisibleText("Monthly");

        Select Salarycurrency = new Select(driver.findElement(SalaryCurrency_id));
        Salarycurrency.selectByVisibleText("Euro");

        driver.findElement(basicSalary_id).sendKeys("1500");
        driver.findElement(SalaryBtnSave).click();

    }

    public String getSuccessfullMessage(){

        //WebElement MessageSucc = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='message success fadable']")));
        WebElement MessageSucc = driver.findElement(By.cssSelector("div[class*='message success fadable']"));
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        //String ExpectedSuccessFull_message ="Successfully Saved";
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;
        //System.out.println(ActualSuccessFull_message);

    }
















}
