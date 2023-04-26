@Data_Structure
Feature: validating data structue page

  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is in the Home page after logged in
    When The user clicks  Get Started button below the Data structures-Introduction
    Then The user should land in Data Structures- Introduction Page

  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the Data Structures Introduction after logged in
    When The user clicks Time Complexity button
    Then The user should be redirected to time complexity of Data structures-Introduction
    When The user clicks Try Here button and redirects to try editor
    Then user enters phython code 
    And user clicks run button and goes to home page 

  