package BubbleTeaShop.BubbleTeaParts;

public class Ginger extends Spice{
	
private double price = 1;

	public Ginger() {
		
	}

	public Ginger(double price) {
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
