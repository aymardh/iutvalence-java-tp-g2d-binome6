package iutvalence.sylmard.memory;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MemoryWindow extends Thread {
	
	private Controller controller;
	
	public MemoryWindow(Controller controller) {
		this.controller = controller;
	}
		
	@Override
	public void run() {
		JFrame frame = new JFrame();
		
		//Définit un titre pour notre fenêtre
	    frame.setTitle("Memory");
	    
	    //Définit sa taille
	    frame.setSize(1000, 1000);
	    
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    frame.setLocationRelativeTo(null);
	    
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Rend visible        
	    frame.setVisible(true);
	    
	    frame.setLayout(new GridLayout(4, 4));
	    //On ajoute le bouton au content pane de la JFrame
	    //int lev = (level * level) + 1;
	    for (int i=1; i < 17; i++){
	    	frame.getContentPane().add(new JButton());
	    }
	    	
	    frame.setVisible(true);
	    
	    //paneljeu.add(, BorderLayout.PAGE_START);
	    
	    //frame.setContentPane(new Panel());
	}
	
	
	
	

}
