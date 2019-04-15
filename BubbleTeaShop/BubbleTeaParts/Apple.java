package BubbleTeaShop.BubbleTeaParts;

public class Apple extends Fruit {
	private String name = "Apple";
	
	private double price = 0.75;



	public Apple() {

	}

	public Apple(double price) {
		
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
		System.out.println("The " + this.getName() + " is boiling.");
		
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
