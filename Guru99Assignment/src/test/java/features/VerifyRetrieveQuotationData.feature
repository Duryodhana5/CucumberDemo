Feature: Verify the Retrieve Quotation Data for Guru99 Insurance Website

  Scenario: Verify retrieve quotation
    Given user Navigate to the home page
    When user Login with Valid credentials
    Then user Verify existing quote is successfully retrieved
    And  user verify user id quote details