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
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepDefinitions.customer.A0004_Verify_otp_page;

public class F0001_Profile_page {
	A0001_Landing_page_objects fp=new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li= new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(A0004_Verify_otp_page.class);
	
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
	
	
	@Given("Verify that user is on the profile page of the customer application")
	public void verify_that_user_is_on_the_profile_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		boolean actual = pr.profile_button_in_blue_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("Verify that profile text in the left top corner should be displayed in the profile page")
	public void verify_that_profile_text_in_the_left_top_corner_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that kebab menu should be displayed in the right corner of the profile page")
	public void verify_that_kebab_menu_should_be_displayed_in_the_right_corner_of_the_profile_page() {
		boolean actual = pr.kebab_menu_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that kebab menu should be clickable in the right corner of the profile page")
	public void verify_that_kebab_menu_should_be_clickable_in_the_right_corner_of_the_profile_page() {
		boolean actual = pr.kebab_menu_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user image should be displayed in the profile page")
	public void verify_that_user_image_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.user_image_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that user image should be clickable in the profile page")
	public void verify_that_user_image_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.user_image_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that first and last name of the user should be displayed in the profile page")
	public void verify_that_first_and_last_name_of_the_user_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.first_and_last_name_of_the_user_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code and mobile number should be displayed in the profile page")
	public void verify_that_country_code_and_mobile_number_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.country_code_and_mobile_numbe_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that referral code should be displayed in the profile page")
	public void verify_that_referral_code_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.referral_code_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that referral code copy button should be displayed in the profile page")
	public void verify_that_referral_code_copy_button_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.referral_code_copy_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that referral code copy button should be clickable in the profile page")
	public void verify_that_referral_code_copy_button_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.referral_code_copy_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that edit button should be displayed in the profile page")
	public void verify_that_edit_button_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.edit_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that edit button should be clickable in the profile page")
	public void verify_that_edit_button_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.edit_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	/**
	 * 
	 * Package boxes etc pending here
	 * 
	 */
	
	
	
	

	@Then("Verify that account settings tab should be displayed in the profile page")
	public void verify_that_account_settings_tab_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.account_settings_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that account settings tab secure your account text should be displayed in the profile page")
	public void verify_that_account_settings_tab_secure_your_account_text_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.account_settings_secure_your_account_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that account settings tab should be clickable in the profile page")
	public void verify_that_account_settings_tab_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.account_settings_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that account settings tab arrow should be displayed in the profile page")
	public void verify_that_account_settings_tab_arrow_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.account_settings_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that manage address tab should be displayed in the profile page")
	public void verify_that_manage_address_tab_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.manage_address_tab_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that manage address one stop for all your address text should be displayed in the profile page")
	public void verify_that_manage_address_one_stop_for_all_your_address_text_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.manage_address_one_stop_for_all_your_address_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that manage address tab should be clickable in the profile page")
	public void verify_that_manage_address_tab_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.manage_address_tab_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that manage address tab arrow should be clickable in the profile page")
	public void verify_that_manage_address_tab_arrow_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.manage_address_tab_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that add a tenant tab should be displayed in the profile page")
	public void verify_that_add_a_tenant_tab_should_be_displayed_in_the_profile_page() {
		pr.scroll_body();
		boolean actual = pr.add_a_tenant_tab_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that add a tenant tab delegate to people text should be displayed in the profile page")
	public void verify_that_add_a_tenant_tab_delegate_to_people_text_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.add_a_tenant_tab_delegate_to_people_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that add a tenant tab should be clickable in the profile page")
	public void verify_that_add_a_tenant_tab_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.add_a_tenant_tab_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that add a tenant tab arrow should be clickable in the profile page")
	public void verify_that_add_a_tenant_tab_arrow_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.add_a_tenant_tab_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that chat support tab should be displayed in the profile page")
	public void verify_that_chat_support_tab_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.chat_support_tab_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that chat support solution for you text should be displayed in the profile page")
	public void verify_that_chat_support_solution_for_you_text_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.chat_support_solution_for_you_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that chat support tab should be clickable in the profile page")
	public void verify_that_chat_support_tab_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.chat_support_tab_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that chat support tab arrow should be clickable in the profile page")
	public void verify_that_chat_support_tab_arrow_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.chat_support_tab_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that legal tab should be displayed in the profile page")
	public void verify_that_legal_tab_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.legal_tab_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that legal solution mentioned for you text should be displayed in the profile page")
	public void verify_that_legal_solution_mentioned_for_you_text_should_be_displayed_in_the_profile_page() {
		boolean actual = pr.legal_solution_mentioned_for_you_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that legal tab should be clickable in the profile page")
	public void verify_that_legal_tab_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.legal_tab_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("Verify that legal tab arrow should be clickable in the profile page")
	public void verify_that_legal_tab_arrow_should_be_clickable_in_the_profile_page() {
		boolean actual = pr.legal_tab_arrow_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
