Feature: Add current job details for employees

Background:
   #Given admin is navigated to HRMS webpage
  When user enters admin username and password
  And user clicks on login button
  Then user is successfully logged in
  When user clicks on PIM option and Employee list option
  Then user enters valid employee ID in textBox
  And user clicks on search button
  Then user is able to see employee information

@regression @sprint2 @userStory7
  Scenario: adding job details

    When user clicks on employee information table
    And user clicks on job button and edit button
    Then user select the job title
    And user select the employment status
    And user select the joined date
    And user select the sub unit
    And user select the location
    And user select start date of a employment contract
    And user select end date of a employment contract
    And user add contract details
    Then user is able to see the employee information
    And user clicks on save button
    Then job details added successfully
