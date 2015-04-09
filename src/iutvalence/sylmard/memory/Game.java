package iutvalence.sylmard.memory;

/**
 * Game: a player and a grid.
 *
 * @author aymardh sylvestr
 * @version TODO
 */
public class Game {
    /** Game's player. */
    private final Player player;
    /** Game's grid. */
    private final Grid   grid;

    /** Constructor of the game, we need his name and the level of the game. */
    public Game(final String name, final int level) {
        player = new Player(name);
        /* TODO Grid init ? */
    }

    /** Start the game. */
    public void start() {
    }
}
