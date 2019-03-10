package theThemePark;

public class SodaStand extends DrinkStand {
	
	
	
	{
		super.setLimit( AgeLimit.ALLPUBLIC);
	}

	
	
	public SodaStand() {
	
	}

	public SodaStand(String name) {
		setName(name);
		
	}

	public SodaStand(String name, AgeLimit ageLimit) {
		super(name, ageLimit);
		
	}



	@Override
	public void Sell() {
		
		System.out.println("Drink a glass of sparkle water in this  " + this.getClass().getSimpleName()+"\n");
		
	}
	public void Sell(Person person) {
		if(CheckAge(person)) {
			System.out.println("You stupid that you have a negative age!");
			System.out.println("Have you ever seen a person with an age of " +getLimit().getAge() + " years?" );
			System.out.println("You what, you don't deserve to have a drink in this " + this.getClass().getSimpleName()+"\n");
		}
		else {
			System.out.println("You are " + person.getAge() + " years old.");
			System.out.println("Here there is no age limit!" );
			System.out.println("You are are old enough to drink a glass of sparkle water in this  " + this.getClass().getSimpleName()+"\n");
		}
	}


}
