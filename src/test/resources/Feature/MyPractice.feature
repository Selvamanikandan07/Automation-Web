Feature: Search

  @smoketest
  Scenario: validate Google search
    Given browser is initialised and opened
    And user validates the title and Url
   When user clicks on workspace header test page should be displayed
   Then user validates the cards under workspace header
   And close the browser
   # And user is navigated to Makemytrip site



