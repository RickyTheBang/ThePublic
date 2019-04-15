package BubbleTeaShop.BubbleTeaParts;

public class Cream  extends BubbleTeaIngredient{
	private String name = "Cream";
	private double price = 1;

	public Cream() {
		
	}

	public Cream(double price) {
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
	public void setName(String name) {
		this.name = name;
		
	}
	
	@Override
	public String getName() {
		
		return name;
	}
}
