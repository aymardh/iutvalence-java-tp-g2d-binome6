package iutvalence.sylmard.memory;

/**
 * @author aymardh sylvestr
 * This class create a new player with his name(pseudo) and his score
 */
public class Player {
	/**
	 * Here is the attribute pseudo, his type is a string
	 */
	private final String pseudo;
	/**
	 * The score of the player
	 */
	private int score;
	/**
	 * The score is initialized to 0
	 */
	public final static int SCORE_DEFAULT = 0;
	/**
	 * The constructor create a player with the pseudo in parameter
	 * @param pseudo
	 */
	public Player(String pseudo) {
		
		this.pseudo = pseudo;
		this.score = SCORE_DEFAULT;
		
	}

}
