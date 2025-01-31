package org.example.observablePattern;

import org.example.observablePattern.observable.IphoneStockObservableImpl;
import org.example.observablePattern.observer.EmailObserver;
import org.example.observablePattern.observer.NotificationAlertObserver;
import org.example.observablePattern.observer.SMSObserver;

public class Store {
    public static void main(String[] args) {
        IphoneStockObservableImpl iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver obs1= new EmailObserver(iphoneStockObservable,"xyz@gmail.com");
        NotificationAlertObserver obs2= new SMSObserver(iphoneStockObservable,"8210757631");

        iphoneStockObservable.add(obs1);
        iphoneStockObservable.add(obs2);
        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);
    }
}
