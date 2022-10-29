package HW.HomeWork_6.builder;

import HW.HomeWork_6.coffeeTypes.Latte;

public class LatteBuilder extends CoffeeBuilder{
    public Latte buildLatte(){
        System.out.println(boilingWater());
        return new Latte();
    }
}
