
public class District{
	

	private boolean visibleSuspect;
	private AlibiCard suspectName;
	private int wallPlacement;

	
	public District (boolean visibleSuspect, AlibiCard suspectName) {
		this.visibleSuspect = true;
		this.suspectName = suspectName;
	}

	public void setWallPlacement(int wallPlacement) {
		this.wallPlacement = wallPlacement;
	}
	
	
	public void rotate(int times) {
		this.wallPlacement = (wallPlacement + times) % 4;
	}
	
	public void isSeen() {
		this.visibleSuspect = false;
	}
	
	
	public AlibiCard getAlibiCard() {
	
		return suspectName;
		
		}
	
	
	public boolean isSuspect() {
		
		return visibleSuspect;
	}
	
	public int getWallPlacement() {
		return wallPlacement;
	}

	
	
	
	public String toString() {
		return visibleSuspect + " " + suspectName + " "+ wallPlacement + " ";
		}
	
	
}
