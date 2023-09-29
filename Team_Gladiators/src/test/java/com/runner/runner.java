package com.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 

public class runner {

 

	@CucumberOptions(tags = "", 
			features = "src\\test\\resources\\feature", 
			glue = "com.stepdefination", 
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
//					plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//						plugin= {"pretty","junit:target/cucumber-reports/cucumber.xml","pretty","json:target/cucumber-reports/cucumber.json","pretty","html:target/cucumber-reports/cucumber.html"}
//						plugin= {"usage","junit:target/cucumber-reports/cucumberUsage.xml"}
//	)

 

	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

 

	}

 

}