package com.lunasa.pages.PageFactory;

import org.openqa.selenium.By;

public class DraftsPage extends TheMainPage{
//      Verify, that the mail presents in ‘Drafts’ folder.
        public void verifyMailInDrafts() {
            open("https://mail.google.com/mail/u/0/#drafts");
            implicitlyWait();
            click(By.xpath("//*[contains(text(), 'Hello World')]/ancestor::tr/td/div[@role='link']"));
            implicitlyWait();
//            driver.get("https://mail.google.com/mail/u/0/#drafts");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            WebElement draftLetter = driver.findElement(By.xpath("//*[contains(text(), 'Hello World')]/ancestor::tr/td/div[@role='link']"));
//            draftLetter.click();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        public void verifyEmptyDrafts() {
            open("https://mail.google.com/mail/u/0/#inbox");
            implicitlyWait();
//                  Verify, that the mail disappeared from ‘Drafts’ folder.
//            driver.get("https://mail.google.com/mail/u/0/#inbox");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
}
