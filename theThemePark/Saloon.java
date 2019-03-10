package theThemePark;

public class Saloon extends DrinkStand {

	{
		super.setLimit(AgeLimit.ADULT);
	}

	public Saloon() {

	}

	public Saloon(String name, AgeLimit ageLimit) {
		super(name, ageLimit);

	}

	@Override
	public void Sell() {
		
		System.out.println(
				"We haven't checked if you are are old enough to drink a beer in this  " + this.getClass().getSimpleName());
		System.out.println("We trust you. Take this beer in this  " + this.getClass().getSimpleName() + "\n");
	}
	
	public void Sell(Person person) {
		if (CheckAge(person)) {
			System.out.println("You are only " + person.getAge() + " years old.");
			System.out.println("You have to be " + getLimit().getAge() + " old!");
			System.out.println("You are too young to drink a beer in this " + this.getClass().getSimpleName() + "\n");

		} else {
			System.out.println("You are " + person.getAge() + " years old.");
			System.out.println("You are older than " + getLimit().getAge() + " years!");
			System.out.println(
					"You are are old enough to drink a beer in this  " + this.getClass().getSimpleName() + "\n");
		}
	}

}
