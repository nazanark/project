Feature: API project

  Background: https://gorest.co.in/public-api/users

    Scenario: API project to create a user
    Given user sends a post request with body
    When user sends a get request for validation

      Scenario: API create second user
        Given the user sends a post request with a new body
        When user sends a get request to validate 2nd user

        Scenario: API update 1st user
          Given the user sends a put request with updated body
          When user sends a get request to validate updated one

          Scenario: API delete second user
            Given the user sends delete request
            When user sends a get request to validate 2nd user is deleted


