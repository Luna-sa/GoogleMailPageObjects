package com.lunasa.pages.PageObject;

import org.openqa.selenium.By;

public class DraftsPage extends TheMainPage {
//      Verify, that the mail presents in ‘Drafts’ folder.
        public void verifyMailInDrafts() {
            open("https://mail.google.com/mail/u/0/#drafts");
            implicitlyWait();
            click(By.xpath("//*[contains(text(), 'Hello World')]/ancestor::tr/td/div[@role='link']"));
            implicitlyWait();
        }
        public void verifyEmptyDrafts() {
            open("https://mail.google.com/mail/u/0/#inbox");
            implicitlyWait();
//                  Verify, that the mail disappeared from ‘Drafts’ folder.
        }
}
