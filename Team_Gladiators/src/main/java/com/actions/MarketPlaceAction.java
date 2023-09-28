package com.actions;

import java.time.Duration;

import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.MQV;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.MarketPlaceLoc;
import com.utils.HelperClass;

public class MarketPlaceAction {
	WebDriver driver = null;
	MarketPlaceLoc marketPlaceLoc = null;
	public MarketPlaceAction() {
		this.marketPlaceLoc = new MarketPlaceLoc();
		PageFactory.initElements(HelperClass.getDriver(), marketPlaceLoc);
	}
	public void marketplacebtn() {
		
		marketPlaceLoc.marketplace.click();
	}
//	
//	public void GotoAd() {
//		
//		WebElement myElement = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(MarketPlaceLoc.businessDir));
//		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", myElement);
//		Actions act =  new Actions(HelperClass.getDriver());
//		act.moveToElement(marketPlaceLoc.businessDir).click().perform();
//
//	}
//	
//	public void AddNewBtn() {
//		marketPlaceLoc.AddNew.click();
//	}
//	
//	public void newAd() throws Exception {
//		marketPlaceLoc.nameElement.sendKeys("xyz");
//		Thread.sleep(2000);
//		marketPlaceLoc.categoryElement.click();
//		marketPlaceLoc.childElement.click();
//		marketPlaceLoc.priceElement.sendKeys("200");
//		marketPlaceLoc.date1.sendKeys("09/25/2023");
//		marketPlaceLoc.date2.sendKeys("09/25/2023");
//		marketPlaceLoc.desc.sendKeys("hello new product");
//		//Thread.sleep(5000);
//		marketPlaceLoc.submitbtn.click();
//	}
//s2
//	public void businessDir() {
//		
//		WebElement myElement = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(MarketPlaceLoc.businessDir));
//		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", myElement);
//		Actions act =  new Actions(HelperClass.getDriver());
//		act.moveToElement(marketPlaceLoc.businessDir).click().perform();
//		
//		//marketPlaceLoc.businessDir.click();
//	}
//	public void ClickAD() {
//		marketPlaceLoc.clickAD.click();
//	}
//	public String address() {
//		String str = marketPlaceLoc.addressElement.getText();
//		return str;
//	}
	
	//s3
	
//	public void advtise() {
//		WebElement myElement = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(MarketPlaceLoc.advtisElement));
//		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", myElement);
//		Actions act =  new Actions(HelperClass.getDriver());
//		act.moveToElement(marketPlaceLoc.advtisElement).click().perform();		
//	}
//	
//	public void filters() throws InterruptedException {
//		Thread.sleep(2000);
//		marketPlaceLoc.filterElement.click();
//	}
//	
//	public void keyword() {
//		marketPlaceLoc.keywordElement.sendKeys("Food");
//		marketPlaceLoc.minElement.sendKeys("10");
//		marketPlaceLoc.maxElement.sendKeys("1000");
//		marketPlaceLoc.begindatElement.sendKeys("09/3/2023");
//		marketPlaceLoc.endDateeElement.sendKeys("12/31/2023");
//		
//	}
//	public void showAd() {
//		marketPlaceLoc.showADElement.click();
//	}
	
//	public void advtise() {
//		WebElement wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(MarketPlaceLoc.Advertisements));
//		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", wait);
//		Actions act =  new Actions(HelperClass.getDriver());
//		act.moveToElement(marketPlaceLoc.Advertisements).click().perform();		
//	}
//	public void keywords() {
//		marketPlaceLoc.keyElement.click();
//	}
//	public void Food() {
//		marketPlaceLoc.food.click();
//	}
//	public String assertStr() {
//	String str = marketPlaceLoc.AssertFood.getText();
//	return str;}
	
	//s5
	
	//public void businessDirectory() {
//		
//		WebElement wait = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(MarketPlaceLoc.businessDirectory));
//		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", wait);
//		Actions act =  new Actions(HelperClass.getDriver());
//		act.moveToElement(marketPlaceLoc.businessDirectory).click().perform();
//	}
//	
//	public void orderby() {
//		marketPlaceLoc.orderByElement.click();
//	}
//	public void asec() {
//		marketPlaceLoc.ascElement.sendKeys(Keys.ENTER);
//	}
	
//}
	
	//s6
//	public void myAdvtisement() {
//		marketPlaceLoc.adInteresElement.click();
//		
//	}
//	public void AddNew() {
//		marketPlaceLoc.addElement.click();
//	}
//	public void data() {
//		marketPlaceLoc.namElement.sendKeys("Books",Keys.ENTER);
//		marketPlaceLoc.keywordElement.sendKeys("books");
//		marketPlaceLoc.addbtnElement.click();
//		marketPlaceLoc.typElement.click();
//		marketPlaceLoc.all.click();
//		
//		marketPlaceLoc.byElement.sendKeys("books",Keys.ENTER);
//		marketPlaceLoc.categoryElement.click();
//		marketPlaceLoc.minElement.sendKeys("10",Keys.ENTER);
//		marketPlaceLoc.maxElement.sendKeys("100");
//		
//	}
//	public void submit() {
//		marketPlaceLoc.submitElement.click();
//	}
//	
	
}
