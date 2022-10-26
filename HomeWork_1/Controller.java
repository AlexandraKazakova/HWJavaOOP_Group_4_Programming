package HW.HomeWork_1;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private VendingMachine vm;

    public Controller(){
        this.vm = new VendingMachine();
    }

    public List<Product> getProductsByNameAndCost(String name, Double cost){
        List<Product> list = new ArrayList<>();
        for (Product product: vm.getProductByName(name)) {
            if(product.getCost().equals(cost)){
                list.add(product);
            }
        }
        return list;
    }
}
