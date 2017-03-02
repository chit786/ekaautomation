 Feature: As a user i should be able to delete any computer in the database
   @delete
   Scenario: Verify Delete computer Validation for Computer Database website
     Given user is on Homepage
     And note the total number of computers in the database
     And note the total number of computers in pagination footer
     When user clicks first computer name from the list
     Then Edit Computer page should be opened
     And user sees delete this computer button
     And user clicks delete this computer button
     And user navigates to HomePage
     And user sees the Delete confirmation message on the homepage
     And the total number of computers should be decreased by 1 in Header
     And the total number of computers should be decreased by 1 in Pagination footer

