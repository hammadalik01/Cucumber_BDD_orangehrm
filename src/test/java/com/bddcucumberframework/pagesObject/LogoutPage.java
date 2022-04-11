package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
    WebDriver driver;
    public HelperPage helperPage;

    public LogoutPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    //Define Element

    By WelcomeMenuText = By.id("welcome");
    By LogoutLinkText = By.linkText("Logout");




    //Define Function

    public void userGotoLogoutLink() throws InterruptedException {

        Thread.sleep(2000);

        WebElement welcome_Option = driver.findElement(WelcomeMenuText);
        helperPage.WaitUntilWebElementIsVisible(welcome_Option);
        welcome_Option.click();
        driver.findElement(LogoutLinkText).click();

    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }







}
