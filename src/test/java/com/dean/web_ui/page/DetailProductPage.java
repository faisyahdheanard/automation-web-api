package com.dean.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetailProductPage {
    WebDriver driver;
    public DetailProductPage(WebDriver driver) {
        this.driver = driver;
    }


    //FOR VALIDATE EVERY PRODUCT NAME APPEARED (LOOP METHOD INQUIRES)
    public void clickProductName() {
        for(int itemID = 0; itemID <= 5; itemID++){
            WebElement productName = driver.findElement(By.id("item_" + itemID + "_title_link"));
            productName.click();
            validateProductNameAppeared(itemID);
            clickBackToProducts();
        }
    }

    private void validateProductNameAppeared(int itemId) {
        String[] expectedNames = {
                "Sauce Labs Bike Light",
                "Sauce Labs Bolt T-Shirt",
                "Sauce Labs Onesie",
                "Test.allTheThings() T-Shirt (Red)",
                "Sauce Labs Backpack",
                "Sauce Labs Fleece Jacket"
        };

        String expectedName = expectedNames[itemId];
        WebElement productNameAppeared = driver.findElement(By.cssSelector(".inventory_details_name.large_size"));
        assertEquals(expectedName, productNameAppeared.getText());
    }

    private void clickBackToProducts() {
        WebElement backToProduct = driver.findElement(By.id("back-to-products"));
        backToProduct.click();
    }


    //FOR ONE PRODUCT TEST INQUIRE (Sauce Labs Backpack/SLB)
    By productName1 = By.id("item_4_title_link");
    public void clickSLBTitle() {
        driver.findElement(productName1).click();
    }

    public void validateNameAppeared(String expectedName) {
        WebElement nameAppeared = driver.findElement(By.cssSelector(".inventory_details_name.large_size"));
        assertTrue(nameAppeared.getText().contains(expectedName));
    }

    public void clickRemoveButtonFromDetailPage() {
        WebElement removeButton1 = driver.findElement(By.id("remove-sauce-labs-backpack"));
        removeButton1.click();
    }


    //FOR ALL PRODUCT TEST INQUIRE
    public void clickAll () {
        for (int itemId = 0; itemId <= 5; itemId++) {
            String itemIdString = "item_" + itemId + "_title_link";
            WebElement productNameElement = driver.findElement(By.id(itemIdString));
            productNameElement.click();
            clickAddToCart(itemId);
            clickBackToProducts();
        }
    }

    private String[] itemNamesElementAddition() {
        String[] itemNames = {
                "-sauce-labs-bike-light",
                "-sauce-labs-bolt-t-shirt",
                "-sauce-labs-onesie",
                "-test.allthethings()-t-shirt-(red)",
                "-sauce-labs-backpack",
                "-sauce-labs-fleece-jacket"
        };
        return itemNames;
    }

    private void clickAddToCart(int itemId) {
            String addToCartButtonId = "add-to-cart" + itemNamesElementAddition()[itemId];
            WebElement addToCartButton = driver.findElement(By.id(addToCartButtonId));
            addToCartButton.click();
    }
}
