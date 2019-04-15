package BubbleTeaShop.BubbleTeaParts;

public class StrawBerry extends Fruit{
	private String name = "StrawBerry";
	
	private double price = 0.5;

	public StrawBerry() {
		
	}

	public StrawBerry(double price) {
		this.price = price;
		
	}
	
	@Override
	public double getPrice() {
		
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
		
	}

	@Override
	public void boil() {
		System.out.println("The " +  this.getName() + " is boiling.");
		
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	
	@Override
	public String getName() {
		
		return name;
	}

}
