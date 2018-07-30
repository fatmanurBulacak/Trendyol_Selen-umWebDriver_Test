package com.saha.test.test;

import com.saha.test.base.BaseTest;
import com.saha.test.page.LoginPage;
import com.saha.test.page.MainPage;
import com.saha.test.page.TopMenu;
import org.junit.Test;

public class WomanMenuTest extends BaseTest {


    @Test
    public void WomanMenuTest() {

        new MainPage(driver)
                .closePopUp()
                .wait(2)
                .clickLoginButton()

        ;

        new LoginPage(driver)
                .enterEmail("fatmanur.bulacak@gmail.com")
                .enterPassword("123456")
                .clickLogin()
        ;

        new TopMenu(driver)
                .wait(5)
                .clickWoman()
                .list()
                .productList()

        ;


    }

}
