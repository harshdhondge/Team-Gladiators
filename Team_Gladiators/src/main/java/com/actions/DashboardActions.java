package com.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.DashboardLocators;
import com.utils.HelperClass;

public class DashboardActions {
	WebDriver wait;
	DashboardLocators dashboardLocators = null;
	Actions action = new Actions(HelperClass.getDriver());

	public DashboardActions() {
		super();
		this.dashboardLocators = new DashboardLocators();
		PageFactory.initElements(HelperClass.getDriver(), dashboardLocators);
	}
	
	public void clickPayUser() {
		dashboardLocators.payUser.click();
	}
	
	public void getHomePageText() {
		System.out.println(dashboardLocators.dashBoard.getText());
	}

	public void navigatesViewOption() {
		Actions action = new Actions(HelperClass.getDriver());
		action.moveToElement(dashboardLocators.view).perform();
	}

	public void navigatesBankingOption() {
		action.moveToElement(dashboardLocators.banking).perform();
	}
	
	public void clkViewOption() {
		dashboardLocators.view.click();
	}

	public void accountBalance() throws InterruptedException {
//		wait = (WebDriver) new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(dashboardLocators.accountBalance));
		Thread.sleep(2000);
		System.out.println(dashboardLocators.accountBalance.getText());
	}
	
	public void clkBankingOption() {
	    HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    dashboardLocators.banking.click();
	}
}