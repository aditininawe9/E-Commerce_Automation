package com.testingacademy.Utils.pages;

import com.testingacademy.Utils.base.BaseTest;
import com.testingacademy.Utils.utils.WaitHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BaseTest {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);

        try {
            driver.findElement(loginButton).click();
        }catch(Exception e) {
            System.out.println("Login button is not clickable");
        }
    }

    By errorMessage = By.xpath("//h3[@data-test='error']");
    public String getErrorMessage() {
        try {
            return driver.findElement(errorMessage).getText();
        }catch(Exception e) {
            return "Error message not displayed";
        }
    }

    public void handlePasswordAlert() {
        try {
            Thread.sleep(2000); // small wait for alert

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();

        } catch (Exception e) {
            System.out.println("No alert present");
        }
    }
}
