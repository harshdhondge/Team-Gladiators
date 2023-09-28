package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.locators.RegistrationFormLocators;
import com.utils.HelperClass;

public class RegistrationFormActions {
	RegistrationFormLocators registrationFormlocators = null;
	String firstName, loginName, email, loginPass, confPass, orgName, orgWeb, address, city, country, contactPhone;
	private static final Logger log = LogManager.getLogger(RegistrationFormActions.class);
	public RegistrationFormActions() {
		super();
		this.registrationFormlocators = new RegistrationFormLocators();
		PageFactory.initElements(HelperClass.getDriver(), registrationFormlocators);
	}

	public void EnterData(String firstName, String loginName, String email, String loginPass, String confPass,
			String orgName, String orgWeb, String address, String city) {
		registrationFormlocators.fullName.sendKeys(firstName);
		registrationFormlocators.loginName.sendKeys(loginName);
		registrationFormlocators.email.sendKeys(email);
		registrationFormlocators.loginPass.sendKeys(loginPass);
		registrationFormlocators.confPass.sendKeys(confPass);
		registrationFormlocators.orgName.sendKeys(orgName);
		registrationFormlocators.orgWeb.sendKeys(orgWeb);
		registrationFormlocators.address.sendKeys(address);
		registrationFormlocators.city.sendKeys(city);
		log.info("------------------------the Enter data is passed1 -------------------------");
		
		
	}

	public void SelectCountry(String country) {
		registrationFormlocators.country.sendKeys(country,Keys.ENTER);
		log.info("------------------------SelectCountry is passed1 -------------------------");


	}

	public void enterContact(String contactPhone) {
		registrationFormlocators.contactPhone.sendKeys(contactPhone);
		log.info("------------------------enterContact is passed-------------------------");

	}

	public void clickOnterms() {
		registrationFormlocators.Terms.click();
		log.info("------------------------clickOnterms is passed -------------------------");

	}

	public String finishRegistrationText() {
		String str = registrationFormlocators.FinishRegistrationText.getText();
		log.info("------------------------finishRegistrationText is passed -------------------------");

		return str;
		
	}

	public void register() {
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

		firstName = prop.getProperty("full_name");
		loginName = prop.getProperty("login_name");
		email = prop.getProperty("email");
		loginPass = prop.getProperty("loginpass");
		confPass = prop.getProperty("confirmpass");
		orgName = prop.getProperty("orgname");
		orgWeb = prop.getProperty("orgweb");
		address = prop.getProperty("address");
		city = prop.getProperty("city");
		country = prop.getProperty("country");
		contactPhone = prop.getProperty("contactphone");

		// fill username
		this.EnterData(firstName, loginName, email, loginPass, confPass, orgName, orgWeb, address, city);
		this.SelectCountry(country);
		this.enterContact(contactPhone);
		this.clickOnterms();
	}

}
