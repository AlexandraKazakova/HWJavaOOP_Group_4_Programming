package HW.HomeWork_6.builder;

import HW.HomeWork_6.coffeeTypes.Espresso;

public class EspressoBuilder extends CoffeeBuilder{
    public Espresso buildEspresso(){
        System.out.println(boilingWater());
        return new Espresso();
    }
}
