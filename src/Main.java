import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
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
		ArrayDeque <Object> Card = new ArrayDeque<>();
		Card.push(Card1);
		Card.push(Card2);
		Card.push(Card3);
		Card.push(Card4);
		Card.push(Card5);
		Card.push(Card6);
		Card.push(Card7);
		Card.push(Card8);
		Card.push(Card9);
		//Pioche des cartes
		for(int counter = 0; counter < 10; counter ++){
			takeCard(Card);
		}
		
		
		

	}
		//Take a card from the AlibiCard pile
		public static ArrayDeque takeCard(ArrayDeque Card) {
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
