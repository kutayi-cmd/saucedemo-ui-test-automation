package com.epam.automation.stepdefinitions;

import com.epam.automation.pages.InventoryItemPage;
import com.epam.automation.pages.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class InventoryItemSteps {

    //LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    InventoryItemPage inventoryItemPage = new InventoryItemPage();


    @And("user clicks on a product")
    public void userClicksOnAProduct() {
        inventoryPage.clickFirstProduct();
    }

    @Then("user should be redirected to item page")
    public void userShouldBeRedirectedToItemPage() {
        Assertions.assertTrue(inventoryItemPage.isItemPageOpened());
    }

    @And("product image should be visible")
    public void productImageShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.isProductImageDisplayed());
    }

    @And("product name should be visible")
    public void productNameShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.isProductNameDisplayed());
    }

    @And("product description should be visible")
    public void productDescriptionShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.isProductDescriptionDisplayed());
    }

    @And("product price should be visible")
    public void productPriceShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.isProductPriceDisplayed());
    }

    @And("add to cart button should be visible")
    public void addToCartButtonShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.isAddToCartButtonDisplayed());
    }

    @And("back to products button should be visible")
    public void backToProductsButtonShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.isBackButtonDisplayed());
    }

    @And("cart icon on item page should be visible")
    public void cartIconOnItemPageShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.isCartIconDisplayed());
    }

    @And("social media links on item page should be visible")
    public void socialMediaLinksOnItemPageShouldBeVisible() {
        Assertions.assertTrue(inventoryItemPage.areSocialLinksDisplayed());
    }
}