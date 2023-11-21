@Profile_manage_address_page
Feature: Validate profile manage address page in customer application

  @profile_manage_address_page_elements
  Scenario: Validate user should get the respected elements in the profile manage address page
    Given Verify that user is on the profile manage address page of the customer application
    Then Verify that manage address title text should be displayed in the profile manage address page
    Then Verify that back button should be displayed in the profile manage address page
    Then Verify that back button should be clickable in the profile manage address page
    Then Verify that plus add new address button should be displayed in the profile manage address page
    Then Verify that plus add new address button should be clickable in the profile manage address page
    Then Verify that save changes button should be displayed in the profile manage address page
    Then Verify that save changes button should be clickable in the profile manage address page
    
    
    
      @back_button_p
  Scenario: Validate back button in the profile manage address page
    Given Verify that user is on the profile manage address page of the customer application
    When after click on the back button profile page should be displayed in the profile mange address page
    
   
    
    
    