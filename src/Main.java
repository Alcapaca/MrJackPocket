import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException  {
		
		
		int turnCounter = 1;
		boolean coursePoursuite = false;
		
		
		//Initialisation de la partie
		
		Game game = new Game();
		
		
		ArrayList<AlibiCard> Cards = new ArrayList<>(Arrays.asList(AlibiCard.values()));
		Collections.shuffle(Cards);
		ArrayDeque<AlibiCard> pile = new ArrayDeque <AlibiCard> (Cards);
		
		//Initialisation du perso de Mr Jack
		AlibiCard MrJack = MrJack(pile);
		game.MrJackInitialise(MrJack);
		TimeUnit.SECONDS.sleep(1);
		
		//Initialisation du plateau de jeu
		ArrayList<District> Board = game.initialiseBoard();
		
		//Show board
		System.out.println(Board);
		
		//debut du jeu
		
		while(coursePoursuite == false) {
			
		
			String currentTurn = game.turnGiver(turnCounter);
			String currentPlayer = currentTurn;
			ArrayList <ActionToken> tokens = null;
			if (currentTurn.equals("Detective")){
				tokens = game.throwActionTokens();
			}
			else {
				tokens = game.turnOverActionToken();
			}
			

			int chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			currentPlayer = game.swapPlayer(currentPlayer);
			
			tokens = game.updateActionTokens(tokens, chosenToken);
			chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			
			tokens = game.updateActionTokens(tokens, chosenToken);
			chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			currentPlayer = game.swapPlayer(currentPlayer);
			
			tokens = game.updateActionTokens(tokens, chosenToken);
			chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			
			
			//Verification des suspects
			
			
			ArrayList <District> Visible = game.isSuspectVisible(Board);
			Board = game.changeVisibleSuspects(Board, Visible, MrJack);
			Hourglass.totalhourglass.addHourglass(Hourglass.turnhourglass.getHourglass());
			
			//Check if game is ended
			
			coursePoursuite = game.checkGameEnd(Board, turnCounter, Visible, MrJack);
			
			turnCounter += 1;
			
		
		//Show board
		System.out.println(Board);}
		
		//Initialiser coursePoursuite
		
		
		
		//System.out.println(Visible);
		//System.out.println(Board);
		
		//Ajout des cartes alibi à l'ArrayDeque
	
		
		
		
		

	}
	
	public static void doAction(int chosenToken, ArrayDeque <AlibiCard> pile, ArrayList<District> board, String currentPlayer) {
		
		
		
		switch(chosenToken){
		case 1 : if (ActionToken.actionToken1.getFace() == 1) {
			//Watson Moves
				ActionToken.actionToken1.watsonMove();
				break;}
			else if(ActionToken.actionToken1.getFace() == 2) {
				//Toby moves
				ActionToken.actionToken1.tobyMove();
				break;}
			else {
					System.out.println("Do what you're told, or the game stops working");
					System.exit(0);
				}
		case 2 : if (ActionToken.actionToken2.getFace() == 1) {
			ActionToken.actionToken2.sherlockMove();
			break;}
		else if(ActionToken.actionToken2.getFace() == 2) {
			if (currentPlayer.equals("MrJack")){
				takeCard(pile);
				Hourglass.totalhourglass.addHourglass(Hourglass.cardhourglass.getHourglass());
				}
			else {
				AlibiCard card = takeCard(pile);
				for (int i = 0; i < board.size(); i++) {
					if (board.get(i).getAlibiCard() == card) {
						board.get(i).isSeen();
					}
				}
			}
			break;
		}
		else {
				System.out.println("Do what you're told, or the game stops working");
				System.exit(0);
				
			}
		case 3 : if (ActionToken.actionToken3.getFace() == 1) {
			ActionToken.actionToken3.moveDetective();
			break;}
		else if(ActionToken.actionToken3.getFace() == 2) {
			ActionToken.actionToken3.Rotate(board);
			break;
		}
		else {
				System.out.println("Do what you're told, or the game stops working");
				System.exit(0);
			}
		case 4 : if (ActionToken.actionToken4.getFace() == 1) {
			ActionToken.actionToken4.Rotate(board);
			break;}
		else if(ActionToken.actionToken4.getFace() == 2) {
			board = ActionToken.actionToken4.switchCard(board);
			break;
		}
		else {
				System.out.println("Do what you're told, or the game stops working");
				System.exit(0);
			}
		}
		
		}
	
	
	
	
	
	
		//Take a card from the AlibiCard pile
		public static AlibiCard takeCard(ArrayDeque<AlibiCard> pile) {
	int hourglass = 0;
	AlibiCard card = null;
	if (pile.isEmpty()){
		//Test, is the pile empty
		 System.out.println("The pile is empty");
	 }
	 else {		 
		 //Take a card from the pile and return the name and number of hourglasses.
		 card = pile.pop();
		 Hourglass.cardhourglass.cardHourglass(card.returnHourglass());
		 System.out.println(card.toString());
		 
	 }
	return card;
	
	}
	
		public static AlibiCard MrJack(ArrayDeque <AlibiCard> pile) {
			AlibiCard MrJack = pile.pop();
			return MrJack;
		}
		
		
	
		
}
