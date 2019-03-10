package theThemePark;

public class TeaCups extends Attraction {

	{
		super.setLimit(AgeLimit.KID);
	}

	public TeaCups() {

	}

	public TeaCups(String name, int capacity, AgeLimit limit, String action) {
		super(name, capacity, limit, action);
		
	}


}
