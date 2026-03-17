package com.testingacademy.Utils.pages;

import com.testingacademy.Utils.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By removeElement = By.id("remove-sauce-labs-backpack");

    public void removeProduct() {
        WaitHelper.waitForElementClickable(driver, removeElement).click();
        driver.findElement(removeElement).click();
    }
}
