package org.example.elevatorDesign;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorCarController> elevatorCarControllersList;

    public void submitRequest(int floor, Direction direction) {
        for(ElevatorCarController elevatorCarController: elevatorCarControllersList) {
            int elevatorID = elevatorCarController.elevatorCar.currentFloor;
            if(elevatorID%2==0 && floor%2==0) {
                elevatorCarController.acceptRequest(floor,direction);
            }
        }
    }
}
