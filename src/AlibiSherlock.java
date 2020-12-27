import java.util.Scanner;

public class AlibiSherlock extends ActionToken{
	
	}
	private String name;
	private int face;
	
	public void TakeAlibiCard () {
		
	}
	public void MoveSherlock() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("De combien de cases voulez vous bouger Sherlock (On tourne dans le sens des aiguilles d'une montre) : 1 ou 2 ? ");
		int nbCell = scanner.nextInt();
		while (nbCell != 1 || nbCell != 2) {
			System.out.println("Veuillez entrer les chiffres 1 ou 2: ");
			nbCell = scanner.nextInt();
		}
		moveTo(nbCell)
		
	}
	         
}
