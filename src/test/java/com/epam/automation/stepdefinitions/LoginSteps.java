package com.epam.automation.stepdefinitions;

import com.epam.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Then("username field should be visible")
    public void usernameFieldShouldBeVisible() {
        Assertions.assertTrue(loginPage.isUsernameFieldDisplayed());
    }

    @And("password field should be visible")
    public void passwordFieldShouldBeVisible() {
        Assertions.assertTrue(loginPage.isPasswordFieldDisplayed());
    }

    @And("login button should be visible")
    public void loginButtonShouldBeVisible() {
        Assertions.assertTrue(loginPage.isLoginButtonDisplayed());
    }

    @And("Swag Labs title should be visible")
    public void swagLabsTitleShouldBeVisible() {
        Assertions.assertTrue(loginPage.isSwagLabsTitleDisplayed());
    }
}