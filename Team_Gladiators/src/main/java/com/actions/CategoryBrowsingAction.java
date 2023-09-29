package com.actions;

import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.locators.CategoryBrowsingLoc;
import com.utils.HelperClass;

public class CategoryBrowsingAction {
	CategoryBrowsingLoc categoryBrowsingLoc = null;
	
	public CategoryBrowsingAction() {
		this.categoryBrowsingLoc = new CategoryBrowsingLoc();
		PageFactory.initElements(HelperClass.getDriver(), categoryBrowsingLoc);
	}
	public void advtise() {
		WebElement wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(categoryBrowsingLoc.Advertisements));
		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", wait);
		Actions act =  new Actions(HelperClass.getDriver());
		act.moveToElement(categoryBrowsingLoc.Advertisements).click().perform();		
	}
	public void keywords() {
		categoryBrowsingLoc.keyElement.click();
	}
	public void Food() {
		categoryBrowsingLoc.food.click();
	}
//	public String assertStr() {
//	String str = categoryBrowsingLoc.AssertFood.getText();
//	return str;}
}
