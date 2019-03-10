package theThemePark;

public enum AgeLimit {
	ALLPUBLIC (0),BABY(1),SMALLKID(3),KID(12),TEEN(16),ADULT(18);
	
	
	private int age;
	
	AgeLimit(int  age){
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	

}
