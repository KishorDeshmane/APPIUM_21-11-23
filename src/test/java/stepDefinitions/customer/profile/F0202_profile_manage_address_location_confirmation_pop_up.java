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
import io.cucumber.java.en.When;

public class F0202_profile_manage_address_location_confirmation_pop_up {

	
	
	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0201_Profile_manage_address_objects pa = new F0201_Profile_manage_address_objects(DriverFactory.getDriver());
	F0202_profile_manage_address_location_confirmation_pop_up_objects plc = new F0202_profile_manage_address_location_confirmation_pop_up_objects(DriverFactory.getDriver());
	F0203_profile_manage_address_choose_delivery_location_objects cdl = new F0203_profile_manage_address_choose_delivery_location_objects(DriverFactory.getDriver());
	
	Logger logger = LogManager.getLogger(F0202_profile_manage_address_location_confirmation_pop_up.class);
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Given("Verify that user is on the profile manage address location confirmation pop up of the customer application")
	public void verify_that_user_is_on_the_profile_manage_address_location_confirmation_pop_up_of_the_customer_application() {
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
	 */
	
	@When("user click on the add new address link should open the respected pop up in the profile manage address add new address page")
	public void user_click_on_the_add_new_address_link_should_open_the_respected_pop_up_in_the_profile_manage_address_add_new_address_page() {
	    pa.plus_add_new_address_button_is_clicked();
	    boolean actual = plc.location_confirmation_pop_up_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that x button should be displayed in the profile manage address add new address page")
	public void verify_that_x_button_should_be_displayed_in_the_profile_manage_address_add_new_address_page() {
		boolean actual = plc.x_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that x button should be clickable in the profile manage address add new address page")
	public void verify_that_x_button_should_be_clickable_in_the_profile_manage_address_add_new_address_page() {
		boolean actual = plc.x_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that location access is required text should be displayed in the profile manage address add new address page")
	public void verify_that_location_access_is_required_text_should_be_displayed_in_the_profile_manage_address_add_new_address_page() {
		boolean actual = plc.location_access_is_required_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that subtitle of location access is required text should be displayed in the profile manage address add new adddress page")
	public void verify_that_subtitle_of_location_access_is_required_text_should_be_displayed_in_the_profile_manage_address_add_new_adddress_page() {
		boolean actual = plc.subtitle_of_location_access_is_required_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that give access button should be displayed in the in the profile manage address add new address page")
	public void verify_that_give_access_button_should_be_displayed_in_the_in_the_profile_manage_address_add_new_address_page() {
		boolean actual = plc.give_access_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that give access button should be clickable in the in the profile manage address add new address page")
	public void verify_that_give_access_button_should_be_clickable_in_the_in_the_profile_manage_address_add_new_address_page() {
		boolean actual = plc.give_access_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be displayed in the in the profile manage address add new address page")
	public void verify_that_cancel_button_should_be_displayed_in_the_in_the_profile_manage_address_add_new_address_page() {
		boolean actual = plc.cancel_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that cancel button should be clickable in the in the profile manage address add new address page")
	public void verify_that_cancel_button_should_be_clickable_in_the_in_the_profile_manage_address_add_new_address_page() {
		boolean actual = plc.cancel_button_is_clickable();
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
	
	@Then("user click on the x button should be redirect on the manage address page")
	public void user_click_on_the_x_button_should_be_redirect_on_the_manage_address_page() {
	    pa.plus_add_new_address_button_is_clicked();
	    plc.x_button_is_clicked();
	    boolean actual = pa.plus_add_new_address_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("user click on the cancel button should be redirect on the manage address page")
	public void user_click_on_the_cancel_button_should_be_redirect_on_the_manage_address_page() {
		pa.plus_add_new_address_button_is_clicked();
		plc.cancel_button_is_clicked();
	    boolean actual = pa.plus_add_new_address_button_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("user click on the give access button should be redirect on the manage address page")
	public void user_click_on_the_give_access_button_should_be_redirect_on_the_manage_address_page() {
	    pa.plus_add_new_address_button_is_clicked();
	    plc.give_access_button_is_clicked();
	    boolean actual = cdl.choose_delivery_location_title_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
}
