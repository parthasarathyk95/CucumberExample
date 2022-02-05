Feature: to validate the search functionality in amazon page

  Scenario: to search random product in amazon page
    Given user need to be in amazon page
    When user should enter the product in search box
    And user clicks the search button
    Then user will navigate to the product
