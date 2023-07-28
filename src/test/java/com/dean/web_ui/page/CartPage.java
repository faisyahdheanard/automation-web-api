package com.dean.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


    //THE MAIN CART PAGE SCOPE
    By cartButton = By.id("shopping_cart_container");
    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }

    public void clickContinueShoppingButton() {
        WebElement continueShoppingButton = driver.findElement(By.id("continue-shopping"));
        continueShoppingButton.click();
    }

    public void validateOnCartPage() {
        WebElement cartTitle = driver.findElement(By.cssSelector(".title"));
        assertTrue(cartTitle.isDisplayed());
        assertEquals("Your Cart", cartTitle.getText());
    }


    //FOR ONE PRODUCT TEST INQUIRE (Sauce Labs Backpack/SLB)
    public void clickAddToCartButton() {
        WebElement addToCartBackpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartBackpack.click();
    }

    public void validateSLBAppeared() {
        WebElement productAppeared = driver.findElement(By.cssSelector(".inventory_item_name"));
        assertTrue(productAppeared.isDisplayed());
        assertEquals("Sauce Labs Backpack", productAppeared.getText());
    }

    public void clickRemoveButtonOnCartPage() {
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeButton.click();
    }

    public void validateSLBRemoved() {
        String productNameToRemoved = "Sauce Labs Backpack";
        assertTrue(validateTheProductIsRemoved(productNameToRemoved));
    }

    private boolean validateTheProductIsRemoved(String productName) {
        List<WebElement> productElements = driver.findElements(By.cssSelector(".inventory_item_name"));
        for (WebElement productElement : productElements){
            if(productElement.getText().equals(productName)) {
                return false;
            }
        }
        return true;
    }


    //FOR ALL PRODUCT TEST INQUIRE
    public void clickAllAddToCartButton() {
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[contains(text(), 'Add to cart')]"));
        for (WebElement button : addToCartButtons) {
            button.click();
        }
    }

    public void clickAllRemoveButton() {
        List<WebElement> removeButtons = driver.findElements(By.xpath("//button[contains(text(), 'Remove')]"));
        for (WebElement button : removeButtons) {
            button.click();
        }
    }

    public void validateAddedProductOnCart() {
        //the element of each product names
        List<String> productNames = new ArrayList<>();
        productNames.add("Sauce Labs Bike Light");
        productNames.add("Sauce Labs Bolt T-Shirt");
        productNames.add("Sauce Labs Onesie");
        productNames.add("Test.allTheThings() T-Shirt (Red)");
        productNames.add("Sauce Labs Backpack");
        productNames.add("Sauce Labs Fleece Jacket");

        WebElement productNameOnCartElement = driver.findElement(By.cssSelector(".inventory_item_name"));
        String displayedProductName = productNameOnCartElement.getText();
        for (String expectedProductName : productNames) {
            if (expectedProductName.equals(displayedProductName)) {
                return;
            }
        }
        fail("Expected product name not found: " + displayedProductName);
    }

    public void validateTheQuantity() {
        WebElement productQuantity = driver.findElement(By.className("cart_quantity"));
        int quantity = Integer.parseInt(productQuantity.getText());
        assertEquals(productQuantity, quantity + 1);
    }

    public void validateAllProductsAreRemoved() {
        List<WebElement> productAppearedList = driver.findElements(By.cssSelector(".inventory_item_name"));
        assertTrue(productAppearedList.isEmpty());
    }

    //FOR VALIDATE THE RESET APP STATE SIDEBAR IS WORK
    public void allAddToCartButtonAreAppeared () {
        WebElement addToCartButtons = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
        assertTrue(addToCartButtons.isDisplayed());
    }

}
