package com.saha.test.test;

import com.saha.test.base.BaseTest;
import com.saha.test.page.LoginPage;
import com.saha.test.page.MainPage;
import com.saha.test.page.MyFavouritesPage;
import org.junit.Test;

public class MyFavouritesPageTest extends BaseTest {

    @Test
    public void MyFavouritesPage() {

        new MainPage(driver)
                .closePopUp()
                .wait(2)
                .clickFavouritesButton()


        ;

        new LoginPage(driver)
                .wait(2)
                .enterEmail("fatmanur.bulacak@gmail.com")
                .enterPassword("123456")
                .clickLogin()
        ;

        new MyFavouritesPage(driver)
                .wait(5)
        .clickDeleteFavourite()
        ;

    }



}
