package org.example.coffeeVendingMachine;

public class Main {
    public static void main(String args[]) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();
        coffeeMachine.displayMenu();
        Coffee coffee1 = coffeeMachine.selectCoffee("LATTEE");
        coffeeMachine.dispenseCoffee(coffee1,new Payment(50));

        Coffee coffee2 = coffeeMachine.selectCoffee("CAPUCCINO");
        coffeeMachine.dispenseCoffee(coffee2,new Payment(40));
    }
}
