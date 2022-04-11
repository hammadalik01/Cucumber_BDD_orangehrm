package com.bddcucumberframework.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\java\\features\\",
glue ="com.bddcucumberframework.stepDefinations",monochrome=true
,plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/rerun.txt"}

)

//,dryRun = true
//,plugin= {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/rerun.txt"}


public class TestNGtestRunner extends AbstractTestNGCucumberTests{

	//@Override
	//@DataProvider(parallel=true)
	//public Object[][] scenarios(){
		//return super.scenarios();
	//}
	
}