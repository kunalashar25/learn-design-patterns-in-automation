package com.patterns.strategy.flightBooking.searchType;

import com.patterns.strategy.flightBooking.DatePicker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class TwoWay implements FlightSearch {

    @FindBy(id = "Div1")
    private WebElement twowayRadio;

    @FindBy(id = "ctl00_c_CtWNW_ddlFrom-suggest")
    private WebElement departureCity;

    @FindBy(id = "ctl00_c_CtWNW_ddlTo-suggest")
    private WebElement arrivalCity;

    @FindBy(id = "ctl00_c_CtWNW_dvDepartDate")
    private WebElement departureDate;

    @FindBy(id = "dvReturnDate")
    private WebElement returnDate;

    private DatePicker datePicker;

    @Override
    public void search(Map<String, String> searchDetails) {
        this.twowayRadio.click();
        this.departureCity.sendKeys(searchDetails.get("departureCity"));
        this.departureDate.click();
        this.datePicker.selectToday();
        this.arrivalCity.sendKeys(searchDetails.get("arrivalCity"));
        this.returnDate.click();
        this.datePicker.selectRandomFutureDate();
    }

    @Override
    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }
}
