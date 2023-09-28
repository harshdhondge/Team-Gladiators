package com.runner;



import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Feature/loginDemo.feature",
glue = "setDefination",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class runner {

}
