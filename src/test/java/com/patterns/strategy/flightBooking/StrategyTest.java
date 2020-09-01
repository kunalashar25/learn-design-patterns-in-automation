package com.patterns.strategy.flightBooking;

import com.patterns.BaseTest;
import com.patterns.TestDataProvider;
import com.patterns.strategy.flightBooking.searchType.FlightSearch;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Map;

public class StrategyTest extends BaseTest {

    private EmiratesPage emiratesPage;

    @BeforeTest
    public void setPaymentScreen() {
        this.emiratesPage = new EmiratesPage(this.driver);
    }

    @Test(dataProvider = "getFlightData", dataProviderClass = TestDataProvider.class)
    public void flightTest(FlightSearch flightSearch, Map<String, String> searchDetails) {
        this.emiratesPage.goTo();
        this.emiratesPage.setFlightSearch(flightSearch);
        this.emiratesPage.searchForFlights(searchDetails);
    }
}
