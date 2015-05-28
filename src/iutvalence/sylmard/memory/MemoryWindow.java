package iutvalence.sylmard.memory;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MemoryWindow extends Thread implements ActionListener{
	
	private Controller controller;
	private int level;
	
	public MemoryWindow(Controller controller, int level) {
		this.controller = controller;
		this.level = level;
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
	    
	    frame.setLayout(new GridLayout(level, level));
	    //On ajoute le bouton au content pane de la JFrame
	    for (int i=0; i < level; i++){
	    	for(int j=0; j < level; j++){
	    		frame.getContentPane().add(new Button(i, j));
	    	}
	    }
	    
	    //Rend visible        
	    frame.setVisible(true);
	    
	    //paneljeu.add(, BorderLayout.PAGE_START);
	    
	    //frame.setContentPane(new Panel());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		System.out.println(controller.turnCard(((Button)source)));
	}
	
	

}
