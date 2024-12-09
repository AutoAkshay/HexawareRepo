Feature: Login Feature



  @SauceLab
  Scenario: Sauce lab login scenario
    Given User launches URL
    And User enters credentials
    When User click on login button
    And User completes the purchase
    Then User logs out

  @OrangeHRM
  Scenario: Orange lab login scenario
    Given User launches Orange URL
    And User enters Orange credentials
    When User click on Orange login button
    Then User Orange logs out

  @ScenarioOutline
  Scenario Outline: Title of your scenario outline
    Given User launching the URL
    When User enters <username> and <password>
    Then User clicks on login button

    Examples: 
      | username | password  |
      | Aadmin   | Aadmin123 |
