package com.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserInformation {

    private WebDriver driver;

    By FIRST_NAME_TEXTBOX = By.xpath("");
    By EMAIL_TEXTBOX = By.id("");


    public UserInformation(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDetails(String firstName, String email) {
        driver.findElement(FIRST_NAME_TEXTBOX).sendKeys(firstName);
        driver.findElement(EMAIL_TEXTBOX).sendKeys(email);
    }
}
