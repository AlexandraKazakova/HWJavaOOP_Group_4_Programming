package HW.HomeWork_1;

public class Main {
    public static void main(String[] args){
        VendingMachine vm = new VendingMachine();
        String name = "Lipton";
        Double price = 140.0;
        Controller controller = new Controller();
        System.out.println(controller.getProductsByNameAndCost(name, price));
    }
}
