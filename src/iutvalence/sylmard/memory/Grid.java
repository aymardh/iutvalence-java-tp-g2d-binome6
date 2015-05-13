package iutvalence.sylmard.memory;

import java.util.Arrays;
import java.util.Random;

/**
 * Create and fill in the grid with values.
 *
 * @author aymardh
 * 
 */
public class Grid {
	
    /** Grid. */
    private Card[][] table;

    /** Create the grid. */
    public Grid(int level) {
    	
    	/** Table is the grid that the player try to solve. */
    	table = new Card[level][level];
    	
    	/** Num is the grid that contains the numbers used to filled the grid Table. */
    	int elements = level*level;
    	int[] num = new int[elements];
    	Random rand = new Random();
    	
    	/** Initialisation of the numbers in Num. */
    	int distincts = elements/2;
    	for (int i = 0; i < distincts; i++) {
    		num[i] = i;
    		num[i+distincts] = i;
        }
    	int iter = 1;
    	
    	/** We filled the grid Table with the numbers in Num. */
    	for (int i = 0; i < level; i++) {
    		for (int j = 0; j < level; j++) {
    			int nbalea = iter < elements ? rand.nextInt(elements-iter) : 0;
    			int n = num[nbalea];
    			table[i][j] = new Card(n);
    			
    			num[nbalea] = num[elements-iter];
    			iter++;
    		}	
    	}	
    }

    /** swap the current card to hidden or not hidden */
    public int swap(int i, int j) {
    	return table[i][j].swap();
    }
    
    /** Test every card, if one card is hidden, victory is false */
    public boolean victory() {
    	boolean victory = true;
    	for (int i = 0; i < 4; i++) {
        	for (int j = 0; j < 4; j++) {
        			if (table[i][j].getHidden() == true)
        				return victory = false;
        		}
    		}
    	return victory;
    }

    
    
	@Override
	public String toString() {
		
		StringBuilder sh = new StringBuilder();
	   	for (int i = 0; i < table[0].length; i++) {
	   		sh.append(Arrays.toString(table[i])).append("\n");
    	}
		return sh.toString();
	}
  
    
}
    

