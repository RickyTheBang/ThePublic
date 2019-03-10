package theThemePark;

public class ToyShop extends Shop {

	public ToyShop() {
		super();
	}

	public ToyShop(String name) {
		super(name);
	}


	public void Sell(Person person) {
		System.out.println("You are now the happy owner of a brand new toy!");
		System.out.println("You are " + person.getAge() + " years old. But here it doesn't matter!");

	}

	@Override
	public void Sell() {
		System.out.println("You are now the happy owner of a brand new toy!");

	}

}
