package com.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.locators.MessagesLocators;
import com.utils.HelperClass;

public class MessagesActions {
	WebElement wait;
	MessagesLocators messagesLocators = null;
	Actions action = new Actions(HelperClass.getDriver());
	
	public MessagesActions() {
		this.messagesLocators = new MessagesLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), messagesLocators);
	}

	public void clkMessagesOption() {		
		 JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
		 js.executeScript("arguments[0].click();", messagesLocators.meassages);
	}
		
	public void clkNewMessageOption() {		
		 JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
		 js.executeScript("arguments[0].click();", messagesLocators.newMessage);
	}
	
	public void selectSendTo() {
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.sendTo));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.click(messagesLocators.sendTo).perform();
		action.click(messagesLocators.user).perform();
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.user));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void toWhom(String toWhom) throws InterruptedException {
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.whom));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.click(messagesLocators.whom).sendKeys(toWhom).perform();
		action.click(messagesLocators.annitahAkankwat).perform();
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.annitahAkankwat));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void setSubject(String strSubject) throws InterruptedException {
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf((homePageLocators.subject)));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.click(messagesLocators.subject).perform();
		action.click(messagesLocators.subject).sendKeys(strSubject);
 }
	public void messageToBeSend(String msg) throws InterruptedException {
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.messageBody));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.click(messagesLocators.messageBody).sendKeys(msg).perform();
	}
	
	public void clkSend() throws InterruptedException {
		action.click(messagesLocators.send).perform();
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.send));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void inbox() throws InterruptedException {
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.inbox));		
		messagesLocators.inbox.click();
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void sent() throws InterruptedException {
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.sent));
		messagesLocators.sent.click();
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void trash() throws InterruptedException  {
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.trash));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		messagesLocators.trash.click();
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void sendRichMessage() throws InterruptedException {
		this.selectSendTo();
		this.toWhom("anni");
		this.setSubject("Request for leave");
		this.messageToBeSend("I want to have a leave on Saturday");
		this.clkSend();
	}
	
	public void inboxSentTrash() throws InterruptedException {
		this.inbox();
		this.sent();
		this.trash();
	}
}
