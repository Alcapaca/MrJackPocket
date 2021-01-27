import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Graphics {
	
	private static JButton Smith;

	public static void initialisationBoard(ArrayList <District> board, ArrayList<ActionToken> tokens, int turnCounter, AlibiCard MrJack, String currentPlayer) throws IOException {
		
			  
		
		
		
        
        /*
        BufferedImage JAlibiCard = ImageIO.read(new File("InspLestradeJAlibi.png"));
        JAlibi JAlibi = new JAlibi(new ImageIcon(JAlibiCard));       
        //JAlibi.setPreferredSize(new Dimension(150,));
        rightPanel.add(JAlibi,BorderLayout.NORTH);
        JPanel centerRightPanel = new JPanel();
        rightPanel.add(centerRightPanel,BorderLayout.SOUTH);
        centerRightPanel.setLayout(new GridLayout(8, 1));
        
        BufferedImage hourglassCard = ImageIO.read(new File("Jeton1-Face1.png"));
        Hourglass hourglass = new Hourglass(new ImageIcon(hourglassCard));  
        hourglass.setPreferredSize(new Dimension(150,150));
        centerRightPanel.add(hourglass, BorderLayout.CENTER);
        BufferedImage hourglassCard1 = ImageIO.read(new File("Jeton1-Face1.png"));
        Hourglass hourglass1 = new Hourglass(new ImageIcon(hourglassCard1));  
        hourglass1.setPreferredSize(new Dimension(100,100));
        centerRightPanel.add(hourglass1, BorderLayout.SOUTH);
        */

        
	}
	
	
	
	
	
	public static JPanel updateBoardGraphics(JPanel centerPanel, JButton Watson, JButton Toby, JButton Sherlock, ArrayList<District> board,JFrame frame) throws IOException {
		
		centerPanel.removeAll();
		
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        centerPanel.setPreferredSize(new Dimension(750, 700));
        centerPanel.setLayout(new GridLayout(5, 5));
      
	    
        centerPanel.add(new JPanel());
        
        
        JButton toBeAdded = isDetectiveThere(0, Watson,  Toby, Sherlock);
        centerPanel.add(toBeAdded);
        
        toBeAdded = isDetectiveThere(1, Watson,  Toby, Sherlock);
        centerPanel.add(toBeAdded);
        toBeAdded = isDetectiveThere(2, Watson,  Toby, Sherlock);
        centerPanel.add(toBeAdded);
        centerPanel.add(new JPanel());
        //centerPanel.add(new)
        centerPanel.add(isDetectiveThere(11, Watson,  Toby, Sherlock));
        
	    //hello =new ImageIcon(buttonIcon));
        centerPanel.add(updateBoard(0,board));
	    
	    
	    //hello =new ImageIcon(buttonIcon));
        centerPanel.add(updateBoard(1,board));
	    
	    //hello =new ImageIcon(buttonIcon));
        centerPanel.add(updateBoard(2,board));
	        
	    centerPanel.add(isDetectiveThere(3, Watson,  Toby, Sherlock));
	    centerPanel.add(isDetectiveThere(10, Watson,  Toby, Sherlock));
	       
	   
	       //hello =new ImageIcon(buttonIcon));
	    centerPanel.add(updateBoard(3,board));
	   
	    //hello =new ImageIcon(buttonIcon));
	    centerPanel.add(updateBoard(4,board));
	     
	     //hello =new ImageIcon(buttonIcon));
	    centerPanel.add(updateBoard(5,board));
	        
	   
	     centerPanel.add(isDetectiveThere(4, Watson,  Toby, Sherlock));
	     //centerPanel.add(new JPanel());
	     centerPanel.add(isDetectiveThere(9, Watson,  Toby, Sherlock));
	        
	    
	     //hello =new ImageIcon(buttonIcon));
	     centerPanel.add(updateBoard(6,board));
	    
	     //hello =new ImageIcon(buttonIcon));
	     centerPanel.add(updateBoard(7,board));
	    
	     //hello =new ImageIcon(buttonIcon));
	     centerPanel.add(updateBoard(8,board)); 
        
	     centerPanel.add(isDetectiveThere(5, Watson,  Toby, Sherlock));
	      centerPanel.add(new JPanel());
	     centerPanel.add(isDetectiveThere(8, Watson,  Toby, Sherlock));
	     centerPanel.add(isDetectiveThere(7, Watson,  Toby, Sherlock));
	  
	    
	  
	        
	     centerPanel.add(isDetectiveThere(6, Watson,  Toby, Sherlock));
	     centerPanel.add(new JPanel());
	        
        frame.add(centerPanel, BorderLayout.LINE_START);
        return centerPanel;
	}
	
	public static JButton isDetectiveThere(int position,JButton Watson, JButton Toby, JButton Sherlock) {
		if (Detective.WATSON.getPosition() == position){
			return Watson;}
		else if (Detective.SHERLOCK.getPosition() == position) {
			
			return Sherlock;	}
		else if (Detective.TOBY.getPosition() == position) {
			return Toby;
		}
		else {
			return new JButton();
		}}
	
	
	public static BufferedImage rotate(int amountOfTimes, File Name) throws IOException {
			
			BufferedImage buttonIcon = ImageIO.read(Name);
			int width = buttonIcon.getWidth();
			int height = buttonIcon.getHeight();
			BufferedImage rotated = null;
			switch(amountOfTimes) {
			 case 0 : 
			   rotated = new BufferedImage(width,height,buttonIcon.getType());
			   for(int y = 0; y<height; y++) {
				   for(int x = 0; x<width;x++) {
					   rotated.setRGB((width-1)- x,(height-1)-y, buttonIcon.getRGB(x, y));
				   }
			   }
			   break;
			 case 3 : 
				 rotated = new BufferedImage(height,width,buttonIcon.getType());
				   for(int y = 0; y<height; y++) {
					   for(int x = 0; x<width;x++) {
						   rotated.setRGB((height-1)-y,x, buttonIcon.getRGB(x, y));
					   }
				   }
				   break;
			 case 2,4:
				 rotated = buttonIcon;
				 break;
			case 1:
				rotated = new BufferedImage(height,width,buttonIcon.getType());
				   for(int y = 0; y<height; y++) {
					   for(int x = 0; x<width;x++) {
						   rotated.setRGB(y, (width-1)-x, buttonIcon.getRGB(x, y));
					   }
				   }
				   break;
		
			}
			
			   return rotated;
	}
		
		
		public static JButton updateBoard(int i, ArrayList <District> board) throws IOException {
				
			
		    
				if (board.get(i).getAlibiCard() == AlibiCard.Madame){
					if (board.get(i).isSuspect() == false) {
						
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict2 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("2.png"))));
					    JDistrict2.setPreferredSize(new Dimension(100,100));
					    return JDistrict2;
					}
					
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.JeremyBert) {
					if (board.get(i).isSuspect() == false) {
						
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict4 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("4.png"))));
					    JDistrict4.setPreferredSize(new Dimension(100,100));
					    return JDistrict4;
					}
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.InspectorLestrade) {
					if (board.get(i).isSuspect() == false) {
						
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict8 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("8.png"))));
					    JDistrict8.setPreferredSize(new Dimension(100,100));
					    return JDistrict8;
					}
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.JohnPizer) {
					if (board.get(i).isSuspect() == false) {
						
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict9 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("9.png"))));
					    JDistrict9.setPreferredSize(new Dimension(100,100));
					    return JDistrict9;
					
					}
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.JohnSmith) {
					if (board.get(i).isSuspect() == false) {
						
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict7 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("7.png"))));
					    JDistrict7.setPreferredSize(new Dimension(100,100));
					    return JDistrict7;
					}
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.JosephLane) {
					if (board.get(i).isSuspect() == false) {
						
						JDistrict JDistrict1 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("1.png"))));
					    JDistrict1.setPreferredSize(new Dimension(100,100));
					    return JDistrict1;
					}
					else {
						JDistrict JDistrict10 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("10.png"))));
					    JDistrict10.setPreferredSize(new Dimension(100,100));
					    return JDistrict10;
					}
								
					
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.MissStealthy) {
					if (board.get(i).isSuspect() == false) {
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict6 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("6.png"))));
					    JDistrict6.setPreferredSize(new Dimension(100,100));
					    return JDistrict6;
					}
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.SgtGoodley) {
					if (board.get(i).isSuspect() == false) {
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict3 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("3.png"))));
					    JDistrict3.setPreferredSize(new Dimension(100,100));
					    return JDistrict3;
					}
				}
				else if (board.get(i).getAlibiCard() == AlibiCard.WilliamGull) {
					if (board.get(i).isSuspect() == false) {
						JDistrict JDistrict0 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("0.png"))));
					    JDistrict0.setPreferredSize(new Dimension(100,100));
					    return JDistrict0;
					}
					else {
						JDistrict JDistrict5 = new JDistrict(new ImageIcon(rotate(board.get(i).getWallPlacement(),new File("5.png"))));
					    JDistrict5.setPreferredSize(new Dimension(100,100));
					    return JDistrict5;
					}
				}
			
		
	 return new JButton();
		}
	 
	 	public static JPanel updateTurnCounterGraphics(JPanel turnCounterPanel, int turnCounter, String currentPlayer) {
	 		turnCounterPanel.removeAll();
	 	
	 		turnCounterPanel.setPreferredSize(new Dimension(400, 100));
	        turnCounterPanel.add(new JLabel( String.format( "This is turn %d, ",turnCounter )));
	        turnCounterPanel.add(new JLabel (currentPlayer + " it is your turn"));
	       
	        return turnCounterPanel;}
	 	
	
	 	
	 	
		public static JPanel updateActionTokenGraphics(JPanel rightPanelAction, ArrayList<ActionToken> tokens, JButton JActionToken1Face1, JButton JActionToken1Face2, JButton JActionToken4Face2, JButton JActionToken4Face1, JButton JActionToken3Face2, JButton JActionToken3Face1, JButton JActionToken2Face2, JButton JActionToken2Face1) {
			
			rightPanelAction.removeAll();
			
			
			rightPanelAction.add(updateActionToken(1,tokens,  JActionToken1Face1,  JActionToken1Face2,  JActionToken2Face1,  JActionToken2Face2,  JActionToken3Face1,  JActionToken3Face2, JActionToken4Face1, JActionToken4Face2));
	                
	        rightPanelAction.add(updateActionToken(2,tokens,  JActionToken1Face1,  JActionToken1Face2,  JActionToken2Face1,  JActionToken2Face2,  JActionToken3Face1,  JActionToken3Face2, JActionToken4Face1, JActionToken4Face2));
	        
	        rightPanelAction.add(updateActionToken(3,tokens,  JActionToken1Face1,  JActionToken1Face2,  JActionToken2Face1,  JActionToken2Face2,  JActionToken3Face1,  JActionToken3Face2, JActionToken4Face1, JActionToken4Face2));
	        
	        rightPanelAction.add(updateActionToken(4,tokens,  JActionToken1Face1,  JActionToken1Face2,  JActionToken2Face1,  JActionToken2Face2,  JActionToken3Face1,  JActionToken3Face2, JActionToken4Face1, JActionToken4Face2));
	        
			
		
			return rightPanelAction;
			
		}
		
		public static JButton updateActionToken(int i, ArrayList <ActionToken> tokens, JButton JActionToken1Face1, JButton JActionToken1Face2, JButton JActionToken2Face1, JButton JActionToken2Face2, JButton JActionToken3Face1, JButton JActionToken3Face2, JButton JActionToken4Face1, JButton JActionToken4Face2) {
			switch (i) {
			case 1:
			
			if (tokens.get(0) == null) {
					return new JButton();}
				
			else if(ActionToken.actionToken1.getFace() == 1) {
					return JActionToken1Face1;
				}
			else{
					return JActionToken1Face2;}
			case 2:
			if (tokens.get(1) == null) {
				return new JButton();
			}
			else if(ActionToken.actionToken2.getFace() == 1) {
				return JActionToken2Face1;
			}
			else{
				return JActionToken2Face2;
			}
			case 3:
			if (tokens.get(2) == null) {
				return new JButton();
			}
			else if(ActionToken.actionToken3.getFace() == 1) {
				return JActionToken3Face1;
			}
			else{
				return JActionToken3Face2;
			}
			case 4 :
			if (tokens.get(3) == null) {
				return new JButton();
			}
			else if(ActionToken.actionToken4.getFace() == 1) {
				return JActionToken4Face1;
			}
			else{
				return JActionToken4Face2;
			}
			
			
			
			
		}
			return new JButton();}
		
		
		public static void showAlibiCard(AlibiCard chosen)  {
			
	        
			JDialog alibiCardWindow = new JDialog();
		
			alibiCardWindow.add(new JLabel(String.format("	Votre carte est %s et a %d sabliers",chosen.toString(),chosen.returnHourglass())));
			alibiCardWindow.setSize(400,400);
			alibiCardWindow.setAlwaysOnTop(true);
			alibiCardWindow.setVisible(true);
			
		}
		
		
		
		public static JPanel updateMrJackCardGraphics(JPanel JAlibiPanel, AlibiCard MrJack, String currentPlayer, JButton backOfCard, JButton Smith, JButton Goodley, JButton Lestrade, JButton Bert, JButton Pizer, JButton Lane, JButton Madame, JButton Gull, JButton Stealthy) {

			JAlibiPanel.removeAll();
			if (currentPlayer.equals(("MrJack"))){
			JAlibiPanel.add(showMrJack ( MrJack,  currentPlayer,  backOfCard,  Lestrade,  Bert,  Pizer, Smith,  Lane,  Madame,  Stealthy,  Goodley,Gull) , BorderLayout.SOUTH);
			JAlibiPanel.add(new JLabel("Mr Jack this is your identity"));
			
				
		        JAlibiPanel.add(new JLabel(String.format("Vous avez %d sabliers", Hourglass.totalhourglass.getHourglass())));
			}
			
			else {JAlibiPanel.add(showMrJack ( MrJack,  currentPlayer,  backOfCard,  Lestrade,  Bert,  Pizer, Smith,  Lane,  Madame,  Stealthy,  Goodley,Gull) , BorderLayout.SOUTH);
			}
			 return JAlibiPanel;
		}
		
		public static JButton showMrJack (AlibiCard MrJack, String currentPlayer, JButton backOfCard, JButton Lestrade, JButton Bert, JButton Pizer, JButton Smith, JButton Lane, JButton Madame, JButton Stealthy, JButton Goodley, JButton Gull) {
			if (currentPlayer.equals("Detective")) {
				return backOfCard;
			}
			else {
				switch(MrJack) {
				case InspectorLestrade: 
					return Lestrade;
					
				case JeremyBert:
					return Bert;
				case JohnPizer:
					return Pizer;
				case JohnSmith:
					return Smith;
				case JosephLane:
					return Lane;
				case Madame:
					return Madame;
				case MissStealthy:
					return Stealthy;
				case SgtGoodley:
					return Goodley;
				case WilliamGull:
					return Gull;
				default:
					break;
				
				}
			}
			
			return null;
			
			
		}
		
		public static JPanel updateTextToChoose(JPanel textPanel) {
			textPanel.removeAll();
			textPanel.add(new JLabel("Choisissez un Action Token, accomplissez l'Action, puis appuyez sur Valider"));
			return textPanel;
		}
		
		






	
	
}

