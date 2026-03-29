package com.epam.automation.pages;

import com.epam.automation.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class InventoryPage {
    private final WebDriver driver = DriverFactory.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    private final By swagLabsTitle = By.className("app_logo");
    private final By cartIcon = By.className("shopping_cart_link");
    private final By twitterLink = By.xpath("//a[contains(@href,'twitter.com')]");
    private final By facebookLink = By.xpath("//a[contains(@href,'facebook.com')]");
    private final By linkedinLink = By.xpath("//a[contains(@href,'linkedin.com')]");
    private final By sortingDropdown = By.className("product_sort_container");
    private final By sortingOptions = By.cssSelector(".product_sort_container option");
    private final By menuButton = By.id("react-burger-menu-btn");
    private final By allItems = By.id("inventory_sidebar_link");
    private final By about = By.id("about_sidebar_link");
    private final By logout = By.id("logout_sidebar_link");
    private final By resetAppState = By.id("reset_sidebar_link");

    private final By firstProduct = By.className("inventory_item_name");

    public boolean isInventoryPageOpened() {
        return Objects.requireNonNull(driver.getCurrentUrl()).contains("inventory.html");
    }

    public boolean isSwagLabsTitleDisplayed() {
        return driver.findElement(swagLabsTitle).isDisplayed();
    }

    public boolean isCartIconDisplayed() {
        return driver.findElement(cartIcon).isDisplayed();
    }

    public boolean areSocialLinksDisplayed() {
        return driver.findElement(twitterLink).isDisplayed()
                && driver.findElement(facebookLink).isDisplayed()
                && driver.findElement(linkedinLink).isDisplayed();
    }

    public boolean isSortingDropdownDisplayed() {
        return driver.findElement(sortingDropdown).isDisplayed();
    }

    public List<String> getSortingOptions() {
        List<WebElement> options = driver.findElements(sortingOptions);
        return options.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public boolean isMenuButtonDisplayed() {
        return driver.findElement(menuButton).isDisplayed();
    }

    public void clickMenuButton() {
        driver.findElement(menuButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(allItems));
    }

    public boolean areMenuItemsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(allItems));
        return driver.findElement(allItems).isDisplayed()
                && driver.findElement(about).isDisplayed()
                && driver.findElement(logout).isDisplayed()
                && driver.findElement(resetAppState).isDisplayed();
    }
    public void clickFirstProduct() {
        driver.findElements(firstProduct).get(0).click();
    }
}
