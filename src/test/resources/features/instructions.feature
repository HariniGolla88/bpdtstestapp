
Feature: As a Test user
  I want to test the BPDTS test app API
  so that I can validate the instruction endpoint

  @getRequest-Instructions
  Scenario Outline: As a Test user make a GET request to retrieve instructions
    Given user makes GET request to retrieve instructions
    Then the status code for instructions returned should be "<expectedStatusCode>"

    Examples:
    |expectedStatusCode|
    | 200              |
