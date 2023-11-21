package com.pages.profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

import io.appium.java_client.android.AndroidDriver;

public class F0003_Profile_edit_page_objects {
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
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	private WebElement back_button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
	private WebElement profile_pic;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Edit\"]/android.widget.TextView")
	private WebElement pic_edit_button;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	private WebElement select_a_photo_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
	private WebElement name_user_field_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
	private WebElement name_user_field;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"🇦🇪, +971, \"]")
	private WebElement country_code_dropdown;
	
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
	private WebElement country_code_dropdown_search_you_country;
	
	
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"🇦🇪, +971, United Arab Emirates\"]/android.widget.TextView[3]")
	private WebElement united_arab_emirates_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
	private WebElement we_cant_find_your_country_text;
	
	
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
	private WebElement mobile_niumber_userfield;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView")
	private WebElement email_user_field_text;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")
	private WebElement email_user_field;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
	private WebElement date_of_birth_user_field_text;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"DD/MM/YYYY\"]/android.widget.TextView")
	private WebElement date_of_birth_user_field;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]")
	private WebElement select_gendar_dropdown;
	
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Male\"]")
	private WebElement select_gendar_male;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Female\"]")
	private WebElement select_gendar_female;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Not to mention\"]/android.widget.TextView")
	private WebElement select_gendar_not_to_mention;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"SAVE CHANGES\"]/android.widget.TextView")
	private WebElement save_changes_button;
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public F0003_Profile_edit_page_objects(AndroidDriver driver) {
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



	public boolean back_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, back_button);
		}
		return back_button.isDisplayed();
	}

	public boolean back_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		return back_button.isEnabled();
	}
	
	public void back_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_button);
		}
		 back_button.click();
	}
	

	public boolean profile_pic_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, profile_pic);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, profile_pic);
		}
		return profile_pic.isDisplayed();
	}

	public boolean edit_profile_pic_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, pic_edit_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, pic_edit_button);
		}
		return pic_edit_button.isDisplayed();
	}

	public boolean edit_profile_pic_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, pic_edit_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, pic_edit_button);
		}
		return pic_edit_button.isEnabled();
	}
	
	public void edit_profile_pic_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, pic_edit_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, pic_edit_button);
		}
		 pic_edit_button.click();
	}
	
	
	public boolean select_a_photo_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_a_photo_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_a_photo_text);
		}
		return select_a_photo_text.isDisplayed();
	}

	public boolean name_text_label_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field_text);
		}
		return name_user_field_text.isEnabled();
	}

	public boolean name_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, name_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, name_user_field);
		}
		return name_user_field.isDisplayed();
	}

	public boolean name_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field);
		}
		return name_user_field.isEnabled();
	}
	
	public void name_user_field_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field);
		}
		 name_user_field.click();
	}
	
	public void send_name_in_user_field(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, name_user_field);
		}
		 name_user_field.sendKeys(string);
	}
	

	public void clear_the_name_text_from_the_user_field(){
		name_user_field.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		name_user_field.clear();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public void clear_the_mobile_number_from_the_user_field(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_niumber_userfield);
		mobile_niumber_userfield.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mobile_niumber_userfield.clear();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void back_button_pressed() {
		driver.navigate().back();
	}
	
	public boolean country_code_dropdown_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, country_code_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, country_code_dropdown);
		}
		return country_code_dropdown.isDisplayed();
	}

	public boolean country_code_dropdown_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown);
		}
		return country_code_dropdown.isEnabled();
	}
	
	public void country_code_dropdown_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown);
		}
		 country_code_dropdown.click();
	}
	
	
	public boolean country_code_dropdown_search_your_country_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown_search_you_country);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown_search_you_country);
		}
		return country_code_dropdown_search_you_country.isEnabled();
	}
	
	
	public boolean united_arab_emirates_text_is_clickable(){
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, united_arab_emirates_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, united_arab_emirates_text);
		}
		return united_arab_emirates_text.isEnabled();
	}
	
	public void united_arab_emirates_text_is_clicked(){
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, united_arab_emirates_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, united_arab_emirates_text);
		}
		 united_arab_emirates_text.click();
	}
	
	public void country_code_dropdown_search_your_country_text_send(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown_search_you_country);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, country_code_dropdown_search_you_country);
		}
		 country_code_dropdown_search_you_country.sendKeys(string);
	}
	
	
	public boolean we_cant_find_your_country_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, we_cant_find_your_country_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, we_cant_find_your_country_text);
		}
		return we_cant_find_your_country_text.isDisplayed();
	}
	
	
	

	public boolean mobile_number_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mobile_niumber_userfield);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, mobile_niumber_userfield);
		}
		return mobile_niumber_userfield.isDisplayed();
	}

	public boolean mobile_number_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_niumber_userfield);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_niumber_userfield);
		}
		return mobile_niumber_userfield.isEnabled();
	}

	
	public void mobile_number_user_field_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_niumber_userfield);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_niumber_userfield);
		}
		mobile_niumber_userfield.click();
	}
	
	public void mobile_number_user_field_value_entered(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_niumber_userfield);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, mobile_niumber_userfield);
		}
		mobile_niumber_userfield.sendKeys(string);
	}
	
	
	
	public boolean email_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field_text);
		}
		return email_user_field_text.isDisplayed();
	}

	public boolean email_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, email_user_field);
		}
		return email_user_field.isDisplayed();
	}

	public boolean email_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		}
		return email_user_field.isEnabled();
	}
	
	public void email_user_field_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		}
		 email_user_field.click();
	}
	
	public void clear_email_user_field() {
		 email_user_field.clear();
	}
	
	
	public void email_user_field_send_email_text(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, email_user_field);
		}
		 email_user_field.sendKeys(string);
	}

	public boolean date_of_birth_text_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, date_of_birth_user_field_text);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, date_of_birth_user_field_text);
		}
		return date_of_birth_user_field_text.isDisplayed();
	}

	public boolean date_of_birth_user_field_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, date_of_birth_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, date_of_birth_user_field);
		}
		return date_of_birth_user_field.isDisplayed();
	}

	public boolean date_of_birth_user_field_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, date_of_birth_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, date_of_birth_user_field);
		}
		return date_of_birth_user_field.isEnabled();
	}
	
	public void date_of_birth_user_field_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, date_of_birth_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, date_of_birth_user_field);
		}
		 date_of_birth_user_field.click();
	}
	
	public void date_of_birth_user_field_send_text(String string) {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, date_of_birth_user_field);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, date_of_birth_user_field);
		}
		 date_of_birth_user_field.sendKeys(string);
	}
	
	
	
	
	public boolean select_gender_dropdown_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_dropdown);
		}
		return select_gendar_dropdown.isDisplayed();
	}

	public boolean select_gender_dropdown_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_dropdown);
		}
		return select_gendar_dropdown.isEnabled();
	}
	
	public void select_gender_dropdown_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_dropdown);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_dropdown);
		}
		 select_gendar_dropdown.click();
	}


	public boolean select_gender_dropdown_male_option_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_male);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_male);
		}
		return select_gendar_male.isDisplayed();
	}

	public boolean select_gender_dropdown_male_option_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_male);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_male);
		}
		return select_gendar_male.isEnabled();
	}
	
	public void select_gender_dropdown_male_option_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_male);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_male);
		}
		 select_gendar_male.click();
	}

	public boolean select_gender_dropdown_female_option_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_female);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_female);
		}
		return select_gendar_female.isDisplayed();
	}

	public boolean select_gender_dropdown_female_option_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_female);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_female);
		}
		return select_gendar_female.isEnabled();
	}
	
	
	public void select_gender_dropdown_female_option_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_female);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_female);
		}
		 select_gendar_female.click();
	}
	

	public boolean select_gender_dropdown_not_to_mention_option_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_not_to_mention);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, select_gendar_not_to_mention);
		}
		return select_gendar_not_to_mention.isDisplayed();
	}
	
	public boolean select_gender_dropdown_not_to_mention_option_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_not_to_mention);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_not_to_mention);
		}
		return select_gendar_not_to_mention.isEnabled();
	}
	
	
	public void select_gender_dropdown_not_to_mention_option_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_not_to_mention);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, select_gendar_not_to_mention);
		}
		 select_gendar_not_to_mention.click();
	}
	
	
	

	public boolean save_changes_button_is_displayed() {
		try {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_changes_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, save_changes_button);
		}
		return save_changes_button.isDisplayed();
	}
	
	public boolean save_changes_button_is_clickable() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, save_changes_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, save_changes_button);
		}
		return save_changes_button.isEnabled();
	}

	
	public void save_changes_button_is_clicked() {
		try {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, save_changes_button);
		} catch (Exception e) {
			ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, save_changes_button);
		}
		 save_changes_button.click();
	}
	
	
	
	
	
	
	

}
