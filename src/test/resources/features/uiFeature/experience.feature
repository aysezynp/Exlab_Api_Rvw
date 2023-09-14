Feature: Compare UI and API experiences

  @apiuı
  Scenario Outline: UI and API Experiences
    When The user creates a POST request for add a new experience with "<job>" ad "<company>" and "<location>" and "<fromdate>" "<todate>" and "<current>" and "<description>"
    Then The user verifies that the status code is <statusCode>
    And The user is on te Dashboard page
    Then The user verifies that UI and API experiences must be match job is "<job>"
    Examples:
      | job  | company    | location | fromdate   | todate     | current | description | statusCode |
      | SDET | Fenerbahce | istabul  | 2022-01-01 | 2022-08-08 | false   | description | 200        |