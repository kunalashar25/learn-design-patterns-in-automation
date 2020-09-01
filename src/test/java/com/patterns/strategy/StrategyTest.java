package com.patterns.strategy;

import com.patterns.BaseTest;
import com.patterns.TestDataProvider;
import com.patterns.strategy.paymentOptions.PaymentOptionFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Map;

public class StrategyTest extends BaseTest {

    private PaymentScreen paymentScreen;

    @BeforeTest
    public void setPaymentScreen() {
        this.paymentScreen = new PaymentScreen();
    }

    @Test(dataProvider = "getPaymentData", dataProviderClass = TestDataProvider.class)
    public void payWithCreditCard(String option, Map<String, String> paymentDetails) {
        this.paymentScreen.goTo();
        this.paymentScreen.getUserInformation().enterDetails("fname", "email");
        this.paymentScreen.setPaymentOption(PaymentOptionFactory.get(option));
        this.paymentScreen.pay(paymentDetails);
        String orderNumber = this.paymentScreen.getOrder().placeOrder();
    }
}
