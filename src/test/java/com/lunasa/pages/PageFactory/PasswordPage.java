package com.lunasa.pages.PageFactory;

import org.openqa.selenium.By;

public class PasswordPage extends AbstractPage {

    public void enterPassword ()

    {
        //      Enter your password:
        waitToBeClickable(By.name("password"));
        type(By.name("password"),"Rty67ui9");
        implicitlyWait();
        waitToBeClickable(By.id("passwordNext"));
        click(By.id("passwordNext"));
        implicitlyWait();

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
//        passwordField.sendKeys("Rty67ui9");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebDriverWait wait2 = new WebDriverWait(driver, 10);
//        WebElement loginButton2 = wait2.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));
//        loginButton2.click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//        WebDriverWait wait = new WebDriverWait(driver, 10);
////      Enter your password:
//        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
//        passwordField.sendKeys("Rty67ui9");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebDriverWait wait2 = new WebDriverWait(driver, 10);
//        WebElement loginButton2 = wait2.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));
//        loginButton2.click();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
}
