Feature: login

   @smoketest
  Scenario Outline: validate login with valid credential
    Given user in on Login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to homepage
