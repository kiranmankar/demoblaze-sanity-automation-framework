Feature: Login Functionality

  Scenario Outline: Verify valid login

    Given User is on DemoBlaze homepage
    When User clicks login link
    And User enters username "<username>"
    And User enters password "<password>"
    And User clicks login button
    Then User should login successfully

    Examples:
      | username | password |
      | test123  | test123  |