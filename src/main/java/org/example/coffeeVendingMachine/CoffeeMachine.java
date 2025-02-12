package org.example.coffeeVendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeMachine {
    private static final CoffeeMachine instance = new CoffeeMachine();
    private final List<Coffee> coffeeList;
    private final Map<String, Ingredients> ingredients;

    public CoffeeMachine() {
        coffeeList = new ArrayList<>();
        ingredients = new HashMap<>();

        initializeIngredients();
        initializeCoffeeMenu();
    }

    public static CoffeeMachine getInstance(){
        return instance;
    }

    private void initializeCoffeeMenu(){
        Map<Ingredients, Integer> espressoRecipe = new HashMap<>();
        espressoRecipe.put(ingredients.get("Coffee"), 1);
        espressoRecipe.put(ingredients.get("Water"), 1);
        coffeeList.add(new Coffee("ESPRESSO",20,espressoRecipe));

        Map<Ingredients, Integer> latteRecipe = new HashMap<>();
        espressoRecipe.put(ingredients.get("Coffee"), 1);
        espressoRecipe.put(ingredients.get("Milk"), 1);
        espressoRecipe.put(ingredients.get("Water"), 2);
        coffeeList.add(new Coffee("LATTEE",30,latteRecipe));

        Map<Ingredients, Integer> cappucinoRecipe = new HashMap<>();
        espressoRecipe.put(ingredients.get("Coffee"), 2);
        espressoRecipe.put(ingredients.get("Water"), 1);
        espressoRecipe.put(ingredients.get("Milk"), 1);
        coffeeList.add(new Coffee("CAPUCCINO",40,cappucinoRecipe));

    }

    private void initializeIngredients(){
        ingredients.put("Coffee",new Ingredients("Coffee",15));
        ingredients.put("Water",new Ingredients("Water",50));
        ingredients.put("Milk",new Ingredients("Milk",25));
    }

    public void displayMenu() {
        System.out.println("Coffee Menu");
        for (Coffee coffee: coffeeList) {
            System.out.println(coffee.getName()+" - $"+coffee.getPrice());
        }
    }

    public synchronized Coffee selectCoffee(String slectedCoffee) {
        for(Coffee coffee: coffeeList)
            if(coffee.getName().equals(slectedCoffee))
                return coffee;
        return null;
    }

    public synchronized void dispenseCoffee(Coffee coffee, Payment payment) {
        if(coffee.getPrice()<= payment.getAmount()) {
            if(hasEnoughIngredients(coffee)) {
                updateIngredients(coffee);
                System.out.println("Dispensing " + coffee.getName() + "...");
                int change = payment.getAmount() - coffee.getPrice();
                if (change > 0) {
                    System.out.println("Please collect your change: $" + change);
                }
            } else {
                System.out.println("Insufficient ingredients to make " + coffee.getName());
            }
        } else {
            System.out.println("Insufficient payment for " + coffee.getName());
        }
    }

    private synchronized boolean hasEnoughIngredients(Coffee coffee) {
        for(Map.Entry<Ingredients,Integer> ingredients: coffee.getReciepe().entrySet()) {
            Ingredients ingredient = ingredients.getKey();
            Integer qty = ingredients.getValue();
            if(ingredient.getQty() < qty)
                return false;
        }
        return true;
    }

    private synchronized void updateIngredients(Coffee coffee) {
        for(Map.Entry<Ingredients,Integer> ingredients: coffee.getReciepe().entrySet()) {
            Ingredients ingredient = ingredients.getKey();
            Integer qty = ingredients.getValue();
            ingredient.updateQuantity(-qty);
            if(ingredient.getQty() < 3)
                System.out.println("Low inventory alert: " + ingredient.getName());
        }
    }
}
