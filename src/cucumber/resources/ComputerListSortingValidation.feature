 Feature: As a user I should be able to see,filter and sort list of computers in database
    @filter
   Scenario: user should be able to filter computers by name on Computer database HomePage
     Given user navigates to the homepage
     When user sees computer list table
     Then user sees the list of computers sorted alphabetically in ascending order
     And the number of computers will be noted from the header
     And User clicks filter by name button
     Then the list should not change
     And the total computer count should be same
     And user filters list by "!@#$%^&*"
     Then the computer list table should be gone
     And user sees label "Nothing to display"
     And user filters list by "testing"
     Then user sees computer list sorted with the name "testing"
     And user filters list by "Z"
     And the total number of computers found in the header must be noted
     Then user click on next button
     And sees the next 10 computers in the list with name containing "Z"
     Then the count of computers in the header should not change
     And the text for current page should display "Displaying 11 to 20 of <Total Count>"
     And previous button is enabled
     And next button is enabled
