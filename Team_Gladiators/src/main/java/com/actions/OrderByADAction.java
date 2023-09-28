package com.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.OrderByADLoc;
import com.utils.HelperClass;

public class OrderByADAction {

	OrderByADLoc orderByADLoc = null;
	public OrderByADAction() {
		this.orderByADLoc = new OrderByADLoc();
		PageFactory.initElements(HelperClass.getDriver(), orderByADLoc);
	}
	public void businessDirectory() {
	
	WebElement wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(orderByADLoc.businessDirectory));
	((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", wait);
	Actions act =  new Actions(HelperClass.getDriver());
	act.moveToElement(orderByADLoc.businessDirectory).click().perform();
}

public void orderby() {
	orderByADLoc.orderByElement.click();
}
public void asec() {
	orderByADLoc.ascElement.sendKeys(Keys.ENTER);
}
}
