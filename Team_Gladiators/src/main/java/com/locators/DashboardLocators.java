package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardLocators {
	@FindBy(xpath = "//div[@class='personal-label']") ////div[contains(text(),'team_gladiator…')]
		public WebElement dashBoard;

    @FindBy(xpath = "//body[1]/ui-root[1]/div[1]/div[1]/dashboard[1]/page-layout[1]/div[1]/div[1]/div[1]/div[1]/account-status[1]/page-content[1]/div[1]/div[1]/heading-actions[1]/div[1]/heading-action-button[1]/button[1]/div[1]")
		public WebElement view;

    @FindBy(xpath = "//div[@class='balance']/div[2]")
		public WebElement accountBalance;

    @FindBy(xpath = "//div[@class='menu-container']/menus/a[2]/div")
		public WebElement banking;
    
    @FindBy(xpath = "//a[@id='messages-link']")
		public WebElement meassages;
}
