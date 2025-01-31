package org.example.parkingLotDesign.parkingSpotManager;

import org.example.parkingLotDesign.VeichleType;
import org.example.parkingLotDesign.parkingSpot.ParkingSpot;
import org.example.parkingLotDesign.parkingStrategy.NearElevatorParkingStrategy;
import org.example.parkingLotDesign.parkingStrategy.NearEntranceParkingStrategy;

import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VeichleType  veichleType, List<ParkingSpot> parkingSpotList){
        if (veichleType == VeichleType.TwoWheeler)
            return new TwoWheelerParkingSpotManager(parkingSpotList, new NearEntranceParkingStrategy("Near entrance"));
        else if (veichleType == VeichleType.FourWheeler)
            return new FourWheelerParkingSpotManager(parkingSpotList, new NearElevatorParkingStrategy("Near Elevator"));
        else
            return null; //throw exception
    }
}
