package com.saha.test.page;

import com.saha.test.base.BasePage;
import com.saha.test.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyFavouritesPage extends BasePage {

    public static final By DELETE_FAVOURITE_ICON_FAVOURITEPAGE = By.cssSelector(".delete-icon");



    public MyFavouritesPage(WebDriver driver) {
        super(driver);
    }

    public MyFavouritesPage clickDeleteFavourite() {

        clickElement(DELETE_FAVOURITE_ICON_FAVOURITEPAGE);
        return this;
    }

    public MyFavouritesPage wait(int sec){
        Wait(sec);
        return this;
    }

}
