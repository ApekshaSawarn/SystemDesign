package org.example.decoratorPattern;

public class PizzaStore {
    public static void main(String args[]) {
        BasePizza basePizza1 = new Farmhouse();
        BasePizza basePizza2 = new ExtraCheese(basePizza1);
        BasePizza basePizza3 = new Mushroom(basePizza2);

        System.out.println(basePizza1.cost()+" "+basePizza2.cost()+" "+basePizza3.cost());
    }
}
