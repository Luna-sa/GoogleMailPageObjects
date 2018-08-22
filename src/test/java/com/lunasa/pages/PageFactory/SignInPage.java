package com.lunasa.pages.PageFactory;

import org.openqa.selenium.By;

public class SignInPage extends AbstractPage {

    public void enterLogin() {
        // Login to the mail box.
        open("https://accounts.google.com/ServiceLogin/signinchooser?");
        implicitlyWait();
        // Enter the name of your mail:
        type(By.id("identifierId"), "msslunasa@gmail.com");
        click(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
    }
}
