package utils;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GerericUtlis {
	
	public WebDriver driver;
	
	public GerericUtlis(WebDriver driver) {		
		this.driver = driver;				
	}
	

	public String getSuccessfullMessage(){

		WebElement MessageSucc = new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='message success fadable']")));
		//String ExpectedSuccessFull_message ="Successfully Saved";
		String ActualSuccessFull_message =  MessageSucc.getText();
		return ActualSuccessFull_message;

	}
	

}
