package theThemePark;

public class IceCreamShop extends FoodStand {
	private int cones;
	private int iceCreamBall;
	
	
	

	public IceCreamShop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IceCreamShop(String name ,int cones, int iceCreamBall) {
		super(name);
		this.cones = cones;
		this.iceCreamBall = iceCreamBall;
	}

	
	public void Sell(Person person) {
		System.out.println("Enjoy your ice cream!");
		System.out.println("You are " + person.getAge() + " years old. But here it doesn't matter!\n");
		
	}
	@Override
	public void Sell() {
		System.out.println("Enjoy your ice cream!\n");
		
	}
	
	public void MakeIceCream(int balls) {
		if (balls <this.iceCreamBall) {
			System.out.println("We are out of ice cream balls!");
			return;
		}
		if (cones <=0) {
			System.out.println("We are out of cones!");
			return;
		}
		
		System.out.println("Here is your ice cream with " + balls + " balls.");
	}

}
