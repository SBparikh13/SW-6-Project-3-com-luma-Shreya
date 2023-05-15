package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearPageSteps {
    @When("^I mouse hover on Gear menu$")
    public void iMouseHoverOnGearMenu() {
        new GearPage().mouseHoverOnGear();
    }
    @And("^I click on bag$")
    public void iClickOnBag() {
        new GearPage().clickOnBags();
    }

    @And("^I click 'overnight Duffle' bag$")
    public void iClickOvernightDuffleBag() {

        new GearPage().clickOnProductName();
    }

    @Then("^I verify text 'overnight Duffle'$")
    public void iVerifyTextOvernightDuffle() {
        Assert.assertEquals(new GearPage().getProductNameText(), "Overnight Duffle");

    }


    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new GearPage().clickOnAddToCart();
    }

    @Then("^I verify messege ‘You added Overnight Duffle to your shopping cart’$")
    public void iVerifyMessegeYouAddedOvernightDuffleToYourShoppingCart() {
        Assert.assertEquals(new GearPage().getTextAddedDuffleToCart(), "You added Overnight Duffle to your shopping cart.");
    }

    @And("^I click on shopping cart$")
    public void iClickOnShoppingCart(){
        new GearPage().clickOnShoppingCart();
    }


    @And("^I click on update shopping cart$")
    public void iClickOnUpdateShoppingCart(){
        new GearPage().updateCart();

    }

    @And("^I change Qty to \"([^\"]*)\"$")
    public void iChangeQty(String qty) {
        new GearPage().changeQty("3");
    }

    @Then("^I change the qty to \"([^\"]*)\"$")
    public void iChangeTheQtyTo(String qty2){
        new GearPage().changeQty3("5");

    }

    @And("^I verify the product price \"([^\"]*)\"$")
    public void iVerifyTheProductPrice(String price) {
        new GearPage().getProductPrice("$135.00");

    }

    @And("^I verify the quantity \"([^\"]*)\"$")
    public void iVerifyTheQuantity(String qty)  {
        new GearPage().getQtyText(qty);

    }
}


