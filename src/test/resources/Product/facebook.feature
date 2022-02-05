Feature: to validate the Facebook login Functionality

  Scenario: to validate the login with invalid username and invalid password
    Given user need to be in login page
    When user should enter invalid username and invalid password
    And user clicks the login button
    Then user will navigate to invalid credential page
