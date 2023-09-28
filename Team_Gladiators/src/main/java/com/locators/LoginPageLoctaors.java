package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLoctaors {
	//Scenario1
	
	@FindBy(xpath = "//input[@type='text']")
	public static WebElement userLog;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement passLog;
	
	@FindBy(xpath =  "/html/body/ui-root/div/div/login/page-layout/div/div/page-content/div/div[2]/form/action-button/button")
	public static WebElement SubmitBtn;
	

}
