package org.example.elevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<Floor> floorList = new ArrayList<>();
        floorList.add(new Floor(1));
        floorList.add(new Floor(2));
        floorList.add(new Floor(3));
        floorList.add(new Floor(4));
        floorList.add(new Floor(5));
        floorList.add(new Floor(6));
        floorList.add(new Floor(7));
        Building building = new Building(floorList);
    }
}
