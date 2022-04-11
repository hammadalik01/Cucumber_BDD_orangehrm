package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JobPage {
    WebDriver driver;
    public HelperPage helperPage;

    public JobPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }

    //Define Element

    By Admin_Menu_id = By.id("menu_admin_viewAdminModule");
    By Job_menu_id = By.id("menu_admin_Job");
    By job_Title = By.id("menu_admin_viewJobTitleList");
    By Success_Message_CssSelector = By.cssSelector("div[class*='message success fadable']");

    //Delete Record

    By coFounder_xpath = By.xpath("//a[text()='Co Founder']//parent::td[@class='left']//preceding-sibling::td[1]//input[@name='chkSelectRow[]']");
    By founder_xpath = By.xpath("//a[text()='Founder']//parent::td[@class='left']//preceding-sibling::td[1]//input[@name='chkSelectRow[]']");
    By Coordinator_xpath = By.xpath("//a[text()='Coordinator']//parent::td[@class='left']//preceding-sibling::td[1]//input[@name='chkSelectRow[]']");
    By Delete_Button_id = By.id("btnDelete");
    By Delete_Dialogue_id = By.id("dialogDeleteBtn");



    //Define function
    public void userHoverOnAdmin() throws Exception {

        WebElement Admin = driver.findElement(Admin_Menu_id);
        helperPage.actionMoveAndHover(Admin);


        //Admin = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Admin_Menu_id));
        //Actions act = new Actions(driver);
        //act.moveToElement(Admin).build().perform();

    }


    public void userGoToJobMenuPage(){

        WebElement Admin;
        Admin = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Admin_Menu_id));
        Actions act = new Actions(driver);
        act.moveToElement(Admin).build().perform();

    }

    public void userClickToJobMenuPage(){

        // Click on job
        WebElement job = driver.findElement(Job_menu_id);
        helperPage.WaitUntilWebElementIsVisible(job);
        job.click();

        //job = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Job_menu_id));
        //job.click();

    }

    public void userGoToAddJobTitlePage(){

        // Click on Job Title
        WebElement JobTitles = driver.findElement(job_Title);
        helperPage.WaitUntilWebElementIsVisible(JobTitles);
        JobTitles.click();

        //JobTitles = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_admin_viewJobTitleList")));
        //JobTitles.click();

        //Click on Add Job button
    }



    public String SuccessFullMessageOnAddRecord(){
        WebElement MessageSucc  = driver.findElement(Success_Message_CssSelector);
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;
    }



    //For Delete All Job Records
    public void selectAllRecordWhichNeedToDelete(){
        driver.findElement(coFounder_xpath).click();
        driver.findElement(founder_xpath).click();
        driver.findElement(Coordinator_xpath).click();
    }

    public void deleteAllRecord(){
        driver.findElement(Delete_Button_id).click();
        driver.findElement(Delete_Dialogue_id).click();
    }


    public String successFullMessageOnDeleteRecord(){

        WebElement DeletedMessageSucc = driver.findElement(Success_Message_CssSelector);
        helperPage.WaitUntilWebElementIsVisible(DeletedMessageSucc);
        String ActualDeleteSuccessFull_message =  DeletedMessageSucc.getText();
        System.out.println(ActualDeleteSuccessFull_message);
        return ActualDeleteSuccessFull_message;
    }
























}
