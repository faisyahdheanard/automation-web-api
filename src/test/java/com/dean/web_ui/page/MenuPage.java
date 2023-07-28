package com.dean.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MenuPage {
    WebDriver driver;
    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    By menuButton = By.id("menu_button_container");
    By allItemsButtonElement = By.id("inventory_sidebar_link");
    By aboutElement = By.id("about_sidebar_link");
    By logOutElement = By.id("logout_sidebar_link");
    By resetAppState = By.id("reset_sidebar_link");

    public void clickMenuButton () {
        driver.findElement(menuButton).click();
    }

    public void clickAllItemsButton() {
        driver.findElement(allItemsButtonElement).click();
    }

    public void clickAboutElement() {
        driver.findElement(aboutElement).click();
    }

    public void errorPageAppear() {
        WebElement errorMessage = driver.findElement(By.xpath("//h1[contains(text(),'ERROR 404')]"));
        assertTrue(errorMessage.isDisplayed());
    }

    public void clickLogoutElement() {
        driver.findElement(logOutElement).click();
    }

    public void clickResetAppState() {
        driver.findElement(resetAppState).click();
    }
}
