
 Feature: As a Test user
   I want to test the BPDTS test app API
   so that I can validate the city endpoint

   @getRequest-City-Users
   Scenario Outline: As a Test user make a GET call to retrieve the users in the City
    Given user makes GET request to retrieve all users in "<cityName>"
    Then the status code returned should be "<expectedStatusCode>"
    And the response should contain users "<hasUsers>"

     Examples:
     | cityName          |  expectedStatusCode  | hasUsers  |
     |London             |  200                 | true      |
     |                   |  404                 | false     |
     |Manchester-?       |  200                 | false     |
     |  ??%$             |  200                 | false     |
