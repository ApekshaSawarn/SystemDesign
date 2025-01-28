package org.example.decoratorPattern;

public class Mushroom extends Toppings{
    BasePizza basePizza;
    Mushroom(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+10;
    }
}
