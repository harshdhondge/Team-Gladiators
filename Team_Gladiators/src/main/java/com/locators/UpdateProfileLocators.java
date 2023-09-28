package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileLocators {
	
	@FindBy(xpath="//*[@id=\"profile-link\"]")
	public WebElement profile;
	
	@FindBy(xpath="//*[text()='Edit']")
    public WebElement editBtn;
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement email;
	
	@FindBy(xpath="//*[text()='Save']")
	public WebElement saveBtn;
	
	
	

}
