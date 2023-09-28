package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
features = "C:\\Users\\psugandhi\\Documents\\GitHub\\Team-Gladiators\\Team_Gladiators\\src\\test\\resources\\feature\\Messaging.feature",
glue = "com.stepdefination",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class runner {

}
