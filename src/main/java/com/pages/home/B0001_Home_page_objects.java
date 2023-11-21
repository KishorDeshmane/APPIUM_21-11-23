package com.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class B0001_Home_page_objects {
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
	
	@FindBy(xpath="")
	private WebElement sign_up_successfull_text_pop_up;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Home\"]/android.view.ViewGroup")
	private WebElement home_button_in_blue;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement packages_page_button;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement services_page_button;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup[4]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement booking_page_button;
	
	@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.ViewGroup[5]/com.horcrux.svg.SvgView/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement profile_page_button;
	
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


	public B0001_Home_page_objects(AndroidDriver driver) {
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
	
	public boolean sign_up_successfull_text_in_pop_up_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, sign_up_successfull_text_pop_up);
			return sign_up_successfull_text_pop_up.isDisplayed();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, sign_up_successfull_text_pop_up);
			return sign_up_successfull_text_pop_up.isDisplayed();
		}
	}
	
	public boolean home_button_in_blue_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, home_button_in_blue);
			return home_button_in_blue.isDisplayed();
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 15, home_button_in_blue);
			return home_button_in_blue.isDisplayed();
		}
	}

	public void services_page_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, services_page_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, services_page_button);
		}
		services_page_button.click();
	}
	
	public void packages_page_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, packages_page_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, packages_page_button);
		}
		packages_page_button.click();
	}
	
	public void booking_page_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, booking_page_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, booking_page_button);
		}
		booking_page_button.click();
	}
	
	public void profile_page_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_page_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_page_button);
		}
		profile_page_button.click();
	}

	
	

}
