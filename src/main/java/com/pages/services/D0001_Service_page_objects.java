package com.pages.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class D0001_Service_page_objects {
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
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Services\"]/android.view.ViewGroup")
	private WebElement services_page_button_in_blue;

	
	
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
	
	public D0001_Service_page_objects(AndroidDriver driver) {
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

	public boolean services_page_button_in_blue_is_displayed(){
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, services_page_button_in_blue);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, services_page_button_in_blue);
		}
		return services_page_button_in_blue.isDisplayed();
	}
	

	

	
	
}
