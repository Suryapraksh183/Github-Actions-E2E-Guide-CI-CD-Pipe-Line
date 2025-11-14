package org.google.home.pageObjects;

import org.google.home.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	String currentUrl;

	By txtHomePageValidation = By.xpath("//div[text()='Google']");	
		
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public static String prepareXPathString(String xpath, String value) {
		return String.format(xpath, value);
	}

	public String getHomePageTitle() {
		String actualPageTitle = SeleniumHelper.getPageTitle(driver).trim();
		return actualPageTitle;
	}

	public String  getCurrentPageTitle() {
		return SeleniumHelper.getPageTitle(driver);
	}

	
}
