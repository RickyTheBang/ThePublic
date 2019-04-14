package BubbleTeaShop.BubbleTeaParts;

public class Cinamon extends Spice{
	
	private double price = 0.5;

	public Cinamon() {
		
	}

	public Cinamon(double price) {
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
		System.out.println("The " + this.getClass().getSimpleName() + " is boiling.");
		
	}
	
	

}
