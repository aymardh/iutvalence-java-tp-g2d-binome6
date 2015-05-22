package iutvalence.sylmard.memory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout; 

import javax.swing.JButton;


public class MemoryWindow extends JFrame {
	
	private JTextField message = new JTextField();
	private JLabel labelmessage = new JLabel("Message");
	
	public MemoryWindow() {
		
		//Définit un titre pour notre fenêtre
	    this.setTitle("Memory");
	    
	    //Définit sa taille
	    this.setSize(1000, 1000);
	    
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    this.setLocationRelativeTo(null);
	    
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Rend visible        
	    this.setVisible(true);
	    
	    JPanel paneljeu = new JPanel();
	    JPanel panelmessage = new JPanel();
	    
	    paneljeu.setBackground(Color.ORANGE);
	    
	    paneljeu.setLayout(new BorderLayout());
	    
	    message.setPreferredSize(new Dimension(150, 30));
	    message.setForeground(Color.BLUE);
	    
	    panelmessage.add(labelmessage);
	    panelmessage.add(message);
	    
	    this.setLayout(new GridLayout(4, 4));
	    //On ajoute le bouton au content pane de la JFrame
	    for (int i=1; i < 17; i++){
	    	this.getContentPane().add(new JButton());
	    }
	    	
	    this.setVisible(true);
	    
	    this.setContentPane(paneljeu);
	    
	    paneljeu.add(panelmessage, BorderLayout.PAGE_START);
	    
	    //this.setContentPane(new Panel());
	}
	
	
	
	

}
