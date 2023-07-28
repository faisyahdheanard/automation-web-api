package com.dean.step_definition;

import com.dean.BaseTest;
import com.dean.page.LoginPage;
import io.cucumber.java.en.Given;

public class BrowserSteps extends BaseTest {
    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }
}
