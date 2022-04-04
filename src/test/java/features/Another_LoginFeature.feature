@TF @Regression
Feature: Another Techfios billling website login functionality validation

  Background: 
    Given User is on Techfios login page

  @TF_feature3
  Scenario Outline: User should be able to login with valid credentials
    When User enters username as "<username>"
    When User enters password as "<password>"
    When User clicks on signin button
    Then User should land on dashboard page

    Examples: 
      | username           | password |
      | demo@techfios.com  | abc124   |
      | demo1@techfios.com | abc123   |
      | demo1@techfios.com | abc124   |
