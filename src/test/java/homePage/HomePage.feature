Feature: Verify Homepage shows properly

Scenario: Homepage shows successfully

  Given I've opened Chrome Browser
  When Open URL & Press Enter
  Then I should taken to the Homepage

  Scenario: Verify covid-19 Special page is displayed

    Given Click on Covid 19 Special button
    Then Verify that Covid 19 Special page is displayed




  Scenario: Verify Women Care page is displayed

    Given Click on womencare Button
    Then Verify that womencare page is Displayed