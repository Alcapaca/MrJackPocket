
	
	public enum Detective{
		
		WATSON(2),
		TOBY(7),
		SHERLOCK(11);
		
		
	
	private int position;

	Detective(int position){
		this.position = position;
	}
	
	
	public int getPosition() {
		return position;
	}
	
	public void moveTo(int nbCell) {
		this.position = (position + nbCell) % 12;
	}
	
	
	
	
	public String toString() {
        return this.name()+ " " + position;
    }
	
}
