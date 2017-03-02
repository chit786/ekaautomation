Feature: User should be able to navigate to various pages

  Scenario: User navigates demoaut website
    Given Open Chrome and navigate to homepage
    And user sees sign in table
    When user clicks on Register
    Then user sees registration page
    When user clicks on Support
    Then user sees support page
    When user clicks on Contact
    Then user sees contact page
