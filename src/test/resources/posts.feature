Feature: API posts
  Scenario: API project to post

    Given create a post for user
    When send a get request for validation
    Then list post for user