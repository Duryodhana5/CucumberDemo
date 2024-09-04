Feature: User Login and Logout with valid data for Guru99 Insurance Website

  Scenario: Successful Login and Logout
    Given the user is on the login page
    When the user enters valid credentials and submits the login form
    Then the user should be successfully logged in and see the dashboard
    And the user should be able to logout from the page successfully
    Then the user should be redirected back to the login page after logout