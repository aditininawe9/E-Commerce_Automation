package com.testingacademy.Tests;

import com.testingacademy.Pages.LoginPage;
import com.testingacademy.Utils.configReader;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        configReader config =  new configReader();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(config.getUrl());
    }
    @Test
    @Description("Verify Login")
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
    }
}
