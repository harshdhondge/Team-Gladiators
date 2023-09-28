package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardLocators {
	
	@FindBy(xpath = "/html/body/ui-root/div[1]/div/dashboard/page-layout/div/div/div/div/quick-access/page-content/div/div[2]/div/div/div[1]/a/div[1]")
	public WebElement payUser;

}
