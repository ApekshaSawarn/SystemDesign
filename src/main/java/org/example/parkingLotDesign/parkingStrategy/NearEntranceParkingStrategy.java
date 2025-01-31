package org.example.parkingLotDesign.parkingStrategy;

public class NearEntranceParkingStrategy implements ParkingStrategy{
    String strategy;
    public NearEntranceParkingStrategy(String strategy){
        this.strategy = strategy;
    }
    @Override
    public void returnParkingStrategy() {
        System.out.println(strategy);
    }
}
