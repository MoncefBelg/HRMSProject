Feature: Login scenario
  Background:
    #Given admin is navigated to HRMS webpage
  @login @sprint2
  Scenario: Admin login
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in

  @negative @sprint2
  Scenario Outline: Invalid user login
    When user enters "<username>" and "<password>" and verifying the "<error>" for the combinations
    Examples:
      | username | password | error |
      |user     |12345   |Invalid credentials|
      |employee    |Hum@nhrm13|Invalid credentials|
      |          |Hum@n333|Username cannot be empty|
      |user     |           |Password cannot be empty|

