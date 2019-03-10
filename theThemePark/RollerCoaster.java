package theThemePark;

public class RollerCoaster extends Attraction {
	
	{
		super.setLimit( AgeLimit.TEEN);
	}
	
	

	public RollerCoaster() {
		
	}

	public RollerCoaster(String name, int capacity, AgeLimit limit, String action) {
		super(name, capacity, limit, action);
		
	}


}
