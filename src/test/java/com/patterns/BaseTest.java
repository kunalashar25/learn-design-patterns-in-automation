package com.patterns;

import com.google.common.util.concurrent.Uninterruptibles;
import com.patterns.factory.driver.DriverFactory;
import com.patterns.factory.driver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setupDriver() {
        driver = DriverFactory.getWebDriver(DriverType.CHROME);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void quitDriver() {
        // adding sleep to see changes on UI before it is closed. No need to use this in actual project
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        driver.quit();
    }

}
