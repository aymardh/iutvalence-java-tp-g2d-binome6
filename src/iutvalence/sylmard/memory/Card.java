/**
 * 
 */
package iutvalence.sylmard.memory;

/**
 * @author aymardh
 *
 */
public class Card {
	public int num;
	public boolean hidden;
	
	public Card(int num) {
		this.num = num;
		hidden = true;
	}
	
	public int swap() {
		hidden = !hidden;
		return hidden ? -1 : num;
	}
	
	public String toString() {
		return hidden ? "-1" : String.valueOf(num);
	}
}
