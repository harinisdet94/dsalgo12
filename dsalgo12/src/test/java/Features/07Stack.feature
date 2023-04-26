@Stack
Feature: check Stack Functionality

  Scenario: The user is directed to Stack Page
    Given user is on Home Page
    When user click on get started button of stack
    Then user directed to Stack page

  Scenario: user checking operation functionality
    Given user is on operation in Stack page
    When useer clicks on operation in stacks button
    And user clicks tryhere button
    Then user is on tryeditor and run button page

  Scenario: user is on tryeditor page
    Given user is sending python code
    When user clicks on run button
    Then user get output
    And user redirected to home page after Stack
