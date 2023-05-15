package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }

    // Mouse Hover on Gear Menu
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']")
    WebElement gearMenu;
    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;
    //Click on Product Name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a[contains(text(),'Overnight Duffle ')]")
    WebElement overnightDuffle;
    @CacheLookup
    @FindBy(xpath = "//input[@data-role ='cart-item-qty']")
    WebElement changeQty3 ;
    // //
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyText;
    @CacheLookup
    @FindBy(id = "qty")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='control qty']//input")
    WebElement changeQty5;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement upDateCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickOnShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement txtAddedDuffleToCart;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//input[@data-role ='cart-item-qty']")
    WebElement verifyQty3;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[@class='price']")
    WebElement verifyProductPrice;

    @CacheLookup
    @FindBy(xpath = "//span[text() ='$225.00']")
    WebElement verifyProductPrice2;

    public void mouseHoverOnGear() {
        mouseHoverToElement(gearMenu);
        log.info("Mouse hover on : " + gearMenu.toString());



    }

    public void clickOnBags() {
        clickOnElement(bags);
        log.info("Click on  : " + bags.toString());
    }

    public void clickOnProductName() {
        clickOnElement(overnightDuffle);
        log.info("Click on  : " + overnightDuffle.toString());


    }

    public void changeQty(String qty) {
       // WebElement changeQuantity = driver.findElement(By.id("qty"));
       changeQty.sendKeys(Keys.DELETE);
        sendTextToElement(changeQty, qty);
        log.info("Change quantity : " + changeQty.toString());
    }
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Click on  : " + addToCart.toString());

    }

    // Change Qty to ‘5’
    public void changeQty3(String qty2) {
        changeQty3.sendKeys(Keys.DELETE);
        sendTextToElement(changeQty3,qty2);
        log.info("Change quantity to 5: " + changeQty3.toString());


    }

    public void updateCart() {
        clickOnElement(upDateCart);
        log.info("Click on  : " + upDateCart.toString());

    }

    private void verify(String xpath, String msg) {
        List<WebElement> m1Element = driver.findElements(By.xpath("//strong[@class='product-item-name']"));
        for (WebElement list : m1Element) {
            String name1 = list.getText();
            System.out.println(name1);
        }

    }

    public void clickOnShoppingCart() {
        clickOnElement(clickOnShoppingCart);
        log.info("Click on  : " + clickOnShoppingCart.toString());

    }

    public String getProductNameText() {
        log.info("Get text from  : " + productName.toString());
        return getTextFromElement(productName);
    }

    public String getTextAddedDuffleToCart() {
        log.info("Get text from  : " + txtAddedDuffleToCart.toString());
        return getTextFromElement(txtAddedDuffleToCart);
    }

    public void getQtyText(String qty) {
        log.info("Get text from  : " + verifyQty3.toString());
        verifyThatElementIsDisplayed(verifyQty3);
    }


    public void getProductPrice(String price) {
        log.info("Get text from  : "  + verifyProductPrice.toString());
        verifyThatElementIsDisplayed(verifyProductPrice);

    }
    public void getProductPrice2(String price2) {
        log.info("Get text from  : "+ price2 + verifyProductPrice2.toString());
      verifyThatElementIsDisplayed(verifyProductPrice2);

    }

}
