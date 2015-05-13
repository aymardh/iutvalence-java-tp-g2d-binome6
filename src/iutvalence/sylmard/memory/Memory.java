package iutvalence.sylmard.memory;

/** The class where we execute the game */
public class Memory {

	private Memory() { }
	
	/** the main code where we start and play */
	public static void main(String[] args) {
		Game game = new Game("Toto", 4);
		game.start();
		game.play();		
	}
}
