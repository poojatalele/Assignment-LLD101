package com.example.notifications;

public class NotifierDecorator implements Notifier {
    protected final Notifier nf;

    public NotifierDecorator(Notifier nf) {
        this.nf = nf;
    }

    @Override
    public void notify(String text) {
        nf.notify(text);
    }
    
}
