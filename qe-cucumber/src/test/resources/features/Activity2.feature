@activity2
Feature: Login Test

  Scenario: Testing Login
    Given the user is on the login page
    When the user enters username and password
    And clicks the Submit button
    Then get the confirmation message and verify it