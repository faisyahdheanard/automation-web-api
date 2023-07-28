package com.dean.step_definition;

import com.dean.BaseTest;
import com.dean.page.DetailProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DetailSteps extends BaseTest {
    DetailProductPage detailProductPage;
    @When("user click the name of the product")
    public void whenUserClickProductName() {
        detailProductPage = new DetailProductPage(driver);
        detailProductPage.clickProductName();
    }

    @Then("user can see the matched detailed information of the product")
    public void thenUserCanSeeMatchedProductInformation()  {
        //included with the detailProductPage.clickProductName();
    }

    @When("user click on the Sauce Labs Backpack title")
    public void userClickOnTheSLBTitle() {
        detailProductPage = new DetailProductPage(driver);
        detailProductPage.clickSLBTitle();
    }

    @And("user click Remove button from the detail product")
    public void userClickRemoveButtonFromTheDetailProduct() {
        detailProductPage.clickRemoveButtonFromDetailPage();
    }

    @When("user click on the product title, add to cart button and repeat it for every product")
    public void userClickOnTheProductTitleAddToCartButtonAndRepeatItForEveryProduct() {
        detailProductPage = new DetailProductPage(driver);
        detailProductPage.clickAll();
    }

    @Then("user can see the matched detailed")
    public void userCanSeeTheMatchedDetailed() {
        detailProductPage.validateNameAppeared("Sauce Labs Backpack");
    }
}
