package com.lunasa.pages.PageFactory;

import org.openqa.selenium.By;

public class TheMainPage extends AbstractPage{

        public void assertLogIn() {
            //      Assert, that the login is successful.
            open("https://mail.google.com/mail/");
            waitForTitleContains("msslunasa@gmail.com - Gmail");
            implicitlyWait();
//            WebDriverWait wait3 = new WebDriverWait(driver, 10);
//            wait3.until(ExpectedConditions.titleContains("msslunasa@gmail.com - Gmail"));
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//            WebDriverWait wait3 = new WebDriverWait(driver, 10);
//            waitForTitleContains("msslunasa@gmail.com - Gmail");
//            implicitlyWait();

//      Assert, that the login is successful.
//            driver.get("https://mail.google.com/mail/");
//            WebDriverWait wait3 = new WebDriverWait(driver, 10);
//            wait3.until(ExpectedConditions.titleContains("msslunasa@gmail.com - Gmail"));
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void composeButton() {
////      Create a new mail (fill addressee, subject and body fields).
//            driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
//            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            //      Create a new mail (fill addressee, subject and body fields).
//            driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
//            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            click(By.xpath("//div[contains(text(),'COMPOSE')]"));
            implicitlyWait();
        }

//      Log off.
        public void logOff() {
//            driver.get("https://accounts.google.com/SignOutOptions?hl=en-GB&continue=https://mail.google.com/mail&service=mail");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get("https://accounts.google.com/Logout?hl=en-GB&continue=https://mail.google.com/mail&service=mail&timeStmp=1533070972&secTok=.AG5fkS9JgVx6uFohW2W2F3tkHZMZiOF11g");
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
            open("https://accounts.google.com/SignOutOptions?hl=en-GB&continue=https://mail.google.com/mail&service=mail");
            implicitlyWait();
            open("https://accounts.google.com/Logout?hl=en-GB&continue=https://mail.google.com/mail&service=mail&timeStmp=1533070972&secTok=.AG5fkS9JgVx6uFohW2W2F3tkHZMZiOF11g");
            implicitlyWait();
        }
}
