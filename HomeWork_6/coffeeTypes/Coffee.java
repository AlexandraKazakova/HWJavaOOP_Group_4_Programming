package HW.HomeWork_6.coffeeTypes;

public class Coffee {
    Coffee grindCoffee(){
        return new Coffee();
    }

    @Override
    public String toString() {
        return "Coffee grinded";
    }
}
