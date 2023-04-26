@Array
Feature: 

  Scenario: user navigate to Array page
    Given The user is on home page
    When The user clicks on Get Started button
    Then The user should be redirected to Arrays page

  Scenario: The user is able to navigate to Arrays in Python page
    Given The user is in the Arrays in Python
    When The user clicks on Arrays in Python page
    And user clicks on try here in array page
    Then user enters phython code in array
    And user clicks run button and goes back 

  Scenario: user navigate to Practice question
    Given The user clicks on the Practice page
    When The user clicks the Search the array link
    Then The user should be redirected to Question page contains a question,an tryEditor with Run and Submit buttons
    And user redirected to home page
