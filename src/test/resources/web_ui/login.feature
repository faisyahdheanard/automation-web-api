@login
Feature: Login

  @positive-login-test
  Scenario: Login using valid username and password
    Given user is on login page
    When user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click Login button
    Then user will be directed to the home page

  @negative-login-test
  Scenario: Login with adding space after valid username and password
    Given user is on login page
    When user input username with "standard_user "
    And user input password with "secret_sauce"
    And user click Login button
    Then user will be able to see the error message "Epic sadface: Username and password do not match any user in this service"

  @negative-login-test
  Scenario: Login using invalid username and password
    Given user is on login page
    When user input username with "invalid"
    And user input password with "invalid"
    And user click Login button
    Then user will be able to see the error message "Epic sadface: Username and password do not match any user in this service"

  @negative-login-test
  Scenario: Login without providing username and password
    Given user is on login page
    When user input username with ""
    And user input password with ""
    And user click Login button
    Then user will be able to see the error message "Epic sadface: Username is required"

  @negative-login-test
  Scenario: Login using invalid username
    Given user is on login page
    When user input username with "invalid"
    And user input password with "secret_sauce"
    And user click Login button
    Then user will be able to see the error message "Epic sadface: Username and password do not match any user in this service"

  @negative-login-test
  Scenario: Login using invalid password
    Given user is on login page
    When user input username with "standard_user"
    And user input password with "invalid"
    And user click Login button
    Then user will be able to see the error message "Epic sadface: Username and password do not match any user in this service"



