@checkout
Feature: Checkout

  @positive-checkout-test
  Scenario: user can go back to the cart page from the checkout page
    Given user already signed in and on the home page
    When user click Cart button
    And user click Checkout button
    And user click Cancel button
    Then user will be directed back to the cart page

  @boundaries-checkout-test
  Scenario: user can checkout one product with valid data
    Given user already signed in and on the home page
    When user click Add to cart button of Sauce Labs Backpack
    And user click Cart button
    And user click Checkout button
    And user input valid data
    And user click Continue button
    Then user successfully completes the checkout process
    # ACTUAL : there is no continuation about the successful checkout process information

  @negative-checkout-test
  Scenario: user can checkout with a name that consists of letters and numbers
    Given user already signed in and on the home page
    When user click Add to cart button of Sauce Labs Backpack
    And user click Cart button
    And user click Checkout button
    And user input invalid data with the name consist of numbers
    And user click Continue button
    Then user will be able to see the error message "Please fill in the name field with letters only, without numbers or symbols."
    #FAILED, ACTUAL : PASSED AND THERE IS NO ERROR MESSAGE

  @positive-checkout-test
  Scenario: user can checkout with a name that consists of letters and special characters
    Given user already signed in and on the home page
    When user click Add to cart button of Sauce Labs Backpack
    And user click Cart button
    And user click Checkout button
    And user input invalid data with the name consist of special characters
    And user click Continue button
    Then user will be able to see the error message "Please fill in the name field with letters only, without numbers or symbols."
    #FAILED, ACTUAL : PASSED AND THERE IS NO ERROR MESSAGE

  @boundaries-checkout-test
  Scenario: user can checkout without some product on cart
    Given user already signed in and on the home page
    When user click Cart button
    And user click Checkout button
    And user input valid data
    And user click Continue button
    Then user will be able to see the error message "Oops! Your cart is empty. Please add some items to proceed with checkout."
    #FAILED, ACTUAL ; PASSED AND THERE IS NO ERROR MESSAGE

  @boundaries-checkout-test
  Scenario: user can checkout all products
    Given user already signed in and on the home page
    When user click all Add to cart button
    And user click Cart button
    And user click Checkout button
    And user input valid data
    And user click Continue button
    Then user successfully completes the checkout process
    # ACTUAL : there is no continuation about the successful checkout process information

  @negative-checkout-test
  Scenario: user can checkout without input data
    Given user already signed in and on the home page
    When user click all Add to cart button
    And user click Cart button
    And user click Checkout button
    And user click Continue button
    Then user will be able to see the error message "Please fill in all required fields (First Name, Last Name, Zip Code) to proceed with the checkout."
    #ACTUAL : PASSED AND THERE IS NO ERROR MESSAGE


