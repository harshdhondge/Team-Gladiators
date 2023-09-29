package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.locators.MultiplePhonesLocators;
import com.locators.UpdateProfileLocators;
import com.utils.HelperClass;

public class MultiplePhonesActions {

	MultiplePhonesLocators multiplephonelocators = null;
	String mobileName,mobileNum;

	public MultiplePhonesActions() {
		this.multiplephonelocators = new MultiplePhonesLocators();
		PageFactory.initElements(HelperClass.getDriver(), multiplephonelocators);
	}


	public void clickProfile() {
		multiplephonelocators.profile.click();
	}

	public void clickOnEditBtn() {
		multiplephonelocators.editBtn.click();
	}

	public void removeThisPhone() {
		multiplephonelocators.removeThisPhoneBtn.click();
	}
	
	public void clickOnAddMobileBtn() {
		multiplephonelocators.addmobilephoneBtn.click();
	}

	public void setmobilePhoneName(String mobileName) {
		multiplephonelocators.mobilePhoneName.click();
		multiplephonelocators.mobilePhoneName.sendKeys(mobileName);
	}

	public void setmobilePhoneNumber(String mobileNum) {
		multiplephonelocators.phoneNumber.click();
		multiplephonelocators.phoneNumber.sendKeys(mobileNum);

	}
	public void clickOnSave() {
		multiplephonelocators.saveBtn.click();
	}
	
	public void addMobileNameNum() {
		File file = new File(
				"src\\test\\resources\\AlInputData.properties");
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

		mobileName = prop.getProperty("mobilename");
		mobileNum = prop.getProperty("mobilenum");


		// fill username
		this.setmobilePhoneName(mobileName);
		this.setmobilePhoneNumber(mobileNum);


	}


}
