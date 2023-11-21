package com.pages.packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class C0001_Package_page_objects {
public AndroidDriver driver;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Packages\"]/android.view.ViewGroup")
	private WebElement packages_page_button_in_blue;

	

	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public C0001_Package_page_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public boolean packages_page_button_in_blue_is_displayed(){
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, packages_page_button_in_blue);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, packages_page_button_in_blue);
		}
		return packages_page_button_in_blue.isDisplayed();
	}
	

	
	
}
