package com.locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.HelperClass;

public class PaymentToUserLocators {
	
	@FindBy(xpath = "//input[@placeholder='Type to search']")
	public WebElement toUser;
	
	
	@FindBy(xpath = "//input[@placeholder=\"0,00\"]")
	public WebElement amount;
	
	
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement next;
	
	
	@FindBy(xpath = "//span[text()='Confirm']")
	public WebElement confirm;
	
//	@FindBy(xpath = "//div[text()='You have exceeded the maximum of payments per day for the demo network']")
//	public WebElement popup;
	
	@FindBy(xpath = "//span[@class=\"visually-hidden\"]")
	public WebElement crossPopup1;
	
	@FindBy(xpath = "//a[@class=\"select-option autocomplete-option-0\"]")
	public WebElement misterX;
	
	@FindBy(xpath = "//textarea[@id='id_7']")
	public WebElement description;
	
	
//	Alert alert = HelperClass.getDriver().switchTo().alert(); // switch to alert
//
//	public String alertMessage= HelperClass.getDriver().switchTo().alert().getText(); // capture alert message
}
