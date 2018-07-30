package com.saha.test.base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.Thread.sleep;

public class BasePage  {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20, 1000);
    }

    public WebElement clickElement(By by) {

        WebElement element = driver.findElement(by);
        element.click();
        return element;

    }

    public WebElement clickLogin(By by) {

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
        return element;
    }

    public List<WebElement> clickElements(By by) {

        List<WebElement> webElements = driver.findElements(by);
        webElements.get(2).click();
        return webElements;
    }

    public String getElementText(By by) {
        WebElement element = driver.findElement(by);
        String text = element.getText();
        return text;
    }

    public WebElement sendKeysToElement(By by, String value) {

        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(value);

        return element;

    }

    public void Wait(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (Exception e) {
            Assert.fail("explicitWait error: " + e.toString());
        }
    }

    public void popUpVarMi(By by){

        Boolean popUpVarMi = driver.findElements(by).size() > 0;
        if (popUpVarMi) {
            WebElement popUpKapat = driver.findElement(by);
            popUpKapat.click();
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    public WebElement findElement(By by) {
        WebElement webElement = driver.findElement(by);
        new Actions(driver).moveToElement(webElement).build().perform();
        scroll(webElement);
        return webElement;
    }

    public void scroll(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'})",
                webElement);
    }

}
