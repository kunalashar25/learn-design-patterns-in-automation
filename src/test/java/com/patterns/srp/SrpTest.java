package com.patterns.srp;

import com.patterns.BaseTest;
import com.patterns.TestDataProvider;
import org.testng.annotations.Test;

public class SrpTest extends BaseTest {

    @Test
    public void testLaunch() {
        this.driver.get("https://www.google.com/");
    }

    @Test(dataProvider = "getLoginData", dataProviderClass = TestDataProvider.class)
    public void printData(String username, String password) {
        System.out.println(username + " | " + password);
    }

}
