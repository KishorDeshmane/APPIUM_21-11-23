@Profile_update_page
Feature: Validate profile update page in customer application

  @profile_update_page_elements
  Scenario: Validate user should get the respected elements in the edit or update page
    Given Verify that user is on the profile update page of the customer application
    Then Verify that back button should be displayed in the profile update page
    Then Verify that back button should be clickable in the profile update page
    Then Verify that profile pic should be displayed in the profile update page
    Then Verify that edit profile pic button should be displayed in the profile update page
    Then Verify that edit profile pic button should be clickable in the profile update page
    Then Verify that name text should be displayed in name user field from the profile update page
    Then Verify that name user field should be displayed in the profile update page
    Then Verify that name user field should be clickable in the profile update page
    Then Verify that country code dropdown should be displayed in the profile update page
    Then Verify that country code dropdown should be clickable in the profile update page
    Then Verify that mobile number user field should be displayed in the profile update page
    Then Verify that mobile number user field should be clickable in the profile update page
    Then Verify that email text should be displayed in the profile update page
    Then Verify that email user field should be displayed in the profile update page
    Then Verify that email user field should be clickable in the proile update page
    Then Verify that date of birth text should be displayed in the profile update page
    Then Verify that date of birth user field should be displayed in the profile update page
    Then Verify that date of birth user field should be clickable in the profile update page
    Then Verify that select gender dropdown should be displayed in the profile update page
    Then Verify that select gender dropdown should be clickable in the profile update page
    Then Verify that select gender dropdown male option should be displayed in the profile update page
    Then Verify that select gender dropdown male option should be clickable in the profile update page
    Then Verify that select gender dropdwon female option should be displayed in the profile update page
    Then Verify that select gender dropdwon female option should be clickable in the profile update page
    Then Verify that select gender dropdown not to mention option should be displayed in the profile update page
    Then Verify that select gender dropdown not to mention option should be clickable in the profile update page
    Then Verify that save changes should be displayed in the profile update page
    Then Verify that save changes should be clickable in the profile update page

  @back_button
  Scenario: Validate back button in the edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user click on the back button from the profile update page
    Then Verify that user is on the profile page as expected profile header text is displayed

  @pic_edit_button
  Scenario: Validate edit pic in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user click on the edit button in the profile update page
    Then Verify that selet a photo text should be displayed in the update pic page

  @name_empty_field
  Scenario: Validate name user field with empty fields in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user clear the first name and last name from the user field and click on the save changes button
    Then user should be on the same page as expected profile update page
    Then Verify that user should get the respected message below the name user field or pop up in profile update page

  @name_invalid
  Scenario: Validate name user field with invalid text in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user clear the name and send valid text as "       @# 434 #$" in the user field and click on the save changes button
    Then user should be on the same page as expected profile update page
    Then Verify that user should get the respected message below the name user field or pop up in profile update page

  @name_valid
  Scenario: Validate name user field with valid text in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user clear the name and send valid text as "Karan Arjun" in the user field and click on the save changes button
    Then user should be on the profile page as expected profile update page
    Then Verify that user should get the respected message pop up in profile update page

  @country_code_positive
  Scenario: Validate country code dropdown with positive text data in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user click on the country code dropdown and search "+971" in profile update page
    Then Verify that user should able to select United arab emirates country text in profile update page

  @country_code_negative
  Scenario: Validate country code dropdown with negative text data in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user click on the country code dropdown and search "+++++" in profile update page
    Then Verify that user should we cant find yuor country text is displayed in profile update page

  @mobile_number_positive
  Scenario: Validate mobile number user field with positive test data in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user send mobile number "100056789" into the user field and click on the save changes button in profile update page
    Then Verify that user is on the profile page after updating mobile number from profile update page
    Then set older mobile number
    Then Verify that user should get the respected pop up in the profile update page

  @mobile_number_negative
  Scenario: Validate mobile number user field with negative test data in the profile edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user send mobile number "10005678h" into the user field and click on the save changes button in profile update page
    Then Verify that user should be on the same profile update page

  @email_user_field_positive
  Scenario: Validate email user field with positive test data in the edit or updata page
    Given Verify that user is on the profile update page of the customer application
    When user send email address "abcd@gmail.com" into the email user field and click on the save changes button in profile update page
    Then Verfify that user should be on the profile page after updating email from the profile update page

  @email_user_field_negative
  Scenario: Validate email user field with negative test data in the edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user send email address "abcdgmail.com" into the email user field and click on the save changes button in profile update page
    Then Verfify that user should be on the profile edit page after updating email from the profile update page

  @date_of_birth_valid
  Scenario: Validate date of birth user field with positive test data in the edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user send date of birth "10/08/1996" into the DOB user field and click on the save changes button in profile update page
    Then Verfify that user should be on the profile page after updating date of birth from the profile update page

  @date_of_birth_invalid
  Scenario: Validate date of birth user field with negative test data in the edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user send date of birth "10/08/2200" into the DOB user field and click on the save changes button in profile update page
    Then Verfify that user should be on the profile edit page after updating date of birth from the profile update page

    
  @gender
  Scenario: Validate gender dropdown values in the edit or update page
    Given Verify that user is on the profile update page of the customer application
    When user click on the gender dropdown and select female value from the dropdown
    Then Verify that save changes button should be clickable and redirect to the profile page
    When user click on the gender dropdown and select male value from the dropdown
    Then Verify that save changes button should be clickable and redirect to the profile page
    #Validation error pop up
    When user click on the gender dropdown and select not to mention value from the dropdown
    Then Verify that save changes button should be clickable and redirect to the profile page