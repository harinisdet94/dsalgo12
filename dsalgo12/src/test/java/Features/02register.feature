@Register
Feature: Check Register functionality

  @Check_Register01
  Scenario: Check all empty field message
    Given The user opens Register Page
    When The user clicks Register button with all fields empty
    Then It should display an error

  @Check_Register02
  Scenario: Check invalid Username
    Given The user opens Register Page for Invalid username
    When The user enters invalid username
    Then It should display an error message Invalid username

  @Check_Register03
  Scenario: Check invalid Password
    Given The user opens Register Page for Invalid password
    When The user enters valid username and invalid password
    Then It should display an error message Invalid password 

  @Check_Register04
  Scenario: Check mismatch Password confirmation message
    Given The user opens Register Page for mismatch data
    When The user enters a valid username and password but different password_confirmation and the user clicks Register button 
    Then It should display an error mismatch password

  @Check_Register05
  Scenario: The user redirected to Homepage with valid details
    Given The user opens Register Page for valid username and password
    When The user enters a valid username and password and password confirmation and the user clicks Register button
    Then The user should be redirected to Homepage with New Account Created
    And User signs out from the account
