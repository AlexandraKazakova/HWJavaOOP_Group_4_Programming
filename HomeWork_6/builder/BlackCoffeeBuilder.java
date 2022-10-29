package HW.HomeWork_6.builder;

import HW.HomeWork_6.coffeeTypes.BlackCoffee;

public class BlackCoffeeBuilder extends CoffeeBuilder{
    public BlackCoffee buildBlackCoffee(){
        System.out.println(boilingWater());
        return new BlackCoffee();
    }
}
