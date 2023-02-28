Feature: Retail SignIn feature

  @smokeTest
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'phantom.test@gmail.com' and password 'Tek@12345'
    And User click on login button
    Then User should be logged in into Account

  @dryRun
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email            | password | confirmPassword |
      | Zad  | zad123@gmail.com | Zad@1237 | Zad@1237        |
    And User click on SignUp button
    Then User should be logged in into Account
