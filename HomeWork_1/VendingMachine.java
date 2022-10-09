package HW.HomeWork_1;

import java.util.ArrayList;

public class VendingMachine {

	public VendingMachine(){
		products.add(new Chocolate("Twix", 110.0, "Without nuts"));
		products.add(new Chocolate("Snikers", 130.0, "Peanut"));
		products.add(new Chocolate("Bounty", 115.0, "Coconut"));
		products.add(new Bottle("Wather", 80.0, 0.5));
		products.add(new Bottle("EnergyDrink", 180.0, 0.5));
		products.add(new Bottle("Lipton", 140.0, 0.5));
		products.add(new Chips("Nachos", 110.0, "cheese"));
		products.add(new Chips("Pringles", 180.0, "Bacon"));
	}

	public Product getProductByName(String name){
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(name)){
				return product;
			}
		}
		return null;
	}

	public Product getProductByCost(Double cost){
		for (Product product : products) {
			if (product.getCost().equals(cost)){
				return product;
			}
		}
		return null;
	}

	public Product getProductByCost(String cost){
		for (Product product : products) {
			if (product.getCost().equals(Double.valueOf(cost))){
				return product;
			}
		}
		return null;
	}

	ArrayList<Product> products = new ArrayList<>();
}
