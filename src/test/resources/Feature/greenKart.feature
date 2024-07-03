
Feature: Homepage page

  Background: 
    Given WebDriver is initialized and browser is opened

  @smoke
  Scenario: Validate the user is able to add vegetable name and qty in cartpage
    Given the user is navigated to Greenkart Homepage
    And the user selects on Vegetable as "Beetroot" and enters Qty as "7"
    And the user clicks on Add to cart button for "Beetroot"
    Then the user will be navigated to cart page
