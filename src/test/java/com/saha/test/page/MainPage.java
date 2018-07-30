package com.saha.test.page;

import com.saha.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.saha.test.page.LoginPage.POPUP_CSS_SELECTOR;

public class MainPage extends BasePage {

    public static final By LOGIN_BUTTON_MAINPAGE = By.cssSelector(".login-register-button-container");
    public static final By MY_FAVOURITES_BUTTON_MAINPAGE= By.id("favoritesButton");

    /**
     * Kurucu metot
     * @param driver
     */
    public MainPage(WebDriver driver){
        super(driver);
    }

    public MainPage closePopUp(){
        popUpVarMi(POPUP_CSS_SELECTOR);
        return this;
    }

    public MainPage wait(int sec){
        Wait(sec);
        return this;
    }

    public LoginPage clickLoginButton(){
        clickElement(LOGIN_BUTTON_MAINPAGE);
        return new LoginPage(driver);
    }

    public MyFavouritesPage clickFavouritesButton(){

        clickElement(MY_FAVOURITES_BUTTON_MAINPAGE);
        return new MyFavouritesPage(driver);

    }
}
