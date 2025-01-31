package org.example.parkingLotDesign.parkingSpotManager;

import org.example.parkingLotDesign.Ticket;
import org.example.parkingLotDesign.Veichle;
import org.example.parkingLotDesign.parkingSpot.ParkingSpot;
import org.example.parkingLotDesign.parkingStrategy.ParkingStrategy;

import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingStrategy parkingStrategy;
    ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }
    public abstract ParkingSpot findParkingSpace();
    public abstract void addParkingSpace();
    public abstract void removeParkingSpace();
    public abstract void parkVeichle();
    public abstract void removeVeichle(Veichle veichle);
}
