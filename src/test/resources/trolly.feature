@rk1
Feature: Trolly

  @rk @rk1
  Scenario: Adding product to basket
    Given I on homepage
    When I search for a product "nike"
    And I select a product "Nike Classic North Solid Backpack - Navy"
    And I add product to trolly
    And I go to trolly
    Then I should see "Nike Classic North Solid Backpack - Navy" in trolly
