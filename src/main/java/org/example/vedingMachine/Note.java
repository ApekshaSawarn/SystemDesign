package org.example.vedingMachine;

public enum Note {
    TEN(10),
    TWENTY(20),
    FIFTY(50);
    private final int value;
    Note(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
