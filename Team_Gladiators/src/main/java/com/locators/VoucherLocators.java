package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VoucherLocators {

	
	@FindBy(xpath = "//div[text()='Marketplace']")
	public WebElement marketplace;
	
	@FindBy(xpath = "//div[text()='My vouchers']")
	public WebElement myVouchers;
	
	@FindBy(xpath = "//div[text()='Buy vouchers']")
	public WebElement buyVouchers;
	
	@FindBy(xpath = "//a[text()=' Gift voucher ']")
	public WebElement giftVoucher;
	
	@FindBy(xpath = "//div[@class='label-value-container']/following::input[@type='number']")
	public WebElement noOfVouchers;
	
	@FindBy(xpath = "//div[@class='label-value-container']/following::input[@type='tel']")
	public WebElement amount;
	
	@FindBy(xpath = "//label[@for='id_11_true']")
	public WebElement Usage;
	
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement nextButton;
	
	@FindBy(xpath = "//span[text()='Confirm']")
	public WebElement confirmButton;
	
	@FindBy(xpath = "//div[text()='Print']")
	public WebElement printButton;
	
}
