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

import com.locators.CustomSearchLoc;
import com.utils.HelperClass;

public class CustomSearchAction {

	CustomSearchLoc customSearchLoc = null;
	String keyword, min, max, begindate, enddate;
	public CustomSearchAction() {
		this.customSearchLoc = new CustomSearchLoc();
		PageFactory.initElements(HelperClass.getDriver(), customSearchLoc);
	}
	public void advtise() {
		WebElement myElement = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(customSearchLoc.advtisElement));
		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", myElement);
		Actions act =  new Actions(HelperClass.getDriver());
		act.moveToElement(customSearchLoc.advtisElement).click().perform();		
	}
	
	public void filters() throws InterruptedException {
		Thread.sleep(2000);
		customSearchLoc.filterElement.click();
	}
	
	public void key(String keyword, String minEle, String maxEle, String beginDate, String endDate) {
		customSearchLoc.keywordElement.sendKeys("keyword");
		customSearchLoc.minElement.sendKeys("minEle");
		customSearchLoc.maxElement.sendKeys("maxEle");
		customSearchLoc.begindatElement.sendKeys("beginDate");
		customSearchLoc.endDateeElement.sendKeys("endDate");
		
	}
	
	
	public void customSearch()  {
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
		keyword = prop.getProperty("keyword");
		min = prop.getProperty("minEle");
		max = prop.getProperty("maxEle");
		begindate = prop.getProperty("beginDate");
		enddate = prop.getProperty("endDate");
		
		this.key(keyword, min, max, begindate, enddate);;;
		
		customSearchLoc.showADElement.click();

	}
}
