package com.example.Services;

public interface PaymentService {
    public boolean ChargePayment(String creditCardNumber, double amount);
}
