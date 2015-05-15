package iutvalence.sylmard.memory;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

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

	/** Start the game. */
	public void start() {
		System.out.println(grid);
		
	}

	/** Play a game. */
	public void play() {
		Scanner sc = new Scanner(System.in);

		while (!victory()) {
			int i, j;
			boolean good;
			do {
				good = true;
				System.out.println("Veuillez saisir les coordonnées de la carte à retourner :");
				i = sc.nextInt();
				j = sc.nextInt();
				if (i >(grid.getLevel()-1)|| i < 0 || j < 0 || j >(grid.getLevel()-1) ||grid.getHiddenCoord(i, j) == false) {
					System.err
							.println("Vous avez saisi de mauvaises coordonnées !");
					good = false;
				}
			} while (!good);

			System.out.println("Vous avez saisi les coordonnées : (" + i + "," + j + ")");
			int val1 = grid.swap(i, j);
			System.out.println(grid);

			int x, y;
			do {
				good = true;
				System.out.println("Veuillez saisir les coordonnées de la seconde carte à retourner :");
				x = sc.nextInt();
				y = sc.nextInt();
				if (x > (grid.getLevel()-1)|| x < 0 || y >(grid.getLevel()-1)|| y < 0 || (x == i && y == j)|| grid.getHiddenCoord(x, y) == false) {
					System.err.println("Vous avez saisi de mauvaises coordonnées !");
					good = false;
				}
			} while (!good);
			System.out.println("Vous avez saisi les coordonnées : (" + x + "," + y + ")");
			int val2 = grid.swap(x, y);
			System.out.println(grid);
			/**
			 * if we have 2 cards differents swap cards and create a delay 
			 */
			if (val1 != val2)
			{
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) { /* NOTHING */ }
				grid.swap(i, j);
				grid.swap(x, y);
				System.out.println(grid);
				
				
			}
			/**
			 * else return the value found
			 */
			else {
				System.out.println("Vous avez trouvé les cartes : "+ val1);
				System.out.println(grid);
				
			}
			if (grid.victory() == true)
			{
				System.out.println("victory !");
			}


			
			// TODO metho
			
		}
	}
	
	/** Test the victory */
	private boolean victory() {
		return grid.victory();

	}

}
