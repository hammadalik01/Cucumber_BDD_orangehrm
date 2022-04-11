package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeeMemberShipPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeeMemberShipPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }



    //Define Element

    By MemberShip_xpath = By.xpath("(//a[contains(text(),'Memberships')])[2]");
    By btnAddMembershipDetail_id = By.id("btnAddMembershipDetail");
    By membership_id =By.id("membership_membership");
    By membership_subscriptionPaid_id =By.id("membership_subscriptionPaidBy");
    By membershipSubscriptionAmount_id= By.id("membership_subscriptionAmount");
    By membershipCurrency_id= By.id("membership_currency");
    By datePicker_cssSelector = By.cssSelector("img.ui-datepicker-trigger");
    By linktext6 = By.linkText("6");
    By frmEmpMembership_xpath =By.xpath("//form[@id='frmEmpMembership']/fieldset/ol/li[6]/img");
    By linkText13 = By.linkText("13");
    By frmEmpMembership2_xpath= By.xpath("//form[@id='frmEmpMembership']/fieldset/ol/li[5]");
    By saveMembershipBtn_id = By.id("btnSaveMembership");
    By successfulMsg_cssSelector = By.cssSelector("div[class*='message success fadable']");






    //Define function

    public void goToMemberShip(){

        driver.findElement(MemberShip_xpath).click();

    }

    public String getHeading(){

        WebElement sectionHeading = driver.findElement(By.cssSelector("div[id='listMembershipDetails'] h1"));
        return sectionHeading.getText();

    }


    public void addMemberShipRecord(){

        driver.findElement(btnAddMembershipDetail_id).click();
        WebElement MemberShip = driver.findElement(membership_id);
        Select MemberShipDropDown = new Select(MemberShip);
        MemberShipDropDown.selectByVisibleText("British Computer Society (BCS)");

        WebElement membership_subscriptionPaid =driver.findElement(membership_subscriptionPaid_id);
        Select membership_subscriptionPaidDropdown = new Select(membership_subscriptionPaid);
        membership_subscriptionPaidDropdown.selectByVisibleText("Company");

        driver.findElement(membershipSubscriptionAmount_id).click();
        driver.findElement(membershipSubscriptionAmount_id).clear();
        driver.findElement(membershipSubscriptionAmount_id).sendKeys("1000");
        driver.findElement(membershipCurrency_id).click();
        new Select(driver.findElement(membershipCurrency_id)).selectByVisibleText("Afghanistan Afghani");
        driver.findElement(datePicker_cssSelector).click();


        driver.findElement(linktext6).click();
        driver.findElement(frmEmpMembership_xpath).click();
        driver.findElement(linkText13).click();
        driver.findElement(frmEmpMembership2_xpath).click();
        driver.findElement(saveMembershipBtn_id).click();

    }

    public String getSuccessfulMessage(){

        WebElement MessageSucc = driver.findElement(successfulMsg_cssSelector);
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;


    }


















}
