Feature: Adding an employee to the HRMS application

  Background:
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on add employee button

    @Regression @Smoke @Ana @sprint2
  Scenario: Adding an employee
    When user enters first name and last name
    And user clicks on save button
    Then employee added successfully

      @Regression @Smoke @Ana @sprint2
  Scenario: Adding an employee with employee ID
    When user enters first name and last name
    When user enters unique employee ID
    And user clicks on save button
    Then employee added successfully

     @Regression @ErrorMessage @Ana @sprint2
  Scenario: Appropriate error messages
   When user clicks on save button
   When the user submits incomplete or invalid employee info
   Then display clear and visible error message near the respective input fields
