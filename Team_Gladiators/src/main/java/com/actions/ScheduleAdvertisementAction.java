package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.LoginPageLoctaors;
import com.locators.ScheduleAdvertisementLoc;
import com.utils.HelperClass;

public class ScheduleAdvertisementAction {
	ScheduleAdvertisementLoc scheduleAdvertisementLoc = null;
	String name, price, date1, date2, desc;
	public ScheduleAdvertisementAction(){
		this.scheduleAdvertisementLoc = new ScheduleAdvertisementLoc();
		PageFactory.initElements(HelperClass.getDriver(), scheduleAdvertisementLoc);
	}

	public void GotoAd() {
		
		WebElement myElement = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(scheduleAdvertisementLoc.myAd));
		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", myElement);
		Actions act =  new Actions(HelperClass.getDriver());
		act.moveToElement(scheduleAdvertisementLoc.myAd).click().perform();

	}
	
	public void AddNewBtn() {
		scheduleAdvertisementLoc.AddNew.click();
	}
	
	public void newAd(String name, String price,String date1,String date2,String desc) {
		scheduleAdvertisementLoc.nameElement.sendKeys(name);
		scheduleAdvertisementLoc.categoryElement.click();
		scheduleAdvertisementLoc.childElement.click();
		scheduleAdvertisementLoc.priceElement.sendKeys(price);
		scheduleAdvertisementLoc.date1.sendKeys(date1);
		scheduleAdvertisementLoc.date2.sendKeys(date2);
		scheduleAdvertisementLoc.desc.sendKeys(desc);
		//Thread.sleep(5000);
	}
	
	public void ScheduleAd()  {
		File file = new File("C:\\Users\\hdhondge\\eclipse-workspace\\Team_Gladiators\\src\\test\\resources\\data3.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		name = prop.getProperty("nameEle");
		price = prop.getProperty("price");
		date1 = prop.getProperty("date1");
		date2 = prop.getProperty("date2");
		desc = prop.getProperty("desc");
		
		this.newAd(name, price, date1, date2, desc);
		
		scheduleAdvertisementLoc.submitbtn.click();


	}

}
