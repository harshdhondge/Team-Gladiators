package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class runner {

	@CucumberOptions(tags = "",
			features = "src\\test\\resources\\Features\\LoginFunctionality.feature",
			glue = "com.stepdefination",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
 

	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
 

	}

}