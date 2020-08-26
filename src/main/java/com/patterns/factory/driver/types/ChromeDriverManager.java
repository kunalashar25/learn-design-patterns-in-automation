package com.patterns.factory.driver.types;

import com.patterns.factory.driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.function.Supplier;

public class ChromeDriverManager extends DriverManager {

    @Override
    public Supplier<WebDriver> getDriver() {
        return () -> {
            WebDriverManager.chromedriver().setup();
            return new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        };
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        return chromeOptions;
    }
}
