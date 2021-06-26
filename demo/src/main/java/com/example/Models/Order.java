package com.example.Models;

public class Order {
    String UserId;
    PaymentInfo paymentInfo;
    String ShippingFirstName;
    String ShippingLastName;
    String ShippingCity;
    String ShippingState;
    String ShippingZip;
    String OrderId;
    LineItem[] Items;
}
