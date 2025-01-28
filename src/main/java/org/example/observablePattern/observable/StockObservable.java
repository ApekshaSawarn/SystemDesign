package org.example.observablePattern.observable;

import org.example.observablePattern.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver obs);
    public void remove(NotificationAlertObserver obs);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}