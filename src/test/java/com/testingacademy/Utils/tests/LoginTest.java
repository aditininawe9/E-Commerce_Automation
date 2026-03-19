package com.testingacademy.Utils.tests;

import com.testingacademy.Utils.base.BaseTest;
import com.testingacademy.Utils.pages.CartPage;
import com.testingacademy.Utils.pages.InventoryPage;
import com.testingacademy.Utils.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void loginAndAddProduct() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
        loginPage.handlePasswordAlert();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.setAddBackpack();
        inventoryPage.setCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.removeProduct();
    }

    @Test
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wrong_user", "wrong_pass");
        String error = loginPage.getErrorMessage();
        Assert.assertEquals(error, "Epic sadface: Username and password do not match any user in this service");
    }
}
