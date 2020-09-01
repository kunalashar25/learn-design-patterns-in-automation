package com.patterns.srp.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseComponent {

    WebDriver driver;
    WebDriverWait webDriverWait;

    public BaseComponent(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 20);
    }

    public void fillValue(By by, String textToEnter) {
        waitForVisibilityOfElement(by);
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(textToEnter);
    }

    public void waitForVisibilityOfElement(By by) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }


}
