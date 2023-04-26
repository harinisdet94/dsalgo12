@Queue
Feature: check Queue fuctionality

  Scenario: check Queue fuctionality
    Given User is on Home page after Stack
    When user click on get started button of Queue
    Then user directed to Queue page

  Scenario: user checking operation functionality
    Given user is on operation in Queue page
    When user clicks on Queue operations button
    And user clicks tryhere button of Queue
    Then user is on tryeditor and run page

  Scenario: user is on tryeditor page of Queue
    Given user is sending python code in text area
    When user clicks on run button after code
    Then user get output of code
    And user redirected to home page after Queue
