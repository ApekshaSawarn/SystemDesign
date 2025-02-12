package org.example.coffeeVendingMachine;

public class Ingredients {
    String name;
    Integer qty;
    public Ingredients(String name, Integer qty) {
        this.name = name;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Integer getQty() {
        return qty;
    }

    public synchronized void updateQuantity(Integer qty) {
        this.qty += qty;
    }
}
