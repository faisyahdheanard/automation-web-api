package com.dean.step_definition;

import com.dean.BaseTest;
import com.dean.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseTest {
    LoginPage loginPage;
    @When("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage = new LoginPage(driver);
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click Login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user will be able to see the error message {string}")
    public void userWillBeAbleToSeeTheErrorMessage(String errorMessage) {
        loginPage.validateErrorAppear(errorMessage);
    }

    @Given("user already signed in and on the home page")
    public void userAlreadySignedInAndOnTheHomePage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @Then("user successfully logged out and will be directed back to the login page")
    public void userSuccessfullyLoggedOutAndWillBeDirectedBackToTheLoginPage() {
        loginPage.validateOnTheLoginPage();
    }
}
