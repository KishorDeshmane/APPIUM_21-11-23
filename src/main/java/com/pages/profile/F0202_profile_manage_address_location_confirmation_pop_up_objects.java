package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0202_profile_manage_address_location_confirmation_pop_up_objects {
public AndroidDriver driver;
	
	/**
	 * 
	 * Location comfimation pop up
	 * 
	 */
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	private WebElement location_confirmation_pop_up;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement x_button;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement location_access_is_required_text;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement subtitle_of_location_access_is_required_text;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"GIVE ACCESS\"]")
	private WebElement give_access_button;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"CANCEL\"]")
	private WebElement cancel_button;
	
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
	
	
	

	public F0202_profile_manage_address_location_confirmation_pop_up_objects(AndroidDriver driver) {
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
	 */

		public boolean location_confirmation_pop_up_is_displayed() {
			try {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, location_confirmation_pop_up);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, location_confirmation_pop_up);
			}
			return location_confirmation_pop_up.isDisplayed();
		}

		public boolean x_button_is_displayed() {
			try {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, x_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, x_button);
			}
			return x_button.isDisplayed();
		}
		
		public boolean x_button_is_clickable() {
			try {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, x_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, x_button);
			}
			return x_button.isEnabled();
		}
		
		public void x_button_is_clicked() {
			try {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, x_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, x_button);
			}
			 x_button.click();
		}

		public boolean location_access_is_required_text_is_displayed() {
			try {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, location_access_is_required_text);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, location_access_is_required_text);
			}
			return location_access_is_required_text.isDisplayed();
		}

		public boolean subtitle_of_location_access_is_required_text_is_displayed() {
			try {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, subtitle_of_location_access_is_required_text);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, subtitle_of_location_access_is_required_text);
			}
			return subtitle_of_location_access_is_required_text.isDisplayed();
		}

		public boolean give_access_button_is_displayed() {
			try {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, give_access_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, give_access_button);
			}
			return give_access_button.isDisplayed();
		}

		public boolean give_access_button_is_clickable() {
			try {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, give_access_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, give_access_button);
			}
			return give_access_button.isEnabled();
		}
		
		public void give_access_button_is_clicked() {
			try {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, give_access_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, give_access_button);
			}
			 give_access_button.click();
		}

		public boolean cancel_button_is_displayed() {
			try {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, cancel_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, cancel_button);
			}
			return cancel_button.isDisplayed();
		}

		public boolean cancel_button_is_clickable() {
			try {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, cancel_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, cancel_button);
			}
			return cancel_button.isEnabled();
		}
		
		public void cancel_button_is_clicked() {
			try {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, cancel_button);
			} catch (Exception e) {
				ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, cancel_button);
			}
			 cancel_button.click();
		}
		
	
	
	
}
