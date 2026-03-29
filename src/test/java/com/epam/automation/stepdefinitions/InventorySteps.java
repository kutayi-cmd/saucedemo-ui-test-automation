package com.epam.automation.stepdefinitions;

import com.epam.automation.pages.InventoryPage;
import com.epam.automation.pages.LoginPage;
import com.epam.automation.utils.ConfigReader;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class InventorySteps {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Given("user logs in with valid credentials")
    public void userLogsInWithValidCredentials() {
        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );
    }

    @Then("user should be redirected to inventory page")
    public void userShouldBeRedirectedToInventoryPage() {
        Assertions.assertTrue(inventoryPage.isInventoryPageOpened());
    }

    @And("Swag Labs title on inventory page should be visible")
    public void swagLabsTitleOnInventoryPageShouldBeVisible() {
        Assertions.assertTrue(inventoryPage.isSwagLabsTitleDisplayed());
    }

    @And("cart icon should be visible")
    public void cartIconShouldBeVisible() {
        Assertions.assertTrue(inventoryPage.isCartIconDisplayed());
    }

    @And("social media links should be visible")
    public void socialMediaLinksShouldBeVisible() {
        Assertions.assertTrue(inventoryPage.areSocialLinksDisplayed());
    }

    @And("sorting dropdown should be visible")
    public void sortingDropdownShouldBeVisible() {
        Assertions.assertTrue(inventoryPage.isSortingDropdownDisplayed());
    }

    @And("sorting dropdown should contain correct options")
    public void sortingDropdownShouldContainCorrectOptions() {
        List<String> options = inventoryPage.getSortingOptions();

        Assertions.assertTrue(options.contains("Name (A to Z)"));
        Assertions.assertTrue(options.contains("Name (Z to A)"));
        Assertions.assertTrue(options.contains("Price (low to high)"));
        Assertions.assertTrue(options.contains("Price (high to low)"));
    }

    @And("menu icon should be visible")
    public void menuIconShouldBeVisible() {
        Assertions.assertTrue(inventoryPage.isMenuButtonDisplayed());
    }

    @When("user clicks the menu icon")
    public void userClicksTheMenuIcon() {
        inventoryPage.clickMenuButton();
    }

    @Then("menu should contain correct items")
    public void menuShouldContainCorrectItems() {
        Assertions.assertTrue(inventoryPage.areMenuItemsDisplayed());
    }
}