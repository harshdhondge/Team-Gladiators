package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.locators.LoginpageLocators;
import com.utils.HelperClass;

public class LoginpageAction {

	LoginpageLocators loginpageLocators = null;
	
String username, password;
	 

		public LoginpageAction() {
			super();
			this.loginpageLocators = new LoginpageLocators();
			PageFactory.initElements(HelperClass.getDriver(), loginpageLocators);
		}
		
		public void setUsername(String username)
		{
			loginpageLocators.username.sendKeys(username);
		}
		public void setPassword(String password)
		{
			loginpageLocators.password.sendKeys(password);
		}
		
		public void clickSubmit() {
			loginpageLocators.submit.click();
		}



		public void login() {

			File file = new File("src\\test\\resources\\loginData.properties");

	 

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
			username = prop.getProperty("username");
			password = prop.getProperty("password");

	 

			this.setUsername(username);
			this.setPassword(password);
			loginpageLocators.submit.click();
		}
}
