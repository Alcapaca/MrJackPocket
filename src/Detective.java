
	
	public enum Detective{
		
		HOLMES(12),
		WATSON(4),
		TOBY(8);
		
	
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
	
	
	
	@Override
	public String toString() {
        return this.name()+ " " + position;
    }
	
}
