package HW.HomeWork_1;

public class Chocolate extends Product {
	
	private String nuts;

	public Chocolate(String name, Double cost, String nuts){
		super(name, cost);
		this.nuts = nuts;
	}
}
