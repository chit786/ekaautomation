 Feature: As a user I should be able to see Computer Database Page

   Scenario: User navigates to the website and see Computer Database Home page
     Given Open "Chrome" and navigate to homepage
     And user sees a table of computers
     And a filter computer by name option
     And add a new computer button
     And next and previous list options

   Scenario: validate the design of homepage
     Given User is on Homepage
     When page is visible to user
     Then title of the page should be "Computers database"
     And "Play sample application - Computer database" link should be present on top
     And color of the header should be "black"

