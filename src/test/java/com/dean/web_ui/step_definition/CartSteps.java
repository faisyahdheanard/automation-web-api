package com.dean.step_definition;

import com.dean.BaseTest;
import com.dean.page.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps extends BaseTest {
    CartPage cartPage;

    @When("user click Add to cart button of Sauce Labs Backpack")
    public void userClickAddToCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickAddToCartButton();
    }
    @When("user click all Add to cart button")
    public void userClickAllAddToCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickAllAddToCartButton();
    }

    @When("user click Add to cart button two times")
    public void userClickAddToCartButtonTimes() {
        cartPage = new CartPage(driver);
        cartPage.clickAddToCartButton();
        cartPage.clickAddToCartButton();
    }

    @Then("the products are added to the cart")
    public void theProductIsAddedToTheCart() {
        cartPage = new CartPage(driver);
        cartPage.clickCartButton();
        cartPage.validateAddedProductOnCart();
    }

    @Then("the quantity of the product increases")
    public void theQuantityOfTheProductIncreases() {
        cartPage.clickCartButton();
        cartPage.validateTheQuantity();
//        Actual : Add to cart button changed into Remove button
//        Solution : there should be a button to increase/decrease the product quantity
    }

    @Then("Sauce Labs Backpack is removed from the cart")
    public void theProductIsRemovedFromTheCart() throws InterruptedException{
        cartPage.clickCartButton();
        Thread.sleep(5000);
        cartPage.validateSLBRemoved();
    }
    @Then("the user preferences should be reset to default settings")
    public void theUserPreferencesShouldBeResetToDefaultSettings() {
        cartPage.allAddToCartButtonAreAppeared();
    }

    @Then("Sauce Labs Backpack is added to the cart")
    public void sauceLabsBackpackIsAddedToTheCart() {
        cartPage.clickCartButton();
        cartPage.validateSLBAppeared();
    }

    @Then("the products are all removed from the cart")
    public void theProductsAreAllRemovedFromTheCart() {
        cartPage.clickCartButton();
        cartPage.validateAllProductsAreRemoved();
    }


    @And("user click Cart button")
    public void userClickCartButton() {
        cartPage = new CartPage(driver);
        cartPage.clickCartButton();
    }

    @And("user click Remove button")
    public void clickRemoveButton() {
        //TEST FOR ONE PRODUCT
        cartPage.clickRemoveButtonOnCartPage();
    }

    @And("user click Continue Shopping button")
    public void clickContinueShoppingButton() {
        cartPage.clickContinueShoppingButton();
    }

    @And("user click all Remove button")
    public void userClickAllRemoveButton() {
        cartPage.clickAllRemoveButton();
    }

    @Then("user will be directed back to the cart page")
    public void userWillBeDirectedBackToTheCartPage() {
        cartPage.validateOnCartPage();
    }
}
