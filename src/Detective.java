
	
	public enum Detective{
		
		HOLMES(11),
		WATSON(3),
		TOBY(7);
		
	
	private int position;

	Detective(int position){
		this.position = position;
	}
	
	
	public int getPosition() {
		return position;
	}
	
	public void moveTo(int distance) {
		this.position = (position + distance) % 12;
	}
	
	
	
	
	public String toString() {
        return this.name()+ " " + position;
    }
	
}
