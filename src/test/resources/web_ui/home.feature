@Home
Feature: Home

  #FILTER
  @positive-home-test
  Scenario: Can apply a filter to sort the product names from Z to A
    Given user already signed in and on the home page
    When user click filter button
    And user select Name(Z to A)
    Then The product names will be shown from Z to A

  @positive-home-test
  Scenario: user can apply a filter to sort the product prices from low to high
    Given user already signed in and on the home page
    When user click filter button
    And User click Price(low to high)
    Then The product prices will be shown from low to high

  @positive-home-test
  Scenario: user can apply a filter to sort the product prices from high to low
    Given user already signed in and on the home page
    When user click filter button
    And User click Price(high to low)
    Then The product prices will be shown from high to low

  #SIDEBAR (ALL FAILED, ELEMENT HAS ZERO SIZE (start from click menu button))
  @positive-home-test
  Scenario: user can see information about the company
    Given user already signed in and on the home page
    When user click menu button
    And usar click About sidebar
    Then the user can see the company information on the website

  @positive-home-test
  Scenario: user can do Logout
    Given user already signed in and on the home page
    When user click menu button
    And user click Logout sidebar
    Then user successfully logged out and will be directed back to the login page

  @positive-home-test
  Scenario: user can reset the application state
    Given user already signed in and on the home page
    When user click menu button
    And user click all Add to cart button
    And user click Reset App State sidebar
    Then the user preferences should be reset to default settings

  #FOOTER (ALL FAILED, SHOULD TO LOGIN FIRST)
  @positive-home-test
  Scenario: user is successfully directed to to Sauce Labs Twitter Page
    Given user already signed in and on the home page
    When user click Twitter footer
    Then the user will be navigated to the Sauce Labs Twitter profile

  @positive-home-test
  Scenario: user is successfully directed to to Sauce Labs Facebook Page
    Given user already signed in and on the home page
    When user click Facebook footer
    Then the user will be navigated to the Sauce Labs Facebook profile

  @positive-home-test
  Scenario: user is successfully directed to to Sauce Labs Linkedin Page
    Given user already signed in and on the home page
    When user click Linkedin footer
    Then the user will be navigated to the Sauce Labs Linkedin profile



