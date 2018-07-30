package com.saha.test.page;

import com.saha.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public static final By POPUP_CSS_SELECTOR = By.cssSelector(".fancybox-item.fancybox-close");
    public static final By EMAIL_TEXTBOX= By.id("email");
    public static final By PASSWORD_TEXTBOX = By.id("password");
    public static final By LOGIN_SUBMIT_BUTTON = By.id("loginSubmit");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterEmail(String email){
        sendKeysToElement(EMAIL_TEXTBOX,email);
        return this;
    }

    public LoginPage enterPassword(String password){
        sendKeysToElement(PASSWORD_TEXTBOX, password);
        return this;
    }

    public MainPage clickLogin(){
        clickLogin(LOGIN_SUBMIT_BUTTON);
        return new MainPage(driver);
    }


    public LoginPage wait(int sec){
        Wait(sec);
        return this;
    }
}
