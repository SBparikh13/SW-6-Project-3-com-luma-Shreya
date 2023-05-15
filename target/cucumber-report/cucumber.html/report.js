$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gearpage.feature");
formatter.feature({
  "line": 1,
  "name": "Gear page test",
  "description": "As a User I am verifying Gear page test",
  "id": "gear-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7011749400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to Add Product SuccessFully To Shopping Cart",
  "description": "",
  "id": "gear-page-test;user-should-be-able-to-add-product-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on Gear menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on bag",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click \u0027overnight Duffle\u0027 bag",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I verify text \u0027overnight Duffle\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I change Qty to \"\u003cqty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify messege ‘You added Overnight Duffle to your shopping cart’",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify the quantity \"\u003cqty\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify the product price \"\u003cprice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I change the qty to \"\u003cqty2\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click on update shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify the product price \"\u003cprice2\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "WomenPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 279783100,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iMouseHoverOnGearMenu()"
});
formatter.result({
  "duration": 546637100,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iClickOnBag()"
});
formatter.result({
  "duration": 1491301900,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iClickOvernightDuffleBag()"
});
formatter.result({
  "duration": 1533488600,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iVerifyTextOvernightDuffle()"
});
formatter.result({
  "duration": 228927300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cqty\u003e",
      "offset": 17
    }
  ],
  "location": "GearPageSteps.iChangeQty(String)"
});
formatter.result({
  "duration": 412515200,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iClickOnAddToCart()"
});
formatter.result({
  "duration": 211369100,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iVerifyMessegeYouAddedOvernightDuffleToYourShoppingCart()"
});
formatter.result({
  "duration": 1746465600,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iClickOnShoppingCart()"
});
formatter.result({
  "duration": 1705742100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cqty\u003e",
      "offset": 23
    }
  ],
  "location": "GearPageSteps.iVerifyTheQuantity(String)"
});
formatter.result({
  "duration": 253686200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cprice\u003e",
      "offset": 28
    }
  ],
  "location": "GearPageSteps.iVerifyTheProductPrice(String)"
});
formatter.result({
  "duration": 329299200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cqty2\u003e",
      "offset": 21
    }
  ],
  "location": "GearPageSteps.iChangeTheQtyTo(String)"
});
formatter.result({
  "duration": 321335600,
  "status": "passed"
});
formatter.match({
  "location": "GearPageSteps.iClickOnUpdateShoppingCart()"
});
formatter.result({
  "duration": 141175900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cprice2\u003e",
      "offset": 28
    }
  ],
  "location": "GearPageSteps.iVerifyTheProductPrice(String)"
});
formatter.result({
  "duration": 85623800,
  "status": "passed"
});
formatter.after({
  "duration": 826476200,
  "status": "passed"
});
formatter.uri("menpage.feature");
formatter.feature({
  "line": 1,
  "name": "Men page test",
  "description": "As a User I am verifying Men page test",
  "id": "men-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4980387500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to Add Product SuccessFullyTo Shopping Cart",
  "description": "",
  "id": "men-page-test;user-should-be-able-to-add-product-successfullyto-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on Men menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on bottom tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on pant tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I mouse hover and click on cronus yoga pant",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I mouse hover and click on cronus yoga pant size \"\u003csize\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I mouse hover and click on colour black",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on Add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should be able to verify \u0027You added Cronus Yoga Pant to your shopping cart\u0027 text",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \u0027shopping cart\u0027 link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should be able to verify text \u0027shopping cart\u0027",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I should be able to verify the product name \u0027Cronus Yoga Pant\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should be able to verify the product size \"\u003csize\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should be able to verify the product color \u0027Black\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WomenPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 81300,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iMouseHoverOnMenMenu()"
});
formatter.result({
  "duration": 927378600,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iMouseHoverOnBottomTab()"
});
formatter.result({
  "duration": 183377300,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iClickOnPantTab()"
});
formatter.result({
  "duration": 1563610500,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iMouseHoverAndClickOnCronusYogaPant()"
});
formatter.result({
  "duration": 1411089200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csize\u003e",
      "offset": 50
    }
  ],
  "location": "MenPageSteps.iMouseHoverAndClickOnCronusYogaPantSize(String)"
});
formatter.result({
  "duration": 613969700,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iMouseHoverAndClickOnColourBlack()"
});
formatter.result({
  "duration": 281217100,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iClickOnAddToCart()"
});
formatter.result({
  "duration": 223796400,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iShouldBeAbleToVerifyYouAddedCronusYogaPantToYourShoppingCartText()"
});
formatter.result({
  "duration": 2074473000,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iClickOnShoppingCartLink()"
});
formatter.result({
  "duration": 1932962800,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iShouldBeAbleToVerifyTextShoppingCart()"
});
formatter.result({
  "duration": 173719700,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iShouldBeAbleToVerifyTheProductNameCronusYogaPant()"
});
formatter.result({
  "duration": 326412200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csize\u003e",
      "offset": 45
    }
  ],
  "location": "MenPageSteps.iShouldBeAbleToVerifyTheProductSize(String)"
});
formatter.result({
  "duration": 233054600,
  "status": "passed"
});
formatter.match({
  "location": "MenPageSteps.iShouldBeAbleToVerifyTheProductColorBlack()"
});
formatter.result({
  "duration": 141791000,
  "status": "passed"
});
formatter.after({
  "duration": 807009900,
  "status": "passed"
});
formatter.uri("womenpage.feature");
formatter.feature({
  "line": 1,
  "name": "Women page test",
  "description": "As a User I am verifying Women page test",
  "id": "women-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4506815600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to verify products sort by name on page",
  "description": "",
  "id": "women-page-test;user-should-be-able-to-verify-products-sort-by-name-on-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on women menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on top tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Jacket",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I select sort by Product Name filter",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to see products name display in alphabetical order",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenPageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 51300,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iMouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 1232998500,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iMouseHoverOnTopTab()"
});
formatter.result({
  "duration": 243213300,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iClickOnJacket()"
});
formatter.result({
  "duration": 1435310500,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iSelectSortByFilter()"
});
formatter.result({
  "duration": 1638433900,
  "status": "passed"
});
formatter.match({
  "location": "WomenPageSteps.iShouldBeAbleToSeeProductsNameDisplayInAlphabeticalOrder()"
});
formatter.result({
  "duration": 327405600,
  "status": "passed"
});
formatter.after({
  "duration": 790265900,
  "status": "passed"
});
});