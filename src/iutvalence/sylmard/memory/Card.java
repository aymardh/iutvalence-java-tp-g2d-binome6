
package iutvalence.sylmard.memory;

/**
 * @author aymardh
 *
 */

/** The class Card, a Card is a random number and a the card is hidden or not */
public class Card {
	/** the random number */
	public int num;
	/** hidden or not */
	private boolean hidden;
	
	/** Initialisation of the card with the random number and hidden at the beginning */
	public Card(int num) {
		this.num = num;
		hidden = true;
	}
	
	/** function that turn the card hidden or not hidden and return his number or "-1" if the card is hidden */
	public int swap() {
		hidden = !hidden;
		return hidden ? -1 : num;
	}
	
	/** return the boolean attribute hidden or not */
	public boolean getHidden() {
		return hidden;
	}
	
	public String toString() {
		return hidden ? "-1" : String.valueOf(num);
	}
}
