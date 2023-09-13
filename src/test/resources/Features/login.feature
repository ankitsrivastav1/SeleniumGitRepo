@SmokeScenario
Feature: Login Functionality

	@SmokeTest
  Scenario Outline: Check Login is successful
    Given User is on Loging Page
    When User enters <Username> and <Password>
    And clicks on Login button
    Then User is navigated to Home page

    Examples: 
      | Username | Password |
      | standard_user    |secret_sauce |
      | locked_out_user  |secret_sauce |
