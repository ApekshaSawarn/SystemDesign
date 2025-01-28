package org.example.observablePattern.observer;

import org.example.observablePattern.observable.StockObservable;

public class EmailObserver implements NotificationAlertObserver{
    StockObservable observable;
    String email;
    public EmailObserver(StockObservable observable, String email) {
        this.observable=observable;
        this.email=email;
    }
    @Override
    public void update(){
        sendEmail(email,"Hurray! Product is in the stock");
    }
    private void sendEmail(String user, String msg) {
        System.out.println(msg+" sent to "+user);
        //send email actual code
    }
}