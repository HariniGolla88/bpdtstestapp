
  Feature: As a Test user
    I want to test the BPDTS test app API
    so that I can validate the users endpoint

    @getRquest-User-By-Id
    Scenario Outline: As a Test user make a GET request to retrieve the user details by id
      Given user makes GET request to retrieve user details with "<id>"
      Then the status code returned for the user id should be "<expectedStatusCode>"
      And the response should contain the user details "<userDetails>"

      Examples:
        |  id   |  expectedStatusCode  | userDetails |
        |   1   |  200                 | true        |
        |  31   |  200                 | true        |
        |  5000 |  404                 | false       |
        |  -12  |  404                 | false       |

    @getRequest-All-Users
    Scenario Outline: As a Test user make a GET request to retrieve the list of users
      When a GET request is made to retrieve the list of all users
      Then the status code returned for all users should be "<expectedStatusCode>"
      And the response should be populated "<usersList>"

      Examples:
        | expectedStatusCode | usersList |
        |  200               | true      |
