package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomSearchLoc {
	
	@FindBy(linkText =  "Advertisements")
	public static WebElement advtisElement;
	
	@FindBy(xpath = "//div[text()='Show more filters']")
	public static WebElement filterElement;

	@FindBy(xpath = "//input[@type=\"text\"]")
	public static WebElement keywordElement;
	@FindBy(xpath = "//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::input[4]")
	public static WebElement minElement;
	@FindBy(xpath = "//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::input[5]")
	public static WebElement maxElement;
	@FindBy(xpath = "//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::input[6]")
	public static WebElement begindatElement;
	@FindBy(xpath = "//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::input[7]")
	public static WebElement endDateeElement;
	@FindBy(xpath = "//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::button[3]")
	public static WebElement showADElement;	

}
