package HW.HomeWork_6.coffeeTypes;

import HW.HomeWork_6.ingredients.Coffeeable;
import HW.HomeWork_6.ingredients.Sugarable;
import HW.HomeWork_6.ingredients.Waterable;

public class Espresso extends Coffee
        implements Sugarable,
        Coffeeable, Waterable {

    public Espresso(){
        grindCoffee();
        addCoffee();
        addSugar();
        addWater();
        System.out.println("Espresso made!");
    }

    @Override
    Coffee grindCoffee() {
        System.out.println("Coffee grinded");
        return super.grindCoffee();
    }

    @Override
    public String toString() {
        return "Espresso";
    }

    @Override
    public void addCoffee() {
        System.out.println("Coffee added");
    }

    @Override
    public void addSugar() {
        System.out.println("Sugar added");
    }

    @Override
    public void addWater() {
        System.out.println("A little bit of water added");
    }
}
