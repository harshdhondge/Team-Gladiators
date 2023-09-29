package com.actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
	
}
