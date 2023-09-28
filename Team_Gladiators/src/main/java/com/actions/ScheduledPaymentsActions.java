package com.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.ScheduledPaymentsLocators;
import com.utils.HelperClass;

public class ScheduledPaymentsActions {

//	public String text;
	public ScheduledPaymentsLocators scheduledPaymentsLocators = null;

	public ScheduledPaymentsActions() {
		super();
		this.scheduledPaymentsLocators = new ScheduledPaymentsLocators();
		PageFactory.initElements(HelperClass.getDriver(), scheduledPaymentsLocators);
	}

	public void clickBanking() {
		scheduledPaymentsLocators.banking.click();
	}

	public void clickScheduledPayments() {
		scheduledPaymentsLocators.scheduledPayments.click();
	}

	public void selectStatus() {

		scheduledPaymentsLocators.status.click();
		scheduledPaymentsLocators.status_scheduled.click();
	}

	public void selectFirstResult() {
		scheduledPaymentsLocators.firstResult.click();
	}

	public String getTextOfFirstResult() {
		String text = scheduledPaymentsLocators.firstResultText.getText();
		System.out.println(">>>>>"+text);
		return text;
	}

}
