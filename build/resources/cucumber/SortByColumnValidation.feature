 Feature: As A user I should be able to sort computer database table
    @sort
   Scenario: Verify Sorting on the computer database table for Computer Database website

     Given user navigates to dashboard
     When user sees database table
     And user clicks on Computer name column
     And Computer details should arrange in descending alphabetical order
     And user clicks on Introduced date column
     And Computer details should arrange in descending alphabetical order by introduced date
     And user clicks on Discontinued date column
     And Computer details should arrange in descending alphabetical order by Discontinued date
     And user clicks on company name column
     And Computer details should arrange in descending alphabetical order by company name