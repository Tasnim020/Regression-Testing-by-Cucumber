Feature: Login Feature Test Saucedemo site

  Scenario: Successful Login with credentials
    Given I will open "chrome" browser
    Then I go to url
    When I enter valid "standard_user" and "secret_sauce"
    And I click the login button
  When user see the name of page "Products"
    When I click on Menu it redirects ro a page
    Then I close the browser
