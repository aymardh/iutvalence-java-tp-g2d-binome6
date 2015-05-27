package iutvalence.sylmard.memory;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Controller extends Thread {
	// Lien controller => Vue
	private MemoryWindow view;
	// Lien controller => Modele
	private Grid grid;
	private Player player;
	
	public void start() {
		JFrame param = new ParamWindow(this);
	}

	public void initParty(String pseudo, String level) {
		/* Modèle. */
		grid = new Grid(Integer.valueOf(level));
		player = new Player(pseudo);
		SwingUtilities.invokeLater(new MemoryWindow(this));
	}

	
}
