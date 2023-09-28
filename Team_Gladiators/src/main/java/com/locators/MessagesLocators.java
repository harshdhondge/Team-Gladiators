package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagesLocators {
	
	@FindBy(xpath = "//a[@id='messages-link']")
		public WebElement meassages;

	@FindBy(xpath = "//div[contains(text(),'New message')]")
		public WebElement newMessage;

 
	@FindBy(xpath = "//*[@class='form-control text-left custom-select w-100']")
		public WebElement sendTo;

	@FindBy(partialLinkText  = "User")
		public WebElement user;

	@FindBy(xpath = "//div[@style='position: relative;']/child::input")
		public WebElement whom;

	@FindBy(xpath = "//input[@type='text']")
		public WebElement subject;

	@FindBy(xpath = "//html-field[@formcontrolname='body']/div/div/following-sibling::div")
		public WebElement messageBody;

	@FindBy(xpath = "//button[@type='button']/span")
		public WebElement send;

	@FindBy(xpath = "//label[contains(text(),'Inbox')]")
		public WebElement inbox;

	@FindBy(xpath = "//label[contains(text(),'Sent')]")
		public WebElement sent;

	@FindBy(xpath = "//label[contains(text(),'Trash')]")
		public WebElement trash;

	@FindBy(partialLinkText = "Annitah Akankwat")
		public WebElement annitahAkankwat;
}
