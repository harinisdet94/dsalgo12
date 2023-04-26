@Graph
Feature: user is checking Graph functionality

  Scenario: user is to check Graph operation
    Given user is on Home Page after Tree
    When user click on get started button of Graph
    Then user directed to Graph page

  Scenario: user checking try editor functionality
    Given user is on Graph page
    When user clicks on Graph button
    And user clicks tryhere button of Graph
    Then user is on tryeditor and run button Graph page

  Scenario: user is on tryeditor of Graph page
    Given user is sending python code in Tryeditor
    When user clicks on run button of Graph
    Then user get output of Graph
    And user redirected to back after Graph

  Scenario: user checking try editor functionality of Graph representation
    Given user is on Graph page again
    When user clicks on Graph representation button
    And user clicks tryhere button of Graph representation
    Then user is on tryeditor and run button Graph representation page

  Scenario: user is on tryeditor of Graph representation page
    Given user is sending python code in Tryeditor of Graph representation
    When user clicks on run button of Graph representation
    Then user get output of Graph representation
    And user redirected to Home page after Graph

  Scenario: User is to sign out from DSalgo
    Given User is on Home page
    When user clicks Sign out
    Then user successfully Sign Out from DS algo
