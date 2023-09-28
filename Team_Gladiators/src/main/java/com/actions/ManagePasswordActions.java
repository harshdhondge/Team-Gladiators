package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.locators.ManagePasswordLocators;
import com.utils.HelperClass;

public class ManagePasswordActions {
	ManagePasswordLocators managepasslocators = null;
	String oldPass,newPass,confPass;

	public ManagePasswordActions() {
		this.managepasslocators = new ManagePasswordLocators();
		PageFactory.initElements(HelperClass.getDriver(), managepasslocators);
	}

	public void clickPasswordBtn() {
		managepasslocators.password.click();
	}

	public void clickOnChangeBtn() {
		managepasslocators.changePassword.click();
	}

	public void setOldPassword(String oldPass) {
		managepasslocators.oldPassword.sendKeys(oldPass);
	}

	public void setNewPassword(String newPass) {
		managepasslocators.newPassword.sendKeys(newPass);
	}

	public void setConfirmPassword(String confPass) {
		managepasslocators.passwordConfirmation.sendKeys(confPass);
	}

	public void clickOnSubmit() {
		managepasslocators.submitBtn.click();
	}
	
	public void changePass() {
		File file = new File(
				"C:\\SelfStudy\\Java\\Training\\Eclipse_practice\\Pilot_Project\\Team-Gladiators\\Team_Gladiators\\src\\test\\resources\\AlInputData.properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// properties object for accessing the propertie file elements
		Properties prop = new Properties();

		// for loading properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		oldPass = prop.getProperty("old_password");
		newPass = prop.getProperty("new_password");
		confPass = prop.getProperty("confirm_password");

		// fill username
		this.setOldPassword(oldPass);
		this.setNewPassword(newPass);
		this.setConfirmPassword(confPass);

	}

}