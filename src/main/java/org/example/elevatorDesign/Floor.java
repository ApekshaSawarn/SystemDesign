package org.example.elevatorDesign;

public class Floor {
    int id;
    ExternalButtonDispatcher externalButtonDispatcher;
    Floor(int id) {
        this.id = id;
        externalButtonDispatcher = new ExternalButtonDispatcher();
    }
    public void pressButton(Direction direction) {
        externalButtonDispatcher.submitRequest(id,direction);
    }
}
