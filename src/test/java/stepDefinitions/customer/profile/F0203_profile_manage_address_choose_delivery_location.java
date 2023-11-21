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
import com.pages.profile.F0201_Profile_manage_address_objects;
import com.pages.profile.F0202_profile_manage_address_location_confirmation_pop_up_objects;
import com.pages.profile.F0203_profile_manage_address_choose_delivery_location_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class F0203_profile_manage_address_choose_delivery_location {

	
	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0201_Profile_manage_address_objects pa = new F0201_Profile_manage_address_objects(DriverFactory.getDriver());
	F0202_profile_manage_address_location_confirmation_pop_up_objects plc = new F0202_profile_manage_address_location_confirmation_pop_up_objects(DriverFactory.getDriver());
	F0203_profile_manage_address_choose_delivery_location_objects cdl = new F0203_profile_manage_address_choose_delivery_location_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(F0203_profile_manage_address_choose_delivery_location.class);
	
	
	
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
	
	@Given("Verify that user is on the profile manage address choose delivery location page of the customer application")
	public void verify_that_user_is_on_the_profile_manage_address_choose_delivery_location_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.manage_address_tab_is_clicked();
		pa.plus_add_new_address_button_is_clicked();
		plc.give_access_button_is_clicked();
		cdl.mobile_pop_up_allow_only_while_using_the_app_button_clicked();
		boolean actual = cdl.choose_delivery_location_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that choose deleivery location title text should be displayed in the choose delivery location page")
	public void verify_that_choose_deleivery_location_title_text_should_be_displayed_in_the_choose_delivery_location_page() {
		boolean actual = cdl.choose_delivery_location_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be displayed in the choose delivery location page")
	public void verify_that_back_button_should_be_displayed_in_the_choose_delivery_location_page() {
		boolean actual = cdl.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the choose delivery location page")
	public void verify_that_back_button_should_be_clickable_in_the_choose_delivery_location_page() {
		boolean actual = cdl.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search icon should be displayed in the choose delivery location page")
	public void verify_that_search_icon_should_be_displayed_in_the_choose_delivery_location_page() {
		boolean actual = cdl.search_icon_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search icon should be clickable in the choose delivery location page")
	public void verify_that_search_icon_should_be_clickable_in_the_choose_delivery_location_page() {
		boolean actual = cdl.search_icon_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field should be displayed in the choose delivery location page")
	public void verify_that_search_user_field_should_be_displayed_in_the_choose_delivery_location_page() {
		boolean actual = cdl.search_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field should be clickable in the choose delivery location page")
	public void verify_that_search_user_field_should_be_clickable_in_the_choose_delivery_location_page() {
		boolean actual = cdl.search_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that search user field {string} should be displayed in the choose delivery location page")
	public void verify_that_search_user_field_should_be_displayed_in_the_choose_delivery_location_page(String string) {
		String actual = cdl.search_user_field_placeholder_text();
		Assert.assertEquals(actual, string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that map should be displayed in the choose deliveery location page")
	public void verify_that_map_should_be_displayed_in_the_choose_deliveery_location_page() {
		boolean actual = cdl.map_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that map location red icon in mid should be displayed in the choose delivery location page")
	public void verify_that_map_location_red_icon_in_mid_should_be_displayed_in_the_choose_delivery_location_page() {
		boolean actual = cdl.map_location_red_icon_in_mid_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that map location blue icon should be displayed in the choose delivery location page")
	public void verify_that_map_location_blue_icon_should_be_displayed_in_the_choose_delivery_location_page() {
		boolean actual = cdl.map_location_blue_icon_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that enter complete address button should be displayed in the choose delivery location page")
	public void verify_that_enter_complete_address_button_should_be_displayed_in_the_choose_delivery_location_page() {
		boolean actual = cdl.enter_complete_address_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that enter complete address button should be clickable in the choose delivery location page")
	public void verify_that_enter_complete_address_button_should_be_clickable_in_the_choose_delivery_location_page() {
		boolean actual = cdl.enter_complete_address_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
}
