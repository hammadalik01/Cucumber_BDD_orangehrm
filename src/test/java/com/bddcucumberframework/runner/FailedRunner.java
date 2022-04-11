package com.bddcucumberframework.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/rerun.txt",
glue ="com.bddcucumberframework.stepDefinations",
monochrome=true,
plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
})

public class FailedRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)	
	public Object[][] scenarios(){
		return super.scenarios();		
	}	
	
}