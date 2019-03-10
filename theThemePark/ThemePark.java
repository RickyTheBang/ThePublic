package theThemePark;

public class ThemePark {
	private String name;
	private Attraction[] attractions;
	private Shop[] shops;
	private int totalCapacity;
	
	
	

	public ThemePark() {

	}

	public ThemePark(String name) {

		this.name = name;

	}

	public ThemePark(String name, Attraction[] attractions,Shop[] shops) {

		this.name = name;
		this.attractions = attractions;
		this.shops = shops;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Attraction[] getAttractions() {
		return attractions;
	}

	public void setAttractions(Attraction[] attractions) {
		this.attractions = attractions;
	}
	
	

	public Shop[] getShops() {
		return shops;
	}

	public void setShops(Shop[] shops) {
		this.shops = shops;
	}

	public int getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity() {

		int total = 0;

		for (Attraction a : attractions) {
			total += a.getCapacity();
		}
		this.totalCapacity = total;
	}
	
	public void AllTheAttractions() {
		
		Person[] persons = new Person[] { new Person("Joe", 17), new Person("Bill", 18), new Person("Andrew", 20),
				new Person("Avrel", 15), new Person("Jack", 25) };

		Attraction[] parkAttractions = getAttractions();

		for (int i = 0; i < parkAttractions.length; i++) {
			parkAttractions[i].Ride(persons[i/persons.length]);

		}
	

		Shop[] parkShops = getShops();
		for (int i = 0; i < parkShops.length; i++) {
			parkShops[i].Sell();

	}
	}

}
