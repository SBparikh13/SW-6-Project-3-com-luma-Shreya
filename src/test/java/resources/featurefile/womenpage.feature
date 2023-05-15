Feature: Women page test
  As a User I am verifying Women page test
@sanity @regression
  Scenario: User should be able to verify products sort by name on page
    Given  I am on homepage
    When   I mouse hover on women menu
    And    I mouse hover on top tab
    Then   I click on Jacket
    And    I select sort by Product Name filter
    Then   I should be able to see products name display in alphabetical order
@smoke @regression
  Scenario: User should be able to see products sort by price on page
    Given  I am on homepage
    When   I mouse hover on women menu
    And    I mouse hover on top tab
    Then   I click on Jacket
    And    I select sort by Price filter
    Then   I should be able to see products price display in Low to High
