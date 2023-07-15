Feature: Search an employee

  Background:
    #Given user is navigated to HRMS application
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option and Employee list option

  @smoke @sprint2
  Scenario: Search employee by name
    And user enters valid employee name in name text box
    And user clicks on search button
    Then user is able to see employee information

  @smoke @sprint2
  Scenario: Search employee by id
    And user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information

  @negative @smoke @sprint2
  Scenario: No records found
    And user enters invalid employee id in idtext box
    And user clicks on search button
    Then user is going to see no records found message