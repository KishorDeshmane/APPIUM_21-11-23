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
import com.pages.profile.F0003_Profile_edit_page_objects;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F0003_Profile_edit_page {

	A0001_Landing_page_objects fp = new A0001_Landing_page_objects(DriverFactory.getDriver());
	A0003_Sign_up_page_objects sp = new A0003_Sign_up_page_objects(DriverFactory.getDriver());
	A0004_Verify_otp_page_objects vo = new A0004_Verify_otp_page_objects(DriverFactory.getDriver());
	A0002_Login_page_objects li = new A0002_Login_page_objects(DriverFactory.getDriver());
	B0001_Home_page_objects hp = new B0001_Home_page_objects(DriverFactory.getDriver());
	F0001_Profile_page_objects pr = new F0001_Profile_page_objects(DriverFactory.getDriver());
	F0003_Profile_edit_page_objects pe = new F0003_Profile_edit_page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(F0003_Profile_edit_page.class);

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
	
	
	@Given("Verify that user is on the profile update page of the customer application")
	public void verify_that_user_is_on_the_profile_update_page_of_the_customer_application() {
		fp.login_button_is_clicked();
		li.mobile_number_user_field_send_text(String.valueOf(AppHooks.tdata.getProperty("Customer_MobileNumber")));
		li.get_otp_button_is_clicked();
		vo.otp_user_field_box_is_clicked();
		vo.otp_user_fields_send_text(AppHooks.tdata.getProperty("OTP"));
		vo.back_button_pressed();
		vo.verify_otp_button_is_clicked();
		hp.profile_page_button_is_clicked();
		pr.edit_button_is_clicked();
		boolean actual = pe.select_gender_dropdown_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	
	
	
	@Then("Verify that back button should be displayed in the profile update page")
	public void verify_that_back_button_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.back_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that back button should be clickable in the profile update page")
	public void verify_that_back_button_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.back_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that profile pic should be displayed in the profile update page")
	public void verify_that_profile_pic_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.profile_pic_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that edit profile pic button should be displayed in the profile update page")
	public void verify_that_edit_profile_pic_button_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.edit_profile_pic_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that edit profile pic button should be clickable in the profile update page")
	public void verify_that_edit_profile_pic_button_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.edit_profile_pic_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that name text should be displayed in name user field from the profile update page")
	public void verify_that_name_text_should_be_displayed_in_name_user_field_from_the_profile_update_page() {
		boolean actual = pe.name_text_label_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that name user field should be displayed in the profile update page")
	public void verify_that_name_user_field_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.name_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that name user field should be clickable in the profile update page")
	public void verify_that_name_user_field_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.name_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code dropdown should be displayed in the profile update page")
	public void verify_that_country_code_dropdown_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.country_code_dropdown_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that country code dropdown should be clickable in the profile update page")
	public void verify_that_country_code_dropdown_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.country_code_dropdown_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be displayed in the profile update page")
	public void verify_that_mobile_number_user_field_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.mobile_number_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that mobile number user field should be clickable in the profile update page")
	public void verify_that_mobile_number_user_field_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.mobile_number_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email text should be displayed in the profile update page")
	public void verify_that_email_text_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.email_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email user field should be displayed in the profile update page")
	public void verify_that_email_user_field_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.email_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that email user field should be clickable in the proile update page")
	public void verify_that_email_user_field_should_be_clickable_in_the_proile_update_page() {
		boolean actual = pe.email_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that date of birth text should be displayed in the profile update page")
	public void verify_that_date_of_birth_text_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.date_of_birth_text_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that date of birth user field should be displayed in the profile update page")
	public void verify_that_date_of_birth_user_field_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.date_of_birth_user_field_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that date of birth user field should be clickable in the profile update page")
	public void verify_that_date_of_birth_user_field_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.date_of_birth_user_field_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdown should be displayed in the profile update page")
	public void verify_that_select_gender_dropdown_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.select_gender_dropdown_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdown should be clickable in the profile update page")
	public void verify_that_select_gender_dropdown_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.select_gender_dropdown_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdown male option should be displayed in the profile update page")
	public void verify_that_select_gender_dropdown_male_option_should_be_displayed_in_the_profile_update_page() {
		pe.select_gender_dropdown_is_clicked();
		boolean actual = pe.select_gender_dropdown_male_option_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdown male option should be clickable in the profile update page")
	public void verify_that_select_gender_dropdown_male_option_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.select_gender_dropdown_male_option_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdwon female option should be displayed in the profile update page")
	public void verify_that_select_gender_dropdwon_female_option_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.select_gender_dropdown_female_option_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdwon female option should be clickable in the profile update page")
	public void verify_that_select_gender_dropdwon_female_option_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.select_gender_dropdown_female_option_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdown not to mention option should be displayed in the profile update page")
	public void verify_that_select_gender_dropdown_not_to_mention_option_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.select_gender_dropdown_not_to_mention_option_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that select gender dropdown not to mention option should be clickable in the profile update page")
	public void verify_that_select_gender_dropdown_not_to_mention_option_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.select_gender_dropdown_not_to_mention_option_is_clickable();
		pe.select_gender_dropdown_male_option_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that save changes should be displayed in the profile update page")
	public void verify_that_save_changes_should_be_displayed_in_the_profile_update_page() {
		boolean actual = pe.save_changes_button_is_displayed();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verify that save changes should be clickable in the profile update page")
	public void verify_that_save_changes_should_be_clickable_in_the_profile_update_page() {
		boolean actual = pe.save_changes_button_is_clickable();
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
	
	
	@When("user click on the back button from the profile update page")
	public void user_click_on_the_back_button_from_the_profile_update_page() {
	    boolean actual = pe.back_button_is_clickable();
		pe.back_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the profile page as expected profile header text is displayed")
	public void verify_that_user_is_on_the_profile_page_as_expected_profile_header_text_is_displayed() {
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
	 *  Need to upload different images for profile picture and save changes 
	 */
	
	@When("user click on the edit button in the profile update page")
	public void user_click_on_the_edit_button_in_the_profile_update_page() {
		boolean actual = pe.edit_profile_pic_button_is_clickable();
		pe.edit_profile_pic_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that selet a photo text should be displayed in the update pic page")
	public void verify_that_selet_a_photo_text_should_be_displayed_in_the_update_pic_page() {
	    boolean actual = pe.select_a_photo_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	/**
	 * 
	 * 
	 * 
	 * Name User field
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@When("user clear the first name and last name from the user field and click on the save changes button")
	public void user_clear_the_first_name_and_last_name_from_the_user_field_and_click_on_the_save_changes_button() {
	    pe.name_user_field_is_clicked();
	    pe.clear_the_name_text_from_the_user_field();
	    pe.back_button_pressed();
	    boolean actual = pe.save_changes_button_is_clickable();
	    pe.save_changes_button_is_clicked();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@When("user clear the name and send valid text as {string} in the user field and click on the save changes button")
	public void user_clear_the_name_and_send_valid_text_as_in_the_user_field_and_click_on_the_save_changes_button(String string) {
	    pe.name_user_field_is_clicked();
	    pe.clear_the_name_text_from_the_user_field();
		pe.send_name_in_user_field(string);
		pe.back_button_pressed();
		boolean actual = pe.save_changes_button_is_clickable();
		pe.save_changes_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("user should be on the same page as expected profile update page")
	public void user_should_be_on_the_same_page_as_expected_profile_update_page() {
	    boolean actual = pe.date_of_birth_text_is_displayed();
	    Assert.assertEquals(actual, true);
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("user should be on the profile page as expected profile update page")
	public void user_should_be_on_the_profile_page_as_expected_profile_update_page() {
	    boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the respected message pop up in profile update page")
	public void verify_that_user_should_get_the_respected_message_pop_up_in_profile_update_page() {
		
		
		
		Assert.assertEquals(false, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verify that user should get the respected message below the name user field or pop up in profile update page")
	public void verify_that_user_should_get_the_respected_message_below_the_name_user_field_or_pop_up_in_profile_update_page() {
		
		
		Assert.assertEquals(false, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Country code dropdown
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	@When("user click on the country code dropdown and search {string} in profile update page")
	public void user_click_on_the_country_code_dropdown_and_search_in_profile_update_page(String string) {
	    pe.country_code_dropdown_is_clicked();
	    boolean actual = pe.country_code_dropdown_search_your_country_is_clickable();
		Assert.assertEquals(actual, true);
		pe.country_code_dropdown_search_your_country_text_send(string);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should able to select United arab emirates country text in profile update page")
	public void verify_that_user_should_able_to_select_united_arab_emirates_country_text_in_profile_update_page() {
		boolean actual = pe.united_arab_emirates_text_is_clickable();
		pe.united_arab_emirates_text_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should we cant find yuor country text is displayed in profile update page")
	public void verify_that_user_should_we_cant_find_yuor_country_text_is_displayed_in_profile_update_page() {
		boolean actual = pe.we_cant_find_your_country_text_is_displayed();
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
	 */
	
	
	@When("user send mobile number {string} into the user field and click on the save changes button in profile update page")
	public void user_send_mobile_number_into_the_user_field_and_click_on_the_save_changes_button_in_profile_update_page(String string) {
	    pe.clear_the_mobile_number_from_the_user_field();
	    System.out.println("1");
	    pe.mobile_number_user_field_value_entered(string);
	    System.out.println("2");
	    pe.back_button_pressed();
	    System.out.println("3");
	    boolean actual = pe.save_changes_button_is_clickable();
	    System.out.println("4");
	    pe.save_changes_button_is_clicked();
	    System.out.println("5");
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user is on the profile page after updating mobile number from profile update page")
	public void verify_that_user_is_on_the_profile_page_after_updating_mobile_number_from_profile_update_page() {
	    boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should get the respected pop up in the profile update page")
	public void verify_that_user_should_get_the_respected_pop_up_in_the_profile_update_page() {
	    
		Assert.assertEquals(false, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	

	@Then("set older mobile number")
	public void set_older_mobile_number() {
		pr.edit_button_is_clicked();
		System.out.println("1");
		pe.clear_the_mobile_number_from_the_user_field();
		System.out.println("2");
		pe.mobile_number_user_field_value_entered(AppHooks.tdata.getProperty("Customer_MobileNumber"));
		System.out.println("3");
		pe.back_button_pressed();
		System.out.println("4");
	    boolean actual = pe.save_changes_button_is_clickable();
	    System.out.println("5");
	    pe.save_changes_button_is_clicked();
	    System.out.println("6");
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that user should be on the same profile update page")
	public void verify_that_user_should_be_on_the_same_profile_update_page() {
	    boolean actual = pe.date_of_birth_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	/***
	 * 
	 * 
	 * 
	 * 
	 * 
	 * email
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@When("user send email address {string} into the email user field and click on the save changes button in profile update page")
	public void user_send_email_address_into_the_email_user_field_and_click_on_the_save_changes_button_in_profile_update_page(String string) {
		pe.email_user_field_is_clicked();
		pe.clear_email_user_field();
		pe.email_user_field_send_email_text(string);
		pe.back_button_pressed();
		boolean actual = pe.save_changes_button_is_clickable();
		pe.save_changes_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Then("Verfify that user should be on the profile page after updating email from the profile update page")
	public void verfify_that_user_should_be_on_the_profile_page_after_updating_email_from_the_profile_update_page() {
	    boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verfify that user should be on the profile edit page after updating email from the profile update page")
	public void verfify_that_user_should_be_on_the_profile_edit_page_after_updating_email_from_the_profile_update_page() {
	    boolean actual = pe.date_of_birth_text_is_displayed();
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
	 * DOB
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@When("user send date of birth {string} into the DOB user field and click on the save changes button in profile update page")
	public void user_send_date_of_birth_into_the_dob_user_field_and_click_on_the_save_changes_button_in_profile_update_page(String string) {
		pe.date_of_birth_user_field_is_clicked();
		pe.date_of_birth_user_field_send_text(string);
		pe.back_button_pressed();
		boolean actual = pe.save_changes_button_is_clickable();
		pe.save_changes_button_is_clicked();
		Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	@Then("Verfify that user should be on the profile page after updating date of birth from the profile update page")
	public void verfify_that_user_should_be_on_the_profile_page_after_updating_date_of_birth_from_the_profile_update_page() {
		boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	
	@Then("Verfify that user should be on the profile edit page after updating date of birth from the profile update page")
	public void verfify_that_user_should_be_on_the_profile_edit_page_after_updating_date_of_birth_from_the_profile_update_page() {
		boolean actual = pe.date_of_birth_text_is_displayed();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * gender
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	@When("user click on the gender dropdown and select not to mention value from the dropdown")
	public void user_click_on_the_gender_dropdown_and_select_not_to_mention_value_from_the_dropdown() {
	    pe.select_gender_dropdown_is_clicked();
	    pe.select_gender_dropdown_not_to_mention_option_is_clicked();
	    boolean actual = pe.save_changes_button_is_clickable();
	    Assert.assertEquals(actual, false);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the gender dropdown and select female value from the dropdown")
	public void user_click_on_the_gender_dropdown_and_select_female_value_from_the_dropdown() {
		pe.select_gender_dropdown_is_clicked();
	    pe.select_gender_dropdown_female_option_is_clicked();
	    boolean actual = pe.save_changes_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@When("user click on the gender dropdown and select male value from the dropdown")
	public void user_click_on_the_gender_dropdown_and_select_male_value_from_the_dropdown() {
		pe.select_gender_dropdown_is_clicked();
	    pe.select_gender_dropdown_male_option_is_clicked();
	    boolean actual = pe.save_changes_button_is_clickable();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	@Then("Verify that save changes button should be clickable and redirect to the profile page")
	public void verify_that_save_changes_button_should_be_clickable_and_redirect_to_the_profile_page() {
	    pe.save_changes_button_is_clicked();
	    boolean actual = pr.profile_text_in_the_left_top_corner_is_displayed();
	    pr.edit_button_is_clicked();
	    Assert.assertEquals(actual, true);
		logger.info(Thread.currentThread().getStackTrace()[1].getMethodName());
		AppHooks.scn.log(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
}
