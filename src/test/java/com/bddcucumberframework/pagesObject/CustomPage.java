package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomPage{
    WebDriver driver;
    public HelperPage helperPage;


    public CustomPage(WebDriver driver){
        this.driver = driver;
        this.helperPage = new HelperPage(driver);
    }


    By PIM_menu = By.id("menu_pim_viewPimModule");
    By PIM_Configuration = By.id("menu_pim_Configuration");
    By customFields = By.id("menu_pim_listCustomFields");
    By Add_Btn_id = By.id("buttonAdd");
    By BtnSave_id = By.id("btnSave");
    By Required_Xpath = By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='customFieldAddPane']/div[2]/form[1]/fieldset[1]/ol[1]/li[1]/span[1]");
    By customFieldName = By.xpath("//input[@id='customField_name']");
    By customFieldScreen = By.xpath("//select[@id='customField_screen']");
    By customFieldType = By.id("customField_type");
    By SuccessAddMessage = By.cssSelector("div[class*='message success fadable']");
    By ExtraCustomFieldData = By.xpath("//input[@id='customField_extra_data']");
    By FirstCustomField_xpath = By.xpath("//a[contains(text(),'First Custom Field')]");
    By checkbox_xpath = By.xpath("//a[text()='First Custom FieldEdit']//parent::td[@class='fieldName']//preceding-sibling::td[@class='check']//input[@type='checkbox']");
    By removeButton_id = By.id("buttonRemove");
    By cancelButton = By.xpath("//parent::div[@id='deleteConfModal']//parent::div[@class='modal-footer']//input[@type='button' and @value='Cancel']");
    By DeleteButton = By.id("dialogDeleteBtn");




    public void hoverOnPimMenuAndConfiguration() throws Exception {
        // Hover on PIM
        WebElement PIM = driver.findElement(PIM_menu);
        helperPage.actionMoveAndHover(PIM);

        WebElement Configuration = driver.findElement(PIM_Configuration);
        helperPage.actionMoveAndHover(Configuration);

    }

    public void clickOnCustomFieldMenu() throws Exception {
        //Click on custom Field
        WebElement CustomField = driver.findElement(customFields);
        helperPage.actionMoveAndClick(CustomField);
    }

    public void clickOnAddButton(){

        WebElement ButtonAdd = driver.findElement(Add_Btn_id);
        ButtonAdd.click();

    }

    public void ClickOnSaveButton(){

        driver.findElement(BtnSave_id).click();

    }

    public String getRequiredValidationMessage(){

        String ActualValidation= driver.findElement(Required_Xpath).getText();
        return ActualValidation;

    }


    public void AddDataIntoCustomFieldForm(){

        //Add Custom Field
        driver.findElement(customFieldName).sendKeys("First Custom Field");

        //Select the screen
        Select screen = new Select(driver.findElement(customFieldScreen));
        screen.selectByVisibleText("Contact Details");

        //Select the type
        Select type = new Select(driver.findElement(customFieldType));
        type.selectByVisibleText("Text or Number");
    }

    public String getSuccessFullMessage(){


        WebElement SuccessFullMessage = driver.findElement(SuccessAddMessage);
        helperPage.WaitUntilWebElementIsVisible(SuccessFullMessage);
        String ActualAddCustomFieldSuccessFull_message =  SuccessFullMessage.getText();
        //System.out.println(ActualAddCustomFieldSuccessFull_message);
        return ActualAddCustomFieldSuccessFull_message;

    }

    public void EditCustomField(){

        //Edit Custom Field
        driver.findElement(FirstCustomField_xpath).click();

        driver.findElement(customFieldName).click();
        driver.findElement(customFieldName).sendKeys("Edit");

        Select screentype = new Select(driver.findElement(customFieldScreen));
        screentype.selectByVisibleText("Dependents");

        Select CustomFieldType = new Select(driver.findElement(customFieldType));
        CustomFieldType.selectByVisibleText("Drop Down");

        driver.findElement(ExtraCustomFieldData).sendKeys("OK , Set , Done");

    }

    public void SelectRecordAndDeleteIt(){

        //Delete Custom Field
        WebElement checkboxDelete = driver.findElement(checkbox_xpath);
        helperPage.WaitUntilWebElementIsVisible(checkboxDelete);
        checkboxDelete.click();
        driver.findElement(removeButton_id).click();
        //Click n Cancel Button
        driver.findElement(cancelButton).click();
        //Click on Ok Button
        driver.findElement(removeButton_id).click();
        driver.findElement(DeleteButton).click();
    }


}
