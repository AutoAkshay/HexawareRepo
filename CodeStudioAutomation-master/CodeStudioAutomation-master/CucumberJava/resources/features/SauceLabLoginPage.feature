Feature: SauceLab login page

  @Sanity @Smoke
  Scenario Outline: Successful login by example table
    Given User launches the url
    When User gives "<username>" and "<password>"
    And User clicks on login button
    Then User closed the browser
    Examples:
      | username  | password  |
      |standard_user|secret_sauce |

  @Regression
  Scenario: Successful login by data table
    Given User launches the url
    When User gives username and password
      | username    | password      |
      |standard_user|secret_sauce |
    And User clicks on login button
    Then User closed the browser


