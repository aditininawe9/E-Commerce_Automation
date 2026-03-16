package com.testingacademy.Utils.pages;

import com.testingacademy.Utils.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public void login(String user, String pass) {
        WaitHelper helper = new WaitHelper(driver);
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);

        driver.findElement(loginButton).click();
        //helper.waitForElement(loginButton);
    }
}
