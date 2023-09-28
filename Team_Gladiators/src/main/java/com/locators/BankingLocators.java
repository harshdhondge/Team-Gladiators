package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankingLocators {
	
	@FindBy(xpath = "//div[@class='menu-container']/menus/a[2]/div")
	public WebElement banking;
	
	@FindBy(xpath = "//div[contains(text(),'Download')]")
	public WebElement printAllHistory;

	@FindBy(xpath = "//div[contains(text(),'Show filters')]")
		public WebElement showFilters;

	@FindBy(xpath = "//input[@placeholder='Type to search']")
		public WebElement searchByUser;

	@FindBy(xpath = "//input[@id='id_69']")
		public WebElement searchByDescription;

	@FindBy(xpath = "//a[contains(text(),'Aakash Gaikwad')]")
		public WebElement clkAnyTransanction;

	@FindBy(partialLinkText = "Abdul-wadud Alhass")
		public WebElement clkAnyTransaction2;

	@FindBy(partialLinkText = "Abcs")
		public WebElement clkAnyTransaction3;

	@FindBy(xpath = "//tbody/tr[14]/td[3]/a[1]")
		public WebElement clkAnyTransaction4;

	@FindBy(xpath = "//div[contains(text(),'Print')]")
		public WebElement print;

	@FindBy(xpath ="//div[contains(text(),'Aakash Gaikwad')]")
		public WebElement validatesTransaction;

	@FindBy(xpath = "//div[contains(text(),'PDF')]")
		public WebElement pdf;

	@FindBy(xpath = "//a[contains(text(),'Annitah Akankwatsa')]")
		public WebElement annitah;
}
