package org.example.decoratorPattern;

public class ExtraCheese extends BasePizza{
    BasePizza basePizza;
    ExtraCheese(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+25;
    }
}
