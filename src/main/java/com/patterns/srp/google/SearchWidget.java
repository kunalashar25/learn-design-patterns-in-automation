package com.patterns.srp.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchWidget extends BaseComponent {

    private By SEARCH_TEXTBOX = By.name("q");
    private By EMAIL_TEXTBOX = By.name("email");

    public SearchWidget(WebDriver driver) {
        super(driver);
    }

    public void enterSearchString(String textToEnter) {
        fillValue(SEARCH_TEXTBOX, textToEnter);
    }

    public void enterEmail(String emailId) {
        fillValue(EMAIL_TEXTBOX, emailId);
    }
}
