package com.patterns.factory.driver;

import com.patterns.factory.driver.types.ChromeDriverManager;
import com.patterns.factory.driver.types.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {

    private static final Map<DriverType, Supplier<WebDriver>> driverMap = new HashMap<>();
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    static {
        driverMap.put(DriverType.FIREFOX, new FirefoxDriverManager().getDriver());
        driverMap.put(DriverType.CHROME, new ChromeDriverManager().getDriver());
    }

    public static WebDriver getWebDriver(DriverType driverType) {
        driverThreadLocal.set(driverMap.get(driverType).get());
        return driverThreadLocal.get();
    }
}
