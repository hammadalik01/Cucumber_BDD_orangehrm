package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeePersonalDetailPage {
    WebDriver driver;
    public HelperPage helperPage;

    public EmployeePersonalDetailPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    //Define Element

    By Edit_Button_Xpath = By.xpath("//input[@id='btnSave']");
    By FirstName_id = By.id("personal_txtEmpFirstName");
    By LastName_id = By.id("personal_txtEmpLastName");
    By Other_id = By.id("personal_txtOtherID");
    By SSNTxtNumber_id = By.id("personal_txtNICNo");
    By gender_id = By.id("personal_optGender_1");
    By Marital_Status = By.id("personal_cmbMarital");
    By Nationality_id = By.id("personal_cmbNation");
    By DateOfBirth_id = By.xpath("//input[@id='personal_DOB']");
    By SuccessFullMsg_cssSelector = By.cssSelector("div[class*='message success fadable']");
    By customEditButton = By.id("btnEditCustom");
    By custom_name = By.name("custom1");
    By AddBtnAttachment_id = By.id("btnAddAttachment");
    By uploadFile_id = By.id("ufile");
    By attachDescription = By.id("txtAttDesc");
    By SaveBtnAttachment = By.id("btnSaveAttachment");
    By ProfilePic_xpath = By.xpath("//img[@id='empPic']");
    By photo_id = By.id("photofile");
    By SaveButton_id = By.id("btnSave");











    //Define function

    public void userClickOnEditButtonForUpdateForm(){

        driver.findElement(Edit_Button_Xpath).click();

    }


    public void employeePersonalDetailsEdit(){
        driver.findElement(FirstName_id).sendKeys(Keys.BACK_SPACE);
        driver.findElement(FirstName_id).sendKeys("Edit");
        driver.findElement(LastName_id).sendKeys(Keys.BACK_SPACE);
        driver.findElement(LastName_id).sendKeys("Edit");
        driver.findElement(Other_id).sendKeys("10");
        WebElement ssnNumber = driver.findElement(SSNTxtNumber_id);
        ssnNumber.clear();
        ssnNumber.sendKeys("12345689");

        //WebElement SinNumber = driver.findElement(By.id(OR.getProperty("sinNumber_id")));
        //SinNumber.clear();
        //SinNumber.sendKeys("122334455");

        driver.findElement(gender_id).click();
        Select MaritalStatus = new Select(driver.findElement(Marital_Status));
        MaritalStatus.selectByVisibleText("Single");
        Select Nationality = new Select(driver.findElement(Nationality_id));
        Nationality.selectByVisibleText("Pakistani");

        WebElement PersonalDateOfBirth = driver.findElement(DateOfBirth_id);
        PersonalDateOfBirth.clear();
        PersonalDateOfBirth.sendKeys("1992-04-16");

    }

    public String editEmployeePersonalInformationSuccessfully(){

        //WebElement MessageSucc = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='message success fadable']")));
        WebElement MessageSucc = driver.findElement(SuccessFullMsg_cssSelector);
        helperPage.WaitUntilWebElementIsVisible(MessageSucc);
        String ActualSuccessFull_message =  MessageSucc.getText();
        return ActualSuccessFull_message;
    }


    public void userEditCustomField(){

        driver.findElement(customEditButton).click();
        Select BloodType = new Select(driver.findElement(custom_name));
        BloodType.selectByVisibleText("A+");
        driver.findElement(customEditButton).click();

    }

    public String userCustomFieldEditMessageShow(){

       WebElement MessageSuccCustomField= driver.findElement(SuccessFullMsg_cssSelector);
        helperPage.WaitUntilWebElementIsVisible(MessageSuccCustomField);
        String ActualSuccessFull_message_CustomField =  MessageSuccCustomField.getText();
        return ActualSuccessFull_message_CustomField;

    }



    public void userUploadFile(){
        driver.findElement(AddBtnAttachment_id).click();
        WebElement uploadElement = driver.findElement(uploadFile_id);
        //D:\Cucumber_project
        uploadElement.sendKeys(System.getProperty("user.dir") + "\\images\\1.png");
        driver.findElement(attachDescription).sendKeys("For Testing Purpose");
        driver.findElement(SaveBtnAttachment).click();
    }

    public String successFullMessageOnUploadFile(){

         WebElement MessageSucc = driver.findElement(SuccessFullMsg_cssSelector);
         helperPage.WaitUntilWebElementIsVisible(MessageSucc);
         String ActualSuccessFull_message =  MessageSucc.getText();
         return ActualSuccessFull_message;
    }

    //Upload Image

    public void uploadProfilePicture(){

        driver.findElement(ProfilePic_xpath).click();
        WebElement EmployPic=driver.findElement(photo_id);
        EmployPic.sendKeys(System.getProperty("user.dir") + "\\images\\profile.jpg");
        driver.findElement(SaveButton_id).click();

    }

    public String successFullMessageAfterUpload(){

        WebElement uploadProfilePictureMsg = driver.findElement(SuccessFullMsg_cssSelector);
        helperPage.WaitUntilWebElementIsVisible(uploadProfilePictureMsg);
        String UploadActualSuccessFull_message =  uploadProfilePictureMsg.getText();
        return UploadActualSuccessFull_message;

        //System.out.println(UploadActualSuccessFull_message);

    }















}
