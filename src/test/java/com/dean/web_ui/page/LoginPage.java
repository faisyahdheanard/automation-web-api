package com.dean.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameTextBox = By.id("user-name");
    By passwordTextBox = By.id("password");
    By loginButton = By.id("login-button");

    public void goToLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(usernameTextBox).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateErrorAppear(String errorMessage) {
        assertTrue(driver.getPageSource().contains(errorMessage));
    }

    public void validateOnTheLoginPage() {
        assertTrue(driver.findElement(loginButton).isDisplayed());
    }
}

