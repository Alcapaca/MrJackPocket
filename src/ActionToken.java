
public class ActionToken {
	private String name;
	private int face;
	
	
	public CardToken(String name, int face) {
		
	this.name = name;
	this.face = face;
	}	
	
	public String toString() {
        return name + " " + face;
    }
	
}