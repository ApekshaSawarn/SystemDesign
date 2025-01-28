package org.example.observablePattern.observable;

import org.example.observablePattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{
    List<NotificationAlertObserver> obsList = new ArrayList<>();
    int count = 0;

    @Override
    public void add(NotificationAlertObserver obs) {
        obsList.add(obs);
    }
    @Override
    public void remove(NotificationAlertObserver obs) {
        obsList.remove(obs);
    }
    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver obs:obsList) {
            obs.update();
        }
    }
    public void setStockCount(int newCount) {
        if(count == 0)
            notifySubscriber();
        count = newCount;
    }
    public int getStockCount(){
        return count;
    }
}