@tag
Feature: User Sign Up

@SignUp
  Scenario: Successful user registration
    Given User is on the registration page
    When User enters "vishal" "sutar" "vishalsutar@gmail.com" "Pass@1234"
    And Clicks on create account button
    Then Account is created successfully
