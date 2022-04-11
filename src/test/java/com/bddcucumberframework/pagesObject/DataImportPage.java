package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataImportPage {

    WebDriver driver;
    public HelperPage helperpage;

    public DataImportPage(WebDriver driver){

        this.driver = driver;
        this.helperpage = new HelperPage(driver);

    }

    By ImportDataMenu_id = By.id("menu_admin_pimCsvImport");
    By ImportDataPageHeading = By.id("pimCsvImportHeading");
    By DownloadFileLink = By.xpath("//a[contains(text(),'Download')]");
    By FileButton = By.xpath("//input[@id='pimCsvImport_csvFile']");
    By SaveButton = By.id("btnSave");
    By RequiredMessage = By.xpath("//span[contains(text(),'Required')]");



    public void UserGoToImportDataPage(){

        WebElement DataImport = driver.findElement(ImportDataMenu_id);
        helperpage.WaitUntilWebElementIsVisible(DataImport);
        DataImport.click();


    }

    public String dataImportPageHeading(){

        String ActualDataImportHeading = driver.findElement(ImportDataPageHeading).getText();
        return ActualDataImportHeading;

    }

    public void downloadFileSuccessfully(){

        WebElement DownloadLink =  driver.findElement(DownloadFileLink);
        DownloadLink.click();

    }

    public void uploadFileInDataImportSection(){

        WebElement choseFileButton = driver.findElement(FileButton);
        helperpage.WaitUntilWebElementIsVisible(choseFileButton);
        choseFileButton.sendKeys(System.getProperty("user.id")+"\\images\\importData.csv");
        driver.findElement(SaveButton).click();
    }

    public void saveWithoutUploadFile(){

        driver.findElement(SaveButton).click();

    }

    public String getRequiredErrorMessage(){

        String ActualErrorMessage = driver.findElement(RequiredMessage).getText();
        return ActualErrorMessage;

    }







}
