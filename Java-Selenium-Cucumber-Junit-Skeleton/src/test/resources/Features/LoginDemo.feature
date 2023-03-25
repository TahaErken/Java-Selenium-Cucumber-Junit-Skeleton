Feature: Test login funcitonality
@logintest
  Scenario Outline: Check login is succesfull with valid credentials
    Given browser is opened
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to home page
  Examples:
    | username | password |
    |Raghav|12345|
    |Ele|12345|
