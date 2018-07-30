package com.saha.test.test;

import com.saha.test.base.BaseTest;
import com.saha.test.page.LoginPage;
import com.saha.test.page.MainPage;
import com.saha.test.page.TopMenu;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {

    @Test
    public void TopMenuTest() {

        new MainPage(driver)
                .closePopUp()
                ;


        new TopMenu(driver)
                .clickShoesAndBag()
                .clickWoman()

                ;

    }



}
