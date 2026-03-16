package com.testingacademy.Utils.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    By addBackpack = By.id("add-to-cart-sauce-labs-backpack");

    public void setAddBackpack() {
        driver.findElement(addBackpack).click();
    }

    By cart = By.id("shopping_cart_container");

    public void setCart() {
        driver.findElement(cart).click();
    }
}
