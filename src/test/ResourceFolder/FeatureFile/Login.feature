Feature: Login
  @login
  Scenario: User should be log in successfully
    Given user is on homepage
    When user enter details
    Then user should be login