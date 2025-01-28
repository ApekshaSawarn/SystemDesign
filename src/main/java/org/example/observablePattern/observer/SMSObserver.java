package org.example.observablePattern.observer;

import org.example.observablePattern.observable.StockObservable;

public class SMSObserver implements NotificationAlertObserver{
    StockObservable stockObservable;
    String phNo;
    public SMSObserver(StockObservable stockObservable, String phNo) {
        this.stockObservable = stockObservable;
        this.phNo = phNo;
    }
    @Override
    public void update(){
        sendSMS(phNo,"Hurray! Product is in the stock");
    }
    private void sendSMS(String user, String msg) {
        System.out.println(msg+" sent to "+user);
        //send sms actual code
    }
}
