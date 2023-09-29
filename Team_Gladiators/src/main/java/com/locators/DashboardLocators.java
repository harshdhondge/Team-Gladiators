package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardLocators {
	
	@FindBy(xpath = "/html/body/ui-root/div[1]/div/dashboard/page-layout/div/div/div/div/quick-access/page-content/div/div[2]/div/div/div[1]/a/div[1]")
	public WebElement payUser;
	
	@FindBy(xpath = "//div[@class='personal-label']") 
	public WebElement dashBoard;

	@FindBy(xpath = "//body[1]/ui-root[1]/div[1]/div[1]/dashboard[1]/page-layout[1]/div[1]/div[1]/div[1]/div[1]/account-status[1]/page-content[1]/div[1]/div[1]/heading-actions[1]/div[1]/heading-action-button[1]/button[1]/div[1]")
	public WebElement view;

	@FindBy(xpath = "//div[@class='balance']/div[2]")
	public WebElement accountBalance;

	@FindBy(xpath = "//div[@class='menu-container']/menus/a[2]/div")
	public WebElement banking;

//	@FindBy(xpath = "//div[contains(text(),'Download')]")
//	public WebElement printAllHistory;
//
//	@FindBy(xpath = "//div[contains(text(),'Show filters')]")
//	public WebElement showFilters;
//
//	@FindBy(xpath = "//input[@placeholder='Type to search']")
//	public WebElement searchByUser;
//
//	@FindBy(xpath = "//input[@id='id_69']")
//	public WebElement searchByDescription;
//
//	@FindBy(xpath = "//a[contains(text(),'Aakash Gaikwad')]")
//	public WebElement clkAnyTransanction;
//
//	@FindBy(partialLinkText = "Abdul-wadud Alhass")
//	public WebElement clkAnyTransaction2;
//
//	@FindBy(partialLinkText = "Abcs")
//	public WebElement clkAnyTransaction3;
//
//	@FindBy(xpath = "//tbody/tr[14]/td[3]/a[1]")
//	public WebElement clkAnyTransaction4;
//
//	@FindBy(xpath = "//div[contains(text(),'Print')]")
//		public WebElement print;
//
//	@FindBy(xpath ="//div[contains(text(),'Aakash Gaikwad')]")
//		public WebElement validatesTransaction;
//
//	@FindBy(xpath = "//div[contains(text(),'PDF')]")
//		public WebElement pdf;

	@FindBy(xpath = "//a[contains(text(),'Annitah Akankwatsa')]")
		public WebElement annitah;

	@FindBy(xpath = "//a[@id='messages-link']")
		public WebElement messages;
}
