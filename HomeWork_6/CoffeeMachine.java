package HW.HomeWork_6;

import HW.HomeWork_6.builder.*;
import HW.HomeWork_6.coffeeTypes.Coffee;

public class CoffeeMachine {

    CoffeeBuilder cb;
    public CoffeeMachine(int userChoice){
        switch (userChoice){
            case 1:
                cb = new BlackCoffeeBuilder();
                Coffee bc = ((BlackCoffeeBuilder)cb).buildBlackCoffee();
                break;
            case 2:
                cb = new MilkCoffeeBuilder();
                Coffee mc = ((MilkCoffeeBuilder)cb).buildMilkCoffee();
                break;
            case 3:
                cb = new CappuccinoBuilder();
                Coffee cc = ((CappuccinoBuilder)cb).buildCappuccino();
                break;
            case 4:
                cb = new LatteBuilder();
                Coffee lc = ((LatteBuilder)cb).buildLatte();
                break;
            case 5:
                cb = new EspressoBuilder();
                Coffee ec = ((EspressoBuilder)cb).buildEspresso();
                break;
            default:
                System.out.println("Такого напитка нет");
        }

    }
    @Override
    public String toString() {
        return "Goodbye!";
    }

}
