package BubbleTeaShop.BubbleTeaParts;

public class Orange extends Fruit{
	private String name = "Orange";
	
	private double price = 0.5;
	public Orange() {
		
	}

	public Orange(double price) {
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
