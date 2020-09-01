package com.patterns.strategy.onlineOrder;

import com.patterns.strategy.onlineOrder.paymentOptions.PaymentOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class PaymentScreen {

    private WebDriver driver;
    private UserInformation userInformation;
    private Order order;
    private PaymentOptions paymentOptions;

    public PaymentScreen(final WebDriver driver) {
        this.driver = driver;
        this.userInformation = PageFactory.initElements(driver, UserInformation.class);
        this.order = PageFactory.initElements(driver, Order.class);
    }

    public void goTo() {
        this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/strategy.html");
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public Order getOrder() {
        return order;
    }

    public void setPaymentOption(PaymentOptions paymentOption) {
        this.paymentOptions = paymentOption;
        PageFactory.initElements(driver, this.paymentOptions);
    }

    public void pay(Map<String, String> paymentDetails) {
        this.paymentOptions.enterPaymentInformation(paymentDetails);
    }


}
