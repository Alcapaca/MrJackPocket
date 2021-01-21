public enum AlibiCard{
	
	InspectorLestrade,
	MissStealthy,
	JeremyBert,
	JohnSmith,
	JohnPizer,
	JosephLane,
	Madame,
	SgtGoodley,
	WilliamGull;
	

	public int returnHourglass() {
		int[] hourglass = {0,1,1,1,1,1,2,0,1};
		return hourglass[this.ordinal()];
	}
		
	
	public String toString() {
        return this.name();
    }

}
