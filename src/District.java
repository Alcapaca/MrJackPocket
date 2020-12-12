
public class District{

	private boolean visibleSuspect;
	private String suspectName;
	private int wallPlacement;
	private Object board;
	
	public District (boolean visibleSuspect, String suspectName, int wallPlacement, Object[][] board) {
		this.visibleSuspect = true;
		this.suspectName = suspectName;
		this.wallPlacement = wallPlacement;
		this.board = board;
		
	}

	
	
	
	public String toString() {
		return visibleSuspect + " " + suspectName + " "+ wallPlacement + " " + board;
		}
	
	
}
