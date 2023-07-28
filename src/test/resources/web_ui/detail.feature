@detail
Feature: Detail Product

  #FROM THE HOME PAGE
  @positive-detail-test
  Scenario: user can see the detailed information of the product
    Given user already signed in and on the home page
    When user click the name of the product
    Then user can see the matched detailed information of the product


  #FROM THE CART PAGE
  @positive-detail-test
  Scenario: user can see the detailed information of the product from the cart page
    Given user already signed in and on the home page
    When user click Add to cart button of Sauce Labs Backpack
    And user click Cart button
    And user click on the Sauce Labs Backpack title
    Then user can see the matched detailed
