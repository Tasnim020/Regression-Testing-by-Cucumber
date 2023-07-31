
Feature: Add to cart
  I want to use this template for my feature file
  Scenario: user will put products in the cart
    Given I go to the browser
    When I go to url
    When I input "username" and "password"
    When I click login button
    Then I put products in the cart
    Then I checkout

