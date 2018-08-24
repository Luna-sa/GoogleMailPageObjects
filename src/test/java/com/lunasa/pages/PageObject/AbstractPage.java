package com.lunasa.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverSingleton;

import java.util.concurrent.TimeUnit;

public class AbstractPage {
    private static final int DEFAULT_TIMEOUT = 10;
    protected WebDriver driver;

    protected AbstractPage() {
        this.driver = WebDriverSingleton.getWebDriverInstance();
    }

    public void open(String url) {
        System.out.println("Going to URL: " + url);
        driver.get(url);
    }

    public void type(final By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void click(final By locator) {
        driver.findElement(locator).click();
    }

    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
    }


    protected void waitToBeClickable(By locator) {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitForTitleContains(String string) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(string));
    }

    protected void waitForElementEnabled(By locator) {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void findElement(By locator) {
        new WebDriverWait(driver, 10);
        driver.findElement(locator);
    }

    public static void kill() {
        WebDriverSingleton.getWebDriverInstance().quit();
    }

}
