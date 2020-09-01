package com.patterns.srp.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchSuggestion extends BaseComponent {

    private By SUGGESTIONS_LIST = By.cssSelector("li.sbct");

    public SearchSuggestion(WebDriver driver) {
        super(driver);
    }
}
