package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenPageSteps {
    @When("^I mouse hover on Men menu$")
    public void iMouseHoverOnMenMenu() {
        new MenPage().mouseHoverOnMenMenu();

    }

    @And("^I mouse hover on bottom tab$")
    public void iMouseHoverOnBottomTab() {

        new MenPage().mouseHoverOnBottoms();
    }

    @And("^I click on pant tab$")
    public void iClickOnPantTab() {
        new MenPage().clickOnPantTab();
    }

    @Then("^I mouse hover and click on cronus yoga pant$")
    public void iMouseHoverAndClickOnCronusYogaPant() {
        new MenPage().clickOnCronusYogaPant();

    }


    @And("^I mouse hover and click on colour black$")
    public void iMouseHoverAndClickOnColourBlack() {
        new MenPage().cronusYogaPantAndColourBlack();
    }

    @Then("^I click on Add to cart$")
    public void iClickOnAddToCart() {
        new MenPage().clickOnAddCart();
    }

    @And("^I should be able to verify 'You added Cronus Yoga Pant to your shopping cart' text$")
    public void iShouldBeAbleToVerifyYouAddedCronusYogaPantToYourShoppingCartText() {
        Assert.assertEquals(new MenPage().getSuccessMsgText(), "You added Cronus Yoga Pant to your shopping cart.");

    }

    @And("^I click on 'shopping cart' link$")
    public void iClickOnShoppingCartLink() {
        new MenPage().clickOnShoppingCartLink();
    }

    @Then("^I should be able to verify text 'shopping cart'$")
    public void iShouldBeAbleToVerifyTextShoppingCart() {
        Assert.assertEquals(new MenPage().getShoppingCartText(), "Shopping Cart");

    }

    @And("^I should be able to verify the product name 'Cronus Yoga Pant'$")
    public void iShouldBeAbleToVerifyTheProductNameCronusYogaPant() {
        Assert.assertEquals(new MenPage().getProductName(), "Cronus Yoga Pant");

    }


    @And("^I should be able to verify the product color 'Black'$")
    public void iShouldBeAbleToVerifyTheProductColorBlack() {
        Assert.assertEquals(new MenPage().getProductColour(), "Black");
    }

    @And("^I should be able to verify the product size \"([^\"]*)\"$")
    public void iShouldBeAbleToVerifyTheProductSize(String size) {
        Assert.assertEquals(new MenPage().getProductSize("32"), "32");

    }


    @And("^I mouse hover and click on cronus yoga pant size \"([^\"]*)\"$")
    public void iMouseHoverAndClickOnCronusYogaPantSize(String size) {
        new MenPage().clickOnCronousSize32("32");

    }
}
