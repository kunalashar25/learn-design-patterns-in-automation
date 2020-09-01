package com.patterns.strategy;

import com.patterns.strategy.paymentOptions.PaymentOptions;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class PaymentScreen {

    private WebDriver driver;
    private UserInformation userInformation;
    private Order order;
    private PaymentOptions paymentOptions;

    public void goTo() {
        this.driver.get("url");
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public Order getOrder() {
        return order;
    }

    public void setPaymentOption(PaymentOptions paymentOption) {
        this.paymentOptions = paymentOption;
    }

    public void pay(Map<String, String> paymentDetails) {
        this.paymentOptions.enterPaymentDetails(paymentDetails);
    }


}
