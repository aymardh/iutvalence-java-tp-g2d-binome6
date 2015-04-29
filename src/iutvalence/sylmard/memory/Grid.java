package iutvalence.sylmard.memory;

import java.util.Arrays;
import java.util.Random;

/**
 * Create and fill in the grid with values.
 *
 * @author aymardh
 * @version TODO
 */
public class Grid {
    /** Grid. */
    private int[][] table;

    /** Create the grid. */
    public Grid(int level) {
    	table = new int [level][level];
    	/* TODO CODER. */
    	int[] num = new int[level*level];
    	Random rand = new Random();
    	for (int i = 0 ; i< level*level/2;i++) {
    		num[i] = i;
    		num[i+level*level/2] = i;
        }
    	int iter = 0;
    	for (int i = 0; i < level; i++) {
    		for (int j = 0; j < level; j++) {
    			int nbalea = rand.nextInt(level*level-iter);
    			int n = num[nbalea];
    			table[i][j] = n;
    			num[nbalea] = num[level*level-iter];
    			iter++;
    			
    			
    			
    			
    			// TODO Enlever le n du tableau initial et diminuer le tableau
    			
    		}	
    	}
    	System.out.println(Arrays.toString(num));
    	
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	   	for (int i = 0; i < table[0].length; i++) {
	   		sb.append(Arrays.toString(table[i])).append("\n");
    	}  
		return sb.toString();
		
	}
    
    
}
    

