
Feature: Login

  @tag1
  Scenario: validate login with valid credentials
    Given browser is open
    And MakemyTrip page is opened and validate Url
    Then User clicks on sign in button and navigated to Signin page
    When User enters username and password
    And User clicks on signin button
    Then User is navigated to netflix homepage

