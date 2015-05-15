package iutvalence.sylmard.memory;



/**
 * A player with his nickname and his score.
 *
 * @author aymardh sylvestr
 * @version TODO
 */
public class Player {
	
    /** Score is initialized to 0. */
    public static final int SCORE_DEFAULT = 0;
    
    /** Player's nickname. */
    private final String nickname;
    
    /** Player's score. */
    private int score;

    /** Create a player with the given <i>name</i>. */
    public Player(String name) {
        this.nickname = name;
        this.score = SCORE_DEFAULT;
    }

    
}
