package HW.HomeWork_6.coffeeTypes;

import HW.HomeWork_6.ingredients.Coffeeable;
import HW.HomeWork_6.ingredients.Milkable;
import HW.HomeWork_6.ingredients.Sugarable;
import HW.HomeWork_6.ingredients.Waterable;

public class MilkCoffee extends Coffee implements Milkable,
        Sugarable, Waterable, Coffeeable{

    public MilkCoffee(){
        grindCoffee();
        addCoffee();
        addSugar();
        addWater();
        addMilk();
        System.out.println("Milk coffee made!");
    }

    @Override
    Coffee grindCoffee() {
        System.out.println("Coffee grinded");
        return super.grindCoffee();
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

    @Override
    public void addMilk() {
        System.out.println("Milk added");
    }

    @Override
    public String toString() {
        return "MilkCoffee";
    }
}
