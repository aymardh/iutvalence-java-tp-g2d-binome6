package iutvalence.sylmard.memory;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ParamWindow extends JFrame {
	
	private JTextField pseudo = new JTextField("Pseudo");
	private JLabel labelPseudo = new JLabel("Entrez votre pseudo :");
	
	private JTextField level = new JTextField("4");
	private JLabel labelLevel = new JLabel("Entrez votre niveau :");
	
	private JButton valideLevel = new JButton("Valider");
	
	public ParamWindow(){
		
	    //Définit un titre pour notre fenêtre
	    this.setTitle("Paramètres Memory");
	    
	    //Définit sa taille
	    this.setSize(700, 100);
	    
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    this.setLocationRelativeTo(null);
	    
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Rend visible        
	    this.setVisible(true);
	    
	    //Instanciation d'un objet JPanel
	    JPanel pan = new JPanel();
	    JPanel pan2 = new JPanel();
	    
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);
	    
	    pan.setLayout(new BorderLayout());
	    
	    Font police = new Font("Arial", Font.BOLD, 14);
	    
	    pseudo.setFont(police);
	    pseudo.setPreferredSize(new Dimension(150, 30));
	    pseudo.setForeground(Color.BLUE);
	    
	    level.setFont(police);
	    level.setPreferredSize(new Dimension(150, 30));
	    level.setForeground(Color.BLUE);
	    
	    pan2.add(labelPseudo);
	    pan2.add(pseudo);
	    
	    pan2.add(labelLevel);
	    pan2.add(level);
	    
	    pan2.add(valideLevel);
	    
	    pan.add(pan2, BorderLayout.PAGE_START);
	    
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    this.setContentPane(pan);
	    
	    //this.setContentPane(new Panneau());
	    
	}
}
