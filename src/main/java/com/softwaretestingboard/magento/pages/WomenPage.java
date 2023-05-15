package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
   private static final Logger log = LogManager.getLogger(WomenPage.class.getName());

   public WomenPage() {
      PageFactory.initElements(driver, this);

   }

   // Mouse Hover on Women Menu
   @CacheLookup
   @FindBy(xpath ="//a[@id='ui-id-4']//span[contains(text(),'Women')]" )
   WebElement womenMenu ;
   // Mouse Hover on Tops
   @CacheLookup
   @FindBy(linkText = "Tops")
   WebElement tops;
   // Click on Jackets
   @CacheLookup
   @FindBy(linkText = "Jackets")
   WebElement clickOnJackets;
   @CacheLookup
   @FindBy(xpath = "//div[2]//div[3]//select[1]")
   WebElement selectByFilterProductName;
   @CacheLookup
   @FindBy(xpath = "//div[@class='column main']//div[2]//div[3]//a[1]")
   WebElement descOrder;
   @CacheLookup
   @FindBy(xpath = "//select[@id='sorter']")
   WebElement selectByFilterPrice;

   @CacheLookup
   @FindBy(xpath = "//div[2]//div[3]//select[1]/option[3]")
  List<WebElement> listOrder;
    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]/option[3]")
    List<WebElement> listSorted;
   public void mouseHoverOnWomen() {
      mouseHoverToElement(womenMenu);
      log.info("Mouse hover on: " + womenMenu.toString());


   }
   public void mouseHoverOnTop() {
      mouseHoverToElement(tops);
      log.info("Mouse hover on : " + tops.toString());

   }
   public void clickOnJacket(){
      clickOnElement(clickOnJackets);
      log.info("Click on : " + clickOnJackets.toString());


   }
   public void selectByFilterPrice(){
      selectByVisibleTextFromDropDown(selectByFilterProductName,"Price");
       log.info("Select products: " + selectByFilterProductName.toString());

   }
   public void selectByFilterProductName(){
       selectByVisibleTextFromDropDown(selectByFilterProductName,"Product Name");
       log.info("Select products: " + selectByFilterProductName.toString());


   }
   public void verifySelectByProductName() {

       ArrayList<String> originalList = new ArrayList<>();
       for (WebElement e : listOrder) {
           originalList.add(e.getText());
       }
       Collections.sort(originalList);

       //Select Sort By filter “Product Name”
//      selectByVisibleTextFromDropDown(selectByFilterProductName,"Product Name");
//       log.info("Select products: " + selectByFilterProductName.toString());

       ArrayList<String> listAfterSorting = new ArrayList<>();
       for (WebElement e : listSorted) {
           listAfterSorting.add(e.getText());
       }
       System.out.println(listAfterSorting);

       Assert.assertEquals(originalList, listAfterSorting);

   }
   public void verifySelectByFilterPrice(){


   //List<WebElement> listOrder = driver.findElements(By.xpath("//div[2]//div[3]//select[1]/option[3]"));
   ArrayList<String> originalList = new ArrayList<>();
        for (WebElement e : listOrder) {
      originalList.add(e.getText());
   }
        Collections.sort(originalList);

   //Select Sort By filter “Price”
//       selectByVisibleTextFromDropDown(selectByFilterPrice,"price");
//       log.info("Select price : " + selectByFilterPrice.toString());

   ArrayList<String> listAfterSorting = new ArrayList<>();
        for (WebElement e : listSorted) {
      listAfterSorting.add(e.getText());
   }
        Assert.assertEquals(originalList, listAfterSorting);

}

}

