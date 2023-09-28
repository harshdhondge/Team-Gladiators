package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Feature/MarketPlace.feature",
glue = "setDefination",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class runner {

}
