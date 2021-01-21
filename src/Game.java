import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;


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
	
	
	public ArrayList<District> isSuspectVisible(ArrayList <District> Board) {
		
		ArrayList<District> Visible = new ArrayList <District>();
		for (Detective current:Detective.values()) {
			int position = current.getPosition();
			int i = 0;
			switch(position) {
			case 0 :
				while (i<9){
					if (Board.get(i).getWallPlacement() == 0) {
						i = i+9;
					}
					else if (Board.get(i).getWallPlacement() == 2 || Board.get((i+3)%9).getWallPlacement() == 0) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i+9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i+3;
					}
				break;
			case 1 :
				i = 1;
				while (i<9){
					if (Board.get(i).getWallPlacement() == 0) {
						i = i+9;
					}
					else if (Board.get(i).getWallPlacement() == 2 || Board.get((i+3)%9).getWallPlacement() == 0) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i+9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i+3;
					}
				break;
			case 2 : 
				i= 2;
				while (i<9){
					if (Board.get(i).getWallPlacement() == 0) {
						i = i+9;
					}
					else if (Board.get(i).getWallPlacement() == 2 || Board.get((i+3)%9).getWallPlacement() == 0) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i+9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i+3;
					}
				break;
			case 3 :
				i = 2;
				while (i>=0){
					if (Board.get(i).getWallPlacement() == 1) {
						i = i-9;
					}
					else if (Board.get(i).getWallPlacement() == 3 || Board.get((i+3)%9).getWallPlacement() == 1) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i-9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i-1;
					}
				break;
			case 4 : 
				i = 5;
				while (i>=3){
					if (Board.get(i).getWallPlacement() == 1) {
						i = i-9;
					}
					else if (Board.get(i).getWallPlacement() == 3 || Board.get((i+3)%9).getWallPlacement() == 1) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i-9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i-1;
					}
				break;
			case 5 : 
				i = 8;
				while (i>=6){
					if (Board.get(i).getWallPlacement() == 1) {
						i = i-9;
					}
					else if (Board.get(i).getWallPlacement() == 3 || Board.get((i+3)%9).getWallPlacement() == 1) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i-9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i-1;
					}
				break;
			case 6 :
				i = 8;
				while (i<0){
					if (Board.get(i).getWallPlacement() == 2) {
						i = i-9;
					}
					else if (Board.get(i).getWallPlacement() == 0 || Board.get((i+3)%9).getWallPlacement() == 2) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i-9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i-3;
					}
				break;
			case 7 : 
				i = 7;
				while (i<0){
					if (Board.get(i).getWallPlacement() == 2) {
						i = i-9;
					}
					else if (Board.get(i).getWallPlacement() == 0 || Board.get((i+3)%9).getWallPlacement() == 2) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i-9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i-3;
					}
				break;
			case 8 : 
				i = 6;
				while (i<0){
					if (Board.get(i).getWallPlacement() == 2) {
						i = i-9;
					}
					else if (Board.get(i).getWallPlacement() == 0 || Board.get((i+3)%9).getWallPlacement() == 2) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i-9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i-3;
					}
				break;
			case 9 :
				i = 6;
				while (i<=8){
					if (Board.get(i).getWallPlacement() == 3) {
						i = i+9;
					}
					else if (Board.get(i).getWallPlacement() == 1 || Board.get((i+3)%9).getWallPlacement() == 3) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i+9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i+1;
					}
				break;
			case 10 :
				i = 3;
				while (i<=5){
					if (Board.get(i).getWallPlacement() == 3) {
						i = i+9;
					}
					else if (Board.get(i).getWallPlacement() == 1 || Board.get((i+3)%9).getWallPlacement() == 3) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i+9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i+1;
					}
				break;
			case 11 : 
				i = 0;
				while (i<=2){
					if (Board.get(i).getWallPlacement() == 3) {
						i = i+9;
					}
					else if (Board.get(i).getWallPlacement() == 1 || Board.get((i+3)%9).getWallPlacement() == 3) {
						if (Board.get(i).isSuspect() == true) {
							Visible.add(Board.get(i));
						}
						i = i+9;
					}
					else {
						if (Board.get(i).isSuspect() == true) {
						Visible.add(Board.get(i));
						}
					}
						i = i+1;
					}
				break;
			}
			
		
		}
		Set <District> removeDuplicates = new HashSet <> (Visible);
		Visible.clear();
		Visible.addAll(removeDuplicates);
		
		
		
		
		
		
		return Visible; // à changer par MrJack
	}
	
	
	public ArrayList<District> initialiseBoard() {
	
		ArrayList<AlibiCard> Names = new ArrayList<>(Arrays.asList(AlibiCard.values()));
		Collections.shuffle(Names);
		ArrayDeque <AlibiCard> pile = new ArrayDeque <AlibiCard> (Names);
		
		ArrayList<District> Board = new ArrayList<>();
		
		Random random = new Random();
		for (int counter = 1;counter<10;counter ++) {
			
				switch(counter) {
				case 1 : District streetTile0 = new District(true,pile.pop());
				streetTile0.setWallPlacement(3);
				Board.add(streetTile0);
				break;
				case 2 : District streetTile1 = new District(true,pile.pop());
				streetTile1.setWallPlacement(random.nextInt(4));
				Board.add(streetTile1);
				break;
				case 3 : District streetTile2 = new District(true,pile.pop());
				streetTile2.setWallPlacement(1);
				Board.add(streetTile2);
				break;
				case 4 : District streetTile3 = new District(true,pile.pop());				
				streetTile3.setWallPlacement(random.nextInt(4));
				Board.add(streetTile3);
				break;
				case 5 : District streetTile4 = new District(true,pile.pop());
				streetTile4.setWallPlacement(random.nextInt(4));
				Board.add(streetTile4);
				break;
				case 6 : District streetTile5 = new District(true,pile.pop());
				streetTile5.setWallPlacement(random.nextInt(4));
				Board.add(streetTile5);
				break;
				case 7 : District streetTile6 = new District(true,pile.pop());				
				streetTile6.setWallPlacement(random.nextInt(4));
				Board.add(streetTile6);
				break;
				case 8 : District streetTile7 = new District(true,pile.pop());				
				streetTile7.setWallPlacement(2);
				Board.add(streetTile7);
				break;
				case 9 : District streetTile8 = new District(true,pile.pop());				
				streetTile8.setWallPlacement(random.nextInt(4));
				Board.add(streetTile8);
				break; 
				}	
				
				
				
			}
		
		return Board;
		
			
		}
	
	public void MrJackInitialise(AlibiCard mrJack) {
		System.out.println("Mr Jack, look at the screen");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Mr Jack, your identity for this game is : "+ mrJack.toString());
		
	}
	
	public ArrayList<ActionToken> throwActionTokens() {
		
		ActionToken.actionToken1.randomFace();
		
		ActionToken.actionToken2.randomFace();
		
		ActionToken.actionToken3.randomFace();
		
		ActionToken.actionToken4.randomFace();
		
		ArrayList <ActionToken> tokens = new ArrayList <ActionToken>(Arrays.asList(ActionToken.values()));
		for (int i = 0; i<tokens.size(); i++) {
			System.out.println(tokens.get(i));}
		return tokens;
		
	}
	
	public ArrayList<ActionToken> turnOverActionToken(){
		ActionToken.actionToken1.turnOverToken();
		ActionToken.actionToken2.turnOverToken();
		ActionToken.actionToken3.turnOverToken();
		ActionToken.actionToken4.turnOverToken();
		ArrayList <ActionToken> tokens = new ArrayList <ActionToken>(Arrays.asList(ActionToken.values()));
		for (int i = 0; i<tokens.size(); i++) {
			System.out.println(tokens.get(i));}
		return tokens;
	}
	
	
	
	public ArrayList <ActionToken> updateActionTokens(ArrayList <ActionToken> tokens, int chosenToken){
		
		tokens.set(chosenToken-1, null);
		for (int i = 0; i<tokens.size(); i++) {
			if (tokens.get(i) == null) {
				continue;
			}
			else {			System.out.println(tokens.get(i));}}
		return tokens;
		
	}
	
	public int chooseActionToken (ArrayList<ActionToken> tokens) {
		int tester = 0;
		int chosenToken = 0;
		while (tester == 0) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which Token would you like to take (between 1 and 4) ");
		chosenToken = scanner.nextInt();
		if (chosenToken > 4 || chosenToken < 1 || tokens.get(chosenToken-1) == null ) {
			System.out.println("Ce token n'est pas disponible");
		}
		else {
			tester +=1;
		}
		}
		
		return chosenToken;
	}
	
	public String turnGiver(int turnCounter) {
		String currentTurn = "unknown";
		if (turnCounter%2 == 0){
			System.out.println("MrJack it is your turn to start");
			currentTurn = "MrJack";
		}
		else {
			System.out.println("Detective, it is your turn to start");
			currentTurn = "Detective";
		}
	    return currentTurn;
	}


	public String swapPlayer(String currentPlayer) {
		if (currentPlayer.equals("MrJack")){
				currentPlayer = "Detective";
				System.out.println("Detective it is your turn now");
		}
		else {
			currentPlayer = "MrJack";
			System.out.println("Mr Jack it is your turn now");
		}
		return currentPlayer;
		
	}
	
	
	public Boolean isMrJackVisible (ArrayList <District> Board, ArrayList <District> Visible,AlibiCard MrJack) {
		List <AlibiCard> visibleAlibiCards = new ArrayList <AlibiCard>();
		for (int i = 0 ; i < Visible.size(); i++) {
			visibleAlibiCards.add(Visible.get(i).getAlibiCard());
		}
		
		//Is MrJack in the pile
		boolean ans = visibleAlibiCards.contains(MrJack);
		return ans;
		}
	
	public ArrayList <District> changeVisibleSuspects(ArrayList <District> Board, ArrayList <District> Visible,AlibiCard MrJack){
		
		ArrayList <District> invisible = new ArrayList <District>(Board);
		boolean ans = isMrJackVisible(Board, Visible, MrJack);
		if (ans) {
			//if MrJack is seen, then all others become not suspects
			// Creation of a new list. Inverse of visible in Board.
			for (int i = 0 ; i < Visible.size(); i++) {
				while (invisible.contains(Visible.get(i))){
					invisible.remove(Visible.get(i));
			}
				
				//Make invisible cards not suspects.
			}
			for (int i = 0 ; i < invisible.size(); i++) {
				invisible.get(i).isSeen();
			}
			Hourglass.turnhourglass.addHourglass(0);
		}
		else {
			for (int i = 0 ; i < Visible.size(); i++) {
				Visible.get(i).isSeen();
			}
			Hourglass.turnhourglass.addHourglass(1);
		}
		return Board;
			
		}
	
	
	
	
	//Check GameEnd
	public boolean checkGameEnd(ArrayList <District> board, int turn, ArrayList <District> Visible,AlibiCard MrJack) {
		int MrJackWins = 0;
		int DetectiveWins = 0;
		boolean coursePoursuite = false;
		
		int stillVisibleSuspects = 9;
		for (int i = 0; i< board.size();i++) {
			if (board.get(i).isSuspect() == false) {
				stillVisibleSuspects -= 1;
			}
		}
		
		if (stillVisibleSuspects == 1) {
			DetectiveWins = 1;}
		
		
		//Check if MrJack wins
		if (Hourglass.totalhourglass.getHourglass() >= 6) {
			MrJackWins = 1;
		}
		
		
		//If both win
		boolean ans = isMrJackVisible(board, Visible, MrJack);
		
		if (MrJackWins == 1 && DetectiveWins == 1) {
			if (turn>7) {
				if (ans) {
					System.out.println("Mr l'Enqueteur remporte la partie");
					System.exit(0);
				}
				else {
					System.out.println("Mr Jack remporte la partie");
					System.exit(0);
				}
				
			}
			else {
				coursePoursuite = true;
			}
		}
		
		
		//are suspects still visible
		//does MrJack have more than 6 hourglasses
		//do they both finish the same turn ? //is it after turn 8
		//else course poursuite
		
		return coursePoursuite;
	}
	
}


	

	
	
	

