package org.example.elevatorDesign;

public class ElevatorCar {
    int id;
    Display display;
    int currentFloor;
    Direction direction;
    Status status;
    InternalButton internalButton;
    ElevatorCar(Display display, int currentFloor, Direction direction, Status status, InternalButton internalButton) {
        this.display = display;
        this.currentFloor = currentFloor;
        this.direction = direction;
        this.status = status;
        this.internalButton = internalButton;
    }
    public void showDisplay() {
        display.showDisplay();
    }

    public void setDisplay() {
        display.setDisplay(currentFloor,direction);
    }

    boolean moveElevator(Direction dir, int destinationFloor){
        int startFloor = currentFloor;
        if(dir == Direction.UP) {
            for(int i = startFloor; i<=destinationFloor; i++) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }

        if(dir == Direction.DOWN) {
            for(int i = startFloor; i>=destinationFloor; i--) {

                this.currentFloor = startFloor;
                setDisplay();
                showDisplay();
                if(i == destinationFloor) {
                    return true;
                }
            }
        }
        return false;
    }
}
