package com.lunasa.pages.PageObject;

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

    }
}
