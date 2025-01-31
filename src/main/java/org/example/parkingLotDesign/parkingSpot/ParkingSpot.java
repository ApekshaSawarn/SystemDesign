package org.example.parkingLotDesign.parkingSpot;

import org.example.parkingLotDesign.Veichle;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    Veichle veichle;
    int price;
    public void addVeichle(Veichle veichle) {
        this.veichle = veichle;
        isEmpty = false;
    }
    public void removeVeichle(Veichle veichle) {
        this.veichle = null;
        isEmpty = true;
    }
    public abstract int price();
}
