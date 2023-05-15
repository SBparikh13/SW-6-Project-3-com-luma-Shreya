Feature: Gear page test
  As a User I am verifying Gear page test
  @sanity @regression
  Scenario: User should be able to Add Product SuccessFully To Shopping Cart
    Given  I am on homepage
    When   I mouse hover on Gear menu
    And    I click on bag
    And    I click 'overnight Duffle' bag
    Then   I verify text 'overnight Duffle'
    And    I change Qty to "<qty>"
    And    I click on add to cart
    Then   I verify messege ‘You added Overnight Duffle to your shopping cart’
    And    I click on shopping cart
    And    I verify the quantity "<qty>"
    And    I verify the product price "<price>"
    Then   I change the qty to "<qty2>"
    And    I click on update shopping cart
    And    I verify the product price "<price2>"

