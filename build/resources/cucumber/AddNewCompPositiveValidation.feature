Feature: User should be able to add new computer to the database
  @add
  Scenario: User should be able to add new computer : positive scenario
    Given user is on homepage
    When User clicks on Add new computer button
    Then Add a computer page should be displayed
    And user clicks on Cancel button
    Then Homepage should be displayed
    When User clicks on Add new computer button
    Then Add a computer page should be displayed
    And "Add a computer" label should be displayed
    And "Computer name" label should be displayed
    And "Introduced date" label should be displayed
    And "Discontinued date" label should be displayed
    And "Company" label should be displayed
    And note the total number of computers
    And user enters "NIA123" as Computer name
    And enters "2017-01-04" as Introduced date
    And enters "2017-12-01" as Discontinued date
    And selects "Samsung Electonics" as company
    And clicks on Create this computer button
    Then user should be redirected to homepage
    And gets a confirmation message "Done! Computer NIA123 has been created"
    And the total number of computers should be increased by 1
    And user filters the list by "NIA123"
    And gets a compuer record with "NIA123" as computer name
    And "04 Jan 2017" as Introduced date
    And "01 Dec 2017" as Discontinued date
    And "Samsung Electronics" as company name