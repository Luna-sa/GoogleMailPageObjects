package com.lunasa.gmail.tests;

import com.lunasa.pages.PageFactory.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GmailTestPageFactory {

	@BeforeClass
	public void setUp() {
	}

	@Test
	public void GmailTest() {
	    try {
            SignInPage s = new SignInPage();
            s.enterLogin();

            PasswordPage password = new PasswordPage();
            password.enterPassword();

            TheMainPage assertLogIn = new TheMainPage();
            assertLogIn.assertLogIn();

            TheMainPage compose = new TheMainPage();
            compose.composeButton();

            WriteLetterPage fillFields = new WriteLetterPage();
            fillFields.enterNewMail();

            WriteLetterPage closeButton = new WriteLetterPage();
            closeButton.closeButton();

            DraftsPage verifyMailInDrafts = new DraftsPage();
            verifyMailInDrafts.verifyMailInDrafts();

            WriteLetterPage verifyMail = new WriteLetterPage();
            verifyMail.verifyDraft();

            WriteLetterPage sentEmail = new WriteLetterPage();
            sentEmail.sentEmail();

            DraftsPage verifyDraftIsEmpty = new DraftsPage();
            verifyDraftIsEmpty.verifyEmptyDrafts();

            SentPage verifyMailInSentFolder = new SentPage();
            verifyMailInSentFolder.verifySentFolderCotainsMail();

            TheMainPage logOff = new TheMainPage();
            logOff.logOff();
        } finally {
            AbstractPage.kill();
        }
	}

	@AfterClass
	public void tearDown() {
	}
}
