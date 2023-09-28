package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryBrowsingLoc {
	
	@FindBy(linkText =  "Advertisements")
	public static WebElement Advertisements;
	
	@FindBy(xpath = "//a[text()=' Food ']")
	public static WebElement keyElement;
	
	@FindBy(xpath = "//div[text()= \" 10,00 IU's \"]")
	public static WebElement food;
	
	@FindBy(xpath = "//div[@class= \"title-text flex-grow-1 d-flex align-items-center\"]")
	public static WebElement AssertFood;
}
