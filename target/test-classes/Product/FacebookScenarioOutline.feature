Feature: to validate the Facebook login Functionality

  Scenario Outline: to validate the login with invalid username and invalid password
    Given user need to be in login page
    When user should enter invalid "<username>" and "<password>"
    And user clicks the login button
    Then user will navigate to invalid credential page

    Examples: 
      | username | password |
      | Java     | java     |
      | Selenium | selenium |
      | Greens   | greens   |
