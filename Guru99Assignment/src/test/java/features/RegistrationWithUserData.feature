Feature: User Registration for Guru99 Insurance Website

  Scenario: Successful User Registration
    Given the user is on the registration page
    When the user enters their valid details and submits the registration form
    Then the user should be redirected to the login page
