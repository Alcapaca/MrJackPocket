import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public enum ActionToken{
	actionToken1(1),
	actionToken2(1),
	actionToken3(1),
	actionToken4(1);
	
	private int face;

	ActionToken(int face) {
	
	this.face = face;
	}	
	
	public int getFace() {
		return face;
	}
	
	public void randomFace() {
		Random random = new Random();
		this.face = random.nextInt(2)+1;		
	}
	
	public void turnOverToken() {
		this.face = ((this.face)%2)+1;
	}
	
	public void tobyMove () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("De combien de cases voulez vous bouger Toby (On tourne dans le sens des aiguilles d'une montre) : 1 ou 2 ? ");
		int nbCell = scanner.nextInt();
		while (nbCell < 1 || nbCell > 2) {
			System.out.println("Veuillez entrer les chiffres 1 ou 2: ");
			nbCell = scanner.nextInt();
		}

		
		Detective.TOBY.moveTo(nbCell);
	}
	
	public void watsonMove () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("De combien de cases voulez vous bouger Watson (On tourne dans le sens des aiguilles d'une montre) : 1 ou 2 ? ");
		int nbCell = scanner.nextInt();
		while (nbCell < 1 || nbCell > 2) {
			System.out.println("Veuillez entrer les chiffres 1 ou 2: ");
			nbCell = scanner.nextInt();
		}

		
		Detective.WATSON.moveTo(nbCell);
	}
	
	public void sherlockMove() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("De combien de cases voulez vous bouger Sherlock (On tourne dans le sens des aiguilles d'une montre) : 1 ou 2 ? ");
		int nbCell = scanner.nextInt();
		while (nbCell < 1 || nbCell > 2) {
			System.out.println("Veuillez entrer les chiffres 1 ou 2: ");
			nbCell = scanner.nextInt();
		}
		Detective.SHERLOCK.moveTo(nbCell);
	}
	
	public void moveDetective() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quel personnage voulez-vous bouger : 1 -Sherlock, 2- Watson, 3-Tobby ? ");
		int CharToMove = scanner.nextInt();
		while (CharToMove<0 || CharToMove >3 ) {
			System.out.println("Veuillez entrer les chiffres 1, 2 ou 3 : ");
			CharToMove = scanner.nextInt();
		}
		System.out.println("De combien de cases voulez vous bouger votre personnage (On tourne dans le sens des aiguilles d'une montre)? 0 ou 1 ? ");
		int nbCell = scanner.nextInt();
		while (nbCell < 0 || nbCell > 1) {
			System.out.println("Veuillez entrer les chiffres 0 ou 1: ");
			nbCell = scanner.nextInt();
		}
		
		switch(CharToMove) {
		case 1: Detective.SHERLOCK.moveTo(nbCell);
		case 2: Detective.WATSON.moveTo(nbCell);
		case 3: Detective.TOBY.moveTo(nbCell);
		}
	}
	
	
	
	public void Rotate(ArrayList <District >board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle case voulez vous bouger ? (entrez un chiffre entre 0 et 8) ");
		int cellToMove = scanner.nextInt();
		while (cellToMove<0 || cellToMove > 8) {
			System.out.println("Veuillez entrer un chiffre entre 0 et 8 ");
			cellToMove = scanner.nextInt();
		}
		
		System.out.println("De combien voulez vous la tourner ? (Choisissez un chiffre entre 0 et 3 ");
		int orientation = scanner.nextInt();
		while (orientation<0 || orientation > 4) {
			System.out.println("Veuillez entrer un chiffre entre 1 et 3 ");
			orientation = scanner.nextInt();
		}

		switch (cellToMove) {
		case 0 :  board.get(0).rotate(orientation);
		break;
		case 1 :  board.get(1).rotate(orientation);
		break;
		case 2 :  board.get(2).rotate(orientation);
		break;
		case 3 :  board.get(3).rotate(orientation);
		break;
		case 4 :  board.get(4).rotate(orientation);
		break;
		case 5 :  board.get(5).rotate(orientation);
		break;
		case 6 :  board.get(6).rotate(orientation);
		break;
		case 7 :  board.get(7).rotate(orientation);
		break;
		case 8 :  board.get(8).rotate(orientation);
		break;
		
		}
		
	}
	
	public void switchCard(ArrayList <District> board) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est la première case que voulez vous bouger ? (entrez un chiffre entre 0 et 8 ");
		int cellToSwitch1 = scanner.nextInt();
		while (cellToSwitch1<0 || cellToSwitch1 > 8) {
			System.out.println("Veuillez entrer un chiffre entre 0 et 8 ");
			cellToSwitch1 = scanner.nextInt();
		}
		System.out.println("Quelle est la deuxième case que voulez vous bouger ? (entrez un chiffre entre 0 et 8 différent du premier ");
		int cellToSwitch2 = scanner.nextInt();
		while (cellToSwitch2<0 || cellToSwitch2 > 8 || cellToSwitch2 == cellToSwitch1) {
			System.out.println("Veuillez entrer un chiffre entre 0 et 8 différent du premier: ");
			cellToSwitch2 = scanner.nextInt();
		}
		
		Collections.swap(board, cellToSwitch1, cellToSwitch2);
		
	}

	
	
	
	public String toString() {
        return this.name()+ " " + face;
    }
	
}

