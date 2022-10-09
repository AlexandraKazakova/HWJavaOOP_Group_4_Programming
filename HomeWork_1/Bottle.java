package HW.HomeWork_1;

public class Bottle extends Product{

	private Double volume;

	public Bottle(String name, Double cost, Double volume){
		super(name, cost);
		this.volume = volume;
	}

	@Override
	public String toString() {
		return super.toString() + " Объем: " + volume;
	}
}
