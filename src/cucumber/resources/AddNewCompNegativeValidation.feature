Feature: User should see valid error messages for invalid computer details on add computer screen
  @errors
  Scenario: Valid error messages should be displayed when user enters invalid details for adding new computer
    Given User navigates to Hompage
    When User clicks Add a new computer button
    Then user sees add new computer screen
    And User sets "" computer name, "" introduced date, "" Discontinued date, "" Company name
    And clicks on "Create this computer" button
    Then Computer name field should be highlighted in red
    And User sets "" computer name, "01-01-01" introduced date, "2017-01-01" Discontinued date, "Samsung Electronics" Company name
    And clicks on "Create this computer" button
    Then Computer name field should be highlighted in red
    Then Introduced date field highlighted in red
    And User sets "NIA123" computer name, "BBBB-01-01" introduced date, "AAAA-01-01" Discontinued date, "Samsung Electronics" Company name
    And clicks on "Create this computer" button
    Then Introduced date field highlighted in red
    Then Discontinued date field highlighted in red
    And User sets "NIA123" computer name, "2017-01-01" introduced date, "2017-BB-01" Discontinued date, "Samsung Electronics" Company name
    And clicks on "Create this computer" button
    Then Discontinued date field highlighted in red

