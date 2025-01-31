package org.example.parkingLotDesign;

import org.example.parkingLotDesign.parkingSpotManager.ParkingSpotManager;
import org.example.parkingLotDesign.parkingSpotManager.ParkingSpotManagerFactory;

import java.util.ArrayList;

class ExitGate {
    ParkingSpotManagerFactory factory;

    ExitGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    void removeVehicle(Ticket ticket) {
        ParkingSpotManager manager = factory.getParkingSpotManager(ticket.getVeichle().getVeichleType(), new ArrayList<>());
        manager.removeVeichle(ticket.getVeichle());
    }
}