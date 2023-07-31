Feature: login with data Table

  Scenario Outline: login using multipul username nad password
    Given I go to the browser
    When I nevigate to the web application url
    When I input the "<username1>" and "<password1>" 
    Then I click the login button
    And I quit the browser

    Examples: 
      | username1                | password1  |
      | standard_user           | secret_sauce|
      
      | problem_user            | secret_sauce|
      | performance_glitch_user | secret_sauce|
      
      
      
      
      
      
      
      
      
