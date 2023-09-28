package com.actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.PaymentToUserLocators;
import com.utils.HelperClass;

public class PaymentToUserActions {

	PaymentToUserLocators paymentToUserLocators = null;
	String user;
	String amount;
	String description;
	public PaymentToUserActions() {
		super();
		this.paymentToUserLocators = new PaymentToUserLocators();
		PageFactory.initElements(HelperClass.getDriver(), paymentToUserLocators);
	}
	
	public void setToUser(String user) throws InterruptedException {
		paymentToUserLocators.toUser.sendKeys(user);
		Actions actions = new Actions(HelperClass.getDriver());
		actions.click(paymentToUserLocators.misterX).perform();
//		Thread.sleep(5);
//		paymentToUserLocators.misterX.click();
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Select dropdown = new Select(HelperClass.getDriver().findElement(By.xpath("//input[@placeholder='Type to search']")));
//
//		dropdown.selectByVisibleText("Mister X");
	}
	
	public void writeDescription(String description) {
		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(paymentToUserLocators.description));
		paymentToUserLocators.description.sendKeys(description);
	}
	
	public void setAmount(String amount) throws InterruptedException {
		
		paymentToUserLocators.amount.sendKeys(amount);
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//		Thread.sleep(5);
	}
	
	
	
	public void makePayment(String user, String Description, String amount) throws InterruptedException 
	{
		this.setToUser(user);
//		WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(paymentToUserLocators.amount));
//		Thread.sleep(5);
//		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		this.writeDescription(Description);
		this.setAmount(amount);
////		HelperClass.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//		Thread.sleep(5);
		paymentToUserLocators.next.click();
	}
	
	public void clickConfirm() {
		paymentToUserLocators.confirm.click();	
	}
	
//	public String getMSG()
//	{
////		Alert alert = HelperClass.getDriver().switchTo().alert(); // switch to alert
////
////		String alertMessage= HelperClass.getDriver().switchTo().alert().getText(); // capture alert message
////		System.out.println(paymentToUserLocators.popup.getText());
//		
//		String text1 = paymentToUserLocators.popup.getText();
//		System.out.println(">>>>>>>>"+text1);
//		return text1;
//	}
	public void clickPopup()
	{
		paymentToUserLocators.crossPopup1.click();
	}
	
}
