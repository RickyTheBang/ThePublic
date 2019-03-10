package theThemePark;

public class ThemeParkApp {
	public static void main(String[] args) {

		ThemePark park = new ThemePark("THE PARK");
		
		//1) Attractions

		RollerCoaster rc1 = new RollerCoaster("Dragon Kahn", 80, AgeLimit.TEEN,"Making 4 loops and one barrelScrew");
		RollerCoaster rc2 = new RollerCoaster("Wooden Thunder", 60, AgeLimit.KID,"Going so fast the nails fly out");
		RollerCoaster rc3 = new RollerCoaster("Jolly JungleSling", 50, AgeLimit.KID, "Feeling like a real tarzan");
		HauntedHouse hh1 = new HauntedHouse("Tempo del fuego", 100, AgeLimit.KID, "Be scared");
		TeaCups tc = new TeaCups("Gaston Spin", 35, AgeLimit.SMALLKID,"No danger!");

		park.setAttractions(new Attraction[] { rc1, rc2, rc3, hh1, tc });

		

	
		
		
		park.setTotalCapacity();
		System.out.println(park.getName() + " has a capcity of " + park.getTotalCapacity() + " persons.\n");
		
//2) Shops
		IceCreamShop ics1 = new IceCreamShop("Panache", 30, 500);
		IceCreamShop ics2 =new IceCreamShop("De Post", 1000, 2000);
		PopcornStand pcs1 =new PopcornStand("De Popper");
		SodaStand ss1 =new SodaStand("De DrankFontijn");
		Saloon s1 =new Saloon("De Ranch", AgeLimit.ADULT);
		ToyShop ts1 =new ToyShop("De Playground");
		
		park.setShops(new Shop[] { ics1, ics2, pcs1, ss1, s1 , ts1});
		
		
		park.AllTheAttractions();
		
		
//		Person[] persons = new Person[] { new Person("Joe", 17), new Person("Bill", 18), new Person("Andrew", 20),
//				new Person("Avrel", 15), new Person("Jack", 25) };
//		
//		Attraction[] parkAttractions = park.getAttractions();
//
//		for (int i = 0; i < parkAttractions.length; i++) {
//			parkAttractions[i].Ride(persons[i]);
//
//		}
//	
//
//		Shop[] parkShops = park.getShops();
//		for (int i = 0; i < parkShops.length; i++) {
//			parkShops[i].Sell();
//
//	}
		

	}

}
