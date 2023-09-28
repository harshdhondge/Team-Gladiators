package com.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.locators.RecurringPaymentsLocators;
import com.utils.HelperClass;

public class RecurringPaymentsActions {

	RecurringPaymentsLocators recurringPaymentsLocators = null;
	String date;
	String occurances;
	String processEverynumber;
	public RecurringPaymentsActions() {
		super();
		this.recurringPaymentsLocators = new RecurringPaymentsLocators();
		
		PageFactory.initElements(HelperClass.getDriver(), recurringPaymentsLocators);
	}

	
	public void clickSchedulingDropdown() {
		recurringPaymentsLocators.schedulingDropdown.click();
		recurringPaymentsLocators.recurringPayments.click();
	}
	
	public void clickFutureDate() {
		recurringPaymentsLocators.futureDate.click();
	}
	
	public void selectFirstOccuranceDate(String date) {
		recurringPaymentsLocators.firstOccuranceDate.sendKeys(date);
	}
	
	public void manuallyCancelled() {
		
		recurringPaymentsLocators.manuallyCancelled.click();
		
		JavascriptExecutor jse = (JavascriptExecutor)HelperClass.getDriver();
		jse.executeScript("window.scrollBy(0,500)");
	}
	
//	public void setNumberOfOccurances(String occurances) throws InterruptedException {
////		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5));
////		wait.until(ExpectedConditions.elementToBeClickable(recurringPaymentsLocators.numberOfOccurances));
//		
////		Actions action = new Actions(HelperClass.getDriver());
////		Thread.sleep(3000);
////		action.click(recurringPaymentsLocators.numberOfOccurances).sendKeys(occurances).perform();
////		Thread.sleep(3000);
//		recurringPaymentsLocators.numberOfOccurances.sendKeys(occurances);
//	}
	public void processEveryDropdown() {
		recurringPaymentsLocators.processEveryDropdown.click();
		recurringPaymentsLocators.processEveryDropdownWeek.click();
	}
	
	public void processEveryNumberEnter(String processEverynumber) {
		recurringPaymentsLocators.processEvery.sendKeys(processEverynumber);
	}
	
	public void clickNextBTN() {
		recurringPaymentsLocators.nextBTN.click();
	}
	public void clickConfirmBTN() {
		recurringPaymentsLocators.confirmBTN.click();
	}
	
	public void clickCrossPopup() {
		recurringPaymentsLocators.crossPopup.click();
	}
}
