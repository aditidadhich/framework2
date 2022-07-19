#Please visit https://opensource-demo.orangehrmlive.com/index.php/dashboard
Feature: Test Orange HRM website

  Background: 
    Given user is on login page
    When user enters username and password
    When clicks on login page

  Scenario: 1 check User Role Column
    #Given user is logged in
    When user clicks on Go To Admin
    And user clicks on user management
    And user clicks on Users
    Then Verify User Role Column
    Then Logout and Close Browsers

  Scenario: 2 check Employee Name Column
    #Given user is logged in
    When user clicks on Go To Leave
    And user clicks on My Leave
    Then Verify Employee Name Column
    Then Logout and Close Browser
