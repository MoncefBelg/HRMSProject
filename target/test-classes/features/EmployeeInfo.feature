Feature: ContactDetailsChanging

  Background:
    #Given User Navigates to HomePage
  @sprint2 @contact
  Scenario: user to be able to change contact details
    When User Enters a Username
    When User Enters a Password
    And user clicks on login button
    When User clicks on PIM
    When User Click on Contact Details
    When User Clicks on Edit Button
    When User Enters a Mobile Phone and Work Email
    Then User Is able to Change His Contact Details And  Save it
