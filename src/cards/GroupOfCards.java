package cards;

import java.util.*;
import cards.*;

/**
 * Seceretly just <code>ArrayList&lt;T extends Card&gt;</code>.
 * Also adds a <code>shuffle()</code> method.
 */
public class GroupOfCards<T extends cards.Card> extends ArrayList<T> {

	private int size;
	/**
	 * The group of cards, stored in an ArrayList
	 */
	private Collection<Card> cards;
	private static final long serialVersionUID = 1L;

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * the size of the grouping
	 * @param givenSize
	 */
	public GroupOfCards(int givenSize) {
		// TODO - implement GroupOfCards.GroupOfCards
		throw new UnsupportedOperationException();
	}

	/**
	 * A method that will get the group of cards as an ArrayList
	 * @return the group of cards.
	 */
	public java.util.List<Card> showCards() {
		// TODO - implement GroupOfCards.showCards
		throw new UnsupportedOperationException();
	}

	/**
	 * Shuffle the deck/hand/whatever.
	 * @return <code>this</code>, for fluent chaining.
	 */
	public GroupOfCards<T> shuffle() {
		// TODO - implement GroupOfCards.shuffle
		throw new UnsupportedOperationException();
	}

}