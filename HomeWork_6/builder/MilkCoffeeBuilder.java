package HW.HomeWork_6.builder;

import HW.HomeWork_6.coffeeTypes.MilkCoffee;

public class MilkCoffeeBuilder extends CoffeeBuilder{
    public MilkCoffee buildMilkCoffee(){
        System.out.println(boilingWater());
        return new MilkCoffee();
    }
}
