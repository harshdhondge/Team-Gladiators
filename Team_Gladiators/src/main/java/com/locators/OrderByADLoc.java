package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderByADLoc {
	@FindBy(linkText =  "Business directory")
	public static WebElement businessDirectory;
	
	@FindBy(xpath = "//div[@class= \"w-100 mw-100 text-truncate pr-3\"]")
	public static WebElement orderByElement;
	
	@FindBy(xpath = "//a[text()=' Name (A-Z) ']")
	public static WebElement ascElement;
}
