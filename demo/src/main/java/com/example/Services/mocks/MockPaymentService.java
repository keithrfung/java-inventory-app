package com.example.Services.mocks;

import com.example.Services.PaymentService;

public class MockPaymentService implements PaymentService {
    @Override
    public boolean ChargePayment(String creditCardNumber, double amount) {
        return true;
    }

}
