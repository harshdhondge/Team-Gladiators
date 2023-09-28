package com.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.locators.PaymentRequestLocators;
import com.utils.HelperClass;

public class PaymentRequestActions {

	
	PaymentRequestLocators paymentRequestLocators = null;
	String receiver;
	String amount;
	String expirationDate;
	String NumberOfInstallments;
//	public static String text;
	public PaymentRequestActions() {
		super();
		this.paymentRequestLocators = new PaymentRequestLocators();
		PageFactory.initElements(HelperClass.getDriver(), paymentRequestLocators);
	}
	
	public void clickPaymentRequest() {
		paymentRequestLocators.paymentRequests.click();
	}
	
	public void clickSendNewRequest() {
		paymentRequestLocators.sendNewRequest.click();
	}
	
	public void sendReceiverAndDescription(String receiver, String description) {
		paymentRequestLocators.receiver.sendKeys(receiver);
		Actions actions = new Actions(HelperClass.getDriver());
		actions.click(paymentRequestLocators.akash).perform();
		paymentRequestLocators.description.sendKeys(description);
	}
	
	public void enterAmountandExpirationDate(String amount, String expirationDate) {
		paymentRequestLocators.amount.sendKeys(amount);
		paymentRequestLocators.expirationDate.sendKeys(expirationDate);
	}
	
	public void selectScheduling() {
		paymentRequestLocators.schedulingDropdown.click();
		paymentRequestLocators.monthlyInstallments.click();
	}
	
	public void enterNoOfInstallmentandCheckBox(String NumberOfInstallments) {
		paymentRequestLocators.noOfInstallments.sendKeys(NumberOfInstallments);
		paymentRequestLocators.firstInstallmentIsImmediate.click();
	}
	
	public void clickConfirm() {
		paymentRequestLocators.confirmButton.click();
	}
	public String getConfirmText() {
		return paymentRequestLocators.confirmText.getText();
	}
	public void popupConfirmButton() {
//		String text= paymentRequestLocators.popupConfirmText.getText();
//		System.out.println(text);
//		  return text;
		paymentRequestLocators.popupConfirmText.click();
	}
}
