package com.lunasa.pages.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverSingleton;

import java.util.concurrent.TimeUnit;

public class AbstractPage {
//public class AbstractPage extends BrowserPF{
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
//        waitForElementVisible(locator);
//        System.out.println("Typing text '" + text + "' to input form '" + driver.findElement(locator).getAttribute("name") + "' (Located: " + locator + ")");

        driver.findElement(locator).sendKeys(text);
    }

    public void click(final By locator) {
//        waitForElementVisible(locator);
//        System.out.println("Clicking element '" + driver.findElement(locator).getText() + "' (Located: " + locator + ")");
        driver.findElement(locator).click();
    }

    public void waitForElementVisible(By locator) {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
    }

    protected boolean isElementPresent(By locator) {
        return !driver.findElements(locator).isEmpty();
    }

    protected void waitForElementPresent(By locator) {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    protected void waitToBeClickable(By locator) {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitForTitleContains(String string) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(string));
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(ExpectedConditions.titleContains(String.valueOf(locator)));
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

/*    protected void highlightElement(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid green'", element);
    }

    protected void unHighlightElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='0px'", driver.findElement(locator));
   }

    private ExpectedCondition<Boolean> isAjaxFinished() {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active == 0");
            }
        };
    }

    protected void waitForAjaxProcessed() {
        new WebDriverWait(driver, DEFAULT_TIMEOUT).until(isAjaxFinished());
    }
}*/
