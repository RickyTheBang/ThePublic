package theThemePark;

public abstract class Attraction implements Rideable {

	private String name;
	private int capacity;
	private AgeLimit limit;
	private String action = "Nothing special";

	public Attraction() {

	}

	public Attraction(String name, int capacity, AgeLimit limit,String action) {
		this.name = name;
		this.capacity = capacity;
		this.limit = limit;
		this.action= action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public AgeLimit getLimit() {
		return limit;
	}

	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public boolean CheckAge(Person person) {
		boolean check = false;

		if (person.getAge() >= getLimit().getAge()) {
			check = true;
		}

		return check;
	}

	@Override
	public void Ride(Person person) {
		this.Ride(person, this.action);

	}

	public void Ride(Person person, String action) {
		this.action = action;
		if (!CheckAge(person)) {
			System.out.println("You are only " + person.getAge() + " years old.");
			System.out.println("You have to be " + getLimit().getAge() + " old!");
			System.out.println("You are too young to take a ride on the " + this.getClass().getSimpleName() + "\n");

		} else {
			System.out.println("You are " + person.getAge() + " years old.");
			System.out.println("You are older than " + getLimit().getAge() + " years!");
			System.out.println("You are are old enough to enjoy a ride on the " + this.getClass().getSimpleName());
			System.out.println(this.action + "\n");
		}
	}

}
