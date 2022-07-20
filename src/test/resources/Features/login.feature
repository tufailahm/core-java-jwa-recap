Feature: user validation

  Scenario: check whether login is successful or not with valid credentials
    Given user is an login page
    When user enters username and password
    And user clicks on submit button
    Then user is navigated to the home page
