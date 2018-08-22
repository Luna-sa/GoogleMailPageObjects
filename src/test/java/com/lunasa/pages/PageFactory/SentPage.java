package com.lunasa.pages.PageFactory;

import org.openqa.selenium.By;

public class SentPage extends TheMainPage{
        public void verifySentFolderCotainsMail() {
//      Verify, that the mail is in ‘Sent’ folder.
            findElement(By.xpath("//div/span/a[@title='Drafts']"));
            open("https://mail.google.com/mail/u/0/#sent");
            implicitlyWait();
            findElement(By.xpath("//*[contains(text(), 'Hello World')]/ancestor::tr/td/div[@role='link']"));
//            driver.findElement(By.xpath("//div/span/a[@title='Drafts']"));
//            driver.get("https://mail.google.com/mail/u/0/#sent");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.findElement(By.xpath("//*[contains(text(), 'Hello World')]/ancestor::tr/td/div[@role='link']"));
        }
}
