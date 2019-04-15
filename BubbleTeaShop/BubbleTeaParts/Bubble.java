package BubbleTeaShop.BubbleTeaParts;

public class Bubble  extends BubbleTeaIngredient{
	private String name = "Bubble";
	
	
	
	private Taste taste;
	
private double price = 0.5;



	public Bubble() {
		
	}

	public Bubble(double price, Taste taste) {
		this.price = price;
		this.taste = taste;
	
	}
	
	public Bubble(double price) {
		
		this.price = price;
	
	}
	
	
	public Bubble(Taste taste) {
			this.taste = taste;
	}

	public Taste getTaste() {
		return taste;
	}

	public void setTaste(Taste taste) {
		this.taste = taste;
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
