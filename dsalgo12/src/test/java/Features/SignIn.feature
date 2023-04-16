
Feature: validating signin page

Scenario: user logins with correct credentials
Given User is in homepage
Then user clicks signin and redirects to signin page 
When user enters username as "code_warriors" password as "ssdet@88"
And user clicks login button and redirects to home page


