package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    WebDriver driver;
    public HelperPage helperpage;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        this.helperpage = new HelperPage(driver);
    }

    By Dashboard_Xpath= By.xpath("//h1[normalize-space()='Dashboard']");
    By Admin_id = By.id("menu_admin_viewAdminModule");
    By MenuAdminUserManagement_id = By.id("menu_admin_UserManagement");
    By User_id = By.id("menu_admin_viewSystemUsers");
    By UserSystemHeadingXpath = By.xpath("//h1[contains(text(),'System Users')]");

    //String ActualHeaderText = driver.findElement(By.xpath("//h1[contains(text(),'System Users')]")).getText();


    public String getCurrentUrl(){
        String CurrentURL = helperpage.getCurrentURL();
        return CurrentURL;
    }

    public String DashboardHeading(){
        String DashboardText = driver.findElement(Dashboard_Xpath).getText();
        return DashboardText;
    }

    public void userGotoUserSystemPage() throws Exception {

        //Thread.sleep(5000);
        //Hover on Admin
        WebElement Admin = driver.findElement(Admin_id);
        helperpage.actionMoveAndHover(Admin);
        //hover on UserManagement
        WebElement UserManagement = driver.findElement(MenuAdminUserManagement_id);
        helperpage.actionMoveAndHover(UserManagement);
        //Click on User
        WebElement User = driver.findElement(User_id);
        helperpage.actionMoveAndClick(User);

    }

    public String getActualHeadingText(){


        String ActualHeaderText = driver.findElement(UserSystemHeadingXpath).getText();
        return ActualHeaderText;


    }





}
