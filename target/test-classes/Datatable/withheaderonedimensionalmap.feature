Feature: to validate the search functionality in amazon

  Scenario: to search the random product in amazon
    Given user need to be in amazon homepage
    When user should enter product in searchbox
      | Product    | iphone     |
      | NewProduct | mac laptop |
    And user clicks the search button
    Then user will navigate to product page
