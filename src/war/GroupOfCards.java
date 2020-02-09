package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cards.Card;
import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards {
   
    //The group of cards, stored in an ArrayList
    private Card cards;
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize) {
        size = givenSize;
        cards = new ArrayList<Card>();
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public List<Card> showCards() {
        return cards;
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}
