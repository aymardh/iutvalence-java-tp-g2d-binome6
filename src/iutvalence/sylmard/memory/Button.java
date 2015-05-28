package iutvalence.sylmard.memory;

import javax.swing.JButton;

public class Button extends JButton{
	
	public final int i;
	public final int j;
	public boolean hidde;
	public int number;
	
	public Button(int i, int j){
		
		this.i = i;
		this.j = j;
		this.hidde = true;
	}

	public int getNumber(){
		return this.number;
	}
	
}
