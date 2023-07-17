Feature: AdminShouldAddLanguage
  Background:
    #Given admin is navigated to HRMS webpage
  @sprint2 @qualification @language @regression
  Scenario: AdminAddLanguage
    When user enters admin username and password
    When user clicks on login button
    When user navigates to Qualification and selects Languages
    Then user can add any language