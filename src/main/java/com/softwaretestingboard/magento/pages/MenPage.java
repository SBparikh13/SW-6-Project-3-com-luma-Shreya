package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }

    // Mouse Hover on Men Menu
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']//span[contains(text(),'Men')]")
    WebElement menMenu ;

    // Mouse Hover on Bottoms
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-18']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement bottoms;

    //Click on Pants
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-23']" )
    WebElement pantsTab;
    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectFromDropDown;
    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']" )
    WebElement cronusYogaPant ;

    // Click on Pants
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    WebElement cronusPant32;
    @CacheLookup
    @FindBy(xpath ="//div[@id='option-label-color-93-item-49']" )
    WebElement blackColour;
    @CacheLookup
    @FindBy(xpath ="//div[@id='option-label-color-93-item-49']" )
    WebElement cronusBlackColour;

    @CacheLookup
    @FindBy(xpath = "//form[@action='https://magento.softwaretestingboard.com/checkout/cart/add/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary']")
    WebElement buttonAddToCart;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath ="//div[@data-product-id='880']" )
    WebElement productName ;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]" )
    WebElement shoppingCart ;
    @CacheLookup
    @FindBy(xpath ="//select[@id='sorter']" )
    WebElement selectByProductName ;
    @CacheLookup
    @FindBy(xpath ="//div[@class = 'message-success success message']" )
    WebElement successMessage;

    @CacheLookup
    @FindBy(xpath = "//main[@id='maincontent']//h1")
    WebElement verifyShoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyProductName;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifyProductSize ;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyProductColour ;



    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
        log.info("Click on : " + menMenu.toString());

    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
        log.info("Click on : " + bottoms.toString());

    }
    public void clickOnPantTab(){
     mouseHoverToElementAndClick(pantsTab);
      log.info("Click on : " + pantsTab.toString());

    }
    // Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
    public void clickOnCronusYogaPant(){
       mouseHoverToElementAndClick(cronusYogaPant);
        log.info("Click on : " + cronusYogaPant.toString());

    }

    public void cronusYogaPantAndColourBlack(){
        clickOnElement(blackColour);
        log.info("Click on : " + blackColour.toString());

    }
    public void mouseHoverOnProductName(){
        mouseHoverToElementAndClick(productName);
        log.info("Click on : " + productName.toString());

    }
    public void addToCart(){
        clickOnElement(addToCart);

        //mouseHoverToElementAndClick(addToCart,"Add to Cart");
        List<WebElement> multiElement = driver.findElements(By.xpath("//div[@class='message-success success message']"));

        System.out.println("Total Items are: " + multiElement.size());
        for (WebElement list : multiElement) {
            String name1 = list.getText();
            System.out.println(name1);

        }
        log.info("Click on : " +addToCart.toString());

    }
    public void clickOnShoppingCartLink(){
       mouseHoverToElementAndClick(shoppingCart);
        log.info("Click on : " + shoppingCart.toString());

    }

    public void sortByProductName() {
        selectByVisibleTextFromDropDown(selectByProductName, "Product Name");
        log.info("Select product name from  : " +selectByProductName.toString());

    }

    public void clickOnCronousSize32(String size) {
       mouseHoverToElementAndClick(cronusPant32);
        log.info("mouse hover and click on  : " + cronusPant32.toString());

    }

    public void clickOnCronousBlack() {
        mouseHoverToElementAndClick(cronusBlackColour);
        log.info("Mouse hover on  : " + cronusBlackColour.toString());

    }

    public void mouseHoverOnCronusYogaAndClickAddCart() {
        mouseHoverToElement(productName);
        log.info("Mouse hover on  : " + productName.toString());

    }
    public void clickOnAddCart(){
     mouseHoverToElementAndClick(addToCart);
        log.info("Mouse hover and click : " + addToCart.toString());

    }

    public String getSuccessMsgText() {
        log.info("Get text from : " + successMessage.toString());
        return getTextFromElement(successMessage);

    }

    public String getShoppingCartText() {
        log.info("Get text from : " + verifyShoppingCartText.toString());
        return getTextFromElement(verifyShoppingCartText);
    }

    public String getProductName() {
        log.info("Get text from : " + verifyProductName.toString());
        return getTextFromElement(verifyProductName);
    }

    public String getProductSize(String size) {
        log.info("Get text from : " + verifyProductSize.toString());
        return getTextFromElement(verifyProductSize);
    }

    public String getProductColour() {
        log.info("Get text from : " + verifyProductColour.toString());
        return getTextFromElement(verifyProductColour);
    }
}
