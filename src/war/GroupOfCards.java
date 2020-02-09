package war;

import java.util.ArrayList;
import java.util.Collections;

import cards.Card;

/**
 * Seceretly just <code>ArrayList&lt;T extends Card&gt;</code>.
 * Also adds a <code>shuffle()</code> method.
 */
public class GroupOfCards<T extends Card> extends ArrayList<T> {
    private static final long serialVersionUID = 1L; // throws a warning otherwise

    /**
     * Shuffle the deck/hand/whatever.
     * @return <code>this</code>, for fluent chaining.
     */
    public GroupOfCards<T> shuffle() {
        Collections.shuffle(this);
        return this;
    }
}
