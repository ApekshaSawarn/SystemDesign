package org.example.elevatorDesign;

import java.util.PriorityQueue;

public class ElevatorCarController {
    PriorityQueue<Integer> upPQ;
    PriorityQueue<Integer> downPQ;
    ElevatorCar elevatorCar;
    ElevatorCarController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        upPQ = new PriorityQueue<>();
        downPQ = new PriorityQueue<>((a,b)->(b-a));
    }
    public void acceptRequest(int floor, Direction direction){
        if(direction == Direction.DOWN) {
            downPQ.offer(floor);
        } else{
            upPQ.offer(floor);
        }
    }
    public void controlElevator(){

    }
}
