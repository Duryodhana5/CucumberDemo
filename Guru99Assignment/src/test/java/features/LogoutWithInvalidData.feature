Feature: User Logout With Invalid Data for Guru99 Insurance Website

Scenario: Failed Login with Invalid Data
Given the user has navigated to the login page
When the user enters invalid credentials and submits the login form
Then the user should remain on the login page
