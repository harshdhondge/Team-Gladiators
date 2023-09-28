package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagePasswordLocators {
	
	@FindBy(xpath ="//div[text()='Password']")
	public WebElement password;
	
	@FindBy(xpath="//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::button[1]")
	public WebElement changePassword;
	
	@FindBy(xpath="//div[@class='mb-3']/following::input[1]")
	public WebElement oldPassword;

	@FindBy(xpath="//div[@class='mb-3']/following::input[2]")
	public WebElement newPassword;
	
	@FindBy(xpath="//div[@class='mb-3']/following::input[3]")
	public WebElement passwordConfirmation;
	
	@FindBy(xpath="//span[text()='Submit']")
	public WebElement submitBtn;
}
