package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.bddcucumberframework.pagesObject.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;	
	public GerericUtlis gerericUtlis;
	public String dashboardmainHeading;
	public static String username;
	public String loginpageurl;


	
	
	
	
	
	public TestContextSetup() throws IOException {
	 testBase = new TestBase();
	 pageObjectManager = new PageObjectManager(testBase.webDriverManager());
	 gerericUtlis = new GerericUtlis(testBase.webDriverManager());
	 
	}
	

	
	
}
