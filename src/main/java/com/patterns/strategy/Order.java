package com.patterns.strategy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order {

    private WebDriver driver;

    By ORDER_NO_TEXT = By.id("");
    By SUBMIT_ORDER_BUTTON = By.cssSelector("");

    public Order(WebDriver driver) {
        this.driver = driver;
    }

    public String placeOrder() {
        driver.findElement(SUBMIT_ORDER_BUTTON).click();
        return driver.findElement(ORDER_NO_TEXT).getText();
    }


}
