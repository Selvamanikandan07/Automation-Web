#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Homepage Login
  I want to use this template for my feature file

  @tag1
  Scenario: validate login to MMT
    Given makeMyTrip website is launced and title is validated
    And the user clicks on Login button
    Then user enters email address and clicks continue button
    And user enters password and clicks Login button
    When verify mobile number screen displayed click the close button
    Then user validates the Homepage



