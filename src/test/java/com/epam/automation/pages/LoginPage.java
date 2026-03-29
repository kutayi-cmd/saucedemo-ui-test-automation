package com.epam.automation.pages;

import com.epam.automation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver = DriverFactory.getDriver();

    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By swagLabsTitle = By.className("login_logo");

    public boolean isUsernameFieldDisplayed() {
        return driver.findElement(usernameField).isDisplayed();
    }

    public boolean isPasswordFieldDisplayed() {
        return driver.findElement(passwordField).isDisplayed();
    }

    public boolean isLoginButtonDisplayed() {
        return driver.findElement(loginButton).isDisplayed();
    }

    public boolean isSwagLabsTitleDisplayed() {
        return driver.findElement(swagLabsTitle).isDisplayed();
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
