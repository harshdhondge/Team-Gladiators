package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentRequestLocators {

	@FindBy(xpath = "//div[text()='Payment requests']")
	public WebElement paymentRequests;
	
	@FindBy(xpath = "//div[text()='Send a new request']")
	public WebElement sendNewRequest;
	
	@FindBy(xpath = "//input[@placeholder=\"Type to search\"]")
	public WebElement receiver;
	
	
	@FindBy(xpath = "//textarea[@rows=\"3\"]")
	public WebElement description;
	
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement amount;
	
	@FindBy(xpath = "//input[@type=\"date\"]")
	public WebElement expirationDate;
	
	@FindBy(xpath = "//button[@aria-haspopup='true']")
	public WebElement schedulingDropdown;
	
	
	@FindBy(xpath = "//a[text()=' Monthly installments ']")
	public WebElement monthlyInstallments;
	
	
	@FindBy(xpath = "//input[@type=\"number\"]")
	public WebElement noOfInstallments;
	
	
	@FindBy(xpath = "//span[text()='First installment is immediate']")
	public WebElement firstInstallmentIsImmediate;
	
	@FindBy(xpath = "//span[text()='Confirm']")
	public WebElement confirmButton;
	
	@FindBy(xpath = "//a[text()=' Akash ']")
	public WebElement akash;
	
	@FindBy(xpath = "//div[text()='Are you sure to send this payment request?']")
	public WebElement confirmText;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement popupConfirmText;
}
