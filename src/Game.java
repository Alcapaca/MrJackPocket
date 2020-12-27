import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


//	    0  1  2  	
//
//11    0  1  2     3
//10    3  4  5     4
//9     6  7  8     5
//
//  	8  7  6  

	//Orientation
	
//   0
//3     1
//   2
	
public class Game {
		
	
	public void play() {
        //pour jouer au jeu
    }
	
	public void initialiseBoard() {
	
		ArrayList<AlibiCard> Names = new ArrayList<>(Arrays.asList(AlibiCard.values()));
		Collections.shuffle(Names);
		ArrayDeque <AlibiCard> pile = new ArrayDeque <AlibiCard> (Names);
		Random random = new Random();
		int counter = 1;
		for (int column = 1;column<4;column ++) {
			for(int row = 1;row <4 ; row ++) {
				switch(counter) {
				case 1 : District streetTile1 = new District(true,pile.pop());
				streetTile1.setPosition(1);
				streetTile1.setWallPlacement(0);
				System.out.println(streetTile1);
				break;
				case 2 : District streetTile2 = new District(true,pile.pop());
				streetTile2.setPosition(2);
				streetTile2.setWallPlacement(random.nextInt(4));
				System.out.println(streetTile2);
				break;
				case 3 : District streetTile3 = new District(true,pile.pop());
				System.out.println(streetTile3);
				break;
				case 4 : District streetTile4 = new District(true,pile.pop());
				System.out.println(streetTile4);
				break;
				case 5 : District streetTile5 = new District(true,pile.pop());
				System.out.println(streetTile5);
				break;
				case 6 : District streetTile6 = new District(true,pile.pop());
				System.out.println(streetTile6);
				break;
				case 7 : District streetTile7 = new District(true,pile.pop());
				System.out.println(streetTile7);
				break;
				case 8 : District streetTile8 = new District(true,pile.pop());
				System.out.println(streetTile8);
				break;
				case 9 : District streetTile9 = new District(true,pile.pop());
				System.out.println(streetTile9);
				break; 
				}
				counter=+1;
				
				
				
				
				
			}
		
		}
	}


	

	
	
	
}
