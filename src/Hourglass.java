
public enum Hourglass {
	totalhourglass(0),
	turnhourglass(0),
	cardhourglass(0);
	
	private int number;
	

	Hourglass(int number) {
		this.number = number;
	}

	
	public void addHourglass(int hourglasses) {
		this.number = number + hourglasses;
	}
	
	public void cardHourglass(int hourglasses) {
		this.number = hourglasses;
	}
	
	public int getHourglass() {
		return number;
	}
	
}
