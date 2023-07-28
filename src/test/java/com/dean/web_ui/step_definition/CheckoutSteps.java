package com.dean.step_definition;

import com.dean.BaseTest;
import com.dean.page.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CheckoutSteps extends BaseTest {
    CheckoutPage checkoutPage;
    @And("user click Checkout button")
    public void userClickCheckoutButton() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.clickCheckoutButton();
        checkoutPage.validateOnCheckoutPage();
    }

    @And("user input valid data")
    public void userInputValidData() {
        checkoutPage.inputFirstName("Faisyah");
        checkoutPage.inputLastName("Dheana");
        checkoutPage.inputZipCode("000");
    }

    @Then("user successfully completes the checkout process")
    public void userSuccessfullyCompletesTheCheckoutProcess() {
    }

    @And("user click Continue button")
    public void userClickContinueButton() throws InterruptedException{
        Thread.sleep(5000);
        checkoutPage.clickContinueButton();
    }

    @And("user input invalid data with the name consist of numbers")
    public void userInputInvalidDataWithTheNameConsistOfNumbers() {
        checkoutPage.inputFirstName("Faisyah90");
        checkoutPage.inputLastName("Dheana05");
        checkoutPage.inputZipCode("000");
    }

    @And("user input invalid data with the name consist of special characters")
    public void userInputInvalidDataWithTheNameConsistOfSpecialCharacters() {
        checkoutPage.inputFirstName("Faisyah:)");
        checkoutPage.inputLastName("Dheana05^.^");
        checkoutPage.inputZipCode("000");
    }

    @And("user click Cancel button")
    public void userClickCancelButton() {
        checkoutPage.clickCancelButton();
    }
}
