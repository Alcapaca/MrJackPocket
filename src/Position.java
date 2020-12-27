
public class Position {

	private int column;
	private int row;
	
	public Position (int column, int row) {
		this.row = row;
		this.column = column;
	}
	
	public String toString() {
		return " " + column + "" + row;
		}


}
