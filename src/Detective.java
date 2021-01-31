
	
	public enum Detective{
		
		WATSON(3),
		TOBY(7),
		SHERLOCK(11);
		
		
	
	private int position;

	//Constructeur
	Detective(int position){
		this.position = position;
	}
	
	//getter posiiton
	public int getPosition() {
		return position;
	}
	
	//Avancer de x cases
	public void moveTo(int nbCell) {
		this.position = (position + nbCell) % 12;
	}
	
	
	
	
	public String toString() {
        return this.name()+ " " + position;
    }
	
}
