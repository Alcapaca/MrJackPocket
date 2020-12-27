
public class District{

	private boolean visibleSuspect;
	private String suspectName;
	private int wallPlacement;
	private int position;
	
	public District (boolean visibleSuspect, String suspectName, int wallPlacement, int position) {
		this.visibleSuspect = true;
		this.suspectName = suspectName;
		this.wallPlacement = wallPlacement;
		this.position = position;
		
	}

	
	
	
	public String toString() {
		return visibleSuspect + " " + suspectName + " "+ wallPlacement + " " + position;
		}
	
	
}
