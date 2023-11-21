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
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F0201_Profile_manage_address {

	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0201_Profile_manage_address_objects pa = new F0201_Profile_manage_address_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(F0201_Profile_manage_address.class);
	
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@Given("Verify that user is on the profile manage address page of the customer application")
	public void verify_that_user_is_on_the_profile_manage_address_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.manage_address_tab_is_clicked();
		boolean actual = pa.manage_address_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that manage address title text should be displayed in the profile manage address page")
	public void verify_that_manage_address_title_text_should_be_displayed_in_the_profile_manage_address_page() {
		boolean actual = pa.manage_address_title_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be displayed in the profile manage address page")
	public void verify_that_back_button_should_be_displayed_in_the_profile_manage_address_page() {
		boolean actual = pa.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the profile manage address page")
	public void verify_that_back_button_should_be_clickable_in_the_profile_manage_address_page() {
		boolean actual = pa.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that plus add new address button should be displayed in the profile manage address page")
	public void verify_that_plus_add_new_address_button_should_be_displayed_in_the_profile_manage_address_page() {
		boolean actual = pa.plus_add_new_address_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that plus add new address button should be clickable in the profile manage address page")
	public void verify_that_plus_add_new_address_button_should_be_clickable_in_the_profile_manage_address_page() {
		boolean actual = pa.plus_add_new_address_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that save changes button should be displayed in the profile manage address page")
	public void verify_that_save_changes_button_should_be_displayed_in_the_profile_manage_address_page() {
		boolean actual = pa.save_changes_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that save changes button should be clickable in the profile manage address page")
	public void verify_that_save_changes_button_should_be_clickable_in_the_profile_manage_address_page() {
		boolean actual = pa.save_changes_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	@When("after click on the back button profile page should be displayed in the profile mange address page")
	public void after_click_on_the_back_button_profile_page_should_be_displayed_in_the_profile_mange_address_page() {
	    pa.back_button_is_clicked();
	    boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
}
