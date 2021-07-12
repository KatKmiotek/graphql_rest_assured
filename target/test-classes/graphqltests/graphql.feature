Feature: Testing GraphQL endpoint with REST Assured

  Scenario: Testing teas endpoint - query
    Given I have graphql query
    When Post "query" to the endpoint
    Then Can verify "query" response