package HW.HomeWork_6.builder;

import HW.HomeWork_6.coffeeTypes.Cappuccino;

public class CappuccinoBuilder extends CoffeeBuilder{
    public Cappuccino buildCappuccino(){
        System.out.println(boilingWater());
        return new Cappuccino();
    }

    @Override
    public String toString() {
        return "Cappuccino Made!";
    }
}
