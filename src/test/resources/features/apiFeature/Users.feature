Feature: Sign Up

  @wip
  Scenario Outline: Exlab user register
    When The user creates a POST request with "<name>" and "<email>" and "<password>" and "<about>" and "<terms>"
    Then The user verifies that the status code is <statusCode>
    And The user verifies that body contains "<content>"
    And The compiler gets the token
    Examples:
      | name  | email                 | password | about | terms | statusCode | content |
      | Tadic | tadic34567@kraftech.com | Test1234 | about | 10    | 200        | token   |

 # Task
    #Exlab user can able to PATCH request and saves profile
    # verify status code
    # send a GET request with token
    # verify name and email