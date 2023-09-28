package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.locators.LoginPageLoctaors;
import com.utils.HelperClass;

public class LoginPageAction {
	LoginPageLoctaors lPageLoctaors = null;
	String username, password;
	
	public LoginPageAction() {
		super();
		this.lPageLoctaors = new LoginPageLoctaors();
		PageFactory.initElements(HelperClass.getDriver(), lPageLoctaors);
	}
	public void setUserName(String username) {
		lPageLoctaors.userLog.sendKeys(username);
	}
	public void setPassword(String password) {
		lPageLoctaors.passLog.sendKeys(password);
	}

	
public void login() {
	File file = new File("C:\\Users\\hdhondge\\eclipse-workspace\\Team_Gladiators\\src\\test\\resources\\data3.properties");
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
	
	this.setUserName(username);
	this.setPassword(password);
	LoginPageLoctaors.SubmitBtn.click();

}



}


