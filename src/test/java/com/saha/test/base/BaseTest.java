package com.saha.test.base;

import com.saha.test.page.TopMenu;
import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;


public class BaseTest {


    protected WebDriver driver;
    public static String baseUrl = "https://www.trendyol.com/";
    public static String contractUrl = "https://backoffice-stg.jollytur.ws/";
    public static Boolean isTestinium = false;
    public static Dimension browserSize = null;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("key", System.getProperty("key"));

        if (StringUtils.isEmpty(System.getProperty("key"))){
            System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver");
            driver = new ChromeDriver(capabilities);
        }
        else {
            isTestinium = true;
            driver = new RemoteWebDriver(new URL("http://hub.testinium.io/wd/hub"), capabilities);
            ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
        }

        driver.manage().window().maximize();
        browserSize = driver.manage().window().getSize();
        driver.get(baseUrl);
    }


    @After
    public void tearDown() throws Exception {
        //driver.quit();
    }

}
