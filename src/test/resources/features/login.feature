
@Login
Feature: Login Functionality

  @Smoke
  Scenario: Successfull Login
    Given Navigate to QA Application
    When Enter Creds
    Then Verify Dasboard page
    
  @API
  Scenario: Verify GET request
  	Given Navigate to QA Application
    Given I set the endpoint to "https://opensource-demo.orangehrmlive.com/web/index.php/core/i18n/messages"
    When I send a GET request
    Then the response status code should be 200
    And the response should contain "Add Job Title"