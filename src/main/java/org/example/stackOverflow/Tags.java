package org.example.stackOverflow;

public class Tags {
    private final int id;
    private final String name;
    public Tags(String name) {
        id = generateId();
        this.name=name;
    }
    private int generateId(){
        return (int)(System.currentTimeMillis()%Integer.MAX_VALUE);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
