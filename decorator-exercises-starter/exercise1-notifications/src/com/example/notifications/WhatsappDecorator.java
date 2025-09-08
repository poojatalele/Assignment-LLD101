package com.example.notifications;

public class WhatsappDecorator extends NotifierDecorator {
    private final String phoneNumber;

    public WhatsappDecorator(Notifier nf, String phoneNumber) {
        super(nf);
        this.phoneNumber = phoneNumber;
    }

    public void notify(String text) {
        super.notify(text);
        System.out.println("Sending whatsapp message to " + phoneNumber + ": " + text);
    }
}
