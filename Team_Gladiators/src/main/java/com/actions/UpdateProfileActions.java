package com.actions;

import org.openqa.selenium.support.PageFactory;

import com.locators.UpdateProfileLocators;
import com.utils.HelperClass;

public class UpdateProfileActions {
	UpdateProfileLocators updateprofilelocators = null;
	String updatedemail;

	public UpdateProfileActions() {
		this.updateprofilelocators = new UpdateProfileLocators();
		PageFactory.initElements(HelperClass.getDriver(), updateprofilelocators);
	}

	public void clickProfile() {
		updateprofilelocators.profile.click();
	}

	public void clickOnEditBtn() {
		updateprofilelocators.editBtn.click();
	}

	public void updateEmail(String email) {
//		WebElement select = updateprofilelocators.email;
//		select.click().click().click();
		updateprofilelocators.email.clear();
		updateprofilelocators.email.sendKeys(email);
	}

	public void clickOnSave() {
		updateprofilelocators.saveBtn.click();
	}

}
