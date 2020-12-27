public enum AlibiCard{
	
	InspectorLestrade(0),
	MissStealthy(1),
	JeremyBert(1),
	JohnSmith(1),
	JohnPizer(1),
	JosephLane(1),
	Madame(2),
	SgtGoodley(0),
	WilliamGull(1);
	

	private final int hourglass;

	AlibiCard(int hourglass) {
		this.hourglass = hourglass;
	}
	
	public int returnHourglass() {
		return hourglass;
	}
	
	public String returnSuspect() {
		return this.name();
	}
	
	public String toString() {
        return this.name()+ " " + hourglass;
    }

}
