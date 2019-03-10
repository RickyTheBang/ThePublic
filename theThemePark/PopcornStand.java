package theThemePark;

public class PopcornStand extends FoodStand {
	
	
	

	public PopcornStand() {
		
	}

	public PopcornStand(String name) {
		super(name);
		
	}

	
	public void Sell(Person person) {
		System.out.println("The popcorns are for you!");
		System.out.println("You are " + person.getAge() + " years old. But here it doesn't matter!\n");
		
	}
	@Override
	public void Sell() {
		System.out.println("The popcorns are for you!\n");
		
	}
	
	public void MakePopCorn() {
		
		System.out.println("Yummy, yummy! the popcorns are ready! ");
		
	}

}
