package BubbleTeaShop.BubbleTeaParts;

public abstract class BubbleTeaIngredient {
	private double price;
	public String name = this.getClass().getSimpleName();

	public BubbleTeaIngredient() {

	}

	public BubbleTeaIngredient(double price) {
		this.setPrice(price);
	}

	public abstract double getPrice() ;

	public  abstract void setPrice(double price) ;
	
	public  abstract void setName(String name) ;
	public  abstract String getName();
	@Override
	public String toString() {
		String result ="Ingredient: " + this.getName();
		if(this instanceof Boilable) {
			
			result += " is boiling"+", price = " + getPrice();;
		}
		else if(this instanceof Bubble) {
			result += " " + ((Bubble) this).getTaste()+", price = " + getPrice();
		} else {
			result += ", price = " + getPrice();
		}
		
		
		
		return result;
	}
	
	

}
