Feature: Validate Login Function with multiple user credentials

  Scenario Outline: Login Feature for multiple user credentials
    Given user in on the login page
    When user enters username <username> and password <password>
    Then user clicks on the login button
    And user shoud be logged in successfully

    Examples: 
      | username | password   |
      | admin    | admin123   |
      | hr       | hr123      |
      | finance  | finance123 |
