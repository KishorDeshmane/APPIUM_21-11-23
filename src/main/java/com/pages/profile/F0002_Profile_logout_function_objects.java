package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0002_Profile_logout_function_objects {
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
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Logout\"]/android.widget.TextView")
	private WebElement logout_button_in_pop_up;

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public F0002_Profile_logout_function_objects(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public boolean logout_button_in_pop_up_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, logout_button_in_pop_up);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, logout_button_in_pop_up);
		}
		return logout_button_in_pop_up.isDisplayed();
	}

	public void logout_button_in_pop_up_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, logout_button_in_pop_up);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, logout_button_in_pop_up);
		}
		 logout_button_in_pop_up.click();
	}

	
	

}
