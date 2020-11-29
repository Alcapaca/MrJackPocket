import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashMap <String, Integer> AlibiCard = new HashMap<>();
		
		// Create Alibis

		initialiseCard();
			AlibiCard.put("Inspecteur Lestrade",0);
			AlibiCard.put("Miss Stealthy",1);
			AlibiCard.put("Jeremy Bert", 1);
			AlibiCard.put("John Smith", 1);
			AlibiCard.put("John Pizer", 1);
			AlibiCard.put("Joseph Lane", 1);
			AlibiCard.put("Madame", 2);
			AlibiCard.put("Sgt Goodley", 0);
			AlibiCard.put("William Gull", 1);
			System.out.println(AlibiCard);
			
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
		takeCard();
		

	}
	
	private static ArrayDeque<Object> initialiseCard() {
		
		AlibiCard Card1 = new AlibiCard("Inspecteur Lestrade",0);
		AlibiCard Card2 = new AlibiCard("Miss Stealthy",1);
		AlibiCard Card3 = new AlibiCard("Jeremy Bert", 1);
		AlibiCard Card4 = new AlibiCard("John Smith", 1);
		AlibiCard Card5 = new AlibiCard("John Pizer", 1);
		AlibiCard Card6 = new AlibiCard("Joseph Lane", 1);
		AlibiCard Card7 = new AlibiCard("Madame", 2);
		AlibiCard Card8 = new AlibiCard("Sgt Goodley", 0);
		AlibiCard Card9 = new AlibiCard("William Gull", 1);
		
		List <AlibiCard> Card = new List<>();
		Card.add("Inspecteur Lestrade",0);
		Card.push(Card2);
		Card.push(Card3);
		Card.push(Card4);
		Card.push(Card5);
		Card.push(Card6);
		Card.push(Card7);
		Card.push(Card8);
		Card.push(Card9);
		return Card;
		
	}

	public static void takeCard() {
		if (Card.isEmpty()){
			 System.out.println("The pile is empty");
		 }
		 else {
			 System.out.println("La carte est : " + Card.pop());
	}
	
	}
}
