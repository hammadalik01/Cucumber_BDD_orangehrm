package com.bddcucumberframework.pagesObject;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.TestContextSetup;

public class AddUserPage {
    WebDriver driver;
    public HelperPage helperPage;

    public AddUserPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    //Define Element

    //driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
    By AddBtn_id = By.id("btnAdd");
    By UserHeading_id = By.id("UserHeading");
    By SelectUserType_id = By.id("systemUser_userType");
    By EmployeeName_id = By.id("systemUser_employeeName_empName");
    By UserName_xpath = By.xpath("//input[@id='systemUser_userName']");
    By SelectStatus_id = By.id("systemUser_status");
    By SystemUserPassword = By.id("systemUser_password");
    By VeryWeak = By.id("systemUser_password_strength_meter");
    By PasswordRequired = By.xpath("//span[contains(text(),'Required')]");
    By confirmPasswordField = By.id("systemUser_confirmPassword");
    By passwordNotMatch = By.xpath("//span[contains(text(),'Passwords do not match')]");
    By saveButton_id = By.id("btnSave");




    //Define function

    public String userClickOnAddButton(){

        driver.findElement(AddBtn_id).click();
        return driver.findElement(UserHeading_id).getText();

    }

    public void fillAllRequirementField(){

        // Select role
        Select SelectRole = new Select(driver.findElement(SelectUserType_id));
        SelectRole.selectByVisibleText("Admin");


        // Enter Employment Name
        driver.findElement(EmployeeName_id).sendKeys("ce");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.DOWN).perform();
        act.sendKeys(Keys.ENTER).perform();

        //Ramdom name
        Faker faker = new Faker();
        String Username = faker.name().fullName();
        TestContextSetup.username = Username;


        // Enter username
        driver.findElement(UserName_xpath).clear();
        driver.findElement(UserName_xpath).sendKeys(Username);

        // Select Status
        Select SelectStatus = new Select(driver.findElement(SelectStatus_id));
        SelectRole.selectByIndex(0);
    }


    public void enterPassword(String Password){

        // Enter password
        driver.findElement(SystemUserPassword).clear();
        driver.findElement(SystemUserPassword).sendKeys(Password);

    }

    public String getVeryWeakPasswordStrength(){

        WebElement VeryWeakPasswordStrength= driver.findElement(VeryWeak);
        helperPage.WaitUntilWebElementIsVisible(VeryWeakPasswordStrength);
        return VeryWeakPasswordStrength.getText();

    }

    public String getRequiredPasswordValidation(){

        //WebElement StrongestPasswordStrength = driver.findElement(StrongestPassword);
        WebElement RequiredPasswordField = driver.findElement(PasswordRequired);
        helperPage.WaitUntilWebElementIsVisible(RequiredPasswordField);
        return RequiredPasswordField.getText();
    }


    public void enterConfirmPassword(String ConfirmPassword){

        WebElement Confirm_password = driver.findElement(confirmPasswordField);
        Confirm_password.clear();
        Confirm_password.sendKeys(ConfirmPassword);

    }

    public String getPasswordNotMatchValidation(){

        WebElement PasswordMissMatch = driver.findElement(passwordNotMatch);
        helperPage.WaitUntilWebElementIsVisible(PasswordMissMatch);
        return PasswordMissMatch.getText();

    }

    public void clickOnSaveButton() throws Exception {

        WebElement SaveButton = driver.findElement(saveButton_id);
        helperPage.waitAndclickElementUsingJS(SaveButton);

        //helperPage.actionMoveAndClick(SaveButton);
        //helperPage.actionMoveAndClick(SaveButton);
        //WebElement Button = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave")));
        //act.doubleClick(Button).perform();
        //actionMoveAndClick

    }
























    //public void getweak


























}
