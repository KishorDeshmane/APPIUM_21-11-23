package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0001_Profile_page_objects {
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
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Profile\"]/android.view.ViewGroup")
	private WebElement profile_button_in_blue;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement profile_text_in_the_left_top_corner;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	private WebElement kebab_menu;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
	private WebElement user_image;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement first_and_last_name_of_the_user;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
	private WebElement country_code_and_mobile_numbe;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[4]")
	private WebElement referral_code;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")
	private WebElement referral_code_copy_button;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Edit\"]")
	private WebElement edit_button;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Account Settings, Secure your account\"]/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement account_settings;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Account Settings, Secure your account\"]/android.view.ViewGroup/com.horcrux.svg.SvgView[2]")
	private WebElement account_setting_arrow;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Account Settings, Secure your account\"]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement account_settings_secure_your_account_text;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Manage Address, One stop for all your address\"]/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement manage_address;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Manage Address, One stop for all your address\"]/android.view.ViewGroup/com.horcrux.svg.SvgView[2]/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement manage_address_arrow;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Manage Address, One stop for all your address\"]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement manage_address_one_stop_for_all_your_address_text;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Add a Tenant, Delegate to people\"]/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement add_a_tenant;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Add a Tenant, Delegate to people\"]/android.view.ViewGroup/com.horcrux.svg.SvgView[2]/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement add_a_tenant_arrow;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Add a Tenant, Delegate to people\"]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement add_a_tenant_tab_delegate_to_people_text;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Chat Support, Solutions for you\"]/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement chat_support;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Chat Support, Solutions for you\"]/android.view.ViewGroup/com.horcrux.svg.SvgView[2]/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement chart_support_arrow;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Chat Support, Solutions for you\"]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement chat_support_solution_for_you_text;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Legal, Solution mentioned for you\"]/android.view.ViewGroup/android.widget.TextView[1]")
	private WebElement legal;

	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Legal, Solution mentioned for you\"]/android.view.ViewGroup/com.horcrux.svg.SvgView[2]/com.horcrux.svg.l/com.horcrux.svg.u")
	private WebElement legal_arrow;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Legal, Solution mentioned for you\"]/android.view.ViewGroup/android.widget.TextView[2]")
	private WebElement legal_solution_mentioned_for_you_text;
	
	
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
	
	public F0001_Profile_page_objects(AndroidDriver driver) {
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
	
	public boolean profile_button_in_blue_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, profile_button_in_blue);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, profile_button_in_blue);
		}
		return profile_button_in_blue.isDisplayed();
	}

	public boolean profile_text_in_the_left_top_corner_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, profile_text_in_the_left_top_corner);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, profile_text_in_the_left_top_corner);
		}
		return profile_text_in_the_left_top_corner.isDisplayed();
	}
	
	public boolean kebab_menu_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, kebab_menu);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, kebab_menu);
		}
		return kebab_menu.isDisplayed();
	}

	public boolean kebab_menu_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, kebab_menu);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, kebab_menu);
		}
		return kebab_menu.isEnabled();
	}
	
	public void kebab_menu_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, kebab_menu);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, kebab_menu);
		}
		 kebab_menu.click();
	}

	public boolean user_image_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, user_image);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, user_image);
		}
		return user_image.isDisplayed();
	}

	public boolean user_image_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, user_image);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, user_image);
		}
		return user_image.isEnabled();
	}

	public boolean first_and_last_name_of_the_user_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, first_and_last_name_of_the_user);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, first_and_last_name_of_the_user);
		}
		return first_and_last_name_of_the_user.isDisplayed();
	}

	public boolean country_code_and_mobile_numbe_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, country_code_and_mobile_numbe);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, country_code_and_mobile_numbe);
		}
		return country_code_and_mobile_numbe.isDisplayed();
	}

	public boolean referral_code_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, referral_code);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, referral_code);
		}
		return referral_code.isDisplayed();
	}

	public boolean referral_code_copy_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, referral_code_copy_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, referral_code_copy_button);
		}
		return referral_code_copy_button.isDisplayed();
	}

	public boolean referral_code_copy_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, referral_code_copy_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, referral_code_copy_button);
		}
		return referral_code_copy_button.isEnabled();
	}

	public boolean edit_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, edit_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, edit_button);
		}
		return edit_button.isDisplayed();
	}

	public boolean edit_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, edit_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, edit_button);
		}
		return edit_button.isEnabled();
	}



	public void edit_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, edit_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, edit_button);
		}
		 edit_button.click();
	}
	
	
	public boolean account_settings_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, account_settings);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, account_settings);
		}
		return account_settings.isDisplayed();
	}



	public boolean account_settings_secure_your_account_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, account_settings_secure_your_account_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, account_settings_secure_your_account_text);
		}
		return account_settings_secure_your_account_text.isDisplayed();
	}



	public boolean account_settings_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, account_settings);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, account_settings);
		}
		return account_settings.isEnabled();
	}
	
	public void account_settings_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, account_settings);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, account_settings);
		}
		 account_settings.click();
	}


	public boolean account_settings_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, account_setting_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, account_setting_arrow);
		}
		return account_setting_arrow.isEnabled();
	}

	public boolean manage_address_tab_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, manage_address);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, manage_address);
		}
		return manage_address.isDisplayed();
	}



	public boolean manage_address_one_stop_for_all_your_address_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, manage_address_one_stop_for_all_your_address_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, manage_address_one_stop_for_all_your_address_text);
		}
		return manage_address_one_stop_for_all_your_address_text.isDisplayed();
	}



	public boolean manage_address_tab_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, manage_address);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, manage_address);
		}
		return manage_address.isEnabled();
	}

	public void manage_address_tab_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, manage_address);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, manage_address);
		}
		 manage_address.click();
	}
	
	
	public boolean manage_address_tab_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, manage_address_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, manage_address_arrow);
		}
		return manage_address_arrow.isEnabled();
	}

	

	public void scroll_body() {
		ElementUtil.eu.scroll_till_text(driver, "Legal");
	}
	

	public boolean add_a_tenant_tab_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, add_a_tenant);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, add_a_tenant);
		}
		return add_a_tenant.isDisplayed();
	}



	public boolean add_a_tenant_tab_delegate_to_people_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, add_a_tenant_tab_delegate_to_people_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, add_a_tenant_tab_delegate_to_people_text);
		}
		return add_a_tenant_tab_delegate_to_people_text.isDisplayed();
	}



	public boolean add_a_tenant_tab_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, add_a_tenant);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, add_a_tenant);
		}
		return add_a_tenant.isEnabled();
	}

	public boolean add_a_tenant_tab_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, add_a_tenant_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, add_a_tenant_arrow);
		}
		return add_a_tenant_arrow.isEnabled();
	}
	
	
	
	

	public boolean chat_support_tab_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, chat_support);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, chat_support);
		}
		return chat_support.isDisplayed();
	}



	public boolean chat_support_solution_for_you_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, chat_support_solution_for_you_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, chat_support_solution_for_you_text);
		}
		return chat_support_solution_for_you_text.isDisplayed();
	}




	public boolean chat_support_tab_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, chat_support);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, chat_support);
		}
		return chat_support.isEnabled();
	}

	
	public boolean chat_support_tab_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, chart_support_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, chart_support_arrow);
		}
		return chart_support_arrow.isEnabled();
	}


	public boolean legal_tab_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, legal);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, legal);
		}
		return legal.isDisplayed();
	}



	public boolean legal_solution_mentioned_for_you_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, legal_solution_mentioned_for_you_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, legal_solution_mentioned_for_you_text);
		}
		return legal_solution_mentioned_for_you_text.isDisplayed();
	}



	public boolean legal_tab_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, legal);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, legal);
		}
		return legal.isEnabled();
	}
	
	
	public boolean legal_tab_arrow_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, legal_arrow);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, legal_arrow);
		}
		return legal_arrow.isEnabled();
	}


}
