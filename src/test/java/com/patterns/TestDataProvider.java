package com.patterns;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider
    public Object[][] getLoginData() {
        return new Object[][]{
                {"username1", "password1"},
                {"username2", "password2"}
        };
    }
}
