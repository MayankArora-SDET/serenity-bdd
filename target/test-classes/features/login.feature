
@Login
Feature: Login Functionality

  @Smoke
  Scenario: Successfull Login
    Given Navigate to Dev Application
    When Enter Creds
    Then Verify Dasboard page