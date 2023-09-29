package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageLocators {
	
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;

	@FindBy(xpath = "//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary\"]")
	public WebElement submit;
	

}
