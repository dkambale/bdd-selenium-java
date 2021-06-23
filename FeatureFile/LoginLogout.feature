Feature: login and login feature test
  Scenario: Register user come to application and login and logout
    Given User is on login page
    When user enter userName
    And  user password
    And  click on sign
    Then  User should be logged in
    Then User click on Logout Button

