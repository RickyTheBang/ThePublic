package theThemePark;

public class ThemeParkTEST_NOT_THE_REAL_ONE {
	public static void main(String[] args) {
		RollerCoaster rc1 = new RollerCoaster("Thriller", 80,AgeLimit.TEEN,"Haaaaah");
		rc1.Ride(new Person("Joe",5));
		
		HauntedHouse hh1 = new HauntedHouse("Bouhouh", 80,AgeLimit.SMALLKID,"Boouuh");
		hh1.Ride(new Person("Avrel",15));
		
		TeaCups tc = new TeaCups("Have another cup", 80,AgeLimit.KID,"Vrrrrr");
		tc.Ride(new Person("Jack",25));
		
		rc1.setLimit(AgeLimit.BABY);
		System.out.println(rc1.getLimit().getAge());
		
		
	}

}
