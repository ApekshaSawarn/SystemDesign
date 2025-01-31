package org.example.parkingLotDesign.parkingSpotManager;

import org.example.parkingLotDesign.Ticket;
import org.example.parkingLotDesign.Veichle;
import org.example.parkingLotDesign.parkingSpot.ParkingSpot;
import org.example.parkingLotDesign.parkingSpot.TwoWheelerParkingSpot;
import org.example.parkingLotDesign.parkingStrategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    List<ParkingSpot> parkingSpotList;
    ParkingStrategy parkingStrategy;
    TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList,parkingStrategy);
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }

    @Override
    public ParkingSpot findParkingSpace() {
        return new TwoWheelerParkingSpot();
    }

    @Override
    public void addParkingSpace() {

    }

    @Override
    public void removeParkingSpace() {

    }

    @Override
    public void parkVeichle() {

    }

    @Override
    public void removeVeichle(Veichle veichle) {

    }
}
