Feature:As an employee add membership details

  Background:
    #Given admin is navigated to HRMS webpage

  @userStory13 @sprint2
  Scenario: adding employee membership details
    When user enters employee username and password
    And user clicks on login button
    Then user clicks on MyInfo option
    Then user clicks on Memberships option
    And user clicks on add button
    Then user select the Membership
    And user select the Subscription Paid By
    And user enters the Subscription Amount
    And user select the Currency
    And user select Subscription Commence Date
    And user select Subscription Renewal Date
    Then user can see employee information
    And user clicks on Save button
    Then employee membership details added successfully






