package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecurringPaymentsLocators {

	@FindBy(xpath = "//button[@aria-haspopup='true']")
	public WebElement schedulingDropdown;
	
	@FindBy(xpath = "//a[text()=' Recurring payments ']")
	public WebElement recurringPayments;
	
	@FindBy(xpath = "//label[text()=' Future date ']")
	public WebElement futureDate;
	
	@FindBy(xpath = "//input[@type=\"date\"]")
	public WebElement firstOccuranceDate;
	
	@FindBy(xpath = "//label[text()=' Manually canceled ']")
	public WebElement manuallyCancelled;
	


//	@FindBy(id = "id_141")
//	public WebElement numberOfOccurances;
	
	@FindBy(xpath = "//button[@title=\"Months\"]")
	public WebElement processEveryDropdown;
	
	@FindBy(xpath = "//a[text()=' Weeks ']")
	public WebElement processEveryDropdownWeek;
	
	@FindBy(xpath = "//input[@formcontrolname=\"amount\"]")
	public WebElement processEvery;
	
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement nextBTN;
	
	
	@FindBy(xpath = "//span[text()='Confirm']")
	public WebElement confirmBTN;
	
	@FindBy(xpath = "//span[@class=\"visually-hidden\"]")
	public WebElement crossPopup;
}
