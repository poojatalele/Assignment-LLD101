package com.example.notifications;

public class SMSDecorator extends NotifierDecorator {
    private final String phno;

    public SMSDecorator(Notifier nf, String phno) {
        super(nf);
        this.phno = phno;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("Sending sms to phno " + phno + ": " + text);
    }
}

