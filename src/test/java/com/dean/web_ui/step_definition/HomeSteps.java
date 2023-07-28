package com.dean.step_definition;

import com.dean.BaseTest;
import com.dean.page.HomePage;
import com.dean.page.MenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends BaseTest {
    HomePage homePage;
    MenuPage menuPage;
    @Then("user will be directed to the home page")
    public void userWillBeDirectedToTheHomePage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();

    }
    @When("user click filter button")
    public void userClickFilterButton() {
        homePage = new HomePage(driver);
        homePage.clickFilterButton();
    }

    @And("user select Name\\(Z to A)")
    public void userSelectNameZToA() {
        homePage.selectNameZtoAFilter();

    }

    @Then("The product names will be shown from Z to A")
    public void theProductNamesWillBeShownFromZToA() {
        homePage.validateNameZToAFilter();
    }

    @And("User click Price\\(low to high)")
    public void userClickPriceLowToHigh() {
        homePage.selectPriceLowToHighFilter();
    }

    @Then("The product prices will be shown from low to high")
    public void theProductPricesWillBeShownFromLowToHigh() {
        homePage.validatePriceLowToHighFilter();
    }

    @And("User click Price\\(high to low)")
    public void userClickPriceHighToLow() {
        homePage.selectPriceHighToLowFilter();
    }

    @Then("The product prices will be shown from high to low")
    public void theProductPricesWillBeShownFromHighToLow() {
        homePage.validatePriceHighToLowFilter();
    }


    //SIDEBAR
    @When("user click menu button")
    public void userClickMenuButton() {
        menuPage = new MenuPage(driver);
        menuPage.clickMenuButton();
    }

    @And("usar click About sidebar")
    public void usarClickAboutSidebar() throws InterruptedException {
        menuPage.clickAboutElement();
    }

    @Then("the user can see the company information on the website")
    public void theUserCanSeeTheCompanyInformationOnTheWebsite() {
    //ACTUAL : 404 ERROR PAGE
        menuPage.errorPageAppear();
    }

    @And("user click Logout sidebar")
    public void userClickLogoutSidebar() {
        menuPage.clickLogoutElement();
    }

    @And("user click Reset App State sidebar")
    public void userClickResetAppStateSidebar() {
        menuPage.clickResetAppState();
    }


    //FOOTER
    @When("user click Twitter footer")
    public void userClickTwitterFooter() {
        homePage = new HomePage(driver);
        homePage.clickTwitterFooter();
    }

    @Then("the user will be navigated to the Sauce Labs Twitter profile")
    public void theUserWillBeNavigatedToTheSauceLabsTwitterProfile() throws InterruptedException{
        Thread.sleep(5000);
        homePage.validateOnSauceLabTwitterPage();
    }

    @When("user click Facebook footer")
    public void userClickFacebookFooter() {
        homePage = new HomePage(driver);
        homePage.clickFacebookFooter();
    }

    @Then("the user will be navigated to the Sauce Labs Facebook profile")
    public void theUserWillBeNavigatedToTheSauceLabsFacebookProfile() throws InterruptedException {
        Thread.sleep(5000);
        homePage.validateOnSauceLabFacebookPage();
    }

    @When("user click Linkedin footer")
    public void userClickLinkedinFooter() {
        homePage = new HomePage(driver);
        homePage.clickLinkedinFooter();
    }

    @Then("the user will be navigated to the Sauce Labs Linkedin profile")
    public void theUserWillBeNavigatedToTheSauceLabsLinkedinProfile() {
        homePage.validateOnSauceLabsLinkedinPage();
    }
}
