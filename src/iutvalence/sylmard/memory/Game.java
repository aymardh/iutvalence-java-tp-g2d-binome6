package iutvalence.sylmard.memory;

/**
 * Game: a player and a grid.
 *
 * @author aymardh sylvestr
 * @version 1.1
 */
public class Game {
	
    /** Game's player. */
    private final Player player;
    
    /** Game's grid. */
    private final Grid grid;

    /** Constructor of the game, we need his name and the level of the game. */
    public Game(final String name, final int level) {
        /* TODO Code the parameter's checking */
    	player = new Player(name);
        grid = new Grid(level);
    }
    
    public void turnACard(int abs, int ord) {
    	
    	/* TODO Code the turn that show the card/number
    	 * 
    	 * hiddentable[abs][ord] = table[abs][ord]
    	 */
    }

    /** Start the game. */
    public void start() {
    	System.out.println(grid);
    }
    
}
