package com.dean.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckoutButton() {
        WebElement checkOutButton = driver.findElement(By.id("checkout"));
        checkOutButton.click();
    }

    public void validateOnCheckoutPage() {
        WebElement checkOutTitle = driver.findElement(By.cssSelector(".title"));
        assertTrue(checkOutTitle.isDisplayed());
        assertEquals("Checkout: Your Information", checkOutTitle.getText());
    }

    By firstNameTextBox = By.id("first-name");
    By lastNameTextBox = By.id("last-name");
    By zipTextBox = By.id("postal-code");

    public void inputFirstName(String firstName) {
        driver.findElement(firstNameTextBox).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        driver.findElement(lastNameTextBox).sendKeys(lastName);
    }

    public void inputZipCode(String zipCode) {
        driver.findElement(zipTextBox).sendKeys(zipCode);
    }

    public void clickCancelButton() {
        WebElement cancelButton = driver.findElement(By.id("cancel"));
        cancelButton.click();
    }

    public void clickContinueButton() {
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
    }

}
