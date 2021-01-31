import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		
		
		
		
		//Initialisation de la partie
		
		Game game = new Game();
		Graphics GUI = new Graphics();
		
	
		//Initialisation des graphiques
		
		
		
		
		int turnCounter = 1;
		boolean coursePoursuite = false;
		boolean gameEnd = false;
		
		
		//Initialisation de la Pile de cartes
		ArrayList<AlibiCard> Cards = new ArrayList<>(Arrays.asList(AlibiCard.values()));
		Collections.shuffle(Cards);
		ArrayDeque<AlibiCard> pile = new ArrayDeque <AlibiCard> (Cards);
		
		//Initialisation du perso de Mr Jack
		AlibiCard MrJack = pile.pop();
	
		
		
		//Initialisation du plateau de jeu
		ArrayList<District> Board = game.initialiseBoard();
		
		//Initialisationd es graphiques
		BufferedImage InspLestrade = ImageIO.read(new File("InspLestrade-alibi.png"));
        Image JAlibi1 = InspLestrade.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Lestrade = new JAlibi(new ImageIcon(JAlibi1));  		
		
		BufferedImage JBert = ImageIO.read(new File("JeremyBert-alibi.png"));
        Image JAlibi2 = JBert.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Bert = new JAlibi(new ImageIcon(JAlibi2));  
        
        BufferedImage JPizer = ImageIO.read(new File("JohnPizer-alibi.png"));
        Image JAlibi3 = JPizer.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Pizer = new JAlibi(new ImageIcon(JAlibi3));  
        
        BufferedImage JSmith = ImageIO.read(new File("JohnSmith-alibi.png"));
        Image JAlibi4 = JSmith.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Smith = new JAlibi(new ImageIcon(JAlibi4)); 
        
        BufferedImage JLane = ImageIO.read(new File("JosephLane-alibi.png"));
        Image JAlibi5 = JLane.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Lane = new JAlibi(new ImageIcon(JAlibi5)); 
        
        BufferedImage madame = ImageIO.read(new File("Madame-alibi.png"));
        Image JAlibi6 = madame.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Madame = new JAlibi(new ImageIcon(JAlibi6));
        
        BufferedImage MSteal = ImageIO.read(new File("MissStealthy-alibi.png"));
        Image JAlibi7 = MSteal.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Stealthy = new JAlibi(new ImageIcon(JAlibi7)); 
        
        BufferedImage SGoodbye = ImageIO.read(new File("SgtGoodley-alibi.png"));
        Image JAlibi8 = SGoodbye.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Goodley = new JAlibi(new ImageIcon(JAlibi8)); 
        
        BufferedImage WGull = ImageIO.read(new File("WilliamGull-alibi.png"));
        Image JAlibi9 = WGull.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi Gull = new JAlibi(new ImageIcon(JAlibi9)); 
        
        BufferedImage CardBack = ImageIO.read(new File("alibi-card.png"));
        Image JAlibi10 = CardBack.getScaledInstance(100,200, Image.SCALE_SMOOTH);
        JAlibi backOfCard = new JAlibi(new ImageIcon(JAlibi10)); 
        
       
	     
	     
	     //Initialisation des actionToken
	     
	        
	     BufferedImage jetonAction1F2 = ImageIO.read(new File("Jeton2-Face1.png"));
	        Image img2 = jetonAction1F2.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken1Face2 = new JActionToken(new ImageIcon(img2));  
	     
	     BufferedImage jetonAction2F1 = ImageIO.read(new File("Jeton3-Face1.png"));
	        Image img3 = jetonAction2F1.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken2Face1 = new JActionToken(new ImageIcon(img3));  
	     
	     BufferedImage jetonAction3F1 = ImageIO.read(new File("Jeton4-Face1.png"));
	        Image img4 = jetonAction3F1.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken3Face1 = new JActionToken(new ImageIcon(img4));  
	        
	        BufferedImage jetonAction3F2 = ImageIO.read(new File("Jeton1-Face2.png"));
	        Image img5 = jetonAction3F2.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken3Face2 = new JActionToken(new ImageIcon(img5));  
	        
	     BufferedImage jetonAction1F1 = ImageIO.read(new File("Jeton2-Face2.png"));
	        Image img6 = jetonAction1F1.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken1Face1 = new JActionToken(new ImageIcon(img6));  
	     
	     BufferedImage jetonAction2F2 = ImageIO.read(new File("Jeton3-Face2.png"));
	        Image img7 = jetonAction2F2.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken2Face2 = new JActionToken(new ImageIcon(img7));  
	     
	     BufferedImage jetonAction4F1 = ImageIO.read(new File("Jeton4-Face2.png"));
	        Image img8 = jetonAction4F1.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken4Face1 = new JActionToken(new ImageIcon(img8));
	        
	        BufferedImage jetonAction4F2 = ImageIO.read(new File("Jeton1-Face1.png"));
	        Image img9 = jetonAction4F2.getScaledInstance(100,100, Image.SCALE_SMOOTH);
	        JActionToken JActionToken4Face2 = new JActionToken(new ImageIcon(img9));
	     
	     //Initialisation des detectives
	     
	        
	        JButton Watson = new JButton();
	        Watson.setIcon(new ImageIcon("12.png"));
	        
	        JButton Toby = new JButton();
		     Toby.setIcon(new ImageIcon("13.png"));
		     
		     JButton Sherlock = new JButton();
		     Sherlock.setIcon(new ImageIcon("11.png"));
		     
		     
        // Mise en place de l'interface graphique
        
        JFrame frame = new JFrame("Mr Jack Pocket - Le Jeu");
        frame.setVisible(true);
        //frame.setSize(new Dimension(2024, 2000));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        JPanel centerPanel = new JPanel();
        centerPanel.add(new JPanel());
        
        
        JPanel rightPanel = new JPanel();
        JPanel rightPanelAction = new JPanel();
        JPanel turnCounterPanel = new JPanel();
      
        
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        rightPanel.setPreferredSize(new Dimension(500, 600));
        frame.add(rightPanel, BorderLayout.LINE_END);
        rightPanel.add(turnCounterPanel, BorderLayout.NORTH); 
      
        
        
        rightPanelAction.setPreferredSize(new Dimension(500, 100));
        
        rightPanel.add(rightPanelAction); 
        
        
        
        
        JPanel textPanel = new JPanel();
        textPanel.setPreferredSize(new Dimension(450, 100));
        
        rightPanel.add(textPanel);
        
        JButton validateButton = new JButton("Validation");
               
        
        rightPanel.add(validateButton);
        
        JPanel JAlibiPanel = new JPanel();
        JAlibiPanel.setPreferredSize(new Dimension(400, 300));
        rightPanel.add(JAlibiPanel); 
        
        
        
        JButton NextPlayer = new JButton("Next player");
        rightPanel.add(NextPlayer, BorderLayout.SOUTH);
        

		
		//Show board
		System.out.println(Board);
		
		//debut du jeu
		
		while(gameEnd == false) {
			
			//Donner le tour à la bonne personne
		
			String currentTurn = game.turnGiver(turnCounter);
			String currentPlayer = currentTurn;
			ArrayList <ActionToken> tokens = null;
			turnCounterPanel = Graphics.updateTurnCounterGraphics(turnCounterPanel, turnCounter, currentPlayer);
			
			//Lancement des actions tokens
			
			if (currentTurn.equals("Detective")){
				tokens = game.throwActionTokens();
			}
			else {
				tokens = game.turnOverActionToken();
			}
			
			//Mise à jour des graphiques
			
			centerPanel = Graphics.updateBoardGraphics(centerPanel, Watson, Toby, Sherlock, Board, frame);
			rightPanelAction = Graphics.updateActionTokenGraphics(rightPanelAction, tokens, JActionToken1Face1, JActionToken1Face2, JActionToken4Face2, JActionToken4Face1, JActionToken3Face2, JActionToken3Face1, JActionToken2Face2, JActionToken2Face1);
			JAlibiPanel = Graphics.updateMrJackCardGraphics(JAlibiPanel, MrJack, currentPlayer, backOfCard, Smith, Goodley, Lestrade, Bert, Pizer, Lane, Madame, Gull, Stealthy);
			textPanel = Graphics.updateTextToChoose(textPanel);
			
			   frame.setLocationRelativeTo(null);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
			
		        //Le tour
		        
			int chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			currentPlayer = game.swapPlayer(currentPlayer);
			
			//Mise à jour des graphiques
			
			turnCounterPanel = Graphics.updateTurnCounterGraphics(turnCounterPanel, turnCounter, currentPlayer);
			centerPanel = Graphics.updateBoardGraphics(centerPanel, Watson, Toby, Sherlock, Board, frame);
			rightPanelAction = Graphics.updateActionTokenGraphics(rightPanelAction, tokens, JActionToken1Face1, JActionToken1Face2, JActionToken4Face2, JActionToken4Face1, JActionToken3Face2, JActionToken3Face1, JActionToken2Face2, JActionToken2Face1);
			JAlibiPanel = Graphics.updateMrJackCardGraphics(JAlibiPanel, MrJack, currentPlayer, backOfCard, Smith, Goodley, Lestrade, Bert, Pizer, Lane, Madame, Gull, Stealthy);
			
			 frame.setLocationRelativeTo(null);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
		        
		        //Le tour
			
			game.updateActionTokens(tokens, chosenToken);
			chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			
			//Mise à jour des graphiques
			
			centerPanel = Graphics.updateBoardGraphics(centerPanel, Watson, Toby, Sherlock, Board, frame);
			rightPanelAction = Graphics.updateActionTokenGraphics(rightPanelAction, tokens, JActionToken1Face1, JActionToken1Face2, JActionToken4Face2, JActionToken4Face1, JActionToken3Face2, JActionToken3Face1, JActionToken2Face2, JActionToken2Face1);
			JAlibiPanel = Graphics.updateMrJackCardGraphics(JAlibiPanel, MrJack, currentPlayer, backOfCard, Smith, Goodley, Lestrade, Bert, Pizer, Lane, Madame, Gull, Stealthy);
			frame.setLocationRelativeTo(null);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
		        
		        //Le tour
			
			game.updateActionTokens(tokens, chosenToken);
			chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			currentPlayer = game.swapPlayer(currentPlayer);
			
			//Mise à jour des graphiques
			
			turnCounterPanel = Graphics.updateTurnCounterGraphics(turnCounterPanel, turnCounter, currentPlayer);
			centerPanel = Graphics.updateBoardGraphics(centerPanel, Watson, Toby, Sherlock, Board, frame);
			rightPanelAction = Graphics.updateActionTokenGraphics(rightPanelAction, tokens, JActionToken1Face1, JActionToken1Face2, JActionToken4Face2, JActionToken4Face1, JActionToken3Face2, JActionToken3Face1, JActionToken2Face2, JActionToken2Face1);
			JAlibiPanel = Graphics.updateMrJackCardGraphics(JAlibiPanel, MrJack, currentPlayer, backOfCard, Smith, Goodley, Lestrade, Bert, Pizer, Lane, Madame, Gull, Stealthy);
			 frame.setLocationRelativeTo(null);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
			
			
			
			game.updateActionTokens(tokens, chosenToken);
			chosenToken = game.chooseActionToken(tokens);
			doAction(chosenToken,pile,Board,currentPlayer);
			
			
			//Verification des suspects
			
			ArrayList <District> Visible = game.isSuspectVisible(Board);
			game.changeVisibleSuspects(Board, Visible, MrJack);
			
			
			//Check if game is ended
			
			coursePoursuite = game.checkGameEnd(coursePoursuite, Board, turnCounter, Visible, MrJack);
			
			turnCounter += 1;
			
			
			
		//Show board
		System.out.println(Board);}
		
		
		
			
		
		
		
		
		
		

	}
	
	public static void doAction(int chosenToken, ArrayDeque <AlibiCard> pile, ArrayList<District> board, String currentPlayer) throws IOException {
		
		
		
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
			//Sherlock Moves
		else if(ActionToken.actionToken2.getFace() == 2) {
			if (currentPlayer.equals("MrJack")){
				AlibiCard card = takeCard(pile);
				Hourglass.totalhourglass.addHourglass(Hourglass.cardhourglass.getHourglass());
				Graphics.showAlibiCard(card);
			}
			else {
				AlibiCard card = takeCard(pile);
				for (int i = 0; i < board.size(); i++) {
					if (board.get(i).getAlibiCard() == card) {
						board.get(i).isSeen();
					}
				}
				Graphics.showAlibiCard(card);
			}// Carte alibi
			
			break;
		}
		else {
				System.out.println("Do what you're told, or the game stops working");
				System.exit(0);
				
			}
		case 3 : if (ActionToken.actionToken3.getFace() == 1) {
			ActionToken.actionToken3.moveDetective();
			break;}
		// Bouger Detctive
		else if(ActionToken.actionToken3.getFace() == 2) {
			ActionToken.actionToken3.Rotate(board);
			break;
			//Tourner une case
			
		}
		else {
				System.out.println("Do what you're told, or the game stops working");
				System.exit(0);
			}
		case 4 : if (ActionToken.actionToken4.getFace() == 1) {
			ActionToken.actionToken4.Rotate(board);
			break;}
		//Tourner une case
		else if(ActionToken.actionToken4.getFace() == 2) {
			ActionToken.actionToken4.switchCard(board);
			break;
			//echanger deux cartes
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
	
		
		
		
	
		
}
