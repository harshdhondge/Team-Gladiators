package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v114.page.Page;
import org.openqa.selenium.support.PageFactory;

import com.locators.ManageContactsLocators;
import com.utils.HelperClass;

public class ManageContactsActions {
	
	ManageContactsLocators managecontactslocators = null;
	String inputText;
	
	public ManageContactsActions(){
		this.managecontactslocators =new ManageContactsLocators();
		PageFactory.initElements(HelperClass.getDriver(), managecontactslocators);
	}
	
	public void clickOnContacts() {
		managecontactslocators.contacts.click();
	}
	
	public void clickOnAddNewBtn() {
		managecontactslocators.addNewBtn.click();
	}
	
	public void searchContact(String inputText) {
		managecontactslocators.contactInput.clear();
		managecontactslocators.contactInput.sendKeys(inputText,Keys.ENTER);
		managecontactslocators.dropdown.click();
	}
	
	public void clickOnsubmit() {
		managecontactslocators.submitBtn.click();
	}
	
	public void clickOnItem() {
		managecontactslocators.item.click();
	}
	
	public void clickOnRemoveItem() {
		managecontactslocators.removeFromContact.click();
	}
	
	public String getAddToContactText() {
		String addToContact =managecontactslocators.addTocontactText.getText();
		return addToContact;
	}
	
	public void EnterInputText() {
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

		inputText = prop.getProperty("inputtext");


		// fill username
		this.searchContact(inputText);


	}

}
