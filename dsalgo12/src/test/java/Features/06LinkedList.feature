@LinkedList
Feature: 

  Scenario: User navigated to linked list page
    Given user is on home page
    When user clicks get started button of Linked List
    Then user redirected to Linked List

  Scenario: User navigated to Introduction page
    Given user is on the Linked List page
    When user clicks Introduction link
    Then user should be directed to Introduction of Linked List Page
    And user clicks Try Here button in the introduction page
    Then user redirected to the page having an tryEditor with a Run button to test

  Scenario: The user run the code in tryEditor with valid input for Introduction page
    Given user is using tryEditor with a Run button to test
    When user Enter code
    And user click on Run button
    Then user should be presented with the Run output
    And user redirected to previous page

  Scenario: User to check Creating Linked List page
    Given user is on the Linked List page
    When user clicks Creating Linked List link
    Then user should be directed to Creating Linked List Page
    And user clicks Try Here button in the Creating Linked List page
    Then user redirected to tryEditor with a Run button to test

  Scenario: The user run the code in tryEditor with valid input for Creating Linked List page
    Given user is using tryEditor and Run button to test
    When user Enter print code
    And user to click on Run button
    Then user should get Run output
    And user redirected to home page after Linked List
