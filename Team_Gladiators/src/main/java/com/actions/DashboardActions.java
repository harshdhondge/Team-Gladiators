package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.DashboardLocators;
import com.utils.HelperClass;

public class DashboardActions {

	DashboardLocators dashboardLocators = null;

	public DashboardActions() {
		super();
		this.dashboardLocators = new DashboardLocators();
		PageFactory.initElements(HelperClass.getDriver(), dashboardLocators);
	}
	
	public void clickPayUser() {
		dashboardLocators.payUser.click();
	}
	
}
