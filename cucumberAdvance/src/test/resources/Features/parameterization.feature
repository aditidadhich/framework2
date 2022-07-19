#Parameterizatioin and data driven
Feature: feature to test login functionality with parameters

  Scenario Outline: Check login is successfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login page
    Then user is navigated to the home and enter <country>

    Examples: 
      | username | password |  country  |
      | aditi    |    12345 |   India   |
      | pallavi  |    12345 |   Russia  |
