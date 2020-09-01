package com.patterns.strategy.flightBooking.searchType;

import com.patterns.strategy.flightBooking.DatePicker;

import java.util.Map;

public interface FlightSearch {
    void search(Map<String, String> searchDetails);

    void setDatePicker(DatePicker datePicker);
}
