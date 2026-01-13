Feature: Purchase feature testing

  @MarketPlaceScenario
  Scenario Outline: Successful purchase of items from the marketplace
    Given the user launches the marketplace application
    When the user adds "<Qty>" apples to the cart
    And the user opens the cart
    And the user proceeds to checkout
    And the user applies a valid promo code
    And the user places the order
    And the user selects a country and accepts the terms and conditions
    Then the order should be placed successfully and the browser is closed
    Examples:
      |Qty  |
      |3    |

  @MarketPlaceScenarioDatatable
  Scenario: Successful purchase of items from the marketplace using data table
    Given the user launches the marketplace application
    When the user adds apples to the cart
      | Qty |
      | 3   |
    And the user opens the cart
    And the user proceeds to checkout
    And the user applies a valid promo code
    And the user places the order
    And the user selects a country and accepts the terms and conditions
    Then the order should be placed successfully and the browser is closed

