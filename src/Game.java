import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
	public final int boardSize = 4;
	private Object[][] board;
	
	
	public void play() {
        //pour jouer au jeu
    }
	
	public void initialiseBoard() {
	
		this.board = new Object[boardSize][boardSize];
		List <String> Names = new ArrayList<>();
		Names.add("Inspecteur Lestrade");
		Names.add("Miss Stealthy");
		Names.add("Jeremy Bert");
		Names.add("John Smith");
		Names.add("John Pizer");
		Names.add("Joseph Lane");
		Names.add("Madame");
		Names.add("Sgt Goodley");
		Names.add("William Gull");
		Collections.shuffle(Names);
		ArrayDeque <String> pile = new ArrayDeque <String> (Names);
		Random random = new Random();
		int counter = 1;
		for (int row = 1;row<4;row ++) {
			for(int column = 1;column <4 ; column ++) {
				switch(counter) {
				case 1 : District streetTile1 = new District(true,pile.pop(),1,(Object[][]) board[row][column]);
				System.out.println(streetTile1);
				break;
				case 2 : District streetTile2 = new District(true,pile.pop(),random.nextInt(3)+1,(Object[][]) board[row][column]);
				System.out.println(streetTile2);
				break;
				case 3 : District streetTile3 = new District(true,pile.pop(),3,(Object[][]) board[row][column]);
				System.out.println(streetTile3);
				break;
				case 4 : District streetTile4 = new District(true,pile.pop(),random.nextInt(3)+1,(Object[][]) board[row][column]);
				System.out.println(streetTile4);
				break;
				case 5 : District streetTile5 = new District(true,pile.pop(),random.nextInt(3)+1,(Object[][]) board[row][column]);
				System.out.println(streetTile5);
				break;
				case 6 : District streetTile6 = new District(true,pile.pop(),random.nextInt(3)+1,(Object[][]) board[row][column]);
				System.out.println(streetTile6);
				break;
				case 7 : District streetTile7 = new District(true,pile.pop(),random.nextInt(3)+1,(Object[][]) board[row][column]);
				System.out.println(streetTile7);
				break;
				case 8 : District streetTile8 = new District(true,pile.pop(),4,(Object[][]) board[row][column]);
				System.out.println(streetTile8);
				break;
				case 9 : District streetTile9 = new District(true,pile.pop(),random.nextInt(3)+1,(Object[][]) board[row][column]);
				System.out.println(streetTile9);
				break; 
				}
				counter=+1;
				
				
				
				
				
			}
		
		}
	}
	

	
	
	
}
