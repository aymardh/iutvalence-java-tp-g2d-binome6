package iutvalence.sylmard.memory;

import java.util.Scanner;

/** The class where we execute the game */
public class Memory {

	private Memory() { }

	
	/** the main code where we start and play */
	public static void main(String[] args) {


	    	Scanner sk = new Scanner(System.in);
			System.out.println("Veuillez saisir vôtre pseudo:");
			String pseudo = sk.nextLine();
			System.out.println("Bonjour " + pseudo);
			System.out.println("Veuillez saisir un niveau dont la valeur au carré est paire");
			int level = sk.nextInt();
			System.out.println("Vous avez saisi le niveau "+ level);
			
		
		Game game = new Game("pseudo", level);

		game.start();
		game.play();		
	}

	
	
}
