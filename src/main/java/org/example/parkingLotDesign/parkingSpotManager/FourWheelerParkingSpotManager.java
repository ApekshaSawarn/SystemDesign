package org.example.parkingLotDesign.parkingSpotManager;

import org.example.parkingLotDesign.Ticket;
import org.example.parkingLotDesign.Veichle;
import org.example.parkingLotDesign.parkingSpot.FourWheelerParkingSpot;
import org.example.parkingLotDesign.parkingSpot.ParkingSpot;
import org.example.parkingLotDesign.parkingStrategy.ParkingStrategy;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    List<ParkingSpot> parkingSpotList;
    ParkingStrategy parkingStrategy;
    FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList,parkingStrategy);
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }

    @Override
    public ParkingSpot findParkingSpace() {
        return new FourWheelerParkingSpot();
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
