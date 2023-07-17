Feature: Employee termination
@deleteEmployee @sprint2
  Scenario: As an admin user, I want to have the ability to terminate the employment of specified employees in the system using employee id
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user accesses the list of employees in the system
    And select a specified employee from the list
    And navigate to the employee's job page
    And select the option to terminate the employment of the specified employee
    Then specified employee is terminated