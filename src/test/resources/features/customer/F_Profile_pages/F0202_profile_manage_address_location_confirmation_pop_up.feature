 @location_confirmation_pop_up
Feature: Validate location confirmation in customer application
 
 
    @location_confirmation_pop_up_elements
    Scenario: Validate location confirmation pop up in the profile manage address page
    Given Verify that user is on the profile manage address location confirmation pop up of the customer application
    When user click on the add new address link should open the respected pop up in the profile manage address add new address page
    Then Verify that x button should be displayed in the profile manage address add new address page
    Then Verify that x button should be clickable in the profile manage address add new address page
    Then Verify that location access is required text should be displayed in the profile manage address add new address page
    Then Verify that subtitle of location access is required text should be displayed in the profile manage address add new adddress page
    Then Verify that give access button should be displayed in the in the profile manage address add new address page
    Then Verify that give access button should be clickable in the in the profile manage address add new address page
    Then Verify that cancel button should be displayed in the in the profile manage address add new address page
    Then Verify that cancel button should be clickable in the in the profile manage address add new address page
    
    
    @location_confirmation_pop_up_x_button
    Scenario: Validate add new address in the profile manage address page
    Given Verify that user is on the profile manage address location confirmation pop up of the customer application
    Then user click on the x button should be redirect on the manage address page
    
    
    @location_confirmation_pop_up_cancel_button
    Scenario: Validate add new address in the profile manage address page
    Given Verify that user is on the profile manage address location confirmation pop up of the customer application
    Then user click on the cancel button should be redirect on the manage address page
    
    
     
    @location_confirmation_pop_up_give_access_button
    Scenario: Validate add new address in the profile manage address page
    Given Verify that user is on the profile manage address location confirmation pop up of the customer application
    Then user click on the give access button should be redirect on the manage address page 
   
    
    
    
    