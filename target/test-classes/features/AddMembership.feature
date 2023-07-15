
Feature: Add Membership

  Background:
    Given user is logged in with admin credentials

   @Veranda
  Scenario Outline: admin user should be able to add membership
    When admin user navigates to Qualifications
    And admin user selects Membership
    And admin user adding new "<MembershipName>"
     Then verify new membership is created
    Examples:
      |MembershipName|
      |phone 14promax|



