
public class ActionToken {
	
	private String name;
	private int face;
	

	
	public ActionToken(String name, int face) {
		
	this.name = name;
	this.face = face;
	}	
	
	public String toString() {
        return name + " " + face;
    }
	
	
}