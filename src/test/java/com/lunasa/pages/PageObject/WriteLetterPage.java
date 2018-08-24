package com.lunasa.pages.PageObject;

import org.openqa.selenium.By;

public class WriteLetterPage extends TheMainPage {

    public void enterNewMail() {
        waitToBeClickable(By.xpath("//div/textarea[@name='to']"));
        type(By.xpath("//div/textarea[@name='to']"),"mslunasa@gmail.com");
        type(By.xpath("//div/input[@name='subjectbox']"),"Hello World");
        type(By.xpath("//div[@role='textbox']"),"Just want to say hi");
        implicitlyWait();
        }

    public void closeButton() {
        click(By.xpath("//img[@alt='Close']"));
        implicitlyWait();
    }
    public void verifyDraft() {
        findElement(By.xpath("//div/span/a[@title='Drafts (1)']"));
        findElement(By.xpath("//div/span[@email='mslunasa@gmail.com']"));
        findElement(By.xpath("//form/input[@value='Hello World']"));
        findElement(By.xpath("//*[contains(text(), 'Just want to say hi')]"));
//      Verify the draft content (addressee, subject and body – should be the same as in 3).
    }

    public void sentEmail() {
        click(By.xpath("//div[@role='button' and contains(text(), 'Send')]"));
        implicitlyWait();
//     Send the mail.
//        WebElement sendButton = driver.findElement(By.xpath("//div[@role='button' and contains(text(), 'Send')]"));
//        sendButton.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
