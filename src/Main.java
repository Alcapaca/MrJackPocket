import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Game game = new Game();
		game.initialiseBoard();

		
		// Create Alibi Crads
		AlibiCard Card1 = new AlibiCard("Inspecteur Lestrade",0);
		AlibiCard Card2 = new AlibiCard("Miss Stealthy",1);
		AlibiCard Card3 = new AlibiCard("Jeremy Bert", 1);
		AlibiCard Card4 = new AlibiCard("John Smith", 1);
		AlibiCard Card5 = new AlibiCard("John Pizer", 1);
		AlibiCard Card6 = new AlibiCard("Joseph Lane", 1);
		AlibiCard Card7 = new AlibiCard("Madame", 2);
		AlibiCard Card8 = new AlibiCard("Sgt Goodley", 0);
		AlibiCard Card9 = new AlibiCard("William Gull", 1);
		//Ajout des cartes alibi à l'ArrayDeque
		List <Object> Card = new ArrayList<>();
		Card.add(Card1);
		Card.add(Card2);
		Card.add(Card3);
		Card.add(Card4);
		Card.add(Card5);
		Card.add(Card6);
		Card.add(Card7);
		Card.add(Card8);
		Card.add(Card9);
		Collections.shuffle(Card);
		ArrayDeque <Object> pile = new ArrayDeque <Object> (Card);
		//Pioche des cartes
		for(int counter = 0; counter < 10; counter ++){
			takeCard(pile);
		}
		
		
		
		

	}
		//Take a card from the AlibiCard pile
		public static ArrayDeque<Object> takeCard(ArrayDeque<Object> Card) {
	if (Card.isEmpty()){
		//Test, is the pile empty
		 System.out.println("The pile is empty");
	 }
	 else {		 
		 //Take a card from the pile and return the name and number of hourglasses.
		 System.out.println("La carte est : " + Card.pop().toString());
	 }
	return Card;
	}
		
}
