Feature: Login scenario
  Background:
    #Given admin is navigated to HRMS webpage
  @login
  Scenario: Admin login
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in



