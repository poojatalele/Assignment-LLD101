package com.example.payments;

public class SafeCashClientAdapter implements PaymentGateway{
    private final SafeCashClient sCashClient;

    public SafeCashClientAdapter(SafeCashClient sCashClient) {
        this.sCashClient = sCashClient;
    }

    @Override
    public String charge(String customerId, int amountCents){
        return sCashClient.createPayment(amountCents, customerId).confirm();
    }
}
