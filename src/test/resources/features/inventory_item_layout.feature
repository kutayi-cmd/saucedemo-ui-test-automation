Feature: Inventory Item Page Layout Validation

  Scenario: Verify inventory item page layout elements
    Given user logs in with valid credentials
    And user clicks on a product
    Then user should be redirected to item page
    And product image should be visible
    And product name should be visible
    And product description should be visible
    And product price should be visible
    And add to cart button should be visible
    And back to products button should be visible
    And cart icon on item page should be visible
    And social media links on item page should be visible