package com.patterns.strategy.paymentOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class CreditCard implements PaymentOptions {

    WebDriver driver;

    By CC_TEXTBOX = By.id("cc");
    By YEAR_TEXTBOX = By.id("year");
    By CVV_TEXTBOX = By.id("cvv");

    @Override
    public void enterPaymentDetails(Map<String, String> paymentDetails) {
        driver.findElement(CC_TEXTBOX).sendKeys(paymentDetails.get("cc"));
        driver.findElement(YEAR_TEXTBOX).sendKeys(paymentDetails.get("year"));
        driver.findElement(CVV_TEXTBOX).sendKeys(paymentDetails.get("cvv"));
    }
}
