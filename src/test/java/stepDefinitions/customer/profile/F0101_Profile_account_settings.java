package stepDefinitions.customer.profile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.applicationHooks.AppHooks;
import com.pages.A0001_Landing_page_objects;
import com.pages.A0002_Login_page_objects;
import com.pages.A0003_Sign_up_page_objects;
import com.pages.A0004_Verify_otp_page_objects;
import com.pages.home.B0001_Home_page_objects;
import com.pages.profile.F0001_Profile_page_objects;
import com.pages.profile.F0101_Profile_account_settings_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F0101_Profile_account_settings {
	
	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0101_Profile_account_settings_objects pa = new F0101_Profile_account_settings_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(F0101_Profile_account_settings.class);
	
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

	@Given("Verify that user is on the profile account settings page of the customer application")
	public void verify_that_user_is_on_the_profile_account_settings_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.account_settings_is_clicked();
		boolean actual = pa.account_setting_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verify that account setting title text should be displayed in the account setting page")
	public void verify_that_account_setting_title_text_should_be_displayed_in_the_account_setting_page() {
		boolean actual = pa.account_setting_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be displayed in the account setting page")
	public void verify_that_back_button_should_be_displayed_in_the_account_setting_page() {
		boolean actual = pa.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the account setting page")
	public void verify_that_back_button_should_be_clickable_in_the_account_setting_page() {
		boolean actual = pa.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that enabled touch id radio button label should be displayed in the account setting page")
	public void verify_that_enabled_touch_id_radio_button_label_should_be_displayed_in_the_account_setting_page() {
		boolean actual = pa.enabled_touch_id_radio_button_label_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that enabled touch id radio button should be displayed in the account setting page")
	public void verify_that_enabled_touch_id_radio_button_should_be_displayed_in_the_account_setting_page() {
		boolean actual = pa.enabled_touch_id_radio_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that enabled touch id radio button should be clickable in the account setting page")
	public void verify_that_enabled_touch_id_radio_button_should_be_clickable_in_the_account_setting_page() {
		boolean actual = pa.enabled_touch_id_radio_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that delete account button should be displayed in the account setting page")
	public void verify_that_delete_account_button_should_be_displayed_in_the_account_setting_page() {
		boolean actual = pa.delete_account_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that delete account button should be clickable in the account setting page")
	public void verify_that_delete_account_button_should_be_clickable_in_the_account_setting_page() {
		boolean actual = pa.delete_account_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
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
	
	@When("User click on the back button from the profile account setting page")
	public void user_click_on_the_back_button_from_the_profile_account_setting_page() {
	    boolean actual = pa.back_button_is_clickable();
		pa.back_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be on the profile page from the profile account setting page")
	public void verify_that_user_should_be_on_the_profile_page_from_the_profile_account_setting_page() {
	    boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
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
	 */
	
	@Then("Verify click on the enabled touch id radio button off should be displayed in the profile account settings page")
	public void verify_click_on_the_enabled_touch_id_radio_button_off_should_be_displayed_in_the_profile_account_settings_page() {
	    pa.enabled_touch_id_radio_button_is_clicked();
	    String actual = pa.enabled_touch_id_radio_button_in_on_off_text_is_displayed();
	    Assert.assertEquals(actual, "OFF");
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify click on the enabled touch id radio button on should be displayed in the profile account settings page")
	public void verify_click_on_the_enabled_touch_id_radio_button_on_should_be_displayed_in_the_profile_account_settings_page() {
	    pa.enabled_touch_id_radio_button_is_clicked();
	    String actual = pa.enabled_touch_id_radio_button_in_on_off_text_is_displayed();
	    Assert.assertEquals(actual, "ON");
	    pa.enabled_touch_id_radio_button_is_clicked();
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
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
	 */
	
	@Then("user click on the delete account button should give resected comfirmation pop up")
	public void user_click_on_the_delete_account_button_should_give_resected_comfirmation_pop_up() {
	    pa.delete_account_button_is_clicked();
	    boolean actual = pa.delete_account_confirmation_pop_up_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
}
