package com.patterns.strategy.paymentOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class NetBanking implements PaymentOptions {

    WebDriver driver;

    By BANK_TEXTBOX = By.id("bank");
    By ACCOUNT_TEXTBOX = By.id("acc");
    By PIN_TEXTBOX = By.id("pin");

    @Override
    public void enterPaymentDetails(Map<String, String> paymentDetails) {
        driver.findElement(BANK_TEXTBOX).sendKeys(paymentDetails.get("bank"));
        driver.findElement(ACCOUNT_TEXTBOX).sendKeys(paymentDetails.get("acc"));
        driver.findElement(PIN_TEXTBOX).sendKeys(paymentDetails.get("pin"));
    }
}
