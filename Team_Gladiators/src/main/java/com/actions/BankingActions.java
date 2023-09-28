package com.actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.BankingLocators;
import com.utils.HelperClass;

public class BankingActions {
	WebElement wait;
	BankingLocators bankingLocators = null;
	Actions action = new Actions(HelperClass.getDriver());
	String byUser, byDescription;
	
	public BankingActions() {
		this.bankingLocators = new BankingLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), bankingLocators);
	}
	
	public void clkBankingOption() {
	    HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    bankingLocators.banking.click();
	}
	
	public void validatesAllTransactionHistory() {
		System.out.println("------------- From/To -----------------");
		System.out.println(bankingLocators.clkAnyTransaction2.getText());
		System.out.println(bankingLocators.clkAnyTransaction3.getText());
		System.out.println(bankingLocators.clkAnyTransaction3.getText());
		System.out.println("The All Transactions has been variefied");
	}
	
	public void printAllHistory() throws InterruptedException {
		Thread.sleep(3000);
		action.click(bankingLocators.printAllHistory).perform();
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.printAllHistory));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.click(bankingLocators.pdf).perform();
		Thread.sleep(4000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.pdf));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void viewPerticularTransaction() throws InterruptedException {
		Thread.sleep(3000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.clkAnyTransanction));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.click(bankingLocators.clkAnyTransanction).perform();
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.validatesTransaction));
	    Thread.sleep(3000);
	}
	
	public void validatesTransaction() {
		System.out.println(bankingLocators.validatesTransaction.getText());
		System.out.println("The Perticular transaction has been varified");
	}
	
	public void print() throws InterruptedException {
		action.click(bankingLocators.print).perform();
		Thread.sleep(3000);
	}
	
	public void showFilterOption() {
		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(bankingLocators.showFilters));
		bankingLocators.showFilters.click();
		
	}
	
	public void setUser(String byUser) {
		bankingLocators.searchByUser.sendKeys(byUser);
		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(bankingLocators.searchByUser));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		action.click(bankingLocators.annitah).perform();
//		Thread.sleep(2000);
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.annitah));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	public void setDescription(String byDescription) throws InterruptedException {
//		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(homePageLocators.searchByDescription));
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		bankingLocators.searchByDescription.sendKeys(byDescription, Keys.ENTER);
	}
	
	public void searchByUserOption() throws InterruptedException {
		this.setUser("Annitah");
	}
	
	public void searchByDescription() throws InterruptedException {
		this.setDescription("abcd");
	}
	

}
