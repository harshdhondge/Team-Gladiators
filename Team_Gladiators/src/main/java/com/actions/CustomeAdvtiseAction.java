package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.locators.CustomeAdvtiseLoc;
import com.utils.HelperClass;

public class CustomeAdvtiseAction {
	CustomeAdvtiseLoc customeAdvtiseLoc = null;
	String Books, min, max;
	 
	public CustomeAdvtiseAction() {
		this.customeAdvtiseLoc = new CustomeAdvtiseLoc();
		PageFactory.initElements(HelperClass.getDriver(), customeAdvtiseLoc);
	}

	public void myAdvtisement() {
		customeAdvtiseLoc.adInteresElement.click();
	}
	public void AddNew() {
		customeAdvtiseLoc.addElement.click();
	}
	public void data(String books, String min,String max) {
		customeAdvtiseLoc.namElement.sendKeys(books,Keys.ENTER);
		customeAdvtiseLoc.keywordElement.sendKeys(books);
		customeAdvtiseLoc.addbtnElement.click();
		customeAdvtiseLoc.typElement.click();
		customeAdvtiseLoc.all.click();
		
		customeAdvtiseLoc.byElement.sendKeys(books,Keys.ENTER);
		customeAdvtiseLoc.categoryElement.click();
		customeAdvtiseLoc.minElement.sendKeys(min,Keys.ENTER);
		customeAdvtiseLoc.maxElement.sendKeys(max);
		
	}
	
	public void customeAdv() {
		File file = new File("src\\test\\resources\\data3.properties");
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
		Books = prop.getProperty("NameElement");
		min = prop.getProperty("min");
		max = prop.getProperty("max");
		
		this.data(Books, min, max);
		customeAdvtiseLoc.submitElement.click();

	}

}
