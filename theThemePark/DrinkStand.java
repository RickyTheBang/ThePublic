package theThemePark;

public abstract class DrinkStand extends Shop {
	
	
	private  AgeLimit limit;
	public DrinkStand() {
		
	}
	
	public DrinkStand(String name, AgeLimit ageLimit) {
		super(name);
		this.limit = limit;
	}

	
	public AgeLimit getLimit() {
		return limit;
	}

	
	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

	public boolean CheckAge(Person person) {
		boolean check = true;
		if(person.getAge()<getLimit().getAge()) {
			check = false;
		}
		
		return check;
	}

}
