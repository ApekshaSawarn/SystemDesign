package org.example.parkingLotDesign;

import org.example.parkingLotDesign.parkingSpot.ParkingSpot;

public class Ticket {
    long entryTime;
    Veichle veichle;
    ParkingSpot parkingSpot;

    public long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public Veichle getVeichle() {
        return veichle;
    }

    public void setVeichle(Veichle veichle) {
        this.veichle = veichle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
