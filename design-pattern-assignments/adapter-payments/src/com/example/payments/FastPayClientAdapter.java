package com.example.payments;

public class FastPayClientAdapter implements PaymentGateway{
    private final FastPayClient fPayClient;

    public FastPayClientAdapter(FastPayClient fPayClient) {
        this.fPayClient = fPayClient;
    }

    @Override
    public String charge(String customerId, int amountCents){
        return fPayClient.payNow(customerId, amountCents);
    }
}
