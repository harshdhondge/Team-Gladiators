package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultiplePhonesLocators {
	
	@FindBy(xpath="//*[@id=\"profile-link\"]")
	public WebElement profile;
	
	@FindBy(xpath="//*[text()='Edit']")
    public WebElement editBtn;
	
	@FindBy(xpath="//span[text()='Add mobile phone']")
	public WebElement addmobilephoneBtn;
	
	@FindBy(xpath="//label[@class= 'label-value-label']/following::input[7]")
	public WebElement mobilePhoneName;
	
	@FindBy(xpath="//label[@class= 'label-value-label']/following::input[8]")
	public WebElement phoneNumber;
	
	@FindBy(xpath="//*[text()='Save']")
	public WebElement saveBtn;
	
	@FindBy(xpath="//label[@class= 'label-value-label']/following::button[7]")
	public WebElement removeThisPhoneBtn;

}
