@Profile_logout_function
Feature: Validate logout function in customer application

  @logout_function
  Scenario: Validate user should be able to logout and login again in the application
    Given Verify that user is on the profile page for logout function of the customer application
    When user click on the kebab menus and click on option log out button
    Then Verify that user is on the starting page of the application after log out from the applicaiton
    Given Verify that user is on the profile page for logout function of the customer application
    
    