package com.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.DashboardLocators;
import com.utils.HelperClass;

public class DashboardActions {
	WebElement wait;
	DashboardLocators dashboardLocators = null;
	Actions action = new Actions(HelperClass.getDriver());
	
	public DashboardActions() {
		this.dashboardLocators = new DashboardLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), dashboardLocators);
	}
	
	public void getHomePageText() {
		System.out.println(dashboardLocators.dashBoard.getText());
	}
	
	public void navigatesViewOption() {
		Actions action = new Actions(HelperClass.getDriver());
		action.moveToElement(dashboardLocators.view).perform();
		
	}
	
	public void clkViewOption() {
		dashboardLocators.view.click();
	}
	
	public void accountBalance() {
		wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(dashboardLocators.accountBalance));
		System.out.println(dashboardLocators.accountBalance.getText());
	}
	
	public void navigatesBankingOption() {
		action.moveToElement(dashboardLocators.banking).perform();
	}
	
	public void clkBankingOption() {
	    HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    dashboardLocators.banking.click();
	}
	
	public void clkMessagesOption() {		
		 JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
		 js.executeScript("arguments[0].click();", dashboardLocators.meassages);
	}
	
}
