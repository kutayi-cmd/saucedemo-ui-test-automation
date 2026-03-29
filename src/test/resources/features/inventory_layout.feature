Feature: Inventory Page Layout Validation

  Scenario: Verify inventory page layout elements
    Given user logs in with valid credentials
    Then user should be redirected to inventory page
    And Swag Labs title on inventory page should be visible
    And cart icon should be visible
    And social media links should be visible
    And sorting dropdown should be visible
    And sorting dropdown should contain correct options
    And menu icon should be visible
    When user clicks the menu icon
    Then menu should contain correct items