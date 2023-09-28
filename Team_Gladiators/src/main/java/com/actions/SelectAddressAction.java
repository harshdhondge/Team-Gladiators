package com.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.locators.SelectAddressLoc;
import com.utils.HelperClass;

public class SelectAddressAction {
		SelectAddressLoc selectAddressLoc = null;
		
		public SelectAddressAction() {
			
			this.selectAddressLoc = new SelectAddressLoc();
			PageFactory.initElements(HelperClass.getDriver(), selectAddressLoc);
		}
		public void businessDir() {
		
		WebElement myElement = new WebDriverWait(HelperClass.getDriver(),Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(selectAddressLoc.businessDir));
		((JavascriptExecutor) HelperClass.getDriver()).executeScript("arguments[0].scrollIntoView();", myElement);
		Actions act =  new Actions(HelperClass.getDriver());
		act.moveToElement(selectAddressLoc.businessDir).click().perform();
		
		//marketPlaceLoc.businessDir.click();
		}
		public void ClickAD() {
			selectAddressLoc.clickAD.click();
		}
		public String address() {
			String str = selectAddressLoc.addressElement.getText();
			return str;
		}
		
}
