package org.example.coffeeVendingMachine;

import java.util.Map;

public class Coffee {
    String name;
    Integer price;
    Map<Ingredients,Integer> reciepe;

    public Coffee(String name, Integer price, Map<Ingredients,Integer> reciepe) {
        this.name = name;
        this.price = price;
        this.reciepe = reciepe;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Map<Ingredients, Integer> getReciepe() {
        return reciepe;
    }
}
