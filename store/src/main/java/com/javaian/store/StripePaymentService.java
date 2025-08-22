package com.javaian.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount)
    {
        System.out.println("STRIPEs");
        System.out.println("Amount  " + amount + " paid.");
    }
}
