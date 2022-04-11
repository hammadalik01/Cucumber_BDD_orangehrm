package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployeePage {
    WebDriver driver;
    public HelperPage helperPage;

    public AddEmployeePage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    //Define Element

    By PIM_Menu = By.id("menu_pim_viewPimModule");
    By EmployeementHeading = By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[1]");
    By FirstName_id = By.id("firstName");
    By LastName_id = By.id("lastName");
    By Employeement_id = By.id("employeeId");
    By SaveButton_id = By.id("btnSave");
    By personalData_Heading = By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='employee-details']/div[@id='pdMainContainer']/div[1]");








    //Define function

    public void userOnPIMMenu() throws Exception {

        WebElement PIM = driver.findElement(PIM_Menu);
        helperPage.WaitUntilWebElementIsVisible(PIM);
        helperPage.actionMoveAndHover(PIM);


        //WebElement Admin;
        //Admin = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewPimModule")));
        //Actions act = new Actions(driver);
        //act.moveToElement(Admin).build().perform();

    }

    public void clickOnAddEmployee() throws Exception {

        WebElement AddEmployee= driver.findElement(By.id("menu_pim_addEmployee"));
        helperPage.actionMoveAndClick(AddEmployee);

        // Click on Add Employee
        //WebElement AddEmployee = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_addEmployee")));
        //AddEmployee.click();

    }

    public String getEmployeePageHeading(){

        String ActualEmployeeHeading = driver.findElement(EmployeementHeading).getText();
        return ActualEmployeeHeading;

    }

    public void fillEmployeeDataAndSave(){

        driver.findElement(FirstName_id).sendKeys("Jhon");
        driver.findElement(LastName_id).sendKeys("Ali");
        WebElement EmpID= driver.findElement(Employeement_id);
        EmpID.clear();
        EmpID.sendKeys("1.1");
        //EmpID.sendKeys(Random);
        driver.findElement(SaveButton_id).click();
    }

    public String personalDetailHeading(){

        WebElement Personal_Data= driver.findElement(personalData_Heading);
        helperPage.WaitUntilWebElementIsVisible(Personal_Data);
        return Personal_Data.getText();

    }





















}
