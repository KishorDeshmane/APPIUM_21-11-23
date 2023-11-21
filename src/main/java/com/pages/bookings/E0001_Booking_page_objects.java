package com.pages.bookings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class E0001_Booking_page_objects {
	public AndroidDriver driver;
	
/**
 * 
 * 
 * 
 * 
 */
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Bookings\"]/android.view.ViewGroup")
	private WebElement bookings_button_in_blue;
	
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
	
	public E0001_Booking_page_objects(AndroidDriver driver) {
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
	
	public boolean bookings_button_in_blue_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, bookings_button_in_blue);
		} catch (Exception e) {	
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, bookings_button_in_blue);
		}	
		return bookings_button_in_blue.isDisplayed();
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

}
