package com.patterns;

import org.testng.annotations.DataProvider;
import org.testng.collections.Maps;

import java.util.Map;

public class TestDataProvider {

    @DataProvider
    public Object[][] getLoginData() {
        return new Object[][]{
                {"username1", "password1"},
                {"username2", "password2"}
        };
    }

    @DataProvider
    public Object[][] getPaymentData(){

        Map<String, String> cc = Maps.newHashMap();
        cc.put("cc", "1231231231");
        cc.put("year", "2023");
        cc.put("cvv", "123");

        Map<String, String> nb = Maps.newHashMap();
        nb.put("bank", "WELLS FARGO");
        nb.put("account", "myaccount123");
        nb.put("pin", "999");

        return new Object[][]{
                {"CC", cc} ,
                {"NB", nb}
        };
    }
}
