package iutvalence.sylmard.memory;

public class Memory {

	private Memory() { }
	
	public static void main(String[] args) {
		Game game = new Game("Toto", 4);
		game.start();
	}
}
