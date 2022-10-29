package HW.HomeWork_6.coffeeTypes;

import HW.HomeWork_6.ingredients.*;

public class Latte extends Coffee
        implements Milkable, Sugarable,
        Coffeeable, Frothable, Waterable {

    public Latte(){
        grindCoffee();
        addCoffee();
        addSugar();
        addWater();
        frothMilk();
        addMilk();
        System.out.println("Latte made!");
    }

    @Override
    Coffee grindCoffee() {
        System.out.println("Coffee grinded");
        return super.grindCoffee();
    }

    @Override
    public String toString() {
        return "Latte";
    }

    @Override
    public void addCoffee() {
        System.out.println("Coffee added");
    }

    @Override
    public void frothMilk() {
        System.out.println("Milk frothed");
    }

    @Override
    public void addMilk() {
        System.out.println("A lot of milk added");
    }

    @Override
    public void addSugar() {
        System.out.println("Sugar added");
    }

    @Override
    public void addWater() {
        System.out.println("Water added");
    }
}
