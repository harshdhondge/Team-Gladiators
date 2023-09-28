package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectAddressLoc {
	@FindBy(linkText =  "Business directory")
	public static WebElement businessDir;
	@FindBy(xpath = "//format-field-value[text()=\" Samuel Pablo Almonacid \"]")
	public static WebElement clickAD;
	@FindBy(xpath = "//h2[@class=\"border-0\"]")
	public static WebElement addressElement;

}
