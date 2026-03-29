package com.epam.automation.pages;

import com.epam.automation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class InventoryItemPage {

    private final WebDriver driver = DriverFactory.getDriver();

    private final By productImage = By.className("inventory_details_img");
    private final By productName = By.className("inventory_details_name");
    private final By productDescription = By.className("inventory_details_desc");
    private final By productPrice = By.className("inventory_details_price");
    private final By addToCartButton = By.id("add-to-cart");
    private final By backButton = By.id("back-to-products");
    private final By cartIcon = By.className("shopping_cart_link");

    private final By twitterLink = By.xpath("//a[contains(@href,'twitter.com')]");
    private final By facebookLink = By.xpath("//a[contains(@href,'facebook.com')]");
    private final By linkedinLink = By.xpath("//a[contains(@href,'linkedin.com')]");

    public boolean isItemPageOpened() {
        return Objects.requireNonNull(driver.getCurrentUrl()).contains("inventory-item");
    }

    public boolean isProductImageDisplayed() {
        return driver.findElement(productImage).isDisplayed();
    }

    public boolean isProductNameDisplayed() {
        return driver.findElement(productName).isDisplayed();
    }

    public boolean isProductDescriptionDisplayed() {
        return driver.findElement(productDescription).isDisplayed();
    }

    public boolean isProductPriceDisplayed() {
        return driver.findElement(productPrice).isDisplayed();
    }

    public boolean isAddToCartButtonDisplayed() {
        return driver.findElement(addToCartButton).isDisplayed();
    }

    public boolean isBackButtonDisplayed() {
        return driver.findElement(backButton).isDisplayed();
    }

    public boolean isCartIconDisplayed() {
        return driver.findElement(cartIcon).isDisplayed();
    }

    public boolean areSocialLinksDisplayed() {
        return driver.findElement(twitterLink).isDisplayed()
                && driver.findElement(facebookLink).isDisplayed()
                && driver.findElement(linkedinLink).isDisplayed();
    }
}