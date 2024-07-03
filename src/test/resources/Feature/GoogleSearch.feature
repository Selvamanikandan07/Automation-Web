Feature: Google Search


  Scenario: validate Google search
    Given browser is opened
    And user is on search googlepage
   When user enters a text in search box
   And User clicks enter
   Then user is navigated to Search results and clicks

