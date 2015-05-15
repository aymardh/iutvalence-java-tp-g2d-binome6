package iutvalence.sylmard.memory;

import java.util.Scanner;

/** The class where we execute the game */
public class Memory {

	private Memory() { }

	
	/** the main code where we start and play */
	public static void main(String[] args) {

			/** 
			 * need a pseudo
			 */
	    	Scanner sk = new Scanner(System.in);
			System.out.println("Veuillez saisir vôtre pseudo:");
			String pseudo = sk.nextLine();
			System.out.println("Bonjour " + pseudo);
			
			/**
			 * need a level => 0 and level*level =pair
			 */
			
			boolean good;
			int level;
			
			do
			{
				good=true;
			
			System.out.println("Veuillez saisir un niveau positif dont la valeur au carré est paire");
			level = sk.nextInt();
			if ( level % 2 !=0 || level<=0 )
				{
					good=false;
					
				}
			}
			while(!good);
				
			System.out.println("Vous avez saisi le niveau "+ level);
			
		
		Game game = new Game("pseudo", level);

		game.start();
		game.play();
		System.out.println("votre score est de : " + game.score());
		
	}

	
	
}
