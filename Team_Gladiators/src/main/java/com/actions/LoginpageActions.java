package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.locators.LoginpageLocators;
import com.utils.HelperClass;

public class LoginpageActions {
	
	LoginpageLocators loginpageLocators = null;
	String username, password;

	public LoginpageActions() {
		super();
		this.loginpageLocators = new LoginpageLocators();
		PageFactory.initElements(HelperClass.getDriver(), loginpageLocators);
	}
	public void clickSubmit() {
		loginpageLocators.submit.click();
	}
	public void setUsername(String username)
	{
		loginpageLocators.username.sendKeys(username);
	}
	public void setPassword(String Password)
	{
		loginpageLocators.password.sendKeys(Password);
	}
	
//	public void submit(String username, String password) 
//	{
//		this.setUsername(username);
//		this.setPassword(password);
//		loginpageLocators.submit.click();
////		Thread.sleep(10000);
//	}
	
	public void login() {
		
		File file = new File("C:\\Users\\dghate\\OneDrive - Expleo France\\Documents\\GitHub\\jenkins\\Team-Gladiators\\Team_Gladiators\\src\\test\\resources\\Features\\Data.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		username = prop.getProperty("Username");
		password = prop.getProperty("Password");

		this.setUsername(username);
		this.setPassword(password);
		loginpageLocators.submit.click();
	}

}
