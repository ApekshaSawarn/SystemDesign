package org.example.parkingLotDesign;

import org.example.parkingLotDesign.parkingSpot.ParkingSpot;
import org.example.parkingLotDesign.parkingSpotManager.ParkingSpotManagerFactory;
import org.example.parkingLotDesign.parkingSpotManager.ParkingSpotManager;

import java.util.List;

public class EntranceGate {
    ParkingSpotManagerFactory parkingSportManagerFactory;
    Ticket ticket;

    public ParkingSpot findParkingSpace(VeichleType veichleType, List<ParkingSpot> parkingSpots){
        ParkingSpotManager parkingSpotManager = parkingSportManagerFactory.getParkingSpotManager(veichleType,parkingSpots);
        return parkingSpotManager.findParkingSpace();
    }
//    public ParkingSpot bookSpot(Veichle veichle) {
//
//    }
    public Ticket generateTicket(Veichle veichle) {
        //Add logic to generate ticket
        System.out.println("Ticket generated");
        return null;
    }
}
