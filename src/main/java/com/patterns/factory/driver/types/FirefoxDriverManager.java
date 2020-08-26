package com.patterns.factory.driver.types;

import com.patterns.factory.driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.function.Supplier;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public Supplier<WebDriver> getDriver() {
        return () -> {
            WebDriverManager.firefoxdriver().setup();
            return new EventFiringWebDriver(new FirefoxDriver(getFirefoxOptions()));
        };
    }

    private FirefoxOptions getFirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("disable-infobars");
        return firefoxOptions;
    }
}
