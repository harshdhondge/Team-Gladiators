package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageContactsLocators {
	
	@FindBy(xpath ="//div[text()=' Contacts ']")
	public WebElement contacts;
	
	@FindBy(xpath="//div[text()='Add new']")
	public WebElement addNewBtn;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	public WebElement contactInput;
	
	@FindBy(xpath = "//div[@role=\"listbox\"]/child::a[1]")
	public WebElement dropdown;
	
	@FindBy(xpath="//span[text()='Submit']")
	public WebElement submitBtn;
	
	@FindBy(xpath="//format-field-value[text()=' DRUKER Global OU [Private Trust Services Department] ']")
	public WebElement item;
	
	@FindBy(xpath="//*[text()='Remove from contacts']")
	public WebElement removeFromContact;
	
	@FindBy(xpath="//*[text()='Add to contacts']")
	public WebElement addTocontactText;
	
	

}
