package com.lunasa.pages.PageObject;

import org.openqa.selenium.By;

public class SentPage extends TheMainPage {
        public void verifySentFolderCotainsMail() {
//      Verify, that the mail is in ‘Sent’ folder.
            findElement(By.xpath("//div/span/a[@title='Drafts']"));
            open("https://mail.google.com/mail/u/0/#sent");
            implicitlyWait();
            findElement(By.xpath("//*[contains(text(), 'Hello World')]/ancestor::tr/td/div[@role='link']"));
        }
}
