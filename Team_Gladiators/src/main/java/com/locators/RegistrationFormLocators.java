package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationFormLocators {

	@FindBy(name = "name")
	public WebElement fullName;

	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement loginName;

	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement email;

	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement loginPass;

	@FindBy(xpath = "//*[@id=\"confirmPassword\"]")
	public WebElement confPass;

	@FindBy(xpath = "//*[@id=\"organizationName\"]")
	public WebElement orgName;

	@FindBy(xpath = "//*[@id=\"organizationWebsite\"]")
	public WebElement orgWeb;

	@FindBy(xpath = "//*[@id=\"address\"]")
	public WebElement address;

	@FindBy(id = "city")
	public WebElement city;

	@FindBy(xpath = "//*[@id='country']")
	public WebElement country;

	@FindBy(name = "phone")
	public WebElement contactPhone;

	@FindBy(xpath = "//*[@id=\"agreeWithTerms1\"]")
	public WebElement Terms;

	@FindBy(xpath = "//*[@id=\"customer\"]/div[6]")
	public WebElement FinishRegistrationText;
}
