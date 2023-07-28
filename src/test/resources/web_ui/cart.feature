@cart
Feature: Cart

  #ADD TO CART TEST FROM HOMEPAGE
  @positive-cart-test
  Scenario: user can add a product to the cart from the home page
    Given user already signed in and on the home page
    When user click Add to cart button of Sauce Labs Backpack
    Then Sauce Labs Backpack is added to the cart

  @boundaries-cart-test
  Scenario: user can add all product to the cart from the home page
    Given user already signed in and on the home page
    When user click all Add to cart button
    Then the products are added to the cart

  @boundaries-cart-test
  Scenario: user can add the quantity of some product from the home page
    Given user already signed in and on the home page
    When user click Add to cart button two times
    Then the quantity of the product increases

  @positive-cart-test
  Scenario: user can remove the product from the cart from the home page
    Given user already signed in and on the home page
    When user click all Add to cart button
    And user click all Remove button
    Then the products are all removed from the cart


  #ADD TO CART FROM DETAIL PRODUCT
  @positive-cart-test
  Scenario: user can add a product to the cart from the detail product page
    Given user already signed in and on the home page
    When user click on the Sauce Labs Backpack title
    And user click Add to cart button of Sauce Labs Backpack
    Then Sauce Labs Backpack is added to the cart

  @boundaries-cart-test
  Scenario: user can add the quantity of some product from the detail product page
    Given user already signed in and on the home page
    When user click on the Sauce Labs Backpack title
    And user click Add to cart button two times
    Then the quantity of the product increases

  @positive-cart-test
  Scenario: user can remove the product from the detail product page
    Given user already signed in and on the home page
    When user click on the Sauce Labs Backpack title
    And user click Add to cart button of Sauce Labs Backpack
    And user click Remove button from the detail product
    Then Sauce Labs Backpack is removed from the cart

  @boundaries-cart-test
  Scenario: user can add all products to the cart from the detail product page
    Given user already signed in and on the home page
    When user click on the product title, add to cart button and repeat it for every product
    Then the products are added to the cart

  #ON MAIN CART PAGE
  @positive-cart-test
  Scenario: user can remove the added product from the cart page
    Given user already signed in and on the home page
    When user click Add to cart button of Sauce Labs Backpack
    And user click Cart button
    And user click Remove button
    Then Sauce Labs Backpack is removed from the cart

  @positive-cart-test
  Scenario: user can go back to the home page from the cart page
    Given user already signed in and on the home page
    When user click Cart button
    And user click Continue Shopping button
    Then user will be directed to the home page








