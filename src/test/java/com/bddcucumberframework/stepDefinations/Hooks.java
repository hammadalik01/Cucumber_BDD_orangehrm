package com.bddcucumberframework.stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	//public Webdriver driver;
	public TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	
	@After
	public void AfterScenario() {
		testContextSetup.testBase.driver.quit();
	}
	
	@AfterStep
	public void screenshots(Scenario scerario) throws IOException {
		
		if (scerario.isFailed()) 
		
		{
			WebDriver driver = testContextSetup.testBase.driver;
			//Take Screen Shots
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(src);
			scerario.attach(fileContent, "image/png", "screenshot name");	
		}
		
		
		
	}
	
	
	

}
