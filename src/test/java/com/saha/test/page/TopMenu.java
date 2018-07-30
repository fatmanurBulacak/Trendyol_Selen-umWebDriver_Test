package com.saha.test.page;

import com.saha.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenu extends BasePage {

    public static final By CLICK_WOMAN_MENU = By.id("item1");
    public static final By  CLICK_MAN_MENU= By.id("item2");
    public static final By CLICK_CHILD_MENU= By.id("item3");
    public static final By CLICK_SPORTS_CLOTHING_MENU= By.id("item4");
    public static final By CLICK_SHOES_AND_BAG_MENU= By.id("item5");
    public static final By  CLICK_WATCH_AND_ACCESSORY_MENU= By.id("item6");
    public static final By CLICK_COSMETIC_MENU= By.id("item7");
    public static final By CLICK_HOME_AND_LIFE_MENU= By.id("item8");
    public static final By CLICK_QUICK_DELIVERY_MENU= By.id("item9");

    public static final By BUTIK_LARGE_IMAGE = By.cssSelector(".butik-large-image");
    public static final By PRODUCT_INFO_CONTAINER = By.cssSelector(".product-info-container");




    public TopMenu(WebDriver driver) {
        super(driver);
    }



     public TopMenu wait(int sec){
            Wait(sec);
            return this;
        }

      public TopMenu list(){
        clickElements(BUTIK_LARGE_IMAGE);
        return this;
      }

      public TopMenu productList(){
        clickElements(PRODUCT_INFO_CONTAINER);
        return this;

      }


    public TopMenu clickWoman() {
        clickElement(CLICK_WOMAN_MENU);

               return this;
        }

    public TopMenu clickShoesAndBag() {
        clickElement(CLICK_SHOES_AND_BAG_MENU);
          return this;

    }

}
