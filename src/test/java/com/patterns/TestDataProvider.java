package com.patterns;

import com.patterns.strategy.flightBooking.searchType.MultiWay;
import com.patterns.strategy.flightBooking.searchType.OneWay;
import com.patterns.strategy.flightBooking.searchType.TwoWay;
import org.testng.annotations.DataProvider;
import org.testng.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class TestDataProvider {

    @DataProvider
    public Object[][] getSearchSuggestionData() {
        return new Object[][]{
                {"selenium", 3},
                {"docker", 2}
        };
    }

    @DataProvider
    public Object[][] getSearchData(){
        return new Object[][]{
                {"ENG", "selenium"},
                {"FR", "design patterns"},
                {"SA", "docker"},
                {"ES", "selenium"}
        };
    }

    @DataProvider
    public Object[][] getPaymentData() {

        Map<String, String> cc = Maps.newHashMap();
        cc.put("cc", "1231231231");
        cc.put("year", "2023");
        cc.put("cvv", "123");

        Map<String, String> nb = Maps.newHashMap();
        nb.put("bank", "WELLS FARGO");
        nb.put("account", "myaccount123");
        nb.put("pin", "999");

        return new Object[][]{
                {"CC", cc},
                {"NB", nb}
        };
    }

    @DataProvider
    public Object[][] getFlightData() {
        Map<String, String> map = new HashMap<>();
        map.put("departureCity", "Austin (AUS)");
        map.put("arrivalCity", "Houston (IAH)");
        map.put("arrivalCity2", "Las Vegas (LAS)");

        return new Object[][]{
                {new OneWay(), map},
                {new TwoWay(), map},
                {new MultiWay(), map},
        };
    }
}
