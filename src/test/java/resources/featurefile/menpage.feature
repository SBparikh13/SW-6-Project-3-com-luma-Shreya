Feature: Men page test
  As a User I am verifying Men page test
  @sanity @regression
  Scenario: User should be able to Add Product SuccessFullyTo Shopping Cart
    Given  I am on homepage
    When   I mouse hover on Men menu
    And    I mouse hover on bottom tab
    And    I click on pant tab
    Then   I mouse hover and click on cronus yoga pant
    And    I mouse hover and click on cronus yoga pant size "<size>"
    And    I mouse hover and click on colour black
    Then   I click on Add to cart
    And    I should be able to verify 'You added Cronus Yoga Pant to your shopping cart' text
    And    I click on 'shopping cart' link
    Then   I should be able to verify text 'shopping cart'
    And    I should be able to verify the product name 'Cronus Yoga Pant'
    And    I should be able to verify the product size "<size>"
    And    I should be able to verify the product color 'Black'
