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
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/cart.html");

        CartPage cartPage = new CartPage(driver);
        cartPage.removeProduct();
    }
}
