package com.saha.test.test;

import com.saha.test.base.BaseTest;
import com.saha.test.page.LoginPage;
import com.saha.test.page.MainPage;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void LoginPage() {

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
    }

}