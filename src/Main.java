import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Game game = new Game();
		game.initialiseBoard();

		
		
		//Ajout des cartes alibi à l'ArrayDeque
		List <Object> Card = new ArrayList<>();
		Card.add(AlibiCard.InspectorLestrade);
		Card.add(AlibiCard.JeremyBert);
		Card.add(AlibiCard.JohnPizer);
		Card.add(AlibiCard.JohnSmith);
		Card.add(AlibiCard.JosephLane);
		Card.add(AlibiCard.Madame);
		Card.add(AlibiCard.MissStealthy);
		Card.add(AlibiCard.SgtGoodley);
		Card.add(AlibiCard.WilliamGull);
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
		 System.out.println("La carte est : " + Card.pop());
	 }
	return Card;
	}
		
}
