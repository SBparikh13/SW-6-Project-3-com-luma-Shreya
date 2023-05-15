package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WomenPageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on women menu$")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().mouseHoverOnWomen();
    }

    @And("^I mouse hover on top tab$")
    public void iMouseHoverOnTopTab() {
        new WomenPage().mouseHoverOnTop();
    }

    @Then("^I click on Jacket$")
    public void iClickOnJacket() {
        new WomenPage().clickOnJacket();
    }

    @And("^I select sort by Product Name filter$")
    public void iSelectSortByFilter() {
        new WomenPage().selectByFilterProductName();
    }

    @Then("^I should be able to see products name display in alphabetical order$")
    public void iShouldBeAbleToSeeProductsNameDisplayInAlphabeticalOrder() {
        new WomenPage().verifySelectByProductName();
    }
    @And("^I select sort by Price filter$")
    public void iSelectSortByPriceFilter() {
        new WomenPage().selectByFilterPrice();
    }

    @Then("^I should be able to see products price display in Low to High$")
    public void iShouldBeAbleToSeeProductsPriceDisplayInLowToHigh() {
        new WomenPage().verifySelectByFilterPrice();
    }


}
