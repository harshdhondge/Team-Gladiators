package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScheduleAdvertisementLoc {
	//scenario 1
	
	@FindBy(linkText =  "My advertisements")
	public static WebElement myAd;
	
	@FindBy(xpath = "//*[@class=\"bi bi-plus-circle\"]")
	public static WebElement AddNew;
	
	@FindBy(xpath = "//input[@type= 'text']")
	public static WebElement nameElement;
	@FindBy(xpath = "//button[@type= 'button']//following::button[4]")
	public static WebElement categoryElement;
	
	@FindBy(xpath = "//a[text()=' Childcare ']")
	public static WebElement childElement;
	
	@FindBy(xpath = "//input[@type=\"tel\"]")
	public static WebElement priceElement;
	
	@FindBy(xpath = "//input[@class= \"form-control flex-grow-1 ng-untouched ng-pristine ng-valid\"]")
	public static WebElement date1;
	@FindBy(xpath = "//input[@class= \"form-control flex-grow-1 ng-untouched ng-pristine ng-valid\"]/following::input")
	public static WebElement date2;
	@FindBy(xpath = "//div[@class=\"editor\"]")
	public static WebElement desc;
	@FindBy(xpath = "/html/body/ui-root/div[1]/div/edit-ad/page-layout/div/div[2]/page-content/div/div[2]/actions[2]/action-button[1]/button")
	public static WebElement submitbtn;
	

}
