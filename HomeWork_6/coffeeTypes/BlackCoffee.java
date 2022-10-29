package HW.HomeWork_6.coffeeTypes;

import HW.HomeWork_6.ingredients.Coffeeable;
import HW.HomeWork_6.ingredients.Sugarable;
import HW.HomeWork_6.ingredients.Waterable;

public class BlackCoffee extends Coffee
        implements Sugarable, Waterable, Coffeeable {
    public BlackCoffee(){
        grindCoffee();
        addCoffee();
        addSugar();
        addWater();
        System.out.println("Black coffee made!");
    }

    @Override
    Coffee grindCoffee() {
        System.out.println("Coffee grinded");
        return super.grindCoffee();
    }

    @Override
    public String toString() {
        return "BlackCoffee";
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
        System.out.println("Water added");
    }
}
