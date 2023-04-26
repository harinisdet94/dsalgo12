@Tree
Feature: checking Tree page functionality

  Scenario: user navigate to Tree page
    Given The user is on home page after 	Queue
    When The user clicks on Get Started button of Tree
    Then The user should be redirected to Tree page

  Scenario: The user is able to navigate to Overview of Trees
    Given The user is on Tree page
    When The user clicks on Overvies of Trees
    And user clicks on try here page Tree
    Then The user redirected to a Tree page having an tryEditor with a Run button

  Scenario: user checking TextArea
    Given The user sending code
    When The user clicks on run button
    Then The user should get Output
    And user navigate to back

  Scenario: The user is able to navigate to Terminologies
    Given The user is on Tree page again
    When The user clicks on Terminologies
    And user clicks to try here page Terminologies
    Then The user redirected to a Tree page having an tryEditor

  Scenario: user checking TextArea Terminologies
    Given The user sending code in textarea
    When The user clicks on run button after code
    Then The user get Output for Terminologies
    And user navigate back page

  Scenario: The user is able to navigate to Types of Tree
    Given The user is Tree page one more time
    When The user clicks on Types of Tree
    And user clicks to try button
    Then The user redirected to a Types of Tree page having an tryEditor

  Scenario: user checking TextArea Types of Tree
    Given The user sending python code
    When The user clicks on run after code
    Then The user get Output for Typer of Trees
    And user navigate home page after Tree
