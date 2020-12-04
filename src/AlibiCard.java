public class AlibiCard{
	
	private String name;
	private int hourglass;
	
	
	public AlibiCard(String name, int hourglass) {
		
	this.name = name;
	this.hourglass = hourglass;
	}	
	
	public String toString() {
        return name + " " + hourglass;
    }
	
}
