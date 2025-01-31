package org.example.parkingLotDesign.parkingStrategy;

public class NearElevatorParkingStrategy implements ParkingStrategy{
    String strategy;
    public NearElevatorParkingStrategy(String strategy){
        this.strategy = strategy;
    }
    @Override
    public void returnParkingStrategy() {
        System.out.println(strategy);
    }
}
