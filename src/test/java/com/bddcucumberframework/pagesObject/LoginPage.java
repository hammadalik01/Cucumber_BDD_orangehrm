package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    public HelperPage helperpage;

    public LoginPage(WebDriver driver){

        this.driver = driver;
        this.helperpage = new HelperPage(driver);


    }

    By userName = By.id("txtUsername");
    By password = By.id("txtPassword");
    By LoginBtn = By.id("btnLogin");
    By EmptyMessage_xpath = By.xpath("//span[@id='spanMessage']");
    By passwordField_id = By.id("txtPassword");

    //DashBoard



    public String GetTitleOfLoginPage(){
        return driver.getTitle();

    }

    public void loginUsername(String usernameText){
       driver.findElement(userName).clear();
       driver.findElement(userName).sendKeys(usernameText);
    }

    public void enterUsernameAndPassword(String invalidusername, String invalidpassword){
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(invalidusername);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(invalidpassword);

    }

    public void clickOnLoginButton() throws InterruptedException {
        WebElement LoginButton = driver.findElement(LoginBtn);
        helperpage.waitAndClickElement(LoginButton);
    }

    public String getEmptyMessage(){
        return driver.findElement(EmptyMessage_xpath).getText();
    }

    public void enterPassword(String passwordText){
        driver.findElement(passwordField_id).clear();
        driver.findElement(passwordField_id).sendKeys(passwordText);

    }



















}
