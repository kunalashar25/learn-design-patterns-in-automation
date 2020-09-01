package com.patterns.strategy.paymentOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentOptionFactory {

    private static final Supplier<PaymentOptions> CC = () -> new CreditCard();
    private static final Supplier<PaymentOptions> NB = () -> new NetBanking();

    private static final Map<String, Supplier<PaymentOptions>> PAYMENT_OPTIONS_MAP = new HashMap<>();

    static {
        PAYMENT_OPTIONS_MAP.put("CC", CC);
        PAYMENT_OPTIONS_MAP.put("NB", NB);
    }

    public static PaymentOptions get(String option) {
        return PAYMENT_OPTIONS_MAP.get(option).get();

    }
}
