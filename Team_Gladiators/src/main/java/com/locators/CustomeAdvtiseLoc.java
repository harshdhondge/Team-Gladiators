package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomeAdvtiseLoc {

	@FindBy(xpath = "//div[text()=\"Advertisement interests\"]")
	public static WebElement adInteresElement;

	@FindBy(xpath = "//div[text()=\"Add new\"]")
	public static WebElement addElement;

	@FindBy(xpath = "//input[@type=\"text\"]")
	public static WebElement namElement;
	@FindBy(xpath = "//input[@type=\"text\"]/following::input[1]")
	public static WebElement keywordElement;
	@FindBy(xpath = "//button[@class=\"btn btn-icon\"]")
	public static WebElement addbtnElement;
	@FindBy(xpath = "//div[text()='Advertisement']")
	public static WebElement typElement;
	@FindBy(xpath = "//div[@role=\"listbox\"]/child::a[1]")
	public static WebElement all;
	@FindBy(xpath = "//input[@placeholder=\"Type to search\"]")
	public static WebElement byElement;
	@FindBy(xpath = "//button[@class=\"form-control text-left custom-select w-100\"]/following::button[2]")
	public static WebElement categoryElement;
	@FindBy(xpath = "//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::input[4]")
	public static WebElement minElement;
	@FindBy(xpath = "//div[@class=\"title-text flex-grow-1 d-flex align-items-center\"]/following::input[5]")
	public static WebElement maxElement;
	@FindBy(xpath = "//span[text()=\"Submit\"]")
	public static WebElement submitElement;

}
