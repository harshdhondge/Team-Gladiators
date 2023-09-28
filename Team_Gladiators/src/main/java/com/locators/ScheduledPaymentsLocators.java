package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScheduledPaymentsLocators {
	
	
	
	@FindBy(xpath = "//div[text()='Banking']")
	public WebElement banking;
	

	@FindBy(xpath = "//div[text()='Scheduled payments']")
	public WebElement scheduledPayments;
	
	@FindBy(xpath = "//div[text()='More filters']")
	public WebElement moreFilters;
	
	@FindBy(xpath = "//button[@aria-haspopup=\"true\"]")
	public WebElement status;
	
	@FindBy(xpath = "//a[text()=' Scheduled ']")
	public WebElement status_scheduled;
	
	@FindBy(xpath = "//a[text()=' External payment test ']")
	public WebElement firstResult;
	
	@FindBy(xpath = "//div[text()=' Recurring payment details ']")
	public WebElement firstResultText;
	
	@FindBy(xpath = "//button[@id='id_9']")
	public WebElement direction;
	
	@FindBy(xpath = "//a[@id=\"id_9_debit\"]")
	public WebElement outgoing_direction;
	
	@FindBy(xpath = "//input[@id=\"id_124\"]")
	public WebElement transactionNumber;
	
	@FindBy(xpath = "//input[@id=\"id_126\"]")
	public WebElement beginDate;
	
	@FindBy(xpath = "//input[@id=\"id_127\"]")
	public WebElement endDate;
	
	@FindBy(xpath = "//input[@placeholder=\"Type to search\"]")
	public WebElement user1;
	
	@FindBy(xpath = "//button[@id='id_129']")
	public WebElement orderBy;
}
