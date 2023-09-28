package com.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {

	private static HelperClass helperClass;
	private static WebDriver driver;
	public static WebDriverWait wait;
	private static int TIMEOUT = 10;

	HelperClass() {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpdriver() {
		if (helperClass == null) {
			helperClass = new HelperClass();
		}
	}

	public static void tearDown() {
		if (driver != null) {
//			driver.close();
//			driver.quit();

		}
		helperClass = null;
	}
}
