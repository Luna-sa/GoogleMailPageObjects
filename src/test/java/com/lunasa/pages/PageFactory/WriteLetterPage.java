package com.lunasa.pages.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WriteLetterPage extends TheMainPage{

    public void enterNewMail() {
//        WebDriverWait wait4 = new WebDriverWait(driver, 10);
//        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/textarea[@name='to']")));
        waitToBeClickable(By.xpath("//div/textarea[@name='to']"));
        type(By.xpath("//div/textarea[@name='to']"),"mslunasa@gmail.com");
        type(By.xpath("//div/input[@name='subjectbox']"),"Hello World");
        type(By.xpath("//div[@role='textbox']"),"Just want to say hi");
        implicitlyWait();

//        WebElement sentTo = driver.findElement(By.xpath("//div/textarea[@name='to']"));
//        sentTo.sendKeys("mslunasa@gmail.com");
//        WebElement subject = driver.findElement(By.xpath("//div/input[@name='subjectbox']"));
//        subject.sendKeys("Hello World");
//        WebElement messageBody = driver.findElement(By.xpath("//div[@role='textbox']"));
//        messageBody.sendKeys("Just want to say hi");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//        WebDriverWait wait4 = new WebDriverWait(driver, 10);
//        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/textarea[@name='to']")));
//        WebElement sentTo = driver.findElement(By.xpath("//div/textarea[@name='to']"));
//        sentTo.sendKeys("mslunasa@gmail.com");
//        WebElement subject = driver.findElement(By.xpath("//div/input[@name='subjectbox']"));
//        subject.sendKeys("Hello World");
//        WebElement messageBody = driver.findElement(By.xpath("//div[@role='textbox']"));
//        messageBody.sendKeys("Just want to say hi");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void closeButton() {
        click(By.xpath("//img[@alt='Close']"));
        implicitlyWait();
//        WebElement closeButton = driver.findElement(By.xpath("//img[@alt='Close']"));
//        closeButton.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void verifyDraft() {
        findElement(By.xpath("//div/span/a[@title='Drafts (1)']"));
        findElement(By.xpath("//div/span[@email='mslunasa@gmail.com']"));
        findElement(By.xpath("//form/input[@value='Hello World']"));
        findElement(By.xpath("//*[contains(text(), 'Just want to say hi')]"));
//      Verify the draft content (addressee, subject and body – should be the same as in 3).
//        driver.findElement(By.xpath("//div/span/a[@title='Drafts (1)']"));
//        driver.findElement(By.xpath("//div/span[@email='mslunasa@gmail.com']"));
//        driver.findElement(By.xpath("//form/input[@value='Hello World']"));
//        driver.findElement(By.xpath("//*[contains(text(), 'Just want to say hi')]"));
    }

    public void sentEmail() {
//        click(By.xpath("//div[@role='button' and contains(text(), 'Send')]"));
//        implicitlyWait();
//      Send the mail.
        WebElement sendButton = driver.findElement(By.xpath("//div[@role='button' and contains(text(), 'Send')]"));
        sendButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
