
public class District{

	private boolean visibleSuspect;
	private AlibiCard suspectName;
	private int wallPlacement;
	private int position;
	
	public District (boolean visibleSuspect, AlibiCard suspectName) {
		this.visibleSuspect = true;
		this.suspectName = suspectName;
	}

	public void setWallPlacement(int wallPlacement) {
		this.wallPlacement = wallPlacement;
	}
	
	public void setPosition (int position) {
		this.position = position;
	}
	
	public void rotate(int times) {
		this.wallPlacement = (wallPlacement + times) % 4;
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
	
	public int getPosition() {
		return position;
	}
	
	
	
	public String toString() {
		return visibleSuspect + " " + suspectName + " "+ wallPlacement + " " + position;
		}
	
	
}
